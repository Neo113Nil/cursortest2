package q3;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class o {
    public static <TResult> void a(@RecentlyNonNull Status status, TResult tresult, @RecentlyNonNull j4.i<TResult> iVar) {
        if (status.j()) {
            iVar.c(tresult);
        } else {
            iVar.b(new p3.b(status));
        }
    }
}
