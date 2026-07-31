package m6;

/* loaded from: classes.dex */
public final class h2<T> extends kotlinx.coroutines.internal.w<T> {

    /* renamed from: i, reason: collision with root package name */
    private y5.g f19289i;

    /* renamed from: j, reason: collision with root package name */
    private Object f19290j;

    @Override // kotlinx.coroutines.internal.w, m6.a
    protected void t0(Object obj) {
        y5.g gVar = this.f19289i;
        if (gVar != null) {
            kotlinx.coroutines.internal.c0.a(gVar, this.f19290j);
            this.f19289i = null;
            this.f19290j = null;
        }
        Object a7 = c0.a(obj, this.f18380h);
        y5.d<T> dVar = this.f18380h;
        y5.g context = dVar.getContext();
        Object c7 = kotlinx.coroutines.internal.c0.c(context, null);
        h2<?> e7 = c7 != kotlinx.coroutines.internal.c0.f18321a ? e0.e(dVar, context, c7) : null;
        try {
            this.f18380h.resumeWith(a7);
            v5.q qVar = v5.q.f22838a;
        } finally {
            if (e7 == null || e7.y0()) {
                kotlinx.coroutines.internal.c0.a(context, c7);
            }
        }
    }

    public final boolean y0() {
        if (this.f19289i == null) {
            return false;
        }
        this.f19289i = null;
        this.f19290j = null;
        return true;
    }

    public final void z0(y5.g gVar, Object obj) {
        this.f19289i = gVar;
        this.f19290j = obj;
    }
}
