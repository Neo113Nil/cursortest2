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
public final class zl {
    public static final zl a = new zl();

    public final Object a(Element element, zj context) {
        Object m8023constructorimpl;
        List emptyList;
        List c;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        bm bmVar = bm.a;
        String d = bmVar.d(element, "AdSystem");
        List e = bmVar.e(element, "Error");
        List e2 = bmVar.e(element, "Impression");
        String d2 = bmVar.d(element, "VASTAdTagURI");
        if (d2 == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new oc("VASTAdTagURI in Wrapper", null, 2, null)));
        }
        Element b = bmVar.b(element, "Creatives");
        if (b != null) {
            m8023constructorimpl = p5.a.b(b, context);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(CollectionsKt.emptyList());
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            Intrinsics.checkNotNull(m8026exceptionOrNullimpl);
            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
        }
        Element b2 = bmVar.b(element, VastTagName.EXTENSIONS);
        if (b2 == null || (emptyList = p8.a.b(b2, context)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        ArrayList arrayList = new ArrayList();
        Element b3 = bmVar.b(element, "AdVerifications");
        if (b3 != null) {
            arrayList.addAll(v0.a.b(b3, context));
        }
        if (b2 != null && (c = bmVar.c(b2, VastTagName.EXTENSION)) != null) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                Element b4 = bm.a.b((Element) it.next(), "AdVerifications");
                if (b4 != null) {
                    arrayList.addAll(v0.a.b(b4, context));
                }
            }
        }
        List b5 = ol.a.b(element);
        Result.Companion companion3 = Result.INSTANCE;
        ResultKt.throwOnFailure(m8023constructorimpl);
        return Result.m8023constructorimpl(new yl(d, e, e2, (List) m8023constructorimpl, list, d2, arrayList, b5));
    }
}
