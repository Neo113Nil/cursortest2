package com.yandex.div.storage.database;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface Migration {
    void migrate(@NotNull DatabaseOpenHelper.Database database);
}
