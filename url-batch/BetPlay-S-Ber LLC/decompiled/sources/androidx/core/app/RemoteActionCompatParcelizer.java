package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.m80;
import defpackage.n80;
import defpackage.o80;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(m80 m80Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        o80 o80Var = remoteActionCompat.a;
        boolean z = true;
        if (m80Var.e(1)) {
            o80Var = m80Var.g();
        }
        remoteActionCompat.a = (IconCompat) o80Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (m80Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((n80) m80Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (m80Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((n80) m80Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) m80Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (m80Var.e(5)) {
            z2 = ((n80) m80Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!m80Var.e(6)) {
            z = z3;
        } else if (((n80) m80Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, m80 m80Var) {
        m80Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        m80Var.h(1);
        m80Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        m80Var.h(2);
        Parcel parcel = ((n80) m80Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        m80Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        m80Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        m80Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        m80Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
