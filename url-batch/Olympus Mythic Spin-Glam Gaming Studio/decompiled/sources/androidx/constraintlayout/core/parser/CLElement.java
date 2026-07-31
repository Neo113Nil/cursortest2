package androidx.constraintlayout.core.parser;

/* loaded from: classes15.dex */
public class CLElement {
    protected long end;
    private int line;
    private final char[] mContent;
    protected long start;

    public int getLine() {
        return this.line;
    }

    public String toString() {
        long j = this.start;
        long j2 = this.end;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.start + "-" + this.end + ")";
        }
        return getStrClass() + " (" + this.start + " : " + this.end + ") <<" + new String(this.mContent).substring((int) this.start, ((int) this.end) + 1) + ">>";
    }

    protected String getStrClass() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }
}
