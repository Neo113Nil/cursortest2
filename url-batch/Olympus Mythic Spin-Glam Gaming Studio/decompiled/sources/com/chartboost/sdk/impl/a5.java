package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class a5 {
    public static final a5 a = new a5();

    public final double a(Object obj) {
        String a2;
        if (obj instanceof lh) {
            String a3 = ((lh) obj).a();
            if (a3 == null) {
                return 0.0d;
            }
            if (StringsKt.startsWith(a3, "image", true)) {
                return 0.8d;
            }
            if (!StringsKt.contains((CharSequence) a3, (CharSequence) "javascript", true)) {
                StringsKt.contains((CharSequence) a3, (CharSequence) "flash", true);
                return 0.0d;
            }
        } else {
            if (!(obj instanceof l9)) {
                return (!(obj instanceof e9) || (a2 = ((e9) obj).a()) == null || StringsKt.isBlank(a2)) ? 0.0d : 1.2d;
            }
            String a4 = ((l9) obj).a();
            if (a4 == null || StringsKt.isBlank(a4)) {
                return 0.0d;
            }
        }
        return 1.0d;
    }

    public final double a(cg cgVar, y4 y4Var) {
        double d = cgVar.d();
        double b = cgVar.b();
        Integer j = y4Var.j();
        if (j != null) {
            double intValue = j.intValue();
            Integer d2 = y4Var.d();
            if (d2 != null) {
                double intValue2 = d2.intValue();
                float a2 = cgVar.a();
                if (d > 0.0d && b > 0.0d && intValue > 0.0d && intValue2 > 0.0d) {
                    double abs = Math.abs((d / b) - (intValue / intValue2));
                    double d3 = d * a2;
                    return abs + (d3 != 0.0d ? Math.abs(d3 - intValue) / d3 : Double.MAX_VALUE);
                }
            }
        }
        return Double.MAX_VALUE;
    }

    public final y4 a(List companionAds, cg renderingContainer) {
        Object next;
        y4 a2;
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        Intrinsics.checkNotNullParameter(renderingContainer, "renderingContainer");
        ArrayList arrayList = new ArrayList();
        Iterator it = companionAds.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            y4 y4Var = (y4) it.next();
            double a3 = a.a(renderingContainer, y4Var);
            ak akVar = null;
            double d = Double.NEGATIVE_INFINITY;
            for (ak akVar2 : CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) y4Var.h(), (Iterable) y4Var.f()), (Iterable) y4Var.e())) {
                double a4 = a.a(akVar2);
                if (a4 > 0.0d) {
                    double d2 = a4 / (1.0d + a3);
                    if (d2 > d) {
                        akVar = akVar2;
                        d = d2;
                    }
                }
            }
            if (d != Double.NEGATIVE_INFINITY && akVar != null && CollectionsKt.contains(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) y4Var.h(), (Iterable) y4Var.f()), (Iterable) y4Var.e()), akVar)) {
                a2 = y4Var.a((r37 & 1) != 0 ? y4Var.a : null, (r37 & 2) != 0 ? y4Var.b : null, (r37 & 4) != 0 ? y4Var.c : null, (r37 & 8) != 0 ? y4Var.d : null, (r37 & 16) != 0 ? y4Var.e : null, (r37 & 32) != 0 ? y4Var.f : null, (r37 & 64) != 0 ? y4Var.g : null, (r37 & 128) != 0 ? y4Var.h : null, (r37 & 256) != 0 ? y4Var.i : null, (r37 & 512) != 0 ? y4Var.j : null, (r37 & 1024) != 0 ? y4Var.k : null, (r37 & 2048) != 0 ? y4Var.l : null, (r37 & 4096) != 0 ? y4Var.m : null, (r37 & 8192) != 0 ? y4Var.n : null, (r37 & 16384) != 0 ? y4Var.o : null, (r37 & 32768) != 0 ? y4Var.p : null, (r37 & 65536) != 0 ? y4Var.q : null, (r37 & 131072) != 0 ? y4Var.r : null, (r37 & 262144) != 0 ? y4Var.s : akVar);
                pair = TuplesKt.to(a2, Double.valueOf(d));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                double doubleValue = ((Number) ((Pair) next).getSecond()).doubleValue();
                do {
                    Object next2 = it2.next();
                    double doubleValue2 = ((Number) ((Pair) next2).getSecond()).doubleValue();
                    if (Double.compare(doubleValue, doubleValue2) < 0) {
                        next = next2;
                        doubleValue = doubleValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair2 = (Pair) next;
        if (pair2 != null) {
            return (y4) pair2.getFirst();
        }
        return null;
    }
}
