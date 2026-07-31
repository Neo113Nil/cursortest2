package com.ironsource;

import com.ironsource.gf;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ap implements gf, gf.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q9 f15095a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zf f15096b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, zo> f15097c;

    public ap(@NotNull q9 currentTimeProvider, @NotNull zf repository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f15095a = currentTimeProvider;
        this.f15096b = repository;
        this.f15097c = new LinkedHashMap();
    }

    @Override // com.ironsource.gf
    @NotNull
    public l8 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        zo zoVar = this.f15097c.get(identifier);
        if (zoVar != null && a(zoVar, identifier)) {
            return new l8(true, n8.Pacing);
        }
        return new l8(false, null, 2, null);
    }

    @Override // com.ironsource.gf.a
    public void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.f15097c.get(identifier) == null) {
            return;
        }
        this.f15096b.a(this.f15095a.a(), identifier);
    }

    @Override // com.ironsource.gf.a
    @NotNull
    public Object a(@NotNull String identifier, @NotNull n8 cappingType, @NotNull ef cappingConfig) {
        Object createFailure;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object b4 = cappingConfig.b();
        if (Result.f(b4)) {
            zo zoVar = (zo) b4;
            if (zoVar != null) {
                this.f15097c.put(identifier, zoVar);
            }
        } else {
            Throwable d4 = Result.d(b4);
            if (d4 != null) {
                createFailure = ResultKt.createFailure(d4);
                return Result.m243constructorimpl(createFailure);
            }
        }
        createFailure = Unit.f41027a;
        return Result.m243constructorimpl(createFailure);
    }

    @NotNull
    public final Map<String, zo> a() {
        return this.f15097c;
    }

    private final boolean a(zo zoVar, String str) {
        Long a4 = this.f15096b.a(str);
        return a4 != null && this.f15095a.a() - a4.longValue() < zoVar.a();
    }
}
