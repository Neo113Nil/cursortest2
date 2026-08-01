package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import m0.AbstractC0276a;
import m0.b;
import m0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0276a abstractC0276a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1286a;
        if (abstractC0276a.e(1)) {
            cVar = abstractC0276a.g();
        }
        remoteActionCompat.f1286a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1287b;
        if (abstractC0276a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0276a).f3193e);
        }
        remoteActionCompat.f1287b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1288c;
        if (abstractC0276a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0276a).f3193e);
        }
        remoteActionCompat.f1288c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0276a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1289e;
        if (abstractC0276a.e(5)) {
            z2 = ((b) abstractC0276a).f3193e.readInt() != 0;
        }
        remoteActionCompat.f1289e = z2;
        boolean z3 = remoteActionCompat.f1290f;
        if (abstractC0276a.e(6)) {
            z3 = ((b) abstractC0276a).f3193e.readInt() != 0;
        }
        remoteActionCompat.f1290f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0276a abstractC0276a) {
        abstractC0276a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1286a;
        abstractC0276a.h(1);
        abstractC0276a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1287b;
        abstractC0276a.h(2);
        Parcel parcel = ((b) abstractC0276a).f3193e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1288c;
        abstractC0276a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0276a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1289e;
        abstractC0276a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1290f;
        abstractC0276a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
