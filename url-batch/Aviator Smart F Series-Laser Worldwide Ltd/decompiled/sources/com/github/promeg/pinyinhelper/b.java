package com.github.promeg.pinyinhelper;

import com.github.promeg.pinyinhelper.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class b implements i {
    static final a.C0264a HIT_COMPARATOR = new a.C0264a();

    b() {
    }

    @Override // com.github.promeg.pinyinhelper.i
    public List<org.ahocorasick.trie.a> select(Collection<org.ahocorasick.trie.a> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList<org.ahocorasick.trie.a> arrayList = new ArrayList(collection);
        Collections.sort(arrayList, HIT_COMPARATOR);
        TreeSet treeSet = new TreeSet();
        int i8 = -1;
        for (org.ahocorasick.trie.a aVar : arrayList) {
            if (aVar.getStart() <= i8 || aVar.getEnd() <= i8) {
                treeSet.add(aVar);
            } else {
                i8 = aVar.getEnd();
            }
        }
        arrayList.removeAll(treeSet);
        return arrayList;
    }
}
