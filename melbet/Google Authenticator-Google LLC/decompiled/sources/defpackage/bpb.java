package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpb {
    public String a;
    public Integer b;
    public Long c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private int i;
    private long j;
    private boolean k;
    private byte l;

    public final bpc a() {
        if (this.l == 7 && this.d != null && this.e != null && this.f != null && this.g != null && this.h != null) {
            return new bpc(this.d, this.a, this.e, this.f, this.b, this.g, this.h, this.i, this.j, this.k, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" name");
        }
        if (this.e == null) {
            sb.append(" secret");
        }
        if (this.f == null) {
            sb.append(" otpType");
        }
        if (this.g == null) {
            sb.append(" uniqueId");
        }
        if (this.h == null) {
            sb.append(" algorithm");
        }
        if ((this.l & 1) == 0) {
            sb.append(" digits");
        }
        if ((this.l & 2) == 0) {
            sb.append(" timestamp");
        }
        if ((this.l & 4) == 0) {
            sb.append(" isDeleted");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null algorithm");
        }
        this.h = str;
    }

    public final void c(int i) {
        this.i = i;
        this.l = (byte) (this.l | 1);
    }

    public final void d(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 4);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.d = str;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null otpType");
        }
        this.f = str;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null secret");
        }
        this.e = str;
    }

    public final void h(long j) {
        this.j = j;
        this.l = (byte) (this.l | 2);
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null uniqueId");
        }
        this.g = str;
    }
}
