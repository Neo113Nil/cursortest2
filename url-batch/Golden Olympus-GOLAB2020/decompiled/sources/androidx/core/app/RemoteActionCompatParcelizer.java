package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f11599a = (IconCompat) aVar.v(remoteActionCompat.f11599a, 1);
        remoteActionCompat.f11600b = aVar.l(remoteActionCompat.f11600b, 2);
        remoteActionCompat.f11601c = aVar.l(remoteActionCompat.f11601c, 3);
        remoteActionCompat.f11602d = (PendingIntent) aVar.r(remoteActionCompat.f11602d, 4);
        remoteActionCompat.f11603e = aVar.h(remoteActionCompat.f11603e, 5);
        remoteActionCompat.f11604f = aVar.h(remoteActionCompat.f11604f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f11599a, 1);
        aVar.D(remoteActionCompat.f11600b, 2);
        aVar.D(remoteActionCompat.f11601c, 3);
        aVar.H(remoteActionCompat.f11602d, 4);
        aVar.z(remoteActionCompat.f11603e, 5);
        aVar.z(remoteActionCompat.f11604f, 6);
    }
}
