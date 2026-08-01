package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import m0.AbstractC0275a;
import m0.b;
import m0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0275a abstractC0275a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1347a;
        if (abstractC0275a.e(1)) {
            cVar = abstractC0275a.g();
        }
        remoteActionCompat.f1347a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1348b;
        if (abstractC0275a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0275a).f3111e);
        }
        remoteActionCompat.f1348b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1349c;
        if (abstractC0275a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0275a).f3111e);
        }
        remoteActionCompat.f1349c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0275a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1350e;
        if (abstractC0275a.e(5)) {
            z2 = ((b) abstractC0275a).f3111e.readInt() != 0;
        }
        remoteActionCompat.f1350e = z2;
        boolean z3 = remoteActionCompat.f1351f;
        if (abstractC0275a.e(6)) {
            z3 = ((b) abstractC0275a).f3111e.readInt() != 0;
        }
        remoteActionCompat.f1351f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0275a abstractC0275a) {
        abstractC0275a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1347a;
        abstractC0275a.h(1);
        abstractC0275a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1348b;
        abstractC0275a.h(2);
        Parcel parcel = ((b) abstractC0275a).f3111e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1349c;
        abstractC0275a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0275a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1350e;
        abstractC0275a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1351f;
        abstractC0275a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
