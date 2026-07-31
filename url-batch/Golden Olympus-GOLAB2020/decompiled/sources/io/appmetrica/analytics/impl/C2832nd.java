package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2832nd {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f39498a = new LinkedHashSet();

    public final synchronized Set a() {
        ArrayList arrayList;
        try {
            LinkedHashSet linkedHashSet = this.f39498a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC2806md) it.next()).a());
            }
            arrayList = new ArrayList();
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return CollectionsKt.toSet(arrayList);
    }

    public final synchronized void a(InterfaceC2806md... interfaceC2806mdArr) {
        CollectionsKt.addAll(this.f39498a, interfaceC2806mdArr);
    }
}
