package org.commonmark.node;

/* loaded from: classes5.dex */
public class v extends s {
    private char delimiter;
    private int startNumber;

    @Override // org.commonmark.node.u
    public void accept(b0 b0Var) {
        b0Var.visit(this);
    }

    public char getDelimiter() {
        return this.delimiter;
    }

    public int getStartNumber() {
        return this.startNumber;
    }

    public void setDelimiter(char c8) {
        this.delimiter = c8;
    }

    public void setStartNumber(int i8) {
        this.startNumber = i8;
    }
}
