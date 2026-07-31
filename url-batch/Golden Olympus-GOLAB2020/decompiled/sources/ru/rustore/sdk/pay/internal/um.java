package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.s9;

/* loaded from: classes3.dex */
public final class um {
    @NotNull
    public static List a(@NotNull List methods, @Nullable s9 s9Var) {
        Intrinsics.checkNotNullParameter(methods, "methods");
        List createListBuilder = CollectionsKt.createListBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : methods) {
            if (!(((s9) obj) instanceof s9.f)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            s9 s9Var2 = (s9) obj2;
            createListBuilder.add(new tm(s9Var2, Intrinsics.areEqual(s9Var2, s9Var)));
        }
        return CollectionsKt.build(createListBuilder);
    }
}
