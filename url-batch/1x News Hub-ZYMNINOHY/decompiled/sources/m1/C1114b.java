package m1;

import U1.C0080a;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n1.j;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114b extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f9963a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9964b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f9965c;

    /* renamed from: d, reason: collision with root package name */
    public final C0080a f9966d;

    /* renamed from: e, reason: collision with root package name */
    public final j f9967e;
    public final AtomicReference f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f9968g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f9969h;

    public C1114b(Handler handler, Context context, C0080a c0080a, j jVar) {
        super(handler);
        this.f = new AtomicReference(Float.valueOf(-1.0f));
        this.f9968g = new AtomicBoolean(false);
        this.f9969h = Executors.newSingleThreadExecutor();
        this.f9963a = handler;
        this.f9964b = context;
        this.f9965c = (AudioManager) context.getSystemService("audio");
        this.f9966d = c0080a;
        this.f9967e = jVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.f9968g.getAndSet(true)) {
            return;
        }
        this.f9969h.submit(new B.b(15, this));
    }
}
