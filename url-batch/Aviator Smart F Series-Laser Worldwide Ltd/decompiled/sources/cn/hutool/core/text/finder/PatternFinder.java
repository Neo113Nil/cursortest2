package cn.hutool.core.text.finder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class PatternFinder extends TextFinder {
    private static final long serialVersionUID = 1;
    private Matcher matcher;
    private final Pattern pattern;

    public PatternFinder(String str, boolean z7) {
        this(Pattern.compile(str, z7 ? 2 : 0));
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public int end(int i8) {
        int end = this.matcher.end();
        int i9 = this.endIndex;
        if (end <= (i9 < 0 ? this.text.length() : Math.min(i9, this.text.length()))) {
            return end;
        }
        return -1;
    }

    @Override // cn.hutool.core.text.finder.TextFinder
    public TextFinder setNegative(boolean z7) {
        throw new UnsupportedOperationException("Negative is invalid for Pattern!");
    }

    @Override // cn.hutool.core.text.finder.TextFinder
    public TextFinder setText(CharSequence charSequence) {
        this.matcher = this.pattern.matcher(charSequence);
        return super.setText(charSequence);
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public int start(int i8) {
        if (!this.matcher.find(i8) || this.matcher.end() > getValidEndIndex()) {
            return -1;
        }
        return this.matcher.start();
    }

    public PatternFinder(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override // cn.hutool.core.text.finder.TextFinder, cn.hutool.core.text.finder.b
    public PatternFinder reset() {
        this.matcher.reset();
        return this;
    }
}
