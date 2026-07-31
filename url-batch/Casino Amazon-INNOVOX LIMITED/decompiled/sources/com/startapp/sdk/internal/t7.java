package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class t7 extends i7 {
    public final ni h;
    public final pa i;
    public final pa j;
    public final pa k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(Context context, ni niVar, AdEventListener adEventListener, pa paVar, pa paVar2, pa paVar3, pa paVar4, String str, pa paVar5, pa paVar6) {
        super(context, niVar, adEventListener, paVar2, paVar3, paVar4, str);
        context.getClass();
        paVar.getClass();
        paVar2.getClass();
        paVar3.getClass();
        paVar4.getClass();
        str.getClass();
        paVar5.getClass();
        paVar6.getClass();
        this.h = niVar;
        this.i = paVar;
        this.j = paVar5;
        this.k = paVar6;
    }

    public final void a(final VideoAdDetails videoAdDetails) {
        w6 w6Var = (w6) this.g.a();
        lh lhVar = mh.i;
        lhVar.getClass();
        w6Var.c(this, lhVar);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        com.startapp.sdk.ads.video.downloader.impl.b bVar = (com.startapp.sdk.ads.video.downloader.impl.b) this.k.a();
        String videoUrl = videoAdDetails.getVideoUrl();
        videoUrl.getClass();
        bVar.a(videoUrl, new mi() { // from class: com.startapp.sdk.internal.t7$$ExternalSyntheticLambda1
            @Override // com.startapp.sdk.internal.mi
            public final void a(String str) {
                t7.a(t7.this, this, atomicBoolean, videoAdDetails, str);
            }
        });
    }

    public static final void a(t7 t7Var, t7 t7Var2, AtomicBoolean atomicBoolean, VideoAdDetails videoAdDetails, String str) {
        if (str != null) {
            w6 w6Var = (w6) t7Var.g.a();
            lh lhVar = mh.j;
            lhVar.getClass();
            w6Var.c(t7Var2, lhVar);
            if (atomicBoolean.get()) {
                return;
            }
            videoAdDetails.setFilePath(str);
            t7Var.b(true);
            return;
        }
        w6 w6Var2 = (w6) t7Var.g.a();
        lh lhVar2 = mh.k;
        lhVar2.getClass();
        w6Var2.c(t7Var2, lhVar2);
        if (atomicBoolean.get()) {
            return;
        }
        t7Var.b(false);
        u7.a(t7Var.c, videoAdDetails, (List) null, VASTErrorCodes.FileNotFound);
    }

    public static final void a(t7 t7Var, List list, VASTErrorCodes vASTErrorCodes) {
        list.getClass();
        vASTErrorCodes.getClass();
        u7.a(t7Var.c, t7Var.h.r, list, vASTErrorCodes);
    }

    @Override // com.startapp.sdk.internal.i7, com.startapp.sdk.adsbase.d
    public final Object a(String str) {
        str.getClass();
        try {
            ei eiVar = (ei) JsonParser.fromJson(str, ei.class);
            String vastTag = eiVar != null ? eiVar.getVastTag() : null;
            if (eiVar != null && vastTag != null) {
                return a(eiVar, vastTag);
            }
            return super.a(str);
        } catch (Throwable th) {
            this.h.setErrorMessage(th.getMessage());
            return null;
        }
    }

    public final x7 a(ei eiVar, String str) {
        ci ciVar;
        VideoConfig F = AdsCommonMetaData.k().F();
        F.getClass();
        MetaData A = MetaData.A();
        A.getClass();
        String X = A.X();
        if (!eiVar.isRecordHops() || TextUtils.isEmpty(X)) {
            ciVar = null;
        } else {
            pa paVar = this.j;
            X.getClass();
            ciVar = new ci(paVar, X, eiVar.getPartnerResponse(), eiVar.getPartnerName(), eiVar.isSkipFailed());
        }
        hi hiVar = new hi(this.c, ((uj) this.i.a()).a());
        hiVar.f = F.m();
        hiVar.c = new gi() { // from class: com.startapp.sdk.internal.t7$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.gi
            public final void a(List list, VASTErrorCodes vASTErrorCodes) {
                t7.a(t7.this, list, vASTErrorCodes);
            }
        };
        bi a2 = hiVar.a(str, ciVar, eiVar.getEndCard(), eiVar.getMaxEndCards());
        if (a2 != null) {
            ki kiVar = this.f140a.getType() != Ad.AdType.REWARDED_VIDEO ? new ki(eiVar.getSkipafter(), eiVar.getSkipmin()) : null;
            ni niVar = this.h;
            niVar.a(a2, F, kiVar);
            String ttlSec = eiVar.getTtlSec();
            if (ttlSec != null) {
                niVar.c(ttlSec);
            }
            String admTag = eiVar.getAdmTag();
            if (admTag != null) {
                return (x7) super.a(admTag);
            }
            return null;
        }
        throw new RuntimeException("Vast config error");
    }

    @Override // com.startapp.sdk.adsbase.d
    public final void a(boolean z) {
        if (z) {
            VideoAdDetails videoAdDetails = this.h.r;
            if (videoAdDetails != null) {
                a(videoAdDetails);
                return;
            } else {
                b(true);
                return;
            }
        }
        b(false);
    }
}
