package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vv1 implements Serializable {
    public static final tv1 Companion = new tv1();
    public final Object rtx2ld2ELZv4;

    public /* synthetic */ vv1(Object obj) {
        this.rtx2ld2ELZv4 = obj;
    }

    public static final Throwable PxuCJdSBwIXG(Object obj) {
        if (obj instanceof uv1) {
            return ((uv1) obj).rtx2ld2ELZv4;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vv1) {
            return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, ((vv1) obj).rtx2ld2ELZv4);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.rtx2ld2ELZv4;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.rtx2ld2ELZv4;
        if (obj instanceof uv1) {
            return ((uv1) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
