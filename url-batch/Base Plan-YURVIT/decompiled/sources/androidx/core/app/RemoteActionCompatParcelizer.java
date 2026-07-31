package androidx.core.app;

import R.a;
import R.b;
import R.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1390a;
        boolean z2 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f1390a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1391b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f815e);
        }
        remoteActionCompat.f1391b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1392c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f815e);
        }
        remoteActionCompat.f1392c = charSequence2;
        remoteActionCompat.f1393d = (PendingIntent) aVar.f(remoteActionCompat.f1393d, 4);
        boolean z3 = remoteActionCompat.f1394e;
        if (aVar.e(5)) {
            z3 = ((b) aVar).f815e.readInt() != 0;
        }
        remoteActionCompat.f1394e = z3;
        boolean z4 = remoteActionCompat.f1395f;
        if (!aVar.e(6)) {
            z2 = z4;
        } else if (((b) aVar).f815e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f1395f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1390a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1391b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f815e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1392c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1393d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1394e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1395f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
