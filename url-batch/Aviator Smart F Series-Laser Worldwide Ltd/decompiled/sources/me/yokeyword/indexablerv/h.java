package me.yokeyword.indexablerv;

import java.util.Comparator;

/* loaded from: classes5.dex */
class h implements Comparator {
    h() {
    }

    @Override // java.util.Comparator
    public int compare(b bVar, b bVar2) {
        return bVar.getIndex().compareTo(bVar2.getIndex());
    }
}
