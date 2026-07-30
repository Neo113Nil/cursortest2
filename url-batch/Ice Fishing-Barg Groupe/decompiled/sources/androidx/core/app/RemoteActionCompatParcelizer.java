package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.cq2;
import defpackage.dq2;
import defpackage.eq2;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(cq2 cq2Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        eq2 eq2Var = remoteActionCompat.PxuCJdSBwIXG;
        boolean z = true;
        if (cq2Var.e9gEMXR7LXtO(1)) {
            eq2Var = cq2Var.RAsUl2FVSrh6();
        }
        remoteActionCompat.PxuCJdSBwIXG = (IconCompat) eq2Var;
        CharSequence charSequence = remoteActionCompat.lS5Rgt96tfkO;
        if (cq2Var.e9gEMXR7LXtO(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((dq2) cq2Var).e9gEMXR7LXtO);
        }
        remoteActionCompat.lS5Rgt96tfkO = charSequence;
        CharSequence charSequence2 = remoteActionCompat.TSizfFm2Yiuu;
        if (cq2Var.e9gEMXR7LXtO(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((dq2) cq2Var).e9gEMXR7LXtO);
        }
        remoteActionCompat.TSizfFm2Yiuu = charSequence2;
        remoteActionCompat.Y1f8riQaR6yg = (PendingIntent) cq2Var.a92UlCVFR9N8(remoteActionCompat.Y1f8riQaR6yg, 4);
        boolean z2 = remoteActionCompat.e9gEMXR7LXtO;
        if (cq2Var.e9gEMXR7LXtO(5)) {
            z2 = ((dq2) cq2Var).e9gEMXR7LXtO.readInt() != 0;
        }
        remoteActionCompat.e9gEMXR7LXtO = z2;
        boolean z3 = remoteActionCompat.a92UlCVFR9N8;
        if (!cq2Var.e9gEMXR7LXtO(6)) {
            z = z3;
        } else if (((dq2) cq2Var).e9gEMXR7LXtO.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.a92UlCVFR9N8 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, cq2 cq2Var) {
        cq2Var.getClass();
        IconCompat iconCompat = remoteActionCompat.PxuCJdSBwIXG;
        cq2Var.rtx2ld2ELZv4(1);
        cq2Var.OPXfSBeufaJ8(iconCompat);
        CharSequence charSequence = remoteActionCompat.lS5Rgt96tfkO;
        cq2Var.rtx2ld2ELZv4(2);
        Parcel parcel = ((dq2) cq2Var).e9gEMXR7LXtO;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.TSizfFm2Yiuu;
        cq2Var.rtx2ld2ELZv4(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.Y1f8riQaR6yg;
        cq2Var.rtx2ld2ELZv4(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e9gEMXR7LXtO;
        cq2Var.rtx2ld2ELZv4(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.a92UlCVFR9N8;
        cq2Var.rtx2ld2ELZv4(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
