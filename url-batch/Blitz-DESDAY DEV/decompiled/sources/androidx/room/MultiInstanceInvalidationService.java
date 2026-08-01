package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import g1.d;
import i0.BinderC0142d;
import i0.RemoteCallbackListC0143e;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1702a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1703b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final RemoteCallbackListC0143e f1704c = new RemoteCallbackListC0143e(this);
    public final BinderC0142d d = new BinderC0142d(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        d.e(intent, "intent");
        return this.d;
    }
}
