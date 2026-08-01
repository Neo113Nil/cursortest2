package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class ED extends ViewGroup implements ZR {
    public static byte[] A18;
    public static String[] A19 = {"EzQ8zede2M", "Jhjgeach8ubRdn89CHbftPIFCkhy8Cmz", "AI0RoC", "LwFgY3t3Qwi2PJUU36Pvm2", "gOCwMU1oDfpLVyXTNaTi7eQdHjis00sx", "GZYggCcl1OWg4VOzBYKk2kBvqjxmktta", "Te26Sy6xLG0KtVPzJaOHws0Kts3F9NRb", "K773CdyIAwEU"};
    public static final Interpolator A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final boolean A1G;
    public static final int[] A1H;
    public static final int[] A1I;
    public static final Class<?>[] A1J;
    public ZE A00;
    public AnonymousClass40 A01;
    public ZD A02;
    public C4D A03;
    public C4Q A04;
    public C4Y A05;
    public AbstractC02334c A06;
    public InterfaceC02414l A07;
    public RunnableC02494t A08;
    public C0992Yz A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public VelocityTracker A0Y;
    public EdgeEffect A0Z;
    public EdgeEffect A0a;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C02052z A0d;
    public C4T A0e;
    public C4W A0f;
    public AbstractC02364f A0g;
    public InterfaceC02374g A0h;
    public AbstractC02384h A0i;
    public RecyclerView$SavedState A0j;
    public Runnable A0k;
    public List<RecyclerView.OnChildAttachStateChangeListener> A0l;
    public List<AbstractC02384h> A0m;
    public boolean A0n;
    public boolean A0o;
    public final Rect A0p;
    public final RectF A0q;
    public final C02404k A0r;
    public final C02474r A0s;
    public final AnonymousClass52 A0t;
    public final Runnable A0u;
    public final ArrayList<C4Z> A0v;
    public final List<AbstractC02504u> A0w;
    public final int A0x;
    public final int A0y;
    public final Rect A0z;
    public final AccessibilityManager A10;
    public final Z2 A11;
    public final AnonymousClass51 A12;
    public final ArrayList<InterfaceC02374g> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A18, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0N() {
        this.A0s.A04(4);
        A1K();
        A1L();
        this.A0s.A04 = 1;
        if (this.A0s.A0C) {
            for (int A05 = this.A01.A05() - 1; A05 >= 0; A05--) {
                AbstractC02504u A0F = A0F(this.A01.A09(A05));
                if (!A0F.A0h()) {
                    long A0C = A0C(A0F);
                    C4X A08 = this.A05.A08(this.A0s, A0F);
                    AbstractC02504u A052 = this.A0t.A05(A0C);
                    if (A052 == null || A052.A0h()) {
                        this.A0t.A0E(A0F, A08);
                    } else {
                        boolean A0H = this.A0t.A0H(A052);
                        AnonymousClass52 anonymousClass52 = this.A0t;
                        if (A19[5].charAt(2) != 'Y') {
                            break;
                        }
                        A19[1] = "oIS3LUWJBkP0D1bim3OID749wsN9UxnV";
                        boolean A0H2 = anonymousClass52.A0H(A0F);
                        if (A0H && A052 == A0F) {
                            this.A0t.A0E(A0F, A08);
                        } else {
                            C4X A04 = this.A0t.A04(A052);
                            this.A0t.A0E(A0F, A08);
                            C4X A03 = this.A0t.A03(A0F);
                            if (A04 == null) {
                                A0m(A0C, A0F, A052);
                            } else {
                                A0t(A052, A0F, A04, A03, A0H, A0H2);
                            }
                        }
                    }
                }
            }
            this.A0t.A0G(this.A12);
        }
        this.A06.A1G(this.A0r);
        C02474r c02474r = this.A0s;
        c02474r.A05 = c02474r.A03;
        this.A0C = false;
        this.A0s.A0C = false;
        this.A0s.A0B = false;
        this.A06.A09 = false;
        if (this.A0r.A02 != null) {
            ArrayList<AbstractC02504u> arrayList = this.A0r.A02;
            String[] strArr = A19;
            if (strArr[3].length() != strArr[0].length()) {
                A19[1] = "DxhhwSm2KO29M0snTVs4N8QFyNW6c8YZ";
                arrayList.clear();
            }
            throw new RuntimeException();
        }
        if (this.A06.A08) {
            this.A06.A00 = 0;
            this.A06.A08 = false;
            this.A0r.A0O();
        }
        this.A06.A1z(this.A0s);
        A1M();
        A1s(false);
        this.A0t.A06();
        int[] iArr = this.A14;
        if (A11(iArr[0], iArr[1])) {
            A1c(0, 0);
        }
        A0Q();
        A0S();
    }

    public static void A0W() {
        A18 = new byte[]{-74, -74, -96, -74, -20, -1, -5, Ascii.CR, -74, -34, 5, 2, -6, -5, 8, -74, -56, -48, -100, -33, -35, -22, -22, -21, -16, -100, -34, -31, -100, -30, -21, -15, -22, -32, -100, -34, -15, -16, -100, -27, -16, -100, -27, -17, -100, -22, -31, -33, -31, -17, -17, -35, -18, -11, -100, -30, -21, -18, -100, 126, -57, -47, 126, -65, -54, -48, -61, -65, -62, -41, 126, -65, -46, -46, -65, -63, -58, -61, -62, 126, -46, -51, 126, -65, 126, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, -104, -12, Base64.padSymbol, 71, -12, 66, 67, 72, -12, 53, -12, 56, Base64.padSymbol, 70, 57, 55, 72, -12, 55, 60, Base64.padSymbol, 64, 56, -12, 67, 58, -12, -93, -15, -14, -9, -93, -23, -14, -8, -15, -25, -79, -93, -57, -20, -25, -93, -28, -15, -4, -93, -48, -14, -9, -20, -14, -15, -56, -7, -24, -15, -9, -10, -93, -22, -24, -9, -93, -10, -18, -20, -13, -13, -24, -25, -62, -45, -57, 8, Ascii.VT, 8, Ascii.ETB, Ascii.ESC, Ascii.FF, Ascii.EM, -31, -117, Byte.MAX_VALUE, -62, -50, -51, -45, -60, -41, -45, -103, -56, -68, 8, -3, Ascii.NAK, Ascii.VT, 17, 16, -42, 9, -18, 67, 65, 55, 60, 53, -18, 50, 51, 52, 47, 67, 58, 66, -18, 68, 47, 58, 67, 51, -67, -37, -26, -26, -33, -34, -102, -20, -33, -25, -23, -16, -33, -66, -33, -18, -37, -35, -30, -33, -34, -48, -29, -33, -15, -102, -15, -29, -18, -30, -102, -37, -102, -16, -29, -33, -15, -102, -15, -30, -29, -35, -30, -102, -29, -19, -102, -24, -23, -18, -102, -32, -26, -37, -31, -31, -33, -34, -102, -37, -19, -102, -18, -25, -22, -102, -34, -33, -18, -37, -35, -30, -33, -34, -88, -80, -50, -37, -37, -36, -31, -115, -48, -50, -39, -39, -115, -31, -43, -42, -32, -115, -38, -46, -31, -43, -36, -47, -115, -42, -37, -115, -50, -115, -32, -48, -33, -36, -39, -39, -115, -48, -50, -39, -39, -49, -50, -48, -40, -101, -115, -64, -48, -33, -36, -39, -39, -115, -48, -50, -39, -39, -49, -50, -48, -40, -32, -115, -38, -42, -44, -43, -31, -49, -46, -115, -33, -30, -37, -115, -47, -30, -33, -42, -37, -44, -115, -50, -115, -38, -46, -50, -32, -30, -33, -46, -115, -109, -115, -39, -50, -26, -36, -30, -31, -115, -35, -50, -32, -32, -115, -28, -43, -46, -33, -46, -115, -26, -36, -30, -115, -48, -50, -37, -37, -36, -31, -115, -48, -43, -50, -37, -44, -46, -115, -31, -43, -46, -65, -46, -48, -26, -48, -39, -46, -33, -61, -42, -46, -28, -115, -47, -50, -31, -50, -101, -115, -82, -37, -26, -115, -38, -46, -31, -43, -36, -47, -115, -48, -50, -39, -39, -115, -31, -43, -50, -31, -115, -38, -42, -44, -43, -31, -115, -48, -43, -50, -37, -44, -46, -115, -31, -43, -46, -115, -32, -31, -33, -30, -48, -31, -30, -33, -46, -36, -45, -115, -31, -43, -46, -115, -65, -46, -48, -26, -48, -39, -46, -33, -61, -42, -46, -28, -115, -36, -33, -115, -31, -43, -46, -115, -50, -47, -50, -35, -31, -46, -33, -115, -48, -36, -37, -31, -46, -37, -31, -32, -115, -32, -43, -36, -30, -39, -47, -115, -49, -46, -115, -35, -36, -32, -31, -35, -36, -37, -46, -47, -115, -31, -36, -31, -43, -46, -115, -37, -46, -27, -31, -115, -45, -33, -50, -38, -46, -101, -55, -25, -12, -12, -11, -6, -90, -23, -25, -14, -14, -90, -6, -18, -17, -7, -90, -13, -21, -6, -18, -11, -22, -90, -3, -18, -17, -14, -21, -90, -40, -21, -23, -1, -23, -14, -21, -8, -36, -17, -21, -3, -90, -17, -7, -90, -23, -11, -13, -10, -5, -6, -17, -12, -19, -90, -25, -90, -14, -25, -1, -11, -5, -6, -90, -11, -8, -90, -7, -23, -8, -11, -14, -14, -17, -12, -19, -28, 2, Ascii.SI, Ascii.SI, 16, Ascii.NAK, -63, 7, Ascii.CR, 10, Ascii.SI, 8, -63, Ascii.CAN, 10, Ascii.NAK, 9, 16, Ascii.SYN, Ascii.NAK, -63, 2, -63, -19, 2, Ascii.SUB, 16, Ascii.SYN, Ascii.NAK, -18, 2, Ascii.SI, 2, 8, 6, 19, -63, Ascii.DC4, 6, Ascii.NAK, -49, -63, -28, 2, Ascii.CR, Ascii.CR, -63, Ascii.DC4, 6, Ascii.NAK, -19, 2, Ascii.SUB, 16, Ascii.SYN, Ascii.NAK, -18, 2, Ascii.SI, 2, 8, 6, 19, -63, Ascii.CAN, 10, Ascii.NAK, 9, -63, 2, -63, Ascii.SI, 16, Ascii.SI, -50, Ascii.SI, Ascii.SYN, Ascii.CR, Ascii.CR, -63, 2, 19, 8, Ascii.SYN, Ascii.SO, 6, Ascii.SI, Ascii.NAK, -49, -35, -5, 8, 8, 9, Ascii.SO, -70, Ascii.CR, -3, Ascii.FF, 9, 6, 6, -70, Ascii.SO, 9, -70, 10, 9, Ascii.CR, 3, Ascii.SO, 3, 9, 8, -70, -5, -70, -26, -5, 19, 9, Ascii.SI, Ascii.SO, -25, -5, 8, -5, 1, -1, Ascii.FF, -70, Ascii.CR, -1, Ascii.SO, -56, -70, -35, -5, 6, 6, -70, Ascii.CR, -1, Ascii.SO, -26, -5, 19, 9, Ascii.SI, Ascii.SO, -25, -5, 8, -5, 1, -1, Ascii.FF, -70, 17, 3, Ascii.SO, 2, -70, -5, -70, 8, 9, 8, -57, 8, Ascii.SI, 6, 6, -70, -5, Ascii.FF, 1, Ascii.SI, 7, -1, 8, Ascii.SO, -56, -33, -3, 10, 10, Ascii.VT, 16, -68, Ascii.SI, -1, Ascii.SO, Ascii.VT, 8, 8, -68, 19, 5, 16, 4, Ascii.VT, 17, 16, -68, -3, -68, -24, -3, Ascii.NAK, Ascii.VT, 17, 16, -23, -3, 10, -3, 3, 1, Ascii.SO, -68, Ascii.SI, 1, 16, -54, -68, -33, -3, 8, 8, -68, Ascii.SI, 1, 16, -24, -3, Ascii.NAK, Ascii.VT, 17, 16, -23, -3, 10, -3, 3, 1, Ascii.SO, -68, 19, 5, 16, 4, -68, -3, -68, 10, Ascii.VT, 10, -55, 10, 17, 8, 8, -68, -3, Ascii.SO, 3, 17, 9, 1, 10, 16, -54, -29, 1, Ascii.SO, Ascii.SO, Ascii.SI, Ascii.DC4, -64, 19, Ascii.CR, Ascii.SI, Ascii.SI, Ascii.DC4, 8, -64, 19, 3, Ascii.DC2, Ascii.SI, Ascii.FF, Ascii.FF, -64, Ascii.ETB, 9, Ascii.DC4, 8, Ascii.SI, Ascii.NAK, Ascii.DC4, -64, 1, -64, -20, 1, Ascii.EM, Ascii.SI, Ascii.NAK, Ascii.DC4, -19, 1, Ascii.SO, 1, 7, 5, Ascii.DC2, -64, 19, 5, Ascii.DC4, -50, -64, -29, 1, Ascii.FF, Ascii.FF, -64, 19, 5, Ascii.DC4, -20, 1, Ascii.EM, Ascii.SI, Ascii.NAK, Ascii.DC4, -19, 1, Ascii.SO, 1, 7, 5, Ascii.DC2, -64, Ascii.ETB, 9, Ascii.DC4, 8, 
        -64, 1, -64, Ascii.SO, Ascii.SI, Ascii.SO, -51, Ascii.SO, Ascii.NAK, Ascii.FF, Ascii.FF, -64, 1, Ascii.DC2, 7, Ascii.NAK, Ascii.CR, 5, Ascii.SO, Ascii.DC4, -50, -18, Ascii.EM, -54, Ascii.CAN, Ascii.EM, Ascii.RS, -54, Ascii.GS, Ascii.SI, Ascii.RS, -10, Ascii.VT, 35, Ascii.EM, Ascii.US, Ascii.RS, -16, Ascii.FS, Ascii.EM, 36, Ascii.SI, Ascii.CAN, -54, 19, Ascii.CAN, -54, Ascii.SYN, Ascii.VT, 35, Ascii.EM, Ascii.US, Ascii.RS, -54, Ascii.EM, Ascii.FS, -54, Ascii.GS, Ascii.CR, Ascii.FS, Ascii.EM, Ascii.SYN, Ascii.SYN, -52, -7, -7, -10, -7, -89, -9, -7, -10, -22, -20, -6, -6, -16, -11, -18, -89, -6, -22, -7, -10, -13, -13, -62, -89, -9, -10, -16, -11, -5, -20, -7, -89, -16, -11, -21, -20, -1, -89, -19, -10, -7, -89, -16, -21, -89, -7, Ascii.SO, 38, Ascii.FS, 34, 33, -6, Ascii.SO, Ascii.ESC, Ascii.SO, Ascii.DC4, Ascii.DC2, Ascii.US, -51, -53, -20, -99, -34, -31, -34, -19, -15, -30, -17, -99, -34, -15, -15, -34, -32, -27, -30, -31, -72, -99, -16, -24, -26, -19, -19, -26, -21, -28, -99, -23, -34, -10, -20, -14, -15, -52, -19, -98, -22, -33, -9, -19, -13, -14, -98, -21, -33, -20, -33, -27, -29, -16, -98, -33, -14, -14, -33, -31, -26, -29, -30, -71, -98, -15, -23, -25, -18, -18, -25, -20, -27, -98, -22, -33, -9, -19, -13, -14, -1, 33, Ascii.RS, 17, Ascii.ESC, Ascii.DC4, Ascii.FS, -49, 38, Ascii.ETB, Ascii.CAN, Ascii.ESC, Ascii.DC4, -49, Ascii.FS, 16, 35, Ascii.DC2, Ascii.ETB, Ascii.CAN, Ascii.GS, Ascii.SYN, -49, Ascii.DC2, Ascii.ETB, 16, Ascii.GS, Ascii.SYN, Ascii.DC4, 19, -49, 37, Ascii.CAN, Ascii.DC4, 38, -49, Ascii.ETB, Ascii.RS, Ascii.ESC, 19, Ascii.DC4, 33, 34, -49, 38, Ascii.CAN, 35, Ascii.ETB, -49, 35, Ascii.ETB, Ascii.DC4, -49, Ascii.GS, Ascii.DC4, 38, Ascii.RS, Ascii.GS, Ascii.DC4, 34, -35, -49, 3, Ascii.ETB, Ascii.DC4, -49, Ascii.US, 33, Ascii.DC4, -36, Ascii.ESC, 16, 40, Ascii.RS, 36, 35, -49, Ascii.CAN, Ascii.GS, Ascii.NAK, Ascii.RS, 33, Ascii.FS, 16, 35, Ascii.CAN, Ascii.RS, Ascii.GS, -49, Ascii.NAK, Ascii.RS, 33, -49, 35, Ascii.ETB, Ascii.DC4, -49, Ascii.DC2, Ascii.ETB, 16, Ascii.GS, Ascii.SYN, Ascii.DC4, -49, Ascii.ETB, Ascii.RS, Ascii.ESC, 19, Ascii.DC4, 33, -49, 5, 9, -45, -7, 40, Ascii.US, Ascii.US, -4, 33, 41, Ascii.DC4, Ascii.US, Ascii.FS, Ascii.ETB, Ascii.DC4, 39, Ascii.CAN, -3, 1, -53, -6, Ascii.EM, -9, Ascii.FF, 36, Ascii.SUB, 32, Ascii.US, -7, -3, -57, -9, 8, Ascii.EM, Ascii.ESC, 16, 8, 19, -16, Ascii.NAK, Ascii.GS, 8, 19, 16, Ascii.VT, 8, Ascii.ESC, Ascii.FF, -14, -10, -64, -13, 3, Ascii.DC2, Ascii.SI, Ascii.FF, Ascii.FF, -10, 9, 7, Ascii.GS, 7, 16, 9, Ascii.SYN, -6, Ascii.CR, 9, Ascii.ESC, 1, Ascii.DC4, Ascii.DC2, 40, Ascii.DC2, Ascii.ESC, Ascii.DC4, 33, 5, Ascii.CAN, Ascii.DC4, 38, -49, 19, Ascii.RS, Ascii.DC4, 34, -49, Ascii.GS, Ascii.RS, 35, -49, 34, 36, Ascii.US, Ascii.US, Ascii.RS, 33, 35, -49, 34, Ascii.DC2, 33, Ascii.RS, Ascii.ESC, Ascii.ESC, Ascii.CAN, Ascii.GS, Ascii.SYN, -49, 35, Ascii.RS, -49, 16, Ascii.GS, -49, 16, 17, 34, Ascii.RS, Ascii.ESC, 36, 35, Ascii.DC4, -49, Ascii.US, Ascii.RS, 34, Ascii.CAN, 35, Ascii.CAN, Ascii.RS, Ascii.GS, -35, -49, 4, 34, Ascii.DC4, -49, 34, Ascii.DC2, 33, Ascii.RS, Ascii.ESC, Ascii.ESC, 3, Ascii.RS, -1, Ascii.RS, 34, Ascii.CAN, 35, Ascii.CAN, Ascii.RS, Ascii.GS, -49, Ascii.CAN, Ascii.GS, 34, 35, Ascii.DC4, 16, 19, -72, -53, -55, -33, -55, -46, -53, -40, -68, -49, -53, -35, -122, -50, -57, -39, -122, -44, -43, -122, -78, -57, -33, -43, -37, -38, -77, -57, -44, -57, -51, -53, -40, Ascii.GS, 64, 56, -23, 45, 50, 47, 47, 46, 59, 46, 55, Base64.padSymbol, -23, Ascii.US, 50, 46, 64, 17, 56, 53, 45, 46, 59, 60, -23, 49, 42, 63, 46, -23, Base64.padSymbol, 49, 46, -23, 60, 42, 54, 46, -23, 44, 49, 42, 55, 48, 46, -23, Ascii.DC2, Ascii.CR, -9, -23, Ascii.GS, 49, 50, 60, -23, 54, 50, 48, 49, Base64.padSymbol, -23, 49, 42, 57, 57, 46, 55, -23, 45, 62, 46, -23, Base64.padSymbol, 56, -23, 50, 55, 44, 56, 55, 60, 50, 60, Base64.padSymbol, 46, 55, Base64.padSymbol, -23, 10, 45, 42, 57, Base64.padSymbol, 46, 59, -23, 62, 57, 45, 42, Base64.padSymbol, 46, -23, 46, 63, 46, 55, Base64.padSymbol, 60, -23, 56, 59, -23, 50, 47, -23, Base64.padSymbol, 49, 46, -23, Ascii.NAK, 42, 66, 56, 62, Base64.padSymbol, Ascii.SYN, 42, 55, 42, 48, 46, 59, -23, 53, 42, 66, 60, -23, 56, 62, Base64.padSymbol, -23, Base64.padSymbol, 49, 46, -23, 60, 42, 54, 46, -23, Ascii.US, 50, 46, 64, -23, 54, 62, 53, Base64.padSymbol, 50, 57, 53, 46, -23, Base64.padSymbol, 50, 54, 46, 60, -9, -45, -23, Ascii.US, 50, 46, 64, 17, 56, 53, 45, 46, 59, -23, -6, 3, -10, Ascii.EM, 17, -62, 6, Ascii.VT, 8, 8, 7, Ascii.DC4, 7, 16, Ascii.SYN, -62, -8, Ascii.VT, 7, Ascii.EM, -22, 17, Ascii.SO, 6, 7, Ascii.DC4, Ascii.NAK, -62, 10, 3, Ascii.CAN, 7, -62, Ascii.SYN, 10, 7, -62, Ascii.NAK, 3, Ascii.SI, 7, -62, Ascii.NAK, Ascii.SYN, 3, 4, Ascii.SO, 7, -62, -21, -26, -48, -62, -11, Ascii.SYN, 3, 4, Ascii.SO, 7, -62, -21, -26, Ascii.NAK, -62, Ascii.VT, 16, -62, Ascii.ESC, 17, Ascii.ETB, Ascii.DC4, -62, 3, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -62, -17, -9, -11, -10, -62, -28, -25, -62, Ascii.ETB, 16, Ascii.VT, 19, Ascii.ETB, 7, -62, 3, 16, 6, -62, -11, -22, -15, -9, -18, -26, -62, -16, -15, -10, -62, 5, 10, 3, 16, 9, 7, -48, -84, -62, -8, Ascii.VT, 7, Ascii.EM, -22, 17, Ascii.SO, 6, 7, Ascii.DC4, -62, -45, -36, -29, -10, -14, 4, -83, 7, 9, 9, Ascii.VT, Ascii.EM, Ascii.EM, Ascii.SI, 8, Ascii.SI, Ascii.DC2, Ascii.SI, Ascii.SUB, Ascii.US, Ascii.US, 36, 45, 32, Ascii.RS, 47, 36, 42, 41, -37, 40, 48, 46, 47, -37, Ascii.GS, 32, -37, Ascii.FS, Ascii.GS, 46, 42, 39, 48, 47, 32, -23, -37, 45, 32, Ascii.RS, 32, 36, 49, 32, Ascii.US, -11, -42, -43, -86, -49, -48, -45, -53, -67, -48, -52, -34, -88, -37, -37, -56, -54, -49, -52, -53, -69, -42, -66, -48, -43, -53, -42, -34, -40, -41, -84, -47, -46, -43, -51, -65, -46, -50, -32, -83, -50, -35, -54, -52, -47, -50, -51, -81, -37, -40, -42, -64, -46, -41, -51, -40, -32, -30, -44, -29, -62, -46, -31, -34, -37, -37, -40, -35, -42, -61, -34, -28, -46, -41, -62, -37, -34, -33, -105, -104, -87, -113, -47, -48, -45, -113, -48, -31, -42, -28, -36, -44, -35, -29, -113, -46, -34, -35, -30, -29, -48, -35, -29, -113};
    }

    static {
        A0W();
        A1I = new int[]{R.attr.nestedScrollingEnabled};
        A1H = new int[]{R.attr.clipToPadding};
        A1C = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        A1B = Build.VERSION.SDK_INT >= 23;
        A1D = Build.VERSION.SDK_INT >= 16;
        A1E = Build.VERSION.SDK_INT >= 21;
        A1F = Build.VERSION.SDK_INT <= 15;
        A1G = Build.VERSION.SDK_INT <= 15;
        A1J = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        A1A = new Interpolator() { // from class: com.facebook.ads.redexgen.X.4P
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public ED(Context context) {
        this(context, null);
    }

    public ED(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ED(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A11 = new Z2(this);
        this.A0r = new C02404k(this);
        this.A0t = new AnonymousClass52();
        this.A0u = new Runnable() { // from class: com.facebook.ads.redexgen.X.4N
            @Override // java.lang.Runnable
            public final void run() {
                if (!ED.this.A0D || ED.this.isLayoutRequested()) {
                    return;
                }
                if (!ED.this.A0F) {
                    ED.this.requestLayout();
                } else if (ED.this.A0I) {
                    ED.this.A0J = true;
                } else {
                    ED.this.A1J();
                }
            }
        };
        this.A0p = new Rect();
        this.A0z = new Rect();
        this.A0q = new RectF();
        this.A0v = new ArrayList<>();
        this.A13 = new ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new EG();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new RunnableC02494t(this);
        this.A02 = A1E ? new ZD() : null;
        this.A0s = new C02474r();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new Z5(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new ArrayList();
        this.A0k = new Runnable() { // from class: com.facebook.ads.redexgen.X.4O
            @Override // java.lang.Runnable
            public final void run() {
                if (ED.this.A05 != null) {
                    ED.this.A05.A0J();
                }
                ED.this.A0K = false;
            }
        };
        this.A12 = new Z8(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1H, i, 0);
            this.A0B = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = C3I.A00(viewConfiguration, context);
        this.A0M = C3I.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A0B(this.A0f);
        A0e();
        A0O();
        if (C3H.A00(this) == 0) {
            C3H.A09(this, 1);
        }
        this.A10 = (AccessibilityManager) getContext().getSystemService(A0I(1831, 13, 81));
        setAccessibilityDelegateCompat(new C0992Yz(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A0B(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            int id2 = view.getId();
            if (id2 != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private final long A0C(AbstractC02504u abstractC02504u) {
        return this.A04.A0A() ? abstractC02504u.A0K() : abstractC02504u.A03;
    }

    private View A0D() {
        AbstractC02504u A1F2;
        int i = this.A0s.A01 != -1 ? this.A0s.A01 : 0;
        int A03 = this.A0s.A03();
        for (int i2 = i; i2 < A03; i2++) {
            AbstractC02504u A1F3 = A1F(i2);
            if (A1F3 == null) {
                break;
            }
            if (A1F3.A0H.hasFocusable()) {
                return A1F3.A0H;
            }
        }
        int startFocusSearchIndex = Math.min(A03, i);
        for (int limit = startFocusSearchIndex - 1; limit >= 0 && (A1F2 = A1F(limit)) != null; limit--) {
            if (A1F2.A0H.hasFocusable()) {
                return A1F2.A0H;
            }
        }
        return null;
    }

    private final AbstractC02504u A0E(long j) {
        C4Q c4q = this.A04;
        if (c4q == null || !c4q.A0A()) {
            return null;
        }
        int A06 = this.A01.A06();
        AbstractC02504u abstractC02504u = null;
        for (int i = 0; i < A06; i++) {
            AbstractC02504u holder = A0F(this.A01.A0A(i));
            if (holder != null && !holder.A0c()) {
                long A0K = holder.A0K();
                String[] strArr = A19;
                String str = strArr[3];
                String str2 = strArr[0];
                int length = str.length();
                int childCount = str2.length();
                if (length == childCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[2] = "zZZE93";
                strArr2[7] = "VhF552wVYFMR";
                if (A0K != j) {
                    continue;
                } else if (this.A01.A0K(holder.A0H)) {
                    abstractC02504u = holder;
                } else {
                    return holder;
                }
            }
        }
        return abstractC02504u;
    }

    public static AbstractC02504u A0F(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[6] = "BAOGG7B6SgQWpjs0haC4kmkQlPV7A4k9";
        strArr[4] = "PAhaNRNZ3VZ1U75Bha3wwWQKZTmx8jYI";
        return ((C02344d) layoutParams).A00;
    }

    private final AbstractC02504u A0G(View view) {
        View itemView = A1E(view);
        if (itemView == null) {
            return null;
        }
        return A1H(itemView);
    }

    public static ED A0H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        boolean z = view instanceof ED;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[1] = "St3OXKQiThZ0lO5vTnfaG6NXMltPJG5W";
        if (z) {
            return (ED) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            ED A0H = A0H(viewGroup.getChildAt(i));
            if (A0H != null) {
                return A0H;
            }
        }
        return null;
    }

    private void A0J() {
        A0T();
        setScrollState(0);
    }

    private void A0K() {
        int i = this.A0P;
        this.A0P = 0;
        if (i != 0) {
            boolean A1t = A1t();
            String[] strArr = A19;
            String str = strArr[2];
            String str2 = strArr[7];
            int length = str.length();
            int flags = str2.length();
            if (length == flags) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "eU2cwXbbXfV7oR8qPBCYPw";
            strArr2[0] = "cj1lHsGs8Y";
            if (A1t) {
                AccessibilityEvent event = AccessibilityEvent.obtain();
                event.setEventType(2048);
                C02063a.A01(event, i);
                sendAccessibilityEventUnchecked(event);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0L() {
        AbstractC02504u A0F;
        boolean didStructureChange;
        this.A0s.A04(1);
        A1m(this.A0s);
        this.A0s.A0A = false;
        A1K();
        this.A0t.A06();
        A1L();
        A0P();
        A0U();
        C02474r c02474r = this.A0s;
        c02474r.A0E = c02474r.A0C && this.A0H;
        this.A0H = false;
        this.A0G = false;
        C02474r c02474r2 = this.A0s;
        c02474r2.A09 = c02474r2.A0B;
        this.A0s.A03 = this.A04.A0D();
        A0x(this.A14);
        if (this.A0s.A0C) {
            int A05 = this.A01.A05();
            for (int i = 0; i < A05; i++) {
                AbstractC02504u A0F2 = A0F(this.A01.A09(i));
                boolean A0h = A0F2.A0h();
                String[] strArr = A19;
                String str = strArr[2];
                String str2 = strArr[7];
                int i2 = str.length();
                int count = str2.length();
                if (i2 != count) {
                    A19[5] = "UNYHKTM9Pgc2Q8zoabZHHBhpghLQMYt4";
                    if (!A0h) {
                        boolean A0b = A0F2.A0b();
                        String[] strArr2 = A19;
                        String str3 = strArr2[2];
                        String str4 = strArr2[7];
                        int i3 = str3.length();
                        int count2 = str4.length();
                        if (i3 != count2) {
                            A19[5] = "yAYMfY7gQPsOXL0bw1Y8FO5LYSWRNpHN";
                            if (A0b) {
                                C4Q c4q = this.A04;
                                int i4 = A19[5].charAt(2);
                                if (i4 != 89) {
                                    String[] strArr3 = A19;
                                    strArr3[2] = "S1msfb";
                                    strArr3[7] = "DqMDNTpz3t0S";
                                    if (!c4q.A0A()) {
                                        continue;
                                    }
                                } else {
                                    String[] strArr4 = A19;
                                    strArr4[6] = "3GcQR0gwPdJ7qG9NsafqkCoBzG49WZbm";
                                    strArr4[4] = "xwZbJMHEvrrw2fWE8anB3sW9hLiJiwUw";
                                    if (!c4q.A0A()) {
                                        continue;
                                    }
                                }
                            }
                            C4Y c4y = this.A05;
                            C02474r c02474r3 = this.A0s;
                            int i5 = C4Y.A00(A0F2);
                            this.A0t.A0F(A0F2, c4y.A09(c02474r3, A0F2, i5, A0F2.A0L()));
                            if (this.A0s.A0E && A0F2.A0f() && !A0F2.A0c() && !A0F2.A0h() && !A0F2.A0b()) {
                                long A0C = A0C(A0F2);
                                AnonymousClass52 anonymousClass52 = this.A0t;
                                int i6 = A19[1].length();
                                if (i6 == 32) {
                                    String[] strArr5 = A19;
                                    strArr5[3] = "VKmUie50Iu1ZqeQWLORu5w";
                                    strArr5[0] = "PYciOOvrvR";
                                    anonymousClass52.A08(A0C, A0F2);
                                }
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        if (this.A0s.A0B) {
            A0i();
            boolean z = this.A0s.A0D;
            this.A0s.A0D = false;
            this.A06.A1y(this.A0r, this.A0s);
            this.A0s.A0D = z;
            for (int i7 = 0; i7 < this.A01.A05(); i7++) {
                AnonymousClass40 anonymousClass40 = this.A01;
                int i8 = A19[1].length();
                if (i8 != 32) {
                    String[] strArr6 = A19;
                    strArr6[2] = "4lQmW8";
                    strArr6[7] = "2Uq8uzi7rIEU";
                    A0F = A0F(anonymousClass40.A09(i7));
                    boolean didStructureChange2 = A0F.A0h();
                    if (didStructureChange2) {
                    }
                    didStructureChange = this.A0t.A0I(A0F);
                    if (didStructureChange) {
                        int A00 = C4Y.A00(A0F);
                        boolean A0k = A0F.A0k(8192);
                        if (!A0k) {
                            A00 |= 4096;
                        }
                        C4X A09 = this.A05.A09(this.A0s, A0F, A00, A0F.A0L());
                        if (A0k) {
                            A1n(A0F, A09);
                        } else {
                            this.A0t.A0D(A0F, A09);
                        }
                    }
                } else {
                    A19[1] = "EzPEwBDGhSnYyJadD6vqsk9WPl8azgQD";
                    A0F = A0F(anonymousClass40.A09(i7));
                    boolean didStructureChange3 = A0F.A0h();
                    if (didStructureChange3) {
                    }
                    didStructureChange = this.A0t.A0I(A0F);
                    if (didStructureChange) {
                    }
                }
            }
            A0X();
        } else {
            A0X();
        }
        A1M();
        A1s(false);
        this.A0s.A04 = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0M() {
        boolean z;
        A1K();
        A1L();
        this.A0s.A04(6);
        this.A00.A0G();
        this.A0s.A03 = this.A04.A0D();
        this.A0s.A00 = 0;
        this.A0s.A09 = false;
        this.A06.A1y(this.A0r, this.A0s);
        this.A0s.A0D = false;
        this.A0j = null;
        C02474r c02474r = this.A0s;
        if (c02474r.A0C) {
            C4Y c4y = this.A05;
            String[] strArr = A19;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "QyMu0uKDVMcIUQ2WaaKkjpUJvINNzfF4";
            strArr2[4] = "jnZHkwnP1Z9tC9uQsacmbdRp3FaoK01F";
            if (c4y != null) {
                z = true;
                c02474r.A0C = z;
                C02474r c02474r2 = this.A0s;
                if (A19[1].length() == 32) {
                    c02474r2.A04 = 4;
                    A1M();
                    A1s(false);
                    return;
                } else {
                    A19[1] = "3IsVIAoReRfPbfS1EeUcjIwVgXkj1JVv";
                    c02474r2.A04 = 4;
                    A1M();
                    A1s(false);
                    return;
                }
            }
        }
        z = false;
        c02474r.A0C = z;
        C02474r c02474r22 = this.A0s;
        if (A19[1].length() == 32) {
        }
    }

    private void A0O() {
        this.A01 = new AnonymousClass40(new Z7(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r0 != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0P() {
        boolean animationTypeSupported;
        boolean animationTypeSupported2;
        boolean animationTypeSupported3;
        if (this.A0C) {
            this.A00.A0I();
            this.A06.A1M(this);
        }
        if (A0z()) {
            this.A00.A0H();
        } else {
            this.A00.A0G();
        }
        boolean z = false;
        boolean z2 = this.A0G || this.A0H;
        C02474r c02474r = this.A0s;
        boolean animationTypeSupported4 = this.A0D;
        if (animationTypeSupported4 && this.A05 != null) {
            boolean animationTypeSupported5 = this.A0C;
            if (!animationTypeSupported5 && !z2) {
                boolean animationTypeSupported6 = this.A06.A09;
            }
            boolean z3 = this.A0C;
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "q3lLGfTGOOnJqHZydaTklLew08TAvgTY";
            strArr[4] = "cayAc0YyiA2wrQyaXaOul4VyYlz5tKdZ";
            if (z3) {
                boolean animationTypeSupported7 = this.A04.A0A();
            }
            animationTypeSupported = true;
            c02474r.A0C = animationTypeSupported;
            C02474r c02474r2 = this.A0s;
            animationTypeSupported2 = c02474r2.A0C;
            if (animationTypeSupported2 && z2) {
                animationTypeSupported3 = this.A0C;
                if (!animationTypeSupported3) {
                    boolean animationTypeSupported8 = A0z();
                    if (animationTypeSupported8) {
                        z = true;
                    }
                }
            }
            c02474r2.A0B = z;
            if (A19[1].length() != 32) {
                A19[5] = "vAY5NMbknnGVxibfJ54Fdf4KbFDo9MxQ";
                return;
            }
            String[] strArr2 = A19;
            strArr2[2] = "gWU7AH";
            strArr2[7] = "O2IXTNL1mXfE";
            return;
        }
        animationTypeSupported = false;
        c02474r.A0C = animationTypeSupported;
        C02474r c02474r22 = this.A0s;
        animationTypeSupported2 = c02474r22.A0C;
        if (animationTypeSupported2) {
            animationTypeSupported3 = this.A0C;
            if (!animationTypeSupported3) {
            }
        }
        c02474r22.A0B = z;
        if (A19[1].length() != 32) {
        }
    }

    private void A0Q() {
        View viewToFocus;
        if (this.A0o && this.A04 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() == 131072 && isFocused()) {
                return;
            }
            boolean isFocused = isFocused();
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            A19[5] = "GSYhD7ljhsNq0QcPBhSV8ATJlhol3xt1";
            if (!isFocused) {
                View focusedChild = getFocusedChild();
                if (A1G && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.A01.A05() == 0) {
                        requestFocus();
                        return;
                    }
                } else if (!this.A01.A0K(focusedChild)) {
                    return;
                }
            }
            AbstractC02504u abstractC02504u = null;
            if (this.A0s.A08 != -1 && this.A04.A0A()) {
                abstractC02504u = A0E(this.A0s.A08);
            }
            View view = null;
            if (abstractC02504u == null || this.A01.A0K(abstractC02504u.A0H) || !abstractC02504u.A0H.hasFocusable()) {
                if (this.A01.A05() > 0) {
                    view = A0D();
                }
            } else {
                view = abstractC02504u.A0H;
            }
            if (view != null) {
                if (this.A0s.A02 != -1 && (viewToFocus = view.findViewById(this.A0s.A02)) != null && viewToFocus.isFocusable()) {
                    view = viewToFocus;
                }
                view.requestFocus();
            }
        }
    }

    private void A0R() {
        boolean z = false;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A0a.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            boolean needsInvalidate = this.A0c.isFinished();
            z |= needsInvalidate;
        }
        EdgeEffect edgeEffect3 = this.A0b;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            boolean needsInvalidate2 = this.A0b.isFinished();
            z |= needsInvalidate2;
        }
        EdgeEffect edgeEffect4 = this.A0Z;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            boolean needsInvalidate3 = this.A0Z.isFinished();
            z |= needsInvalidate3;
        }
        if (z) {
            C3H.A07(this);
        }
    }

    private void A0S() {
        this.A0s.A08 = -1L;
        this.A0s.A01 = -1;
        this.A0s.A02 = -1;
    }

    private void A0T() {
        VelocityTracker velocityTracker = this.A0Y;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A1Y(0);
        A0R();
    }

    private void A0U() {
        int A0G;
        View view = null;
        if (this.A0o && hasFocus() && this.A04 != null) {
            view = getFocusedChild();
        }
        AbstractC02504u A0G2 = view == null ? null : A0G(view);
        if (A0G2 == null) {
            A0S();
            return;
        }
        this.A0s.A08 = this.A04.A0A() ? A0G2.A0K() : -1L;
        C02474r c02474r = this.A0s;
        if (this.A0C) {
            A0G = -1;
        } else {
            A0G = A0G2.A0c() ? A0G2.A01 : A0G2.A0G();
        }
        c02474r.A01 = A0G;
        C02474r c02474r2 = this.A0s;
        View child = A0G2.A0H;
        c02474r2.A02 = A0B(child);
    }

    private void A0V() {
        this.A08.A08();
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null) {
            abstractC02334c.A0x();
        }
    }

    private final void A0X() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            AnonymousClass40 anonymousClass40 = this.A01;
            String[] strArr = A19;
            String str = strArr[3];
            String str2 = strArr[0];
            int i2 = str.length();
            int childCount = str2.length();
            if (i2 == childCount) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "VFyFJGthyduvDNyVUqu48D";
            strArr2[0] = "uBjdUWzzez";
            AbstractC02504u A0F = A0F(anonymousClass40.A0A(i));
            if (!A0F.A0h()) {
                A0F.A0M();
            }
        }
        this.A0r.A0K();
    }

    private final void A0Y() {
        C4Q c4q = this.A04;
        String A0I = A0I(1370, 12, 79);
        if (c4q == null) {
            Log.e(A0I, A0I(1123, 36, 40));
            return;
        }
        if (this.A06 == null) {
            Log.e(A0I, A0I(1159, 43, 41));
            return;
        }
        this.A0s.A0A = false;
        if (this.A0s.A04 == 1) {
            A0L();
            this.A06.A1O(this);
            A0M();
        } else if (this.A00.A0K() || this.A06.A0h() != getWidth() || this.A06.A0X() != getHeight()) {
            this.A06.A1O(this);
            A0M();
        } else {
            this.A06.A1O(this);
        }
        A0N();
    }

    private final void A0Z() {
        int state;
        for (int size = this.A0w.size() - 1; size >= 0; size--) {
            AbstractC02504u abstractC02504u = this.A0w.get(size);
            if (abstractC02504u.A0H.getParent() == this && !abstractC02504u.A0h() && (state = abstractC02504u.A02) != -1) {
                C3H.A09(abstractC02504u.A0H, state);
                abstractC02504u.A02 = -1;
            }
        }
        this.A0w.clear();
    }

    private final void A0a() {
        if (this.A0Z != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0Z = edgeEffect;
        if (this.A0B) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private final void A0b() {
        if (this.A0a != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0a = edgeEffect;
        if (this.A0B) {
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int measuredWidth = getMeasuredWidth() - getPaddingLeft();
            int paddingRight = getPaddingRight();
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "GMHrLIeJxdXYoHZyaa7kSwSfzExGbrBL";
            strArr2[4] = "0YT1HYXH3vPYSlLI8aOL6WZeFeHH6VHe";
            edgeEffect.setSize(measuredHeight, measuredWidth - paddingRight);
            return;
        }
        edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    private final void A0c() {
        if (this.A0b != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0b = edgeEffect;
        if (this.A0B) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private final void A0d() {
        if (this.A0c != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0c = edgeEffect;
        if (this.A0B) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "10JS50";
        strArr[7] = "NY78MD5eAiV9";
        edgeEffect.setSize(measuredWidth, getMeasuredHeight());
    }

    private final void A0e() {
        this.A00 = new ZE(new Z6(this));
    }

    private final void A0f() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0g() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            ((C02344d) this.A01.A0A(i).getLayoutParams()).A01 = true;
        }
        this.A0r.A0M();
    }

    private final void A0h() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            AbstractC02504u A0F = A0F(this.A01.A0A(i));
            if (A0F != null && !A0F.A0h()) {
                A0F.A0T(6);
            }
        }
        A0g();
        this.A0r.A0N();
    }

    private final void A0i() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            AbstractC02504u A0F = A0F(this.A01.A0A(i));
            if (!A0F.A0h()) {
                A0F.A0R();
            }
        }
    }

    private void A0j(float f, float f2, float f3, float f4) {
        boolean z = false;
        if (f2 < 0.0f) {
            A0b();
            C02223r.A00(this.A0a, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
            z = true;
        } else if (f2 > 0.0f) {
            A0c();
            C02223r.A00(this.A0b, f2 / getWidth(), f3 / getHeight());
            z = true;
        }
        if (f4 < 0.0f) {
            A0d();
            C02223r.A00(this.A0c, (-f4) / getHeight(), f / getWidth());
            z = true;
        } else if (f4 > 0.0f) {
            A0a();
            C02223r.A00(this.A0Z, f4 / getHeight(), 1.0f - (f / getWidth()));
            z = true;
        }
        if (z || f2 != 0.0f || f4 != 0.0f) {
            C3H.A07(this);
        }
    }

    private final void A0k(int i) {
        AbstractC02334c abstractC02334c = this.A06;
        AbstractC02384h abstractC02384h = this.A0i;
        if (abstractC02384h != null) {
            abstractC02384h.A0L(this, i);
        }
        List<AbstractC02384h> list = this.A0m;
        String[] strArr = A19;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[2] = "mB2qLC";
        strArr2[7] = "mQXIqdAaLius";
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0L(this, i);
            }
        }
    }

    private final void A0l(int i, int i2, Interpolator interpolator) {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null) {
            Log.e(A0I(1370, 12, 79), A0I(924, 97, 75));
            return;
        }
        boolean z = this.A0I;
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "pqK8Y9";
        strArr[7] = "UiASdGbGWO9v";
        if (z) {
            return;
        }
        if (!abstractC02334c.A24()) {
            i = 0;
        }
        if (!this.A06.A25()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            this.A08.A0D(i, i2, interpolator);
        }
    }

    private void A0m(long j, AbstractC02504u abstractC02504u, AbstractC02504u abstractC02504u2) {
        int A05 = this.A01.A05();
        for (int i = 0; i < A05; i++) {
            AbstractC02504u A0F = A0F(this.A01.A09(i));
            if (A0F != abstractC02504u && A0C(A0F) == j) {
                C4Q c4q = this.A04;
                String A0I = A0I(1, 17, 65);
                if (c4q != null && c4q.A0A()) {
                    throw new IllegalStateException(A0I(1696, 130, 77) + A0F + A0I + abstractC02504u + A1I());
                }
                throw new IllegalStateException(A0I(1508, Opcodes.NEWARRAY, 116) + A0F + A0I + abstractC02504u + A1I());
            }
        }
        Log.e(A0I(1370, 12, 79), A0I(1202, 111, 90) + abstractC02504u2 + A0I(18, 41, 39) + abstractC02504u + A1I());
    }

    private void A0n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionIndex2 = this.A0V;
        if (pointerId != actionIndex2) {
            return;
        }
        int i = actionIndex == 0 ? 1 : 0;
        int actionIndex3 = motionEvent.getPointerId(i);
        this.A0V = actionIndex3;
        int actionIndex4 = (int) (motionEvent.getX(i) + 0.5f);
        this.A0S = actionIndex4;
        this.A0Q = actionIndex4;
        int actionIndex5 = (int) (motionEvent.getY(i) + 0.5f);
        this.A0T = actionIndex5;
        this.A0R = actionIndex5;
    }

    public static void A0o(View view, Rect rect) {
        C02344d c02344d = (C02344d) view.getLayoutParams();
        Rect rect2 = c02344d.A03;
        rect.set((view.getLeft() - rect2.left) - c02344d.leftMargin, (view.getTop() - rect2.top) - c02344d.topMargin, view.getRight() + rect2.right + c02344d.rightMargin, view.getBottom() + rect2.bottom + c02344d.bottomMargin);
    }

    private void A0p(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.A0p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams focusedLayoutParams = view3.getLayoutParams();
        if (focusedLayoutParams instanceof C02344d) {
            C02344d c02344d = (C02344d) focusedLayoutParams;
            if (!c02344d.A01) {
                Rect insets = c02344d.A03;
                this.A0p.left -= insets.left;
                this.A0p.right += insets.right;
                this.A0p.top -= insets.top;
                this.A0p.bottom += insets.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A0p);
            offsetRectIntoDescendantCoords(view, this.A0p);
        }
        this.A06.A1e(this, view, this.A0p, !this.A0D, view2 == null);
    }

    private void A0q(C4Q c4q, boolean z, boolean z2) {
        C4Q c4q2 = this.A04;
        if (c4q2 != null) {
            Z2 z22 = this.A11;
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "W0We85FJJqvSsXa60a6gd4EA7hDdiGkp";
            strArr2[4] = "7sp9VzUFxAlBM78ItapDbGKr6NkpOVCZ";
            c4q2.A08(z22);
        }
        if (!z || z2) {
            A1O();
        }
        this.A00.A0I();
        C4Q c4q3 = this.A04;
        this.A04 = c4q;
        if (c4q != null) {
            c4q.A07(this.A11);
        }
        AbstractC02334c abstractC02334c = this.A06;
        C02404k c02404k = this.A0r;
        C4Q oldAdapter = this.A04;
        c02404k.A0Y(c4q3, oldAdapter, z);
        this.A0s.A0D = true;
        A1Q();
    }

    private void A0r(AbstractC02504u abstractC02504u) {
        View view = abstractC02504u.A0H;
        boolean z = view.getParent() == this;
        this.A0r.A0c(A1H(view));
        if (abstractC02504u.A0e()) {
            AnonymousClass40 anonymousClass40 = this.A01;
            String[] strArr = A19;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "yAMck033yUmsKAwrNaBuaPdrYuAtD8a4";
            strArr2[4] = "2F1g5meBaFaT8Ughfaz4Efd5BOFwzFG2";
            anonymousClass40.A0H(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.A01.A0J(view, true);
        } else {
            this.A01.A0E(view);
        }
    }

    public static void A0s(AbstractC02504u abstractC02504u) {
        if (abstractC02504u.A09 != null) {
            WeakReference<ED> weakReference = abstractC02504u.A09;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "Lp0Vudgnjyr9htx58aJuOXSG6zR0Rms0";
            strArr[4] = "QnOoNSP4qihOpTYseackLt73SA9jbFjz";
            ED ed = weakReference.get();
            while (ed != null) {
                View item = abstractC02504u.A0H;
                if (ed == item) {
                    return;
                }
                Object parent = ed.getParent();
                if (parent instanceof View) {
                    ed = (View) parent;
                } else {
                    ed = null;
                }
            }
            abstractC02504u.A09 = null;
        }
    }

    private void A0t(AbstractC02504u abstractC02504u, AbstractC02504u abstractC02504u2, C4X c4x, C4X c4x2, boolean z, boolean z2) {
        abstractC02504u.A0Z(false);
        if (z) {
            A0r(abstractC02504u);
        }
        if (abstractC02504u != abstractC02504u2) {
            if (z2) {
                A0r(abstractC02504u2);
            }
            abstractC02504u.A06 = abstractC02504u2;
            A0r(abstractC02504u);
            this.A0r.A0c(abstractC02504u);
            abstractC02504u2.A0Z(false);
            abstractC02504u2.A07 = abstractC02504u;
        }
        if (this.A05.A0H(abstractC02504u, abstractC02504u2, c4x, c4x2)) {
            A1N();
        }
    }

    private void A0x(int[] iArr) {
        int A05 = this.A01.A05();
        if (A05 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int maxPositionPreLayout = Integer.MAX_VALUE;
        int minPositionPreLayout = Integer.MIN_VALUE;
        for (int i = 0; i < A05; i++) {
            AbstractC02504u A0F = A0F(this.A01.A09(i));
            if (!A0F.A0h()) {
                int count = A0F.A0I();
                if (count < maxPositionPreLayout) {
                    maxPositionPreLayout = count;
                }
                if (count > minPositionPreLayout) {
                    minPositionPreLayout = count;
                }
            }
        }
        iArr[0] = maxPositionPreLayout;
        iArr[1] = minPositionPreLayout;
    }

    private boolean A0y() {
        int A05 = this.A01.A05();
        for (int i = 0; i < A05; i++) {
            AbstractC02504u A0F = A0F(this.A01.A09(i));
            if (A0F != null && !A0F.A0h() && A0F.A0f()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0z() {
        return this.A05 != null && this.A06.A26();
    }

    private boolean A11(int i, int i2) {
        A0x(this.A14);
        int[] iArr = this.A14;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private final boolean A12(int i, int i2) {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null) {
            Log.e(A0I(1370, 12, 79), A0I(651, 89, 76));
            return false;
        }
        if (this.A0I) {
            return false;
        }
        boolean A24 = abstractC02334c.A24();
        boolean canScroll = this.A06.A25();
        if (!A24 || Math.abs(i) < this.A0y) {
            i = 0;
        }
        if (!canScroll || Math.abs(i2) < this.A0y) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        boolean canScrollHorizontal = dispatchNestedPreFling(i, i2);
        if (!canScrollHorizontal) {
            boolean canScrollVertical = A24 || canScroll;
            dispatchNestedFling(i, i2, canScrollVertical);
            AbstractC02364f abstractC02364f = this.A0g;
            if (abstractC02364f != null) {
                boolean canScrollHorizontal2 = abstractC02364f.A0B(i, i2);
                if (canScrollHorizontal2) {
                    return true;
                }
            }
            if (canScrollVertical) {
                int i3 = 0;
                if (A24) {
                    i3 = 0 | 1;
                }
                if (canScroll) {
                    i3 |= 2;
                }
                A1x(i3, 1);
                int i4 = this.A0x;
                int nestedScrollAxis = -i4;
                int max = Math.max(nestedScrollAxis, Math.min(i, i4));
                int i5 = this.A0x;
                int nestedScrollAxis2 = -i5;
                this.A08.A09(max, Math.max(nestedScrollAxis2, Math.min(i2, i5)));
                return true;
            }
        }
        return false;
    }

    private final boolean A13(int i, int i2, MotionEvent motionEvent) {
        int unconsumedY = 0;
        int consumedX = 0;
        int i3 = 0;
        int unconsumedX = 0;
        A1J();
        if (this.A04 != null) {
            A1K();
            A1L();
            C01852e.A01(A0I(1361, 9, 75));
            A1m(this.A0s);
            if (i != 0) {
                i3 = this.A06.A1h(i, this.A0r, this.A0s);
                unconsumedY = i - i3;
            }
            if (i2 != 0) {
                unconsumedX = this.A06.A1i(i2, this.A0r, this.A0s);
                consumedX = i2 - unconsumedX;
            }
            C01852e.A00();
            A1P();
            A1M();
            A1s(false);
        }
        if (!this.A0v.isEmpty()) {
            invalidate();
        }
        if (A1y(i3, unconsumedX, unconsumedY, consumedX, this.A17, 0)) {
            int i4 = this.A0S;
            int[] iArr = this.A17;
            int i5 = iArr[0];
            this.A0S = i4 - i5;
            int i6 = this.A0T;
            int i7 = iArr[1];
            this.A0T = i6 - i7;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i5, i7);
            }
            int[] iArr2 = this.A15;
            int i8 = iArr2[0];
            int[] iArr3 = this.A17;
            int i9 = i8 + iArr3[0];
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            A19[1] = "TzjapWGLjdNwrlMHhQTvw0KTjubTnl9R";
            iArr2[0] = i9;
            iArr2[1] = iArr2[1] + iArr3[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C02032x.A00(motionEvent, 8194)) {
                float x = motionEvent.getX();
                float f = unconsumedY;
                float y = motionEvent.getY();
                float f2 = consumedX;
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                A19[1] = "Rb7Wd2rB1Bk4FJnk1H23iqiZozoKDKpI";
                A0j(x, f, y, f2);
            }
            A1a(i, i2);
        }
        if (i3 != 0 || unconsumedX != 0) {
            A1c(i3, unconsumedX);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i3 == 0 && unconsumedX == 0) ? false : true;
    }

    private boolean A14(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.A0h != null) {
            if (action == 0) {
                this.A0h = null;
            } else {
                if (action == 3 || action == 1) {
                    this.A0h = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int i = this.A13.size();
            for (int i2 = 0; i2 < i; i2++) {
                InterfaceC02374g interfaceC02374g = this.A13.get(i2);
                if (interfaceC02374g.onInterceptTouchEvent(this, motionEvent)) {
                    this.A0h = interfaceC02374g;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean A15(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.A0h = null;
        }
        int i = this.A13.size();
        for (int listenerCount = 0; listenerCount < i; listenerCount++) {
            InterfaceC02374g interfaceC02374g = this.A13.get(listenerCount);
            if (interfaceC02374g.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.A0h = interfaceC02374g;
                return true;
            }
        }
        return false;
    }

    private boolean A16(View view, View view2, int i) {
        int absHorizontal;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i == 2 || i == 1) {
            boolean z = this.A06.A0a() == 1;
            boolean rtl = i == 2;
            if (rtl ^ z) {
                absHorizontal = 66;
            } else {
                absHorizontal = 17;
            }
            if (A17(view, view2, absHorizontal)) {
                return true;
            }
            if (i == 2) {
                return A17(view, view2, 130);
            }
            return A17(view, view2, 33);
        }
        return A17(view, view2, i);
    }

    private boolean A17(View view, View view2, int i) {
        this.A0p.set(0, 0, view.getWidth(), view.getHeight());
        this.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.A0p);
        offsetDescendantRectToMyCoords(view2, this.A0z);
        switch (i) {
            case 17:
                return (this.A0p.right > this.A0z.right || this.A0p.left >= this.A0z.right) && this.A0p.left > this.A0z.left;
            case 33:
                return (this.A0p.bottom > this.A0z.bottom || this.A0p.top >= this.A0z.bottom) && this.A0p.top > this.A0z.top;
            case 66:
                int i2 = this.A0p.left;
                String[] strArr = A19;
                if (strArr[2].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[3] = "H3chOpt4vkJfacRirYduge";
                strArr2[0] = "3wUmDedSMI";
                return (i2 < this.A0z.left || this.A0p.right <= this.A0z.left) && this.A0p.right < this.A0z.right;
            case 130:
                return (this.A0p.top < this.A0z.top || this.A0p.bottom <= this.A0z.top) && this.A0p.bottom < this.A0z.bottom;
            default:
                throw new IllegalArgumentException(A0I(1844, 37, 102) + i + A1I());
        }
    }

    private final boolean A18(AccessibilityEvent accessibilityEvent) {
        if (A1v()) {
            int i = 0;
            if (accessibilityEvent != null) {
                i = C02063a.A00(accessibilityEvent);
            }
            if (i == 0) {
                i = 0;
            }
            int type = this.A0P;
            this.A0P = type | i;
            return true;
        }
        return false;
    }

    public final int A1B(View view) {
        AbstractC02504u holder = A0F(view);
        if (holder != null) {
            return holder.A0I();
        }
        return -1;
    }

    public final int A1C(AbstractC02504u abstractC02504u) {
        if (!abstractC02504u.A0k(524) && abstractC02504u.A0a()) {
            return this.A00.A0E(abstractC02504u.A03);
        }
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "S0wUd1";
        strArr[7] = "zF1SY7WsjbFG";
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r3 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Rect A1D(View view) {
        C02344d c02344d = (C02344d) view.getLayoutParams();
        if (!c02344d.A01) {
            return c02344d.A03;
        }
        if (this.A0s.A07()) {
            if (!c02344d.A01()) {
                boolean A03 = c02344d.A03();
                if (A19[5].charAt(2) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[6] = "R8RZJpxNRYJLmE7KdaIYiTLeL7r3Y7bS";
                strArr[4] = "BRrnvNJfpVwihHaR5a5gEdBxu0vp26qH";
            }
            return c02344d.A03;
        }
        Rect rect = c02344d.A03;
        rect.set(0, 0, 0, 0);
        int decorCount = this.A0v.size();
        for (int i = 0; i < decorCount; i++) {
            this.A0p.set(0, 0, 0, 0);
            C4Z c4z = this.A0v.get(i);
            Rect insets = this.A0p;
            c4z.A01(insets, view, this, this.A0s);
            rect.left += this.A0p.left;
            rect.top += this.A0p.top;
            rect.right += this.A0p.right;
            rect.bottom += this.A0p.bottom;
        }
        c02344d.A01 = false;
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View A1E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final AbstractC02504u A1F(int i) {
        if (this.A0C) {
            return null;
        }
        int A06 = this.A01.A06();
        AbstractC02504u hidden = null;
        for (int i2 = 0; i2 < A06; i2++) {
            AbstractC02504u A0F = A0F(this.A01.A0A(i2));
            if (A0F != null && !A0F.A0c()) {
                int childCount = A1C(A0F);
                if (childCount != i) {
                    continue;
                } else if (this.A01.A0K(A0F.A0H)) {
                    hidden = A0F;
                } else {
                    return A0F;
                }
            }
        }
        return hidden;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC02504u A1G(int i, boolean z) {
        int charAt;
        int childCount;
        int A06 = this.A01.A06();
        AbstractC02504u hidden = null;
        for (int i2 = 0; i2 < A06; i2++) {
            AbstractC02504u A0F = A0F(this.A01.A0A(i2));
            if (A0F != null && !A0F.A0c()) {
                if (z) {
                    int childCount2 = A0F.A03;
                    if (childCount2 != i) {
                        continue;
                    }
                    AnonymousClass40 anonymousClass40 = this.A01;
                    View view = A0F.A0H;
                    String[] strArr = A19;
                    String str = strArr[6];
                    String str2 = strArr[4];
                    charAt = str.charAt(17);
                    childCount = str2.charAt(17);
                    if (charAt == childCount) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[6] = "j0pgcyCAMmCuelBFBaEKhw82BLWYdvOX";
                    strArr2[4] = "bxiKg4TrHtXBSvyNTaSo7IOhyUGlGIW4";
                    if (anonymousClass40.A0K(view)) {
                        hidden = A0F;
                    } else {
                        return A0F;
                    }
                } else {
                    int childCount3 = A0F.A0I();
                    if (childCount3 != i) {
                        continue;
                    }
                    AnonymousClass40 anonymousClass402 = this.A01;
                    View view2 = A0F.A0H;
                    String[] strArr3 = A19;
                    String str3 = strArr3[6];
                    String str22 = strArr3[4];
                    charAt = str3.charAt(17);
                    childCount = str22.charAt(17);
                    if (charAt == childCount) {
                    }
                }
            }
        }
        return hidden;
    }

    public final AbstractC02504u A1H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A0F(view);
        }
        throw new IllegalArgumentException(A0I(1826, 5, 56) + view + A0I(98, 26, 127) + this);
    }

    public final String A1I() {
        return A0I(0, 1, 65) + super.toString() + A0I(Opcodes.RET, 10, 82) + this.A04 + A0I(Opcodes.ANEWARRAY, 9, 71) + this.A06 + A0I(Opcodes.PUTSTATIC, 10, 10) + getContext();
    }

    public final void A1J() {
        boolean z = this.A0D;
        String A0I = A0I(1313, 17, 94);
        if (!z || this.A0C) {
            C01852e.A01(A0I);
            A0Y();
            C01852e.A00();
            return;
        }
        if (!this.A00.A0J()) {
            return;
        }
        if (this.A00.A0L(4)) {
            boolean A0L = this.A00.A0L(11);
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "e84NaKOnn7I9zpRn8aasqpcOMtbsg9mo";
            strArr[4] = "iuEMZhfSQYSf3gJ7Ya7A7FZe771rQXKi";
            if (!A0L) {
                C01852e.A01(A0I(1341, 20, 82));
                A1K();
                A1L();
                this.A00.A0H();
                if (!this.A0J) {
                    if (A0y()) {
                        A0Y();
                    } else {
                        this.A00.A0F();
                    }
                }
                A1s(true);
                A1M();
                C01852e.A00();
                return;
            }
        }
        if (this.A00.A0J()) {
            C01852e.A01(A0I);
            A0Y();
            C01852e.A00();
        }
    }

    public final void A1K() {
        int i = this.A0O + 1;
        this.A0O = i;
        if (i == 1 && !this.A0I) {
            this.A0J = false;
        }
    }

    public final void A1L() {
        this.A0U++;
    }

    public final void A1M() {
        A1r(true);
    }

    public final void A1N() {
        if (!this.A0K && this.A0F) {
            C3H.A0D(this, this.A0k);
            this.A0K = true;
        }
    }

    public final void A1O() {
        C4Y c4y = this.A05;
        if (c4y != null) {
            c4y.A0I();
        }
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null) {
            abstractC02334c.A1I(this.A0r);
            this.A06.A1G(this.A0r);
        }
        this.A0r.A0P();
    }

    public final void A1P() {
        int A05 = this.A01.A05();
        for (int i = 0; i < A05; i++) {
            View view = this.A01.A09(i);
            AbstractC02504u A1H2 = A1H(view);
            if (A1H2 != null && A1H2.A07 != null) {
                View view2 = A1H2.A07.A0H;
                int left = view.getLeft();
                int top = view.getTop();
                int count = view2.getLeft();
                if (left == count) {
                    int count2 = view2.getTop();
                    if (top == count2) {
                        continue;
                    }
                }
                int width = view2.getWidth();
                String[] strArr = A19;
                String str = strArr[2];
                String str2 = strArr[7];
                int i2 = str.length();
                int count3 = str2.length();
                if (i2 == count3) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[3] = "Uubm7UlJXcXPQblsDCbwus";
                strArr2[0] = "kvvVMTFBun";
                int count4 = view2.getHeight();
                view2.layout(left, top, width + left, count4 + top);
            }
        }
    }

    public final void A1Q() {
        this.A0C = true;
        A0h();
    }

    public final void A1R() {
        List<AbstractC02384h> list = this.A0m;
        if (list != null) {
            list.clear();
        }
    }

    public final void A1S() {
        setScrollState(0);
        A0V();
    }

    public final void A1T(int i) {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null) {
            return;
        }
        abstractC02334c.A1t(i);
        awakenScrollBars();
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "0QEBPr";
        strArr[7] = "MYIDRbA0xlXg";
    }

    public final void A1U(int i) {
        int A05 = this.A01.A05();
        for (int i2 = 0; i2 < A05; i2++) {
            this.A01.A09(i2).offsetLeftAndRight(i);
        }
    }

    public final void A1V(int i) {
        int A05 = this.A01.A05();
        for (int i2 = 0; i2 < A05; i2++) {
            this.A01.A09(i2).offsetTopAndBottom(i);
        }
    }

    public final void A1W(int i) {
        if (this.A0I) {
            return;
        }
        A1S();
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null) {
            String A0I = A0I(1370, 12, 79);
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "bKq2dxkRCeugdKx9Xa6GvrcP2g1fh08B";
            strArr2[4] = "kU2aPHyT0THRQATybaGwdbwAtHBBu9qc";
            Log.e(A0I, A0I(740, 94, 69));
            return;
        }
        abstractC02334c.A1t(i);
        awakenScrollBars();
    }

    public final void A1X(int i) {
        if (this.A0I) {
            return;
        }
        AbstractC02334c abstractC02334c = this.A06;
        String[] strArr = A19;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[6] = "WdHf0lV4QkHUB6jMNa4hJVyYAF4qnaeC";
        strArr2[4] = "5gGhKJie0DBDDFfkhapEv4fZOrT4upMj";
        if (abstractC02334c != null) {
            abstractC02334c.A21(this, this.A0s, i);
            return;
        }
        String[] strArr3 = A19;
        if (strArr3[6].charAt(17) != strArr3[4].charAt(17)) {
            String[] strArr4 = A19;
            strArr4[6] = "tnW8WJDd0hyAXA7zkanproBVQy0r1bMC";
            strArr4[4] = "4Fp0w8uFB0Hn5lDXLaIQvmhL07bdVyXH";
            Log.e(A0I(1370, 10, 13), A0I(858, 46, 16));
            return;
        }
        String[] strArr5 = A19;
        strArr5[3] = "z3A7CLBHtBtrAEYqxn9jPo";
        strArr5[0] = "loKczzo2gT";
        Log.e(A0I(1370, 12, 79), A0I(924, 97, 75));
    }

    public final void A1Y(int i) {
        getScrollingChildHelper().A03(i);
    }

    public final void A1Z(int i, int i2) {
        if (i < 0) {
            A0b();
            this.A0a.onAbsorb(-i);
        } else if (i > 0) {
            A0c();
            this.A0b.onAbsorb(i);
        }
        if (i2 < 0) {
            A0d();
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            A19[1] = "gyhAwDIMjNJoK3bJ2ki6wxmL7XFPannX";
            this.A0c.onAbsorb(-i2);
        } else if (i2 > 0) {
            A0a();
            this.A0Z.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C3H.A07(this);
        }
    }

    public final void A1a(int i, int i2) {
        boolean z = false;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null) {
            boolean needsInvalidate = edgeEffect.isFinished();
            if (!needsInvalidate && i > 0) {
                this.A0a.onRelease();
                z = this.A0a.isFinished();
            }
        }
        EdgeEffect edgeEffect2 = this.A0b;
        if (edgeEffect2 != null) {
            boolean needsInvalidate2 = edgeEffect2.isFinished();
            if (!needsInvalidate2 && i < 0) {
                this.A0b.onRelease();
                boolean needsInvalidate3 = this.A0b.isFinished();
                z |= needsInvalidate3;
            }
        }
        EdgeEffect edgeEffect3 = this.A0c;
        if (edgeEffect3 != null) {
            boolean needsInvalidate4 = edgeEffect3.isFinished();
            if (!needsInvalidate4 && i2 > 0) {
                EdgeEffect edgeEffect4 = this.A0c;
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[3] = "CkvbraPTkuNHVjG6c5toq1";
                strArr[0] = "anwNoWvWLV";
                edgeEffect4.onRelease();
                boolean needsInvalidate5 = this.A0c.isFinished();
                z |= needsInvalidate5;
            }
        }
        EdgeEffect edgeEffect5 = this.A0Z;
        if (edgeEffect5 != null) {
            boolean needsInvalidate6 = edgeEffect5.isFinished();
            if (!needsInvalidate6 && i2 < 0) {
                this.A0Z.onRelease();
                boolean needsInvalidate7 = this.A0Z.isFinished();
                z |= needsInvalidate7;
            }
        }
        if (z) {
            C3H.A07(this);
        }
    }

    public final void A1b(int i, int i2) {
        int A00 = AbstractC02334c.A00(i, getPaddingLeft() + getPaddingRight(), C3H.A03(this));
        int paddingTop = getPaddingTop();
        int width = getPaddingBottom();
        int i3 = paddingTop + width;
        int width2 = C3H.A02(this);
        setMeasuredDimension(A00, AbstractC02334c.A00(i2, i3, width2));
    }

    public final void A1c(int i, int i2) {
        this.A0N++;
        int scrollY = getScrollX();
        int scrollX = getScrollY();
        onScrollChanged(scrollY, scrollX, scrollY, scrollX);
        AbstractC02384h abstractC02384h = this.A0i;
        if (abstractC02384h != null) {
            abstractC02384h.A0M(this, i, i2);
        }
        List<AbstractC02384h> list = this.A0m;
        if (list != null) {
            for (int scrollY2 = list.size() - 1; scrollY2 >= 0; scrollY2--) {
                this.A0m.get(scrollY2).A0M(this, i, i2);
            }
        }
        this.A0N--;
    }

    public final void A1d(int i, int i2) {
        int A06 = this.A01.A06();
        for (int i3 = 0; i3 < A06; i3++) {
            AbstractC02504u A0F = A0F(this.A01.A0A(i3));
            if (A0F != null && !A0F.A0h()) {
                int i4 = A0F.A03;
                int i5 = A19[5].charAt(2);
                if (i5 != 89) {
                    throw new RuntimeException();
                }
                A19[1] = "WfIl2QLxhpsV1cZ5bwDa0wyCBTSIuEWm";
                if (i4 >= i) {
                    A0F.A0W(i2, false);
                    this.A0s.A0D = true;
                }
            }
        }
        this.A0r.A0R(i, i2);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r10 == r12) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r0 = r13 - r12;
        r9.A0W(r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r9.A0W(r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r10 == r12) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int A06 = this.A01.A06();
        if (i < i2) {
            i3 = i;
            i4 = i2;
            i5 = -1;
        } else {
            i3 = i2;
            i4 = i;
            i5 = 1;
        }
        for (int inBetweenOffset = 0; inBetweenOffset < A06; inBetweenOffset++) {
            AbstractC02504u A0F = A0F(this.A01.A0A(inBetweenOffset));
            int start = A19[5].charAt(2);
            if (start != 89) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[2] = "SA2Eyd";
            strArr[7] = "XMtlHmP9rGs3";
            if (A0F != null) {
                int childCount = A0F.A03;
                if (childCount >= i3) {
                    int childCount2 = A0F.A03;
                    if (childCount2 <= i4) {
                        int i6 = A0F.A03;
                        String[] strArr2 = A19;
                        String str = strArr2[6];
                        String str2 = strArr2[4];
                        int start2 = str.charAt(17);
                        int childCount3 = str2.charAt(17);
                        if (start2 == childCount3) {
                            String[] strArr3 = A19;
                            strArr3[6] = "BcaezuMb6aDfAWKozakh45MfYrs0kuIc";
                            strArr3[4] = "5erwLY6dW1OUzDMynaZgWLcHWlHtC3ze";
                        }
                        this.A0s.A0D = true;
                    }
                }
            }
        }
        this.A0r.A0S(i, i2);
        requestLayout();
    }

    public final void A1f(int i, int i2) {
        A0l(i, i2, null);
    }

    public final void A1g(int i, int i2, Object obj) {
        int A06 = this.A01.A06();
        int i3 = i + i2;
        for (int i4 = 0; i4 < A06; i4++) {
            View A0A = this.A01.A0A(i4);
            AbstractC02504u A0F = A0F(A0A);
            if (A0F != null && !A0F.A0h()) {
                int i5 = A0F.A03;
                int positionEnd = A19[1].length();
                if (positionEnd != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[2] = "87XYbE";
                strArr[7] = "GV1T0vfadOcw";
                if (i5 >= i) {
                    int childCount = A0F.A03;
                    if (childCount < i3) {
                        A0F.A0T(2);
                        A0F.A0Y(obj);
                        ((C02344d) A0A.getLayoutParams()).A01 = true;
                    }
                }
            }
        }
        this.A0r.A0T(i, i2);
    }

    public final void A1h(int i, int i2, boolean z) {
        int i3 = i + i2;
        int A06 = this.A01.A06();
        for (int i4 = 0; i4 < A06; i4++) {
            AbstractC02504u A0F = A0F(this.A01.A0A(i4));
            if (A0F != null && !A0F.A0h()) {
                int positionEnd = A0F.A03;
                if (positionEnd >= i3) {
                    int positionEnd2 = -i2;
                    A0F.A0W(positionEnd2, z);
                    this.A0s.A0D = true;
                } else {
                    int positionEnd3 = A0F.A03;
                    if (positionEnd3 >= i) {
                        int childCount = i - 1;
                        int positionEnd4 = -i2;
                        A0F.A0V(childCount, positionEnd4, z);
                        int childCount2 = A19[1].length();
                        if (childCount2 != 32) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A19;
                        strArr[2] = "dcjb0S";
                        strArr[7] = "CcIDXd599Ygw";
                        this.A0s.A0D = true;
                    } else {
                        continue;
                    }
                }
            }
        }
        this.A0r.A0U(i, i2, z);
        requestLayout();
    }

    public final void A1i(View view) {
        int cnt;
        A0F(view);
        C4Q c4q = this.A04;
        List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[5] = "qDYnzfveQxKkK3O0opuqDthRtcgsED9a";
        if (list != null && list.size() - 1 >= 0) {
            this.A0l.get(cnt);
            throw new NullPointerException(A0I(1881, 27, 18));
        }
    }

    public final void A1j(View view) {
        int cnt;
        A0F(view);
        C4Q c4q = this.A04;
        if (this.A0l != null && r0.size() - 1 >= 0) {
            this.A0l.get(cnt);
            throw new NullPointerException(A0I(1908, 29, 20));
        }
    }

    public final void A1k(AbstractC02384h abstractC02384h) {
        if (this.A0m == null) {
            this.A0m = new ArrayList();
        }
        this.A0m.add(abstractC02384h);
    }

    public final void A1l(AbstractC02384h abstractC02384h) {
        List<AbstractC02384h> list = this.A0m;
        if (list != null) {
            list.remove(abstractC02384h);
        }
    }

    public final void A1m(C02474r c02474r) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A08.A01;
            c02474r.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            c02474r.A07 = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c02474r.A06 = 0;
            c02474r.A07 = 0;
        }
    }

    public final void A1n(AbstractC02504u abstractC02504u, C4X c4x) {
        abstractC02504u.A0U(0, 8192);
        if (this.A0s.A0E && abstractC02504u.A0f() && !abstractC02504u.A0c() && !abstractC02504u.A0h()) {
            this.A0t.A08(A0C(abstractC02504u), abstractC02504u);
        }
        this.A0t.A0F(abstractC02504u, c4x);
    }

    public final void A1o(AbstractC02504u abstractC02504u, C4X c4x, C4X c4x2) {
        abstractC02504u.A0Z(false);
        if (this.A05.A0E(abstractC02504u, c4x, c4x2)) {
            A1N();
        }
    }

    public final void A1p(AbstractC02504u abstractC02504u, C4X c4x, C4X c4x2) {
        A0r(abstractC02504u);
        abstractC02504u.A0Z(false);
        if (this.A05.A0F(abstractC02504u, c4x, c4x2)) {
            A1N();
        }
    }

    public final void A1q(String str) {
        if (A1v()) {
            if (str == null) {
                throw new IllegalStateException(A0I(574, 77, 49) + A1I());
            }
            throw new IllegalStateException(str);
        }
        if (this.A0N > 0) {
            Log.w(A0I(1370, 12, 79), A0I(294, 280, 24), new IllegalStateException(A0I(0, 0, 62) + A1I()));
        }
    }

    public final void A1r(boolean z) {
        int i = this.A0U - 1;
        this.A0U = i;
        if (i < 1) {
            this.A0U = 0;
            if (z) {
                A0K();
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[6] = "clcdgLago0QzUCUQna9RqUvMnx3zufId";
                strArr[4] = "dGTmnJIudyc2xKqsUaVYnInX4VXDIHXZ";
                A0Z();
            }
        }
    }

    public final void A1s(boolean z) {
        if (this.A0O < 1) {
            this.A0O = 1;
        }
        if (!z) {
            this.A0J = false;
        }
        if (this.A0O == 1) {
            if (z && this.A0J && !this.A0I && this.A06 != null && this.A04 != null) {
                A0Y();
            }
            if (!this.A0I) {
                this.A0J = false;
            }
        }
        this.A0O--;
    }

    public final boolean A1t() {
        AccessibilityManager accessibilityManager = this.A10;
        if (accessibilityManager != null) {
            boolean isEnabled = accessibilityManager.isEnabled();
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            A19[5] = "qqYNnQooq1iBe19qNxONRBmcR9jcXf5d";
            if (isEnabled) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1u() {
        return !this.A0D || this.A0C || this.A00.A0J();
    }

    public final boolean A1v() {
        return this.A0U > 0;
    }

    public final boolean A1w(int i) {
        return getScrollingChildHelper().A09(i);
    }

    public final boolean A1x(int i, int i2) {
        return getScrollingChildHelper().A0B(i, i2);
    }

    public final boolean A1y(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().A0D(i, i2, i3, i4, iArr, i5);
    }

    public final boolean A1z(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().A0F(i, i2, iArr, iArr2, i3);
    }

    public final boolean A20(View view) {
        A1K();
        boolean A0L = this.A01.A0L(view);
        if (A0L) {
            AbstractC02504u viewHolder = A0F(view);
            this.A0r.A0c(viewHolder);
            this.A0r.A0b(viewHolder);
        }
        boolean removed = !A0L;
        A1s(removed);
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[3] = "2BT72D7B0XXfHPWJs3DbS8";
        strArr[0] = "RgGvPpmRJD";
        return A0L;
    }

    public final boolean A21(AbstractC02504u abstractC02504u) {
        C4Y c4y = this.A05;
        return c4y == null || c4y.A0M(abstractC02504u, abstractC02504u.A0L());
    }

    public final boolean A22(AbstractC02504u abstractC02504u, int i) {
        if (A1v()) {
            abstractC02504u.A02 = i;
            this.A0w.add(abstractC02504u);
            return false;
        }
        C3H.A09(abstractC02504u.A0H, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null) {
            boolean A1g = abstractC02334c.A1g(this, arrayList, i, i2);
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[2] = "qzNrCd";
            strArr[7] = "bMAkXN6Kp1Dd";
            if (A1g) {
                return;
            }
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C02344d) && this.A06.A1c((C02344d) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null && abstractC02334c.A24()) {
            return this.A06.A1j(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null && abstractC02334c.A24()) {
            return this.A06.A1k(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null) {
            return 0;
        }
        boolean A24 = abstractC02334c.A24();
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[1] = "GzwOa56ahdwGOmec9vc3XIggLcxaXOnz";
        if (A24) {
            return this.A06.A1l(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null) {
            return 0;
        }
        boolean A25 = abstractC02334c.A25();
        String[] strArr = A19;
        if (strArr[3].length() != strArr[0].length()) {
            String[] strArr2 = A19;
            strArr2[2] = "Wsbuah";
            strArr2[7] = "lDl9g1VSjrmk";
            if (!A25) {
                return 0;
            }
            AbstractC02334c abstractC02334c2 = this.A06;
            String[] strArr3 = A19;
            if (strArr3[3].length() != strArr3[0].length()) {
                A19[5] = "sfYwg45p3roym5legx720iFNlg07mmUN";
                return abstractC02334c2.A1m(this.A0s);
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null && abstractC02334c.A25()) {
            return this.A06.A1n(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null || !abstractC02334c.A25()) {
            return 0;
        }
        AbstractC02334c abstractC02334c2 = this.A06;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[6] = "NPPquBudgt65Kfhzva46C14iIBYgw5ng";
        strArr[4] = "gzaMlk0wrsXS1BjbnaI8sjsGlzE0u55w";
        return abstractC02334c2.A1o(this.A0s);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A08(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A07(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A0C(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0126, code lost:
    
        if (r3.A0L() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0128, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        if (r3.A0L() != false) goto L67;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int count;
        super.draw(canvas);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0v.get(i);
        }
        int padding = 0;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int restore = canvas.save();
            int paddingBottom = this.A0B ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            int count2 = getHeight();
            canvas.translate((-count2) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A0a;
            padding = (edgeEffect2 == null || !edgeEffect2.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(restore);
        }
        EdgeEffect edgeEffect3 = this.A0c;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int restore2 = canvas.save();
            if (this.A0B) {
                int count3 = getPaddingLeft();
                float f = count3;
                int count4 = getPaddingTop();
                canvas.translate(f, count4);
            }
            EdgeEffect edgeEffect4 = this.A0c;
            int count5 = (edgeEffect4 == null || !edgeEffect4.draw(canvas)) ? 0 : 1;
            padding |= count5;
            canvas.restoreToCount(restore2);
        }
        EdgeEffect edgeEffect5 = this.A0b;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save = canvas.save();
            int restore3 = getWidth();
            int paddingTop = this.A0B ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            int count6 = -paddingTop;
            float f2 = count6;
            int count7 = -restore3;
            canvas.translate(f2, count7);
            EdgeEffect edgeEffect6 = this.A0b;
            if (edgeEffect6 != null) {
                boolean draw = edgeEffect6.draw(canvas);
                String[] strArr = A19;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int count8 = str2.length();
                if (length == count8) {
                    throw new RuntimeException();
                }
                A19[5] = "ItYbouux6ivob9pa5cwYanZ1Qwg84bbh";
                if (draw) {
                    count = 1;
                    padding |= count;
                    canvas.restoreToCount(save);
                }
            }
            count = 0;
            padding |= count;
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect7 = this.A0Z;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save2 = canvas.save();
            canvas.rotate(180.0f);
            if (this.A0B) {
                int count9 = getWidth();
                int i2 = -count9;
                int count10 = getPaddingRight();
                float f3 = i2 + count10;
                int count11 = getHeight();
                int i3 = -count11;
                int count12 = getPaddingBottom();
                canvas.translate(f3, i3 + count12);
            } else {
                int count13 = getWidth();
                float f4 = -count13;
                int count14 = getHeight();
                canvas.translate(f4, -count14);
            }
            EdgeEffect edgeEffect8 = this.A0Z;
            padding |= (edgeEffect8 == null || !edgeEffect8.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(save2);
        }
        if (padding == 0 && this.A05 != null) {
            int count15 = this.A0v.size();
            if (count15 > 0) {
                C4Y c4y = this.A05;
                if (A19[5].charAt(2) == 'Y') {
                    A19[5] = "slYCg9imVkQI2IB5irC0agqTwBjTAdyw";
                }
            }
        }
        if (padding != 0) {
            C3H.A07(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b6  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        boolean z;
        FocusFinder focusFinder;
        View findNextFocus;
        int i2;
        View result = this.A06.A0u(view, i);
        if (result != null) {
            return result;
        }
        if (this.A04 != null) {
            AbstractC02334c abstractC02334c = this.A06;
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "RhZxCClAx00iKsBYiNgalY";
            strArr2[0] = "xpwAZ9hAV8";
            if (abstractC02334c != null && !A1v() && !this.A0I) {
                z = true;
                focusFinder = FocusFinder.getInstance();
                if (!z && (i == 2 || i == 1)) {
                    int absDir = 0;
                    if (this.A06.A25()) {
                        int i3 = i == 2 ? 130 : 33;
                        absDir = focusFinder.findNextFocus(this, view, i3) == null ? 1 : 0;
                        if (A1F) {
                            i = i3;
                        }
                    }
                    if (absDir == 0 && this.A06.A24()) {
                        boolean canRunFocusFailure = this.A06.A0a() == 1;
                        if ((i == 2) ^ canRunFocusFailure) {
                            i2 = 66;
                        } else {
                            i2 = 17;
                        }
                        absDir = focusFinder.findNextFocus(this, view, i2) != null ? 0 : 1;
                        if (A1F) {
                            i = i2;
                        }
                    }
                    if (absDir != 0) {
                        A1J();
                        if (A1E(view) == null) {
                            return null;
                        }
                        A1K();
                        this.A06.A1r(view, i, this.A0r, this.A0s);
                        A1s(false);
                    }
                    findNextFocus = focusFinder.findNextFocus(this, view, i);
                } else {
                    findNextFocus = focusFinder.findNextFocus(this, view, i);
                    if (findNextFocus == null && z) {
                        A1J();
                        if (A1E(view) != null) {
                            return null;
                        }
                        A1K();
                        findNextFocus = this.A06.A1r(view, i, this.A0r, this.A0s);
                        A1s(false);
                    }
                }
                if (findNextFocus != null || findNextFocus.hasFocusable()) {
                    return !A16(view, findNextFocus, i) ? findNextFocus : super.focusSearch(view, i);
                }
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                A0p(findNextFocus, null);
                return view;
            }
        }
        z = false;
        focusFinder = FocusFinder.getInstance();
        if (!z) {
        }
        findNextFocus = focusFinder.findNextFocus(this, view, i);
        if (findNextFocus == null) {
            A1J();
            if (A1E(view) != null) {
            }
        }
        if (findNextFocus != null) {
        }
        if (!A16(view, findNextFocus, i)) {
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null) {
            return abstractC02334c.A1s();
        }
        throw new IllegalStateException(A0I(1475, 33, 17) + A1I());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null) {
            return abstractC02334c.A0v(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0I(1475, 33, 17) + A1I());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null) {
            C02344d A0w = abstractC02334c.A0w(layoutParams);
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "4uZ9QAUZcjEo06EXHPHPN1";
            strArr[0] = "ePNmh1lbEA";
            return A0w;
        }
        throw new IllegalStateException(A0I(1475, 33, 17) + A1I());
    }

    public C4Q getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null) {
            int A0V = abstractC02334c.A0V();
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            A19[1] = "WUntfQVcja1qFzj09nDprclvV6sI7lKs";
            return A0V;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        C4T c4t = this.A0e;
        if (c4t == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return c4t.onGetChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public C0992Yz getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public C4Y getItemAnimator() {
        return this.A05;
    }

    public AbstractC02334c getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC02364f getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public C4j getRecycledViewPool() {
        return this.A0r.A0H();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private C02052z getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new C02052z(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A05();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0U = 0;
        boolean z = true;
        this.A0F = true;
        if (!this.A0D || isLayoutRequested()) {
            z = false;
        }
        this.A0D = z;
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null) {
            abstractC02334c.A1N(this);
        }
        this.A0K = false;
        if (A1E) {
            C4D c4d = C4D.A07.get();
            this.A03 = c4d;
            if (c4d == null) {
                this.A03 = new C4D();
                Display A04 = C3H.A04(this);
                float f = 60.0f;
                if (!isInEditMode() && A04 != null) {
                    float refreshRate = A04.getRefreshRate();
                    String[] strArr = A19;
                    if (strArr[2].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[3] = "HPKMSTrO6rgllPECADdom7";
                    strArr2[0] = "yPSN9KqlOS";
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.A03.A00 = (long) (1.0E9f / f);
                C4D.A07.set(this.A03);
            }
            this.A03.A09(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C4D c4d;
        super.onDetachedFromWindow();
        C4Y c4y = this.A05;
        if (c4y != null) {
            c4y.A0I();
        }
        A1S();
        this.A0F = false;
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c != null) {
            abstractC02334c.A1U(this, this.A0r);
        }
        this.A0w.clear();
        removeCallbacks(this.A0k);
        this.A0t.A07();
        if (A1E && (c4d = this.A03) != null) {
            c4d.A0A(this);
            this.A03 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0v.get(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if ((r4 & 4194304) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r1 = r7.getAxisValue(26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r6.A06.A25() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        r0 = -r1;
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (r6.A06.A24() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        r0 = 0.0f;
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        r0 = 0.0f;
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if ((r4 & 4194304) != 0) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float vScroll;
        float f;
        if (this.A06 == null) {
            return false;
        }
        boolean z = this.A0I;
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "hfCCVZ";
        strArr[7] = "6Rxn0wTGDCgs";
        if (!z && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.A06.A25()) {
                    vScroll = -motionEvent.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.A06.A24()) {
                    f = motionEvent.getAxisValue(10);
                } else {
                    f = 0.0f;
                }
            } else {
                int source = motionEvent.getSource();
                if (A19[5].charAt(2) == 'Y') {
                    A19[5] = "SrYzqcFycO4E61WX0CCI79FBiQDWLxq8";
                }
            }
            if (vScroll != 0.0f || f != 0.0f) {
                float hScroll = this.A0L;
                A13((int) (hScroll * f), (int) (this.A0M * vScroll), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0146, code lost:
    
        if (r10.A0W != 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0148, code lost:
    
        r1 = r6 - r10.A0Q;
        r5 = r7 - r10.A0R;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0151, code lost:
    
        if (r9 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0159, code lost:
    
        if (java.lang.Math.abs(r1) <= r10.A0X) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
    
        r10.A0S = r6;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x015e, code lost:
    
        if (r8 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0166, code lost:
    
        if (java.lang.Math.abs(r5) <= r10.A0X) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        r10.A0T = r7;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016b, code lost:
    
        if (r2 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016d, code lost:
    
        setScrollState(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017d, code lost:
    
        if (r10.A0W != 1) goto L47;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int index;
        if (this.A0I) {
            return false;
        }
        if (A15(motionEvent)) {
            A0J();
            return true;
        }
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null) {
            return false;
        }
        boolean A24 = abstractC02334c.A24();
        boolean A25 = this.A06.A25();
        if (this.A0Y == null) {
            this.A0Y = VelocityTracker.obtain();
        }
        this.A0Y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        String[] strArr = A19;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "Oz3Y31ex0QABqFtFM6aXix";
        strArr2[0] = "OpGO9pAa6R";
        switch (actionMasked) {
            case 0:
                boolean canScrollHorizontally = this.A0n;
                if (canScrollHorizontally) {
                    this.A0n = false;
                }
                this.A0V = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.A0S = x;
                this.A0Q = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.A0T = y;
                this.A0R = y;
                if (this.A0W == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                }
                int[] iArr = this.A15;
                iArr[1] = 0;
                iArr[0] = 0;
                int i = 0;
                if (A24) {
                    i = 0 | 1;
                }
                if (A25) {
                    i |= 2;
                }
                A1x(i, 0);
                break;
            case 1:
                VelocityTracker velocityTracker = this.A0Y;
                String[] strArr3 = A19;
                if (strArr3[6].charAt(17) != strArr3[4].charAt(17)) {
                    String[] strArr4 = A19;
                    strArr4[3] = "RX1lNzZl9PHDMcdVrAJc1B";
                    strArr4[0] = "i2qb1YAFuc";
                    velocityTracker.clear();
                    A1Y(0);
                    break;
                } else {
                    A19[1] = "VFVZbyoyfkMi6O34miIS2l4U7i7WEKsz";
                    velocityTracker.clear();
                    A1Y(0);
                    break;
                }
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.A0V);
                if (findPointerIndex < 0) {
                    Log.e(A0I(1370, 12, 79), A0I(1063, 46, 50) + this.A0V + A0I(124, 45, 46));
                    return false;
                }
                int nestedScrollAxis = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                float y2 = motionEvent.getY(findPointerIndex);
                String[] strArr5 = A19;
                if (strArr5[2].length() == strArr5[7].length()) {
                    A19[5] = "zyYUBzZDbxt5GKooJMB8Oo5URJ8cGTlk";
                    index = (int) (y2 + 0.5f);
                    break;
                } else {
                    String[] strArr6 = A19;
                    strArr6[3] = "bk8L2DuoR6rlGazYt8IaCt";
                    strArr6[0] = "Sc1G85HZiT";
                    index = (int) (y2 + 0.5f);
                    break;
                }
            case 3:
                A0J();
                break;
            case 5:
                this.A0V = motionEvent.getPointerId(actionIndex);
                int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.A0S = x2;
                this.A0Q = x2;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.A0T = y3;
                this.A0R = y3;
                break;
            case 6:
                A0n(motionEvent);
                break;
        }
        return this.A0W == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C01852e.A01(A0I(1330, 11, 86));
        A0Y();
        C01852e.A00();
        this.A0D = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        if (r3 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (r3 != false) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null) {
            A1b(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC02334c.A06) {
            int mode = View.MeasureSpec.getMode(i);
            int widthMode = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && widthMode == 1073741824) {
                z = true;
            }
            this.A06.A1J(this.A0r, this.A0s, i, i2);
            if (z || this.A04 == null) {
                return;
            }
            if (this.A0s.A04 == 1) {
                A0L();
            }
            this.A06.A11(i, i2);
            this.A0s.A0A = true;
            A0M();
            this.A06.A12(i, i2);
            if (this.A06.A23()) {
                this.A06.A11(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.A0s.A0A = true;
                A0M();
                this.A06.A12(i, i2);
                return;
            }
            return;
        }
        boolean z2 = this.A0E;
        String[] strArr = A19;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[6] = "KQlS07WJlXQIeKT2EaNKgCMREedmurGg";
        strArr2[4] = "TSw2akNEB1AJctHCwaDYxiu1Uwr65JPJ";
        if (z2) {
            this.A06.A1J(this.A0r, this.A0s, i, i2);
            return;
        }
        if (this.A0A) {
            A1K();
            A1L();
            A0P();
            A1M();
            if (this.A0s.A0B) {
                this.A0s.A09 = true;
            } else {
                this.A00.A0G();
                this.A0s.A09 = false;
            }
            this.A0A = false;
            A1s(false);
        } else {
            boolean z3 = this.A0s.A0B;
            if (A19[1].length() != 32) {
                String[] strArr3 = A19;
                strArr3[6] = "SNs0MIA5NFIkFiTpWaOkIZpcAnFttQ5E";
                strArr3[4] = "fXihHPq3ps5k4WwfOaG7U1bhyi9cbGtD";
            } else {
                String[] strArr4 = A19;
                strArr4[3] = "mxGjlxdGGYffeE2i6ToSoo";
                strArr4[0] = "9Nm63BEsB7";
            }
        }
        C4Q c4q = this.A04;
        if (c4q != null) {
            this.A0s.A03 = c4q.A0D();
        } else {
            this.A0s.A03 = 0;
        }
        A1K();
        this.A06.A1J(this.A0r, this.A0s, i, i2);
        A1s(false);
        this.A0s.A09 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (A1v()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof RecyclerView$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        RecyclerView$SavedState recyclerView$SavedState = (RecyclerView$SavedState) state;
        this.A0j = recyclerView$SavedState;
        super.onRestoreInstanceState(recyclerView$SavedState.A02());
        if (this.A06 != null && this.A0j.A00 != null) {
            this.A06.A1w(this.A0j.A00);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        RecyclerView$SavedState state = this.A0j;
        if (state != null) {
            recyclerView$SavedState.A03(state);
        } else {
            AbstractC02334c abstractC02334c = this.A06;
            if (abstractC02334c != null) {
                recyclerView$SavedState.A00 = abstractC02334c.A1p();
            } else {
                recyclerView$SavedState.A00 = null;
            }
        }
        return new WrappedParcelable(recyclerView$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A0f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.A0I || this.A0n) {
            return false;
        }
        boolean A14 = A14(motionEvent);
        if (A19[5].charAt(2) == 'Y') {
            A19[5] = "8sYT0RnpvG2arPES2UJ12JYFoUL9IQDo";
            if (A14) {
                A0J();
                return true;
            }
            AbstractC02334c abstractC02334c = this.A06;
            if (abstractC02334c == null) {
                return false;
            }
            boolean A24 = abstractC02334c.A24();
            boolean eventAddedToVelocityTracker = this.A06.A25();
            if (this.A0Y == null) {
                this.A0Y = VelocityTracker.obtain();
            }
            boolean canScrollVertically = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.A15;
                iArr[1] = 0;
                String[] strArr = A19;
                if (strArr[2].length() != strArr[7].length()) {
                    A19[5] = "w9Y7A1oKaVmj8Ov6eZqRiF6tVMdmRve8";
                    iArr[0] = 0;
                } else {
                    String[] strArr2 = A19;
                    strArr2[6] = "DE62WFMw5Qbi4eBk1auhfUxeLGhnsE7e";
                    strArr2[4] = "A6rUAAhMCRWi1Exz9agrYLVLW1oNRabf";
                    iArr[0] = 0;
                }
            }
            int[] iArr2 = this.A15;
            obtain.offsetLocation(iArr2[0], iArr2[1]);
            switch (actionMasked) {
                case 0:
                    this.A0V = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.A0S = x;
                    this.A0Q = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.A0T = y;
                    this.A0R = y;
                    int nestedScrollAxis = 0;
                    if (A24) {
                        nestedScrollAxis = 0 | 1;
                    }
                    if (eventAddedToVelocityTracker) {
                        nestedScrollAxis |= 2;
                    }
                    A1x(nestedScrollAxis, 0);
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(obtain);
                    }
                    obtain.recycle();
                    return true;
                case 1:
                    this.A0Y.addMovement(obtain);
                    canScrollVertically = true;
                    this.A0Y.computeCurrentVelocity(1000, this.A0x);
                    if (A24) {
                        f = -this.A0Y.getXVelocity(this.A0V);
                    } else {
                        f = 0.0f;
                    }
                    if (eventAddedToVelocityTracker) {
                        f2 = -this.A0Y.getYVelocity(this.A0V);
                    } else {
                        f2 = 0.0f;
                    }
                    String[] strArr3 = A19;
                    if (strArr3[6].charAt(17) == strArr3[4].charAt(17)) {
                        A19[5] = "SfYw0o2VnAou7QhBgLkBGelaMPLfL2ni";
                        if ((f == 0.0f && f2 == 0.0f) || !A12((int) f, (int) f2)) {
                            setScrollState(0);
                        }
                        A0T();
                        if (!canScrollVertically) {
                        }
                        obtain.recycle();
                        return true;
                    }
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.A0V);
                    if (findPointerIndex < 0) {
                        Log.e(A0I(1370, 12, 79), A0I(1063, 46, 50) + this.A0V + A0I(124, 45, 46));
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int actionIndex2 = this.A0S - x2;
                    int dx = this.A0T - y2;
                    if (A1z(actionIndex2, dx, this.A16, this.A17, 0)) {
                        int[] iArr3 = this.A16;
                        actionIndex2 -= iArr3[0];
                        dx -= iArr3[1];
                        int[] iArr4 = this.A17;
                        obtain.offsetLocation(iArr4[0], iArr4[1]);
                        int[] iArr5 = this.A15;
                        int i = iArr5[0];
                        int[] iArr6 = this.A17;
                        iArr5[0] = i + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                    }
                    int i2 = this.A0W;
                    String[] strArr4 = A19;
                    if (strArr4[3].length() != strArr4[0].length()) {
                        A19[1] = "vPk2qMMC5wpKDUMEcolEIRuedMAFiD5T";
                        if (i2 != 1) {
                            boolean z = false;
                            if (A24) {
                                int abs = Math.abs(actionIndex2);
                                int dx2 = this.A0X;
                                if (abs > dx2) {
                                    if (actionIndex2 > 0) {
                                        actionIndex2 -= dx2;
                                    } else {
                                        actionIndex2 += dx2;
                                    }
                                    z = true;
                                }
                            }
                            if (eventAddedToVelocityTracker) {
                                int abs2 = Math.abs(dx);
                                int dx3 = this.A0X;
                                if (abs2 > dx3) {
                                    if (dx > 0) {
                                        dx -= dx3;
                                    } else {
                                        dx += dx3;
                                    }
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.A0W == 1) {
                            int[] iArr7 = this.A17;
                            this.A0S = x2 - iArr7[0];
                            this.A0T = y2 - iArr7[1];
                            if (A13(A24 ? actionIndex2 : 0, eventAddedToVelocityTracker ? dx : 0, obtain)) {
                                ViewParent parent = getParent();
                                int dy = A19[5].charAt(2);
                                if (dy != 89) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                } else {
                                    String[] strArr5 = A19;
                                    strArr5[3] = "9Qb2BcK3cjm46xX51a5wS3";
                                    strArr5[0] = "GdK3mOIcF6";
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                            C4D c4d = this.A03;
                            if (c4d != null && (actionIndex2 != 0 || dx != 0)) {
                                c4d.A0B(this, actionIndex2, dx);
                            }
                        }
                        if (!canScrollVertically) {
                        }
                        obtain.recycle();
                        return true;
                    }
                    throw new RuntimeException();
                case 3:
                    A0J();
                    if (!canScrollVertically) {
                    }
                    obtain.recycle();
                    return true;
                case 4:
                default:
                    if (!canScrollVertically) {
                    }
                    obtain.recycle();
                    return true;
                case 5:
                    this.A0V = motionEvent.getPointerId(actionIndex);
                    int dx4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.A0S = dx4;
                    this.A0Q = dx4;
                    int dx5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.A0T = dx5;
                    this.A0R = dx5;
                    if (!canScrollVertically) {
                    }
                    obtain.recycle();
                    return true;
                case 6:
                    A0n(motionEvent);
                    if (!canScrollVertically) {
                    }
                    obtain.recycle();
                    return true;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC02504u A0F = A0F(view);
        if (A0F != null) {
            if (A0F.A0e()) {
                A0F.A0P();
            } else if (!A0F.A0h()) {
                throw new IllegalArgumentException(A0I(219, 75, 37) + A0F + A1I());
            }
        }
        view.clearAnimation();
        A1j(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.A06.A1f(this, this.A0s, view, view2) && view2 != null) {
            A0p(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A06.A1d(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.A13.size();
        for (int i = 0; i < size; i++) {
            this.A13.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0O == 0 && !this.A0I) {
            super.requestLayout();
        } else {
            this.A0J = true;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC02334c abstractC02334c = this.A06;
        if (abstractC02334c == null) {
            Log.e(A0I(1370, 12, 79), A0I(834, 90, 71));
            return;
        }
        if (this.A0I) {
            return;
        }
        boolean A24 = abstractC02334c.A24();
        boolean canScrollHorizontal = this.A06.A25();
        if (A24 || canScrollHorizontal) {
            if (!A24) {
                i = 0;
            }
            A13(i, canScrollHorizontal ? i2 : 0, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w(A0I(1370, 12, 79), A0I(1382, 93, 90));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A18(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0992Yz c0992Yz) {
        this.A09 = c0992Yz;
        C3H.A0B(this, c0992Yz);
    }

    public void setAdapter(C4Q c4q) {
        setLayoutFrozen(false);
        A0q(c4q, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C4T c4t) {
        if (c4t == this.A0e) {
            return;
        }
        this.A0e = c4t;
        setChildrenDrawingOrderEnabled(c4t != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0B) {
            A0f();
        }
        this.A0B = z;
        super.setClipToPadding(z);
        if (this.A0D) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.A0E = z;
    }

    public void setItemAnimator(C4Y c4y) {
        C4Y c4y2 = this.A05;
        if (c4y2 != null) {
            c4y2.A0I();
            this.A05.A0B(null);
        }
        this.A05 = c4y;
        if (c4y != null) {
            C4W c4w = this.A0f;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "lbql160khUomfa8gG92Y7q";
            strArr[0] = "AtGY6u7EZb";
            c4y.A0B(c4w);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.A0r.A0Q(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.A0I) {
            A1q(A0I(PointerIconCompat.TYPE_GRABBING, 42, 85));
            if (!z) {
                this.A0I = false;
                if (this.A0J && this.A06 != null && this.A04 != null) {
                    requestLayout();
                }
                this.A0J = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            this.A0I = true;
            this.A0n = true;
            A1S();
        }
    }

    public void setLayoutManager(AbstractC02334c abstractC02334c) {
        if (abstractC02334c == this.A06) {
            return;
        }
        A1S();
        if (this.A06 != null) {
            C4Y c4y = this.A05;
            if (c4y != null) {
                c4y.A0I();
            }
            this.A06.A1I(this.A0r);
            this.A06.A1G(this.A0r);
            this.A0r.A0P();
            if (this.A0F) {
                this.A06.A1U(this, this.A0r);
            }
            this.A06.A1P(null);
            this.A06 = null;
        } else {
            this.A0r.A0P();
        }
        this.A01.A0B();
        this.A06 = abstractC02334c;
        if (abstractC02334c != null) {
            ED ed = abstractC02334c.A03;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "5zwSvF43vthb6lIFeaOoDRJ244Dq07FI";
            strArr[4] = "COyIsU8he0MLuT7wFa9x9SZ5A7LzgdfA";
            if (ed == null) {
                this.A06.A1P(this);
                if (this.A0F) {
                    this.A06.A1N(this);
                }
            } else {
                throw new IllegalArgumentException(A0I(1109, 14, 88) + abstractC02334c + A0I(59, 39, 9) + abstractC02334c.A03.A1I());
            }
        }
        this.A0r.A0O();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A04(z);
    }

    public void setOnFlingListener(AbstractC02364f abstractC02364f) {
        this.A0g = abstractC02364f;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC02384h abstractC02384h) {
        this.A0i = abstractC02384h;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0o = z;
    }

    public void setRecycledViewPool(C4j c4j) {
        this.A0r.A0Z(c4j);
    }

    public void setRecyclerListener(InterfaceC02414l interfaceC02414l) {
        this.A07 = interfaceC02414l;
    }

    public void setScrollState(int i) {
        if (i == this.A0W) {
            return;
        }
        this.A0W = i;
        if (i != 2) {
            A0V();
        }
        A0k(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.A0X = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w(A0I(1370, 12, 79), A0I(1937, 47, 26) + i + A0I(Opcodes.IFNULL, 21, 121));
                break;
        }
        this.A0X = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC02484s abstractC02484s) {
        this.A0r.A0a(abstractC02484s);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A0A(i);
    }

    @Override // android.view.View, com.facebook.ads.redexgen.X.InterfaceC02042y
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02();
    }
}
