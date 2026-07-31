package com.chartboost.sdk.impl;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class xa {
    public static final xa a = new xa();

    public final Object a(Element element, zj context) {
        List emptyList;
        List c;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        bm bmVar = bm.a;
        String d = bmVar.d(element, "AdSystem");
        String d2 = bmVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i);
        String d3 = bmVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j);
        List e = bmVar.e(element, "Error");
        Iterator it = e.iterator();
        while (it.hasNext()) {
            context.b().add(new qi("error", (String) it.next(), context.c(), null, null, null, 56, null));
        }
        List e2 = bm.a.e(element, "Impression");
        Iterator it2 = e2.iterator();
        while (it2.hasNext()) {
            context.b().add(new qi("impression", (String) it2.next(), context.c(), null, null, null, 56, null));
        }
        bm bmVar2 = bm.a;
        Element b = bmVar2.b(element, "Creatives");
        if (b == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new oc("Creatives in InLine", null, 2, null)));
        }
        Object b2 = p5.a.b(b, context);
        if (Result.m8028isFailureimpl(b2)) {
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(b2);
            Intrinsics.checkNotNull(m8026exceptionOrNullimpl);
            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
        }
        Element b3 = bmVar2.b(element, VastTagName.EXTENSIONS);
        if (b3 == null || (emptyList = p8.a.b(b3, context)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        ArrayList arrayList = new ArrayList();
        Element b4 = bmVar2.b(element, "AdVerifications");
        if (b4 != null) {
            arrayList.addAll(v0.a.b(b4, context));
        }
        if (b3 != null && (c = bmVar2.c(b3, VastTagName.EXTENSION)) != null) {
            Iterator it3 = c.iterator();
            while (it3.hasNext()) {
                Element b5 = bm.a.b((Element) it3.next(), "AdVerifications");
                if (b5 != null) {
                    arrayList.addAll(v0.a.b(b5, context));
                }
            }
        }
        List distinct = CollectionsKt.distinct(arrayList);
        context.a().addAll(distinct);
        List b6 = ol.a.b(element);
        Result.Companion companion2 = Result.INSTANCE;
        ResultKt.throwOnFailure(b2);
        return Result.m8023constructorimpl(new wa(d, d2, d3, e, e2, (List) b2, list, distinct, b6));
    }
}
