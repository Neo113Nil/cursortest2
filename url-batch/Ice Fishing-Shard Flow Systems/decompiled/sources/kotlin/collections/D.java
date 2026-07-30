package kotlin.collections;

import f6.InterfaceC0406a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D implements Iterable, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6118d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6119e;

    public D(kotlin.text.c cVar) {
        this.f6119e = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f6118d) {
            case 0:
                Object[] array = (Object[]) ((D6.o) this.f6119e).f547e;
                Intrinsics.checkNotNullParameter(array, "array");
                return new E(new R5.u(array));
            default:
                return new kotlin.text.b((kotlin.text.c) this.f6119e);
        }
    }

    public D(D6.o iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f6119e = iteratorFactory;
    }
}
