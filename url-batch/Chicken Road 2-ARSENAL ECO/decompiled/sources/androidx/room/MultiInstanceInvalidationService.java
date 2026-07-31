package androidx.room;

import Q.g;
import Q.h;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: f, reason: collision with root package name */
    public int f3538f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f3539g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final h f3540h = new h(this);

    /* renamed from: i, reason: collision with root package name */
    public final g f3541i = new g(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.e(intent, "intent");
        return this.f3541i;
    }
}
