package com.bytedance.sdk.component.icD.pvs.icD;

import com.bumptech.glide.load.Key;
import com.google.common.base.Ascii;
import io.ktor.util.date.GMTDateParser;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public class Jd implements Serializable, Comparable<Jd> {
    final byte[] Jd;
    transient int NB;
    transient String sUS;
    static final char[] pvs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
    public static final Charset icD = Charset.forName(Key.STRING_CHARSET_NAME);
    public static final Jd vG = pvs(new byte[0]);

    Jd(byte[] bArr) {
        this.Jd = bArr;
    }

    public static Jd pvs(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new Jd((byte[]) bArr.clone());
    }

    public String pvs() {
        String str = this.sUS;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.Jd, icD);
        this.sUS = str2;
        return str2;
    }

    public String icD() {
        byte[] bArr = this.Jd;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = pvs;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public Jd pvs(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.Jd;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.Jd.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new Jd(bArr2);
    }

    public byte pvs(int i) {
        return this.Jd[i];
    }

    public int vG() {
        return this.Jd.length;
    }

    public byte[] Jd() {
        return (byte[]) this.Jd.clone();
    }

    public boolean pvs(int i, Jd jd, int i2, int i3) {
        return jd.pvs(i2, this.Jd, i, i3);
    }

    public boolean pvs(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.Jd;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && Mxy.pvs(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Jd) {
            Jd jd = (Jd) obj;
            int vG2 = jd.vG();
            byte[] bArr = this.Jd;
            if (vG2 == bArr.length && jd.pvs(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.NB;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.Jd);
        this.NB = hashCode;
        return hashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public int compareTo(Jd jd) {
        int vG2 = vG();
        int vG3 = jd.vG();
        int min = Math.min(vG2, vG3);
        for (int i = 0; i < min; i++) {
            int pvs2 = pvs(i) & 255;
            int pvs3 = jd.pvs(i) & 255;
            if (pvs2 != pvs3) {
                return pvs2 < pvs3 ? -1 : 1;
            }
        }
        if (vG2 == vG3) {
            return 0;
        }
        return vG2 < vG3 ? -1 : 1;
    }

    public String toString() {
        if (this.Jd.length == 0) {
            return "[size=0]";
        }
        String pvs2 = pvs();
        int pvs3 = pvs(pvs2, 64);
        if (pvs3 == -1) {
            if (this.Jd.length <= 64) {
                return "[hex=" + icD() + "]";
            }
            return "[size=" + this.Jd.length + " hex=" + pvs(0, 64).icD() + "…]";
        }
        String replace = pvs2.substring(0, pvs3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        return pvs3 < pvs2.length() ? "[size=" + this.Jd.length + " text=" + replace + "…]" : "[text=" + replace + "]";
    }

    static int pvs(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
