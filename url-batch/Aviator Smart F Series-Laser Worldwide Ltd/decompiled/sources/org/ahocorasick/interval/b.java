package org.ahocorasick.interval;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public class b {
    private IntervalNode rootNode;

    public b(List<c> list) {
        this.rootNode = null;
        this.rootNode = new IntervalNode(list);
    }

    public List<c> findOverlaps(c cVar) {
        return this.rootNode.findOverlaps(cVar);
    }

    public List<c> removeOverlaps(List<c> list) {
        Collections.sort(list, new e());
        TreeSet treeSet = new TreeSet();
        for (c cVar : list) {
            if (!treeSet.contains(cVar)) {
                treeSet.addAll(findOverlaps(cVar));
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            list.remove((c) it.next());
        }
        Collections.sort(list, new d());
        return list;
    }
}
