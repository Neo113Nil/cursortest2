package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public final class ia {
    public static final bi n = new bi() { // from class: com.tapjoy.internal.ia.1
        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            return new ia(bnVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public ic f8350a;

    /* renamed from: b, reason: collision with root package name */
    public ic f8351b;

    /* renamed from: c, reason: collision with root package name */
    public ic f8352c;

    /* renamed from: d, reason: collision with root package name */
    public ic f8353d;
    public int e;
    public int f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public hy l;
    public hy m;

    public ia(bn bnVar) {
        this.e = 9;
        this.f = 10;
        this.j = false;
        bnVar.h();
        while (bnVar.j()) {
            String l = bnVar.l();
            if ("x".equals(l)) {
                this.f8350a = ic.a(bnVar.m());
            } else if ("y".equals(l)) {
                this.f8351b = ic.a(bnVar.m());
            } else if ("width".equals(l)) {
                this.f8352c = ic.a(bnVar.m());
            } else if ("height".equals(l)) {
                this.f8353d = ic.a(bnVar.m());
            } else if ("url".equals(l)) {
                this.g = bnVar.m();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                this.h = bnVar.m();
            } else if ("ad_content".equals(l)) {
                this.i = bnVar.m();
            } else if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equals(l)) {
                this.j = bnVar.n();
            } else if ("value".equals(l)) {
                this.k = bnVar.m();
            } else if ("image".equals(l)) {
                this.l = (hy) hy.e.a(bnVar);
            } else if ("image_clicked".equals(l)) {
                this.m = (hy) hy.e.a(bnVar);
            } else if ("align".equals(l)) {
                String m = bnVar.m();
                if ("left".equals(m)) {
                    this.e = 9;
                } else if ("right".equals(m)) {
                    this.e = 11;
                } else if ("center".equals(m)) {
                    this.e = 14;
                } else {
                    bnVar.s();
                }
            } else if ("valign".equals(l)) {
                String m2 = bnVar.m();
                if ("top".equals(m2)) {
                    this.f = 10;
                } else if ("middle".equals(m2)) {
                    this.f = 15;
                } else if ("bottom".equals(m2)) {
                    this.f = 12;
                } else {
                    bnVar.s();
                }
            } else {
                bnVar.s();
            }
        }
        bnVar.i();
    }
}
