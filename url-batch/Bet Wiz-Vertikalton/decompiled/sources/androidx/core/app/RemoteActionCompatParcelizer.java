package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import m0.AbstractC0274a;
import m0.b;
import m0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0274a abstractC0274a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1392a;
        if (abstractC0274a.e(1)) {
            cVar = abstractC0274a.g();
        }
        remoteActionCompat.f1392a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1393b;
        if (abstractC0274a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0274a).f3177e);
        }
        remoteActionCompat.f1393b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1394c;
        if (abstractC0274a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0274a).f3177e);
        }
        remoteActionCompat.f1394c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0274a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1395e;
        if (abstractC0274a.e(5)) {
            z2 = ((b) abstractC0274a).f3177e.readInt() != 0;
        }
        remoteActionCompat.f1395e = z2;
        boolean z3 = remoteActionCompat.f1396f;
        if (abstractC0274a.e(6)) {
            z3 = ((b) abstractC0274a).f3177e.readInt() != 0;
        }
        remoteActionCompat.f1396f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0274a abstractC0274a) {
        abstractC0274a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1392a;
        abstractC0274a.h(1);
        abstractC0274a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1393b;
        abstractC0274a.h(2);
        Parcel parcel = ((b) abstractC0274a).f3177e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1394c;
        abstractC0274a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0274a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1395e;
        abstractC0274a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1396f;
        abstractC0274a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
