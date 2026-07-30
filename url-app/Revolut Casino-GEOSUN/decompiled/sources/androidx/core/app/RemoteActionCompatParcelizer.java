package androidx.core.app;

import P.a;
import P.b;
import P.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1303a;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f1303a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1304b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f755e);
        }
        remoteActionCompat.f1304b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1305c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f755e);
        }
        remoteActionCompat.f1305c = charSequence2;
        remoteActionCompat.f1306d = (PendingIntent) aVar.f(remoteActionCompat.f1306d, 4);
        boolean z2 = remoteActionCompat.f1307e;
        if (aVar.e(5)) {
            z2 = ((b) aVar).f755e.readInt() != 0;
        }
        remoteActionCompat.f1307e = z2;
        boolean z3 = remoteActionCompat.f1308f;
        if (aVar.e(6)) {
            z3 = ((b) aVar).f755e.readInt() != 0;
        }
        remoteActionCompat.f1308f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1303a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1304b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f755e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1305c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1306d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1307e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1308f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
