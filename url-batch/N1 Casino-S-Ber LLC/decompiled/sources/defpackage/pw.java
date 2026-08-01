package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class pw implements Serializable {
    public final Object f;
    public final Object g;

    public pw(Object obj, Object obj2) {
        this.f = obj;
        this.g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw)) {
            return false;
        }
        pw pwVar = (pw) obj;
        return zo.b(this.f, pwVar.f) && zo.b(this.g, pwVar.g);
    }

    public final int hashCode() {
        Object obj = this.f;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f + ", " + this.g + ')';
    }
}
