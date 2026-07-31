package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class L7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Ae f37914a;

    /* JADX WARN: Multi-variable type inference failed */
    public L7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K7 fromModel(@NotNull N7 n7) {
        K7 k7 = new K7();
        Long l4 = n7.f37994a;
        if (l4 != null) {
            k7.f37869a = l4.longValue();
        }
        Long l5 = n7.f37995b;
        if (l5 != null) {
            k7.f37870b = l5.longValue();
        }
        Boolean bool = n7.f37996c;
        if (bool != null) {
            k7.f37871c = this.f37914a.fromModel(bool).intValue();
        }
        return k7;
    }

    public L7(@NotNull Ae ae) {
        this.f37914a = ae;
    }

    public /* synthetic */ L7(Ae ae, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new Ae() : ae);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N7 toModel(@NotNull K7 k7) {
        K7 k72 = new K7();
        long j4 = k7.f37869a;
        Long valueOf = Long.valueOf(j4);
        if (j4 == k72.f37869a) {
            valueOf = null;
        }
        long j5 = k7.f37870b;
        return new N7(valueOf, j5 != k72.f37870b ? Long.valueOf(j5) : null, this.f37914a.a(k7.f37871c));
    }
}
