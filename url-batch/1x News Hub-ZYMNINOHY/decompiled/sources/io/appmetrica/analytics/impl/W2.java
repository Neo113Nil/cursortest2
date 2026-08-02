package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W2 implements InterfaceC0757pk {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6811a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f6812b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6813c;

    /* renamed from: d, reason: collision with root package name */
    public final N5 f6814d;

    public W2(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    public final synchronized Intent a(Consumer<Intent> consumer) {
        this.f6811a.add(consumer);
        return this.f6812b;
    }

    public final void b() {
        this.f6812b = null;
        N5 n5 = this.f6814d;
        Context context = this.f6813c;
        synchronized (n5) {
            if (n5.f6360b) {
                try {
                    context.unregisterReceiver(n5.f6359a);
                    n5.f6360b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0757pk
    public final synchronized void onCreate() {
        Intent a3 = a();
        this.f6812b = a3;
        Iterator it = this.f6811a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(a3);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0757pk
    public final synchronized void onDestroy() {
        this.f6812b = null;
        b();
        Iterator it = this.f6811a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public W2(Context context, ICommonExecutor iCommonExecutor, int i3) {
        this.f6811a = new ArrayList();
        this.f6812b = null;
        this.f6813c = context;
        this.f6814d = M5.a(new B2(new V2(this), iCommonExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        N5 n5 = this.f6814d;
        Context context = this.f6813c;
        synchronized (n5) {
            try {
                intent = context.registerReceiver(n5.f6359a, intentFilter);
                try {
                    n5.f6360b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intent = null;
            }
        }
        return intent;
    }
}
