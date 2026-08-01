package y6;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f10653a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.g f10654b = new w7.g();

    /* renamed from: c, reason: collision with root package name */
    public final int f10655c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f10656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10657e;

    public k(int i3, int i10, Bundle bundle, int i11) {
        this.f10657e = i11;
        this.f10653a = i3;
        this.f10655c = i10;
        this.f10656d = bundle;
    }

    public final boolean a() {
        switch (this.f10657e) {
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
            StringBuilder sb2 = new StringBuilder(kVar.length() + 16 + valueOf.length());
            sb2.append("Finishing ");
            sb2.append(kVar);
            sb2.append(" with ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f10654b.a(bundle);
    }

    public final void c(b1.j jVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String obj = jVar.toString();
            StringBuilder sb2 = new StringBuilder(kVar.length() + 14 + obj.length());
            sb2.append("Failing ");
            sb2.append(kVar);
            sb2.append(" with ");
            sb2.append(obj);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f10654b.f10117a.m(jVar);
    }

    public final String toString() {
        int i3 = this.f10655c;
        int length = String.valueOf(i3).length();
        int i10 = this.f10653a;
        int length2 = String.valueOf(i10).length();
        boolean a9 = a();
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a9).length() + 1);
        sb2.append("Request { what=");
        sb2.append(i3);
        sb2.append(" id=");
        sb2.append(i10);
        sb2.append(" oneWay=");
        sb2.append(a9);
        sb2.append("}");
        return sb2.toString();
    }
}
