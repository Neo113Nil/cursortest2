package org.asyncstorage.shared_storage.database;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DatabaseFiles.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\"\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u001a"}, d2 = {"Lorg/asyncstorage/shared_storage/database/DatabaseFiles;", "", "databaseName", "", "platformDbDirectory", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDatabaseName", "()Ljava/lang/String;", "databaseFileName", "getDatabaseFileName", "directoryAbsolutePath", "getDirectoryAbsolutePath", "fileAbsolutePath", "getFileAbsolutePath", "component1", "component2", "copy", "copy$shared_storage", "equals", "", "other", "hashCode", "", "toString", "Companion", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DatabaseFiles {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EXT_NAME = "sqlite";
    public static final String GROUP_DIR_NAME = "async-storage";
    private final String databaseFileName;
    private final String databaseName;
    private final String platformDbDirectory;

    /* renamed from: component2, reason: from getter */
    private final String getPlatformDbDirectory() {
        return this.platformDbDirectory;
    }

    public static /* synthetic */ DatabaseFiles copy$shared_storage$default(DatabaseFiles databaseFiles, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = databaseFiles.databaseName;
        }
        if ((i & 2) != 0) {
            str2 = databaseFiles.platformDbDirectory;
        }
        return databaseFiles.copy$shared_storage(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDatabaseName() {
        return this.databaseName;
    }

    public final DatabaseFiles copy$shared_storage(String databaseName, String platformDbDirectory) {
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(platformDbDirectory, "platformDbDirectory");
        return new DatabaseFiles(databaseName, platformDbDirectory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatabaseFiles)) {
            return false;
        }
        DatabaseFiles databaseFiles = (DatabaseFiles) other;
        return Intrinsics.areEqual(this.databaseName, databaseFiles.databaseName) && Intrinsics.areEqual(this.platformDbDirectory, databaseFiles.platformDbDirectory);
    }

    public int hashCode() {
        return (this.databaseName.hashCode() * 31) + this.platformDbDirectory.hashCode();
    }

    public String toString() {
        return "DatabaseFiles(databaseName=" + this.databaseName + ", platformDbDirectory=" + this.platformDbDirectory + ')';
    }

    public DatabaseFiles(String databaseName, String platformDbDirectory) {
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(platformDbDirectory, "platformDbDirectory");
        this.databaseName = databaseName;
        this.platformDbDirectory = platformDbDirectory;
        this.databaseFileName = StringsKt.removeSuffix(databaseName, (CharSequence) ".") + ".sqlite";
    }

    public final String getDatabaseName() {
        return this.databaseName;
    }

    public final String getDatabaseFileName() {
        return this.databaseFileName;
    }

    public final String getDirectoryAbsolutePath() {
        return StringsKt.removeSuffix(this.platformDbDirectory, (CharSequence) "/") + "/async-storage/databases/" + this.databaseName;
    }

    public final String getFileAbsolutePath() {
        return StringsKt.removeSuffix(getDirectoryAbsolutePath(), (CharSequence) "/") + '/' + this.databaseFileName;
    }

    /* compiled from: DatabaseFiles.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lorg/asyncstorage/shared_storage/database/DatabaseFiles$Companion;", "", "<init>", "()V", "EXT_NAME", "", "GROUP_DIR_NAME", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
