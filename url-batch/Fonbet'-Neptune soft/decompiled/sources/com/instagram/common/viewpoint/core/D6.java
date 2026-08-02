package com.instagram.common.viewpoint.core;

import android.widget.TextView;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: assets/audience_network.dex */
public final class D6 extends TextView implements InterfaceC1170dc {
    public static byte[] A02;
    public static String[] A03 = {"KyDK4ozsSQOI8CeBEp6vN7GPAMaKi3Lj", "3K3dE7OkNcMTAukVEMEsyydi1KZJfoYe", "AKsSDy", "td2HYxymrySRBlk8LVzv2Nj", "9YKsZJjoWB8K3TGCGylWNfB", "C67xSy", "ZVZacBuH1Jrb8cRz3UZ99yjmQBL5sCV1", "zO36dBYDIleQnJstGNGNdS3bkLsuKmlY"};
    public static final int A04;
    public E1 A00;
    public final AbstractC0776Tf<C3Q> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "iGxWfyiSQAQNOwaGoqCiMbtpxtO5GMjZ";
            strArr2[1] = "gQ1pvXOTKlX7L3B8LOaiCsG8OhRO9Yk5";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 61);
            i4++;
        }
    }

    public static void A04() {
        A02 = new byte[]{Ascii.SI, Ascii.SUB, Ascii.CAN, 78, 16, Ascii.SI, Ascii.SUB, Ascii.CAN, 78, Ascii.DC2, Ascii.DC2, Ascii.CAN, Ascii.DC2, Ascii.DC2};
    }

    static {
        A04();
        A04 = (int) (AbstractC0856Wl.A02 * 6.0f);
    }

    public D6(C1153dL c1153dL) {
        super(c1153dL);
        this.A01 = new D7(this);
        XP.A0Q(this, XP.A06(855638016, A04));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A02(long j) {
        if (j <= 0) {
            return A01(9, 5, 31);
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j);
        long minutes2 = TimeUnit.MILLISECONDS.toSeconds(j % 60000);
        return String.format(Locale.US, A01(0, 9, 23), Long.valueOf(minutes), Long.valueOf(minutes2));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1170dc
    public final void AAm(E1 e1) {
        this.A00 = e1;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1170dc
    public final void AJk(E1 e1) {
        this.A00 = e1;
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A01);
        }
    }
}
