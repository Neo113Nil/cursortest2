package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class W8 extends C3320hg {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28366u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f28367v;

    public W8(com.bumptech.glide.manager.o oVar) {
        this.f28367v = oVar;
    }

    @Override // com.google.android.gms.internal.ads.C3320hg, java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        switch (this.f28366u) {
            case 0:
                ((com.bumptech.glide.manager.o) this.f28367v).g();
                return this.f31242n.cancel(z8);
            default:
                return super.cancel(z8);
        }
    }

    public void d() {
        a(this.f28367v);
    }

    public W8(Object obj) {
        this.f28367v = obj;
    }
}
