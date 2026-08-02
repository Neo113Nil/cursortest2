package androidx.core.app;

import Z.a;
import Z.b;
import Z.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f2168a;
        boolean z = true;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        remoteActionCompat.f2168a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f2169b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1909e);
        }
        remoteActionCompat.f2169b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2170c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1909e);
        }
        remoteActionCompat.f2170c = charSequence2;
        remoteActionCompat.f2171d = (PendingIntent) aVar.g(remoteActionCompat.f2171d, 4);
        boolean z2 = remoteActionCompat.f2172e;
        if (aVar.e(5)) {
            z2 = ((b) aVar).f1909e.readInt() != 0;
        }
        remoteActionCompat.f2172e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!aVar.e(6)) {
            z = z3;
        } else if (((b) aVar).f1909e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f2168a;
        aVar.i(1);
        aVar.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2169b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f1909e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2170c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f2171d;
        aVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f2172e;
        aVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        aVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
