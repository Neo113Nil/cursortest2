package org.commonmark.node;

/* loaded from: classes5.dex */
public class j extends a {
    private char fenceChar;
    private int fenceIndent;
    private int fenceLength;
    private String info;
    private String literal;

    @Override // org.commonmark.node.u
    public void accept(b0 b0Var) {
        b0Var.visit(this);
    }

    public char getFenceChar() {
        return this.fenceChar;
    }

    public int getFenceIndent() {
        return this.fenceIndent;
    }

    public int getFenceLength() {
        return this.fenceLength;
    }

    public String getInfo() {
        return this.info;
    }

    public String getLiteral() {
        return this.literal;
    }

    public void setFenceChar(char c8) {
        this.fenceChar = c8;
    }

    public void setFenceIndent(int i8) {
        this.fenceIndent = i8;
    }

    public void setFenceLength(int i8) {
        this.fenceLength = i8;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public void setLiteral(String str) {
        this.literal = str;
    }
}
