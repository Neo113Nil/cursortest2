package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gny {
    public final int a;
    public final String b;
    public final Intent c;

    public gny(int i, String str, Intent intent) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
        if (intent == null) {
            throw new NullPointerException("Null intent");
        }
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gny) {
            gny gnyVar = (gny) obj;
            if (this.a == gnyVar.a && this.b.equals(gnyVar.b) && this.c.equals(gnyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "OverflowMenuItem{id=" + this.a + ", title=" + this.b + ", intent=" + this.c.toString() + "}";
    }

    public gny() {
        throw null;
    }
}
