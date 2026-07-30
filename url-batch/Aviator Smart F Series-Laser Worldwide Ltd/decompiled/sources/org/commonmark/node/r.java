package org.commonmark.node;

/* loaded from: classes5.dex */
public class r extends u {
    private String destination;
    private String label;
    private String title;

    public r() {
    }

    @Override // org.commonmark.node.u
    public void accept(b0 b0Var) {
        b0Var.visit(this);
    }

    public String getDestination() {
        return this.destination;
    }

    public String getLabel() {
        return this.label;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDestination(String str) {
        this.destination = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public r(String str, String str2, String str3) {
        this.label = str;
        this.destination = str2;
        this.title = str3;
    }
}
