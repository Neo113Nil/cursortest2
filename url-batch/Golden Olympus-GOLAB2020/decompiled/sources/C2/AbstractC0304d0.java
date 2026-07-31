package C2;

import A2.f;
import A2.k;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: C2.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0304d0 implements A2.f {

    /* renamed from: a, reason: collision with root package name */
    private final A2.f f276a;

    /* renamed from: b, reason: collision with root package name */
    private final int f277b;

    public /* synthetic */ AbstractC0304d0(A2.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // A2.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // A2.f
    public int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // A2.f
    public A2.j e() {
        return k.b.f100a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0304d0)) {
            return false;
        }
        AbstractC0304d0 abstractC0304d0 = (AbstractC0304d0) obj;
        return Intrinsics.areEqual(this.f276a, abstractC0304d0.f276a) && Intrinsics.areEqual(a(), abstractC0304d0.a());
    }

    @Override // A2.f
    public int f() {
        return this.f277b;
    }

    @Override // A2.f
    public String g(int i4) {
        return String.valueOf(i4);
    }

    @Override // A2.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // A2.f
    public List h(int i4) {
        if (i4 >= 0) {
            return CollectionsKt.emptyList();
        }
        throw new IllegalArgumentException(("Illegal index " + i4 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f276a.hashCode() * 31) + a().hashCode();
    }

    @Override // A2.f
    public A2.f i(int i4) {
        if (i4 >= 0) {
            return this.f276a;
        }
        throw new IllegalArgumentException(("Illegal index " + i4 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // A2.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // A2.f
    public boolean j(int i4) {
        if (i4 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i4 + ", " + a() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return a() + '(' + this.f276a + ')';
    }

    private AbstractC0304d0(A2.f fVar) {
        this.f276a = fVar;
        this.f277b = 1;
    }
}
