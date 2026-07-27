package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import y1.AbstractC1320a;
import y1.b;
import y1.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1320a abstractC1320a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f5222a;
        if (abstractC1320a.e(1)) {
            cVar = abstractC1320a.g();
        }
        remoteActionCompat.f5222a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f5223b;
        if (abstractC1320a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC1320a).f11647e);
        }
        remoteActionCompat.f5223b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f5224c;
        if (abstractC1320a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC1320a).f11647e);
        }
        remoteActionCompat.f5224c = charSequence2;
        remoteActionCompat.f5225d = (PendingIntent) abstractC1320a.f(remoteActionCompat.f5225d, 4);
        boolean z4 = remoteActionCompat.f5226e;
        if (abstractC1320a.e(5)) {
            z4 = ((b) abstractC1320a).f11647e.readInt() != 0;
        }
        remoteActionCompat.f5226e = z4;
        boolean z5 = remoteActionCompat.f5227f;
        if (abstractC1320a.e(6)) {
            z5 = ((b) abstractC1320a).f11647e.readInt() != 0;
        }
        remoteActionCompat.f5227f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1320a abstractC1320a) {
        abstractC1320a.getClass();
        IconCompat iconCompat = remoteActionCompat.f5222a;
        abstractC1320a.h(1);
        abstractC1320a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f5223b;
        abstractC1320a.h(2);
        Parcel parcel = ((b) abstractC1320a).f11647e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f5224c;
        abstractC1320a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f5225d;
        abstractC1320a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z4 = remoteActionCompat.f5226e;
        abstractC1320a.h(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f5227f;
        abstractC1320a.h(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
