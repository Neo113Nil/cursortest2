package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class Y1 extends K8 {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7S A01;
    public final /* synthetic */ InterfaceC03137q A02;
    public final /* synthetic */ C03217y A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, -3, Ascii.RS, Ascii.ESC, 46, 32, -39, Ascii.FS, 43, Ascii.SUB, 44, 33, -39, Ascii.ESC, Ascii.RS, Ascii.FS, Ascii.SUB, 46, 44, Ascii.RS, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, Ascii.RS, 39, 45, -3, Ascii.SUB, 45, Ascii.SUB, 9, 43, 40, 47, 34, Ascii.GS, Ascii.RS, 43, -39, 39, 40, 45, -39, 34, 39, 35, Ascii.RS, Ascii.FS, 45, Ascii.RS, Ascii.GS, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, Ascii.RS, 33, 33, 38, 49, 38, 44, 43, Ascii.RS, 41, Ascii.FS, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, 63, 55, 43, 63, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, Ascii.ESC, 45, 50, 41, Ascii.RS, 49, 51, 32, 50, 55, 46, 35, Ascii.GS, 33, 45, 34, 35};
    }

    public Y1(C7S c7s, String str, int i, C03217y c03217y, InterfaceC03137q interfaceC03137q) {
        this.A01 = c7s;
        this.A04 = str;
        this.A00 = i;
        this.A03 = c03217y;
        this.A02 = interfaceC03137q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        if (r2.equals(r1) != false) goto L18;
     */
    @Override // com.facebook.ads.redexgen.X.K8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A06() {
        String str;
        Map<String, String> A4j;
        AtomicReference atomicReference;
        try {
            if (C03147r.A0J(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C0576Iq.A08(this.A01, EnumC0568Ii.A0A.toString() + A00(0, 1, 41) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                str = LD.A03(this.A01, cause);
            } else if (IR.A0R(this.A01)) {
                C7S c7s = this.A01;
                Throwable deLogExceptionCause = this.A03;
                str = LD.A03(c7s, deLogExceptionCause);
            } else {
                str = A00(0, 0, 106) + this.A03.getMessage();
            }
            if (IR.A0V(this.A01)) {
                A4j = this.A01.A03().A4j();
            } else {
                InterfaceC03137q interfaceC03137q = this.A02;
                if (interfaceC03137q != null) {
                    A4j = interfaceC03137q.A6p();
                } else if (C03147r.A02) {
                    String message = A00(1, 57, 65);
                    Throwable deLogExceptionCause2 = new RuntimeException(message, this.A03);
                    C03147r.A0F(deLogExceptionCause2);
                    A4j = new HashMap<>();
                } else {
                    A4j = this.A01.A03().A4j();
                }
            }
            String A00 = A00(Opcodes.L2I, 7, 65);
            String stackTrace = this.A04;
            A4j.put(A00, stackTrace);
            String A002 = A00(Opcodes.D2L, 12, 70);
            String stackTrace2 = String.valueOf(this.A00);
            A4j.put(A002, stackTrace2);
            JSONObject A02 = this.A03.A02();
            if (A02 != null) {
                String A003 = A00(71, 15, 69);
                String stackTrace3 = A02.toString();
                A4j.put(A003, stackTrace3);
            }
            String A004 = A00(106, 5, 99);
            String stackTrace4 = this.A04;
            if (!A004.equals(stackTrace4)) {
                String A005 = A00(111, 15, 126);
                String stackTrace5 = this.A04;
            }
            String A78 = this.A01.A03().A78();
            if (A78 != null) {
                String stackTrace6 = A00(86, 20, 84);
                A4j.put(stackTrace6, A78);
            }
            String A0B = this.A01.A0B();
            if (A0B != null && !TextUtils.isEmpty(A0B)) {
                String stackTrace7 = A00(126, 10, 4);
                A4j.put(stackTrace7, A0B);
            }
            atomicReference = C03147r.A0A;
            InterfaceC03127p interfaceC03127p = (InterfaceC03127p) atomicReference.get();
            if (interfaceC03127p != null) {
                interfaceC03127p.AGS(str, A4j, this.A01);
            } else {
                Throwable deLogExceptionCause3 = new RuntimeException(A00(58, 13, 7));
                C03147r.A0F(deLogExceptionCause3);
            }
        } catch (Throwable t) {
            C03147r.A0F(t);
        }
    }
}
