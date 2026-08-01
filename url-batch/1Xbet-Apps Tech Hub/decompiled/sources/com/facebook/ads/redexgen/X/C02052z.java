package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.ads.redexgen.X.2z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02052z {
    public static String[] A05 = {"efs8eZdEWHsCfUb6qOzicmMnQm4SneBY", "GPD1kjm6fR3i7blABsL8PkfqVt5tQ0ec", "1ZMAOqgxiysbgCK2QhJ8YR6mzQdOOVTU", "tADzoHnDRwqyF4JfOWpRm", "", "2dCxtsKJi8key4A0", "YZUwpVg0T4azRRaUQd2X9mlkfrI9cQeh", "C6BrW2LKkOXM7XSn"};
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public C02052z(View view) {
        this.A04 = view;
    }

    private ViewParent A00(int i) {
        switch (i) {
            case 0:
                return this.A01;
            case 1:
                return this.A00;
            default:
                return null;
        }
    }

    private void A01(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.A01 = viewParent;
                break;
            case 1:
                this.A00 = viewParent;
                break;
        }
    }

    public final void A02() {
        A03(0);
    }

    public final void A03(int i) {
        ViewParent A00 = A00(i);
        if (A00 != null) {
            C3X.A02(A00, this.A04, i);
            A01(i, null);
        }
    }

    public final void A04(boolean z) {
        if (this.A02) {
            C3H.A08(this.A04);
        }
        this.A02 = z;
    }

    public final boolean A05() {
        return A09(0);
    }

    public final boolean A06() {
        return this.A02;
    }

    public final boolean A07(float f, float f2) {
        ViewParent A00;
        if (!A06() || (A00 = A00(0)) == null) {
            return false;
        }
        return C3X.A06(A00, this.A04, f, f2);
    }

    public final boolean A08(float f, float f2, boolean z) {
        ViewParent A00;
        if (!A06() || (A00 = A00(0)) == null) {
            return false;
        }
        return C3X.A07(A00, this.A04, f, f2, z);
    }

    public final boolean A09(int i) {
        return A00(i) != null;
    }

    public final boolean A0A(int i) {
        return A0B(i, 0);
    }

    public final boolean A0B(int i, int i2) {
        if (A09(i2)) {
            return true;
        }
        if (A06()) {
            if (A05[0].charAt(13) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "WHooJguTbRSPJrOooyt3LEnarcCTCzBe";
            strArr[1] = "8Bjeqw0rr3DdKBFvYwfvH0FxnGa8049d";
            View view = this.A04;
            for (ViewParent parent = this.A04.getParent(); parent != null; parent = parent.getParent()) {
                if (C3X.A08(parent, view, this.A04, i, i2)) {
                    A01(i2, parent);
                    C3X.A05(parent, view, this.A04, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A0C(int i, int i2, int i3, int i4, int[] iArr) {
        return A0D(i, i2, i3, i4, iArr, 0);
    }

    public final boolean A0D(int i, int i2, int i3, int i4, int[] iArr, int startX) {
        ViewParent A00;
        if (!A06() || (A00 = A00(startX)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            int i5 = 0;
            int i6 = 0;
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                i5 = iArr[0];
                i6 = iArr[1];
            }
            C3X.A03(A00, this.A04, i, i2, i3, i4, startX);
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i5;
                iArr[1] = iArr[1] - i6;
            }
            return true;
        }
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return false;
    }

    public final boolean A0E(int i, int i2, int[] iArr, int[] iArr2) {
        return A0F(i, i2, iArr, iArr2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r16.A03 = new int[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r14 = r16.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r5 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0F(int startX, int startY, int[] iArr, int[] iArr2, int i) {
        ViewParent parent;
        int[] consumed = iArr;
        if (!A06() || (parent = A00(i)) == null) {
            return false;
        }
        if (startX != 0 || startY != 0) {
            int i2 = 0;
            int i3 = 0;
            if (A05[3].length() != 9) {
                A05[0] = "3VbjZKhXDsexEmt2meqPVZABMNEQkFPW";
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    i2 = iArr2[0];
                    i3 = iArr2[1];
                }
                if (consumed == null) {
                    int[] iArr3 = this.A03;
                    String[] strArr = A05;
                    if (strArr[5].length() != strArr[7].length()) {
                        A05[4] = "";
                    } else {
                        String[] strArr2 = A05;
                        strArr2[5] = "gHL5QaZEq3qu3ZW6";
                        strArr2[7] = "on2hgQBHubksAtN0";
                    }
                }
                consumed[0] = 0;
                consumed[1] = 0;
                C3X.A04(parent, this.A04, startX, startY, consumed, i);
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i2;
                    iArr2[1] = iArr2[1] - i3;
                }
                return (consumed[0] == 0 && consumed[1] == 0) ? false : true;
            }
            throw new RuntimeException();
        }
        if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }
}
