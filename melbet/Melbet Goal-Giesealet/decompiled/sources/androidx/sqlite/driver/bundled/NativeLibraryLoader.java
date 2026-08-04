package androidx.sqlite.driver.bundled;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeLibraryLoader.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/sqlite/driver/bundled/NativeLibraryLoader;", "", "<init>", "()V", "LIB_PATH_PROPERTY_NAME", "", "LIB_NAME_PROPERTY_NAME", "loadLibrary", "", "name", "sqlite-bundled"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativeLibraryLoader {
    public static final NativeLibraryLoader INSTANCE = new NativeLibraryLoader();
    private static final String LIB_NAME_PROPERTY_NAME = "androidx.sqlite.driver.bundled.name";
    private static final String LIB_PATH_PROPERTY_NAME = "androidx.sqlite.driver.bundled.path";

    private NativeLibraryLoader() {
    }

    public final void loadLibrary(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        synchronized (this) {
            String property = System.getProperty(LIB_PATH_PROPERTY_NAME);
            String property2 = System.getProperty(LIB_NAME_PROPERTY_NAME);
            if (property != null && property2 != null) {
                File file = new File(property, property2);
                if (!file.exists()) {
                    throw new IllegalStateException(("Cannot find a suitable SQLite binary at the configured path(androidx.sqlite.driver.bundled.path = " + property + "). File " + file + " does not exist.").toString());
                }
                System.load(file.getAbsolutePath());
                return;
            }
            System.loadLibrary(name);
            Unit unit = Unit.INSTANCE;
        }
    }
}
