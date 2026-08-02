package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebi {
    public final Drawable a;
    public final int b;
    public final boolean c;
    private final gzp d;

    public ebi(Drawable drawable, int i, boolean z, gzp gzpVar) {
        this.a = drawable;
        this.b = i;
        this.c = z;
        this.d = gzpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebi) {
            ebi ebiVar = (ebi) obj;
            Drawable drawable = this.a;
            if (drawable != null ? drawable.equals(ebiVar.a) : ebiVar.a == null) {
                if (this.b == ebiVar.b && this.c == ebiVar.c && this.d.equals(ebiVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = drawable == null ? 0 : drawable.hashCode();
        return (((true != this.c ? 1237 : 1231) ^ ((((hashCode ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        gzp gzpVar = this.d;
        return "TintAwareIcon{icon=" + String.valueOf(this.a) + ", iconResId=" + this.b + ", useTint=" + this.c + ", iconContentDescription=" + String.valueOf(gzpVar) + "}";
    }

    public ebi() {
        throw null;
    }
}
