package com.chartboost.sdk.impl;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class rk {
    public static final a i = new a(null);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final b h;

    public rk(long j, int i2, int i3, long j2, long j3, long j4, int i4, b videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.a = j;
        this.b = i2;
        this.c = i3;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = i4;
        this.h = videoPlayer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk)) {
            return false;
        }
        rk rkVar = (rk) obj;
        return this.a == rkVar.a && this.b == rkVar.b && this.c == rkVar.c && this.d == rkVar.d && this.e == rkVar.e && this.f == rkVar.f && this.g == rkVar.g && this.h == rkVar.h;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Long.hashCode(this.f)) * 31) + Integer.hashCode(this.g)) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "VideoPreCachingModel(maxBytes=" + this.a + ", maxUnitsPerTimeWindow=" + this.b + ", maxUnitsPerTimeWindowCellular=" + this.c + ", timeWindow=" + this.d + ", timeWindowCellular=" + this.e + ", ttl=" + this.f + ", bufferSize=" + this.g + ", videoPlayer=" + this.h + ")";
    }

    public final long b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final long e() {
        return this.d;
    }

    public final long f() {
        return this.e;
    }

    public final long g() {
        return this.f;
    }

    public final int a() {
        return this.g;
    }

    public static final rk a(JSONObject jSONObject) {
        return i.a(jSONObject);
    }

    public final b h() {
        return this.h;
    }

    public static final class a {
        public final rk a(JSONObject config) {
            String str;
            Intrinsics.checkNotNullParameter(config, "config");
            long optLong = config.optLong("maxBytes", 52428800L);
            int optInt = config.optInt("maxUnitsPerTimeWindow", 10);
            int optInt2 = config.optInt("maxUnitsPerTimeWindowCellular", 10);
            long optLong2 = config.optLong("timeWindow", 18000L);
            long optLong3 = config.optLong("timeWindowCellular", 18000L);
            long optLong4 = config.optLong("ttl", TelemetryConfig.DEFAULT_EVENT_TTL_SEC);
            int optInt3 = config.optInt("bufferSize", 3);
            str = sk.a;
            String optString = config.optString("videoPlayer", str);
            b.a aVar = b.c;
            Intrinsics.checkNotNull(optString);
            return new rk(optLong, optInt, optInt2, optLong2, optLong3, optLong4, optInt3, aVar.a(optString));
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final a c;
        public static final b d = new b("EXO_PLAYER", 0, "exoplayer");
        public static final b e = new b("MEDIA_PLAYER", 1, "mediaplayer");
        public static final /* synthetic */ b[] f;
        public static final /* synthetic */ EnumEntries g;
        public final String b;

        static {
            b[] a2 = a();
            f = a2;
            g = EnumEntriesKt.enumEntries(a2);
            c = new a(null);
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{d, e};
        }

        public static EnumEntries b() {
            return g;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }

        public b(String str, int i, String str2) {
            this.b = str2;
        }

        public final String c() {
            return this.b;
        }

        public static final class a {
            public final b a(String value) {
                Object obj;
                Intrinsics.checkNotNullParameter(value, "value");
                Iterator<E> it = b.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((b) obj).c(), value)) {
                        break;
                    }
                }
                b bVar = (b) obj;
                return bVar == null ? b.d : bVar;
            }

            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public /* synthetic */ rk(long j, int i2, int i3, long j2, long j3, long j4, int i4, b bVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 52428800L : j, (i5 & 2) != 0 ? 10 : i2, (i5 & 4) == 0 ? i3 : 10, (i5 & 8) != 0 ? 18000L : j2, (i5 & 16) == 0 ? j3 : 18000L, (i5 & 32) != 0 ? TelemetryConfig.DEFAULT_EVENT_TTL_SEC : j4, (i5 & 64) != 0 ? 3 : i4, (i5 & 128) != 0 ? b.d : bVar);
    }
}
