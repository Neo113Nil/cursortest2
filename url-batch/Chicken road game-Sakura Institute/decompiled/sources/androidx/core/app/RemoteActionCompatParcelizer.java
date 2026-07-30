package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import d4.b;
import d4.c;
import d4.d;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f749a;
        boolean z8 = true;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f749a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f750b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f2598e);
        }
        remoteActionCompat.f750b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f751c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f2598e);
        }
        remoteActionCompat.f751c = charSequence2;
        remoteActionCompat.f752d = (PendingIntent) bVar.f(remoteActionCompat.f752d, 4);
        boolean z9 = remoteActionCompat.f753e;
        if (bVar.e(5)) {
            z9 = ((c) bVar).f2598e.readInt() != 0;
        }
        remoteActionCompat.f753e = z9;
        boolean z10 = remoteActionCompat.f754f;
        if (!bVar.e(6)) {
            z8 = z10;
        } else if (((c) bVar).f2598e.readInt() == 0) {
            z8 = false;
        }
        remoteActionCompat.f754f = z8;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f749a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f750b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f2598e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f751c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f752d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z8 = remoteActionCompat.f753e;
        bVar.h(5);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = remoteActionCompat.f754f;
        bVar.h(6);
        parcel.writeInt(z9 ? 1 : 0);
    }
}
