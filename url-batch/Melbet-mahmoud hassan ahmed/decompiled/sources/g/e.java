package g;

import android.content.ComponentName;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16214a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final a.b f16215b;

    /* renamed from: c, reason: collision with root package name */
    private final a.a f16216c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f16217d;

    e(a.b bVar, a.a aVar, ComponentName componentName) {
        this.f16215b = bVar;
        this.f16216c = aVar;
        this.f16217d = componentName;
    }

    IBinder a() {
        return this.f16216c.asBinder();
    }

    ComponentName b() {
        return this.f16217d;
    }
}
