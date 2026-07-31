package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class be1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f23724a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<ra2, Object> f23725b = new WeakHashMap<>();

    public final boolean a() {
        boolean z4;
        synchronized (this.f23724a) {
            z4 = !this.f23725b.isEmpty();
        }
        return z4;
    }

    public final void b() {
        ArrayList arrayList;
        synchronized (this.f23724a) {
            arrayList = new ArrayList(this.f23725b.keySet());
            this.f23725b.clear();
            Unit unit = Unit.f41027a;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ra2 ra2Var = (ra2) obj;
            if (ra2Var != null) {
                ra2Var.a();
            }
        }
    }

    public final void a(@NotNull ra2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f23724a) {
            this.f23725b.put(listener, null);
            Unit unit = Unit.f41027a;
        }
    }

    public final void b(@NotNull ra2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f23724a) {
            this.f23725b.remove(listener);
        }
    }
}
