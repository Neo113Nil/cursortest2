package d4;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m0 extends q0 {

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<Bundle> f15698f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f15699g;

    public static final <T> T B3(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e7) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e7);
            throw e7;
        }
    }

    public final Bundle O0(long j7) {
        Bundle bundle;
        synchronized (this.f15698f) {
            if (!this.f15699g) {
                try {
                    this.f15698f.wait(j7);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f15698f.get();
        }
        return bundle;
    }

    public final String q0(long j7) {
        return (String) B3(O0(j7), String.class);
    }

    @Override // d4.r0
    public final void x2(Bundle bundle) {
        synchronized (this.f15698f) {
            try {
                this.f15698f.set(bundle);
                this.f15699g = true;
            } finally {
                this.f15698f.notify();
            }
        }
    }
}
