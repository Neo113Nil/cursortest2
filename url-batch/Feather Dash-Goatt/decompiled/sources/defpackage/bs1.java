package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class bs1 implements IInterface {
    public final IBinder b;
    public final String c;

    public bs1(IBinder iBinder, String str) {
        this.b = iBinder;
        this.c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }
}
