package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fs0 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Object f25908f = new Object();

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private static volatile fs0 f25909g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f25910h = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final is0 f25911a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hs0 f25912b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ew1 f25913c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zw1 f25914d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f25915e;

    public static final class a {
        @NotNull
        public static fs0 a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (fs0.f25909g == null) {
                synchronized (fs0.f25908f) {
                    try {
                        if (fs0.f25909g == null) {
                            fs0.f25909g = new fs0(context);
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            fs0 fs0Var = fs0.f25909g;
            if (fs0Var != null) {
                return fs0Var;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ fs0(Context context) {
        this(context, r2, r3, ew1.a.a(), new zw1());
        is0 is0Var = new is0();
        hs0 hs0Var = new hs0();
        int i4 = ew1.f25476l;
    }

    @Nullable
    public final Location c() {
        Location location;
        synchronized (f25908f) {
            try {
                if (this.f25913c.c()) {
                    zw1 zw1Var = this.f25914d;
                    Context context = this.f25915e;
                    zw1Var.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (!zw1.a(context)) {
                        hs0 hs0Var = this.f25912b;
                        Context context2 = this.f25915e;
                        hs0Var.getClass();
                        ArrayList a4 = hs0.a(context2);
                        List createListBuilder = CollectionsKt.createListBuilder();
                        int size = a4.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = a4.get(i4);
                            i4++;
                            Location a5 = ((gs0) obj).a();
                            if (a5 != null) {
                                createListBuilder.add(a5);
                            }
                        }
                        location = this.f25911a.a(CollectionsKt.build(createListBuilder));
                    }
                }
                location = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return location;
    }

    private fs0(Context context, is0 is0Var, hs0 hs0Var, ew1 ew1Var, zw1 zw1Var) {
        this.f25911a = is0Var;
        this.f25912b = hs0Var;
        this.f25913c = ew1Var;
        this.f25914d = zw1Var;
        this.f25915e = xr.a(context);
    }
}
