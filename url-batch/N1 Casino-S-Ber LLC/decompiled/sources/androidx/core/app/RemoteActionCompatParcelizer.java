package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.f80;
import defpackage.g80;
import defpackage.h80;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(f80 f80Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        h80 h80Var = remoteActionCompat.a;
        boolean z = true;
        if (f80Var.e(1)) {
            h80Var = f80Var.g();
        }
        remoteActionCompat.a = (IconCompat) h80Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (f80Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((g80) f80Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (f80Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((g80) f80Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) f80Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (f80Var.e(5)) {
            z2 = ((g80) f80Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!f80Var.e(6)) {
            z = z3;
        } else if (((g80) f80Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, f80 f80Var) {
        f80Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        f80Var.h(1);
        f80Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        f80Var.h(2);
        Parcel parcel = ((g80) f80Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        f80Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        f80Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        f80Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        f80Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
