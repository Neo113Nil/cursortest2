package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class EW {
    public static String[] A04 = {"TJGXeByBmTHQPhxlQWaLs9WTuhAPsvDn", "cTyjqlp8UNOQyLJMZAg4XzmxFMTsV66P", "jpK43NGJIXClE5ie7D0g7Fa1Rpa7kANX", "QOLMQ2OzOpXdQRVqr", "8HaEwRmcLljD6jWZTmAaPx2QrUAiOCOo", "DwqRJ6bMYzXyiD2Eugn3dkRE0I23BFLv", "IP6wvLF5I09xjY7fYX", "9PCiAf0"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public EW(int i) {
        this(i, -1L);
    }

    public EW(int i, int i2, int i3, long j) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
    }

    public EW(int i, long j) {
        this(i, -1, -1, j);
    }

    public final EW A00(int i) {
        if (this.A02 == i) {
            return this;
        }
        return new EW(i, this.A00, this.A01, this.A03);
    }

    public final boolean A01() {
        return this.A00 != -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r3 == r7.A01) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6.A03 != r7.A03) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r3 == r7.A01) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EW ew = (EW) obj;
        int i = this.A02;
        int i2 = ew.A02;
        if (A04[5].charAt(6) == 'n') {
            throw new RuntimeException();
        }
        A04[5] = "1RYqQKBI4tHo2l91LJlKc5yEyLaxvrL0";
        if (i == i2 && this.A00 == ew.A00) {
            int i3 = this.A01;
            if (A04[6].length() != 3) {
                A04[3] = "Mb83VhRFw0YfLpvsGxQ6UEzyZMUp7";
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        return ((result2 + result3) * 31) + ((int) this.A03);
    }
}
