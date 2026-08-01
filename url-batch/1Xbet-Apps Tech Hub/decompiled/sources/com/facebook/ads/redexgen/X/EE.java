package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;

/* loaded from: assets/audience_network.dex */
public final class EE extends AbstractC0989Yw {
    public static String[] A02 = {"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", ExifInterface.GPS_MEASUREMENT_3D, "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};
    public C4M A00;
    public C4M A01;

    private int A00(AbstractC02334c abstractC02334c, View view, C4M c4m) {
        int containerCenter;
        int A0F = c4m.A0F(view) + (c4m.A0D(view) / 2);
        if (abstractC02334c.A1X()) {
            int A0A = c4m.A0A();
            int childCenter = c4m.A0B();
            containerCenter = A0A + (childCenter / 2);
        } else {
            int childCenter2 = c4m.A06();
            containerCenter = childCenter2 / 2;
        }
        return A0F - containerCenter;
    }

    private View A01(AbstractC02334c abstractC02334c, C4M c4m) {
        int childCenter;
        int A0W = abstractC02334c.A0W();
        if (A0W == 0) {
            return null;
        }
        View view = null;
        if (abstractC02334c.A1X()) {
            int A0A = c4m.A0A();
            int A0B = c4m.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            int childCount = A0B / 2;
            childCenter = A0A + childCount;
        } else {
            int childCount2 = c4m.A06();
            childCenter = childCount2 / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int absClosest = 0; absClosest < A0W; absClosest++) {
            View A0t = abstractC02334c.A0t(absClosest);
            int A0F = c4m.A0F(A0t);
            int childCount3 = c4m.A0D(A0t);
            int childCount4 = Math.abs((A0F + (childCount3 / 2)) - childCenter);
            if (childCount4 < i) {
                i = childCount4;
                view = A0t;
            }
        }
        return view;
    }

    private View A02(AbstractC02334c abstractC02334c, C4M c4m) {
        int A0W = abstractC02334c.A0W();
        if (A0W == 0) {
            return null;
        }
        View closestChild = null;
        int childStart = Integer.MAX_VALUE;
        for (int i = 0; i < A0W; i++) {
            View A0t = abstractC02334c.A0t(i);
            int childCount = c4m.A0F(A0t);
            if (childCount < childStart) {
                childStart = childCount;
                if (A02[3].length() != 1) {
                    throw new RuntimeException();
                }
                A02[3] = "0";
                closestChild = A0t;
            }
        }
        return closestChild;
    }

    private C4M A03(AbstractC02334c abstractC02334c) {
        C4M c4m = this.A00;
        if (c4m == null || c4m.A02 != abstractC02334c) {
            this.A00 = C4M.A00(abstractC02334c);
        }
        return this.A00;
    }

    private C4M A04(AbstractC02334c abstractC02334c) {
        C4M c4m = this.A01;
        if (c4m == null || c4m.A02 != abstractC02334c) {
            this.A01 = C4M.A01(abstractC02334c);
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r4 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r4.x < 0.0f) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r4.y >= 0.0f) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r4 != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.AbstractC0989Yw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A0C(AbstractC02334c abstractC02334c, int i, int i2) {
        int centerPosition;
        boolean reverseLayout;
        int A0Z = abstractC02334c.A0Z();
        if (A0Z == 0) {
            return -1;
        }
        View view = null;
        if (abstractC02334c.A25()) {
            view = A02(abstractC02334c, A04(abstractC02334c));
        } else if (abstractC02334c.A24()) {
            C4M A03 = A03(abstractC02334c);
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo";
            view = A02(abstractC02334c, A03);
        }
        if (view == null || (centerPosition = abstractC02334c.A0p(view)) == -1) {
            return -1;
        }
        boolean z = false;
        if (abstractC02334c.A24()) {
            reverseLayout = i > 0;
        } else {
            reverseLayout = i2 > 0;
        }
        boolean z2 = false;
        if (abstractC02334c instanceof InterfaceC02444o) {
            int itemCount = A0Z - 1;
            PointF A4L = ((InterfaceC02444o) abstractC02334c).A4L(itemCount);
            if (A02[3].length() != 1) {
                String[] strArr = A02;
                strArr[6] = "yuw4mNpzW34AqVSRehlxNeo";
                strArr[2] = "wkUUhZpWZ02e";
            } else {
                A02[0] = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU";
            }
        }
        return z2 ? reverseLayout ? centerPosition - 1 : centerPosition : reverseLayout ? centerPosition + 1 : centerPosition;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0989Yw
    public final View A0D(AbstractC02334c abstractC02334c) {
        if (abstractC02334c.A25()) {
            return A01(abstractC02334c, A04(abstractC02334c));
        }
        if (abstractC02334c.A24()) {
            return A01(abstractC02334c, A03(abstractC02334c));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0989Yw
    public final ZB A0E(AbstractC02334c abstractC02334c) {
        if (!(abstractC02334c instanceof InterfaceC02444o)) {
            return null;
        }
        return new EF(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0989Yw
    public final int[] A0H(AbstractC02334c abstractC02334c, View view) {
        int[] iArr = new int[2];
        if (abstractC02334c.A24()) {
            iArr[0] = A00(abstractC02334c, view, A03(abstractC02334c));
        } else {
            iArr[0] = 0;
        }
        boolean A25 = abstractC02334c.A25();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (A25) {
            iArr[1] = A00(abstractC02334c, view, A04(abstractC02334c));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
