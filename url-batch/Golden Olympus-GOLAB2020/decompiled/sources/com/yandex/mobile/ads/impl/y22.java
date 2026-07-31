package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y22 {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile y22 f34780b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f34781c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34782d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f34783a;

    public static final class a {
        @NotNull
        public static y22 a() {
            if (y22.f34780b == null) {
                synchronized (y22.f34781c) {
                    try {
                        if (y22.f34780b == null) {
                            y22.f34780b = new y22(0);
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            y22 y22Var = y22.f34780b;
            if (y22Var != null) {
                return y22Var;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private y22() {
        this.f34783a = new LinkedHashMap();
    }

    public final void b(@NotNull fq0 referenceType, @NotNull Object keepingObject) {
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(keepingObject, "keepingObject");
        synchronized (f34781c) {
            try {
                Set set = (Set) this.f34783a.get(referenceType);
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f34783a.put(referenceType, set);
                }
                set.add(keepingObject);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(@NotNull fq0 referenceType, @NotNull Object keepingObject) {
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(keepingObject, "keepingObject");
        synchronized (f34781c) {
            Set set = (Set) this.f34783a.get(referenceType);
            if (set != null) {
                set.remove(keepingObject);
            }
        }
    }

    public /* synthetic */ y22(int i4) {
        this();
    }
}
