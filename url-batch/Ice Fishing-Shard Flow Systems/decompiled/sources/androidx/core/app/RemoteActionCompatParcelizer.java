package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import t0.AbstractC0902a;
import t0.C0903b;
import t0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0902a abstractC0902a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f3361a;
        boolean z7 = true;
        if (abstractC0902a.e(1)) {
            cVar = abstractC0902a.g();
        }
        remoteActionCompat.f3361a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f3362b;
        if (abstractC0902a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0903b) abstractC0902a).f7888e);
        }
        remoteActionCompat.f3362b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f3363c;
        if (abstractC0902a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0903b) abstractC0902a).f7888e);
        }
        remoteActionCompat.f3363c = charSequence2;
        remoteActionCompat.f3364d = (PendingIntent) abstractC0902a.f(remoteActionCompat.f3364d, 4);
        boolean z8 = remoteActionCompat.f3365e;
        if (abstractC0902a.e(5)) {
            z8 = ((C0903b) abstractC0902a).f7888e.readInt() != 0;
        }
        remoteActionCompat.f3365e = z8;
        boolean z9 = remoteActionCompat.f3366f;
        if (!abstractC0902a.e(6)) {
            z7 = z9;
        } else if (((C0903b) abstractC0902a).f7888e.readInt() == 0) {
            z7 = false;
        }
        remoteActionCompat.f3366f = z7;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0902a abstractC0902a) {
        abstractC0902a.getClass();
        IconCompat iconCompat = remoteActionCompat.f3361a;
        abstractC0902a.h(1);
        abstractC0902a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3362b;
        abstractC0902a.h(2);
        Parcel parcel = ((C0903b) abstractC0902a).f7888e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f3363c;
        abstractC0902a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f3364d;
        abstractC0902a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z7 = remoteActionCompat.f3365e;
        abstractC0902a.h(5);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = remoteActionCompat.f3366f;
        abstractC0902a.h(6);
        parcel.writeInt(z8 ? 1 : 0);
    }
}
