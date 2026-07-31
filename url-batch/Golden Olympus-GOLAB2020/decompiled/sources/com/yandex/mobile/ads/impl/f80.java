package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f80 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xr0 f25705a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e80 f25706b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private static f80 f25707a;

        @NotNull
        public static final synchronized f80 a(@NotNull Context context) {
            f80 f80Var;
            synchronized (a.class) {
                Intrinsics.checkNotNullParameter(context, "context");
                f80Var = f25707a;
                if (f80Var == null) {
                    f80Var = new f80(context, 0);
                    f25707a = f80Var;
                }
            }
            return f80Var;
        }
    }

    private f80(Context context) {
        this(zr0.a(context, "FalseClickDataStorage"));
    }

    public final void a() {
        this.f25705a.clear();
    }

    @NotNull
    public final List<d80> b() {
        Set<String> keySet = this.f25705a.a().keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            String d4 = this.f25705a.d((String) it.next());
            if (d4 != null) {
                arrayList.add(d4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            d80 a4 = this.f25706b.a((String) obj);
            if (a4 != null) {
                arrayList2.add(a4);
            }
        }
        return CollectionsKt.toList(arrayList2);
    }

    public /* synthetic */ f80(Context context, int i4) {
        this(context);
    }

    public final void a(long j4) {
        this.f25705a.a(String.valueOf(j4));
    }

    public /* synthetic */ f80(xr0 xr0Var) {
        this(xr0Var, new e80(0));
    }

    public final void a(@NotNull d80 falseClickData) {
        Intrinsics.checkNotNullParameter(falseClickData, "falseClickData");
        this.f25705a.a(String.valueOf(falseClickData.f()), this.f25706b.a(falseClickData));
    }

    public f80(@NotNull xr0 localStorage, @NotNull e80 falseClickDataFormatter) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(falseClickDataFormatter, "falseClickDataFormatter");
        this.f25705a = localStorage;
        this.f25706b = falseClickDataFormatter;
    }
}
