package com.anythink.core.d;

import android.util.Log;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bm;
import com.anythink.core.common.v.af;
import com.anythink.core.d.n;

/* loaded from: classes.dex */
public class m implements com.anythink.core.common.m.q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17590a = "m";

    /* renamed from: b, reason: collision with root package name */
    private final n f17591b;

    /* renamed from: c, reason: collision with root package name */
    private final bm f17592c;

    /* renamed from: d, reason: collision with root package name */
    private final n.b f17593d;

    /* renamed from: e, reason: collision with root package name */
    private final l f17594e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.t.a f17595f;

    /* renamed from: g, reason: collision with root package name */
    private boolean[] f17596g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.core.common.t.b f17597h;

    public m(n nVar, bm bmVar, n.b bVar, l lVar) {
        this.f17591b = nVar;
        this.f17592c = bmVar;
        this.f17593d = bVar;
        this.f17594e = lVar;
    }

    private void a() {
        com.anythink.core.common.t.b bVar;
        com.anythink.core.common.t.a aVar = this.f17595f;
        if (aVar == null || (bVar = this.f17597h) == null) {
            return;
        }
        aVar.b(bVar);
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadCanceled(int i) {
        a();
        n.b bVar = this.f17593d;
        if (bVar == null) {
            return;
        }
        l lVar = this.f17594e;
        if (lVar == null) {
            bVar.a(ErrorCode.getErrorCode(ErrorCode.exception, "", "by canceled"));
        } else {
            bVar.a(lVar);
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadError(int i, String str, AdError adError) {
        n.b bVar;
        a();
        if (this.f17592c != null) {
            if (ErrorCode.statuError.equals(adError.getCode()) && (ErrorCode.placementIdError.equals(adError.getPlatformCode()) || ErrorCode.appIdError.equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
                String str2 = this.f17592c.b() + this.f17592c.d() + this.f17592c.c();
                adError.getPlatformCode();
                adError.getPlatformMSG();
                af.a(com.anythink.core.common.d.t.b().g(), u.b.f13012j, str2, System.currentTimeMillis());
                if (com.anythink.core.common.d.t.b().F()) {
                    Log.e("anythink", "Please check these params in your code (AppId: " + this.f17592c.b() + ", AppKey: " + this.f17592c.c() + ", PlacementId: " + this.f17592c.d() + ")");
                }
            }
            if ("699".equals(adError.getPlatformCode())) {
                this.f17591b.a(this.f17592c.b(), this.f17592c.d(), this.f17594e);
                n.b bVar2 = this.f17593d;
                if (bVar2 != null) {
                    bVar2.a(adError);
                    return;
                }
                return;
            }
        }
        l lVar = this.f17594e;
        if (lVar == null && (bVar = this.f17593d) != null) {
            bVar.a(adError);
        } else if (this.f17593d != null) {
            if (lVar.bl()) {
                this.f17593d.a(adError);
            } else {
                this.f17593d.a(this.f17594e);
            }
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadFinish(int i, Object obj) {
        a();
        n.b bVar = this.f17593d;
        if (bVar != null) {
            bVar.b();
        }
        n nVar = this.f17591b;
        if (nVar != null) {
            nVar.a(obj, this.f17592c, this.f17593d, this.f17596g, this.f17594e);
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadStart(int i) {
        n.b bVar = this.f17593d;
        if (bVar != null) {
            bVar.a();
        }
    }

    public m(n nVar, bm bmVar, n.b bVar, l lVar, com.anythink.core.common.t.a aVar, com.anythink.core.common.t.b bVar2, boolean[] zArr) {
        this.f17591b = nVar;
        this.f17592c = bmVar;
        this.f17593d = bVar;
        this.f17595f = aVar;
        this.f17596g = zArr;
        this.f17597h = bVar2;
        this.f17594e = lVar;
    }
}
