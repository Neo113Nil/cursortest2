package cn.hutool.core.text.finder;

import cn.hutool.core.lang.d0;
import cn.hutool.core.lang.q;

/* loaded from: classes.dex */
public class CharMatcherFinder extends TextFinder {
    private static final long serialVersionUID = 1;
    private final d0 matcher;

    public CharMatcherFinder(d0 d0Var) {
        this.matcher = d0Var;
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public int end(int i8) {
        if (i8 < 0) {
            return -1;
        }
        return i8 + 1;
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public /* bridge */ /* synthetic */ b reset() {
        return a.a(this);
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public int start(int i8) {
        q.notNull(this.text, "Text to find must be not null!", new Object[0]);
        int validEndIndex = getValidEndIndex();
        if (this.negative) {
            while (i8 > validEndIndex) {
                if (this.matcher.match(Character.valueOf(this.text.charAt(i8)))) {
                    return i8;
                }
                i8--;
            }
            return -1;
        }
        while (i8 < validEndIndex) {
            if (this.matcher.match(Character.valueOf(this.text.charAt(i8)))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }
}
