package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.qb0;
import defpackage.rb0;
import defpackage.sb0;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(qb0 qb0Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        sb0 sb0Var = remoteActionCompat.a;
        boolean z = true;
        if (qb0Var.e(1)) {
            sb0Var = qb0Var.g();
        }
        remoteActionCompat.a = (IconCompat) sb0Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (qb0Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((rb0) qb0Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (qb0Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((rb0) qb0Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) qb0Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (qb0Var.e(5)) {
            z2 = ((rb0) qb0Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!qb0Var.e(6)) {
            z = z3;
        } else if (((rb0) qb0Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, qb0 qb0Var) {
        qb0Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        qb0Var.h(1);
        qb0Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        qb0Var.h(2);
        Parcel parcel = ((rb0) qb0Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        qb0Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        qb0Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        qb0Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        qb0Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
