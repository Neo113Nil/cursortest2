package com.instagram.common.viewpoint.core;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Rg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0732Rg implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, SM {
    public static byte[] A02;
    public static String[] A03 = {"2Mr7WzO4XT19fyb3DHhbNTMzGWXczG8b", "vf19oH1ZBxP9VPI3JVFDPhemIBzJ7OC4", "PwSJ9ELrmEQEpkj", "NKBqcIyQCWq", "qemkSyFbN3a9gQ2aUzusWvKKRIknTA5w", "Z", "UIuvCrnGUlyr13fhGKhlPOBYvJPgs1Zm", "jOlkEqTUPEoF6L4suBriQ9wTaVLjQjL5"};
    public final C1159dL A00;
    public final /* synthetic */ C0702Qc A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].charAt(17) == 't') {
                throw new RuntimeException();
            }
            A03[6] = "LYjyLl4kg8CHjw2beKSdtMq0XfNpXvKm";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
            String[] strArr = A03;
            if (strArr[3].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A03[6] = "YSbRSDMNs4CLdH15XbZL4GcvXcpOIsjI";
            copyOfRange[i4] = b;
            i4++;
        }
    }

    public static void A02() {
        A02 = new byte[]{101, 64, 4, 71, 69, 74, 74, 75, 80, 4, 70, 65, 4, 71, 72, 77, 71, 79, 65, 64, 4, 70, 65, 66, 75, 86, 65, 4, 77, 80, 4, 77, 87, 4, 82, 77, 65, 83, 65, 64, 10, 42, 5, 0, 10, 2, Ascii.SUB, 73, 1, 8, Ascii.EM, Ascii.EM, Ascii.FF, 7, Ascii.FF, Ascii.CR, 73, Ascii.GS, 6, 6, 73, Ascii.SI, 8, Ascii.SUB, Ascii.GS, 71, Ascii.CR, 9, 10, 62, 47, 34, 46, 37, 40, 46, 5, 46, Utf8.REPLACEMENT_BYTE, 60, 36, 57, 32, Ascii.CAN, 57, 118, 34, 57, 35, 53, 62, 118, 50, 55, 34, 55, 118, 36, 51, 53, 57, 36, 50, 51, 50, 122, 118, 38, 58, 51, 55, 37, 51, 118, 51, 56, 37, 35, 36, 51, 118, 34, 57, 35, 53, 62, 118, 51, 32, 51, 56, 34, 37, 118, 36, 51, 55, 53, 62, 118, 34, 62, 51, 118, 55, 50, 118, 0, Utf8.REPLACEMENT_BYTE, 51, 33, 118, 52, 47, 118, 36, 51, 34, 35, 36, 56, Utf8.REPLACEMENT_BYTE, 56, 49, 118, 48, 55, 58, 37, 51, 118, Utf8.REPLACEMENT_BYTE, 48, 118, 47, 57, 35, 118, Utf8.REPLACEMENT_BYTE, 56, 34, 51, 36, 53, 51, 38, 34, 118, 34, 62, 51, 118, 51, 32, 51, 56, 34, 120, Ascii.CR, Ascii.VT, 16, 120, 98, Byte.MAX_VALUE};
    }

    static {
        A02();
    }

    public ViewOnClickListenerC0732Rg(C0702Qc c0702Qc, C1159dL c1159dL) {
        this.A01 = c0702Qc;
        this.A00 = c1159dL;
    }

    public /* synthetic */ ViewOnClickListenerC0732Rg(C0702Qc c0702Qc, C1159dL c1159dL, TB tb) {
        this(c0702Qc, c1159dL);
    }

    private Map<String, String> A01() {
        C1232eX c1232eX;
        XH xh;
        EnumC0820Us enumC0820Us;
        boolean z;
        boolean z2;
        EnumC0820Us enumC0820Us2;
        C0944Zp c0944Zp = new C0944Zp();
        c1232eX = this.A01.A0R;
        C0944Zp A032 = c0944Zp.A03(c1232eX);
        xh = this.A01.A0f;
        Map<String, String> A05 = A032.A02(xh).A05();
        enumC0820Us = this.A01.A0I;
        if (enumC0820Us != null) {
            enumC0820Us2 = this.A01.A0I;
            A05.put(A00(201, 3, 62), String.valueOf(enumC0820Us2.A05()));
        }
        z = this.A01.A0W;
        if (z) {
            z2 = this.A01.A0W;
            A05.put(A00(Opcodes.IFNULL, 3, 75), String.valueOf(z2));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final C1159dL A6e() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        XH xh;
        C1159dL c1159dL;
        XH xh2;
        C1159dL c1159dL2;
        XH xh3;
        XH xh4;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            xh = this.A01.A0f;
            boolean A08 = xh.A08();
            String A00 = A00(66, 17, 99);
            if (!A08) {
                Log.e(A00, A00(83, Opcodes.DREM, 126));
            }
            c1159dL = this.A01.A0c;
            int minimumElapsedTime = U7.A0K(c1159dL);
            if (minimumElapsedTime >= 0) {
                xh3 = this.A01.A0f;
                if (xh3.A03() < minimumElapsedTime) {
                    xh4 = this.A01.A0f;
                    if (!xh4.A07()) {
                        Log.e(A00, A00(0, 41, 12));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 65));
                        return;
                    }
                }
            }
            xh2 = this.A01.A0f;
            c1159dL2 = this.A01.A0c;
            if (xh2.A09(c1159dL2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
            String[] strArr = A03;
            if (strArr[1].charAt(15) != strArr[0].charAt(15)) {
                throw new RuntimeException();
            }
            A03[7] = "EqeSsMwGTYaeKofhe8hU7ULkNSCE0y6O";
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        C0941Zm c0941Zm;
        C0941Zm c0941Zm2;
        View view3;
        View view4;
        C0941Zm c0941Zm3;
        C0941Zm c0941Zm4;
        view2 = this.A01.A04;
        if (view2 != null) {
            c0941Zm = this.A01.A0L;
            if (c0941Zm != null) {
                c0941Zm2 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c0941Zm2.setBounds(0, 0, width, view4.getHeight());
                c0941Zm3 = this.A01.A0L;
                c0941Zm4 = this.A01.A0L;
                c0941Zm3.A0D(!c0941Zm4.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        XH xh;
        C1159dL c1159dL;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        xh = this.A01.A0f;
        c1159dL = this.A01.A0c;
        view2 = this.A01.A04;
        xh.A06(c1159dL, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (A03[2].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "w4fxh8qGKfQUI633kdvfD6D1dPFrXVB8";
            strArr[0] = "m7FEgH87ot2vGtV3LgABw7ULf2zod61Q";
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
