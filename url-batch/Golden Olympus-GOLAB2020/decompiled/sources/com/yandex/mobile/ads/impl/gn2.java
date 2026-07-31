package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAdExtensions;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gn2 implements VideoAdExtensions {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<k70> f26246a;

    public gn2(@NotNull List<k70> extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f26246a = extensions;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn2) && Intrinsics.areEqual(this.f26246a, ((gn2) obj).f26246a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAdExtensions
    @Nullable
    public final String get(@NotNull String type) {
        Object obj;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator<T> it = this.f26246a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((k70) obj).a(), type)) {
                break;
            }
        }
        k70 k70Var = (k70) obj;
        if (k70Var != null) {
            return k70Var.b();
        }
        return null;
    }

    public final int hashCode() {
        return this.f26246a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YandexVideoAdExtensions(extensions=" + this.f26246a + ")";
    }
}
