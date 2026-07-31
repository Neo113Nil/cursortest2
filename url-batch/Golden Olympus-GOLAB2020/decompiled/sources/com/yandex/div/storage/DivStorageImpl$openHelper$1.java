package com.yandex.div.storage;

import W1.e;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC3247m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class DivStorageImpl$openHelper$1 implements DatabaseOpenHelper.CreateCallback, InterfaceC3247m {
    final /* synthetic */ DivStorageImpl $tmp0;

    DivStorageImpl$openHelper$1(DivStorageImpl divStorageImpl) {
        this.$tmp0 = divStorageImpl;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof DatabaseOpenHelper.CreateCallback) && (obj instanceof InterfaceC3247m)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((InterfaceC3247m) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3247m
    @NotNull
    public final e getFunctionDelegate() {
        return new p(1, this.$tmp0, DivStorageImpl.class, "onCreate", "onCreate(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper.CreateCallback
    public final void onCreate(@NotNull DatabaseOpenHelper.Database p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        this.$tmp0.onCreate(p02);
    }
}
