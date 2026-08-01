package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import o0.AbstractC0281a;
import o0.b;
import o0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0281a abstractC0281a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1495a;
        if (abstractC0281a.e(1)) {
            cVar = abstractC0281a.g();
        }
        remoteActionCompat.f1495a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1496b;
        if (abstractC0281a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0281a).f3410e);
        }
        remoteActionCompat.f1496b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1497c;
        if (abstractC0281a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0281a).f3410e);
        }
        remoteActionCompat.f1497c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0281a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1498e;
        if (abstractC0281a.e(5)) {
            z2 = ((b) abstractC0281a).f3410e.readInt() != 0;
        }
        remoteActionCompat.f1498e = z2;
        boolean z3 = remoteActionCompat.f1499f;
        if (abstractC0281a.e(6)) {
            z3 = ((b) abstractC0281a).f3410e.readInt() != 0;
        }
        remoteActionCompat.f1499f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0281a abstractC0281a) {
        abstractC0281a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1495a;
        abstractC0281a.h(1);
        abstractC0281a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1496b;
        abstractC0281a.h(2);
        Parcel parcel = ((b) abstractC0281a).f3410e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1497c;
        abstractC0281a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0281a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1498e;
        abstractC0281a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1499f;
        abstractC0281a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
