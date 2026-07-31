package C0;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class B implements R.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2.k f503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2.k f504e;

    /* JADX WARN: Multi-variable type inference failed */
    public B(InterfaceC0426e interfaceC0426e, InterfaceC0424c interfaceC0424c) {
        this.f503d = (f2.k) interfaceC0426e;
        this.f504e = (f2.k) interfaceC0424c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.e, f2.k] */
    @Override // R.n
    public final Object a(R.b bVar, Object obj) {
        return this.f503d.h(bVar, obj);
    }
}
