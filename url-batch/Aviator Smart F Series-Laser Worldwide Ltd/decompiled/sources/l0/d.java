package l0;

/* loaded from: classes2.dex */
public class d {
    private boolean bound;
    private boolean refresh;

    public d(boolean z7) {
        this.refresh = false;
        this.bound = z7;
    }

    public boolean isBound() {
        return this.bound;
    }

    public boolean isRefresh() {
        return this.refresh;
    }

    public void setBound(boolean z7) {
        this.bound = z7;
    }

    public void setRefresh(boolean z7) {
        this.refresh = z7;
    }

    public d(boolean z7, boolean z8) {
        this.bound = z7;
        this.refresh = z8;
    }
}
