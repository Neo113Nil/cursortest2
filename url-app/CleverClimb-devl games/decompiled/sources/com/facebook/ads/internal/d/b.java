package com.facebook.ads.internal.d;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5057a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f5058b = Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    private static final ExecutorService f5059c = Executors.newFixedThreadPool(5);
    private final c e;
    private final d f;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f5060d = new Handler();
    private final List<Callable<Boolean>> g = new ArrayList();

    private class a implements Callable<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        private final String f5067b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5068c;

        /* renamed from: d, reason: collision with root package name */
        private final int f5069d;

        public a(String str, int i, int i2) {
            this.f5067b = str;
            this.f5068c = i;
            this.f5069d = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            b.this.e.a(this.f5067b, this.f5068c, this.f5069d);
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.d.b$b, reason: collision with other inner class name */
    private class CallableC0344b implements Callable<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        private final String f5071b;

        public CallableC0344b(String str) {
            this.f5071b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            b.this.f.a(this.f5071b);
            return true;
        }
    }

    public b(Context context) {
        this.e = c.a(context);
        this.f = d.a(context);
    }

    public void a(final com.facebook.ads.internal.d.a aVar) {
        final ArrayList arrayList = new ArrayList(this.g);
        f5058b.execute(new Runnable() { // from class: com.facebook.ads.internal.d.b.1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler;
                Runnable runnable;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(b.f5059c.submit((Callable) it.next()));
                }
                try {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((Future) it2.next()).get();
                    }
                    handler = b.this.f5060d;
                    runnable = new Runnable() { // from class: com.facebook.ads.internal.d.b.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    };
                } catch (InterruptedException | ExecutionException e) {
                    Log.e(b.f5057a, "Exception while executing cache downloads.", e);
                    handler = b.this.f5060d;
                    runnable = new Runnable() { // from class: com.facebook.ads.internal.d.b.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (aVar != null) {
                                aVar.b();
                            }
                        }
                    };
                }
                handler.post(runnable);
            }
        });
        this.g.clear();
    }

    public void a(String str) {
        this.g.add(new CallableC0344b(str));
    }

    public void a(String str, int i, int i2) {
        this.g.add(new a(str, i, i2));
    }

    public String b(String str) {
        return this.f.b(str);
    }
}
