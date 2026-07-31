package b2;

import java.io.Serializable;
import kotlin.collections.AbstractC3213c;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1373c extends AbstractC3213c implements InterfaceC1371a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final Enum[] f13305b;

    public C1373c(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f13305b = entries;
    }

    public boolean b(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) AbstractC3219i.N(this.f13305b, element.ordinal())) == element;
    }

    @Override // kotlin.collections.AbstractC3211a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return b((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum get(int i4) {
        AbstractC3213c.Companion.b(i4, this.f13305b.length);
        return this.f13305b[i4];
    }

    public int e(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC3219i.N(this.f13305b, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    public int f(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }

    @Override // kotlin.collections.AbstractC3211a
    public int getSize() {
        return this.f13305b.length;
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return e((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return f((Enum) obj);
        }
        return -1;
    }
}
