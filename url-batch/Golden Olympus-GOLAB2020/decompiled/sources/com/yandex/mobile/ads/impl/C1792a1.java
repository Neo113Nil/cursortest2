package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1792a1 {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC1960h1> f23115a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<InterfaceC1816b1> f23116b;

    /* renamed from: c, reason: collision with root package name */
    private int f23117c;

    public C1792a1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23115a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f23116b = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f23117c = a(context);
    }

    public final void a(@NotNull InterfaceC1816b1 focusListener) {
        Intrinsics.checkNotNullParameter(focusListener, "focusListener");
        this.f23116b.add(focusListener);
    }

    public final void b() {
        Iterator<InterfaceC1816b1> it = this.f23116b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private static int a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public final void b(@NotNull InterfaceC1816b1 focusListener) {
        Intrinsics.checkNotNullParameter(focusListener, "focusListener");
        this.f23116b.remove(focusListener);
    }

    public final void a(@NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        int i4 = config.orientation;
        if (i4 != this.f23117c) {
            Iterator<InterfaceC1960h1> it = this.f23115a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f23117c = i4;
        }
    }

    public final void a() {
        Iterator<InterfaceC1816b1> it = this.f23116b.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }
}
