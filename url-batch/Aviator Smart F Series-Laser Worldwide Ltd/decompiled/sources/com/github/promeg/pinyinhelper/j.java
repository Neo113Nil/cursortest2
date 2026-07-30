package com.github.promeg.pinyinhelper;

import cn.hutool.core.convert.impl.s;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.ahocorasick.trie.f;

/* loaded from: classes3.dex */
final class j {
    private j() {
    }

    static org.ahocorasick.trie.f dictsToTrie(List<h> list) {
        TreeSet treeSet = new TreeSet();
        f.b builder = org.ahocorasick.trie.f.builder();
        if (list == null) {
            return null;
        }
        Iterator<h> it = list.iterator();
        while (it.hasNext()) {
            s.a(it.next());
        }
        if (treeSet.size() <= 0) {
            return null;
        }
        Iterator it2 = treeSet.iterator();
        while (it2.hasNext()) {
            builder.addKeyword((String) it2.next());
        }
        return builder.build();
    }
}
