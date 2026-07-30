package org.commonmark.node;

/* loaded from: classes5.dex */
public class l extends a {
    private int level;

    @Override // org.commonmark.node.u
    public void accept(b0 b0Var) {
        b0Var.visit(this);
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int i8) {
        this.level = i8;
    }
}
