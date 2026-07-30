package com.anythink.core.common.l.d;

import android.content.Context;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IATBaseAdAdapter;
import com.anythink.core.common.h.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f14505a;

    /* renamed from: b, reason: collision with root package name */
    private BaseAd f14506b;

    /* renamed from: c, reason: collision with root package name */
    private n f14507c;

    /* renamed from: d, reason: collision with root package name */
    private ATNativeAdCustomRender f14508d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.core.common.l.e.a.b f14509e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.l.b.a.b f14510f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14511g;

    /* renamed from: h, reason: collision with root package name */
    private b f14512h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f14513j;

    /* renamed from: com.anythink.core.common.l.d.a$a, reason: collision with other inner class name */
    public static class C0081a {

        /* renamed from: a, reason: collision with root package name */
        private Context f14514a;

        /* renamed from: b, reason: collision with root package name */
        private BaseAd f14515b;

        /* renamed from: c, reason: collision with root package name */
        private n f14516c;

        /* renamed from: d, reason: collision with root package name */
        private ATNativeAdCustomRender f14517d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.l.e.a.b f14518e;

        /* renamed from: f, reason: collision with root package name */
        private com.anythink.core.common.l.b.a.b f14519f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f14520g;

        /* renamed from: h, reason: collision with root package name */
        private int f14521h;
        private int i;

        public final C0081a a(Context context) {
            this.f14514a = context;
            return this;
        }

        public final C0081a b(int i) {
            this.i = i;
            return this;
        }

        public final C0081a a(BaseAd baseAd) {
            this.f14515b = baseAd;
            return this;
        }

        public final C0081a a(ATNativeAdCustomRender aTNativeAdCustomRender) {
            this.f14517d = aTNativeAdCustomRender;
            return this;
        }

        public final C0081a a(com.anythink.core.common.l.e.a.b bVar) {
            this.f14518e = bVar;
            return this;
        }

        public final C0081a a(n nVar) {
            this.f14516c = nVar;
            return this;
        }

        public final C0081a a(boolean z8) {
            this.f14520g = z8;
            return this;
        }

        public final C0081a a(com.anythink.core.common.l.b.a.b bVar) {
            this.f14519f = bVar;
            return this;
        }

        public final C0081a a(int i) {
            this.f14521h = i;
            return this;
        }

        public final a a() {
            a aVar = new a((byte) 0);
            aVar.f14505a = this.f14514a;
            aVar.f14506b = this.f14515b;
            aVar.f14508d = this.f14517d;
            aVar.f14509e = this.f14518e;
            aVar.f14510f = this.f14519f;
            aVar.f14507c = this.f14516c;
            aVar.f14511g = this.f14520g;
            aVar.i = this.f14521h;
            aVar.f14513j = this.i;
            return aVar;
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    private int l() {
        b bVar = this.f14512h;
        if (bVar != null) {
            return bVar.b();
        }
        return -1;
    }

    public final ATNativeAdCustomRender c() {
        return this.f14508d;
    }

    public final com.anythink.core.common.l.e.a.b d() {
        return this.f14509e;
    }

    public final int e() {
        b bVar = this.f14512h;
        if (bVar != null) {
            return bVar.e();
        }
        return -1;
    }

    public final IATBaseAdAdapter f() {
        b bVar = this.f14512h;
        if (bVar != null) {
            return bVar.r();
        }
        return null;
    }

    public final n g() {
        return this.f14507c;
    }

    public final boolean h() {
        return this.f14511g;
    }

    public final com.anythink.core.common.l.b.a.b i() {
        return this.f14510f;
    }

    public final int j() {
        return this.i;
    }

    public final int k() {
        return this.f14513j;
    }

    private a() {
    }

    public final BaseAd b() {
        return this.f14506b;
    }

    public final Context a() {
        return this.f14505a;
    }

    public final void a(b bVar) {
        this.f14512h = bVar;
    }

    public final int a(String str) {
        b bVar = this.f14512h;
        return Math.max(bVar != null ? ((Integer) bVar.a(str, 5)).intValue() : 5, 3);
    }
}
