package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f497a = (IconCompat) aVar.I(remoteActionCompat.f497a, 1);
        remoteActionCompat.f498b = aVar.o(remoteActionCompat.f498b, 2);
        remoteActionCompat.f499c = aVar.o(remoteActionCompat.f499c, 3);
        remoteActionCompat.f500d = (PendingIntent) aVar.A(remoteActionCompat.f500d, 4);
        remoteActionCompat.f501e = aVar.i(remoteActionCompat.f501e, 5);
        remoteActionCompat.f502f = aVar.i(remoteActionCompat.f502f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.K(false, false);
        aVar.m0(remoteActionCompat.f497a, 1);
        aVar.S(remoteActionCompat.f498b, 2);
        aVar.S(remoteActionCompat.f499c, 3);
        aVar.d0(remoteActionCompat.f500d, 4);
        aVar.M(remoteActionCompat.f501e, 5);
        aVar.M(remoteActionCompat.f502f, 6);
    }
}
