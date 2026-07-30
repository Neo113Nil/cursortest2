package org.commonmark.node;

/* loaded from: classes5.dex */
public class c extends s {
    private char bulletMarker;

    @Override // org.commonmark.node.u
    public void accept(b0 b0Var) {
        b0Var.visit(this);
    }

    public char getBulletMarker() {
        return this.bulletMarker;
    }

    public void setBulletMarker(char c8) {
        this.bulletMarker = c8;
    }
}
