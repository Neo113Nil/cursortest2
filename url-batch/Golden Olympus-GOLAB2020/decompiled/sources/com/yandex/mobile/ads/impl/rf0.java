package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.yandex.mobile.ads.impl.tg0;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import okio.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rf0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final af0[] f31153a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<okio.h, Integer> f31154b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31155c = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f31156a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f31157b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final okio.g f31158c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public af0[] f31159d;

        /* renamed from: e, reason: collision with root package name */
        private int f31160e;

        /* renamed from: f, reason: collision with root package name */
        public int f31161f;

        /* renamed from: g, reason: collision with root package name */
        public int f31162g;

        public /* synthetic */ a(tg0.b bVar) {
            this(bVar, Base64Utils.IO_BUFFER_SIZE);
        }

        private final int a(int i4) {
            int i5;
            int i6 = 0;
            if (i4 > 0) {
                int length = this.f31159d.length;
                while (true) {
                    length--;
                    i5 = this.f31160e;
                    if (length < i5 || i4 <= 0) {
                        break;
                    }
                    af0 af0Var = this.f31159d[length];
                    Intrinsics.checkNotNull(af0Var);
                    int i7 = af0Var.f23267c;
                    i4 -= i7;
                    this.f31162g -= i7;
                    this.f31161f--;
                    i6++;
                }
                af0[] af0VarArr = this.f31159d;
                int i8 = i5 + 1;
                System.arraycopy(af0VarArr, i8, af0VarArr, i8 + i6, this.f31161f);
                this.f31160e += i6;
            }
            return i6;
        }

        private final okio.h b(int i4) {
            if (i4 >= 0 && i4 <= rf0.b().length - 1) {
                return rf0.b()[i4].f23265a;
            }
            int length = this.f31160e + 1 + (i4 - rf0.b().length);
            if (length >= 0) {
                af0[] af0VarArr = this.f31159d;
                if (length < af0VarArr.length) {
                    af0 af0Var = af0VarArr[length];
                    Intrinsics.checkNotNull(af0Var);
                    return af0Var.f23265a;
                }
            }
            throw new IOException("Header index too large " + (i4 + 1));
        }

        public final void c() {
            while (!this.f31158c.v()) {
                int a4 = v82.a(this.f31158c.readByte());
                if (a4 == 128) {
                    throw new IOException("index == 0");
                }
                if ((a4 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    c(a(a4, 127) - 1);
                } else if (a4 == 64) {
                    int i4 = rf0.f31155c;
                    a(new af0(rf0.a(b()), b()));
                } else if ((a4 & 64) == 64) {
                    a(new af0(b(a(a4, 63) - 1), b()));
                } else if ((a4 & 32) == 32) {
                    int a5 = a(a4, 31);
                    this.f31156a = a5;
                    if (a5 < 0 || a5 > 4096) {
                        throw new IOException("Invalid dynamic table size update " + this.f31156a);
                    }
                    int i5 = this.f31162g;
                    if (a5 < i5) {
                        if (a5 == 0) {
                            AbstractC3219i.o(this.f31159d, null, 0, 0, 6, null);
                            this.f31160e = this.f31159d.length - 1;
                            this.f31161f = 0;
                            this.f31162g = 0;
                        } else {
                            a(i5 - a5);
                        }
                    }
                } else if (a4 == 16 || a4 == 0) {
                    int i6 = rf0.f31155c;
                    this.f31157b.add(new af0(rf0.a(b()), b()));
                } else {
                    this.f31157b.add(new af0(b(a(a4, 15) - 1), b()));
                }
            }
        }

        public a(@NotNull tg0.b source, int i4) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f31156a = i4;
            this.f31157b = new ArrayList();
            this.f31158c = okio.p.d(source);
            this.f31159d = new af0[8];
            this.f31160e = 7;
        }

        @NotNull
        public final okio.h b() {
            byte readByte = this.f31158c.readByte();
            byte[] bArr = v82.f33550a;
            int i4 = readByte & 255;
            boolean z4 = (readByte & 128) == 128;
            long a4 = a(i4, 127);
            if (z4) {
                C3372e c3372e = new C3372e();
                int i5 = oh0.f30042d;
                oh0.a(this.f31158c, a4, c3372e);
                return c3372e.e0();
            }
            return this.f31158c.d(a4);
        }

        @NotNull
        public final List<af0> a() {
            List<af0> list = CollectionsKt.toList(this.f31157b);
            this.f31157b.clear();
            return list;
        }

        private final void a(af0 af0Var) {
            this.f31157b.add(af0Var);
            int i4 = af0Var.f23267c;
            int i5 = this.f31156a;
            if (i4 > i5) {
                AbstractC3219i.o(this.f31159d, null, 0, 0, 6, null);
                this.f31160e = this.f31159d.length - 1;
                this.f31161f = 0;
                this.f31162g = 0;
                return;
            }
            a((this.f31162g + i4) - i5);
            int i6 = this.f31161f + 1;
            af0[] af0VarArr = this.f31159d;
            if (i6 > af0VarArr.length) {
                af0[] af0VarArr2 = new af0[af0VarArr.length * 2];
                System.arraycopy(af0VarArr, 0, af0VarArr2, af0VarArr.length, af0VarArr.length);
                this.f31160e = this.f31159d.length - 1;
                this.f31159d = af0VarArr2;
            }
            int i7 = this.f31160e;
            this.f31160e = i7 - 1;
            this.f31159d[i7] = af0Var;
            this.f31161f++;
            this.f31162g += i4;
        }

        private final void c(int i4) {
            if (i4 >= 0 && i4 <= rf0.b().length - 1) {
                this.f31157b.add(rf0.b()[i4]);
                return;
            }
            int length = this.f31160e + 1 + (i4 - rf0.b().length);
            if (length >= 0) {
                af0[] af0VarArr = this.f31159d;
                if (length < af0VarArr.length) {
                    ArrayList arrayList = this.f31157b;
                    af0 af0Var = af0VarArr[length];
                    Intrinsics.checkNotNull(af0Var);
                    arrayList.add(af0Var);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i4 + 1));
        }

        public final int a(int i4, int i5) {
            int i6 = i4 & i5;
            if (i6 < i5) {
                return i6;
            }
            int i7 = 0;
            while (true) {
                byte readByte = this.f31158c.readByte();
                byte[] bArr = v82.f33550a;
                int i8 = readByte & 255;
                if ((readByte & 128) == 0) {
                    return i5 + (i8 << i7);
                }
                i5 += (readByte & Byte.MAX_VALUE) << i7;
                i7 += 7;
            }
        }
    }

    static {
        af0 af0Var = new af0(af0.f23264i, "");
        okio.h name = af0.f23261f;
        af0 af0Var2 = new af0(name, com.ironsource.jn.f16864a);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(com.ironsource.jn.f16865b, "value");
        h.a aVar = okio.h.f43270e;
        af0 af0Var3 = new af0(name, aVar.d(com.ironsource.jn.f16865b));
        okio.h name2 = af0.f23262g;
        af0 af0Var4 = new af0(name2, "/");
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter("/index.html", "value");
        af0 af0Var5 = new af0(name2, aVar.d("/index.html"));
        okio.h name3 = af0.f23263h;
        af0 af0Var6 = new af0(name3, "http");
        Intrinsics.checkNotNullParameter(name3, "name");
        Intrinsics.checkNotNullParameter("https", "value");
        af0 af0Var7 = new af0(name3, aVar.d("https"));
        okio.h name4 = af0.f23260e;
        af0 af0Var8 = new af0(name4, "200");
        Intrinsics.checkNotNullParameter(name4, "name");
        Intrinsics.checkNotNullParameter("204", "value");
        af0 af0Var9 = new af0(name4, aVar.d("204"));
        Intrinsics.checkNotNullParameter(name4, "name");
        Intrinsics.checkNotNullParameter("206", "value");
        af0 af0Var10 = new af0(name4, aVar.d("206"));
        Intrinsics.checkNotNullParameter(name4, "name");
        Intrinsics.checkNotNullParameter("304", "value");
        af0 af0Var11 = new af0(name4, aVar.d("304"));
        Intrinsics.checkNotNullParameter(name4, "name");
        Intrinsics.checkNotNullParameter("400", "value");
        af0 af0Var12 = new af0(name4, aVar.d("400"));
        Intrinsics.checkNotNullParameter(name4, "name");
        Intrinsics.checkNotNullParameter("404", "value");
        af0 af0Var13 = new af0(name4, aVar.d("404"));
        Intrinsics.checkNotNullParameter(name4, "name");
        Intrinsics.checkNotNullParameter("500", "value");
        af0 af0Var14 = new af0(name4, aVar.d("500"));
        Intrinsics.checkNotNullParameter("accept-charset", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var15 = new af0(aVar.d("accept-charset"), aVar.d(""));
        Intrinsics.checkNotNullParameter("accept-encoding", "name");
        Intrinsics.checkNotNullParameter("gzip, deflate", "value");
        af0 af0Var16 = new af0(aVar.d("accept-encoding"), aVar.d("gzip, deflate"));
        Intrinsics.checkNotNullParameter("accept-language", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var17 = new af0(aVar.d("accept-language"), aVar.d(""));
        Intrinsics.checkNotNullParameter("accept-ranges", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var18 = new af0(aVar.d("accept-ranges"), aVar.d(""));
        Intrinsics.checkNotNullParameter("accept", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var19 = new af0(aVar.d("accept"), aVar.d(""));
        Intrinsics.checkNotNullParameter("access-control-allow-origin", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var20 = new af0(aVar.d("access-control-allow-origin"), aVar.d(""));
        Intrinsics.checkNotNullParameter(IronSourceSegment.AGE, "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var21 = new af0(aVar.d(IronSourceSegment.AGE), aVar.d(""));
        Intrinsics.checkNotNullParameter("allow", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var22 = new af0(aVar.d("allow"), aVar.d(""));
        Intrinsics.checkNotNullParameter("authorization", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var23 = new af0(aVar.d("authorization"), aVar.d(""));
        Intrinsics.checkNotNullParameter("cache-control", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var24 = new af0(aVar.d("cache-control"), aVar.d(""));
        Intrinsics.checkNotNullParameter("content-disposition", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var25 = new af0(aVar.d("content-disposition"), aVar.d(""));
        Intrinsics.checkNotNullParameter("content-encoding", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var26 = new af0(aVar.d("content-encoding"), aVar.d(""));
        Intrinsics.checkNotNullParameter("content-language", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var27 = new af0(aVar.d("content-language"), aVar.d(""));
        Intrinsics.checkNotNullParameter("content-length", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var28 = new af0(aVar.d("content-length"), aVar.d(""));
        Intrinsics.checkNotNullParameter("content-location", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var29 = new af0(aVar.d("content-location"), aVar.d(""));
        Intrinsics.checkNotNullParameter("content-range", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var30 = new af0(aVar.d("content-range"), aVar.d(""));
        Intrinsics.checkNotNullParameter("content-type", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var31 = new af0(aVar.d("content-type"), aVar.d(""));
        Intrinsics.checkNotNullParameter("cookie", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var32 = new af0(aVar.d("cookie"), aVar.d(""));
        Intrinsics.checkNotNullParameter("date", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var33 = new af0(aVar.d("date"), aVar.d(""));
        Intrinsics.checkNotNullParameter("etag", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var34 = new af0(aVar.d("etag"), aVar.d(""));
        Intrinsics.checkNotNullParameter("expect", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var35 = new af0(aVar.d("expect"), aVar.d(""));
        Intrinsics.checkNotNullParameter("expires", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var36 = new af0(aVar.d("expires"), aVar.d(""));
        Intrinsics.checkNotNullParameter(Constants.MessagePayloadKeys.FROM, "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var37 = new af0(aVar.d(Constants.MessagePayloadKeys.FROM), aVar.d(""));
        Intrinsics.checkNotNullParameter("host", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var38 = new af0(aVar.d("host"), aVar.d(""));
        Intrinsics.checkNotNullParameter("if-match", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var39 = new af0(aVar.d("if-match"), aVar.d(""));
        Intrinsics.checkNotNullParameter("if-modified-since", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var40 = new af0(aVar.d("if-modified-since"), aVar.d(""));
        Intrinsics.checkNotNullParameter("if-none-match", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var41 = new af0(aVar.d("if-none-match"), aVar.d(""));
        Intrinsics.checkNotNullParameter("if-range", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var42 = new af0(aVar.d("if-range"), aVar.d(""));
        Intrinsics.checkNotNullParameter("if-unmodified-since", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var43 = new af0(aVar.d("if-unmodified-since"), aVar.d(""));
        Intrinsics.checkNotNullParameter("last-modified", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var44 = new af0(aVar.d("last-modified"), aVar.d(""));
        Intrinsics.checkNotNullParameter("link", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var45 = new af0(aVar.d("link"), aVar.d(""));
        Intrinsics.checkNotNullParameter(FirebaseAnalytics.Param.LOCATION, "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var46 = new af0(aVar.d(FirebaseAnalytics.Param.LOCATION), aVar.d(""));
        Intrinsics.checkNotNullParameter("max-forwards", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var47 = new af0(aVar.d("max-forwards"), aVar.d(""));
        Intrinsics.checkNotNullParameter("proxy-authenticate", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var48 = new af0(aVar.d("proxy-authenticate"), aVar.d(""));
        Intrinsics.checkNotNullParameter("proxy-authorization", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var49 = new af0(aVar.d("proxy-authorization"), aVar.d(""));
        Intrinsics.checkNotNullParameter("range", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var50 = new af0(aVar.d("range"), aVar.d(""));
        Intrinsics.checkNotNullParameter("referer", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var51 = new af0(aVar.d("referer"), aVar.d(""));
        Intrinsics.checkNotNullParameter("refresh", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var52 = new af0(aVar.d("refresh"), aVar.d(""));
        Intrinsics.checkNotNullParameter("retry-after", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var53 = new af0(aVar.d("retry-after"), aVar.d(""));
        Intrinsics.checkNotNullParameter(com.ironsource.im.f16720a, "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var54 = new af0(aVar.d(com.ironsource.im.f16720a), aVar.d(""));
        Intrinsics.checkNotNullParameter("set-cookie", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var55 = new af0(aVar.d("set-cookie"), aVar.d(""));
        Intrinsics.checkNotNullParameter("strict-transport-security", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var56 = new af0(aVar.d("strict-transport-security"), aVar.d(""));
        Intrinsics.checkNotNullParameter("transfer-encoding", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var57 = new af0(aVar.d("transfer-encoding"), aVar.d(""));
        Intrinsics.checkNotNullParameter("user-agent", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var58 = new af0(aVar.d("user-agent"), aVar.d(""));
        Intrinsics.checkNotNullParameter("vary", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var59 = new af0(aVar.d("vary"), aVar.d(""));
        Intrinsics.checkNotNullParameter("via", "name");
        Intrinsics.checkNotNullParameter("", "value");
        af0 af0Var60 = new af0(aVar.d("via"), aVar.d(""));
        Intrinsics.checkNotNullParameter("www-authenticate", "name");
        Intrinsics.checkNotNullParameter("", "value");
        f31153a = new af0[]{af0Var, af0Var2, af0Var3, af0Var4, af0Var5, af0Var6, af0Var7, af0Var8, af0Var9, af0Var10, af0Var11, af0Var12, af0Var13, af0Var14, af0Var15, af0Var16, af0Var17, af0Var18, af0Var19, af0Var20, af0Var21, af0Var22, af0Var23, af0Var24, af0Var25, af0Var26, af0Var27, af0Var28, af0Var29, af0Var30, af0Var31, af0Var32, af0Var33, af0Var34, af0Var35, af0Var36, af0Var37, af0Var38, af0Var39, af0Var40, af0Var41, af0Var42, af0Var43, af0Var44, af0Var45, af0Var46, af0Var47, af0Var48, af0Var49, af0Var50, af0Var51, af0Var52, af0Var53, af0Var54, af0Var55, af0Var56, af0Var57, af0Var58, af0Var59, af0Var60, new af0(aVar.d("www-authenticate"), aVar.d(""))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i4 = 0; i4 < 61; i4++) {
            af0[] af0VarArr = f31153a;
            if (!linkedHashMap.containsKey(af0VarArr[i4].f23265a)) {
                linkedHashMap.put(af0VarArr[i4].f23265a, Integer.valueOf(i4));
            }
        }
        Map<okio.h, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        f31154b = unmodifiableMap;
    }

    @NotNull
    public static okio.h a(@NotNull okio.h name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int v4 = name.v();
        for (int i4 = 0; i4 < v4; i4++) {
            byte g4 = name.g(i4);
            if (65 <= g4 && g4 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.y());
            }
        }
        return name;
    }

    @NotNull
    public static af0[] b() {
        return f31153a;
    }

    @NotNull
    public static Map a() {
        return f31154b;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f31163a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C3372e f31164b;

        /* renamed from: c, reason: collision with root package name */
        private int f31165c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f31166d;

        /* renamed from: e, reason: collision with root package name */
        public int f31167e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        public af0[] f31168f;

        /* renamed from: g, reason: collision with root package name */
        private int f31169g;

        /* renamed from: h, reason: collision with root package name */
        public int f31170h;

        /* renamed from: i, reason: collision with root package name */
        public int f31171i;

        public b(int i4, boolean z4, @NotNull C3372e out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f31163a = z4;
            this.f31164b = out;
            this.f31165c = Integer.MAX_VALUE;
            this.f31167e = i4;
            this.f31168f = new af0[8];
            this.f31169g = 7;
        }

        private final void a(int i4) {
            int i5;
            if (i4 > 0) {
                int length = this.f31168f.length - 1;
                int i6 = 0;
                while (true) {
                    i5 = this.f31169g;
                    if (length < i5 || i4 <= 0) {
                        break;
                    }
                    af0 af0Var = this.f31168f[length];
                    Intrinsics.checkNotNull(af0Var);
                    i4 -= af0Var.f23267c;
                    int i7 = this.f31171i;
                    af0 af0Var2 = this.f31168f[length];
                    Intrinsics.checkNotNull(af0Var2);
                    this.f31171i = i7 - af0Var2.f23267c;
                    this.f31170h--;
                    i6++;
                    length--;
                }
                af0[] af0VarArr = this.f31168f;
                int i8 = i5 + 1;
                System.arraycopy(af0VarArr, i8, af0VarArr, i8 + i6, this.f31170h);
                af0[] af0VarArr2 = this.f31168f;
                int i9 = this.f31169g + 1;
                Arrays.fill(af0VarArr2, i9, i9 + i6, (Object) null);
                this.f31169g += i6;
            }
        }

        public final void b(int i4) {
            int min = Math.min(i4, 16384);
            int i5 = this.f31167e;
            if (i5 == min) {
                return;
            }
            if (min < i5) {
                this.f31165c = Math.min(this.f31165c, min);
            }
            this.f31166d = true;
            this.f31167e = min;
            int i6 = this.f31171i;
            if (min < i6) {
                if (min != 0) {
                    a(i6 - min);
                    return;
                }
                AbstractC3219i.o(this.f31168f, null, 0, 0, 6, null);
                this.f31169g = this.f31168f.length - 1;
                this.f31170h = 0;
                this.f31171i = 0;
            }
        }

        public /* synthetic */ b(C3372e c3372e) {
            this(Base64Utils.IO_BUFFER_SIZE, true, c3372e);
        }

        private final void a(af0 af0Var) {
            int i4 = af0Var.f23267c;
            int i5 = this.f31167e;
            if (i4 > i5) {
                AbstractC3219i.o(this.f31168f, null, 0, 0, 6, null);
                this.f31169g = this.f31168f.length - 1;
                this.f31170h = 0;
                this.f31171i = 0;
                return;
            }
            a((this.f31171i + i4) - i5);
            int i6 = this.f31170h + 1;
            af0[] af0VarArr = this.f31168f;
            if (i6 > af0VarArr.length) {
                af0[] af0VarArr2 = new af0[af0VarArr.length * 2];
                System.arraycopy(af0VarArr, 0, af0VarArr2, af0VarArr.length, af0VarArr.length);
                this.f31169g = this.f31168f.length - 1;
                this.f31168f = af0VarArr2;
            }
            int i7 = this.f31169g;
            this.f31169g = i7 - 1;
            this.f31168f[i7] = af0Var;
            this.f31170h++;
            this.f31171i += i4;
        }

        public final void a(@NotNull okio.h data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f31163a && oh0.a(data) < data.v()) {
                C3372e c3372e = new C3372e();
                oh0.a(data, c3372e);
                okio.h e02 = c3372e.e0();
                a(e02.v(), 127, UserVerificationMethods.USER_VERIFY_PATTERN);
                this.f31164b.M(e02);
                return;
            }
            a(data.v(), 127, 0);
            this.f31164b.M(data);
        }

        public final void a(@NotNull ArrayList headerBlock) {
            int i4;
            int i5;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f31166d) {
                int i6 = this.f31165c;
                if (i6 < this.f31167e) {
                    a(i6, 31, 32);
                }
                this.f31166d = false;
                this.f31165c = Integer.MAX_VALUE;
                a(this.f31167e, 31, 32);
            }
            int size = headerBlock.size();
            for (int i7 = 0; i7 < size; i7++) {
                af0 af0Var = (af0) headerBlock.get(i7);
                okio.h x4 = af0Var.f23265a.x();
                okio.h hVar = af0Var.f23266b;
                Integer num = (Integer) rf0.a().get(x4);
                if (num != null) {
                    int intValue = num.intValue();
                    i5 = intValue + 1;
                    if (2 <= i5 && i5 < 8) {
                        if (Intrinsics.areEqual(rf0.b()[intValue].f23266b, hVar)) {
                            i4 = i5;
                        } else if (Intrinsics.areEqual(rf0.b()[i5].f23266b, hVar)) {
                            i5 = intValue + 2;
                            i4 = i5;
                        }
                    }
                    i4 = i5;
                    i5 = -1;
                } else {
                    i4 = -1;
                    i5 = -1;
                }
                if (i5 == -1) {
                    int i8 = this.f31169g + 1;
                    int length = this.f31168f.length;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        af0 af0Var2 = this.f31168f[i8];
                        Intrinsics.checkNotNull(af0Var2);
                        if (Intrinsics.areEqual(af0Var2.f23265a, x4)) {
                            af0 af0Var3 = this.f31168f[i8];
                            Intrinsics.checkNotNull(af0Var3);
                            if (Intrinsics.areEqual(af0Var3.f23266b, hVar)) {
                                i5 = rf0.b().length + (i8 - this.f31169g);
                                break;
                            } else if (i4 == -1) {
                                i4 = (i8 - this.f31169g) + rf0.b().length;
                            }
                        }
                        i8++;
                    }
                }
                if (i5 != -1) {
                    a(i5, 127, UserVerificationMethods.USER_VERIFY_PATTERN);
                } else if (i4 == -1) {
                    this.f31164b.w(64);
                    a(x4);
                    a(hVar);
                    a(af0Var);
                } else if (x4.w(af0.f23259d) && !Intrinsics.areEqual(af0.f23264i, x4)) {
                    a(i4, 15, 0);
                    a(hVar);
                } else {
                    a(i4, 63, 64);
                    a(hVar);
                    a(af0Var);
                }
            }
        }

        public final void a(int i4, int i5, int i6) {
            if (i4 < i5) {
                this.f31164b.w(i4 | i6);
                return;
            }
            this.f31164b.w(i6 | i5);
            int i7 = i4 - i5;
            while (i7 >= 128) {
                this.f31164b.w(128 | (i7 & 127));
                i7 >>>= 7;
            }
            this.f31164b.w(i7);
        }
    }
}
