package o4;

/* loaded from: classes3.dex */
public class a {
    private int childrenCount;
    private boolean hasFooter;
    private boolean hasHeader;

    public a(boolean z7, boolean z8, int i8) {
        this.hasHeader = z7;
        this.hasFooter = z8;
        this.childrenCount = i8;
    }

    public int getChildrenCount() {
        return this.childrenCount;
    }

    public boolean hasFooter() {
        return this.hasFooter;
    }

    public boolean hasHeader() {
        return this.hasHeader;
    }

    public void setChildrenCount(int i8) {
        this.childrenCount = i8;
    }

    public void setHasFooter(boolean z7) {
        this.hasFooter = z7;
    }

    public void setHasHeader(boolean z7) {
        this.hasHeader = z7;
    }
}
