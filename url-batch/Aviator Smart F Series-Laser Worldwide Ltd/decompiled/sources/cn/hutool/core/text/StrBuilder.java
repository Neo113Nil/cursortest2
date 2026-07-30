package cn.hutool.core.text;

import cn.hutool.core.util.g0;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class StrBuilder implements CharSequence, Appendable, Serializable {
    public static final int DEFAULT_CAPACITY = 16;
    private static final long serialVersionUID = 6341229705927508451L;
    private int position;
    private char[] value;

    public StrBuilder() {
        this(16);
    }

    public static StrBuilder create() {
        return new StrBuilder();
    }

    private void ensureCapacity(int i8) {
        if (i8 - this.value.length > 0) {
            expandCapacity(i8);
        }
    }

    private void expandCapacity(int i8) {
        char[] cArr = this.value;
        int length = (cArr.length << 1) + 2;
        if (length - i8 >= 0) {
            i8 = length;
        }
        if (i8 < 0) {
            throw new OutOfMemoryError("Capacity is too long and max than Integer.MAX");
        }
        this.value = Arrays.copyOf(cArr, i8);
    }

    private void moveDataAfterIndex(int i8, int i9) {
        ensureCapacity(Math.max(this.position, i8) + i9);
        int i10 = this.position;
        if (i8 < i10) {
            char[] cArr = this.value;
            System.arraycopy(cArr, i8, cArr, i9 + i8, i10 - i8);
        } else if (i8 > i10) {
            Arrays.fill(this.value, i10, i8, ' ');
        }
    }

    private static int totalLength(CharSequence... charSequenceArr) {
        int length = charSequenceArr.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            CharSequence charSequence = charSequenceArr[i9];
            i8 += charSequence == null ? 0 : charSequence.length();
        }
        return i8;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i8) {
        if (i8 < 0) {
            i8 += this.position;
        }
        if (i8 < 0 || i8 > this.position) {
            throw new StringIndexOutOfBoundsException(i8);
        }
        return this.value[i8];
    }

    public StrBuilder clear() {
        return reset();
    }

    public StrBuilder del(int i8, int i9) {
        if (i8 < 0) {
            i8 = 0;
        }
        int i10 = this.position;
        if (i9 >= i10) {
            this.position = i8;
            return this;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int i11 = i9 - i8;
        if (i11 > 0) {
            char[] cArr = this.value;
            System.arraycopy(cArr, i8 + i11, cArr, i8, i10 - i9);
            this.position -= i11;
        } else if (i11 < 0) {
            throw new StringIndexOutOfBoundsException("Start is greater than End.");
        }
        return this;
    }

    public StrBuilder delTo(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        return del(i8, this.position);
    }

    public StrBuilder getChars(int i8, int i9, char[] cArr, int i10) {
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        } else {
            int i11 = this.position;
            if (i9 > i11) {
                i9 = i11;
            }
        }
        if (i8 > i9) {
            throw new StringIndexOutOfBoundsException("srcBegin > srcEnd");
        }
        System.arraycopy(this.value, i8, cArr, i10, i9 - i8);
        return this;
    }

    public boolean hasContent() {
        return this.position > 0;
    }

    public StrBuilder insert(int i8, Object obj) {
        return obj instanceof CharSequence ? insert(i8, (CharSequence) obj) : insert(i8, (CharSequence) cn.hutool.core.convert.d.toStr(obj));
    }

    public boolean isEmpty() {
        return this.position == 0;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.position;
    }

    public StrBuilder reset() {
        this.position = 0;
        return this;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        return subString(i8, i9);
    }

    public String subString(int i8) {
        return subString(i8, this.position);
    }

    public String toString(boolean z7) {
        int i8 = this.position;
        if (i8 <= 0) {
            return "";
        }
        String str = new String(this.value, 0, i8);
        if (z7) {
            reset();
        }
        return str;
    }

    public String toStringAndReset() {
        return toString(true);
    }

    public StrBuilder(int i8) {
        this.value = new char[i8];
    }

    public static StrBuilder create(int i8) {
        return new StrBuilder(i8);
    }

    public String subString(int i8, int i9) {
        return new String(this.value, i8, i9 - i8);
    }

    public static StrBuilder create(CharSequence... charSequenceArr) {
        return new StrBuilder(charSequenceArr);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return toString(false);
    }

    public StrBuilder(CharSequence... charSequenceArr) {
        this(cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr) ? 16 : 16 + totalLength(charSequenceArr));
        for (CharSequence charSequence : charSequenceArr) {
            append(charSequence);
        }
    }

    public StrBuilder append(Object obj) {
        return insert(this.position, obj);
    }

    public StrBuilder insert(int i8, char c8) {
        if (i8 < 0) {
            i8 += this.position;
        }
        if (i8 >= 0) {
            moveDataAfterIndex(i8, 1);
            this.value[i8] = c8;
            this.position = Math.max(this.position, i8) + 1;
            return this;
        }
        throw new StringIndexOutOfBoundsException(i8);
    }

    @Override // java.lang.Appendable
    public StrBuilder append(char c8) {
        return insert(this.position, c8);
    }

    public StrBuilder append(char[] cArr) {
        return g0.isEmpty(cArr) ? this : append(cArr, 0, cArr.length);
    }

    public StrBuilder append(char[] cArr, int i8, int i9) {
        return insert(this.position, cArr, i8, i9);
    }

    public StrBuilder insert(int i8, char[] cArr) {
        return g0.isEmpty(cArr) ? this : insert(i8, cArr, 0, cArr.length);
    }

    @Override // java.lang.Appendable
    public StrBuilder append(CharSequence charSequence) {
        return insert(this.position, charSequence);
    }

    @Override // java.lang.Appendable
    public StrBuilder append(CharSequence charSequence, int i8, int i9) {
        return insert(this.position, charSequence, i8, i9);
    }

    public StrBuilder insert(int i8, char[] cArr, int i9, int i10) {
        if (g0.isEmpty(cArr) || i9 > cArr.length || i10 <= 0) {
            return this;
        }
        if (i8 < 0) {
            i8 += this.position;
        }
        if (i8 >= 0) {
            if (i9 < 0) {
                i9 = 0;
            } else if (i9 + i10 > cArr.length) {
                i10 = cArr.length - i9;
            }
            moveDataAfterIndex(i8, i10);
            System.arraycopy(cArr, i9, this.value, i8, i10);
            this.position = Math.max(this.position, i8) + i10;
            return this;
        }
        throw new StringIndexOutOfBoundsException(i8);
    }

    public StrBuilder insert(int i8, CharSequence charSequence) {
        if (i8 < 0) {
            i8 += this.position;
        }
        if (i8 >= 0) {
            if (charSequence == null) {
                charSequence = "";
            }
            int length = charSequence.length();
            moveDataAfterIndex(i8, charSequence.length());
            int i9 = 0;
            if (charSequence instanceof String) {
                ((String) charSequence).getChars(0, length, this.value, i8);
            } else if (charSequence instanceof StringBuilder) {
                ((StringBuilder) charSequence).getChars(0, length, this.value, i8);
            } else if (charSequence instanceof StringBuffer) {
                ((StringBuffer) charSequence).getChars(0, length, this.value, i8);
            } else if (charSequence instanceof StrBuilder) {
                ((StrBuilder) charSequence).getChars(0, length, this.value, i8);
            } else {
                int i10 = this.position;
                while (i9 < length) {
                    this.value[i10] = charSequence.charAt(i9);
                    i9++;
                    i10++;
                }
            }
            this.position = Math.max(this.position, i8) + length;
            return this;
        }
        throw new StringIndexOutOfBoundsException(i8);
    }

    public StrBuilder insert(int i8, CharSequence charSequence, int i9, int i10) {
        if (charSequence == null) {
            charSequence = "null";
        }
        int length = charSequence.length();
        if (i9 > length) {
            return this;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if (i10 > length) {
            i10 = length;
        }
        if (i9 >= i10) {
            return this;
        }
        if (i8 < 0) {
            i8 += this.position;
        }
        if (i8 >= 0) {
            int i11 = i10 - i9;
            moveDataAfterIndex(i8, i11);
            int i12 = this.position;
            while (i9 < i10) {
                this.value[i12] = charSequence.charAt(i9);
                i9++;
                i12++;
            }
            this.position = Math.max(this.position, i8) + i11;
            return this;
        }
        throw new StringIndexOutOfBoundsException(i8);
    }
}
