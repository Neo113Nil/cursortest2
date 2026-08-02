package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pw {
    public final int a;
    public final CharSequence b;

    public pw(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pw) {
            pw pwVar = (pw) obj;
            if (this.a == pwVar.a) {
                CharSequence charSequence = pwVar.b;
                String a = a(this.b);
                String a2 = a(charSequence);
                if (a == null && a2 == null) {
                    return true;
                }
                if (a != null && a.equals(a2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a(this.b)});
    }
}
