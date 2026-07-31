package C2;

import A2.f;
import A2.k;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: C2.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0314i0 implements A2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f294a;

    /* renamed from: b, reason: collision with root package name */
    private final A2.f f295b;

    /* renamed from: c, reason: collision with root package name */
    private final A2.f f296c;

    /* renamed from: d, reason: collision with root package name */
    private final int f297d;

    public /* synthetic */ AbstractC0314i0(String str, A2.f fVar, A2.f fVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, fVar2);
    }

    @Override // A2.f
    public String a() {
        return this.f294a;
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // A2.f
    public A2.j e() {
        return k.c.f101a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0314i0)) {
            return false;
        }
        AbstractC0314i0 abstractC0314i0 = (AbstractC0314i0) obj;
        return Intrinsics.areEqual(a(), abstractC0314i0.a()) && Intrinsics.areEqual(this.f295b, abstractC0314i0.f295b) && Intrinsics.areEqual(this.f296c, abstractC0314i0.f296c);
    }

    @Override // A2.f
    public int f() {
        return this.f297d;
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
        return (((a().hashCode() * 31) + this.f295b.hashCode()) * 31) + this.f296c.hashCode();
    }

    @Override // A2.f
    public A2.f i(int i4) {
        if (i4 >= 0) {
            int i5 = i4 % 2;
            if (i5 == 0) {
                return this.f295b;
            }
            if (i5 == 1) {
                return this.f296c;
            }
            throw new IllegalStateException("Unreached");
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
        return a() + '(' + this.f295b + ", " + this.f296c + ')';
    }

    private AbstractC0314i0(String str, A2.f fVar, A2.f fVar2) {
        this.f294a = str;
        this.f295b = fVar;
        this.f296c = fVar2;
        this.f297d = 2;
    }
}
