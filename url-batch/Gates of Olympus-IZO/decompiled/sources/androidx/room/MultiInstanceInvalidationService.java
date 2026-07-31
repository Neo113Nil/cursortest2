package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public int f4050d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f4051e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final q f4052f = new q(this);

    /* renamed from: g, reason: collision with root package name */
    public final p f4053g = new p(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Z1.i.f(intent, "intent");
        return this.f4053g;
    }
}
