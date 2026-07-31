package androidx.core.os;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;

/* loaded from: classes10.dex */
public final class EnvironmentCompat {

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static String getExternalStorageState(File file) {
            return Environment.getExternalStorageState(file);
        }
    }
}
