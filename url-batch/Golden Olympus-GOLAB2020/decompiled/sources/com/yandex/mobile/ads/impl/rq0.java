package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<nq0<V>> f31329a;

    public rq0(@NotNull List<nq0<V>> layoutDesigns) {
        Intrinsics.checkNotNullParameter(layoutDesigns, "layoutDesigns");
        this.f31329a = layoutDesigns;
    }

    @Nullable
    public final nq0<V> a(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<T> it = this.f31329a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((nq0) obj).b().a(context)) {
                break;
            }
        }
        return (nq0) obj;
    }
}
