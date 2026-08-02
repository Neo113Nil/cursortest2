package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class epv {
    public final Long a;
    public final Long b;
    public final Long c;

    public epv(Long l, Long l2, Long l3) {
        this.a = l;
        this.b = l2;
        this.c = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof epv) {
            epv epvVar = (epv) obj;
            Long l = this.a;
            if (l != null ? l.equals(epvVar.a) : epvVar.a == null) {
                Long l2 = this.b;
                if (l2 != null ? l2.equals(epvVar.b) : epvVar.b == null) {
                    Long l3 = this.c;
                    if (l3 != null ? l3.equals(epvVar.c) : epvVar.c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.b;
        int hashCode2 = l2 == null ? 0 : l2.hashCode();
        int i = hashCode ^ 1000003;
        Long l3 = this.c;
        return (((i * 1000003) ^ hashCode2) * 1000003) ^ (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "ProcDmaBuf{dmabufRssBytes=" + this.a + ", dmabufRssHwmBytes=" + this.b + ", dmabufPssBytes=" + this.c + "}";
    }

    public epv() {
        throw null;
    }
}
