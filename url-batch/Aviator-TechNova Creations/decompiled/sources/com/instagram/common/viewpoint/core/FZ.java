package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class FZ extends AbstractRunnableC0846Vt {
    public static byte[] A02;
    public static String[] A03 = {"dab4fRnX0jwVtTCdppjyxAzmLS4bXJsv", "tx88Rmris0qAnIQYPQwCDQk09feKvYvd", "zx5uuvDAcytcTb9ViP21DGr2Ir", "iFOXUW5dAcR78ORAksMxLEmjU8chlyrY", "cH6E6XWheDX0I5qudQa8gCuUDMH3DwGR", "ZrH1xVhvr", "HcVkU72Pv92AZpKffx9OD1kZyJiX0ZmG", "FRYXqcD3MsRMpqiQBVhoHwYMYH2ko3dl"};
    public final /* synthetic */ C01393r A00;
    public final /* synthetic */ C3Q A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].charAt(20) == 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "mmZKkJ0qdyfdoCPbfy2YKuwlL3WBbVIn";
            strArr[0] = "dwlf7VAy7NoW0pl9cb0nbAZtUrVGpkqt";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-8, 43, Ascii.FS, Ascii.FS, Ascii.ESC, 40, Ascii.US, 36, Ascii.GS, -42, Ascii.US, 36, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.US, 36, Ascii.US, 42, Ascii.ESC, 34, 47};
    }

    static {
        A01();
    }

    public FZ(C01393r c01393r, C3Q c3q) {
        this.A00 = c01393r;
        this.A01 = c3q;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        E1 e1;
        E1 e12;
        e1 = this.A00.A0L;
        if (e1.getState() == EnumC1229eU.A02) {
            e12 = this.A00.A0L;
            if (e12.getCurrentPositionInMillis() == A00()) {
                this.A00.A0R(A00(0, 22, Opcodes.LUSHR));
            }
        }
    }
}
