package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Hf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC0539Hf extends AsyncTask<AbstractC0782Qt, Void, InterfaceC0769Qg> implements InterfaceC0779Qq {
    public static byte[] A04;
    public InterfaceC0771Qi A00;
    public HR A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final InterfaceC0769Qg A00(AbstractC0782Qt... abstractC0782QtArr) {
        if (K0.A02(this)) {
            return null;
        }
        try {
            if (abstractC0782QtArr != null) {
                try {
                    if (abstractC0782QtArr.length > 0) {
                        InterfaceC0769Qg A0J = this.A01.A0J(abstractC0782QtArr[0]);
                        if (this.A01.A0K().A04() && A0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(A0J.A7v()), A0J.getUrl(), A0J.A64());
                        }
                        if (A0J != null) {
                            return A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e) {
                    this.A02 = e;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            K0.A00(th, this);
            return null;
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, Ascii.EM, -14, Ascii.RS, Ascii.RS, Ascii.SUB, -4, Ascii.SI, Ascii.ESC, Ascii.US, Ascii.SI, Ascii.GS, Ascii.RS, -2, Ascii.VT, Ascii.GS, Ascii.NAK, -54, Ascii.RS, Ascii.VT, Ascii.NAK, Ascii.SI, Ascii.GS, -54, Ascii.SI, 34, Ascii.VT, Ascii.CR, Ascii.RS, Ascii.SYN, 35, -54, Ascii.EM, Ascii.CAN, Ascii.SI, -54, Ascii.VT, Ascii.FS, 17, Ascii.US, Ascii.ETB, Ascii.SI, Ascii.CAN, Ascii.RS, -54, Ascii.EM, 16, -54, Ascii.RS, 35, Ascii.SUB, Ascii.SI, -54, -14, Ascii.RS, Ascii.RS, Ascii.SUB, -4, Ascii.SI, Ascii.ESC, Ascii.US, Ascii.SI, Ascii.GS, Ascii.RS, Ascii.SI, Ascii.ESC, Ascii.ESC, Ascii.ETB, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public AsyncTaskC0539Hf(HR hr, InterfaceC0771Qi interfaceC0771Qi, Executor executor) {
        this.A01 = hr;
        this.A00 = interfaceC0771Qi;
        this.A03 = executor;
    }

    private final void A03(InterfaceC0769Qg result) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.AAu(result);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    public final void A04(AbstractC0782Qt abstractC0782Qt) {
        super.executeOnExecutor(this.A03, abstractC0782Qt);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC0769Qg doInBackground(AbstractC0782Qt[] abstractC0782QtArr) {
        if (K0.A02(this)) {
            return null;
        }
        try {
            return A00(abstractC0782QtArr);
        } catch (Throwable th) {
            K0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.ABI(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC0769Qg interfaceC0769Qg) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A03(interfaceC0769Qg);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
