package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f2078a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2079b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final t f2080c = new t(this);

    /* renamed from: d, reason: collision with root package name */
    public final s f2081d = new s(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        j1.h.e(intent, "intent");
        return this.f2081d;
    }
}
