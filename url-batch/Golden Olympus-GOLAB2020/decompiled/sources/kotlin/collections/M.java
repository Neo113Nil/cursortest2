package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class M extends AbstractC3213c implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private final List f41047b;

    /* renamed from: c, reason: collision with root package name */
    private int f41048c;

    /* renamed from: d, reason: collision with root package name */
    private int f41049d;

    public M(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f41047b = list;
    }

    public final void b(int i4, int i5) {
        AbstractC3213c.Companion.d(i4, i5, this.f41047b.size());
        this.f41048c = i4;
        this.f41049d = i5 - i4;
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    public Object get(int i4) {
        AbstractC3213c.Companion.b(i4, this.f41049d);
        return this.f41047b.get(this.f41048c + i4);
    }

    @Override // kotlin.collections.AbstractC3211a
    public int getSize() {
        return this.f41049d;
    }
}
