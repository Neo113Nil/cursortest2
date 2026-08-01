package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import r0.AbstractC0350a;
import r0.b;
import r0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0350a abstractC0350a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1856a;
        if (abstractC0350a.e(1)) {
            cVar = abstractC0350a.g();
        }
        remoteActionCompat.f1856a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1857b;
        if (abstractC0350a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0350a).e);
        }
        remoteActionCompat.f1857b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1858c;
        if (abstractC0350a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0350a).e);
        }
        remoteActionCompat.f1858c = charSequence2;
        remoteActionCompat.f1859d = (PendingIntent) abstractC0350a.f(remoteActionCompat.f1859d, 4);
        boolean z2 = remoteActionCompat.e;
        if (abstractC0350a.e(5)) {
            z2 = ((b) abstractC0350a).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f1860f;
        if (abstractC0350a.e(6)) {
            z3 = ((b) abstractC0350a).e.readInt() != 0;
        }
        remoteActionCompat.f1860f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0350a abstractC0350a) {
        abstractC0350a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1856a;
        abstractC0350a.h(1);
        abstractC0350a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1857b;
        abstractC0350a.h(2);
        Parcel parcel = ((b) abstractC0350a).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1858c;
        abstractC0350a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1859d;
        abstractC0350a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.e;
        abstractC0350a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1860f;
        abstractC0350a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
