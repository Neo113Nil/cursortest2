package cn.hutool.core.lang;

/* loaded from: classes.dex */
public class y implements q0 {
    protected Number endIndex;
    protected Number startIndex;

    public y(Number number, Number number2) {
        this.startIndex = number;
        this.endIndex = number2;
    }

    @Override // cn.hutool.core.lang.q0
    public Number getEndIndex() {
        return this.endIndex;
    }

    @Override // cn.hutool.core.lang.q0
    public Number getStartIndex() {
        return this.startIndex;
    }

    @Override // cn.hutool.core.lang.q0
    public /* bridge */ /* synthetic */ Number length() {
        return p0.a(this);
    }
}
