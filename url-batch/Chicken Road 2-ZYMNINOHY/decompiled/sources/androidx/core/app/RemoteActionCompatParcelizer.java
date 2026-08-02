package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import r1.AbstractC1400a;
import r1.C1401b;
import r1.InterfaceC1402c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1400a abstractC1400a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1402c interfaceC1402c = remoteActionCompat.f4501a;
        boolean z = true;
        if (abstractC1400a.e(1)) {
            interfaceC1402c = abstractC1400a.g();
        }
        remoteActionCompat.f4501a = (IconCompat) interfaceC1402c;
        CharSequence charSequence = remoteActionCompat.f4502b;
        if (abstractC1400a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1401b) abstractC1400a).f15192e);
        }
        remoteActionCompat.f4502b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4503c;
        if (abstractC1400a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1401b) abstractC1400a).f15192e);
        }
        remoteActionCompat.f4503c = charSequence2;
        remoteActionCompat.f4504d = (PendingIntent) abstractC1400a.f(remoteActionCompat.f4504d, 4);
        boolean z4 = remoteActionCompat.f4505e;
        if (abstractC1400a.e(5)) {
            z4 = ((C1401b) abstractC1400a).f15192e.readInt() != 0;
        }
        remoteActionCompat.f4505e = z4;
        boolean z5 = remoteActionCompat.f4506f;
        if (!abstractC1400a.e(6)) {
            z = z5;
        } else if (((C1401b) abstractC1400a).f15192e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f4506f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1400a abstractC1400a) {
        abstractC1400a.getClass();
        IconCompat iconCompat = remoteActionCompat.f4501a;
        abstractC1400a.h(1);
        abstractC1400a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4502b;
        abstractC1400a.h(2);
        Parcel parcel = ((C1401b) abstractC1400a).f15192e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4503c;
        abstractC1400a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f4504d;
        abstractC1400a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f4505e;
        abstractC1400a.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z4 = remoteActionCompat.f4506f;
        abstractC1400a.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
