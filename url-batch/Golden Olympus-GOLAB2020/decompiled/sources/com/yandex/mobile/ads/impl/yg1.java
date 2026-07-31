package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ur0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yg1 extends BroadcastReceiver {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f35123h = new a(0);

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private static volatile yg1 f35124i;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f35125a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ew1 f35126b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xg1 f35127c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final wg1 f35128d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<b, Object> f35129e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f35130f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private vg1 f35131g;

    public static final class a {
        private a() {
        }

        @NotNull
        public final yg1 a(@NotNull Context context) {
            yg1 yg1Var;
            Intrinsics.checkNotNullParameter(context, "context");
            yg1 yg1Var2 = yg1.f35124i;
            if (yg1Var2 != null) {
                return yg1Var2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                int i4 = ur0.f33232f;
                Executor c4 = ur0.a.a().c();
                yg1Var = yg1.f35124i;
                if (yg1Var == null) {
                    Intrinsics.checkNotNull(applicationContext);
                    yg1Var = new yg1(applicationContext, c4);
                    yg1.f35124i = yg1Var;
                }
            }
            return yg1Var;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    public interface b {
        void a(@NotNull vg1 vg1Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* synthetic */ yg1(Context context, Executor executor) {
        this(context, executor, ew1.a.a(), new xg1(context), new wg1());
        int i4 = ew1.f25476l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(yg1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vg1 a4 = this$0.f35127c.a();
        this$0.f35131g = a4;
        Objects.toString(a4);
        ap0.d(new Object[0]);
        try {
            this$0.f35128d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                this$0.f35125a.registerReceiver(this$0, intentFilter, 2);
            } else {
                this$0.f35125a.registerReceiver(this$0, intentFilter);
            }
        } catch (Exception unused) {
            Object[] args = new Object[0];
            int i4 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        vg1 vg1Var;
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        synchronized (this.f35130f) {
            try {
                vg1 vg1Var2 = this.f35131g;
                String action = intent.getAction();
                vg1 vg1Var3 = Intrinsics.areEqual(action, "android.intent.action.SCREEN_OFF") ? vg1.f33620c : Intrinsics.areEqual(action, "android.intent.action.USER_PRESENT") ? vg1.f33621d : (this.f35131g == vg1.f33621d || !Intrinsics.areEqual(action, "android.intent.action.SCREEN_ON")) ? this.f35131g : vg1.f33619b;
                this.f35131g = vg1Var3;
                if (vg1Var2 != vg1Var3) {
                    Objects.toString(vg1Var3);
                    ap0.d(new Object[0]);
                }
                vg1Var = this.f35131g;
                hashSet = new HashSet(this.f35129e.keySet());
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(vg1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r4.f35131g == com.yandex.mobile.ads.impl.vg1.f33621d) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        boolean z4;
        du1 a4 = this.f35126b.a(this.f35125a);
        synchronized (this.f35130f) {
            z4 = true;
            if (a4 != null) {
                try {
                    if (a4.p0()) {
                        vg1 vg1Var = this.f35131g;
                        if (vg1Var != vg1.f33619b) {
                            if (vg1Var == vg1.f33621d) {
                            }
                            z4 = false;
                        }
                    }
                } finally {
                }
            }
        }
        return z4;
    }

    private yg1(Context context, Executor executor, ew1 ew1Var, xg1 xg1Var, wg1 wg1Var) {
        this.f35125a = context;
        this.f35126b = ew1Var;
        this.f35127c = xg1Var;
        this.f35128d = wg1Var;
        this.f35129e = new WeakHashMap<>();
        this.f35130f = new Object();
        this.f35131g = vg1.f33621d;
        executor.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.Vl
            @Override // java.lang.Runnable
            public final void run() {
                yg1.a(yg1.this);
            }
        });
    }

    public final void b(@NotNull b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f35130f) {
            this.f35129e.remove(callback);
        }
    }

    public final void a(@NotNull b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f35130f) {
            this.f35129e.put(callback, null);
            Unit unit = Unit.f41027a;
        }
    }
}
