package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import m1.a;
import m1.b;
import m1.c;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f401a;
        boolean z4 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f401a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f402b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2728e);
        }
        remoteActionCompat.f402b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f403c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2728e);
        }
        remoteActionCompat.f403c = charSequence2;
        remoteActionCompat.d = (PendingIntent) aVar.f(remoteActionCompat.d, 4);
        boolean z5 = remoteActionCompat.f404e;
        if (aVar.e(5)) {
            z5 = ((b) aVar).f2728e.readInt() != 0;
        }
        remoteActionCompat.f404e = z5;
        boolean z6 = remoteActionCompat.f405f;
        if (!aVar.e(6)) {
            z4 = z6;
        } else if (((b) aVar).f2728e.readInt() == 0) {
            z4 = false;
        }
        remoteActionCompat.f405f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f401a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f402b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f2728e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f403c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z4 = remoteActionCompat.f404e;
        aVar.h(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f405f;
        aVar.h(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
