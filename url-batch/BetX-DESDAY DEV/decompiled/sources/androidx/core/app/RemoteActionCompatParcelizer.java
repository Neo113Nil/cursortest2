package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import l0.AbstractC0302a;
import l0.b;
import l0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0302a abstractC0302a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1148a;
        if (abstractC0302a.e(1)) {
            cVar = abstractC0302a.g();
        }
        remoteActionCompat.f1148a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1149b;
        if (abstractC0302a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0302a).f3510e);
        }
        remoteActionCompat.f1149b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1150c;
        if (abstractC0302a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0302a).f3510e);
        }
        remoteActionCompat.f1150c = charSequence2;
        remoteActionCompat.f1151d = (PendingIntent) abstractC0302a.f(remoteActionCompat.f1151d, 4);
        boolean z2 = remoteActionCompat.f1152e;
        if (abstractC0302a.e(5)) {
            z2 = ((b) abstractC0302a).f3510e.readInt() != 0;
        }
        remoteActionCompat.f1152e = z2;
        boolean z3 = remoteActionCompat.f1153f;
        if (abstractC0302a.e(6)) {
            z3 = ((b) abstractC0302a).f3510e.readInt() != 0;
        }
        remoteActionCompat.f1153f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0302a abstractC0302a) {
        abstractC0302a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1148a;
        abstractC0302a.h(1);
        abstractC0302a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1149b;
        abstractC0302a.h(2);
        Parcel parcel = ((b) abstractC0302a).f3510e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1150c;
        abstractC0302a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1151d;
        abstractC0302a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1152e;
        abstractC0302a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1153f;
        abstractC0302a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
