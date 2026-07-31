package r3;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class b {
    public static p3.b a(@RecentlyNonNull Status status) {
        return status.i() ? new p3.i(status) : new p3.b(status);
    }
}
