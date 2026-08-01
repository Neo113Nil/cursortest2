package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import h1.a;
import h1.b;
import h1.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f292a;
        boolean z3 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f292a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f293b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2004e);
        }
        remoteActionCompat.f293b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2004e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.f294d = (PendingIntent) aVar.f(remoteActionCompat.f294d, 4);
        boolean z4 = remoteActionCompat.f295e;
        if (aVar.e(5)) {
            z4 = ((b) aVar).f2004e.readInt() != 0;
        }
        remoteActionCompat.f295e = z4;
        boolean z5 = remoteActionCompat.f296f;
        if (!aVar.e(6)) {
            z3 = z5;
        } else if (((b) aVar).f2004e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f296f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f292a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f293b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f2004e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f294d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f295e;
        aVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f296f;
        aVar.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
