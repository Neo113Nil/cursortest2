package com.huawei.hms.ads.identifier;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f13876c = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(com.ironsource.mediationsdk.metadata.a.f17688n), new ThreadPoolExecutor.DiscardPolicy());

    /* renamed from: a, reason: collision with root package name */
    boolean f13877a = false;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedBlockingQueue f13878b = new LinkedBlockingQueue(1);

    /* renamed from: com.huawei.hms.ads.identifier.a$a, reason: collision with other inner class name */
    class RunnableC0134a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IBinder f13879b;

        RunnableC0134a(IBinder iBinder) {
            this.f13879b = iBinder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d("PPSSerivceConnection", "onServiceConnected " + System.currentTimeMillis());
                a.this.f13878b.offer(this.f13879b);
            } catch (Throwable th) {
                Log.w("PPSSerivceConnection", "onServiceConnected  " + th.getClass().getSimpleName());
            }
        }
    }

    public IBinder a() {
        if (this.f13877a) {
            throw new IllegalStateException();
        }
        this.f13877a = true;
        return (IBinder) this.f13878b.take();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.d("PPSSerivceConnection", "onServiceConnected");
        f13876c.execute(new RunnableC0134a(iBinder));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.d("PPSSerivceConnection", "onServiceDisconnected " + System.currentTimeMillis());
    }
}
