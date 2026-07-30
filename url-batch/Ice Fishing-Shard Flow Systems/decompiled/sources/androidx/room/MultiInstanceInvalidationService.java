package androidx.room;

import D1.e;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import h0.RemoteCallbackListC0461g;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public int f4021d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f4022e = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final RemoteCallbackListC0461g f4023i = new RemoteCallbackListC0461g(this);

    /* renamed from: l, reason: collision with root package name */
    public final e f4024l = new e(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f4024l;
    }
}
