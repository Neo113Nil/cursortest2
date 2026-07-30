package g;

import cn.hutool.core.exceptions.UtilException;

/* loaded from: classes.dex */
public class a implements l, k {
    public static final a CODEC_LOWER = new a(true);
    public static final a CODEC_UPPER = new a(false);
    private final char[] alphabets;

    public a(boolean z7) {
        this.alphabets = (z7 ? "0123456789abcdef" : "0123456789ABCDEF").toCharArray();
    }

    private static int toDigit(char c8, int i8) {
        int digit = Character.digit(c8, 16);
        if (digit >= 0) {
            return digit;
        }
        throw new UtilException("Illegal hexadecimal character {} at index {}", Character.valueOf(c8), Integer.valueOf(i8));
    }

    public void appendHex(StringBuilder sb, byte b8) {
        sb.append(this.alphabets[(b8 & 240) >>> 4]);
        sb.append(this.alphabets[b8 & 15]);
    }

    public String toUnicodeHex(char c8) {
        return "\\u" + this.alphabets[(c8 >> '\f') & 15] + this.alphabets[(c8 >> '\b') & 15] + this.alphabets[(c8 >> 4) & 15] + this.alphabets[c8 & 15];
    }

    @Override // g.k
    public byte[] decode(CharSequence charSequence) {
        if (cn.hutool.core.text.l.isEmpty(charSequence)) {
            return null;
        }
        String cleanBlank = cn.hutool.core.text.l.cleanBlank(charSequence);
        int length = cleanBlank.length();
        if ((length & 1) != 0) {
            cleanBlank = "0" + ((Object) cleanBlank);
            length = cleanBlank.length();
        }
        byte[] bArr = new byte[length >> 1];
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = i8 + 1;
            int digit = (toDigit(cleanBlank.charAt(i8), i8) << 4) | toDigit(cleanBlank.charAt(i10), i10);
            i8 += 2;
            bArr[i9] = (byte) (digit & 255);
            i9++;
        }
        return bArr;
    }

    @Override // g.l
    public char[] encode(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i8 = 0;
        for (byte b8 : bArr) {
            int i9 = i8 + 1;
            char[] cArr2 = this.alphabets;
            cArr[i8] = cArr2[(b8 & 240) >>> 4];
            i8 += 2;
            cArr[i9] = cArr2[b8 & 15];
        }
        return cArr;
    }
}
