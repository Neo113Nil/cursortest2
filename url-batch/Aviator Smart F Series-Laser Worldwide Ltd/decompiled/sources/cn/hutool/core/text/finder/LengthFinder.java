package cn.hutool.core.text.finder;

import cn.hutool.core.lang.q;

/* loaded from: classes.dex */
public class LengthFinder extends TextFinder {
    private static final long serialVersionUID = 1;
    private final int length;

    public LengthFinder(int i8) {
        q.isTrue(i8 > 0, "Length must be great than 0", new Object[0]);
        this.length = i8;
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public int end(int i8) {
        return i8;
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
            int i9 = i8 - this.length;
            if (i9 > validEndIndex) {
                return i9;
            }
            return -1;
        }
        int i10 = i8 + this.length;
        if (i10 < validEndIndex) {
            return i10;
        }
        return -1;
    }
}
