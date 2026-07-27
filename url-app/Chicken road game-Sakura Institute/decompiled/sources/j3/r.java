package j3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class r extends B {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7218d;

    /* renamed from: e, reason: collision with root package name */
    public final SerialDescriptor f7219e;

    /* renamed from: i, reason: collision with root package name */
    public final String f7220i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String body, boolean z4) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.f7218d = z4;
        this.f7220i = body.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f7218d == rVar.f7218d && Intrinsics.a(this.f7220i, rVar.f7220i);
    }

    @Override // j3.B
    public final String getContent() {
        return this.f7220i;
    }

    public final int hashCode() {
        return this.f7220i.hashCode() + (Boolean.hashCode(this.f7218d) * 31);
    }

    @Override // j3.B
    public final boolean isString() {
        return this.f7218d;
    }

    @Override // j3.B
    public final String toString() {
        boolean z4 = this.f7218d;
        String str = this.f7220i;
        if (!z4) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        k3.t.a(sb, str);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
