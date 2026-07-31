package androidx.core.app;

import E1.b;
import E1.c;
import E1.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f4948a;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f4948a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f4949b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1037e);
        }
        remoteActionCompat.f4949b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4950c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1037e);
        }
        remoteActionCompat.f4950c = charSequence2;
        remoteActionCompat.f4951d = (PendingIntent) bVar.f(remoteActionCompat.f4951d, 4);
        boolean z3 = remoteActionCompat.f4952e;
        if (bVar.e(5)) {
            z3 = ((c) bVar).f1037e.readInt() != 0;
        }
        remoteActionCompat.f4952e = z3;
        boolean z4 = remoteActionCompat.f4953f;
        if (bVar.e(6)) {
            z4 = ((c) bVar).f1037e.readInt() != 0;
        }
        remoteActionCompat.f4953f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4948a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4949b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f1037e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4950c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f4951d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f4952e;
        bVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f4953f;
        bVar.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
