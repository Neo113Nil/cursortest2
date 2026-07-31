package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class x9 implements ei, di {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nf f20302a;

    /* JADX WARN: Multi-variable type inference failed */
    public x9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.ei
    @Nullable
    public String a(@NotNull Context context, @NotNull w9 source, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        ca a4 = this.f20302a.a(context, source);
        if (a4 != null) {
            return ca.a(a4, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public x9(@NotNull nf sharedSignalsStorageFactory) {
        Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.f20302a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.di
    public void a(@NotNull Context context, @NotNull w9 source, @NotNull String key, @NotNull String value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ca a4 = this.f20302a.a(context, source);
        if (a4 != null) {
            a4.a(key, value);
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public /* synthetic */ x9(nf nfVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new aa() : nfVar);
    }
}
