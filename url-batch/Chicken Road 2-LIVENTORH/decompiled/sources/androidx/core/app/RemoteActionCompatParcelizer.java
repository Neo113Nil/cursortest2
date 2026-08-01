package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import l1.a;
import l1.b;
import l1.c;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f277a;
        boolean z3 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f277a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f278b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2549e);
        }
        remoteActionCompat.f278b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f279c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2549e);
        }
        remoteActionCompat.f279c = charSequence2;
        remoteActionCompat.d = (PendingIntent) aVar.f(remoteActionCompat.d, 4);
        boolean z4 = remoteActionCompat.f280e;
        if (aVar.e(5)) {
            z4 = ((b) aVar).f2549e.readInt() != 0;
        }
        remoteActionCompat.f280e = z4;
        boolean z5 = remoteActionCompat.f281f;
        if (!aVar.e(6)) {
            z3 = z5;
        } else if (((b) aVar).f2549e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f281f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f277a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f278b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f2549e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f279c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f280e;
        aVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f281f;
        aVar.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
