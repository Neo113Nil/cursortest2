package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import r0.AbstractC0313a;
import r0.C0314b;
import r0.InterfaceC0315c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0313a abstractC0313a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0315c interfaceC0315c = remoteActionCompat.f1810a;
        if (abstractC0313a.e(1)) {
            interfaceC0315c = abstractC0313a.g();
        }
        remoteActionCompat.f1810a = (IconCompat) interfaceC0315c;
        CharSequence charSequence = remoteActionCompat.f1811b;
        if (abstractC0313a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0314b) abstractC0313a).f3828e);
        }
        remoteActionCompat.f1811b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1812c;
        if (abstractC0313a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0314b) abstractC0313a).f3828e);
        }
        remoteActionCompat.f1812c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0313a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1813e;
        if (abstractC0313a.e(5)) {
            z2 = ((C0314b) abstractC0313a).f3828e.readInt() != 0;
        }
        remoteActionCompat.f1813e = z2;
        boolean z3 = remoteActionCompat.f1814f;
        if (abstractC0313a.e(6)) {
            z3 = ((C0314b) abstractC0313a).f3828e.readInt() != 0;
        }
        remoteActionCompat.f1814f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0313a abstractC0313a) {
        abstractC0313a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1810a;
        abstractC0313a.h(1);
        abstractC0313a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1811b;
        abstractC0313a.h(2);
        Parcel parcel = ((C0314b) abstractC0313a).f3828e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1812c;
        abstractC0313a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0313a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1813e;
        abstractC0313a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1814f;
        abstractC0313a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
