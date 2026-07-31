package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h81 implements l51 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList f26666a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f26667b;

    public final void a(@NotNull g81 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f26666a.add(listener);
        if (this.f26667b) {
            listener.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.l51
    public final void b() {
        this.f26667b = true;
        Iterator it = this.f26666a.iterator();
        while (it.hasNext()) {
            ((l51) it.next()).b();
        }
    }

    public final void b(@NotNull g81 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f26666a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.l51
    public final void a() {
        this.f26667b = false;
        Iterator it = this.f26666a.iterator();
        while (it.hasNext()) {
            ((l51) it.next()).a();
        }
    }
}
