package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2507b3 implements InterfaceC2968sk {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38706a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f38707b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f38708c;

    /* renamed from: d, reason: collision with root package name */
    public final C2537c6 f38709d;

    public C2507b3(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    public final synchronized Intent a(@NonNull Consumer<Intent> consumer) {
        this.f38706a.add(consumer);
        return this.f38707b;
    }

    public final void b() {
        this.f38707b = null;
        C2537c6 c2537c6 = this.f38709d;
        Context context = this.f38708c;
        synchronized (c2537c6) {
            if (c2537c6.f38768b) {
                try {
                    context.unregisterReceiver(c2537c6.f38767a);
                    c2537c6.f38768b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2968sk
    public final synchronized void onCreate() {
        Intent a4 = a();
        this.f38707b = a4;
        ArrayList arrayList = this.f38706a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Consumer) obj).consume(a4);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2968sk
    public final synchronized void onDestroy() {
        this.f38707b = null;
        b();
        ArrayList arrayList = this.f38706a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Consumer) obj).consume(null);
        }
    }

    public C2507b3(Context context, ICommonExecutor iCommonExecutor, int i4) {
        this.f38706a = new ArrayList();
        this.f38707b = null;
        this.f38708c = context;
        this.f38709d = AbstractC2510b6.a(new F2(new C2480a3(this), iCommonExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        C2537c6 c2537c6 = this.f38709d;
        Context context = this.f38708c;
        synchronized (c2537c6) {
            try {
                intent = context.registerReceiver(c2537c6.f38767a, intentFilter);
                try {
                    c2537c6.f38768b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intent = null;
            }
        }
        return intent;
    }
}
