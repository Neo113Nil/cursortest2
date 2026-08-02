package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class NativeCrash {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCrashSource f13225a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13226b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13227c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13228d;

    /* renamed from: e, reason: collision with root package name */
    private final long f13229e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13230f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f13231a;

        /* renamed from: b, reason: collision with root package name */
        private final String f13232b;

        /* renamed from: c, reason: collision with root package name */
        private final String f13233c;

        /* renamed from: d, reason: collision with root package name */
        private final String f13234d;

        /* renamed from: e, reason: collision with root package name */
        private final long f13235e;

        /* renamed from: f, reason: collision with root package name */
        private final String f13236f;

        public Builder(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, String str4) {
            this.f13231a = nativeCrashSource;
            this.f13232b = str;
            this.f13233c = str2;
            this.f13234d = str3;
            this.f13235e = j4;
            this.f13236f = str4;
        }

        public final NativeCrash build() {
            return new NativeCrash(this.f13231a, this.f13232b, this.f13233c, this.f13234d, this.f13235e, this.f13236f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, String str4, e eVar) {
        this(nativeCrashSource, str, str2, str3, j4, str4);
    }

    public final long getCreationTime() {
        return this.f13229e;
    }

    public final String getDumpFile() {
        return this.f13228d;
    }

    public final String getHandlerVersion() {
        return this.f13226b;
    }

    public final String getMetadata() {
        return this.f13230f;
    }

    public final NativeCrashSource getSource() {
        return this.f13225a;
    }

    public final String getUuid() {
        return this.f13227c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, String str4) {
        this.f13225a = nativeCrashSource;
        this.f13226b = str;
        this.f13227c = str2;
        this.f13228d = str3;
        this.f13229e = j4;
        this.f13230f = str4;
    }
}
