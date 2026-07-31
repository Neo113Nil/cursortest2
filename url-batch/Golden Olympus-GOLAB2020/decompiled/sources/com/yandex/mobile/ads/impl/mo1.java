package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mo1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final List<String> f29197a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1920f9 f29198b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final lo1 f29199c;

    public /* synthetic */ mo1(Context context, C2360y7 c2360y7, C2286v2 c2286v2, EnumC1848c9 enumC1848c9, List list) {
        this(context, c2360y7, c2286v2, enumC1848c9, list, new C1920f9(context, c2286v2), new lo1(context, c2286v2, c2360y7, enumC1848c9));
    }

    public final void a(@NotNull h91 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f29199c.a(reportParameterManager);
    }

    public final void a() {
        List<String> list = this.f29197a;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f29198b.a(it.next(), o62.f29924i);
            }
        }
        this.f29199c.a();
    }

    public mo1(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration, @NotNull EnumC1848c9 adStructureType, @Nullable List<String> list, @NotNull C1920f9 adTracker, @NotNull lo1 renderReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(renderReporter, "renderReporter");
        this.f29197a = list;
        this.f29198b = adTracker;
        this.f29199c = renderReporter;
    }
}
