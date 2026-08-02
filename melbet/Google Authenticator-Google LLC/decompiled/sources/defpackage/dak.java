package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dak extends dae {
    private final cnr a;

    public dak(cnr cnrVar) {
        this.a = cnrVar;
    }

    @Override // defpackage.dae
    public final void d(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status J = dan.J(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.i(new dam(J, parcelFileDescriptor));
    }
}
