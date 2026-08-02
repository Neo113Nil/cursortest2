package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jpp {
    public final jpi a;
    public final int b;
    public final int c;
    public final int d;
    final /* synthetic */ jpq e;

    public jpp(jpq jpqVar, jpi jpiVar, int i, int i2, int i3) {
        this.e = jpqVar;
        this.a = jpiVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        if (this.a != jpi.BYTE) {
            return this.d;
        }
        jpq jpqVar = this.e;
        int i = this.b;
        int i2 = this.d;
        int i3 = this.c;
        bse bseVar = jpqVar.c;
        return ((jpd) bseVar.c).d(((String) bseVar.d).substring(i, i2 + i), i3).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        jpi jpiVar = this.a;
        sb.append(jpiVar);
        sb.append('(');
        jpi jpiVar2 = jpi.ECI;
        jpq jpqVar = this.e;
        if (jpiVar == jpiVar2) {
            sb.append(((jpd) jpqVar.c.c).b(this.c).displayName());
        } else {
            int i = this.b;
            String substring = ((String) jpqVar.c.d).substring(i, this.d + i);
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < substring.length(); i2++) {
                if (substring.charAt(i2) < ' ' || substring.charAt(i2) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(substring.charAt(i2));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
