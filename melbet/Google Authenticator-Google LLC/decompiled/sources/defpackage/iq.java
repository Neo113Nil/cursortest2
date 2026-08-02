package defpackage;

import android.graphics.Typeface;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iq {
    private final Typeface a;
    private final String b;
    private final int c;

    public iq(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iq)) {
            return false;
        }
        iq iqVar = (iq) obj;
        return this.c == iqVar.c && Objects.equals(this.a, iqVar.a) && Objects.equals(this.b, iqVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
