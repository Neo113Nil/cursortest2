package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class Qn {
    public static final Nn a(Throwable th, U u4, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Dn a4 = th != null ? En.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Dl((StackTraceElement) it.next()));
            }
        }
        return new Nn(a4, u4, arrayList, null, null, null, str, bool);
    }
}
