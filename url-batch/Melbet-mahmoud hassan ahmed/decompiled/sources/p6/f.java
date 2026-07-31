package p6;

import f6.p;
import v5.q;

/* loaded from: classes.dex */
final class f<T> extends a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p<c<? super T>, y5.d<? super q>, Object> f20157a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(p<? super c<? super T>, ? super y5.d<? super q>, ? extends Object> pVar) {
        this.f20157a = pVar;
    }

    @Override // p6.a
    public Object b(c<? super T> cVar, y5.d<? super q> dVar) {
        Object c7;
        Object invoke = this.f20157a.invoke(cVar, dVar);
        c7 = z5.d.c();
        return invoke == c7 ? invoke : q.f22838a;
    }
}
