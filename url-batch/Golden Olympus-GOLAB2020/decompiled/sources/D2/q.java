package D2;

import E2.a0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends z {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f417b;

    /* renamed from: c, reason: collision with root package name */
    private final A2.f f418c;

    /* renamed from: d, reason: collision with root package name */
    private final String f419d;

    public /* synthetic */ q(Object obj, boolean z4, A2.f fVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z4, (i4 & 4) != 0 ? null : fVar);
    }

    @Override // D2.z
    public String e() {
        return this.f419d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return g() == qVar.g() && Intrinsics.areEqual(e(), qVar.e());
    }

    public final A2.f f() {
        return this.f418c;
    }

    public boolean g() {
        return this.f417b;
    }

    public int hashCode() {
        return (Boolean.hashCode(g()) * 31) + e().hashCode();
    }

    @Override // D2.z
    public String toString() {
        if (!g()) {
            return e();
        }
        StringBuilder sb = new StringBuilder();
        a0.c(sb, e());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object body, boolean z4, A2.f fVar) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.f417b = z4;
        this.f418c = fVar;
        this.f419d = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
