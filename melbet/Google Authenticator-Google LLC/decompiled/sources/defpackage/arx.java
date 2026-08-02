package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arx {
    public final Uri a;
    public final boolean b;

    public arx(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ksp.b(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        arx arxVar = (arx) obj;
        return ksp.b(this.a, arxVar.a) && this.b == arxVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.m(this.b);
    }
}
