package com.ironsource;

import com.ironsource.C1563t;
import com.ironsource.fg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class jq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wl f16867a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Map<String, C1563t.d> f16868b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, C1563t.d> f16869c;

    public jq(@NotNull wl tools, @Nullable Map<String, C1563t.d> map, @Nullable Map<String, C1563t.d> map2) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        this.f16867a = tools;
        this.f16868b = map;
        this.f16869c = map2;
    }

    private final Object a(String str, Integer num) {
        Object createFailure;
        if (str == null || num == null) {
            Result.Companion companion = Result.Companion;
            createFailure = ResultKt.createFailure(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid"));
        } else {
            Result.Companion companion2 = Result.Companion;
            createFailure = Unit.f41027a;
        }
        return Result.m243constructorimpl(createFailure);
    }

    private final void b(fg.a aVar, String str, String str2, Integer num) {
        Object a4 = a(str2, num);
        if (Result.f(a4)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable d4 = Result.d(a4);
        if (d4 != null) {
            this.f16867a.b(str, 3004, d4.getMessage());
        }
    }

    public final void a(@NotNull fg.a rewardService) {
        Intrinsics.checkNotNullParameter(rewardService, "rewardService");
        Map<String, C1563t.d> map = this.f16869c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C1563t.d> entry : map.entrySet()) {
                String key = entry.getKey();
                hq f4 = entry.getValue().f();
                if (f4 != null) {
                    b(rewardService, key, f4.b(), f4.a());
                }
            }
        }
        Map<String, C1563t.d> map2 = this.f16868b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C1563t.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            hq a4 = entry2.getValue().a();
            if (a4 != null) {
                a(rewardService, key2, a4.b(), a4.a());
            }
        }
    }

    private final void a(fg.a aVar, String str, String str2, Integer num) {
        Object a4 = a(str2, num);
        if (Result.f(a4)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable d4 = Result.d(a4);
        if (d4 != null) {
            this.f16867a.b(str, 3004, d4.getMessage());
        }
    }
}
