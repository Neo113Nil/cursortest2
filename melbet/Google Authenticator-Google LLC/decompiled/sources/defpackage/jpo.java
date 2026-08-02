package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpo {
    public final jpi a;
    public final int b;
    public final int c;
    public final int d;
    public final jpo e;
    public final int f;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x002b, code lost:
    
        if (r1 != r11.c) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jpo(bse bseVar, jpi jpiVar, int i, int i2, int i3, jpo jpoVar, jpk jpkVar) {
        int ordinal;
        this.a = jpiVar;
        this.b = i;
        jpi jpiVar2 = jpi.BYTE;
        int i4 = (jpiVar == jpiVar2 || jpoVar == null) ? i2 : jpoVar.c;
        this.c = i4;
        this.d = i3;
        this.e = jpoVar;
        boolean z = false;
        int i5 = jpoVar != null ? jpoVar.f : 0;
        if (jpiVar == jpiVar2 && jpoVar == null) {
            if (i4 == 0) {
                i4 = 0;
            }
            z = true;
            i5 = (jpoVar == null && jpiVar == jpoVar.a && !z) ? i5 : i5 + jpiVar.a(jpkVar) + 4;
            ordinal = jpiVar.ordinal();
            if (ordinal == 1) {
                if (ordinal == 2) {
                    i5 += i3 != 1 ? 11 : 6;
                } else if (ordinal == 4) {
                    i5 += ((jpd) bseVar.c).d(((String) bseVar.d).substring(i, i3 + i), i2).length * 8;
                    if (z) {
                        i5 += 12;
                    }
                } else if (ordinal == 6) {
                    i5 += 13;
                }
            } else {
                i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
            }
            this.f = i5;
        }
        if (jpoVar != null) {
        }
        if (jpoVar == null) {
        }
        ordinal = jpiVar.ordinal();
        if (ordinal == 1) {
        }
        this.f = i5;
    }
}
