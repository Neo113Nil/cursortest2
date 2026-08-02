package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ety implements Comparable {
    final long a;
    final String b;
    public final int c;
    public final long d;
    public final Object e;
    private final RuntimeException f;

    public ety(long j, String str, int i, long j2, Object obj) {
        hoq.x(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = obj;
        if (i != 5) {
            this.f = null;
            return;
        }
        if (obj == null) {
            this.f = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof jjq)) {
            this.f = null;
        } else {
            this.f = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
        }
    }

    public final Object a() {
        hoq.H(this.c == 5);
        Object obj = this.e;
        obj.getClass();
        return obj;
    }

    public final Object b() {
        int i = this.c;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return Long.valueOf(this.d);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(this.d));
        }
        if (i == 4) {
            Object obj = this.e;
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        Object obj2 = this.e;
        obj2.getClass();
        try {
            return obj2 instanceof byte[] ? (byte[]) obj2 : ((jjq) obj2).x();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    public final String c() {
        String str = this.b;
        return str != null ? str : Long.toString(this.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ety etyVar = (ety) obj;
        long j = etyVar.a;
        long j2 = this.a;
        int compare = Long.compare(j2, j);
        if (compare != 0) {
            return compare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.b;
        str.getClass();
        String str2 = etyVar.b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ety)) {
            return false;
        }
        ety etyVar = (ety) obj;
        return this.a == etyVar.a && Objects.equals(this.b, etyVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public final String toString() {
        return c() + ":" + String.valueOf(b());
    }
}
