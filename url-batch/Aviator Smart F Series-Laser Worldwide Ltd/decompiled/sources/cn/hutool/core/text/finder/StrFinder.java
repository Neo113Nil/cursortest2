package cn.hutool.core.text.finder;

import cn.hutool.core.lang.q;
import cn.hutool.core.text.l;

/* loaded from: classes.dex */
public class StrFinder extends TextFinder {
    private static final long serialVersionUID = 1;
    private final boolean caseInsensitive;
    private final CharSequence strToFind;

    public StrFinder(CharSequence charSequence, boolean z7) {
        q.notEmpty(charSequence);
        this.strToFind = charSequence;
        this.caseInsensitive = z7;
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public int end(int i8) {
        if (i8 < 0) {
            return -1;
        }
        return i8 + this.strToFind.length();
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public /* bridge */ /* synthetic */ b reset() {
        return a.a(this);
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public int start(int i8) {
        q.notNull(this.text, "Text to find must be not null!", new Object[0]);
        int length = this.strToFind.length();
        if (i8 < 0) {
            i8 = 0;
        }
        int validEndIndex = getValidEndIndex();
        if (this.negative) {
            while (i8 > validEndIndex) {
                if (l.isSubEquals(this.text, i8, this.strToFind, 0, length, this.caseInsensitive)) {
                    return i8;
                }
                i8--;
            }
            return -1;
        }
        int i9 = (validEndIndex - length) + 1;
        while (i8 < i9) {
            if (l.isSubEquals(this.text, i8, this.strToFind, 0, length, this.caseInsensitive)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }
}
