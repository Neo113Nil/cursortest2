package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.Serializable;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public final class AK extends AbstractC1815oV<Comparable<?>> implements Serializable {
    public static byte[] A00;
    public static String[] A01 = {"VpDQNWoK0mmjrFci3J1ES8becoOn0yPT", "Vr", "", "dVgvDtkQ8cSY7jysLBul", "4dcdEYs2txrJkBrXjBMi1LqbKTa90ufq", "PVumC7zyVZC9p2BLxPfo", "qAFwV", ""};
    public static final AK A02;
    public static final long serialVersionUID = 0;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Opcodes.LREM);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.DC2, 47, 57, 56, 47, 52, 51, 58, 115, 51, 60, 41, 40, 47, 60, 49, 117, 116, 115, 47, 56, 43, 56, 47, 46, 56, 117, 116};
    }

    static {
        A02();
        A02 = new AK();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1815oV, java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(Comparable<?> left, Comparable<?> right) {
        AbstractC1501jA.A04(left);
        if (left != right) {
            return right.compareTo(left);
        }
        String[] strArr = A01;
        if (strArr[6].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A01[0] = "QsSMXmf1NPN173cjiLSi9PN2wuQJFCPh";
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1815oV
    public final <S extends Comparable<?>> AbstractC1815oV<S> A06() {
        return AbstractC1815oV.A03();
    }

    public final String toString() {
        return A01(0, 28, 44);
    }
}
