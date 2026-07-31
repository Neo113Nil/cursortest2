package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.BuildConfig;
import kotlin.KotlinVersion;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oh0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final int[] f30039a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, com.ironsource.d9.f15851l, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, InterfaceC1490j3.d.b.f16810b, 102, InterfaceC1490j3.d.b.f16812d, 104, 105, 106, 107, 108, InterfaceC1490j3.d.b.f16815g, InterfaceC1490j3.d.b.f16816h, InterfaceC1490j3.d.b.f16817i, InterfaceC1490j3.d.b.f16818j, 113, IronSourceConstants.FIRST_INSTANCE_RESULT, 252, BuildConfig.API_LEVEL, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final byte[] f30040b = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f30041c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30042d = 0;

    static {
        for (int i4 = 0; i4 < 256; i4++) {
            a(i4, f30039a[i4], f30040b[i4]);
        }
    }

    public static void a(@NotNull okio.g source, long j4, @NotNull C3372e sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        a aVar = f30041c;
        int i4 = 0;
        int i5 = 0;
        for (long j5 = 0; j5 < j4; j5++) {
            byte readByte = source.readByte();
            byte[] bArr = v82.f33550a;
            i4 = (i4 << 8) | (readByte & 255);
            i5 += 8;
            while (i5 >= 8) {
                int i6 = (i4 >>> (i5 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                a[] a4 = aVar.a();
                Intrinsics.checkNotNull(a4);
                aVar = a4[i6];
                Intrinsics.checkNotNull(aVar);
                if (aVar.a() == null) {
                    sink.w(aVar.b());
                    i5 -= aVar.c();
                    aVar = f30041c;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            int i7 = (i4 << (8 - i5)) & KotlinVersion.MAX_COMPONENT_VALUE;
            a[] a5 = aVar.a();
            Intrinsics.checkNotNull(a5);
            a aVar2 = a5[i7];
            Intrinsics.checkNotNull(aVar2);
            if (aVar2.a() != null || aVar2.c() > i5) {
                return;
            }
            sink.w(aVar2.b());
            i5 -= aVar2.c();
            aVar = f30041c;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final a[] f30043a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30044b;

        /* renamed from: c, reason: collision with root package name */
        private final int f30045c;

        public a() {
            this.f30043a = new a[UserVerificationMethods.USER_VERIFY_HANDPRINT];
            this.f30044b = 0;
            this.f30045c = 0;
        }

        @Nullable
        public final a[] a() {
            return this.f30043a;
        }

        public final int b() {
            return this.f30044b;
        }

        public final int c() {
            return this.f30045c;
        }

        public a(int i4, int i5) {
            this.f30043a = null;
            this.f30044b = i4;
            int i6 = i5 & 7;
            this.f30045c = i6 == 0 ? 8 : i6;
        }
    }

    public static void a(@NotNull okio.h source, @NotNull C3372e sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int v4 = source.v();
        long j4 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < v4; i5++) {
            byte g4 = source.g(i5);
            byte[] bArr = v82.f33550a;
            int i6 = g4 & 255;
            int i7 = f30039a[i6];
            byte b4 = f30040b[i6];
            j4 = (j4 << b4) | i7;
            i4 += b4;
            while (i4 >= 8) {
                i4 -= 8;
                sink.w((int) (j4 >> i4));
            }
        }
        if (i4 > 0) {
            sink.w((int) ((j4 << (8 - i4)) | (255 >>> i4)));
        }
    }

    public static int a(@NotNull okio.h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int v4 = bytes.v();
        long j4 = 0;
        for (int i4 = 0; i4 < v4; i4++) {
            byte g4 = bytes.g(i4);
            byte[] bArr = v82.f33550a;
            j4 += f30040b[g4 & 255];
        }
        return (int) ((j4 + 7) >> 3);
    }

    private static void a(int i4, int i5, int i6) {
        a aVar = new a(i4, i6);
        a aVar2 = f30041c;
        while (i6 > 8) {
            i6 -= 8;
            int i7 = (i5 >>> i6) & KotlinVersion.MAX_COMPONENT_VALUE;
            a[] a4 = aVar2.a();
            Intrinsics.checkNotNull(a4);
            a aVar3 = a4[i7];
            if (aVar3 == null) {
                aVar3 = new a();
                a4[i7] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i8 = 8 - i6;
        int i9 = (i5 << i8) & KotlinVersion.MAX_COMPONENT_VALUE;
        a[] a5 = aVar2.a();
        Intrinsics.checkNotNull(a5);
        AbstractC3219i.n(a5, aVar, i9, (1 << i8) + i9);
    }
}
