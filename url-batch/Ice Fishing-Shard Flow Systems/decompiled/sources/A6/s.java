package A6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends C {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f134d;

    /* renamed from: e, reason: collision with root package name */
    public final String f135e;

    public s(String body, boolean z7) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f134d = z7;
        this.f135e = body.toString();
    }

    @Override // A6.C
    public final String a() {
        return this.f135e;
    }

    @Override // A6.C
    public final boolean b() {
        return this.f134d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f134d == sVar.f134d && Intrinsics.a(this.f135e, sVar.f135e);
    }

    public final int hashCode() {
        return this.f135e.hashCode() + (Boolean.hashCode(this.f134d) * 31);
    }

    @Override // A6.C
    public final String toString() {
        boolean z7 = this.f134d;
        String str = this.f135e;
        if (!z7) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        B6.w.a(sb, str);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
