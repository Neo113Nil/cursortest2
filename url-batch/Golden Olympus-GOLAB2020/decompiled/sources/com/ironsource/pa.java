package com.ironsource;

import com.ironsource.gf;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class pa implements gf, gf.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, ma> f18616a = new ConcurrentHashMap<>();

    @Override // com.ironsource.gf
    @NotNull
    public l8 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        ma maVar = this.f18616a.get(identifier);
        return (maVar == null || maVar.a()) ? new l8(false, null, 2, null) : new l8(true, n8.Delivery);
    }

    @Override // com.ironsource.gf.a
    public void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.gf.a
    @NotNull
    public Object a(@NotNull String identifier, @NotNull n8 cappingType, @NotNull ef cappingConfig) {
        Object createFailure;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object a4 = cappingConfig.a();
        if (Result.f(a4)) {
            ma maVar = (ma) a4;
            if (maVar != null) {
                this.f18616a.put(identifier, maVar);
            }
        } else {
            Throwable d4 = Result.d(a4);
            if (d4 != null) {
                createFailure = ResultKt.createFailure(d4);
                return Result.m243constructorimpl(createFailure);
            }
        }
        createFailure = Unit.f41027a;
        return Result.m243constructorimpl(createFailure);
    }
}
