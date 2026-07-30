package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.bn1;
import defpackage.cn1;
import defpackage.dn1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(bn1 bn1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        dn1 dn1Var = remoteActionCompat.a;
        boolean z = true;
        if (bn1Var.e(1)) {
            dn1Var = bn1Var.g();
        }
        remoteActionCompat.a = (IconCompat) dn1Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (bn1Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((cn1) bn1Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (bn1Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((cn1) bn1Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) bn1Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (bn1Var.e(5)) {
            z2 = ((cn1) bn1Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!bn1Var.e(6)) {
            z = z3;
        } else if (((cn1) bn1Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, bn1 bn1Var) {
        bn1Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        bn1Var.h(1);
        bn1Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        bn1Var.h(2);
        Parcel parcel = ((cn1) bn1Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        bn1Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        bn1Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        bn1Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        bn1Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
