package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ju1 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f27823b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile ju1 f27824c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27825d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap f27826a;

    public static final class a {
        @NotNull
        public static ju1 a() {
            ju1 ju1Var;
            ju1 ju1Var2 = ju1.f27824c;
            if (ju1Var2 != null) {
                return ju1Var2;
            }
            synchronized (ju1.f27823b) {
                ju1Var = ju1.f27824c;
                if (ju1Var == null) {
                    ju1Var = new ju1(0);
                    ju1.f27824c = ju1Var;
                }
            }
            return ju1Var;
        }
    }

    private ju1() {
        this.f27826a = new HashMap();
    }

    public final void a(@NotNull Context context, @NotNull du1 sdkConfiguration) {
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        synchronized (f27823b) {
            hashSet = new HashSet(this.f27826a.keySet());
            int i4 = ew1.f25476l;
            ew1.a.a().a(context, sdkConfiguration);
            Unit unit = Unit.f41027a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tu1) it.next()).a(context, sdkConfiguration);
        }
    }

    public /* synthetic */ ju1(int i4) {
        this();
    }

    public final void a(@NotNull fu1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f27823b) {
            try {
                if (!this.f27826a.containsKey(listener)) {
                    this.f27826a.put(listener, null);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
