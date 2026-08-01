package p0;

import android.view.ViewGroup;
import c1.AbstractC0091d;

/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3647a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3648b;

    public C0302d(ViewGroup viewGroup) {
        this.f3648b = viewGroup;
    }

    @Override // p0.n, p0.k
    public final void a() {
        AbstractC0091d.v(this.f3648b, false);
    }

    @Override // p0.k
    public final void c(m mVar) {
        if (!this.f3647a) {
            AbstractC0091d.v(this.f3648b, false);
        }
        mVar.x(this);
    }

    @Override // p0.n, p0.k
    public final void e() {
        AbstractC0091d.v(this.f3648b, true);
    }

    @Override // p0.n, p0.k
    public final void f(m mVar) {
        AbstractC0091d.v(this.f3648b, false);
        this.f3647a = true;
    }
}
