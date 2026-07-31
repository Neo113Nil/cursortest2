package com.ironsource;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ht implements g8 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f16637d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f16638e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final long f16639f = -1;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f16640a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16641b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zh f16642c;

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ht(@NotNull Context context, @NotNull String baseName, @NotNull zh sdkSharedPref) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f16640a = context;
        this.f16641b = baseName;
        this.f16642c = sdkSharedPref;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }

    @Override // com.ironsource.g8
    @Nullable
    public Long b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.f16642c.b(this.f16640a, new jt(identifier, this.f16641b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.g8
    @Nullable
    public Integer c(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Integer.valueOf(this.f16642c.b(this.f16640a, new jt(identifier, this.f16641b + ".show_count_show_counter").a(), -1)));
    }

    public /* synthetic */ ht(Context context, String str, zh zhVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i4 & 4) != 0 ? new hs() : zhVar);
    }

    private final Long a(Long l4) {
        if (l4 != null && l4.longValue() == -1) {
            return null;
        }
        return l4;
    }

    @Override // com.ironsource.g8
    public void b(@NotNull String identifier, long j4) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f16642c.a(this.f16640a, new jt(identifier, this.f16641b + ".pacing_last_show_time").a(), j4);
    }

    @Override // com.ironsource.g8
    @Nullable
    public Long a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.f16642c.b(this.f16640a, new jt(identifier, this.f16641b + ".show_count_threshold").a(), -1L)));
    }

    @Override // com.ironsource.g8
    public void a(@NotNull String identifier, int i4) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f16642c.a(this.f16640a, new jt(identifier, this.f16641b + ".show_count_show_counter").a(), i4);
    }

    @Override // com.ironsource.g8
    public void a(@NotNull String identifier, long j4) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f16642c.a(this.f16640a, new jt(identifier, this.f16641b + ".show_count_threshold").a(), j4);
    }
}
