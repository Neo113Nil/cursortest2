package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class gyv implements gzr {
    protected gyv() {
    }

    public static gyv k(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new gyi(charSequence) : new gyo(charSequence.charAt(0), charSequence.charAt(1)) : new gyn(charSequence.charAt(0)) : gys.a;
    }

    public static String m(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    private static gyv n(int i, BitSet bitSet, String str) {
        int i2;
        if (i == 0) {
            return gys.a;
        }
        if (i == 1) {
            return new gyn((char) bitSet.nextSetBit(0));
        }
        int i3 = 2;
        if (i == 2) {
            char nextSetBit = (char) bitSet.nextSetBit(0);
            return new gyo(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
        }
        int length = bitSet.length();
        if (i > 1023 || length <= i * 64) {
            return new gyk(bitSet, str);
        }
        int cardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        if (cardinality != 1) {
            int highestOneBit = Integer.highestOneBit(cardinality - 1);
            i3 = highestOneBit + highestOneBit;
            while (i3 * 0.5d < cardinality) {
                i3 += i3;
            }
        }
        char[] cArr = new char[i3];
        int i4 = i3 - 1;
        int nextSetBit2 = bitSet.nextSetBit(0);
        long j = 0;
        while (nextSetBit2 != -1) {
            long j2 = (1 << nextSetBit2) | j;
            int rotateLeft = Integer.rotateLeft((-862048943) * nextSetBit2, 15) * 461845907;
            while (true) {
                i2 = rotateLeft & i4;
                if (cArr[i2] == 0) {
                    break;
                }
                rotateLeft = i2 + 1;
            }
            cArr[i2] = (char) nextSetBit2;
            nextSetBit2 = bitSet.nextSetBit(nextSetBit2 + 1);
            j = j2;
        }
        return new gzt(cArr, j, z, str);
    }

    @Override // defpackage.gzr
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return c(((Character) obj).charValue());
    }

    public void b(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (c((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public abstract boolean c(char c);

    public gyv d() {
        return l();
    }

    public gyv e(gyv gyvVar) {
        return new gyt(this, gyvVar);
    }

    public boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (c(charSequence.charAt(length)));
        return false;
    }

    public boolean g(CharSequence charSequence) {
        return h(charSequence) == -1;
    }

    public int h(CharSequence charSequence) {
        return i(charSequence, 0);
    }

    public int i(CharSequence charSequence, int i) {
        int length = charSequence.length();
        hoq.P(i, length);
        while (i < length) {
            if (c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int j(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (c(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public final gyv l() {
        BitSet bitSet = new BitSet();
        b(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality + cardinality <= 65536) {
            return n(cardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - cardinality;
        String gyvVar = toString();
        return new gyh(n(i, bitSet, gyvVar.endsWith(".negate()") ? gyvVar.substring(0, gyvVar.length() - 9) : String.valueOf(gyvVar).concat(".negate()")), gyvVar);
    }
}
