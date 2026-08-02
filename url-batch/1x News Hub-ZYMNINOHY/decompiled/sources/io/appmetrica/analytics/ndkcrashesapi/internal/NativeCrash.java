package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class NativeCrash {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCrashSource f8826a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8827b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8828c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8829d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8830e;
    private final String f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f8831a;

        /* renamed from: b, reason: collision with root package name */
        private final String f8832b;

        /* renamed from: c, reason: collision with root package name */
        private final String f8833c;

        /* renamed from: d, reason: collision with root package name */
        private final String f8834d;

        /* renamed from: e, reason: collision with root package name */
        private final long f8835e;
        private final String f;

        public Builder(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j3, String str4) {
            this.f8831a = nativeCrashSource;
            this.f8832b = str;
            this.f8833c = str2;
            this.f8834d = str3;
            this.f8835e = j3;
            this.f = str4;
        }

        public final NativeCrash build() {
            return new NativeCrash(this.f8831a, this.f8832b, this.f8833c, this.f8834d, this.f8835e, this.f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j3, String str4, f fVar) {
        this(nativeCrashSource, str, str2, str3, j3, str4);
    }

    public final long getCreationTime() {
        return this.f8830e;
    }

    public final String getDumpFile() {
        return this.f8829d;
    }

    public final String getHandlerVersion() {
        return this.f8827b;
    }

    public final String getMetadata() {
        return this.f;
    }

    public final NativeCrashSource getSource() {
        return this.f8826a;
    }

    public final String getUuid() {
        return this.f8828c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j3, String str4) {
        this.f8826a = nativeCrashSource;
        this.f8827b = str;
        this.f8828c = str2;
        this.f8829d = str3;
        this.f8830e = j3;
        this.f = str4;
    }
}
