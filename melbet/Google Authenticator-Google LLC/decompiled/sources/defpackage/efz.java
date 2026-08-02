package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efz {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    private String i;
    private boolean j;
    private boolean k;
    private byte l;
    private int m;

    public final ega a() {
        String str;
        int i;
        int i2;
        int i3;
        if (this.l == 3 && (str = this.i) != null && (i = this.m) != 0 && (i2 = this.g) != 0 && (i3 = this.h) != 0) {
            return new ega(str, this.j, this.a, this.b, this.c, this.d, this.k, i, i2, this.e, this.f, i3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == null) {
            sb.append(" accountName");
        }
        if ((this.l & 1) == 0) {
            sb.append(" isMetadataAvailable");
        }
        if ((this.l & 2) == 0) {
            sb.append(" isG1User");
        }
        if (this.m == 0) {
            sb.append(" isDasherUser");
        }
        if (this.g == 0) {
            sb.append(" isUnicornUser");
        }
        if (this.h == 0) {
            sb.append(" ageRange");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountName");
        }
        this.i = str;
    }

    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null isDasherUser");
        }
        this.m = i;
    }

    public final void d(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 2);
    }

    public final void e(boolean z) {
        this.j = z;
        this.l = (byte) (this.l | 1);
    }
}
