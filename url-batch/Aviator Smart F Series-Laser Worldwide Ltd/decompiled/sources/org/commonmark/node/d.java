package org.commonmark.node;

/* loaded from: classes5.dex */
public class d extends u {
    private String literal;

    public d() {
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

    public d(String str) {
        this.literal = str;
    }
}
