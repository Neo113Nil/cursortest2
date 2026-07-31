package androidx.core.app;

import A1.b;
import A1.c;
import A1.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f3748a;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f3748a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f3749b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f16e);
        }
        remoteActionCompat.f3749b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f3750c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f16e);
        }
        remoteActionCompat.f3750c = charSequence2;
        remoteActionCompat.f3751d = (PendingIntent) bVar.f(remoteActionCompat.f3751d, 4);
        boolean z3 = remoteActionCompat.f3752e;
        if (bVar.e(5)) {
            z3 = ((c) bVar).f16e.readInt() != 0;
        }
        remoteActionCompat.f3752e = z3;
        boolean z4 = remoteActionCompat.f3753f;
        if (bVar.e(6)) {
            z4 = ((c) bVar).f16e.readInt() != 0;
        }
        remoteActionCompat.f3753f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f3748a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3749b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f16e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f3750c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f3751d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f3752e;
        bVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f3753f;
        bVar.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
