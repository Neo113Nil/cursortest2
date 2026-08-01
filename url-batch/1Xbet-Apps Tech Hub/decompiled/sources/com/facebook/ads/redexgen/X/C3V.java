package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.3V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3V extends ViewGroup {
    public static byte[] A0u;
    public static String[] A0v = {"Pb5dMBpLoD8olSqqN3M1wt71s6WfJWWx", "mawes8eGWKEfT5kg0DwbKE", "yCX0UAcI", "nBGVAWTalDrx8Q3Q0HTp4hPpqgaJoZ5h", "", "", "gKpLqM1fc4CgqUT7jB7tIrf4xsKdVFyY", "wKHjR3FqXT8StRIGs0zAAfuJmbbhub4H"};
    public static final int[] A0w;
    public static final Interpolator A0x;
    public static final C3U A0y;
    public static final Comparator<C3N> A0z;
    public int A00;
    public AnonymousClass32 A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public C3Q A0Y;
    public C3Q A0Z;
    public C3R A0a;
    public C3S A0b;
    public ClassLoader A0c;
    public ArrayList<View> A0d;
    public List<ViewPager.OnAdapterChangeListener> A0e;
    public List<C3Q> A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final Rect A0q;
    public final C3N A0r;
    public final Runnable A0s;
    public final ArrayList<C3N> A0t;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C3N A03() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        int i = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = true;
        C3N c3n = null;
        int i2 = 0;
        while (i2 < this.A0t.size()) {
            C3N c3n2 = this.A0t.get(i2);
            if (!z && c3n2.A02 != i + 1) {
                c3n2 = this.A0r;
                c3n2.A00 = f2 + f3 + f;
                c3n2.A02 = i + 1;
                c3n2.A01 = this.A01.A04(c3n2.A02);
                i2--;
            }
            f2 = c3n2.A00;
            float f4 = c3n2.A01 + f2 + f;
            if (!z) {
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[3] = "VrUwTTzuyHD2SkMMCenWDHvarMqbXCCI";
                strArr2[6] = "LX2NnyEsDXWEx3dFbPH8p7fzI1U1dTZ8";
                if (scrollX < f2) {
                    return c3n;
                }
            }
            if (scrollX >= f4) {
                int size = this.A0t.size() - 1;
                String[] strArr3 = A0v;
                if (strArr3[3].charAt(15) != strArr3[6].charAt(15)) {
                    A0v[2] = "sbP3P6ChvdnfvWI";
                    if (i2 != size) {
                        z = false;
                        i = c3n2.A02;
                        f3 = c3n2.A01;
                        c3n = c3n2;
                        i2++;
                    }
                } else {
                    A0v[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    if (i2 != size) {
                        z = false;
                        i = c3n2.A02;
                        f3 = c3n2.A01;
                        c3n = c3n2;
                        i2++;
                    }
                }
            }
            return c3n2;
        }
        return c3n;
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0u, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0u = new byte[]{-99, -70, -69, -99, -62, -14, 3, 9, 7, Ascii.DC4, -62, 5, Ascii.SO, 3, Ascii.NAK, Ascii.NAK, -36, -62, -48, 0, 17, Ascii.ETB, Ascii.NAK, 34, -48, Ascii.EM, Ascii.DC4, -22, -48, -34, Ascii.SO, 48, 45, 32, 42, 35, 43, Ascii.US, 50, 39, 33, -34, Ascii.US, 34, Ascii.US, 46, 50, 35, 48, -8, -34, -30, 54, 49, 49, -30, 53, 47, 35, 46, 46, -3, -30, 38, 39, 40, 35, 55, 46, 54, 43, 48, 41, -30, 54, 49, -30, -66, -78, -8, 1, 7, 0, -10, -52, -78, -69, -39, -26, -26, -25, -20, -104, -39, -36, -36, -104, -24, -39, -33, -35, -22, -104, -36, -35, -37, -25, -22, -104, -18, -31, -35, -17, -104, -36, -19, -22, -31, -26, -33, -104, -28, -39, -15, -25, -19, -20, -10, 9, Ascii.NAK, Ascii.EM, 9, Ascii.ETB, Ascii.CAN, 9, 8, -60, 19, 10, 10, Ascii.ETB, 7, Ascii.SYN, 9, 9, Ascii.DC2, -60, Ascii.DC4, 5, Ascii.VT, 9, -60, 16, Ascii.CR, 17, Ascii.CR, Ascii.CAN, -60, -10, 10, 7, -62, 3, Ascii.DC2, Ascii.DC2, Ascii.SO, Ascii.VT, 5, 3, Ascii.SYN, Ascii.VT, 17, 16, -55, Ascii.NAK, -62, -14, 3, 9, 7, Ascii.DC4, -29, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -62, 5, 10, 3, 16, 9, 7, 6, -62, Ascii.SYN, 10, 7, -62, 3, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -55, Ascii.NAK, -62, 5, 17, 16, Ascii.SYN, 7, 16, Ascii.SYN, Ascii.NAK, -62, Ascii.EM, Ascii.VT, Ascii.SYN, 10, 17, Ascii.ETB, Ascii.SYN, -62, 5, 3, Ascii.SO, Ascii.SO, Ascii.VT, 16, 9, -62, -14, 3, 9, 7, Ascii.DC4, -29, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -59, 16, 17, Ascii.SYN, Ascii.VT, 8, Ascii.ESC, -26, 3, Ascii.SYN, 3, -11, 7, Ascii.SYN, -27, 10, 3, 16, 9, 7, 6, -61, -62, -25, Ascii.SUB, Ascii.DC2, 7, 5, Ascii.SYN, 7, 6, -62, 3, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -62, Ascii.VT, Ascii.SYN, 7, Ascii.SI, -62, 5, 17, Ascii.ETB, 16, Ascii.SYN, -36, -62, -19, 0, -4, Ascii.SO, -25, -8, -2, -4, 9, Ascii.EM, 42, 42, 39, 47, Ascii.VT, Ascii.ESC, 42, 39, 36, 36, -40, 44, 42, 33, Ascii.GS, Ascii.FS, -40, 44, 39, -40, Ascii.RS, 33, 38, Ascii.FS, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, -40, Ascii.SUB, Ascii.EM, 43, Ascii.GS, Ascii.FS, -40, 39, 38, -40, 38, 39, 38, -27, Ascii.ESC, 32, 33, 36, Ascii.FS, -40, Ascii.ESC, 45, 42, 42, Ascii.GS, 38, 44, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, Ascii.GS, Ascii.FS, -40, 46, 33, Ascii.GS, 47, -40, 76, 75, Ascii.RS, 65, 62, 77, 81, 66, 79, 32, 69, 62, 75, 68, 66, 65, 19, Ascii.DC2, -12, 5, Ascii.VT, 9, -9, 7, Ascii.SYN, 19, 16, 16, 9, 8, -60, 8, Ascii.CR, 8, -60, Ascii.DC2, 19, Ascii.CAN, -60, 7, 5, 16, 16, -60, Ascii.ETB, Ascii.EM, Ascii.DC4, 9, Ascii.SYN, 7, 16, 5, Ascii.ETB, Ascii.ETB, -60, Ascii.CR, 17, Ascii.DC4, 16, 9, 17, 9, Ascii.DC2, Ascii.CAN, 5, Ascii.CAN, Ascii.CR, 19, Ascii.DC2, 85, 83, 66, 79, 84, 71, 80, 83, 78, 49, 66, 72, 70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final void A0G(int i) {
        String hexString;
        C3N c3n;
        float f;
        C3N c3n2 = null;
        int i2 = this.A00;
        if (i2 != i) {
            c3n2 = A04(i2);
            this.A00 = i;
        }
        if (this.A01 == null) {
            A0B();
            return;
        }
        if (this.A0o) {
            A0B();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.A0L;
        int max = Math.max(0, this.A00 - i3);
        int A05 = this.A01.A05();
        int min = Math.min(A05 - 1, this.A00 + i3);
        if (A05 != this.A0G) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
                if (A0v[2].length() != 14) {
                    A0v[2] = "3cJ8G";
                }
            }
            throw new IllegalStateException(A08(158, Opcodes.D2I, 58) + this.A0G + A08(77, 9, 42) + A05 + A08(18, 11, 72) + hexString + A08(4, 14, 58) + getClass() + A08(29, 22, 86) + this.A01.getClass());
        }
        C3N c3n3 = null;
        if (A0v[2].length() != 14) {
            A0v[1] = "Tot0RAE";
            int i4 = 0;
            while (true) {
                if (i4 >= this.A0t.size()) {
                    break;
                }
                C3N c3n4 = this.A0t.get(i4);
                if (c3n4.A02 < this.A00) {
                    i4++;
                } else if (c3n4.A02 == this.A00) {
                    c3n3 = c3n4;
                }
            }
            if (c3n3 == null && A05 > 0) {
                int i5 = this.A00;
                if (A0v[1].length() != 12) {
                    A0v[2] = "0";
                    c3n3 = A05(i5, i4);
                } else {
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    c3n3 = A05(i5, i4);
                }
            }
            if (c3n3 != null) {
                float f2 = 0.0f;
                int i6 = i4 - 1;
                if (i6 >= 0) {
                    C3N c3n5 = this.A0t.get(i6);
                    String[] strArr2 = A0v;
                    if (strArr2[3].charAt(15) != strArr2[6].charAt(15)) {
                        A0v[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                        c3n = c3n5;
                    }
                } else {
                    c3n = null;
                }
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c3n3.A01) + (getPaddingLeft() / clientWidth);
                for (int i7 = this.A00 - 1; i7 >= 0; i7--) {
                    if (f2 >= paddingLeft && i7 < max) {
                        if (c3n == null) {
                            break;
                        }
                        if (i7 == c3n.A02 && !c3n.A04) {
                            this.A0t.remove(i6);
                            this.A01.A0B(this, i7, c3n.A03);
                            i6--;
                            i4--;
                            c3n = i6 >= 0 ? this.A0t.get(i6) : null;
                        }
                    } else if (c3n == null || i7 != c3n.A02) {
                        f2 += A05(i7, i6 + 1).A01;
                        i4++;
                        c3n = i6 >= 0 ? this.A0t.get(i6) : null;
                    } else {
                        f2 += c3n.A01;
                        String[] strArr3 = A0v;
                        if (strArr3[7].charAt(10) == strArr3[0].charAt(10)) {
                            String[] strArr4 = A0v;
                            strArr4[4] = "";
                            strArr4[5] = "";
                            i6--;
                            c3n = i6 >= 0 ? this.A0t.get(i6) : null;
                        }
                    }
                }
                float f3 = c3n3.A01;
                int i8 = i4 + 1;
                if (f3 < 2.0f) {
                    C3N c3n6 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                    if (clientWidth <= 0) {
                        f = 0.0f;
                    } else {
                        float paddingRight = getPaddingRight();
                        float f4 = clientWidth;
                        String[] strArr5 = A0v;
                        if (strArr5[4].length() != strArr5[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr6 = A0v;
                        strArr6[4] = "";
                        strArr6[5] = "";
                        f = (paddingRight / f4) + 2.0f;
                    }
                    for (int i9 = this.A00 + 1; i9 < A05; i9++) {
                        if (f3 >= f && i9 > min) {
                            if (c3n6 == null) {
                                break;
                            }
                            if (i9 == c3n6.A02 && !c3n6.A04) {
                                this.A0t.remove(i8);
                                this.A01.A0B(this, i9, c3n6.A03);
                                c3n6 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                            }
                        } else if (c3n6 == null || i9 != c3n6.A02) {
                            C3N A052 = A05(i9, i8);
                            i8++;
                            f3 += A052.A01;
                            c3n6 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                        } else {
                            f3 += c3n6.A01;
                            i8++;
                            c3n6 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                        }
                    }
                }
                A0Q(c3n3, i4, c3n2);
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                C3O c3o = (C3O) childAt.getLayoutParams();
                c3o.A01 = i10;
                if (!c3o.A05 && c3o.A00 == 0.0f) {
                    C3N A07 = A07(childAt);
                    String[] strArr7 = A0v;
                    if (strArr7[7].charAt(10) != strArr7[0].charAt(10)) {
                        if (A07 == null) {
                        }
                        c3o.A00 = A07.A01;
                        c3o.A02 = A07.A02;
                    } else {
                        A0v[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                        if (A07 == null) {
                        }
                        c3o.A00 = A07.A01;
                        c3o.A02 = A07.A02;
                    }
                }
            }
            A0B();
            String[] strArr8 = A0v;
            if (strArr8[4].length() != strArr8[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr9 = A0v;
            strArr9[7] = "fAvJTe45YQ8jwRLJzle6w88GhXZAW5fe";
            strArr9[0] = "XHTmtVqtTM8ykl9XiQ4ZuPNQzfhQsr72";
            if (hasFocus()) {
                View findFocus = findFocus();
                String[] strArr10 = A0v;
                if (strArr10[3].charAt(15) == strArr10[6].charAt(15)) {
                    throw new RuntimeException();
                }
                String[] strArr11 = A0v;
                strArr11[3] = "98nQxxcA6vj5924MyChW7mkeiNJnWKv2";
                strArr11[6] = "ju5RZqhAYuaQhiOPGNIJcLOaoEeV3OP8";
                C3N A06 = findFocus != null ? A06(findFocus) : null;
                if (A06 == null || A06.A02 != this.A00) {
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        View childAt2 = getChildAt(i11);
                        C3N A072 = A07(childAt2);
                        if (A072 != null && A072.A02 == this.A00 && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0J(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.A0X;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.A0l ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float A00 = i6 + (i6 * A00(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth)));
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            float f = A00 / abs2;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[4] = "";
            strArr[5] = "";
            abs = Math.round(Math.abs(f) * 1000.0f) * 4;
        } else {
            abs = (int) ((1.0f + (Math.abs(i4) / (this.A0M + (clientWidth * this.A01.A04(this.A00))))) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.A0l = false;
        this.A0X.startScroll(scrollX, scrollY, i4, i5, min);
        C3H.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C3N A07;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A07 = A07(childAt)) != null && A07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C3O c3o;
        int i3;
        int i4;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.A0I = Math.min(measuredWidth / 10, this.A0E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                this.A0B = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
                this.A0A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                this.A0j = true;
                A0f();
                this.A0j = false;
                int childCount2 = getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && ((c3o = (C3O) childAt.getLayoutParams()) == null || !c3o.A05)) {
                        float f = paddingLeft;
                        String[] strArr = A0v;
                        if (strArr[4].length() == strArr[5].length()) {
                            A0v[1] = "11cm9STM7FlxGR3";
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c3o.A00), 1073741824), this.A0A);
                        }
                    }
                }
                return;
            }
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                C3O c3o2 = (C3O) childAt2.getLayoutParams();
                if (A0v[1].length() == 12) {
                    break;
                }
                String[] strArr2 = A0v;
                strArr2[4] = "";
                strArr2[5] = "";
                if (c3o2 != null && c3o2.A05) {
                    int i7 = c3o2.A04 & 7;
                    int i8 = c3o2.A04 & 112;
                    int i9 = Integer.MIN_VALUE;
                    int i10 = Integer.MIN_VALUE;
                    boolean z = i8 == 48 || i8 == 80;
                    boolean z2 = i7 == 3 || i7 == 5;
                    if (z) {
                        i9 = 1073741824;
                    } else if (z2) {
                        i10 = 1073741824;
                    }
                    if (c3o2.width != -2) {
                        i9 = 1073741824;
                        i3 = c3o2.width != -1 ? c3o2.width : paddingLeft;
                    } else {
                        i3 = paddingLeft;
                    }
                    if (c3o2.height != -2) {
                        i10 = 1073741824;
                        if (c3o2.height != -1) {
                            i4 = c3o2.height;
                            if (A0v[1].length() != 12) {
                                A0v[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                            }
                        } else {
                            i4 = measuredHeight;
                        }
                    } else {
                        i4 = measuredHeight;
                    }
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i3, i9), View.MeasureSpec.makeMeasureSpec(i4, i10));
                    if (z) {
                        measuredHeight -= childAt2.getMeasuredHeight();
                    } else if (z2) {
                        paddingLeft -= childAt2.getMeasuredWidth();
                    }
                }
            }
            i5++;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass32 anonymousClass32;
        if (this.A0h) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (anonymousClass32 = this.A01) == null || anonymousClass32.A05() == 0) {
            return false;
        }
        if (this.A0U == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        boolean z = false;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.A0X.abortAnimation();
                this.A0o = false;
                A0f();
                float x = motionEvent.getX();
                this.A03 = x;
                this.A05 = x;
                float y = motionEvent.getY();
                this.A04 = y;
                this.A06 = y;
                this.A08 = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.A0k) {
                    VelocityTracker velocityTracker = this.A0U;
                    velocityTracker.computeCurrentVelocity(1000, this.A0J);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
                    this.A0o = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C3N A03 = A03();
                    A0O(A01(A03.A02, ((scrollX / clientWidth) - A03.A00) / (A03.A01 + (this.A0M / clientWidth)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.A08)) - this.A03)), true, true, xVelocity);
                    z = A0U();
                    break;
                }
                break;
            case 2:
                if (!this.A0k) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.A08);
                    if (findPointerIndex == -1) {
                        z = A0U();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.A05);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.A06);
                        if (abs > this.A0R && abs > abs2) {
                            this.A0k = true;
                            A0T(true);
                            float f = this.A03;
                            this.A05 = x2 - f > 0.0f ? f + this.A0R : f - this.A0R;
                            this.A06 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.A0k) {
                    z = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                    break;
                }
                break;
            case 3:
                if (this.A0k) {
                    A0M(this.A00, true, 0, false);
                    z = A0U();
                    break;
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.A05 = motionEvent.getX(actionIndex);
                this.A08 = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                A0P(motionEvent);
                this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                break;
        }
        if (z) {
            C3H.A07(this);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3U] */
    static {
        A0C();
        A0w = new int[]{R.attr.layout_gravity};
        A0z = new Comparator<C3N>() { // from class: com.facebook.ads.redexgen.X.3J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C3N c3n, C3N c3n2) {
                return c3n.A02 - c3n2.A02;
            }
        };
        A0x = new Interpolator() { // from class: com.facebook.ads.redexgen.X.3K
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        A0y = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.3U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(View view, View view2) {
                C3O c3o = (C3O) view.getLayoutParams();
                C3O c3o2 = (C3O) view2.getLayoutParams();
                if (c3o.A05 != c3o2.A05) {
                    return c3o.A05 ? 1 : -1;
                }
                return c3o.A02 - c3o2.A02;
            }
        };
    }

    public C3V(Context context) {
        super(context);
        this.A0t = new ArrayList<>();
        this.A0r = new C3N();
        this.A0q = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0c = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0i = true;
        this.A0n = false;
        this.A0s = new Runnable() { // from class: com.facebook.ads.redexgen.X.3L
            @Override // java.lang.Runnable
            public final void run() {
                C3V.this.setScrollState(0);
                C3V.this.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.A0H && Math.abs(i2) > this.A0K) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i >= targetPage ? 0.4f : 0.6f;
            i = ((int) (f + truncator)) + i;
        }
        int targetPage2 = this.A0t.size();
        if (targetPage2 > 0) {
            C3N lastItem = this.A0t.get(0);
            ArrayList<C3N> arrayList = this.A0t;
            int targetPage3 = arrayList.size();
            C3N c3n = arrayList.get(targetPage3 - 1);
            int i4 = lastItem.A02;
            int targetPage4 = c3n.A02;
            return Math.max(i4, Math.min(i, targetPage4));
        }
        return i;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C3N A04(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            C3N ii = this.A0t.get(i2);
            int i3 = ii.A02;
            if (i3 == i) {
                return ii;
            }
        }
        return null;
    }

    private final C3N A05(int i, int i2) {
        C3N c3n = new C3N();
        c3n.A02 = i;
        c3n.A03 = this.A01.A08(this, i);
        c3n.A01 = this.A01.A04(i);
        if (i2 < 0 || i2 >= this.A0t.size()) {
            this.A0t.add(c3n);
        } else {
            this.A0t.add(i2, c3n);
        }
        return c3n;
    }

    private final C3N A06(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C3N A07(View view) {
        for (int i = 0; i < i; i++) {
            C3N c3n = this.A0t.get(i);
            if (this.A01.A0C(view, c3n.A03)) {
                return c3n;
            }
        }
        String[] strArr = A0v;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0v[1] = "T6ty";
        return null;
    }

    private void A09() {
        this.A0k = false;
        this.A0m = false;
        VelocityTracker velocityTracker = this.A0U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            this.A0U = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0A() {
        int i = 0;
        while (i < i) {
            if (!((C3O) getChildAt(i).getLayoutParams()).A05) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void A0B() {
        if (this.A0F != 0) {
            ArrayList<View> arrayList = this.A0d;
            if (arrayList == null) {
                this.A0d = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0d.add(getChildAt(i));
            }
            Collections.sort(this.A0d, A0y);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0x);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        C3H.A0B(this, new ZN(this));
        if (C3H.A00(this) == 0) {
            C3H.A09(this, 1);
        }
        C3H.A0C(this, new ZO(this));
    }

    private void A0E(int i) {
        C3Q c3q = this.A0Z;
        List<C3Q> list = this.A0f;
        if (list != null) {
            int i2 = list.size();
            for (int i3 = 0; i3 < i2; i3++) {
                this.A0f.get(i3);
            }
        }
        C3Q c3q2 = this.A0Y;
    }

    private void A0F(int i) {
        C3Q c3q = this.A0Z;
        List<C3Q> list = this.A0f;
        if (list != null) {
            int i2 = list.size();
            for (int i3 = 0; i3 < i2; i3++) {
                this.A0f.get(i3);
            }
        }
        C3Q c3q2 = this.A0Y;
    }

    private void A0H(int i, float f, int i2) {
        C3Q c3q = this.A0Z;
        List<C3Q> list = this.A0f;
        if (list != null) {
            int i3 = list.size();
            for (int i4 = 0; i4 < i3; i4++) {
                this.A0f.get(i4);
            }
        }
        C3Q c3q2 = this.A0Y;
    }

    private final void A0I(int childLeft, float f, int i) {
        int paddingLeft;
        if (this.A0D > 0) {
            int hgrav = getScrollX();
            int i2 = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingLeft2 = A0v[1].length();
            if (paddingLeft2 == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "hSwONVQ9BwzgmNPK4tziO3X6uj4eQvsQ";
            strArr[6] = "gKhZoL4mhYlFRC9fFMXnjqdiW6EOuKfZ";
            int width = getWidth();
            int childCount = getChildCount();
            for (int width2 = 0; width2 < childCount; width2++) {
                View childAt = getChildAt(width2);
                C3O c3o = (C3O) childAt.getLayoutParams();
                if (c3o.A05) {
                    int scrollX = c3o.A04;
                    switch (scrollX & 7) {
                        case 1:
                            int scrollX2 = childAt.getMeasuredWidth();
                            paddingLeft = Math.max((width - scrollX2) / 2, i2);
                            break;
                        case 2:
                        case 4:
                        default:
                            paddingLeft = i2;
                            break;
                        case 3:
                            paddingLeft = i2;
                            int scrollX3 = childAt.getWidth();
                            i2 += scrollX3;
                            break;
                        case 5:
                            int paddingLeft3 = width - paddingRight;
                            int scrollX4 = childAt.getMeasuredWidth();
                            paddingLeft = paddingLeft3 - scrollX4;
                            int scrollX5 = childAt.getMeasuredWidth();
                            paddingRight += scrollX5;
                            break;
                    }
                    int scrollX6 = childAt.getLeft();
                    int paddingLeft4 = (paddingLeft + hgrav) - scrollX6;
                    if (paddingLeft4 != 0) {
                        childAt.offsetLeftAndRight(paddingLeft4);
                    }
                }
            }
        }
        A0H(childLeft, f, i);
        if (this.A0a != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = getChildAt(i3);
                if (!((C3O) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 121));
                }
            }
        }
        this.A0g = true;
    }

    private void A0K(int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            ArrayList<C3N> arrayList = this.A0t;
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            if (!arrayList.isEmpty()) {
                boolean isFinished = this.A0X.isFinished();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                if (!isFinished) {
                    this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                    return;
                }
                int paddingLeft = ((i - getPaddingLeft()) - getPaddingRight()) + i3;
                int widthWithMargin = getPaddingLeft();
                int i5 = i2 - widthWithMargin;
                int widthWithMargin2 = getPaddingRight();
                int i6 = (i5 - widthWithMargin2) + i4;
                int widthWithMargin3 = getScrollX();
                int oldWidthWithMargin = (int) (paddingLeft * (widthWithMargin3 / i6));
                int widthWithMargin4 = getScrollY();
                scrollTo(oldWidthWithMargin, widthWithMargin4);
                return;
            }
        }
        C3N ii = A04(this.A00);
        float scrollOffset = ii != null ? Math.min(ii.A00, this.A07) : 0.0f;
        int paddingLeft2 = (int) (((i - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft2 != getScrollX()) {
            A0R(false);
            scrollTo(paddingLeft2, getScrollY());
        }
    }

    private final void A0L(int i, boolean z) {
        this.A0o = false;
        A0N(i, z, false);
    }

    private void A0M(int i, boolean z, int i2, boolean z2) {
        C3N A04 = A04(i);
        int i3 = 0;
        if (A04 != null) {
            i3 = (int) (getClientWidth() * Math.max(this.A02, Math.min(A04.A00, this.A07)));
        }
        int destX = A0v[2].length();
        if (destX == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[3] = "qWyJthdIKprwmupmlWytZXkwKuTz6nwm";
        strArr[6] = "fDmSwMvEmt93O90vXMKXMmFP8biUMO95";
        if (z) {
            A0J(i3, 0, i2);
            if (z2) {
                A0E(i);
                return;
            }
            return;
        }
        if (z2) {
            A0E(i);
        }
        A0R(false);
        scrollTo(i3, 0);
        A0Z(i3);
    }

    private final void A0N(int i, boolean z, boolean z2) {
        A0O(i, z, z2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r7 < r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0O(int i, boolean z, boolean z2, int i2) {
        AnonymousClass32 anonymousClass32 = this.A01;
        if (anonymousClass32 == null || anonymousClass32.A05() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.A00 == i && this.A0t.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.A01.A05()) {
            i = this.A01.A05() - 1;
        }
        int i3 = this.A0L;
        int i4 = this.A00;
        if (i <= i4 + i3) {
            int i5 = i4 - i3;
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[3] = "HdD8kb8A1NTv0LjA3C8pNf8B8Uhf5Rjf";
            strArr2[6] = "hEPxY7plOgAB5ujpSYVhyDABeqG0KedF";
        }
        for (int i6 = 0; i6 < this.A0t.size(); i6++) {
            this.A0t.get(i6).A04 = true;
        }
        boolean z3 = this.A00 != i;
        boolean dispatchSelected = this.A0i;
        if (dispatchSelected) {
            this.A00 = i;
            if (z3) {
                A0E(i);
            }
            requestLayout();
            return;
        }
        A0G(i);
        A0M(i, z, i2, z3);
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId == pointerIndex) {
            int i = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i);
            String[] strArr = A0v;
            String str = strArr[4];
            String str2 = strArr[5];
            int pointerId2 = str.length();
            int pointerIndex2 = str2.length();
            if (pointerId2 != pointerIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[4] = "";
            strArr2[5] = "";
            int pointerIndex3 = motionEvent.getPointerId(i);
            this.A08 = pointerIndex3;
            VelocityTracker velocityTracker = this.A0U;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0051 */
    /* JADX WARN: Incorrect condition in loop: B:38:0x0095 */
    /* JADX WARN: Incorrect condition in loop: B:72:0x011f */
    /* JADX WARN: Incorrect condition in loop: B:86:0x015e */
    /* JADX WARN: Incorrect condition in loop: B:9:0x0024 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0Q(C3N c3n, int i, C3N c3n2) {
        float offset;
        float f;
        C3N c3n3;
        C3N c3n4;
        int A05 = this.A01.A05();
        int width = getClientWidth();
        if (width > 0) {
            int N = this.A0M;
            offset = N / width;
        } else {
            offset = 0.0f;
        }
        if (c3n2 != null) {
            int width2 = c3n2.A02;
            int N2 = c3n.A02;
            if (width2 < N2) {
                int i2 = 0;
                float f2 = c3n2.A00 + c3n2.A01 + offset;
                int i3 = width2 + 1;
                while (i3 <= N) {
                    int N3 = this.A0t.size();
                    if (i2 >= N3) {
                        break;
                    }
                    C3N c3n5 = this.A0t.get(i2);
                    while (true) {
                        c3n4 = c3n5;
                        int N4 = c3n4.A02;
                        if (i3 <= N4) {
                            break;
                        }
                        int N5 = this.A0t.size();
                        if (i2 >= N5 - 1) {
                            break;
                        }
                        i2++;
                        c3n5 = this.A0t.get(i2);
                    }
                    while (i3 < N) {
                        AnonymousClass32 anonymousClass32 = this.A01;
                        if (A0v[2].length() == 14) {
                            throw new RuntimeException();
                        }
                        A0v[2] = "unjnr1JPHveRA3A";
                        f2 += anonymousClass32.A04(i3) + offset;
                        i3++;
                    }
                    c3n4.A00 = f2;
                    f2 += c3n4.A01 + offset;
                    i3++;
                }
            } else {
                int N6 = c3n.A02;
                if (width2 > N6) {
                    int N7 = this.A0t.size();
                    int i4 = N7 - 1;
                    float f3 = c3n2.A00;
                    int i5 = width2 - 1;
                    while (i5 >= N && i4 >= 0) {
                        C3N c3n6 = this.A0t.get(i4);
                        while (true) {
                            c3n3 = c3n6;
                            int N8 = c3n3.A02;
                            if (i5 >= N8 || i4 <= 0) {
                                break;
                            }
                            i4--;
                            c3n6 = this.A0t.get(i4);
                        }
                        while (true) {
                            int i6 = c3n3.A02;
                            String[] strArr = A0v;
                            String str = strArr[4];
                            String str2 = strArr[5];
                            int width3 = str.length();
                            int N9 = str2.length();
                            if (width3 != N9) {
                                A0v[1] = "tUoZSKhLB59JJ";
                                if (i5 > i6) {
                                    f3 -= this.A01.A04(i5) + offset;
                                    i5--;
                                }
                            } else {
                                A0v[2] = "eK1wjFwqyv9CJUk";
                                if (i5 > i6) {
                                    f3 -= this.A01.A04(i5) + offset;
                                    i5--;
                                }
                            }
                        }
                        f3 -= c3n3.A01 + offset;
                        c3n3.A00 = f3;
                        i5--;
                    }
                }
            }
        }
        int i7 = this.A0t.size();
        float offset2 = c3n.A00;
        int N10 = c3n.A02;
        int pos = N10 - 1;
        int N11 = c3n.A02;
        this.A02 = N11 == 0 ? c3n.A00 : -3.4028235E38f;
        int N12 = A05 - 1;
        if (c3n.A02 == N12) {
            f = (c3n.A00 + c3n.A01) - 1.0f;
        } else {
            f = Float.MAX_VALUE;
        }
        this.A07 = f;
        int itemCount = i - 1;
        while (itemCount >= 0) {
            C3N c3n7 = this.A0t.get(itemCount);
            while (pos > N) {
                offset2 -= this.A01.A04(pos) + offset;
                pos--;
            }
            offset2 -= c3n7.A01 + offset;
            c3n7.A00 = offset2;
            int N13 = c3n7.A02;
            if (N13 == 0) {
                this.A02 = offset2;
            }
            itemCount--;
            pos--;
        }
        float f4 = c3n.A00 + c3n.A01 + offset;
        int N14 = c3n.A02;
        int i8 = N14 + 1;
        int i9 = i + 1;
        while (i9 < i7) {
            C3N c3n8 = this.A0t.get(i9);
            while (i8 < N) {
                f4 += this.A01.A04(i8) + offset;
                i8++;
            }
            int i10 = c3n8.A02;
            if (A0v[2].length() != 14) {
                String[] strArr2 = A0v;
                strArr2[3] = "LKMrFShf3NXE5XfaxsCGHUW3hns0S8Wh";
                strArr2[6] = "xptjAJKkekqR5TDnJjimQZvUd22mQJJ9";
                int N15 = A05 - 1;
                if (i10 != N15) {
                    c3n8.A00 = f4;
                    f4 += c3n8.A01 + offset;
                    i9++;
                    i8++;
                }
                this.A07 = (c3n8.A01 + f4) - 1.0f;
                c3n8.A00 = f4;
                f4 += c3n8.A01 + offset;
                i9++;
                i8++;
            } else {
                int N16 = A05 - 1;
                if (i10 != N16) {
                    c3n8.A00 = f4;
                    f4 += c3n8.A01 + offset;
                    i9++;
                    i8++;
                }
                this.A07 = (c3n8.A01 + f4) - 1.0f;
                c3n8.A00 = f4;
                f4 += c3n8.A01 + offset;
                i9++;
                i8++;
            }
        }
        this.A0n = false;
    }

    private void A0R(boolean z) {
        boolean z2 = this.A0P == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            if (!needPopulate) {
                this.A0X.abortAnimation();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "La7";
                int scrollX = getScrollX();
                int oldX = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (scrollX != currX || oldX != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0o = false;
        for (int i = 0; i < this.A0t.size(); i++) {
            C3N c3n = this.A0t.get(i);
            boolean needPopulate2 = c3n.A04;
            if (needPopulate2) {
                z2 = true;
                c3n.A04 = false;
            }
        }
        if (z2) {
            if (z) {
                C3H.A0D(this, this.A0s);
            } else {
                this.A0s.run();
            }
        }
    }

    private void A0S(boolean z) {
        int layerType;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (z) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i).setLayerType(layerType, null);
        }
    }

    private void A0T(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        int i = this.A00;
        if (i > 0) {
            A0L(i - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        AnonymousClass32 anonymousClass32 = this.A01;
        if (anonymousClass32 != null && this.A00 < anonymousClass32.A05() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        }
        if (A0v[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[7] = "AXA5EDUbYu85ntxkUdYhY3hIIlQIUQar";
        strArr[0] = "7HhQN1X94o8BEMOAnE9vO9t08zapWTmy";
        return false;
    }

    private boolean A0X(float f) {
        boolean z = false;
        float f2 = this.A05 - f;
        this.A05 = f;
        float scrollX = getScrollX() + f2;
        int clientWidth = getClientWidth();
        float oldScrollX = clientWidth;
        float oldScrollX2 = oldScrollX * this.A02;
        float leftBound = clientWidth;
        float leftBound2 = leftBound * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        C3N c3n = this.A0t.get(0);
        C3N c3n2 = this.A0t.get(r1.size() - 1);
        if (c3n.A02 != 0) {
            rightAbsolute = false;
            float oldScrollX3 = c3n.A00;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            A0v[1] = "a";
            oldScrollX2 = oldScrollX3 * clientWidth;
        }
        if (c3n2.A02 != this.A01.A05() - 1) {
            leftAbsolute = false;
            float leftBound3 = c3n2.A00;
            leftBound2 = leftBound3 * clientWidth;
        }
        if (scrollX < oldScrollX2) {
            if (rightAbsolute) {
                this.A0V.onPull(Math.abs(oldScrollX2 - scrollX) / clientWidth);
                z = true;
            }
            scrollX = oldScrollX2;
        } else if (scrollX > leftBound2) {
            if (leftAbsolute) {
                EdgeEffect edgeEffect = this.A0W;
                float oldScrollX4 = Math.abs(scrollX - leftBound2);
                float deltaX = clientWidth;
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    edgeEffect.onPull(oldScrollX4 / deltaX);
                    z = true;
                } else {
                    A0v[1] = "TwKB2lBmR";
                    edgeEffect.onPull(oldScrollX4 / deltaX);
                    z = true;
                }
            }
            scrollX = leftBound2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z;
    }

    private final boolean A0Y(float f, float f2) {
        if (f >= this.A0I || f2 <= 0.0f) {
            if (f > getWidth() - this.A0I) {
                if (A0v[2].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0v;
                strArr[3] = "LoLbwLodEQ0RZhoADzk4YxqyeMxGbPNe";
                strArr[6] = "uXFtlpuRRgamX4n9Zkql1HjWorEkSQ7b";
                if (f2 < 0.0f) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean A0Z(int i) {
        int size = this.A0t.size();
        String A08 = A08(397, 53, 60);
        if (size == 0) {
            if (this.A0i) {
                return false;
            }
            this.A0g = false;
            A0I(0, 0.0f, 0);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0v[2] = "c3ramapljB1reDSufYjA";
            if (this.A0g) {
                return false;
            }
            throw new IllegalStateException(A08);
        }
        C3N A03 = A03();
        int currentPage = getClientWidth();
        int i2 = this.A0M;
        int i3 = A03.A02;
        float f = ((i / currentPage) - A03.A00) / (A03.A01 + (i2 / currentPage));
        this.A0g = false;
        A0I(i3, f, (int) ((currentPage + i2) * f));
        if (this.A0g) {
            return true;
        }
        throw new IllegalStateException(A08);
    }

    private final boolean A0a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            boolean z = false;
            ViewParent parent = findFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(A08(0, 4, 21)).append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, 9, 47), A08(309, 72, 80) + sb.toString());
                findFocus = null;
            }
        }
        boolean z2 = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (nextFocused != null && nextFocused != findFocus) {
            if (i == 17) {
                z2 = (findFocus == null || A02(this.A0q, nextFocused).left < A02(this.A0q, findFocus).left) ? nextFocused.requestFocus() : A0V();
            } else if (i == 66) {
                z2 = (findFocus == null || A02(this.A0q, nextFocused).left > A02(this.A0q, findFocus).left) ? nextFocused.requestFocus() : A0W();
            }
        } else if (i == 17 || i == 1) {
            z2 = A0V();
        } else if (i == 66 || i == 2) {
            z2 = A0W();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                boolean handled = keyEvent.hasModifiers(2);
                if (handled) {
                    return A0V();
                }
                return A0a(17);
            case 22:
                boolean hasModifiers = keyEvent.hasModifiers(2);
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0v[1] = "lC1XoLB2bpdljamdt6Vm";
                if (hasModifiers) {
                    return A0W();
                }
                return A0a(66);
            case 61:
                boolean handled2 = keyEvent.hasNoModifiers();
                if (handled2) {
                    return A0a(2);
                }
                boolean handled3 = keyEvent.hasModifiers(1);
                if (!handled3) {
                    return false;
                }
                return A0a(1);
            default:
                return false;
        }
    }

    public static boolean A0c(View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i4 = view.getScrollX();
            int count = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + i4 >= childAt.getLeft() && i2 + i4 < childAt.getRight() && i3 + count >= childAt.getTop() && i3 + count < childAt.getBottom()) {
                    int left = (i2 + i4) - childAt.getLeft();
                    int i5 = i3 + count;
                    if (A0v[1].length() == 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (A0d(childAt, true, i, left, i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x002a */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0e() {
        boolean z;
        int newCurrItem;
        int adapterCount;
        int A05 = this.A01.A05();
        this.A0G = A05;
        int size = this.A0t.size();
        int adapterCount2 = this.A0L;
        if (size < (adapterCount2 * 2) + 1) {
            int adapterCount3 = this.A0t.size();
            if (adapterCount3 < A05) {
                z = true;
                int i = this.A00;
                boolean z2 = false;
                newCurrItem = 0;
                while (newCurrItem < adapterCount) {
                    C3N c3n = this.A0t.get(newCurrItem);
                    int A06 = this.A01.A06(c3n.A03);
                    if (A06 != -1) {
                        if (A06 == -2) {
                            this.A0t.remove(newCurrItem);
                            newCurrItem--;
                            if (!z2) {
                                z2 = true;
                            }
                            this.A01.A0B(this, c3n.A02, c3n.A03);
                            z = true;
                            int i2 = this.A00;
                            int adapterCount4 = c3n.A02;
                            if (i2 == adapterCount4) {
                                int adapterCount5 = A05 - 1;
                                i = Math.max(0, Math.min(this.A00, adapterCount5));
                                z = true;
                            }
                        } else {
                            int adapterCount6 = c3n.A02;
                            if (adapterCount6 != A06) {
                                int i3 = c3n.A02;
                                int adapterCount7 = this.A00;
                                if (i3 == adapterCount7) {
                                    i = A06;
                                }
                                c3n.A02 = A06;
                                z = true;
                            }
                        }
                    }
                    newCurrItem++;
                }
                Collections.sort(this.A0t, A0z);
                if (!z) {
                    int childCount = getChildCount();
                    for (int newCurrItem2 = 0; newCurrItem2 < childCount; newCurrItem2++) {
                        C3O c3o = (C3O) getChildAt(newCurrItem2).getLayoutParams();
                        if (!c3o.A05) {
                            c3o.A00 = 0.0f;
                        }
                    }
                    A0N(i, false, true);
                    if (A0v[2].length() == 14) {
                        throw new RuntimeException();
                    }
                    A0v[2] = "iBz2AIJ6C";
                    requestLayout();
                    return;
                }
                return;
            }
        }
        z = false;
        int i4 = this.A00;
        boolean z22 = false;
        newCurrItem = 0;
        while (newCurrItem < adapterCount) {
        }
        Collections.sort(this.A0t, A0z);
        if (!z) {
        }
    }

    public final void A0f() {
        A0G(this.A00);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0011 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C3N A07;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < focusableCount; i3++) {
                View childAt = getChildAt(i3);
                int focusableCount = childAt.getVisibility();
                if (focusableCount == 0 && (A07 = A07(childAt)) != null) {
                    int descendantFocusability2 = A07.A02;
                    int focusableCount2 = this.A00;
                    if (descendantFocusability2 == focusableCount2) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if (descendantFocusability == 262144) {
            int focusableCount3 = arrayList.size();
            if (size != focusableCount3) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        int descendantFocusability3 = i2 & 1;
        if ((descendantFocusability3 != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C3O c3o = (C3O) layoutParams;
        c3o.A05 |= A0c(view);
        if (this.A0j) {
            if (c3o == null || !c3o.A05) {
                c3o.A03 = true;
                if (A0v[2].length() == 14) {
                    throw new RuntimeException();
                }
                A0v[1] = "XL6oa3uLuKs2IOpHyjfCXdHiJnTalh";
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 16));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) width) * this.A02)) : i > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3O) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0l = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y = getScrollY();
            int x = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x || y != oldY) {
                scrollTo(x, oldY);
                if (!A0Z(x)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            C3H.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3N A07;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int childCount2 = childAt.getVisibility();
            if (childCount2 == 0 && (A07 = A07(childAt)) != null) {
                int i2 = A07.A02;
                String[] strArr = A0v;
                String str = strArr[7];
                String str2 = strArr[0];
                int i3 = str.charAt(10);
                int childCount3 = str2.charAt(10);
                if (i3 != childCount3) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[4] = "";
                strArr2[5] = "";
                int childCount4 = this.A00;
                if (i2 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r3.A05() > 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r5 = r8.save();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r3 = getWidth();
        r8.rotate(270.0f);
        r1 = -r4;
        r8.translate(r1 + getPaddingTop(), r7.A02 * r3);
        r7.A0V.setSize(r4, r3);
        r0 = r7.A0V.draw(r8);
        r6 = false | r0;
        r8.restoreToCount(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r0 = r7.A0W.isFinished();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r3 = r8.save();
        r5 = getWidth();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r8.rotate(90.0f);
        r8.translate(-getPaddingTop(), (-(r7.A07 + 1.0f)) * r5);
        r7.A0W.setSize(r4, r5);
        r0 = r7.A0W.draw(r8);
        r6 = r6 | r0;
        r8.restoreToCount(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e1, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
                AnonymousClass32 anonymousClass32 = this.A01;
                String[] strArr = A0v;
                String str = strArr[7];
                String str2 = strArr[0];
                int overScrollMode2 = str.charAt(10);
                if (overScrollMode2 != str2.charAt(10)) {
                    throw new RuntimeException();
                }
                A0v[1] = "uCo1AgFx4bPu4bwpitwpleYcuNfeFds";
                if (anonymousClass32 != null) {
                }
            }
            this.A0V.finish();
            this.A0W.finish();
            if (!z) {
                C3H.A07(this);
                return;
            }
            return;
        }
        boolean isFinished = this.A0V.isFinished();
        int overScrollMode3 = A0v[1].length();
        if (overScrollMode3 != 12) {
            A0v[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
        } else {
            String[] strArr2 = A0v;
            strArr2[4] = "";
            strArr2[5] = "";
        }
        if (!z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3O();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3O(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AnonymousClass32 getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int result = this.A0F == 2 ? (i - 1) - i2 : i2;
        int index = ((C3O) this.A0d.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0s);
        Scroller scroller = this.A0X;
        if (scroller != null && !scroller.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0t.size() > 0 && this.A01 != null) {
            int pos = getScrollX();
            int lastPos = getWidth();
            float f2 = this.A0M / lastPos;
            int itemCount = 0;
            C3N c3n = this.A0t.get(0);
            float marginOffset = c3n.A00;
            int size = this.A0t.size();
            int i = this.A0t.get(size - 1).A02;
            loop0: for (int i2 = c3n.A02; i2 < i; i2++) {
                while (i2 > c3n.A02 && itemCount < size) {
                    itemCount++;
                    C3N c3n2 = this.A0t.get(itemCount);
                    String[] strArr = A0v;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int scrollX = str.charAt(10);
                    if (scrollX != str2.charAt(10)) {
                        break loop0;
                    }
                    A0v[2] = "Qpfq";
                    c3n = c3n2;
                }
                if (i2 == c3n.A02) {
                    f = (c3n.A00 + c3n.A01) * lastPos;
                    float marginOffset2 = c3n.A00;
                    marginOffset = marginOffset2 + c3n.A01 + f2;
                } else {
                    float A04 = this.A01.A04(i2);
                    f = (marginOffset + A04) * lastPos;
                    marginOffset += A04 + f2;
                }
                if (this.A0M + f > pos) {
                    Drawable drawable = this.A0S;
                    int round = Math.round(f);
                    int i3 = this.A0Q;
                    int width = Math.round(this.A0M + f);
                    drawable.setBounds(round, i3, width, this.A09);
                    Drawable drawable2 = this.A0S;
                    String[] strArr2 = A0v;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int width2 = str3.charAt(10);
                    if (width2 != str4.charAt(10)) {
                        A0v[1] = "";
                        drawable2.draw(canvas);
                    } else {
                        String[] strArr3 = A0v;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        drawable2.draw(canvas);
                    }
                }
                int i4 = pos + lastPos;
                int width3 = A0v[1].length();
                if (width3 == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "DrXdt";
                if (f > i4) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0U();
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0v[2] = "iW5W";
            return false;
        }
        if (action != 0) {
            if (this.A0k) {
                return true;
            }
            if (this.A0m) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.A03 = x;
                this.A05 = x;
                float y = motionEvent.getY();
                this.A04 = y;
                this.A06 = y;
                this.A08 = motionEvent.getPointerId(0);
                this.A0m = false;
                this.A0l = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0R(false);
                    this.A0k = false;
                    break;
                } else {
                    this.A0X.abortAnimation();
                    this.A0o = false;
                    A0f();
                    this.A0k = true;
                    A0T(true);
                    setScrollState(1);
                    break;
                }
                break;
            case 2:
                int i = this.A08;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f2 = x2 - this.A05;
                    float abs = Math.abs(f2);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float y3 = Math.abs(y2 - this.A04);
                    if (f2 != 0.0f && !A0Y(this.A05, f2) && A0d(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.A05 = x2;
                        this.A06 = y2;
                        this.A0m = true;
                        return false;
                    }
                    int i2 = this.A0R;
                    if (abs > i2 && 0.5f * abs > y3) {
                        this.A0k = true;
                        A0T(true);
                        setScrollState(1);
                        if (f2 <= 0.0f) {
                            f = this.A03 - this.A0R;
                        } else {
                            float f3 = this.A03;
                            int i3 = this.A0R;
                            String[] strArr2 = A0v;
                            if (strArr2[7].charAt(10) != strArr2[0].charAt(10)) {
                                f = f3 + i3;
                            } else {
                                String[] strArr3 = A0v;
                                strArr3[7] = "WpQimEPBWZ8vG05HKhTxshBMY3NNEur0";
                                strArr3[0] = "BEtp4ufX6D8x3OZlDxdpMoFh1oKQqP0t";
                                f = f3 + i3;
                            }
                        }
                        this.A05 = f;
                        this.A06 = y2;
                        setScrollingCacheEnabled(true);
                    } else if (y3 > i2) {
                        this.A0m = true;
                    }
                    if (this.A0k && A0X(x2)) {
                        C3H.A07(this);
                        break;
                    }
                }
                break;
            case 6:
                A0P(motionEvent);
                break;
        }
        VelocityTracker velocityTracker = this.A0U;
        if (A0v[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0v;
        strArr4[3] = "qZEBvpK5WM51NnTYZj9Wv9V85vPNkfCF";
        strArr4[6] = "8DoAZte0LwUXg2aXlHvSBWFBy3vUeqDy";
        if (velocityTracker == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        return this.A0k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C3N A07;
        int height;
        int count;
        int paddingBottom = getChildCount();
        int decorCount = i3 - i;
        int scrollX = i4 - i2;
        int childTop = getPaddingLeft();
        int i5 = getPaddingTop();
        int childLeft = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        int hgrav = getScrollX();
        int i6 = 0;
        int paddingRight = 0;
        while (true) {
            int width = 8;
            String[] strArr = A0v;
            String str = strArr[4];
            String str2 = strArr[5];
            int count2 = str.length();
            if (count2 == str2.length()) {
                A0v[1] = "";
                if (paddingRight < paddingBottom) {
                    View childAt = getChildAt(paddingRight);
                    if (childAt.getVisibility() != 8) {
                        C3O c3o = (C3O) childAt.getLayoutParams();
                        if (c3o.A05) {
                            int count3 = c3o.A04 & 7;
                            int childTop2 = c3o.A04 & 112;
                            switch (count3) {
                                case 1:
                                    height = Math.max((decorCount - childAt.getMeasuredWidth()) / 2, childTop);
                                    break;
                                case 2:
                                case 4:
                                default:
                                    height = childTop;
                                    break;
                                case 3:
                                    height = childTop;
                                    childTop += childAt.getMeasuredWidth();
                                    break;
                                case 5:
                                    int height2 = decorCount - childLeft;
                                    int measuredWidth = childAt.getMeasuredWidth();
                                    String[] strArr2 = A0v;
                                    String str3 = strArr2[7];
                                    String str4 = strArr2[0];
                                    int count4 = str3.charAt(10);
                                    if (count4 == str4.charAt(10)) {
                                        A0v[1] = "51Hkg";
                                        height = height2 - measuredWidth;
                                        childLeft += childAt.getMeasuredWidth();
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                            switch (childTop2) {
                                case 16:
                                    count = Math.max((scrollX - childAt.getMeasuredHeight()) / 2, i5);
                                    break;
                                case 48:
                                    count = i5;
                                    i5 += childAt.getMeasuredHeight();
                                    break;
                                case 80:
                                    int count5 = scrollX - paddingBottom2;
                                    count = count5 - childAt.getMeasuredHeight();
                                    paddingBottom2 += childAt.getMeasuredHeight();
                                    break;
                                default:
                                    count = i5;
                                    break;
                            }
                            int height3 = height + hgrav;
                            int width2 = height3 + childAt.getMeasuredWidth();
                            childAt.layout(height3, count, width2, childAt.getMeasuredHeight() + count);
                            i6++;
                        } else {
                            continue;
                        }
                    }
                    paddingRight++;
                } else {
                    int decorCount2 = (decorCount - childTop) - childLeft;
                    int paddingRight2 = 0;
                    while (paddingRight2 < paddingBottom) {
                        View childAt2 = getChildAt(paddingRight2);
                        if (childAt2.getVisibility() != width) {
                            C3O c3o2 = (C3O) childAt2.getLayoutParams();
                            if (!c3o2.A05 && (A07 = A07(childAt2)) != null) {
                                int height4 = childTop + ((int) (decorCount2 * A07.A00));
                                if (c3o2.A03) {
                                    c3o2.A03 = false;
                                    int widthSpec = View.MeasureSpec.makeMeasureSpec((int) (decorCount2 * c3o2.A00), 1073741824);
                                    childAt2.measure(widthSpec, View.MeasureSpec.makeMeasureSpec((scrollX - i5) - paddingBottom2, 1073741824));
                                }
                                int heightSpec = childAt2.getMeasuredWidth();
                                int widthSpec2 = childAt2.getMeasuredHeight();
                                int i7 = i5;
                                childAt2.layout(height4, i7, heightSpec + height4, widthSpec2 + i7);
                            }
                        }
                        paddingRight2++;
                        width = 8;
                    }
                    this.A0Q = i5;
                    this.A09 = scrollX - paddingBottom2;
                    this.A0D = i6;
                    if (this.A0i) {
                        int i8 = this.A00;
                        z2 = false;
                        String[] strArr3 = A0v;
                        if (strArr3[4].length() != strArr3[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0v;
                        strArr4[4] = "";
                        strArr4[5] = "";
                        A0M(i8, false, 0, false);
                    } else {
                        z2 = false;
                    }
                    this.A0i = z2;
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int end;
        int i2;
        C3N A07;
        int i3 = getChildCount();
        int count = i & 2;
        if (count != 0) {
            end = 0;
            i2 = 1;
        } else {
            end = i3 - 1;
            i2 = -1;
            i3 = -1;
        }
        while (end != i3) {
            View child = getChildAt(end);
            int index = A0v[2].length();
            if (index == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "wvs0VrXDMEHK1ZrgMliCmQkmYIqFRPYZ";
            strArr[6] = "yeuyy9yC0QSIfk9tyj8D1No5khczL5F7";
            int count2 = child.getVisibility();
            if (count2 == 0 && (A07 = A07(child)) != null) {
                int index2 = A07.A02;
                int count3 = this.A00;
                if (index2 == count3 && child.requestFocus(i, rect)) {
                    return true;
                }
            }
            end += i2;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Context context = getContext();
            String[] strArr = A0v;
            if (strArr[3].charAt(15) == strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[7] = "Ly8LvMv3iU8o2fiJAVqvd6K7Aqz3gZKY";
            strArr2[0] = "HcNmsPXina8Ul250FP3kUGj1pgK53N1r";
            classLoader = context.getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0c = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        ViewPager$SavedState ss = new ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        AnonymousClass32 anonymousClass32 = this.A01;
        if (anonymousClass32 != null) {
            Parcelable superState2 = anonymousClass32.A07();
            ss.A01 = superState2;
        }
        Parcelable superState3 = new WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0M;
            A0K(i, i3, i5, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0j) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0010 */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.ads.redexgen.X.3S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAdapter(AnonymousClass32 anonymousClass32) {
        AnonymousClass32 anonymousClass322 = this.A01;
        if (anonymousClass322 != null) {
            anonymousClass322.A0A(null);
            for (int i = 0; i < i; i++) {
                C3N c3n = this.A0t.get(i);
                this.A01.A0B(this, c3n.A02, c3n.A03);
            }
            this.A0t.clear();
            A0A();
            this.A00 = 0;
            scrollTo(0, 0);
        }
        this.A01 = anonymousClass32;
        this.A0G = 0;
        if (anonymousClass32 != null) {
            if (this.A0b == null) {
                this.A0b = new DataSetObserver() { // from class: com.facebook.ads.redexgen.X.3S
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        C3V.this.A0e();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        C3V.this.A0e();
                    }
                };
            }
            this.A01.A0A(this.A0b);
            this.A0o = false;
            boolean z = this.A0i;
            this.A0i = true;
            AnonymousClass32 oldAdapter = this.A01;
            this.A0G = oldAdapter.A05();
            if (this.A0O >= 0) {
                A0N(this.A0O, false, true);
                this.A0O = -1;
                this.A0T = null;
                this.A0c = null;
            } else if (!z) {
                A0f();
            } else {
                requestLayout();
            }
        }
        List<ViewPager.OnAdapterChangeListener> list = this.A0e;
        if (list != null && !list.isEmpty() && 0 < this.A0e.size()) {
            this.A0e.get(0);
            throw new NullPointerException(A08(381, 16, 117));
        }
    }

    public void setCurrentItem(int i) {
        this.A0o = false;
        A0N(i, !this.A0i, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(A08(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, 9, 47), A08(127, 31, 60) + i + A08(51, 26, 90) + 1);
            i = 1;
        }
        if (i != this.A0L) {
            this.A0L = i;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C3Q c3q) {
        this.A0Z = c3q;
    }

    public void setPageMargin(int i) {
        int width = this.A0M;
        this.A0M = i;
        int oldMargin = getWidth();
        A0K(oldMargin, oldMargin, i, width);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C2Y.A00(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0P == i) {
            return;
        }
        this.A0P = i;
        if (this.A0a != null) {
            A0S(i != 0);
        }
        A0F(i);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0p != z) {
            this.A0p = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
