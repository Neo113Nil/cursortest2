package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import o0.AbstractC0252a;
import o0.C0253b;
import o0.InterfaceC0254c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0252a abstractC0252a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0254c interfaceC0254c = remoteActionCompat.f1494a;
        if (abstractC0252a.e(1)) {
            interfaceC0254c = abstractC0252a.g();
        }
        remoteActionCompat.f1494a = (IconCompat) interfaceC0254c;
        CharSequence charSequence = remoteActionCompat.f1495b;
        if (abstractC0252a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0253b) abstractC0252a).f3307e);
        }
        remoteActionCompat.f1495b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1496c;
        if (abstractC0252a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0253b) abstractC0252a).f3307e);
        }
        remoteActionCompat.f1496c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0252a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1497e;
        if (abstractC0252a.e(5)) {
            z2 = ((C0253b) abstractC0252a).f3307e.readInt() != 0;
        }
        remoteActionCompat.f1497e = z2;
        boolean z3 = remoteActionCompat.f1498f;
        if (abstractC0252a.e(6)) {
            z3 = ((C0253b) abstractC0252a).f3307e.readInt() != 0;
        }
        remoteActionCompat.f1498f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0252a abstractC0252a) {
        abstractC0252a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1494a;
        abstractC0252a.h(1);
        abstractC0252a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1495b;
        abstractC0252a.h(2);
        Parcel parcel = ((C0253b) abstractC0252a).f3307e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1496c;
        abstractC0252a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0252a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1497e;
        abstractC0252a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1498f;
        abstractC0252a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
