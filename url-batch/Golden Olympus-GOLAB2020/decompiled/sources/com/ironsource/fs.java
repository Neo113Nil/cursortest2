package com.ironsource;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class fs implements es {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zh f16301a;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f16302a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f16303b = "sessionNumber";

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f16304c = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.or
    public long a(@NotNull Context context, long j4) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f16301a.b(context, "firstSessionTimestamp", j4);
    }

    @Override // com.ironsource.gs
    public int b(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f16301a.b(context, a.f16303b, i4);
    }

    public fs(@NotNull zh sdkSharedPref) {
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f16301a = sdkSharedPref;
    }

    @Override // com.ironsource.gs
    public void a(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16301a.a(context, a.f16303b, i4);
    }

    @Override // com.ironsource.or
    public void b(@NotNull Context context, long j4) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16301a.a(context, "firstSessionTimestamp", j4);
    }

    public /* synthetic */ fs(zh zhVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new hs() : zhVar);
    }
}
