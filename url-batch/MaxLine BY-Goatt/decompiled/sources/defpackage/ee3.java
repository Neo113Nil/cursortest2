package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ee3 extends md3 implements je3 {
    public final AtomicReference g;
    public boolean h;

    public ee3() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.g = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e);
            throw e;
        }
    }

    @Override // defpackage.md3
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) od3.a(parcel, Bundle.CREATOR);
        od3.d(parcel);
        m(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final String c(long j) {
        return (String) H(d(j), String.class);
    }

    public final Bundle d(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.g;
        synchronized (atomicReference) {
            if (!this.h) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.g.get();
        }
        return bundle;
    }

    @Override // defpackage.je3
    public final void m(Bundle bundle) {
        AtomicReference atomicReference = this.g;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.h = true;
                } finally {
                    this.g.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
