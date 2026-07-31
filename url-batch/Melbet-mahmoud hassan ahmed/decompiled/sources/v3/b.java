package v3;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public final class b {
    @RecentlyNonNull
    public static String a(@RecentlyNonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }
}
