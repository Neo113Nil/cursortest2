package com.facebook.ads.internal.d;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.p.b.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5075a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static d f5076b;

    /* renamed from: c, reason: collision with root package name */
    private final Future<f> f5077c;

    private d(final Context context) {
        this.f5077c = Executors.newSingleThreadExecutor().submit(new Callable<f>() { // from class: com.facebook.ads.internal.d.d.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f call() {
                return new f(context);
            }
        });
    }

    public static d a(Context context) {
        if (f5076b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (d.class) {
                if (f5076b == null) {
                    f5076b = new d(applicationContext);
                }
            }
        }
        return f5076b;
    }

    private f a() {
        try {
            return this.f5077c.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e(f5075a, "Timed out waiting for cache server.", e);
            return null;
        }
    }

    public void a(String str) {
        f a2 = a();
        if (a2 != null) {
            a2.a(str);
        }
    }

    public String b(String str) {
        f a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.b(str);
    }
}
