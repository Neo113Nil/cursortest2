package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b1.d;
import g0.BinderC0134d;
import g0.RemoteCallbackListC0135e;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1571a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1572b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final RemoteCallbackListC0135e f1573c = new RemoteCallbackListC0135e(this);
    public final BinderC0134d d = new BinderC0134d(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        d.e(intent, "intent");
        return this.d;
    }
}
