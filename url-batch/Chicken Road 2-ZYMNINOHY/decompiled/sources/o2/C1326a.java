package o2;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1326a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f14624a;

    public C1326a(IBinder iBinder, String str) {
        this.f14624a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14624a;
    }
}
