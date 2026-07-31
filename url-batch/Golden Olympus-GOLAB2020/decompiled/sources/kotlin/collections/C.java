package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C implements Iterable, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f41035b;

    public C(Function0 iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f41035b = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new D((Iterator) this.f41035b.invoke());
    }
}
