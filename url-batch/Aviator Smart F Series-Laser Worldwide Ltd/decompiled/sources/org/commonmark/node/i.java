package org.commonmark.node;

/* loaded from: classes5.dex */
public class i extends u implements g {
    private String delimiter;

    public i() {
    }

    @Override // org.commonmark.node.u
    public void accept(b0 b0Var) {
        b0Var.visit(this);
    }

    @Override // org.commonmark.node.g
    public String getClosingDelimiter() {
        return this.delimiter;
    }

    @Override // org.commonmark.node.g
    public String getOpeningDelimiter() {
        return this.delimiter;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public i(String str) {
        this.delimiter = str;
    }
}
