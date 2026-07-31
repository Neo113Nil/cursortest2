package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ke extends pe {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f306a;

    public ke(LinkedList linkedList) {
        this.f306a = linkedList;
    }

    @Override // com.startapp.sdk.internal.pe
    public final boolean a(Object obj) {
        if (obj instanceof e9) {
            return this.f306a.contains(((e9) obj).n0.f348a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ke.class != obj.getClass()) {
            return false;
        }
        LinkedList linkedList = this.f306a;
        LinkedList linkedList2 = ((ke) obj).f306a;
        WeakHashMap weakHashMap = zh.f528a;
        return linkedList.equals(linkedList2);
    }

    public final int hashCode() {
        Object[] objArr = {this.f306a};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
