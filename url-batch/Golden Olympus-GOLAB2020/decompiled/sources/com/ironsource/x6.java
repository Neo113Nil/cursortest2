package com.ironsource;

import com.ironsource.InterfaceC1490j3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface x6 extends mm<Integer, Integer> {

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f20274a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f20275b = 3009;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20276c = 3008;

        private a() {
        }
    }

    @Metadata
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f20277a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f20278b = 3002;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20279c = 3005;

        /* renamed from: d, reason: collision with root package name */
        public static final int f20280d = 3300;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20281e = 3503;

        /* renamed from: f, reason: collision with root package name */
        public static final int f20282f = 3504;

        private b() {
        }
    }

    @Metadata
    public static final class c implements x6 {
        @NotNull
        public Integer a(int i4) {
            int i5;
            if (i4 == 206) {
                i5 = 3503;
            } else if (i4 == 207) {
                i5 = b.f20282f;
            } else if (i4 == 405) {
                i5 = 3009;
            } else if (i4 != 406) {
                switch (i4) {
                    case InterfaceC1490j3.d.b.f16810b /* 101 */:
                        i5 = 83500;
                        break;
                    case 102:
                        i5 = 83510;
                        break;
                    case InterfaceC1490j3.d.b.f16812d /* 103 */:
                        i5 = d.f20290h;
                        break;
                    case 104:
                        i5 = 83300;
                        break;
                    default:
                        switch (i4) {
                            case InterfaceC1490j3.d.b.f16815g /* 109 */:
                                i5 = 88002;
                                break;
                            case InterfaceC1490j3.d.b.f16816h /* 110 */:
                                i5 = 83004;
                                break;
                            case InterfaceC1490j3.d.b.f16817i /* 111 */:
                                break;
                            case InterfaceC1490j3.d.b.f16818j /* 112 */:
                                i5 = 3305;
                                break;
                            default:
                                switch (i4) {
                                    case InterfaceC1490j3.c.b.f16801b /* 201 */:
                                        i5 = 3002;
                                        break;
                                    case InterfaceC1490j3.c.b.f16802c /* 202 */:
                                        i5 = 3005;
                                        break;
                                    case InterfaceC1490j3.c.b.f16803d /* 203 */:
                                        i5 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown event code: " + i4);
                                }
                        }
                    case 105:
                        i5 = 83302;
                        break;
                }
            } else {
                i5 = 3008;
            }
            return Integer.valueOf(i5);
        }

        @Override // com.ironsource.mm
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f20283a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final int f20284b = 83500;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20285c = 83510;

        /* renamed from: d, reason: collision with root package name */
        public static final int f20286d = 83300;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20287e = 83302;

        /* renamed from: f, reason: collision with root package name */
        public static final int f20288f = 83004;

        /* renamed from: g, reason: collision with root package name */
        public static final int f20289g = 88002;

        /* renamed from: h, reason: collision with root package name */
        public static final int f20290h = 83301;

        /* renamed from: i, reason: collision with root package name */
        public static final int f20291i = 83302;

        /* renamed from: j, reason: collision with root package name */
        public static final int f20292j = 3305;

        private d() {
        }
    }
}
