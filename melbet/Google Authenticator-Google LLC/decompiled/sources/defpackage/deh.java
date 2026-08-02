package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class deh extends dee {
    @Override // defpackage.dee
    public final void d(Status status) {
        if (status.c()) {
            return;
        }
        Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(String.valueOf(String.valueOf(status))));
    }
}
