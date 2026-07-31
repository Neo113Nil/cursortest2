package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r01 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f30978a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f30979b = new ArrayList();

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f30978a) {
            arrayList = new ArrayList(this.f30979b);
            this.f30979b.clear();
            Unit unit = Unit.f41027a;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            pk0 pk0Var = (pk0) obj;
            if (pk0Var != null) {
                pk0Var.a();
            }
        }
    }

    public final void a(@NotNull pk0 initializationObserver) {
        Intrinsics.checkNotNullParameter(initializationObserver, "initializationObserver");
        synchronized (this.f30978a) {
            this.f30979b.add(initializationObserver);
        }
    }
}
