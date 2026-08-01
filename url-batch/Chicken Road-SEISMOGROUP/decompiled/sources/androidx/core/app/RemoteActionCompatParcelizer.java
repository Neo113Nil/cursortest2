package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p.b;
import p.c;
import p.d;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f466a;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f466a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f467b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1125e);
        }
        remoteActionCompat.f467b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f468c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1125e);
        }
        remoteActionCompat.f468c = charSequence2;
        remoteActionCompat.f469d = (PendingIntent) bVar.f(remoteActionCompat.f469d, 4);
        boolean z = remoteActionCompat.f470e;
        if (bVar.e(5)) {
            z = ((c) bVar).f1125e.readInt() != 0;
        }
        remoteActionCompat.f470e = z;
        boolean z2 = remoteActionCompat.f471f;
        if (bVar.e(6)) {
            z2 = ((c) bVar).f1125e.readInt() != 0;
        }
        remoteActionCompat.f471f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f466a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f467b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f1125e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f468c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f469d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f470e;
        bVar.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f471f;
        bVar.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
