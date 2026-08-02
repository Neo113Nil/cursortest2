package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.aqs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(aqs aqsVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) aqsVar.t(remoteActionCompat.a);
        remoteActionCompat.b = aqsVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = aqsVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) aqsVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = aqsVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = aqsVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, aqs aqsVar) {
        aqsVar.u(remoteActionCompat.a);
        aqsVar.g(remoteActionCompat.b, 2);
        aqsVar.g(remoteActionCompat.c, 3);
        aqsVar.i(remoteActionCompat.d, 4);
        aqsVar.f(remoteActionCompat.e, 5);
        aqsVar.f(remoteActionCompat.f, 6);
    }
}
