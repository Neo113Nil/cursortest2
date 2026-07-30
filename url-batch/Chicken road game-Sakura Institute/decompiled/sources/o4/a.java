package o4;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements IInterface {

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f6830c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6831d;

    public a(IBinder iBinder, String str) {
        this.f6830c = iBinder;
        this.f6831d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6830c;
    }
}
