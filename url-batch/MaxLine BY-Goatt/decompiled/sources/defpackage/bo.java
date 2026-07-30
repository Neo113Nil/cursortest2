package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bo extends ay2 {
    public final short c;
    public final short d;

    public bo(ay2 ay2Var, int i, int i2) {
        super(ay2Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.ay2
    public final void a(co coVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                coVar.b(31, 5);
                if (s > 62) {
                    coVar.b(s - 31, 16);
                } else if (i == 0) {
                    coVar.b(Math.min((int) s, 31), 5);
                } else {
                    coVar.b(s - 31, 5);
                }
            }
            coVar.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append("::");
        sb.append((r1 + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
