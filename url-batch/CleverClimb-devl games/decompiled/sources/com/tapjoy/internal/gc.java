package com.tapjoy.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tapjoy.TJConnectListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public abstract class gc {

    /* renamed from: c, reason: collision with root package name */
    b f8158c;
    a e;
    private a h;

    /* renamed from: a, reason: collision with root package name */
    private final ReentrantLock f8156a = new ReentrantLock();
    private final Condition f = this.f8156a.newCondition();

    /* renamed from: b, reason: collision with root package name */
    volatile int f8157b = c.f8174a;
    private final LinkedList g = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    long f8159d = 1000;

    public abstract boolean a(Context context, String str, Hashtable hashtable, TJConnectListener tJConnectListener);

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8174a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8175b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8176c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f8177d = 4;
        public static final int e = 5;
        private static final /* synthetic */ int[] f = {f8174a, f8175b, f8176c, f8177d, e};

        public static int[] a() {
            return (int[]) f.clone();
        }
    }

    public final boolean b(Context context, String str, Hashtable hashtable, TJConnectListener tJConnectListener) {
        this.f8156a.lock();
        if (tJConnectListener != null) {
            try {
                this.g.addLast(fo.a(tJConnectListener, TJConnectListener.class));
            } catch (Throwable th) {
                this.f8156a.unlock();
                throw th;
            }
        }
        a aVar = new a(context, str, hashtable);
        switch (AnonymousClass3.f8162a[this.f8157b - 1]) {
            case 1:
                a(true);
                this.f8156a.unlock();
                return true;
            case 2:
                this.e = aVar;
                ft.f8129b.addObserver(new Observer() { // from class: com.tapjoy.internal.gc.1
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        ft.f8129b.deleteObserver(this);
                        if (Boolean.valueOf(Boolean.TRUE.equals(obj)).booleanValue() || gc.this.e == null || gc.this.e.f8163a == null) {
                            return;
                        }
                        gc.this.f8158c = new b(gc.this, (byte) 0);
                        gc.this.f8158c.e();
                    }
                });
                if (!a(aVar.f8163a, aVar.f8164b, aVar.f8165c, new TJConnectListener() { // from class: com.tapjoy.internal.gc.2
                    @Override // com.tapjoy.TJConnectListener
                    public final void onConnectSuccess() {
                        gc gcVar = gc.this;
                        int i = c.e;
                        int i2 = c.f8175b;
                        gcVar.a(i);
                        gc.this.a(true);
                    }

                    @Override // com.tapjoy.TJConnectListener
                    public final void onConnectFailure() {
                        gc.this.a(false);
                    }
                })) {
                    this.g.clear();
                    this.f8156a.unlock();
                    return false;
                }
                int i = c.f8175b;
                int i2 = c.f8174a;
                a(i);
                this.f8156a.unlock();
                return true;
            case 3:
            case 4:
                this.h = aVar;
                this.f8156a.unlock();
                return true;
            case 5:
                this.h = aVar;
                b();
                this.f8156a.unlock();
                return true;
            default:
                a(c.f8174a);
                this.f8156a.unlock();
                return false;
        }
    }

    /* renamed from: com.tapjoy.internal.gc$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8162a = new int[c.a().length];

        static {
            try {
                f8162a[c.e - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8162a[c.f8174a - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8162a[c.f8175b - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8162a[c.f8176c - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8162a[c.f8177d - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    final void a(int i) {
        this.f8156a.lock();
        try {
            int i2 = this.f8157b;
            this.f8157b = i;
        } finally {
            this.f8156a.unlock();
        }
    }

    final a a() {
        this.f8156a.lock();
        try {
            if (this.h != null) {
                this.e = this.h;
                this.h = null;
            }
            return this.e;
        } finally {
            this.f8156a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.f8156a.lock();
        try {
            if (this.g.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.g);
            this.g.clear();
            this.f8156a.unlock();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TJConnectListener tJConnectListener = (TJConnectListener) it.next();
                if (z) {
                    tJConnectListener.onConnectSuccess();
                } else {
                    tJConnectListener.onConnectFailure();
                }
            }
        } finally {
            this.f8156a.unlock();
        }
    }

    final void b() {
        this.f8156a.lock();
        try {
            this.f8159d = 1000L;
            this.f.signal();
        } finally {
            this.f8156a.unlock();
        }
    }

    final boolean a(long j) {
        this.f8156a.lock();
        try {
            int i = c.f8177d;
            int i2 = c.f8176c;
            a(i);
            if (this.f.await(j, TimeUnit.MILLISECONDS)) {
                this.f8159d = 1000L;
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        } finally {
            int i3 = c.f8176c;
            int i4 = c.f8177d;
            a(i3);
            this.f8156a.unlock();
        }
    }

    class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f8163a;

        /* renamed from: b, reason: collision with root package name */
        public final String f8164b;

        /* renamed from: c, reason: collision with root package name */
        public final Hashtable f8165c;

        public a(Context context, String str, Hashtable hashtable) {
            Context context2;
            if (context != null) {
                context2 = context instanceof Application ? context : context.getApplicationContext();
            } else {
                context2 = null;
            }
            this.f8163a = context2 == null ? context : context2;
            this.f8164b = str;
            this.f8165c = hashtable;
        }
    }

    class b extends kb {

        /* renamed from: b, reason: collision with root package name */
        private boolean f8168b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8169c;

        /* renamed from: d, reason: collision with root package name */
        private Context f8170d;
        private BroadcastReceiver e;

        private b() {
            this.e = new BroadcastReceiver() { // from class: com.tapjoy.internal.gc.b.2
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    gc.this.b();
                }
            };
        }

        /* synthetic */ b(gc gcVar, byte b2) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tapjoy.internal.kb
        public final void a() {
            this.f8168b = true;
            gc.this.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tapjoy.internal.kb
        public final void b() {
            gc gcVar = gc.this;
            int i = c.f8176c;
            int i2 = c.f8175b;
            gcVar.a(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tapjoy.internal.kb
        public final void c() {
            if (gc.this.f8158c == this) {
                gc.this.f8158c = null;
            }
            if (gc.this.f8157b == c.f8176c) {
                gc gcVar = gc.this;
                int i = c.f8174a;
                int i2 = c.f8176c;
                gcVar.a(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tapjoy.internal.kb
        public final void d() {
            this.f8170d = gc.this.a().f8163a;
            this.f8170d.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            while (!this.f8168b) {
                try {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    ft.f8129b.addObserver(new Observer() { // from class: com.tapjoy.internal.gc.b.1
                        @Override // java.util.Observer
                        public final void update(Observable observable, Object obj) {
                            ft.f8129b.deleteObserver(this);
                            b.this.f8169c = Boolean.TRUE.equals(obj);
                            countDownLatch.countDown();
                        }
                    });
                    a a2 = gc.this.a();
                    if (!gc.this.a(a2.f8163a, a2.f8164b, a2.f8165c, null)) {
                        gc.this.a(false);
                        return;
                    }
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException unused) {
                    }
                    if (!this.f8169c) {
                        gc.this.a(false);
                        long max = Math.max(gc.this.f8159d, 1000L);
                        gc.this.f8159d = Math.min(max << 2, 3600000L);
                        gc.this.a(max);
                    } else {
                        gc gcVar = gc.this;
                        int i = c.e;
                        int i2 = c.f8176c;
                        gcVar.a(i);
                        gc.this.a(true);
                        return;
                    }
                } finally {
                    h();
                }
            }
        }

        private void h() {
            this.f8170d.unregisterReceiver(this.e);
        }
    }
}
