package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import l0.AbstractC0300a;
import l0.b;
import l0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0300a abstractC0300a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1147a;
        if (abstractC0300a.e(1)) {
            cVar = abstractC0300a.g();
        }
        remoteActionCompat.f1147a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1148b;
        if (abstractC0300a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0300a).f3507e);
        }
        remoteActionCompat.f1148b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1149c;
        if (abstractC0300a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0300a).f3507e);
        }
        remoteActionCompat.f1149c = charSequence2;
        remoteActionCompat.f1150d = (PendingIntent) abstractC0300a.f(remoteActionCompat.f1150d, 4);
        boolean z2 = remoteActionCompat.f1151e;
        if (abstractC0300a.e(5)) {
            z2 = ((b) abstractC0300a).f3507e.readInt() != 0;
        }
        remoteActionCompat.f1151e = z2;
        boolean z3 = remoteActionCompat.f1152f;
        if (abstractC0300a.e(6)) {
            z3 = ((b) abstractC0300a).f3507e.readInt() != 0;
        }
        remoteActionCompat.f1152f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0300a abstractC0300a) {
        abstractC0300a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1147a;
        abstractC0300a.h(1);
        abstractC0300a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1148b;
        abstractC0300a.h(2);
        Parcel parcel = ((b) abstractC0300a).f3507e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1149c;
        abstractC0300a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1150d;
        abstractC0300a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1151e;
        abstractC0300a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1152f;
        abstractC0300a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
