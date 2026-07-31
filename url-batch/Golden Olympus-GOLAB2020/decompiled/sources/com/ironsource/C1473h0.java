package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1473h0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f16547a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final NetworkSettings f16548b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final W1.h f16549c;

    @Metadata
    /* renamed from: com.ironsource.h0$a */
    static final class a extends kotlin.jvm.internal.s implements Function0<BaseAdAdapter<?, ?>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1585w2 f16550a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1473h0 f16551b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1585w2 c1585w2, C1473h0 c1473h0) {
            super(0);
            this.f16550a = c1585w2;
            this.f16551b = c1473h0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f16550a.a(this.f16551b.e(), this.f16551b.a(), this.f16551b.d());
        }
    }

    public C1473h0(@NotNull C1585w2 adTools, @NotNull AbstractC1584w1 adUnitData, @NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.f16547a = adUnitData;
        this.f16548b = providerSettings;
        this.f16549c = W1.i.b(new a(adTools, this));
    }

    @NotNull
    public final IronSource.AD_UNIT a() {
        return this.f16547a.b().a();
    }

    @Nullable
    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.f16549c.getValue();
    }

    @NotNull
    public final String c() {
        String providerName = this.f16548b.getProviderName();
        Intrinsics.checkNotNullExpressionValue(providerName, "providerSettings.providerName");
        return providerName;
    }

    @NotNull
    public final UUID d() {
        return this.f16547a.b().b();
    }

    @NotNull
    public final NetworkSettings e() {
        return this.f16548b;
    }
}
