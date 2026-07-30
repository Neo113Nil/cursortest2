package cn.hutool.core.text.finder;

import cn.hutool.core.lang.q;
import cn.hutool.core.util.d0;

/* loaded from: classes.dex */
public class CharFinder extends TextFinder {
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    private final char f566c;
    private final boolean caseInsensitive;

    public CharFinder(char c8) {
        this(c8, false);
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
                if (d0.equals(this.f566c, this.text.charAt(i8), this.caseInsensitive)) {
                    return i8;
                }
                i8--;
            }
            return -1;
        }
        while (i8 < validEndIndex) {
            if (d0.equals(this.f566c, this.text.charAt(i8), this.caseInsensitive)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public CharFinder(char c8, boolean z7) {
        this.f566c = c8;
        this.caseInsensitive = z7;
    }
}
