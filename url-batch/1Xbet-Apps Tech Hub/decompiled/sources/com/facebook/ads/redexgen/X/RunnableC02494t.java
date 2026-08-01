package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC02494t implements Runnable {
    public static byte[] A07;
    public static String[] A08 = {"c4xSVVt4fNiIZ9aJ0ftrOCVpKy2EJW", "bj77oS7wYHzhrY124YppwtIfPTuDoAHL", "mRmZUQV2DMpprRsDQaH8Mtbq5JuQtR14", "UXM5", "qfxFRQLCBxpF20va4RNO9ygLlTXV5cTV", "Bw29gSSAA0erG37CQVEqOkFPeCj6ZZr8", "KVIri1u0fbW7r5jnncTGzAnirlJcKx", "TA0EOfT3Z02jNldii3VIEnkki3"};
    public OverScroller A01;
    public int A02;
    public int A03;
    public final /* synthetic */ ED A06;
    public Interpolator A00 = ED.A1A;
    public boolean A04 = false;
    public boolean A05 = false;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-46, -42, -96, -45, -29, -14, -17, -20, -20};
    }

    static {
        A03();
    }

    public RunnableC02494t(ED ed) {
        this.A06 = ed;
        this.A01 = new OverScroller(ed.getContext(), ED.A1A);
    }

    private float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i, int i2, int i3, int i4) {
        int absDx;
        int containerSize = Math.abs(i);
        int delta = Math.abs(i2);
        int duration = containerSize > delta ? 1 : 0;
        int halfContainerSize = (int) Math.sqrt((i3 * i3) + (i4 * i4));
        int absDx2 = (int) Math.sqrt((i * i) + (i2 * i2));
        ED ed = this.A06;
        int width = duration != 0 ? ed.getWidth() : ed.getHeight();
        int velocity = width / 2;
        float A00 = velocity + (velocity * A00(Math.min(1.0f, (absDx2 * 1.0f) / width)));
        if (halfContainerSize > 0) {
            absDx = Math.round(Math.abs(A00 / halfContainerSize) * 1000.0f) * 4;
        } else {
            if (duration == 0) {
                containerSize = delta;
            }
            absDx = (int) (((containerSize / width) + 1.0f) * 300.0f);
        }
        return Math.min(absDx, AdError.SERVER_ERROR_CODE);
    }

    private final void A04() {
        this.A05 = false;
        this.A04 = true;
    }

    private final void A05() {
        this.A04 = false;
        if (this.A05) {
            A07();
        }
    }

    private final void A06(int i, int i2, int i3, int i4) {
        A0B(i, i2, A01(i, i2, i3, i4));
    }

    public final void A07() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        this.A06.removeCallbacks(this);
        if (A08[4].charAt(10) == 'o') {
            throw new RuntimeException();
        }
        A08[2] = "DBTzn4opHB64KJUt1kyQdTPFEm6jko5S";
        C3H.A0D(this.A06, this);
    }

    public final void A08() {
        this.A06.removeCallbacks(this);
        this.A01.abortAnimation();
    }

    public final void A09(int i, int i2) {
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A07();
    }

    public final void A0A(int i, int i2) {
        A06(i, i2, 0, 0);
    }

    public final void A0B(int i, int i2, int i3) {
        A0C(i, i2, i3, ED.A1A);
    }

    public final void A0C(int i, int i2, int i3, Interpolator interpolator) {
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.startScroll(0, 0, i, i2, i3);
        if (Build.VERSION.SDK_INT < 23) {
            OverScroller overScroller = this.A01;
            if (A08[7].length() != 26) {
                throw new RuntimeException();
            }
            A08[2] = "UeYo97OquvC2FnZv3LivDSVIricXCoYT";
            overScroller.computeScrollOffset();
        }
        A07();
    }

    public final void A0D(int i, int i2, Interpolator interpolator) {
        int A01 = A01(i, i2, 0, 0);
        if (interpolator == null) {
            interpolator = ED.A1A;
        }
        A0C(i, i2, A01, interpolator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e2, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r8.A0E() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        if (r8.A0F() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f0, code lost:
    
        r11 = r20.A06.A0s.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f8, code lost:
    
        if (r11 != 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fa, code lost:
    
        r8.A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02a6, code lost:
    
        if (r8.A07() < r11) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02a8, code lost:
    
        r8.A0A(r11 - 1);
        r8.A04(r5 - r1, r4 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02b6, code lost:
    
        r8.A04(r5 - r1, r4 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
    
        if (com.facebook.ads.redexgen.X.RunnableC02494t.A08[4].charAt(10) == 111) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
    
        com.facebook.ads.redexgen.X.RunnableC02494t.A08[3] = "TGS8taa2nLIFayhr7f7v";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02e3, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02ce, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017b, code lost:
    
        if (r14 != 2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017d, code lost:
    
        r20.A06.A1Z(r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
    
        if (r13 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0184, code lost:
    
        if (r1 == r7) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018a, code lost:
    
        if (r0.getFinalX() != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018c, code lost:
    
        if (r12 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018e, code lost:
    
        if (r0 == r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0194, code lost:
    
        if (r0.getFinalY() != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0196, code lost:
    
        r0.abortAnimation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x028c, code lost:
    
        if (r14 != 2) goto L56;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int[] iArr;
        boolean awakenScrollBars;
        boolean z;
        if (this.A06.A06 == null) {
            A08();
            if (A08[2].charAt(8) != 'G') {
                A08[3] = "wyRlewweBEsEMs9L1doa5ZD019uED4";
                return;
            }
        } else {
            A04();
            this.A06.A1J();
            OverScroller overScroller = this.A01;
            AbstractC02454p abstractC02454p = this.A06.A06.A02;
            if (overScroller.computeScrollOffset()) {
                iArr = this.A06.A16;
                int overscrollX = overScroller.getCurrX();
                int velY = overScroller.getCurrY();
                int vresult = overscrollX - this.A02;
                int velX = velY - this.A03;
                int i = 0;
                int dy = 0;
                this.A02 = overscrollX;
                this.A03 = velY;
                int i2 = 0;
                int i3 = 0;
                if (this.A06.A1z(vresult, velX, iArr, null, 1)) {
                    vresult -= iArr[0];
                    velX -= iArr[1];
                }
                if (this.A06.A04 != null) {
                    this.A06.A1K();
                    this.A06.A1L();
                    C01852e.A01(A02(0, 9, 96));
                    ED ed = this.A06;
                    ed.A1m(ed.A0s);
                    if (vresult != 0) {
                        i = this.A06.A06.A1h(vresult, this.A06.A0r, this.A06.A0s);
                        i2 = vresult - i;
                    }
                    if (velX != 0) {
                        dy = this.A06.A06.A1i(velX, this.A06.A0r, this.A06.A0s);
                        i3 = velX - dy;
                    }
                    C01852e.A00();
                    if (A08[4].charAt(10) != 111) {
                        A08[7] = "AEnMZuqp98GVRFTkSbmwbA51QL";
                        this.A06.A1P();
                        this.A06.A1M();
                        this.A06.A1s(false);
                    } else {
                        this.A06.A1P();
                        this.A06.A1M();
                        this.A06.A1s(false);
                    }
                }
                if (!this.A06.A0v.isEmpty()) {
                    this.A06.invalidate();
                }
                if (this.A06.getOverScrollMode() != 2) {
                    this.A06.A1a(vresult, velX);
                }
                int dx = i;
                int hresult = i2;
                if (!this.A06.A1y(dx, dy, hresult, i3, null, 1) && (i2 != 0 || i3 != 0)) {
                    int y = (int) overScroller.getCurrVelocity();
                    int dx2 = 0;
                    if (i2 != overscrollX) {
                        if (i2 < 0) {
                            dx2 = -y;
                        } else {
                            dx2 = i2 > 0 ? y : 0;
                        }
                    }
                    if (i3 != velY) {
                        if (i3 < 0) {
                            y = -y;
                        } else if (i3 <= 0) {
                            y = 0;
                        }
                    } else {
                        y = 0;
                    }
                    int dy2 = this.A06.getOverScrollMode();
                    String[] strArr = A08;
                    String str = strArr[5];
                    String str2 = strArr[1];
                    int charAt = str.charAt(12);
                    int hresult2 = str2.charAt(12);
                    if (charAt != hresult2) {
                        A08[7] = "VAPByUbSVbCRl876Iw5SK7wrPn";
                    }
                }
                if (i != 0 || dy != 0) {
                    ED ed2 = this.A06;
                    String[] strArr2 = A08;
                    if (strArr2[6].length() != strArr2[0].length()) {
                        ed2.A1c(i, dy);
                    } else {
                        String[] strArr3 = A08;
                        strArr3[6] = "bSHjdsVkhDQdmG1cm4T37Ejfm8kVFC";
                        strArr3[0] = "uWlM2d1CCrIfar3HOPPYeFU5881RH0";
                        ed2.A1c(i, dy);
                    }
                }
                awakenScrollBars = this.A06.awakenScrollBars();
                if (!awakenScrollBars) {
                    this.A06.invalidate();
                }
                int velY2 = ((vresult == 0 && velX == 0) || (vresult != 0 && this.A06.A06.A24() && i == vresult) || (velX != 0 && this.A06.A06.A25() && dy == velX)) ? 1 : 0;
                boolean fullyConsumedVertical = overScroller.isFinished();
                if (A08[4].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A08[2] = "98aPJs2vUpcbHQSYyxrV3zG03CSHn11I";
                if (fullyConsumedVertical || (velY2 == 0 && !this.A06.A1w(1))) {
                    this.A06.setScrollState(0);
                    z = ED.A1E;
                    if (z) {
                        this.A06.A02.A02();
                    }
                    this.A06.A1Y(1);
                } else {
                    A07();
                    if (this.A06.A03 != null) {
                        this.A06.A03.A0B(this.A06, vresult, velX);
                    }
                }
            }
            if (abstractC02454p != null) {
                boolean A0E = abstractC02454p.A0E();
                String[] strArr4 = A08;
                if (strArr4[5].charAt(12) != strArr4[1].charAt(12)) {
                    String[] strArr5 = A08;
                    strArr5[6] = "1QtdEsEbLTCaQSWKyl1hJXPObs6yvI";
                    strArr5[0] = "gIBnLdKBfiMzk6Ug2irxti7V3sW67K";
                    if (A0E) {
                        abstractC02454p.A04(0, 0);
                    }
                    if (!this.A05) {
                        abstractC02454p.A09();
                    }
                }
            }
            A05();
            return;
        }
        throw new RuntimeException();
    }
}
