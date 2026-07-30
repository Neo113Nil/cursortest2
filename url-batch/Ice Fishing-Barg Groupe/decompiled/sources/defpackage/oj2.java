package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class oj2 implements gu {
    public final ThreadLocal rtx2ld2ELZv4;

    public oj2(ThreadLocal threadLocal) {
        this.rtx2ld2ELZv4 = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj2) && cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, ((oj2) obj).rtx2ld2ELZv4);
    }

    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.rtx2ld2ELZv4 + ')';
    }
}
