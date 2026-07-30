package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j70 {
    public static final /* synthetic */ int e = 0;
    public final boolean a;
    public final int b;
    public final int c;
    public final mi0 d;

    static {
        new j70();
    }

    public j70() {
        mi0 mi0Var = mi0.g;
        this.a = true;
        this.b = 1;
        this.c = 1;
        this.d = mi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j70)) {
            return false;
        }
        j70 j70Var = (j70) obj;
        return this.a == j70Var.a && this.b == j70Var.b && this.c == j70Var.c && Intrinsics.a(this.d, j70Var.d);
    }

    public final int hashCode() {
        return this.d.d.hashCode() + qy0.c(this.c, qy0.c(this.b, qy0.d(qy0.c(0, Boolean.hashCode(false) * 31, 31), 31, this.a), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb.append((Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.a);
        sb.append(", keyboardType=");
        int i = this.b;
        sb.append((Object) (i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i2 = this.c;
        if (i2 == -1) {
            str = "Unspecified";
        } else if (i2 != 0) {
            str = i2 == 1 ? "Default" : i2 == 2 ? "Go" : i2 == 3 ? "Search" : i2 == 4 ? "Send" : i2 == 5 ? "Previous" : i2 == 6 ? "Next" : i2 == 7 ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
