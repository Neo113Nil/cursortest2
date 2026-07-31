package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class J implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final V f40702a;

    /* JADX WARN: Multi-variable type inference failed */
    public J() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(@NotNull G g4) {
        O o4 = new O();
        o4.f40717a = g4.f40697a;
        T t4 = g4.f40698b;
        o4.f40718b = t4 != null ? this.f40702a.fromModel(t4) : null;
        return o4;
    }

    public J(@NotNull V v4) {
        this.f40702a = v4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ J(V v4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(v4);
        if ((i4 & 1) != 0) {
            v4 = new V(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G toModel(@NotNull O o4) {
        return new G(o4.f40717a, this.f40702a.toModel(o4.f40718b));
    }
}
