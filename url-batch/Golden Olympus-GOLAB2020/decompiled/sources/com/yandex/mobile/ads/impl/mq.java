package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mq<T extends View> implements InterfaceC2183qd<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC2183qd<T>> f29203a;

    /* JADX WARN: Multi-variable type inference failed */
    public mq(@NotNull List<? extends InterfaceC2183qd<T>> animators) {
        Intrinsics.checkNotNullParameter(animators, "animators");
        this.f29203a = animators;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2183qd
    public final void a(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<InterfaceC2183qd<T>> it = this.f29203a.iterator();
        while (it.hasNext()) {
            it.next().a(view);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2183qd
    public final void cancel() {
        Iterator<InterfaceC2183qd<T>> it = this.f29203a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
