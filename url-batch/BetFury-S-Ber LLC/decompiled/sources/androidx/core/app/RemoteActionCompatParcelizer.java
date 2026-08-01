package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.nl0;
import defpackage.ol0;
import defpackage.pl0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(nl0 nl0Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        pl0 pl0Var = remoteActionCompat.a;
        boolean z = true;
        if (nl0Var.e(1)) {
            pl0Var = nl0Var.g();
        }
        remoteActionCompat.a = (IconCompat) pl0Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (nl0Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ol0) nl0Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (nl0Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ol0) nl0Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) nl0Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (nl0Var.e(5)) {
            z2 = ((ol0) nl0Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!nl0Var.e(6)) {
            z = z3;
        } else if (((ol0) nl0Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, nl0 nl0Var) {
        nl0Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        nl0Var.h(1);
        nl0Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        nl0Var.h(2);
        Parcel parcel = ((ol0) nl0Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        nl0Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        nl0Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        nl0Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        nl0Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
