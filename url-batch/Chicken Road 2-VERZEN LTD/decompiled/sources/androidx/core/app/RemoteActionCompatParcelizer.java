package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import q.b;
import q.c;
import q.d;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f410a;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f410a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f411b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1183e);
        }
        remoteActionCompat.f411b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f412c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1183e);
        }
        remoteActionCompat.f412c = charSequence2;
        remoteActionCompat.f413d = (PendingIntent) bVar.f(remoteActionCompat.f413d, 4);
        boolean z2 = remoteActionCompat.f414e;
        if (bVar.e(5)) {
            z2 = ((c) bVar).f1183e.readInt() != 0;
        }
        remoteActionCompat.f414e = z2;
        boolean z3 = remoteActionCompat.f415f;
        if (bVar.e(6)) {
            z3 = ((c) bVar).f1183e.readInt() != 0;
        }
        remoteActionCompat.f415f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f410a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f411b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f1183e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f412c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f413d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f414e;
        bVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f415f;
        bVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
