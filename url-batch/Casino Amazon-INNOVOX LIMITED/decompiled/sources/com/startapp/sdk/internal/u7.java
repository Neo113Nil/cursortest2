package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class u7 extends o1 {
    public final ni q;
    public final long r;
    public volatile CacheKey s;
    public int t;
    public final pa u;
    public final pa v;
    public final pa w;

    public u7(Context context, ni niVar, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8) {
        super(context, niVar, adPreferences, adEventListener, placement, paVar4, paVar5, paVar6, paVar7, paVar8, true);
        this.r = System.currentTimeMillis();
        this.q = niVar;
        this.u = paVar;
        this.v = paVar2;
        this.w = paVar3;
    }

    @Override // com.startapp.sdk.internal.o1, com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        HashSet hashSet;
        c8 c8Var = (c8) obj;
        String str = c8Var != null ? c8Var.c : null;
        VideoConfig F = AdsCommonMetaData.k().F();
        MetaData A = MetaData.A();
        if (str == null || !str.toLowerCase(Locale.ROOT).contains("json")) {
            String str2 = c8Var != null ? c8Var.b : null;
            if (F.t() && A.Z() && zh.a(str2, "@videoJson@", "@videoJson@") != null) {
                e(false);
            }
            return super.a(obj);
        }
        if (F.t() && A.Z() && ((hashSet = this.m.J0) == null || hashSet.size() <= 0)) {
            e(true);
        }
        try {
            ei eiVar = (ei) JsonParser.fromJson(c8Var.b, ei.class);
            if (eiVar == null || eiVar.getVastTag() == null) {
                return a("no VAST wrapper in json", null, true);
            }
            String X = A.X();
            ci ciVar = (!eiVar.isRecordHops() || TextUtils.isEmpty(X)) ? null : new ci(this.g, X, eiVar.getPartnerResponse(), eiVar.getPartnerName(), eiVar.isSkipFailed());
            hi hiVar = new hi(this.f132a, ((uj) this.w.a()).a());
            hiVar.f = F.m();
            hiVar.c = new gi() { // from class: com.startapp.sdk.internal.u7$$ExternalSyntheticLambda1
                @Override // com.startapp.sdk.internal.gi
                public final void a(List list, VASTErrorCodes vASTErrorCodes) {
                    u7.this.a(list, vASTErrorCodes);
                }
            };
            bi a2 = hiVar.a(eiVar.getVastTag(), ciVar, eiVar.getEndCard(), eiVar.getMaxEndCards());
            if (a2 != null) {
                this.q.a(a2, F, this.q.getType() != Ad.AdType.REWARDED_VIDEO ? new ki(eiVar.getSkipafter(), eiVar.getSkipmin()) : null);
                if (eiVar.getTtlSec() != null) {
                    this.q.c(eiVar.getTtlSec());
                }
                c8Var.b = eiVar.getAdmTag();
                c8Var.c = "text/html";
                return super.a(c8Var);
            }
            if (eiVar.getCampaignId() != null) {
                this.l.add(eiVar.getCampaignId());
            }
            this.t++;
            this.q.r = null;
            if (System.currentTimeMillis() - this.r >= F.q()) {
                return a("VAST retry timeout", null, false);
            }
            if (this.t > F.l()) {
                return a("VAST too many excludes", null, false);
            }
            ((w6) this.i.a()).c(this, mh.h);
            return b();
        } catch (Exception e) {
            return a("VAST json parsing", e, true);
        }
    }

    @Override // com.startapp.sdk.internal.o1
    public final boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        if (aVar == null) {
            return false;
        }
        Ad.AdType adType = aVar.U0;
        if ((adType != Ad.AdType.VIDEO && adType != Ad.AdType.REWARDED_VIDEO) || !com.startapp.sdk.ads.video.a.a(this.f132a)) {
            return true;
        }
        this.f = "Unavailable";
        return false;
    }

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z) {
        super.b(z);
        Ad ad = this.b;
        final VideoAdDetails videoAdDetails = ad instanceof ni ? ((ni) ad).r : null;
        if (!z || videoAdDetails == null) {
            d(z);
            return;
        }
        videoAdDetails.setVideoMuted(this.c.isVideoMuted());
        ((w6) this.i.a()).c(this, mh.i);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        ((com.startapp.sdk.ads.video.downloader.impl.b) this.v.a()).a(videoAdDetails.getVideoUrl(), new mi() { // from class: com.startapp.sdk.internal.u7$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.mi
            public final void a(String str) {
                u7.this.a(this, atomicBoolean, videoAdDetails, str);
            }
        });
    }

    public final void e(boolean z) {
        Ad.AdType type = this.b.getType();
        Ad.AdType adType = Ad.AdType.REWARDED_VIDEO;
        if ((type == adType || this.b.getType() == Ad.AdType.VIDEO) && !z) {
            return;
        }
        AdPreferences adPreferences = new AdPreferences(this.c);
        adPreferences.setType((this.b.getType() == adType || this.b.getType() == Ad.AdType.VIDEO) ? Ad.AdType.VIDEO_NO_VAST : Ad.AdType.NON_VIDEO);
        CacheKey a2 = ((p) this.u.a()).a(null, this.e, adPreferences, false, 0, null, null);
        if (z) {
            this.s = a2;
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a a2 = a((com.startapp.sdk.adsbase.model.a) new s7());
        if (a2 != null) {
            a2.g(this.f132a);
        }
        return a2;
    }

    public final /* synthetic */ void a(Object obj, AtomicBoolean atomicBoolean, VideoAdDetails videoAdDetails, String str) {
        pa paVar = this.i;
        if (str != null) {
            ((w6) paVar.a()).c(obj, mh.j);
            if (atomicBoolean.get()) {
                return;
            }
            videoAdDetails.setFilePath(str);
            d(true);
            return;
        }
        ((w6) paVar.a()).c(obj, mh.k);
        if (atomicBoolean.get()) {
            return;
        }
        d(false);
        a(this.f132a, videoAdDetails, (List) null, VASTErrorCodes.FileNotFound);
    }

    public final void a(List list, VASTErrorCodes vASTErrorCodes) {
        Context context = this.f132a;
        Ad ad = this.b;
        a(context, ad instanceof ni ? ((ni) ad).r : null, list, vASTErrorCodes);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #1 {all -> 0x007a, blocks: (B:26:0x0002, B:7:0x0052, B:11:0x0059, B:13:0x005f, B:14:0x0065, B:48:0x003a, B:3:0x0040, B:5:0x0046, B:29:0x0008, B:31:0x000c, B:32:0x0017, B:34:0x001d, B:37:0x0029, B:43:0x002e, B:45:0x0034), top: B:25:0x0002, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, VideoAdDetails videoAdDetails, List list, VASTErrorCodes vASTErrorCodes) {
        ActionTrackingLink[] a2;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    try {
                        if (vASTErrorCodes == VASTErrorCodes.SAProcessSuccess) {
                            WeakHashMap weakHashMap = zh.f528a;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (zh.d(str)) {
                                    arrayList.add(str);
                                }
                            }
                            list = arrayList;
                        }
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                    if (!list.isEmpty()) {
                        a2 = VideoTrackingDetails.a(list);
                        if (a2 != null || a2.length <= 0) {
                            return;
                        }
                        ri riVar = new ri(0, new VideoTrackingParams("", 0, 0), (videoAdDetails == null || videoAdDetails.getVideoUrl() == null) ? "" : videoAdDetails.getVideoUrl(), a2);
                        riVar.e = vASTErrorCodes;
                        com.startapp.sdk.ads.video.a.a(context, riVar.a());
                        return;
                    }
                    a2 = null;
                    if (a2 != null) {
                        return;
                    } else {
                        return;
                    }
                }
            } catch (Throwable th2) {
                n8.a(th2);
                return;
            }
        }
        if (videoAdDetails != null && videoAdDetails.getVideoTrackingDetails() != null) {
            a2 = videoAdDetails.getVideoTrackingDetails().e();
            if (a2 != null) {
            }
        }
        a2 = null;
        if (a2 != null) {
        }
    }

    public final boolean a(String str, Exception exc, boolean z) {
        if (exc != null) {
            n8.a(exc);
        } else if (z) {
            n8 n8Var = new n8(o8.e);
            n8Var.d = str;
            n8Var.a();
        }
        Object b = ((p) this.u.a()).b(this.s);
        if (b instanceof x7) {
            c8 c8Var = new c8();
            c8Var.c = "text/html";
            c8Var.b = ((x7) b).b;
            return super.a(c8Var);
        }
        this.b.setErrorMessage(this.f);
        return false;
    }
}
