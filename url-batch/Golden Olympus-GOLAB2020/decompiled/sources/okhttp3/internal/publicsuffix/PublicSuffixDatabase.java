package okhttp3.internal.publicsuffix;

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
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.g;
import okio.m;
import okio.p;

@Metadata
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f43153e = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f43154f = {42};

    /* renamed from: g, reason: collision with root package name */
    private static final List f43155g = CollectionsKt.listOf("*");

    /* renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f43156h = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f43157a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f43158b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f43159c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f43160d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i4) {
            int i5;
            int d4;
            boolean z4;
            int d5;
            int length = bArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = (i6 + length) / 2;
                while (i7 > -1 && bArr[i7] != 10) {
                    i7--;
                }
                int i8 = i7 + 1;
                int i9 = 1;
                while (true) {
                    i5 = i8 + i9;
                    if (bArr[i5] == 10) {
                        break;
                    }
                    i9++;
                }
                int i10 = i5 - i8;
                int i11 = i4;
                boolean z5 = false;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (z5) {
                        d4 = 46;
                        z4 = false;
                    } else {
                        boolean z6 = z5;
                        d4 = Util.d(bArr2[i11][i12], KotlinVersion.MAX_COMPONENT_VALUE);
                        z4 = z6;
                    }
                    d5 = d4 - Util.d(bArr[i8 + i13], KotlinVersion.MAX_COMPONENT_VALUE);
                    if (d5 != 0) {
                        break;
                    }
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    }
                    if (bArr2[i11].length != i12) {
                        z5 = z4;
                    } else {
                        if (i11 == bArr2.length - 1) {
                            break;
                        }
                        i11++;
                        z5 = true;
                        i12 = -1;
                    }
                }
                if (d5 >= 0) {
                    if (d5 <= 0) {
                        int i14 = i10 - i13;
                        int length2 = bArr2[i11].length - i12;
                        int length3 = bArr2.length;
                        for (int i15 = i11 + 1; i15 < length3; i15++) {
                            length2 += bArr2[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i8, i10, UTF_8);
                            }
                        }
                    }
                    i6 = i5 + 1;
                }
                length = i7;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f43156h;
        }

        private Companion() {
        }
    }

    private final List b(List list) {
        String str;
        String str2;
        String str3;
        List emptyList;
        List emptyList2;
        if (this.f43157a.get() || !this.f43157a.compareAndSet(false, true)) {
            try {
                this.f43158b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f43159c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i4 = 0; i4 < size; i4++) {
            String str4 = (String) list.get(i4);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i4] = bytes;
        }
        int i5 = 0;
        while (true) {
            str = null;
            if (i5 >= size) {
                str2 = null;
                break;
            }
            Companion companion = f43153e;
            byte[] bArr2 = this.f43159c;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr2 = null;
            }
            str2 = companion.b(bArr2, bArr, i5);
            if (str2 != null) {
                break;
            }
            i5++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = f43154f;
                Companion companion2 = f43153e;
                byte[] bArr4 = this.f43159c;
                if (bArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                    bArr4 = null;
                }
                String b4 = companion2.b(bArr4, bArr3, i6);
                if (b4 != null) {
                    str3 = b4;
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i7 = size - 1;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                Companion companion3 = f43153e;
                byte[] bArr5 = this.f43160d;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String b5 = companion3.b(bArr5, bArr, i8);
                if (b5 != null) {
                    str = b5;
                    break;
                }
                i8++;
            }
        }
        if (str != null) {
            return StringsKt.D0('!' + str, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null);
        }
        if (str2 == null && str3 == null) {
            return f43155g;
        }
        if (str2 == null || (emptyList = StringsKt.D0(str2, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        if (str3 == null || (emptyList2 = StringsKt.D0(str3, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null)) == null) {
            emptyList2 = CollectionsKt.emptyList();
        }
        return emptyList.size() > emptyList2.size() ? emptyList : emptyList2;
    }

    private final void d() {
        try {
            G g4 = new G();
            G g5 = new G();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                g d4 = p.d(new m(p.k(resourceAsStream)));
                try {
                    g4.f41132b = d4.K(d4.readInt());
                    g5.f41132b = d4.K(d4.readInt());
                    Unit unit = Unit.f41027a;
                    AbstractC2420c.a(d4, null);
                    synchronized (this) {
                        Object obj = g4.f41132b;
                        Intrinsics.checkNotNull(obj);
                        this.f43159c = (byte[]) obj;
                        Object obj2 = g5.f41132b;
                        Intrinsics.checkNotNull(obj2);
                        this.f43160d = (byte[]) obj2;
                    }
                } finally {
                }
            }
        } finally {
            this.f43158b.countDown();
        }
    }

    private final void e() {
        boolean z4 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z4 = true;
                } catch (IOException e4) {
                    Platform.f43120a.g().k("Failed to read public suffix list", 5, e4);
                    if (!z4) {
                        return;
                    }
                }
            } finally {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private final List f(String str) {
        List D02 = StringsKt.D0(str, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null);
        return Intrinsics.areEqual(CollectionsKt.last(D02), "") ? CollectionsKt.dropLast(D02, 1) : D02;
    }

    public final String c(String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List f4 = f(unicodeDomain);
        List b4 = b(f4);
        if (f4.size() == b4.size() && ((String) b4.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) b4.get(0)).charAt(0) == '!') {
            size = f4.size();
            size2 = b4.size();
        } else {
            size = f4.size();
            size2 = b4.size() + 1;
        }
        return k.x(k.o(CollectionsKt.asSequence(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
