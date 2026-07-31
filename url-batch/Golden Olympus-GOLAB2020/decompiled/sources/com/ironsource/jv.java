package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class jv implements hv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final jv f16879a = new jv();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final W1.h f16880b = W1.i.b(a.f16881a);

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16881a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                Object invoke = Class.forName(iv.f16772a).getMethod(iv.f16773b, null).invoke(null, null);
                if (invoke instanceof String) {
                    return (String) invoke;
                }
                return null;
            } catch (Throwable th) {
                o9.d().a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private jv() {
    }

    @Override // com.ironsource.hv
    @Nullable
    public String a() {
        return (String) f16880b.getValue();
    }
}
