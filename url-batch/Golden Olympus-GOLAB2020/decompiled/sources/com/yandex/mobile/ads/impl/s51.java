package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s51 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mk0 f31587a;

    public /* synthetic */ s51() {
        this(new mk0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    @Nullable
    public final String a(@Nullable f61 f61Var) {
        ?? listOfNotNull;
        if (f61Var instanceof pz1) {
            ArrayList d4 = ((pz1) f61Var).d();
            listOfNotNull = new ArrayList();
            int size = d4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = d4.get(i4);
                i4++;
                String info = ((f61) obj).getInfo();
                if (info != null) {
                    listOfNotNull.add(info);
                }
            }
        } else {
            listOfNotNull = CollectionsKt.listOfNotNull(f61Var != null ? f61Var.getInfo() : null);
        }
        List list = listOfNotNull;
        this.f31587a.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(list, StringUtils.COMMA, b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null);
    }

    public s51(@NotNull mk0 formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.f31587a = formatter;
    }
}
