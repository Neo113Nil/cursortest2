package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0305Ao<E> extends AbstractC1697mZ<E> {
    public static byte[] A03;
    public static String[] A04 = {"emqP2Ifv15ruA3vfOBddLKXSQAhVBBiZ", "hrMd7lJ1e8dj2uYkEp7ZkSLs2D8yKDzP", "R1glWPF1KbPaEDQGu2GwL6vWIpfQR0VI", "T12dHmfXBitdOytN2RtspbU6Ik8qeuAk", "0tCJd3vKXz4Euq7T8InIHSFr9bbtNXIu", "Q", "MwChlhzfsoxh", "7ToYkJZV1iSpkxWyqnmjBpfIK3KeTcwM"};
    public int A00;
    public boolean A01;
    public Object[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[3].charAt(25) != 'k') {
                throw new RuntimeException();
            }
            A04[4] = "sNiI9gS6nHnAzu4lGjYMdK7Ee3tNN7Ch";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-6, -1, -6, 5, -6, -14, -3, -44, -14, 1, -14, -12, -6, 5, 10};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ao != com.google.common.collect.ImmutableCollection$ArrayBasedBuilder<E> */
    public AbstractC0305Ao(int initialCapacity) {
        AbstractC1648ll.A00(initialCapacity, A00(0, 15, 58));
        this.A02 = new Object[initialCapacity];
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ao != com.google.common.collect.ImmutableCollection$ArrayBasedBuilder<E> */
    private void A02(int minCapacity) {
        if (this.A02.length < minCapacity) {
            this.A02 = Arrays.copyOf(this.A02, AbstractC1697mZ.A03(this.A02.length, minCapacity));
            this.A01 = false;
        } else {
            if (!this.A01) {
                return;
            }
            this.A02 = (Object[]) this.A02.clone();
            this.A01 = false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ao != com.google.common.collect.ImmutableCollection$ArrayBasedBuilder<E> */
    public AbstractC0305Ao<E> A03(E element) {
        AbstractC1501jA.A04(element);
        A02(this.A00 + 1);
        Object[] objArr = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        objArr[i] = element;
        return this;
    }
}
