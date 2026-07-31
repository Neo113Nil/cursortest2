package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.h4;
import ru.rustore.sdk.pay.internal.o4;

/* loaded from: classes3.dex */
public final class i4 {
    @NotNull
    public static h4 a(@Nullable z4 z4Var) {
        if (z4Var == null) {
            return h4.a.f44213a;
        }
        o4 o4Var = z4Var.f45311a;
        if (o4Var instanceof o4.c) {
            o4.c cVar = (o4.c) o4Var;
            return cVar.f44723a.isEmpty() ? h4.a.f44213a : new h4.b(cVar.f44723a.size());
        }
        Object obj = null;
        if (!(o4Var instanceof o4.a)) {
            if (o4Var instanceof o4.d) {
                throw null;
            }
            if (!(o4Var instanceof o4.b)) {
                return h4.a.f44213a;
            }
            ((wj) CollectionsKt.firstOrNull((List) null)).getClass();
            throw null;
        }
        o4.a aVar = (o4.a) o4Var;
        wj wjVar = (wj) CollectionsKt.firstOrNull((List) aVar.f44722b);
        if (wjVar == null) {
            return new h4.b(aVar.f44721a.size());
        }
        ArrayList arrayList = aVar.f44721a;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i4);
            i4++;
            if (Intrinsics.areEqual(((b3) obj2).f43845a, wjVar.f45191a)) {
                obj = obj2;
                break;
            }
        }
        b3 b3Var = (b3) obj;
        return b3Var != null ? new h4.d(b3Var) : new h4.b(aVar.f44721a.size());
    }
}
