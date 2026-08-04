package androidx.sqlite.driver.bundled;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BundledSQLiteDriver.jvmAndroid.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\b8WX\u0096\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/sqlite/driver/bundled/BundledSQLiteDriver;", "Landroidx/sqlite/SQLiteDriver;", "<init>", "()V", "extensions", "", "", "hasConnectionPool", "", "hasConnectionPool$annotations", "()Z", "threadingMode", "", "getThreadingMode", "()I", "open", "Landroidx/sqlite/SQLiteConnection;", "fileName", "flags", "addExtension", "", "entryPoint", "NativeLibraryObject", "sqlite-bundled"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundledSQLiteDriver implements SQLiteDriver {
    private final Map<String, String> extensions = new LinkedHashMap();

    public static /* synthetic */ void hasConnectionPool$annotations() {
    }

    @Override // androidx.sqlite.SQLiteDriver
    public boolean hasConnectionPool() {
        return false;
    }

    public final int getThreadingMode() {
        int nativeThreadSafeMode;
        nativeThreadSafeMode = BundledSQLiteDriverKt.nativeThreadSafeMode();
        return nativeThreadSafeMode;
    }

    @Override // androidx.sqlite.SQLiteDriver
    public SQLiteConnection open(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return open(fileName, 6);
    }

    public final SQLiteConnection open(String fileName, int flags) {
        long nativeOpen;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        NativeLibraryObject nativeLibraryObject = NativeLibraryObject.INSTANCE;
        nativeOpen = BundledSQLiteDriverKt.nativeOpen(fileName, flags);
        BundledSQLiteConnection bundledSQLiteConnection = new BundledSQLiteConnection(nativeOpen);
        try {
            for (Map.Entry<String, String> entry : this.extensions.entrySet()) {
                bundledSQLiteConnection.loadExtension$sqlite_bundled(entry.getKey(), entry.getValue());
            }
            return bundledSQLiteConnection;
        } catch (Throwable th) {
            bundledSQLiteConnection.close();
            throw th;
        }
    }

    public final void addExtension(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (this.extensions.containsKey(fileName)) {
            throw new IllegalStateException(("Extension '" + fileName + "' is already added.").toString());
        }
        this.extensions.put(fileName, null);
    }

    public final void addExtension(String fileName, String entryPoint) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        if (this.extensions.containsKey(fileName)) {
            throw new IllegalStateException(("Extension '" + fileName + "' is already added.").toString());
        }
        this.extensions.put(fileName, entryPoint);
    }

    /* compiled from: BundledSQLiteDriver.jvmAndroid.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/driver/bundled/BundledSQLiteDriver$NativeLibraryObject;", "", "<init>", "()V", "sqlite-bundled"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class NativeLibraryObject {
        public static final NativeLibraryObject INSTANCE = new NativeLibraryObject();

        private NativeLibraryObject() {
        }

        static {
            NativeLibraryLoader.INSTANCE.loadLibrary("sqliteJni");
        }
    }
}
