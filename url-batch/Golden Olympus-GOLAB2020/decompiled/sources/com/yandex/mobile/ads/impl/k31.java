package com.yandex.mobile.ads.impl;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class k31<K, V> extends AbstractC1982i<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: g, reason: collision with root package name */
    transient i32<? extends List<V>> f27995g;

    k31(Map<K, Collection<V>> map, i32<? extends List<V>> i32Var) {
        super(map);
        this.f27995g = (i32) nj1.a(i32Var);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f27995g = (i32) objectInputStream.readObject();
        a((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f27995g);
        objectOutputStream.writeObject(c());
    }
}
