package org.ahocorasick.interval;

import java.util.Comparator;

/* loaded from: classes5.dex */
public class d implements Comparator {
    @Override // java.util.Comparator
    public int compare(c cVar, c cVar2) {
        return cVar.getStart() - cVar2.getStart();
    }
}
