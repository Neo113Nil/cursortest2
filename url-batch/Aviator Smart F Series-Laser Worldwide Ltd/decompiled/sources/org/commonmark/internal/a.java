package org.commonmark.internal;

/* loaded from: classes5.dex */
class a {
    private int lineCount;
    private final StringBuilder sb;

    public a() {
        this.lineCount = 0;
        this.sb = new StringBuilder();
    }

    public void add(CharSequence charSequence) {
        if (this.lineCount != 0) {
            this.sb.append('\n');
        }
        this.sb.append(charSequence);
        this.lineCount++;
    }

    public String getString() {
        return this.sb.toString();
    }

    public a(String str) {
        this.lineCount = 0;
        this.sb = new StringBuilder(str);
    }
}
