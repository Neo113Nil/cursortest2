package org.ahocorasick.interval;

import java.util.Comparator;

/* loaded from: classes5.dex */
public class e implements Comparator {
    @Override // java.util.Comparator
    public int compare(c cVar, c cVar2) {
        int size = cVar2.size() - cVar.size();
        return size == 0 ? cVar.getStart() - cVar2.getStart() : size;
    }
}
