package com.tapjoy.internal;

import android.graphics.Rect;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public final class ht {
    public static final bi h = new bi() { // from class: com.tapjoy.internal.ht.1
        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            bnVar.h();
            String str = "";
            Rect rect = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            hp hpVar = null;
            boolean z = false;
            while (bnVar.j()) {
                String l = bnVar.l();
                if ("region".equals(l)) {
                    rect = (Rect) bj.f7851b.a(bnVar);
                } else if ("value".equals(l)) {
                    str2 = bnVar.m();
                } else if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equals(l)) {
                    z = bnVar.n();
                } else if ("url".equals(l)) {
                    str = bnVar.m();
                } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                    str3 = bnVar.b();
                } else if ("ad_content".equals(l)) {
                    str4 = bnVar.b();
                } else if (hp.a(l)) {
                    hpVar = hp.a(l, bnVar);
                } else {
                    bnVar.s();
                }
            }
            bnVar.i();
            return new ht(rect, str2, z, str, str3, str4, hpVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8316a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8317b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8318c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8319d;
    public String e;
    public String f;
    public final gm g;

    ht(Rect rect, String str, boolean z, String str2, String str3, String str4, gm gmVar) {
        this.f8316a = rect;
        this.f8317b = str;
        this.f8318c = z;
        this.f8319d = str2;
        this.e = str3;
        this.f = str4;
        this.g = gmVar;
    }
}
