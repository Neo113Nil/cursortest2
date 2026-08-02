package androidx.core.app;

import T.a;
import T.b;
import T.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1551a;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f1551a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1552b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1079e);
        }
        remoteActionCompat.f1552b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1553c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1079e);
        }
        remoteActionCompat.f1553c = charSequence2;
        remoteActionCompat.f1554d = (PendingIntent) aVar.f(remoteActionCompat.f1554d, 4);
        boolean z2 = remoteActionCompat.f1555e;
        if (aVar.e(5)) {
            z2 = ((b) aVar).f1079e.readInt() != 0;
        }
        remoteActionCompat.f1555e = z2;
        boolean z3 = remoteActionCompat.f1556f;
        if (aVar.e(6)) {
            z3 = ((b) aVar).f1079e.readInt() != 0;
        }
        remoteActionCompat.f1556f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1551a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1552b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f1079e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1553c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1554d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1555e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1556f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
