package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import r.b;
import r.c;
import r.d;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f6a;
        boolean z2 = true;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f6a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f7b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1135e);
        }
        remoteActionCompat.f7b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f8c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1135e);
        }
        remoteActionCompat.f8c = charSequence2;
        remoteActionCompat.f9d = (PendingIntent) bVar.f(remoteActionCompat.f9d, 4);
        boolean z3 = remoteActionCompat.f10e;
        if (bVar.e(5)) {
            z3 = ((c) bVar).f1135e.readInt() != 0;
        }
        remoteActionCompat.f10e = z3;
        boolean z4 = remoteActionCompat.f11f;
        if (!bVar.e(6)) {
            z2 = z4;
        } else if (((c) bVar).f1135e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f11f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f6a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f7b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f1135e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f8c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f9d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f10e;
        bVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f11f;
        bVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
