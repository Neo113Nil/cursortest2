package com.iab.omid.library.startio.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f28a;
    private final Context b;
    private final AudioManager c;
    private final com.iab.omid.library.startio.devicevolume.a d;
    private final c e;
    private final AtomicReference f;
    private final AtomicBoolean g;
    private final ExecutorService h;

    class a implements Runnable {

        /* renamed from: com.iab.omid.library.startio.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC0013a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f30a;

            RunnableC0013a(float f) {
                this.f30a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.e.a(this.f30a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float a2 = d.this.a();
            d.this.g.set(false);
            if (((Float) d.this.f.getAndSet(Float.valueOf(a2))).floatValue() != a2) {
                d.this.f28a.post(new RunnableC0013a(a2));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.startio.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f = new AtomicReference(Float.valueOf(-1.0f));
        this.g = new AtomicBoolean(false);
        this.h = Executors.newSingleThreadExecutor();
        this.f28a = handler;
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.d = aVar;
        this.e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.d.a(this.c.getStreamVolume(3), this.c.getStreamMaxVolume(3));
    }

    private void d() {
        this.h.submit(new a());
    }

    public final void b() {
        d();
        this.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void c() {
        this.b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.g.getAndSet(true)) {
            return;
        }
        d();
    }
}
