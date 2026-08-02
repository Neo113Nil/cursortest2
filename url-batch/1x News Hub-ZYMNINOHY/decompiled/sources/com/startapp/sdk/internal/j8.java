package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.ads.video.VideoUtil$VideoEligibility;
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
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j8 extends s1 {

    /* renamed from: q, reason: collision with root package name */
    public final ij f4003q;

    /* renamed from: r, reason: collision with root package name */
    public final long f4004r;

    /* renamed from: s, reason: collision with root package name */
    public volatile CacheKey f4005s;

    /* renamed from: t, reason: collision with root package name */
    public int f4006t;

    /* renamed from: u, reason: collision with root package name */
    public final ib f4007u;
    public final ib v;

    /* renamed from: w, reason: collision with root package name */
    public final ib f4008w;

    public j8(Context context, ij ijVar, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8) {
        super(context, ijVar, adPreferences, adEventListener, placement, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, true);
        this.f4004r = System.currentTimeMillis();
        this.f4003q = ijVar;
        this.f4007u = ibVar;
        this.v = ibVar2;
        this.f4008w = ibVar3;
    }

    @Override // com.startapp.sdk.internal.s1, com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        HashSet hashSet;
        r8 r8Var = (r8) obj;
        String str = r8Var != null ? r8Var.f4387c : null;
        VideoConfig F3 = AdsCommonMetaData.k().F();
        MetaData E3 = MetaData.E();
        if (str == null || !str.toLowerCase(Locale.ROOT).contains("json")) {
            String str2 = r8Var != null ? r8Var.f4386b : null;
            if (F3.r() && E3.f0() && si.a(str2, "@videoJson@", "@videoJson@") != null) {
                f(false);
            }
            return super.a(obj);
        }
        if (F3.r() && E3.f0() && ((hashSet = this.f4411m.f3368J0) == null || hashSet.size() <= 0)) {
            f(true);
        }
        try {
            xi xiVar = (xi) JsonParser.fromJson(r8Var.f4386b, xi.class);
            if (xiVar == null || xiVar.getVastTag() == null) {
                return a("no VAST wrapper in json", null, true);
            }
            String d02 = E3.d0();
            vi viVar = (!xiVar.isRecordHops() || TextUtils.isEmpty(d02)) ? null : new vi(this.f3298g, d02, xiVar.getPartnerResponse(), xiVar.getPartnerName(), xiVar.isSkipFailed());
            aj ajVar = new aj(this.f3293a, ((rk) this.f4008w.a()).a());
            ajVar.f = F3.f();
            ajVar.f3578c = new C(this, 0);
            ui a3 = ajVar.a(xiVar.getVastTag(), viVar, xiVar.getEndCard(), xiVar.getMaxEndCards());
            if (a3 != null) {
                this.f4003q.a(a3, F3, this.f4003q.getType() != Ad.AdType.REWARDED_VIDEO ? new dj(xiVar.getSkipafter(), xiVar.getSkipmin()) : null);
                if (xiVar.getTtlSec() != null) {
                    this.f4003q.c(xiVar.getTtlSec());
                }
                r8Var.f4386b = xiVar.getAdmTag();
                r8Var.f4387c = "text/html";
                return super.a(r8Var);
            }
            if (xiVar.getCampaignId() != null) {
                this.f4410l.add(xiVar.getCampaignId());
            }
            this.f4006t++;
            this.f4003q.f3987r = null;
            if (System.currentTimeMillis() - this.f4004r >= F3.o()) {
                return a("VAST retry timeout", null, false);
            }
            if (this.f4006t > F3.e()) {
                return a("VAST too many excludes", null, false);
            }
            ((y6) ((x6) this.f3300i.a())).c(this, fi.f3817h);
            return b();
        } catch (Exception e3) {
            return a("VAST json parsing", e3, true);
        }
    }

    public final void b(String str) {
        VideoAdDetails f = f();
        if (f != null) {
            f.setLocalVideoPath(str);
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z) {
        super.b(z);
        if (!z || f() == null) {
            e(z);
            return;
        }
        if (AdsCommonMetaData.k().F().q()) {
            super.d(true);
        }
        VideoAdDetails f = f();
        if (f != null) {
            f.setVideoMuted(this.f3295c.isVideoMuted());
        }
        ((y6) ((x6) this.f3300i.a())).c(this, fi.f3818i);
        if (f != null) {
            hj hjVar = (hj) this.v.a();
            ((Executor) hjVar.f3942c.a()).execute(new ej(hjVar, f.getVideoUrl(), new C(this, 1), new C(this, 2)));
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final void d(boolean z) {
        if (f() != null) {
            return;
        }
        super.d(z);
    }

    public final VideoAdDetails f() {
        Ad ad = this.f3294b;
        if (ad instanceof ij) {
            return ((ij) ad).f3987r;
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.s1
    public final boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        VideoUtil$VideoEligibility a3;
        if (aVar == null) {
            return false;
        }
        Ad.AdType adType = aVar.f3378U0;
        if ((adType != Ad.AdType.VIDEO && adType != Ad.AdType.REWARDED_VIDEO) || (a3 = ek.a(this.f3293a)) == VideoUtil$VideoEligibility.ELIGIBLE) {
            return true;
        }
        this.f = a3.a();
        return false;
    }

    public final void f(boolean z) {
        Ad ad = this.f3294b;
        if ((ad == null || ad.getType() == Ad.AdType.REWARDED_VIDEO || this.f3294b.getType() == Ad.AdType.VIDEO) && !z) {
            return;
        }
        AdPreferences adPreferences = new AdPreferences(this.f3295c);
        Ad ad2 = this.f3294b;
        adPreferences.setType((ad2 == null || !(ad2.getType() == Ad.AdType.REWARDED_VIDEO || this.f3294b.getType() == Ad.AdType.VIDEO)) ? Ad.AdType.NON_VIDEO : Ad.AdType.VIDEO_NO_VAST);
        CacheKey a3 = ((p) this.f4007u.a()).a(null, this.f3297e, adPreferences, false, 0, null, null);
        if (z) {
            this.f4005s = a3;
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a a3 = a((com.startapp.sdk.adsbase.model.a) new h8());
        if (a3 != null) {
            a3.g(this.f3293a);
        }
        return a3;
    }

    public final void a(String str) {
        if (str != null) {
            ((y6) ((x6) this.f3300i.a())).c(this, fi.f3819j);
            if (!str.equals("downloadInterrupted")) {
                super.d(true);
                VideoAdDetails f = f();
                if (f != null) {
                    f.setLocalVideoPath(str);
                }
            }
            e(true);
            return;
        }
        ((y6) ((x6) this.f3300i.a())).c(this, fi.f3820k);
        e(false);
        Context context = this.f3293a;
        AdEventListener adEventListener = this.f3296d;
        this.f3296d = null;
        a0.a(context, adEventListener, this.f3294b, false);
        a(this.f3293a, f(), null, VASTErrorCodes.FileNotFound);
    }

    public final void a(List list, VASTErrorCodes vASTErrorCodes) {
        a(this.f3293a, f(), list, vASTErrorCodes);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #1 {all -> 0x007d, blocks: (B:26:0x0002, B:7:0x0053, B:11:0x005a, B:13:0x0060, B:14:0x0066, B:49:0x003b, B:3:0x0041, B:5:0x0047, B:29:0x0008, B:31:0x000c, B:32:0x0017, B:34:0x001d, B:37:0x0029, B:43:0x0030, B:45:0x0036), top: B:25:0x0002, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, VideoAdDetails videoAdDetails, List list, VASTErrorCodes vASTErrorCodes) {
        ActionTrackingLink[] a3;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    try {
                        if (vASTErrorCodes == VASTErrorCodes.SAProcessSuccess) {
                            WeakHashMap weakHashMap = si.f4438a;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (si.e(str)) {
                                    arrayList.add(str);
                                }
                            }
                            list = arrayList;
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                    if (!list.isEmpty()) {
                        a3 = VideoTrackingDetails.a(list);
                        if (a3 != null || a3.length <= 0) {
                            return;
                        }
                        kj kjVar = new kj(0, new VideoTrackingParams(0, 0, "", "1"), (videoAdDetails == null || videoAdDetails.getVideoUrl() == null) ? "" : videoAdDetails.getVideoUrl(), a3);
                        kjVar.f4070e = vASTErrorCodes;
                        ek.a(context, kjVar.a());
                        return;
                    }
                    a3 = null;
                    if (a3 != null) {
                        return;
                    } else {
                        return;
                    }
                }
            } catch (Throwable th2) {
                d9.a(th2);
                return;
            }
        }
        if (videoAdDetails != null && videoAdDetails.getVideoTrackingDetails() != null) {
            a3 = videoAdDetails.getVideoTrackingDetails().e();
            if (a3 != null) {
            }
        }
        a3 = null;
        if (a3 != null) {
        }
    }

    public final boolean a(String str, Exception exc, boolean z) {
        if (exc != null) {
            d9.a(exc);
        } else if (z) {
            d9 d9Var = new d9(e9.f3725e);
            d9Var.f3680d = str;
            d9Var.a();
        }
        Object b3 = ((p) this.f4007u.a()).b(this.f4005s);
        if (b3 instanceof m8) {
            r8 r8Var = new r8();
            r8Var.f4387c = "text/html";
            r8Var.f4386b = ((m8) b3).f4130b;
            return super.a(r8Var);
        }
        Ad ad = this.f3294b;
        if (ad == null) {
            return false;
        }
        ad.setErrorMessage(this.f);
        return false;
    }
}
