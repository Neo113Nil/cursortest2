package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0394o3 implements InterfaceC0108co {
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0493s3> invoke(List<C0493s3> list, C0493s3 c0493s3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T7 t7 = ((C0493s3) it.next()).b;
                T7 t72 = c0493s3.b;
                if (t7 == t72) {
                    if (t72 != T7.c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C0493s3) obj).b != T7.c) {
                            arrayList.add(obj);
                        }
                    }
                    return CollectionsKt.plus((Collection<? extends C0493s3>) arrayList, c0493s3);
                }
            }
        }
        return CollectionsKt.plus((Collection<? extends C0493s3>) list, c0493s3);
    }
}
