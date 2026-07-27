package o;

import B4.i;
import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import b.C0257b;
import b.InterfaceC0256a;
import b.InterfaceC0259d;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1347b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0259d f11474a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f11475b;

    public AbstractC1347b(InterfaceC0259d interfaceC0259d, ComponentName componentName) {
        this.f11474a = interfaceC0259d;
        this.f11475b = componentName;
    }

    public final i a() {
        BinderC1346a binderC1346a = new BinderC1346a();
        binderC1346a.attachInterface(binderC1346a, InterfaceC0256a.f4757b);
        new Handler(Looper.getMainLooper());
        InterfaceC0259d interfaceC0259d = this.f11474a;
        try {
            if (((C0257b) interfaceC0259d).c(binderC1346a)) {
                return new i(interfaceC0259d, binderC1346a, this.f11475b, 23);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
