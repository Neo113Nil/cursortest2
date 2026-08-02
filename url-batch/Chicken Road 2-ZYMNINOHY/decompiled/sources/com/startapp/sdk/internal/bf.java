package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class bf extends hf {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f6716a;

    public bf(LinkedList linkedList) {
        this.f6716a = linkedList;
    }

    @Override // com.startapp.sdk.internal.hf
    public final boolean a(Object obj) {
        if (obj instanceof u9) {
            return this.f6716a.contains(((u9) obj).f7686n0.f6789a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bf.class != obj.getClass()) {
            return false;
        }
        LinkedList linkedList = this.f6716a;
        LinkedList linkedList2 = ((bf) obj).f6716a;
        WeakHashMap weakHashMap = si.f7575a;
        return linkedList.equals(linkedList2);
    }

    public final int hashCode() {
        Object[] objArr = {this.f6716a};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }
}
