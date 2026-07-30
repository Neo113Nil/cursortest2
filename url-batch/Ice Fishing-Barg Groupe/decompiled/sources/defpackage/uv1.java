package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uv1 implements Serializable {
    public final Throwable rtx2ld2ELZv4;

    public uv1(Throwable th) {
        th.getClass();
        this.rtx2ld2ELZv4 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uv1) {
            return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, ((uv1) obj).rtx2ld2ELZv4);
        }
        return false;
    }

    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.rtx2ld2ELZv4 + ')';
    }
}
