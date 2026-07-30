package org.ahocorasick.trie;

/* loaded from: classes5.dex */
public abstract class e {
    private String fragment;

    public e(String str) {
        this.fragment = str;
    }

    public abstract a getEmit();

    public String getFragment() {
        return this.fragment;
    }

    public abstract boolean isMatch();
}
