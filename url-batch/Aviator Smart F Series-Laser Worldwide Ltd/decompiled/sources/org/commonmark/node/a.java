package org.commonmark.node;

/* loaded from: classes5.dex */
public abstract class a extends u {
    @Override // org.commonmark.node.u
    protected void setParent(u uVar) {
        if (!(uVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.setParent(uVar);
    }

    @Override // org.commonmark.node.u
    public a getParent() {
        return (a) super.getParent();
    }
}
