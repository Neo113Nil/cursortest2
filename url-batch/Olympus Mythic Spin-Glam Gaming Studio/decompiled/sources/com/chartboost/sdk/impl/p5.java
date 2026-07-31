package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.o5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class p5 {
    public static final p5 a = new p5();

    public final o5 a(Element element, zj context) {
        List emptyList;
        List c;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        bm bmVar = bm.a;
        String a2 = bmVar.a(element, "id");
        String a3 = bmVar.a(element, "AdID");
        if (a3 == null) {
            a3 = bmVar.a(element, "adId");
        }
        String str = a3;
        String a4 = bmVar.a(element, "sequence");
        Integer intOrNull = a4 != null ? StringsKt.toIntOrNull(a4) : null;
        List b = bj.a.b(element);
        Element b2 = bmVar.b(element, "CreativeExtensions");
        if (b2 == null || (c = bmVar.c(b2, "CreativeExtension")) == null) {
            emptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c, 10));
            Iterator it = c.iterator();
            while (it.hasNext()) {
                arrayList.add(r5.a.a((Element) it.next()));
            }
            emptyList = arrayList;
        }
        bm bmVar2 = bm.a;
        Element b3 = bmVar2.b(element, "Linear");
        if (b3 != null) {
            return new o5.b(a2, str, intOrNull, b, qb.a.a(b3, context), emptyList);
        }
        Element b4 = bmVar2.b(element, "CompanionAds");
        if (b4 != null) {
            return new o5.a(a2, str, intOrNull, b, z4.a.b(b4, context), emptyList);
        }
        bmVar2.b(element, "NonLinearAds");
        return null;
    }

    public final Object b(Element creativesParentElement, zj context) {
        o5 o5Var;
        Intrinsics.checkNotNullParameter(creativesParentElement, "creativesParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        List c = bm.a.c(creativesParentElement, "Creative");
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                o5Var = a.a((Element) it.next(), context);
            } catch (Exception e) {
                xb.b("Failed to parse Creative element: " + e.getMessage(), e);
                o5Var = null;
            }
            if (o5Var != null) {
                arrayList.add(o5Var);
            }
        }
        return Result.m8023constructorimpl(arrayList);
    }
}
