package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Td implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Sd f38304a = new Sd();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f38305b = MapsKt.mapOf(TuplesKt.to(NativeCrashSource.UNKNOWN, 0), TuplesKt.to(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2928r6 fromModel(@NotNull Zd zd) {
        C2928r6 c2928r6 = new C2928r6();
        c2928r6.f39711f = 1;
        C2903q6 c2903q6 = new C2903q6();
        c2903q6.f39649a = zd.f38616a;
        C3006u6 c3006u6 = new C3006u6();
        Integer num = (Integer) f38305b.get(zd.f38617b.f38470a);
        if (num != null) {
            c3006u6.f39896a = num.intValue();
        }
        String str = zd.f38617b.f38471b;
        if (str == null) {
            str = "";
        }
        c3006u6.f39897b = str;
        c2903q6.f39650b = c3006u6;
        c2928r6.f39712g = c2903q6;
        return c2928r6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Zd a(@NotNull C2928r6 c2928r6) {
        throw new UnsupportedOperationException();
    }
}
