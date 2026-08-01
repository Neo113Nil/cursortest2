package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class UL implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C7P {
    public static byte[] A02;
    public final YA A00;
    public final /* synthetic */ UJ A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, Ascii.SO, 74, 9, Ascii.VT, 4, 4, 5, Ascii.RS, 74, 8, Ascii.SI, 74, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 74, 8, Ascii.SI, Ascii.FF, 5, Ascii.CAN, Ascii.SI, 74, 3, Ascii.RS, 74, 3, Ascii.EM, 74, Ascii.FS, 3, Ascii.SI, Ascii.GS, Ascii.SI, Ascii.SO, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, Ascii.DC4, 16, 19, 39, 54, 59, 55, 60, 49, 55, Ascii.FS, 55, 38, 37, Base64.padSymbol, 32, 57, 56, Ascii.EM, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, Ascii.DC2, Ascii.ETB, 2, Ascii.ETB, 86, 4, 19, Ascii.NAK, Ascii.EM, 4, Ascii.DC2, 19, Ascii.DC2, 90, 86, 6, Ascii.SUB, 19, Ascii.ETB, 5, 19, 86, 19, Ascii.CAN, 5, 3, 4, 19, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, 19, 0, 19, Ascii.CAN, 2, 5, 86, 4, 19, Ascii.ETB, Ascii.NAK, Ascii.RS, 86, 2, Ascii.RS, 19, 86, Ascii.ETB, Ascii.DC2, 86, 32, Ascii.US, 19, 1, 86, Ascii.DC4, Ascii.SI, 86, 4, 19, 2, 3, 4, Ascii.CAN, Ascii.US, Ascii.CAN, 17, 86, 16, Ascii.ETB, Ascii.SUB, 5, 19, 86, Ascii.US, 16, 86, Ascii.SI, Ascii.EM, 3, 86, Ascii.US, Ascii.CAN, 2, 19, 4, Ascii.NAK, 19, 6, 2, 86, 2, Ascii.RS, 19, 86, 19, 0, 19, Ascii.CAN, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LN ln;
        YA ya;
        LN ln2;
        YA ya2;
        YA ya3;
        LN ln3;
        LN ln4;
        if (K0.A02(this)) {
            return;
        }
        try {
            ln = this.A01.A0f;
            boolean A08 = ln.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            ya = this.A01.A0c;
            int A0G = IP.A0G(ya);
            if (A0G >= 0) {
                ln3 = this.A01.A0f;
                if (ln3.A03() < A0G) {
                    ln4 = this.A01.A0f;
                    if (ln4.A07()) {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    } else {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    }
                }
            }
            ln2 = this.A01.A0f;
            ya2 = this.A01.A0c;
            if (ln2.A09(ya2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            ya3 = this.A01.A0c;
            if (!IP.A1I(ya3)) {
                A05(A01());
                return;
            }
            if (this.A01.A0a != null) {
                this.A01.A0a.A0Q(A01());
            }
            C0625Ks.A00(new J0(this), new J1(this), ActivityUtils.A00());
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    public UL(UJ uj, YA ya) {
        this.A01 = uj;
        this.A00 = ya;
    }

    public /* synthetic */ UL(UJ uj, YA ya, UU uu) {
        this(uj, ya);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        C0764Qb c0764Qb;
        LN ln;
        J7 j7;
        boolean z;
        boolean z2;
        J7 j72;
        NL nl = new NL();
        c0764Qb = this.A01.A0R;
        NL A03 = nl.A03(c0764Qb);
        ln = this.A01.A0f;
        Map<String, String> A05 = A03.A02(ln).A05();
        j7 = this.A01.A0I;
        if (j7 != null) {
            j72 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(j72.A04()));
        }
        z = this.A01.A0W;
        if (z) {
            z2 = this.A01.A0W;
            A05.put(A00(Opcodes.IFNULL, 3, 116), String.valueOf(z2));
        }
        return A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7P
    public final YA A5p() {
        return this.A00;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        NJ nj;
        NJ nj2;
        View view3;
        View view4;
        NJ nj3;
        NJ nj4;
        view2 = this.A01.A04;
        if (view2 != null) {
            nj = this.A01.A0L;
            if (nj != null) {
                nj2 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                nj2.setBounds(0, 0, width, view4.getHeight());
                nj3 = this.A01.A0L;
                nj4 = this.A01.A0L;
                nj3.A0D(!nj4.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        LN ln;
        YA ya;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        ln = this.A01.A0f;
        ya = this.A01.A0c;
        view2 = this.A01.A04;
        ln.A06(ya, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
