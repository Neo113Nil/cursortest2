package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.jl;
import ru.rustore.sdk.pay.internal.ml;

/* loaded from: classes3.dex */
public final class nl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final u4 f44711a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final y7 f44712b;

    public nl(@NotNull u4 currencyFormatter, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(currencyFormatter, "currencyFormatter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f44711a = currencyFormatter;
        this.f44712b = logger;
    }

    @NotNull
    public final ArrayList a(@NotNull ArrayList tariffs) {
        ml bVar;
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        ArrayList arrayList = new ArrayList();
        int size = tariffs.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = tariffs.get(i5);
            i5++;
            if (!(((jl) obj) instanceof jl.d)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            jl jlVar = (jl) obj2;
            if (jlVar instanceof jl.a) {
                u4 u4Var = this.f44711a;
                jl.a aVar = (jl.a) jlVar;
                long value = aVar.f44391a.getValue();
                u4Var.getClass();
                bVar = new ml.a(u4.a(value), aVar.f44392b);
            } else if (jlVar instanceof jl.c) {
                u4 u4Var2 = this.f44711a;
                jl.c cVar = (jl.c) jlVar;
                long value2 = cVar.f44395a.getValue();
                u4Var2.getClass();
                bVar = new ml.c(u4.a(value2), cVar.f44396b);
            } else {
                if (!(jlVar instanceof jl.b)) {
                    if (!(jlVar instanceof jl.d)) {
                        throw new W1.m();
                    }
                    IllegalStateException throwable = new IllegalStateException("unsupported tariff type: ".concat(jlVar.getClass().getSimpleName()));
                    y7 y7Var = this.f44712b;
                    y7Var.getClass();
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    u3.e.i(y7Var.f45263a, throwable, null, 2, null);
                    throw throwable;
                }
                u4 u4Var3 = this.f44711a;
                jl.b bVar2 = (jl.b) jlVar;
                long value3 = bVar2.f44393a.getValue();
                u4Var3.getClass();
                bVar = new ml.b(u4.a(value3), bVar2.f44394b);
            }
            arrayList2.add(bVar);
        }
        return arrayList2;
    }
}
