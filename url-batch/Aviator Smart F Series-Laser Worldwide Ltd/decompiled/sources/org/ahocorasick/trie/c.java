package org.ahocorasick.trie;

/* loaded from: classes5.dex */
public class c extends e {
    private a emit;

    public c(String str, a aVar) {
        super(str);
        this.emit = aVar;
    }

    @Override // org.ahocorasick.trie.e
    public a getEmit() {
        return this.emit;
    }

    @Override // org.ahocorasick.trie.e
    public boolean isMatch() {
        return true;
    }
}
