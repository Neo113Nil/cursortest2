package Q0;

import H1.z;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f1998a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.h f1999b = new k1.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f2000c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f2001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2002e;

    public n(int i7, int i8, Bundle bundle, int i9) {
        this.f2002e = i9;
        this.f1998a = i7;
        this.f2000c = i8;
        this.f2001d = bundle;
    }

    public final boolean a() {
        switch (this.f2002e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(z zVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zVar.toString());
        }
        this.f1999b.f5157a.j(zVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f1999b.a(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f2000c + " id=" + this.f1998a + " oneWay=" + a() + "}";
    }
}
