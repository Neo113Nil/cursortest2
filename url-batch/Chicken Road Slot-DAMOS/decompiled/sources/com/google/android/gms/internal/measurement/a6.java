package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a6 extends q5 implements f6 {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f2135d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2136e;

    public a6() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f2135d = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e2) {
            Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e2);
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.q5
    public final boolean C(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) r5.a(parcel, Bundle.CREATOR);
        r5.d(parcel);
        j(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle D(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f2135d;
        synchronized (atomicReference) {
            if (!this.f2136e) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f2135d.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.f6
    public final void j(Bundle bundle) {
        AtomicReference atomicReference = this.f2135d;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f2136e = true;
                } finally {
                    this.f2135d.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
