package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class pi {
    public final si a;
    public final String b;
    public final String c;
    public final String d;
    public final Mediation e;
    public final b f;
    public ci g;
    public boolean h;
    public boolean i;
    public long j;
    public float k;
    public a l;

    public pi(si siVar, String str, String str2, String str3, Mediation mediation, b bVar, ci ciVar, boolean z, boolean z2, long j, float f, a aVar) {
        this.a = siVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = mediation;
        this.f = bVar;
        this.g = ciVar;
        this.h = z;
        this.i = z2;
        this.j = j;
        this.k = f;
        this.l = aVar;
    }

    public final si f() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final Mediation d() {
        return this.e;
    }

    public final b l() {
        return this.f;
    }

    public final ci k() {
        return this.g;
    }

    public final boolean m() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final long i() {
        return this.j;
    }

    public final float b() {
        return this.k;
    }

    public final a g() {
        return this.l;
    }

    public final long j() {
        return oh.a(this.j);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b b = new b("INFO", 0);
        public static final b c = new b("CRITICAL", 1);
        public static final b d = new b("ERROR", 2);
        public static final /* synthetic */ b[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            b[] a = a();
            e = a;
            f = EnumEntriesKt.enumEntries(a);
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{b, c, d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }

        public b(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b = new a("LOW", 0);
        public static final a c = new a("HIGH", 1);
        public static final /* synthetic */ a[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            a[] a = a();
            d = a;
            e = EnumEntriesKt.enumEntries(a);
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{b, c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }

        public a(String str, int i) {
        }
    }

    public final void a(float f) {
        this.k = f;
    }

    public /* synthetic */ pi(si siVar, String str, String str2, String str3, Mediation mediation, b bVar, ci ciVar, boolean z, boolean z2, long j, float f, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(siVar, str, str2, str3, mediation, bVar, (i & 64) != 0 ? new ci(null, null, null, null, null, null, null, null, 255, null) : ciVar, (i & 128) != 0 ? false : z, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? System.currentTimeMillis() : j, (i & 1024) != 0 ? 0.0f : f, aVar, null);
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public String toString() {
        return "TrackingEvent(name=" + this.a.getValue() + ", message='" + this.b + "', impressionAdType='" + this.c + "', location='" + this.d + "', mediation=" + this.e + ", type=" + this.f + ", trackAd=" + this.g + ", isLatencyEvent=" + this.h + ", shouldCalculateLatency=" + this.i + ", timestamp=" + this.j + ", latency=" + this.k + ", priority=" + this.l + ", timestampInSeconds=" + j() + ")";
    }

    public /* synthetic */ pi(si siVar, String str, String str2, String str3, Mediation mediation, b bVar, ci ciVar, boolean z, boolean z2, long j, float f, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(siVar, str, str2, str3, mediation, bVar, ciVar, z, z2, j, f, aVar);
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.l = aVar;
    }

    public final void a(ci ciVar) {
        this.g = ciVar;
    }
}
