package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e5.b;
import e5.c;
import e5.d;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f607a;
        boolean z3 = true;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f607a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f608b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f2497e);
        }
        remoteActionCompat.f608b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f609c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f2497e);
        }
        remoteActionCompat.f609c = charSequence2;
        remoteActionCompat.f610d = (PendingIntent) bVar.f(remoteActionCompat.f610d, 4);
        boolean z7 = remoteActionCompat.f611e;
        if (bVar.e(5)) {
            z7 = ((c) bVar).f2497e.readInt() != 0;
        }
        remoteActionCompat.f611e = z7;
        boolean z8 = remoteActionCompat.f612f;
        if (!bVar.e(6)) {
            z3 = z8;
        } else if (((c) bVar).f2497e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f612f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f607a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f608b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f2497e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f609c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f610d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f611e;
        bVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z7 = remoteActionCompat.f612f;
        bVar.h(6);
        parcel.writeInt(z7 ? 1 : 0);
    }
}
