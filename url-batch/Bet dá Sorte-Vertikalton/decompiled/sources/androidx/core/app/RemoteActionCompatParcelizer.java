package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import m0.AbstractC0253a;
import m0.C0254b;
import m0.InterfaceC0255c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0253a abstractC0253a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0255c interfaceC0255c = remoteActionCompat.f1364a;
        if (abstractC0253a.e(1)) {
            interfaceC0255c = abstractC0253a.g();
        }
        remoteActionCompat.f1364a = (IconCompat) interfaceC0255c;
        CharSequence charSequence = remoteActionCompat.f1365b;
        if (abstractC0253a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0254b) abstractC0253a).f3143e);
        }
        remoteActionCompat.f1365b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1366c;
        if (abstractC0253a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0254b) abstractC0253a).f3143e);
        }
        remoteActionCompat.f1366c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0253a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1367e;
        if (abstractC0253a.e(5)) {
            z2 = ((C0254b) abstractC0253a).f3143e.readInt() != 0;
        }
        remoteActionCompat.f1367e = z2;
        boolean z3 = remoteActionCompat.f1368f;
        if (abstractC0253a.e(6)) {
            z3 = ((C0254b) abstractC0253a).f3143e.readInt() != 0;
        }
        remoteActionCompat.f1368f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0253a abstractC0253a) {
        abstractC0253a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1364a;
        abstractC0253a.h(1);
        abstractC0253a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1365b;
        abstractC0253a.h(2);
        Parcel parcel = ((C0254b) abstractC0253a).f3143e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1366c;
        abstractC0253a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0253a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1367e;
        abstractC0253a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1368f;
        abstractC0253a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
