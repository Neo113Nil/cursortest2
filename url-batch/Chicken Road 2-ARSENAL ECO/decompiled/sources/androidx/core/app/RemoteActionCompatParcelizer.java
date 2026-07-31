package androidx.core.app;

import a0.AbstractC0220a;
import a0.C0221b;
import a0.InterfaceC0222c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0220a abstractC0220a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0222c interfaceC0222c = remoteActionCompat.f3400a;
        boolean z5 = true;
        if (abstractC0220a.e(1)) {
            interfaceC0222c = abstractC0220a.g();
        }
        remoteActionCompat.f3400a = (IconCompat) interfaceC0222c;
        CharSequence charSequence = remoteActionCompat.f3401b;
        if (abstractC0220a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0221b) abstractC0220a).f3117e);
        }
        remoteActionCompat.f3401b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f3402c;
        if (abstractC0220a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0221b) abstractC0220a).f3117e);
        }
        remoteActionCompat.f3402c = charSequence2;
        remoteActionCompat.f3403d = (PendingIntent) abstractC0220a.f(remoteActionCompat.f3403d, 4);
        boolean z6 = remoteActionCompat.f3404e;
        if (abstractC0220a.e(5)) {
            z6 = ((C0221b) abstractC0220a).f3117e.readInt() != 0;
        }
        remoteActionCompat.f3404e = z6;
        boolean z7 = remoteActionCompat.f3405f;
        if (!abstractC0220a.e(6)) {
            z5 = z7;
        } else if (((C0221b) abstractC0220a).f3117e.readInt() == 0) {
            z5 = false;
        }
        remoteActionCompat.f3405f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0220a abstractC0220a) {
        abstractC0220a.getClass();
        IconCompat iconCompat = remoteActionCompat.f3400a;
        abstractC0220a.h(1);
        abstractC0220a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3401b;
        abstractC0220a.h(2);
        Parcel parcel = ((C0221b) abstractC0220a).f3117e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f3402c;
        abstractC0220a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f3403d;
        abstractC0220a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z5 = remoteActionCompat.f3404e;
        abstractC0220a.h(5);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = remoteActionCompat.f3405f;
        abstractC0220a.h(6);
        parcel.writeInt(z6 ? 1 : 0);
    }
}
