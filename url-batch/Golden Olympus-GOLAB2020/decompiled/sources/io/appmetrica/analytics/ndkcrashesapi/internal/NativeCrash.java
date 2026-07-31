package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class NativeCrash {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCrashSource f40527a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40528b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40529c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40530d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40531e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40532f;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f40533a;

        /* renamed from: b, reason: collision with root package name */
        private final String f40534b;

        /* renamed from: c, reason: collision with root package name */
        private final String f40535c;

        /* renamed from: d, reason: collision with root package name */
        private final String f40536d;

        /* renamed from: e, reason: collision with root package name */
        private final long f40537e;

        /* renamed from: f, reason: collision with root package name */
        private final String f40538f;

        public Builder(@NotNull NativeCrashSource nativeCrashSource, @NotNull String str, @NotNull String str2, @NotNull String str3, long j4, @NotNull String str4) {
            this.f40533a = nativeCrashSource;
            this.f40534b = str;
            this.f40535c = str2;
            this.f40536d = str3;
            this.f40537e = j4;
            this.f40538f = str4;
        }

        @NotNull
        public final NativeCrash build() {
            return new NativeCrash(this.f40533a, this.f40534b, this.f40535c, this.f40536d, this.f40537e, this.f40538f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeCrashSource, str, str2, str3, j4, str4);
    }

    public final long getCreationTime() {
        return this.f40531e;
    }

    @NotNull
    public final String getDumpFile() {
        return this.f40530d;
    }

    @NotNull
    public final String getHandlerVersion() {
        return this.f40528b;
    }

    @NotNull
    public final String getMetadata() {
        return this.f40532f;
    }

    @NotNull
    public final NativeCrashSource getSource() {
        return this.f40527a;
    }

    @NotNull
    public final String getUuid() {
        return this.f40529c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, String str4) {
        this.f40527a = nativeCrashSource;
        this.f40528b = str;
        this.f40529c = str2;
        this.f40530d = str3;
        this.f40531e = j4;
        this.f40532f = str4;
    }
}
