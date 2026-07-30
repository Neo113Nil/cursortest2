package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.n43;
import defpackage.o43;
import defpackage.p43;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(n43 n43Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        p43 p43Var = remoteActionCompat.a;
        boolean z = true;
        if (n43Var.e(1)) {
            p43Var = n43Var.h();
        }
        remoteActionCompat.a = (IconCompat) p43Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (n43Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((o43) n43Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (n43Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((o43) n43Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) n43Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (n43Var.e(5)) {
            z2 = ((o43) n43Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!n43Var.e(6)) {
            z = z3;
        } else if (((o43) n43Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, n43 n43Var) {
        n43Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        n43Var.i(1);
        n43Var.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        n43Var.i(2);
        Parcel parcel = ((o43) n43Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        n43Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        n43Var.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        n43Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        n43Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
