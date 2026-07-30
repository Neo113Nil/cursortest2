package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class HD extends AbstractRunnableC0846Vt {
    public static byte[] A01;
    public final /* synthetic */ C4Z A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Opcodes.FNEG);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{118, 73, 68, 69, 79, 0, 87, 65, 83, 0, 78, 69, 86, 69, 82, 0, 80, 82, 69, 80, 65, 82, 69, 68};
    }

    public HD(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        boolean z;
        InterfaceC1106cT interfaceC1106cT;
        z = this.A00.A0T;
        if (!z) {
            interfaceC1106cT = this.A00.A0Z;
            interfaceC1106cT.AFg(A00(0, 24, 86));
        }
    }
}
