package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f28994a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Throwable f28995b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f28996A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f28997B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f28998C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f28999D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f29000E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f29001F;

        /* renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ a[] f29002G;

        /* renamed from: b, reason: collision with root package name */
        public static final a f29003b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f29004c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f29005d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f29006e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f29007f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f29008g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f29009h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f29010i;

        /* renamed from: j, reason: collision with root package name */
        public static final a f29011j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f29012k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f29013l;

        /* renamed from: m, reason: collision with root package name */
        public static final a f29014m;

        /* renamed from: n, reason: collision with root package name */
        public static final a f29015n;

        /* renamed from: o, reason: collision with root package name */
        public static final a f29016o;

        /* renamed from: p, reason: collision with root package name */
        public static final a f29017p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f29018q;

        /* renamed from: r, reason: collision with root package name */
        public static final a f29019r;

        /* renamed from: s, reason: collision with root package name */
        public static final a f29020s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f29021t;

        /* renamed from: u, reason: collision with root package name */
        public static final a f29022u;

        /* renamed from: v, reason: collision with root package name */
        public static final a f29023v;

        /* renamed from: w, reason: collision with root package name */
        public static final a f29024w;

        /* renamed from: x, reason: collision with root package name */
        public static final a f29025x;

        /* renamed from: y, reason: collision with root package name */
        public static final a f29026y;

        /* renamed from: z, reason: collision with root package name */
        public static final a f29027z;

        static {
            a aVar = new a(0, "RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER");
            f29003b = aVar;
            a aVar2 = new a(1, "RENDERER_FAILED_DEQUEUE_INPUT_BUFFER");
            f29004c = aVar2;
            a aVar3 = new a(2, "RENDERER_FAILED_STOP");
            f29005d = aVar3;
            a aVar4 = new a(3, "RENDERER_FAILED_SET_SURFACE");
            f29006e = aVar4;
            a aVar5 = new a(4, "RENDERER_FAILED_RELEASE_OUTPUT_BUFFER");
            f29007f = aVar5;
            a aVar6 = new a(5, "RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER");
            f29008g = aVar6;
            a aVar7 = new a(6, "RENDERER_MEDIA_CODEC_UNKNOWN");
            f29009h = aVar7;
            a aVar8 = new a(7, "TIMEOUT");
            f29010i = aVar8;
            a aVar9 = new a(8, "ILLEGAL_SEEK_POSITION");
            f29011j = aVar9;
            a aVar10 = new a(9, "DECODER_QUERY_ERROR");
            f29012k = aVar10;
            a aVar11 = new a(10, "DECODER_INITIALIZATION_ERROR");
            f29013l = aVar11;
            a aVar12 = new a(11, "DECODER_UNKNOWN_ERROR");
            f29014m = aVar12;
            a aVar13 = new a(12, "BEHIND_LIVE_WINDOW_ERROR");
            f29015n = aVar13;
            a aVar14 = new a(13, "DRM_KEYS_EXPIRED");
            f29016o = aVar14;
            a aVar15 = new a(14, "DRM_MEDIA_RESOURCE_BUSY");
            f29017p = aVar15;
            a aVar16 = new a(15, "DRM_SESSION_ERROR");
            f29018q = aVar16;
            a aVar17 = new a(16, "HTTP_CLEARTEXT_NOT_PERMITTED");
            f29019r = aVar17;
            a aVar18 = new a(17, "HTTP_CODE_UNAUTHORIZED");
            f29020s = aVar18;
            a aVar19 = new a(18, "HTTP_CODE_FORBIDDEN");
            f29021t = aVar19;
            a aVar20 = new a(19, "HTTP_CODE_NOT_FOUND");
            f29022u = aVar20;
            a aVar21 = new a(20, "HTTP_CODE_UNKNOWN");
            f29023v = aVar21;
            a aVar22 = new a(21, "SSL_HANDSHAKE_ERROR");
            f29024w = aVar22;
            a aVar23 = new a(22, "NETWORK_UNAVAILABLE");
            f29025x = aVar23;
            a aVar24 = new a(23, "CONTENT_PARSER_ERROR");
            f29026y = aVar24;
            a aVar25 = new a(24, "LOADER_UNEXPECTED_ERROR");
            f29027z = aVar25;
            a aVar26 = new a(25, "AUDIO_ERROR");
            f28996A = aVar26;
            a aVar27 = new a(26, "SUBTITLE_ERROR");
            f28997B = aVar27;
            a aVar28 = new a(27, "CACHE_ERROR");
            f28998C = aVar28;
            a aVar29 = new a(28, GrsBaseInfo.CountryCodeSource.UNKNOWN);
            f28999D = aVar29;
            a aVar30 = new a(29, "PLAYBACK_UNKNOWN");
            f29000E = aVar30;
            a aVar31 = new a(30, "UNKNOWN_NOT_MATCHED");
            f29001F = aVar31;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31};
            f29002G = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f29002G.clone();
        }
    }

    public mc2(@NotNull a reason, @NotNull Throwable underlyingError) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(underlyingError, "underlyingError");
        this.f28994a = reason;
        this.f28995b = underlyingError;
    }

    @NotNull
    public final a a() {
        return this.f28994a;
    }

    @NotNull
    public final Throwable b() {
        return this.f28995b;
    }
}
