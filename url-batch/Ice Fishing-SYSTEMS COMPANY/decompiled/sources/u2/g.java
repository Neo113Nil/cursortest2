package u2;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f41236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41237b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41238c;

    public g(int i, int i4, boolean z8) {
        this.f41236a = i;
        this.f41237b = i4;
        this.f41238c = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f41236a == gVar.f41236a && this.f41237b == gVar.f41237b && this.f41238c == gVar.f41238c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f41238c ? 1237 : 1231) ^ ((((this.f41236a ^ 1000003) * 1000003) ^ this.f41237b) * 1000003);
    }

    public final String toString() {
        int i = this.f41236a;
        int length = String.valueOf(i).length();
        int i4 = this.f41237b;
        int length2 = String.valueOf(i4).length();
        boolean z8 = this.f41238c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z8).length() + 1);
        AbstractC5051n.i(sb, "OfflineAdConfig{impressionPrerequisite=", i, ", clickPrerequisite=", i4);
        sb.append(", notificationFlowEnabled=");
        sb.append(z8);
        sb.append("}");
        return sb.toString();
    }
}
