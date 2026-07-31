package com.bytedance.sdk.component.fs.zmn.fs;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.X3;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class fb implements Serializable, Comparable<fb> {
    transient int btk;
    final byte[] fb;
    transient String hhw;
    static final char[] zmn = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset fs = Charset.forName("UTF-8");
    public static final fb zn = zmn(new byte[0]);

    fb(byte[] bArr) {
        this.fb = bArr;
    }

    public static fb zmn(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new fb((byte[]) bArr.clone());
    }

    public String zmn() {
        String str = this.hhw;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.fb, fs);
        this.hhw = str2;
        return str2;
    }

    public String fs() {
        byte[] bArr = this.fb;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = zmn;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public fb zmn(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.fb;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.fb.length + ")");
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
        return new fb(bArr2);
    }

    public byte zmn(int i) {
        return this.fb[i];
    }

    public int zn() {
        return this.fb.length;
    }

    public byte[] fb() {
        return (byte[]) this.fb.clone();
    }

    public boolean zmn(int i, fb fbVar, int i2, int i3) {
        return fbVar.zmn(i2, this.fb, i, i3);
    }

    public boolean zmn(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.fb;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && bvs.zmn(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fb) {
            fb fbVar = (fb) obj;
            int zn2 = fbVar.zn();
            byte[] bArr = this.fb;
            if (zn2 == bArr.length && fbVar.zmn(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.btk;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.fb);
        this.btk = hashCode;
        return hashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public int compareTo(fb fbVar) {
        int zn2 = zn();
        int zn3 = fbVar.zn();
        int min = Math.min(zn2, zn3);
        for (int i = 0; i < min; i++) {
            int zmn2 = zmn(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int zmn3 = fbVar.zmn(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (zmn2 != zmn3) {
                return zmn2 < zmn3 ? -1 : 1;
            }
        }
        if (zn2 == zn3) {
            return 0;
        }
        return zn2 < zn3 ? -1 : 1;
    }

    public String toString() {
        if (this.fb.length == 0) {
            return "[size=0]";
        }
        String zmn2 = zmn();
        int zmn3 = zmn(zmn2, 64);
        if (zmn3 == -1) {
            if (this.fb.length <= 64) {
                return "[hex=" + fs() + X3.j.e;
            }
            return "[size=" + this.fb.length + " hex=" + zmn(0, 64).fs() + "…]";
        }
        String replace = zmn2.substring(0, zmn3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (zmn3 >= zmn2.length()) {
            return "[text=" + replace + X3.j.e;
        }
        return "[size=" + this.fb.length + " text=" + replace + "…]";
    }

    static int zmn(String str, int i) {
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
