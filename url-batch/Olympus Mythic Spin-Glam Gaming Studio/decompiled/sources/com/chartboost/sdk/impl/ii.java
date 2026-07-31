package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.o7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public abstract class ii implements hi {
    public final AtomicReference a;

    public ii(AtomicReference sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.a = sdkConfiguration;
    }

    @Override // com.chartboost.sdk.impl.hi
    public List a(o7.b eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        sg sgVar = (sg) this.a.get();
        List b = sgVar != null ? sgVar.b() : null;
        List emptyList = (b == null || b.isEmpty()) ? CollectionsKt.emptyList() : a(b, eventType);
        ArrayList arrayList = new ArrayList();
        for (Object obj : emptyList) {
            if (!StringsKt.isBlank(((ei) obj).d())) {
                arrayList.add(obj);
            }
        }
        return (arrayList.isEmpty() && eventType == o7.b.o) ? CollectionsKt.listOf(r7.a.a()) : arrayList;
    }

    public final List a(List list, o7.b bVar) {
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.equals(((o7) obj).d(), bVar.b(), true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            String e = o7Var.e();
            String c = o7Var.c();
            String a = o7Var.a();
            if (a == null || a.length() <= 0) {
                a = null;
            }
            arrayList2.add(new ei(e, c, a, o7Var.b()));
        }
        return arrayList2;
    }
}
