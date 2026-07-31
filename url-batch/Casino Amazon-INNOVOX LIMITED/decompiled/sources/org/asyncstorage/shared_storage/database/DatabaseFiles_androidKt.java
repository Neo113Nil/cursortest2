package org.asyncstorage.shared_storage.database;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.asyncstorage.shared_storage.database.DatabaseFiles;

/* compiled from: DatabaseFiles.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, d2 = {"of", "Lorg/asyncstorage/shared_storage/database/DatabaseFiles;", "Lorg/asyncstorage/shared_storage/database/DatabaseFiles$Companion;", "context", "Landroid/content/Context;", "Lorg/asyncstorage/shared_storage/PlatformContext;", "databaseName", "", "ofInMemory", "getDatabasePath", "ctx", "shared-storage"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DatabaseFiles_androidKt {
    public static final DatabaseFiles of(DatabaseFiles.Companion companion, Context context, String databaseName) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        return new DatabaseFiles(databaseName, getDatabasePath(context));
    }

    public static final DatabaseFiles ofInMemory(DatabaseFiles.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new DatabaseFiles("in-memory", "/");
    }

    private static final String getDatabasePath(Context context) {
        File parentFile = context.getDatabasePath("temp").getParentFile();
        Intrinsics.checkNotNull(parentFile);
        String absolutePath = parentFile.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return StringsKt.removeSuffix(absolutePath, (CharSequence) "/");
    }
}
