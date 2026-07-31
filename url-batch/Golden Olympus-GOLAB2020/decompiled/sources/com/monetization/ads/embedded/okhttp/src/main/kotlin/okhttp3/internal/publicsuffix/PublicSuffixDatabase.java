package com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix;

import com.yandex.mobile.ads.impl.jh1;
import com.yandex.mobile.ads.impl.v82;
import f2.AbstractC2420c;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import kotlin.text.StringsKt;
import okio.g;
import okio.m;
import okio.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final byte[] f20683e = {42};

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final List<String> f20684f = CollectionsKt.listOf("*");

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final PublicSuffixDatabase f20685g = new PublicSuffixDatabase();

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f20686h = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f20687a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CountDownLatch f20688b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f20689c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f20690d;

    public static final class a {
        public /* synthetic */ a(int i4) {
            this();
        }

        public static final String a(byte[] bArr, byte[][] bArr2, int i4) {
            int i5;
            boolean z4;
            int i6;
            int i7;
            int i8 = -1;
            int i9 = PublicSuffixDatabase.f20686h;
            int length = bArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = (i10 + length) / 2;
                while (i11 > i8 && bArr[i11] != 10) {
                    i11 += i8;
                }
                int i12 = i11 + 1;
                int i13 = 1;
                while (true) {
                    i5 = i12 + i13;
                    if (bArr[i5] == 10) {
                        break;
                    }
                    i13++;
                }
                int i14 = i5 - i12;
                int i15 = i4;
                boolean z5 = false;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (z5) {
                        i6 = 46;
                        z4 = false;
                    } else {
                        byte b4 = bArr2[i15][i16];
                        byte[] bArr3 = v82.f33550a;
                        int i18 = b4 & 255;
                        z4 = z5;
                        i6 = i18;
                    }
                    byte b5 = bArr[i12 + i17];
                    byte[] bArr4 = v82.f33550a;
                    i7 = i6 - (b5 & 255);
                    if (i7 != 0) {
                        break;
                    }
                    i17++;
                    i16++;
                    if (i17 == i14) {
                        break;
                    }
                    if (bArr2[i15].length != i16) {
                        z5 = z4;
                    } else {
                        if (i15 == bArr2.length - 1) {
                            break;
                        }
                        i15++;
                        z5 = true;
                        i16 = -1;
                    }
                }
                if (i7 >= 0) {
                    if (i7 <= 0) {
                        int i19 = i14 - i17;
                        int length2 = bArr2[i15].length - i16;
                        int length3 = bArr2.length;
                        for (int i20 = i15 + 1; i20 < length3; i20++) {
                            length2 += bArr2[i20].length;
                        }
                        if (length2 >= i19) {
                            if (length2 <= i19) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i12, i14, UTF_8);
                            }
                        }
                    }
                    i10 = i5 + 1;
                    i8 = -1;
                }
                length = i11;
                i8 = -1;
            }
            return null;
        }

        private a() {
        }
    }

    private final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        g d4 = p.d(new m(p.k(resourceAsStream)));
        try {
            byte[] K3 = d4.K(d4.readInt());
            byte[] K4 = d4.K(d4.readInt());
            Unit unit = Unit.f41027a;
            AbstractC2420c.a(d4, null);
            synchronized (this) {
                Intrinsics.checkNotNull(K3);
                this.f20689c = K3;
                Intrinsics.checkNotNull(K4);
                this.f20690d = K4;
            }
            this.f20688b.countDown();
        } finally {
        }
    }

    @Nullable
    public final String a(@NotNull String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.checkNotNull(unicode);
        List<String> D02 = StringsKt.D0(unicode, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null);
        if (Intrinsics.areEqual(CollectionsKt.last((List) D02), "")) {
            D02 = CollectionsKt.dropLast(D02, 1);
        }
        List<String> a4 = a(D02);
        if (D02.size() == a4.size() && a4.get(0).charAt(0) != '!') {
            return null;
        }
        if (a4.get(0).charAt(0) == '!') {
            size = D02.size();
            size2 = a4.size();
        } else {
            size = D02.size();
            size2 = a4.size() + 1;
        }
        int i4 = size - size2;
        List D03 = StringsKt.D0(domain, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null);
        if (Intrinsics.areEqual(CollectionsKt.last(D03), "")) {
            D03 = CollectionsKt.dropLast(D03, 1);
        }
        return k.x(k.o(CollectionsKt.asSequence(D03), i4), ".", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x002f, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x002d, code lost:
    
        if (r4 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<String> a(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> emptyList;
        List<String> emptyList2;
        if (this.f20687a.get() || !this.f20687a.compareAndSet(false, true)) {
            try {
                this.f20688b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z4 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z4 = true;
                    } catch (IOException e4) {
                        int i4 = jh1.f27657c;
                        jh1.f27655a.getClass();
                        jh1.a(5, "Failed to read public suffix list", e4);
                    }
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
        }
        if (this.f20689c != null) {
            int size = list.size();
            byte[][] bArr = new byte[size][];
            for (int i5 = 0; i5 < size; i5++) {
                String str4 = list.get(i5);
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                byte[] bytes = str4.getBytes(UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                bArr[i5] = bytes;
            }
            int i6 = 0;
            while (true) {
                str = null;
                if (i6 >= size) {
                    str2 = null;
                    break;
                }
                byte[] bArr2 = this.f20689c;
                if (bArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                    bArr2 = null;
                }
                str2 = a.a(bArr2, bArr, i6);
                if (str2 != null) {
                    break;
                }
                i6++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i7 = 0; i7 < length; i7++) {
                    bArr3[i7] = f20683e;
                    byte[] bArr4 = this.f20689c;
                    if (bArr4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                        bArr4 = null;
                    }
                    String a4 = a.a(bArr4, bArr3, i7);
                    if (a4 != null) {
                        str3 = a4;
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i8 = size - 1;
                int i9 = 0;
                while (true) {
                    if (i9 >= i8) {
                        break;
                    }
                    byte[] bArr5 = this.f20690d;
                    if (bArr5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                        bArr5 = null;
                    }
                    String a5 = a.a(bArr5, bArr, i9);
                    if (a5 != null) {
                        str = a5;
                        break;
                    }
                    i9++;
                }
            }
            if (str != null) {
                return StringsKt.D0("!" + str, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null);
            }
            if (str2 == null && str3 == null) {
                return f20684f;
            }
            if (str2 == null || (emptyList = StringsKt.D0(str2, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            if (str3 == null || (emptyList2 = StringsKt.D0(str3, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null)) == null) {
                emptyList2 = CollectionsKt.emptyList();
            }
            return emptyList.size() > emptyList2.size() ? emptyList : emptyList2;
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
    }
}
