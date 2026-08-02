package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class t implements Serializable, o {
    private static final long serialVersionUID = 1;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final double d;
    private final double e;
    private final long[] f;
    private final int g;

    public t(int i, boolean z, int i2, boolean z2, double d, double d2, long[] jArr) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = d;
        this.e = d2;
        this.f = jArr;
        this.g = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007f A[RETURN] */
    @Override // defpackage.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(p pVar) {
        long j;
        double d;
        int i;
        boolean z;
        long[] jArr;
        int i2;
        int i3;
        int i4 = this.g;
        int i5 = i4 - 1;
        if (i5 == 1) {
            j = pVar.f;
        } else if (i5 == 2) {
            j = pVar.d;
        } else if (i5 != 3) {
            if (i5 == 4) {
                i3 = pVar.b;
            } else {
                if (i5 != 5) {
                    d = pVar.a;
                    if ((!this.c && d - ((long) d) != 0.0d) || (i4 == 7 && pVar.b != 0)) {
                        return !this.b;
                    }
                    i = this.a;
                    if (i != 0) {
                        d %= i;
                    }
                    z = d < this.d && d <= this.e;
                    if (z && (jArr = this.f) != null) {
                        z = false;
                        for (i2 = 0; !z && i2 < jArr.length; i2 += 2) {
                            z = d < ((double) jArr[i2]) && d <= ((double) jArr[i2 + 1]);
                        }
                    }
                    return this.b == z;
                }
                i3 = pVar.c;
            }
            d = i3;
            if (!this.c) {
            }
            i = this.a;
            if (i != 0) {
            }
            if (d < this.d) {
            }
            if (z) {
                z = false;
                while (!z) {
                    if (d < ((double) jArr[i2])) {
                    }
                }
            }
            if (this.b == z) {
            }
        } else {
            j = pVar.e;
        }
        d = j;
        if (!this.c) {
        }
        i = this.a;
        if (i != 0) {
        }
        if (d < this.d) {
        }
        if (z) {
        }
        if (this.b == z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r8 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        r6 = " != ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        if (r9.b != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        switch (this.g) {
            case 1:
                str = "n";
                break;
            case 2:
                str = "i";
                break;
            case 3:
                str = "f";
                break;
            case 4:
                str = "t";
                break;
            case 5:
                str = "v";
                break;
            case 6:
                str = "w";
                break;
            default:
                str = "j";
                break;
        }
        sb.append((Object) str);
        int i = this.a;
        if (i != 0) {
            sb.append(" % ");
            sb.append(i);
        }
        double d = this.d;
        double d2 = this.e;
        String str2 = " = ";
        if (d != d2) {
            boolean z = this.c;
            boolean z2 = this.b;
            if (!z) {
                str2 = z2 ? " within " : " not within ";
            }
        }
        sb.append(str2);
        long[] jArr = this.f;
        if (jArr != null) {
            int i2 = 0;
            while (i2 < jArr.length) {
                w.b(sb, jArr[i2], jArr[i2 + 1], i2 != 0);
                i2 += 2;
            }
        } else {
            w.b(sb, d, d2, false);
        }
        return sb.toString();
    }
}
