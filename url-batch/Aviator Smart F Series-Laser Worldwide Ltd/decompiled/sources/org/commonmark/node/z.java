package org.commonmark.node;

/* loaded from: classes5.dex */
public class z extends u {
    private String literal;

    public z() {
    }

    @Override // org.commonmark.node.u
    public void accept(b0 b0Var) {
        b0Var.visit(this);
    }

    public String getLiteral() {
        return this.literal;
    }

    public void setLiteral(String str) {
        this.literal = str;
    }

    @Override // org.commonmark.node.u
    protected String toStringAttributes() {
        return "literal=" + this.literal;
    }

    public z(String str) {
        this.literal = str;
    }
}
