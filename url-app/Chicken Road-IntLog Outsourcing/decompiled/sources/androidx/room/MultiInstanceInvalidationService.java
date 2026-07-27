package androidx.room;

import X.g;
import X.h;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f4696a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4697b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final h f4698c = new h(this);

    /* renamed from: d, reason: collision with root package name */
    public final g f4699d = new g(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.e(intent, "intent");
        return this.f4699d;
    }
}
