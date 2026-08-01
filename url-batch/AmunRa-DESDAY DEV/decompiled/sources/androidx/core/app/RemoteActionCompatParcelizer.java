package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import m0.AbstractC0272a;
import m0.b;
import m0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0272a abstractC0272a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1322a;
        if (abstractC0272a.e(1)) {
            cVar = abstractC0272a.g();
        }
        remoteActionCompat.f1322a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1323b;
        if (abstractC0272a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0272a).f3263e);
        }
        remoteActionCompat.f1323b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1324c;
        if (abstractC0272a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0272a).f3263e);
        }
        remoteActionCompat.f1324c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0272a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1325e;
        if (abstractC0272a.e(5)) {
            z2 = ((b) abstractC0272a).f3263e.readInt() != 0;
        }
        remoteActionCompat.f1325e = z2;
        boolean z3 = remoteActionCompat.f1326f;
        if (abstractC0272a.e(6)) {
            z3 = ((b) abstractC0272a).f3263e.readInt() != 0;
        }
        remoteActionCompat.f1326f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0272a abstractC0272a) {
        abstractC0272a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1322a;
        abstractC0272a.h(1);
        abstractC0272a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1323b;
        abstractC0272a.h(2);
        Parcel parcel = ((b) abstractC0272a).f3263e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1324c;
        abstractC0272a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0272a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1325e;
        abstractC0272a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1326f;
        abstractC0272a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
