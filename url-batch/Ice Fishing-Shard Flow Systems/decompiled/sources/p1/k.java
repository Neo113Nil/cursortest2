package p1;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.y;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f7185a;

    /* renamed from: b, reason: collision with root package name */
    public final K1.h f7186b = new K1.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f7187c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f7188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7189e;

    public k(int i2, int i5, Bundle bundle, int i7) {
        this.f7189e = i7;
        this.f7185a = i2;
        this.f7187c = i5;
        this.f7188d = bundle;
    }

    public final boolean a() {
        switch (this.f7189e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(kVar.length() + 16 + valueOf.length());
            sb.append("Finishing ");
            sb.append(kVar);
            sb.append(" with ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f7186b.b(bundle);
    }

    public final void c(y yVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String obj = yVar.toString();
            StringBuilder sb = new StringBuilder(kVar.length() + 14 + obj.length());
            sb.append("Failing ");
            sb.append(kVar);
            sb.append(" with ");
            sb.append(obj);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f7186b.a(yVar);
    }

    public final String toString() {
        int i2 = this.f7187c;
        int length = String.valueOf(i2).length();
        int i5 = this.f7185a;
        int length2 = String.valueOf(i5).length();
        boolean a7 = a();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a7).length() + 1);
        sb.append("Request { what=");
        sb.append(i2);
        sb.append(" id=");
        sb.append(i5);
        sb.append(" oneWay=");
        sb.append(a7);
        sb.append("}");
        return sb.toString();
    }
}
