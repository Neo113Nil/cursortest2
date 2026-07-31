package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ca2;
import com.yandex.mobile.ads.impl.oe2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ql1 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30832a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<pl1> f30833b;

    public ql1(@NotNull Context context, @NotNull ob2<?> videoAdInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30832a = context.getApplicationContext();
        this.f30833b = a(videoAdInfo);
    }

    private static List a(ob2 ob2Var) {
        hu b4 = ob2Var.b();
        long e4 = b4.e();
        List<a62> j4 = b4.j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : j4) {
            if (Intrinsics.areEqual("progress", ((a62) obj).a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            a62 a62Var = (a62) obj2;
            ca2 b5 = a62Var.b();
            pl1 pl1Var = null;
            if (b5 != null) {
                Long valueOf = ca2.b.f24147b == b5.c() ? Long.valueOf((long) b5.d()) : ca2.b.f24148c == b5.c() ? Long.valueOf((long) ((b5.d() / 100) * e4)) : null;
                if (valueOf != null) {
                    pl1Var = new pl1(a62Var.c(), valueOf.longValue());
                }
            }
            if (pl1Var != null) {
                arrayList2.add(pl1Var);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList2);
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        Iterator<pl1> it = this.f30833b.iterator();
        while (it.hasNext()) {
            pl1 next = it.next();
            if (next.a() <= j5) {
                oe2.a aVar = oe2.f30007c;
                Context context = this.f30832a;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                aVar.a(context).a(next.b());
                it.remove();
            }
        }
    }
}
