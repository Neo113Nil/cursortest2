package com.yandex.div.storage.database;

import android.content.Context;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DatabaseOpenHelperProvider {
    @NotNull
    DatabaseOpenHelper provide(@NotNull Context context, @NotNull String str, int i4, @NotNull DatabaseOpenHelper.CreateCallback createCallback, @NotNull DatabaseOpenHelper.UpgradeCallback upgradeCallback);
}
