package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class l00 implements Serializable {
    public final Throwable f;

    public l00(Throwable th) {
        this.f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l00) {
            return this.f.equals(((l00) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f + ')';
    }
}
