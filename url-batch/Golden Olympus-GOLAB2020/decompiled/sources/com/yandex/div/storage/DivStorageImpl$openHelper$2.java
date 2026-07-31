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
/* synthetic */ class DivStorageImpl$openHelper$2 implements DatabaseOpenHelper.UpgradeCallback, InterfaceC3247m {
    final /* synthetic */ DivStorageImpl $tmp0;

    DivStorageImpl$openHelper$2(DivStorageImpl divStorageImpl) {
        this.$tmp0 = divStorageImpl;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof DatabaseOpenHelper.UpgradeCallback) && (obj instanceof InterfaceC3247m)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((InterfaceC3247m) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3247m
    @NotNull
    public final e getFunctionDelegate() {
        return new p(3, this.$tmp0, DivStorageImpl.class, "onUpgrade", "onUpgrade(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;II)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper.UpgradeCallback
    public final void onUpgrade(@NotNull DatabaseOpenHelper.Database p02, int i4, int i5) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        this.$tmp0.onUpgrade(p02, i4, i5);
    }
}
