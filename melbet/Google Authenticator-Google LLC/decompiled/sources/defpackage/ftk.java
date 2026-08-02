package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ftk {
    public final Intent a;

    public ftk(Intent intent) {
        if (intent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ftk) {
            return this.a.equals(((ftk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SelectorContext{intent=" + this.a.toString() + "}";
    }

    public ftk() {
        throw null;
    }
}
