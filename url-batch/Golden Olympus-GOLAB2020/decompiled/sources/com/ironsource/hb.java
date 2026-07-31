package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface hb<T> extends qo {
    @NotNull
    String b();

    void b(@NotNull oh ohVar);

    @NotNull
    xc c();

    default boolean h() {
        return j().exists();
    }

    @NotNull
    Function1<Result<? extends T>, Unit> i();

    @NotNull
    oh j();

    @NotNull
    pf k();

    default void l() {
        k().a(this);
        if (j().exists()) {
            IronSourceStorageUtils.deleteFile(j());
        }
        try {
            k().a(j(), c().value(), 5, 5);
        } catch (Exception e4) {
            o9.d().a(e4);
            Function1<Result<? extends T>, Unit> i4 = i();
            Result.Companion companion = Result.Companion;
            i4.invoke(Result.a(Result.m243constructorimpl(ResultKt.createFailure(e4))));
        }
    }
}
