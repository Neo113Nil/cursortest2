package I2;

import J2.j;
import a2.i;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1132a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1133b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f1134c;

    /* renamed from: d, reason: collision with root package name */
    public final i f1135d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1136e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f1137f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f1138g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f1139h;

    public b(Handler handler, Context context, i iVar, j jVar) {
        super(handler);
        this.f1137f = new AtomicReference(Float.valueOf(-1.0f));
        this.f1138g = new AtomicBoolean(false);
        this.f1139h = Executors.newSingleThreadExecutor();
        this.f1132a = handler;
        this.f1133b = context;
        this.f1134c = (AudioManager) context.getSystemService("audio");
        this.f1135d = iVar;
        this.f1136e = jVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.f1138g.getAndSet(true)) {
            return;
        }
        this.f1139h.submit(new B.b(4, this));
    }
}
