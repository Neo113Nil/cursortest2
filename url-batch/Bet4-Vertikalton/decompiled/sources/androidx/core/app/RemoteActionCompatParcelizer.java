package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import n0.AbstractC0278a;
import n0.b;
import n0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0278a abstractC0278a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1406a;
        if (abstractC0278a.e(1)) {
            cVar = abstractC0278a.g();
        }
        remoteActionCompat.f1406a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1407b;
        if (abstractC0278a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0278a).f3205e);
        }
        remoteActionCompat.f1407b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1408c;
        if (abstractC0278a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0278a).f3205e);
        }
        remoteActionCompat.f1408c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0278a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1409e;
        if (abstractC0278a.e(5)) {
            z2 = ((b) abstractC0278a).f3205e.readInt() != 0;
        }
        remoteActionCompat.f1409e = z2;
        boolean z3 = remoteActionCompat.f1410f;
        if (abstractC0278a.e(6)) {
            z3 = ((b) abstractC0278a).f3205e.readInt() != 0;
        }
        remoteActionCompat.f1410f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0278a abstractC0278a) {
        abstractC0278a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1406a;
        abstractC0278a.h(1);
        abstractC0278a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1407b;
        abstractC0278a.h(2);
        Parcel parcel = ((b) abstractC0278a).f3205e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1408c;
        abstractC0278a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0278a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1409e;
        abstractC0278a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1410f;
        abstractC0278a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
