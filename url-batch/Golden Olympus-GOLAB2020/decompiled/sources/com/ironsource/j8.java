package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.gf;
import com.ironsource.q9;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class j8 implements gf, gf.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ap f16828a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final nt f16829b;

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16830a;

        static {
            int[] iArr = new int[n8.values().length];
            try {
                iArr[n8.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n8.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n8.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16830a = iArr;
        }
    }

    public j8() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.gf
    @NotNull
    public synchronized l8 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        l8 a4 = this.f16828a.a(identifier);
        if (a4.d()) {
            return a4;
        }
        return this.f16829b.a(identifier);
    }

    @Override // com.ironsource.gf.a
    public synchronized void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f16828a.b(identifier);
        this.f16829b.b(identifier);
    }

    public j8(@NotNull q9 currentTimeProvider, @NotNull zf pacingDataRepository, @NotNull fi showCountDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        Intrinsics.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.f16828a = new ap(currentTimeProvider, pacingDataRepository);
        this.f16829b = new nt(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.gf.a
    @NotNull
    public synchronized Object a(@NotNull String identifier, @NotNull n8 cappingType, @NotNull ef cappingConfig) {
        Object a4;
        try {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(cappingType, "cappingType");
            Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
            int i4 = a.f16830a[cappingType.ordinal()];
            if (i4 == 1) {
                a4 = this.f16828a.a(identifier, cappingType, cappingConfig);
            } else if (i4 == 2) {
                a4 = this.f16829b.a(identifier, cappingType, cappingConfig);
            } else {
                if (i4 != 3) {
                    throw new W1.m();
                }
                Result.Companion companion = Result.Companion;
                a4 = Result.m243constructorimpl(Unit.f41027a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ j8(q9 q9Var, zf zfVar, fi fiVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(q9Var, zfVar, fiVar);
        q9Var = (i4 & 1) != 0 ? new q9.a() : q9Var;
        if ((i4 & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            zfVar = new bp(new ht(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i4 & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            fiVar = new lt(new ht(applicationContext2, "capping_service", null, 4, null));
        }
    }
}
