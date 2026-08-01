package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import h0.m;
import h0.n;
import java.util.LinkedHashMap;
import k1.e;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f2033a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2034b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final n f2035c = new n(this);
    public final m d = new m(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        e.e(intent, "intent");
        return this.d;
    }
}
