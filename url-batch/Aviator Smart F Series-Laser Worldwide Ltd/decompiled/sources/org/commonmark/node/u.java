package org.commonmark.node;

/* loaded from: classes5.dex */
public abstract class u {
    private u parent = null;
    private u firstChild = null;
    private u lastChild = null;
    private u prev = null;
    private u next = null;

    public abstract void accept(b0 b0Var);

    public void appendChild(u uVar) {
        uVar.unlink();
        uVar.setParent(this);
        u uVar2 = this.lastChild;
        if (uVar2 == null) {
            this.firstChild = uVar;
            this.lastChild = uVar;
        } else {
            uVar2.next = uVar;
            uVar.prev = uVar2;
            this.lastChild = uVar;
        }
    }

    public u getFirstChild() {
        return this.firstChild;
    }

    public u getLastChild() {
        return this.lastChild;
    }

    public u getNext() {
        return this.next;
    }

    public u getParent() {
        return this.parent;
    }

    public u getPrevious() {
        return this.prev;
    }

    public void insertAfter(u uVar) {
        uVar.unlink();
        u uVar2 = this.next;
        uVar.next = uVar2;
        if (uVar2 != null) {
            uVar2.prev = uVar;
        }
        uVar.prev = this;
        this.next = uVar;
        u uVar3 = this.parent;
        uVar.parent = uVar3;
        if (uVar.next == null) {
            uVar3.lastChild = uVar;
        }
    }

    public void insertBefore(u uVar) {
        uVar.unlink();
        u uVar2 = this.prev;
        uVar.prev = uVar2;
        if (uVar2 != null) {
            uVar2.next = uVar;
        }
        uVar.next = this;
        this.prev = uVar;
        u uVar3 = this.parent;
        uVar.parent = uVar3;
        if (uVar.prev == null) {
            uVar3.firstChild = uVar;
        }
    }

    public void prependChild(u uVar) {
        uVar.unlink();
        uVar.setParent(this);
        u uVar2 = this.firstChild;
        if (uVar2 == null) {
            this.firstChild = uVar;
            this.lastChild = uVar;
        } else {
            uVar2.prev = uVar;
            uVar.next = uVar2;
            this.firstChild = uVar;
        }
    }

    protected void setParent(u uVar) {
        this.parent = uVar;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + toStringAttributes() + "}";
    }

    protected String toStringAttributes() {
        return "";
    }

    public void unlink() {
        u uVar = this.prev;
        if (uVar != null) {
            uVar.next = this.next;
        } else {
            u uVar2 = this.parent;
            if (uVar2 != null) {
                uVar2.firstChild = this.next;
            }
        }
        u uVar3 = this.next;
        if (uVar3 != null) {
            uVar3.prev = uVar;
        } else {
            u uVar4 = this.parent;
            if (uVar4 != null) {
                uVar4.lastChild = uVar;
            }
        }
        this.parent = null;
        this.next = null;
        this.prev = null;
    }
}
