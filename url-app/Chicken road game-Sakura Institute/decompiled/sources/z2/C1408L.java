package z2;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1408L implements Iterable, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f11934d;

    public C1408L(Function0 iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f11934d = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new T2.b(((C1438v) this.f11934d).invoke());
    }
}
