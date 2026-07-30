package cn.hutool.core.text.finder;

import cn.hutool.core.lang.q;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class TextFinder implements b, Serializable {
    private static final long serialVersionUID = 1;
    protected int endIndex = -1;
    protected boolean negative;
    protected CharSequence text;

    @Override // cn.hutool.core.text.finder.b
    public abstract /* synthetic */ int end(int i8);

    protected int getValidEndIndex() {
        if (this.negative && -1 == this.endIndex) {
            return -1;
        }
        int i8 = this.endIndex;
        return i8 < 0 ? i8 + this.text.length() + 1 : Math.min(i8, this.text.length());
    }

    @Override // cn.hutool.core.text.finder.b
    public /* bridge */ /* synthetic */ b reset() {
        return a.a(this);
    }

    public TextFinder setEndIndex(int i8) {
        this.endIndex = i8;
        return this;
    }

    public TextFinder setNegative(boolean z7) {
        this.negative = z7;
        return this;
    }

    public TextFinder setText(CharSequence charSequence) {
        this.text = (CharSequence) q.notNull(charSequence, "Text must be not null!", new Object[0]);
        return this;
    }

    @Override // cn.hutool.core.text.finder.b
    public abstract /* synthetic */ int start(int i8);
}
