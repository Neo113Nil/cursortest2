package com.drake.net.tag;

import com.drake.net.interfaces.c;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public final class NetTag$DownloadListeners extends ConcurrentLinkedQueue<c> {
    public /* bridge */ boolean contains(c cVar) {
        return super.contains((Object) cVar);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ boolean remove(c cVar) {
        return super.remove((Object) cVar);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return contains((c) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return remove((c) obj);
        }
        return false;
    }
}
