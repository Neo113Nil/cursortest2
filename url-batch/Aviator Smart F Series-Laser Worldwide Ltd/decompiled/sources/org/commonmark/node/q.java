package org.commonmark.node;

/* loaded from: classes5.dex */
public class q extends u {
    private String destination;
    private String title;

    public q() {
    }

    @Override // org.commonmark.node.u
    public void accept(b0 b0Var) {
        b0Var.visit(this);
    }

    public String getDestination() {
        return this.destination;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDestination(String str) {
        this.destination = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // org.commonmark.node.u
    protected String toStringAttributes() {
        return "destination=" + this.destination + ", title=" + this.title;
    }

    public q(String str, String str2) {
        this.destination = str;
        this.title = str2;
    }
}
