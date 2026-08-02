package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpn implements Comparable {
    public final Drawable a;
    public final dqg b;
    public final String c;
    public final int d;
    public final int e;

    public dpn(Drawable drawable, dqg dqgVar, String str, int i) {
        this.a = drawable;
        this.b = dqgVar;
        this.c = str;
        this.d = i;
        this.e = 1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return dja.p(this.d).compareTo(dja.p(((dpn) obj).d));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dpn) {
            dpn dpnVar = (dpn) obj;
            Drawable drawable = this.a;
            if (drawable != null ? drawable.equals(dpnVar.a) : dpnVar.a == null) {
                dqg dqgVar = this.b;
                if (dqgVar != null ? dqgVar.equals(dpnVar.b) : dpnVar.b == null) {
                    String str = this.c;
                    if (str != null ? str.equals(dpnVar.c) : dpnVar.c == null) {
                        if (this.d == dpnVar.d) {
                            int i = dpnVar.e;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = drawable == null ? 0 : drawable.hashCode();
        dqg dqgVar = this.b;
        int hashCode2 = dqgVar == null ? 0 : dqgVar.hashCode();
        int i = hashCode ^ 1000003;
        String str = this.c;
        return ((this.d ^ (((((i * 1000003) ^ hashCode2) * 1000003) ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ 1;
    }

    public final String toString() {
        return "BadgeContent{data=" + String.valueOf(this.a) + ", dataFactory=" + String.valueOf(this.b) + ", contentDescription=" + this.c + ", badgeType=" + dja.o(this.d) + ", badgeStyle=PLAIN}";
    }

    public dpn() {
        throw null;
    }
}
