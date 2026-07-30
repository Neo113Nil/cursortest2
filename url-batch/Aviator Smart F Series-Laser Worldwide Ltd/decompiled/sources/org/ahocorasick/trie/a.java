package org.ahocorasick.trie;

/* loaded from: classes5.dex */
public class a extends org.ahocorasick.interval.a {
    private final String keyword;

    public a(int i8, int i9, String str) {
        super(i8, i9);
        this.keyword = str;
    }

    public String getKeyword() {
        return this.keyword;
    }

    @Override // org.ahocorasick.interval.a
    public String toString() {
        return super.toString() + "=" + this.keyword;
    }
}
