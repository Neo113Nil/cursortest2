package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p0.AbstractC0310a;
import p0.C0311b;
import p0.InterfaceC0312c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0310a abstractC0310a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0312c interfaceC0312c = remoteActionCompat.f1429a;
        if (abstractC0310a.e(1)) {
            interfaceC0312c = abstractC0310a.g();
        }
        remoteActionCompat.f1429a = (IconCompat) interfaceC0312c;
        CharSequence charSequence = remoteActionCompat.f1430b;
        if (abstractC0310a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0311b) abstractC0310a).f3391e);
        }
        remoteActionCompat.f1430b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1431c;
        if (abstractC0310a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0311b) abstractC0310a).f3391e);
        }
        remoteActionCompat.f1431c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0310a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1432e;
        if (abstractC0310a.e(5)) {
            z2 = ((C0311b) abstractC0310a).f3391e.readInt() != 0;
        }
        remoteActionCompat.f1432e = z2;
        boolean z3 = remoteActionCompat.f1433f;
        if (abstractC0310a.e(6)) {
            z3 = ((C0311b) abstractC0310a).f3391e.readInt() != 0;
        }
        remoteActionCompat.f1433f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0310a abstractC0310a) {
        abstractC0310a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1429a;
        abstractC0310a.h(1);
        abstractC0310a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1430b;
        abstractC0310a.h(2);
        Parcel parcel = ((C0311b) abstractC0310a).f3391e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1431c;
        abstractC0310a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0310a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1432e;
        abstractC0310a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1433f;
        abstractC0310a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
