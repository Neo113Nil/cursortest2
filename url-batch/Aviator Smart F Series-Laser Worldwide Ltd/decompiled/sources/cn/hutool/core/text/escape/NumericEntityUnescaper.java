package cn.hutool.core.text.escape;

import cn.hutool.core.text.StrBuilder;
import cn.hutool.core.text.replacer.StrReplacer;
import cn.hutool.core.util.k;

/* loaded from: classes.dex */
public class NumericEntityUnescaper extends StrReplacer {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.text.replacer.StrReplacer
    protected int replace(CharSequence charSequence, int i8, StrBuilder strBuilder) {
        int i9;
        int length = charSequence.length();
        if (charSequence.charAt(i8) == '&' && i8 < length - 2 && charSequence.charAt(i8 + 1) == '#') {
            int i10 = i8 + 2;
            char charAt = charSequence.charAt(i10);
            if (charAt == 'x' || charAt == 'X') {
                i10 = i8 + 3;
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (i10 == length) {
                return 0;
            }
            int i11 = i10;
            while (i11 < length && k.isHexChar(charSequence.charAt(i11))) {
                i11++;
            }
            if (i11 != length && charSequence.charAt(i11) == ';') {
                try {
                    strBuilder.append((char) (i9 != 0 ? Integer.parseInt(charSequence.subSequence(i10, i11).toString(), 16) : Integer.parseInt(charSequence.subSequence(i10, i11).toString(), 10)));
                    return ((i11 + 2) - i10) + i9 + 1;
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0;
    }
}
