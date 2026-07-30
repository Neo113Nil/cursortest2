package cn.hutool.core.text.replacer;

import cn.hutool.core.lang.o0;
import cn.hutool.core.text.StrBuilder;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class StrReplacer implements o0, Serializable {
    private static final long serialVersionUID = 1;

    protected abstract int replace(CharSequence charSequence, int i8, StrBuilder strBuilder);

    @Override // cn.hutool.core.lang.o0
    public CharSequence replace(CharSequence charSequence) {
        int length = charSequence.length();
        StrBuilder create = StrBuilder.create(length);
        int i8 = 0;
        while (i8 < length) {
            int replace = replace(charSequence, i8, create);
            if (replace == 0) {
                create.append(charSequence.charAt(i8));
                i8++;
            }
            i8 += replace;
        }
        return create;
    }
}
