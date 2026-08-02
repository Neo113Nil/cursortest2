package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class O2 implements InterfaceC0775lk {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10739a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f10740b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10741c;

    /* renamed from: d, reason: collision with root package name */
    public final G5 f10742d;

    /* renamed from: e, reason: collision with root package name */
    public final IHandlerExecutor f10743e;

    public O2(Context context, IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    public final synchronized Intent a(Consumer<Intent> consumer) {
        this.f10739a.add(consumer);
        return this.f10740b;
    }

    public final void b() {
        this.f10740b = null;
        G5 g5 = this.f10742d;
        Context context = this.f10741c;
        synchronized (g5) {
            if (g5.f10309b) {
                try {
                    context.unregisterReceiver(g5.f10308a);
                    g5.f10309b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0775lk
    public final synchronized void onCreate() {
        Intent a3 = a();
        this.f10740b = a3;
        ArrayList arrayList = this.f10739a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Consumer) obj).consume(a3);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0775lk
    public final synchronized void onDestroy() {
        this.f10740b = null;
        b();
        ArrayList arrayList = this.f10739a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Consumer) obj).consume(null);
        }
    }

    public O2(Context context, IHandlerExecutor iHandlerExecutor, int i4) {
        this.f10739a = new ArrayList();
        this.f10740b = null;
        this.f10741c = context;
        this.f10743e = iHandlerExecutor;
        this.f10742d = F5.a(new C0964t2(new N2(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        G5 g5 = this.f10742d;
        Context context = this.f10741c;
        IHandlerExecutor iHandlerExecutor = this.f10743e;
        synchronized (g5) {
            intent = null;
            try {
                intent = context.registerReceiver(g5.f10308a, intentFilter, null, iHandlerExecutor.getHandler());
                g5.f10309b = true;
            } catch (Throwable unused) {
            }
        }
        return intent;
    }
}
