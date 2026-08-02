package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aeu extends Service implements aer {
    private final gwh a = new gwh((aer) this);

    @Override // defpackage.aer
    public final ael L() {
        return (ael) this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.b(aej.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.b(aej.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        gwh gwhVar = this.a;
        gwhVar.b(aej.ON_STOP);
        gwhVar.b(aej.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.b(aej.ON_START);
        super.onStart(intent, i);
    }
}
