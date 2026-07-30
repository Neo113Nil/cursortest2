package okhttp3.internal.publicsuffix;

import a4.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.io.b;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.e;
import okio.j0;
import y5.w;

/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {a.f66n0};
    private static final List<String> PREVAILING_RULE = q.listOf("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i8) {
            int i9;
            int and;
            boolean z7;
            int and2;
            int length = bArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = (i10 + length) / 2;
                while (i11 > -1 && bArr[i11] != 10) {
                    i11--;
                }
                int i12 = i11 + 1;
                int i13 = 1;
                while (true) {
                    i9 = i12 + i13;
                    if (bArr[i9] == 10) {
                        break;
                    }
                    i13++;
                }
                int i14 = i9 - i12;
                int i15 = i8;
                boolean z8 = false;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (z8) {
                        and = 46;
                        z7 = false;
                    } else {
                        boolean z9 = z8;
                        and = Util.and(bArr2[i15][i16], 255);
                        z7 = z9;
                    }
                    and2 = and - Util.and(bArr[i12 + i17], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i17++;
                    i16++;
                    if (i17 == i14) {
                        break;
                    }
                    if (bArr2[i15].length != i16) {
                        z8 = z7;
                    } else {
                        if (i15 == bArr2.length - 1) {
                            break;
                        }
                        i15++;
                        z8 = true;
                        i16 = -1;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i18 = i14 - i17;
                        int length2 = bArr2[i15].length - i16;
                        int length3 = bArr2.length;
                        for (int i19 = i15 + 1; i19 < length3; i19++) {
                            length2 += bArr2[i19].length;
                        }
                        if (length2 >= i18) {
                            if (length2 <= i18) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                s.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i12, i14, UTF_8);
                            }
                        }
                    }
                    i10 = i9 + 1;
                }
                length = i11;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> split$default;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i8 = 0; i8 < size; i8++) {
            String str4 = list.get(i8);
            Charset UTF_8 = StandardCharsets.UTF_8;
            s.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i8] = bytes;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                str = null;
                break;
            }
            int i10 = i9 + 1;
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                s.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr2 = null;
            }
            String binarySearch = companion.binarySearch(bArr2, bArr, i9);
            if (binarySearch != null) {
                str = binarySearch;
                break;
            }
            i9 = i10;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                bArr3[i11] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    s.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                    bArr4 = null;
                }
                String binarySearch2 = companion2.binarySearch(bArr4, bArr3, i11);
                if (binarySearch2 != null) {
                    str2 = binarySearch2;
                    break;
                }
                i11 = i12;
            }
        }
        str2 = null;
        if (str2 != null) {
            int i13 = size - 1;
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                Companion companion3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    s.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                str3 = companion3.binarySearch(bArr5, bArr, i14);
                if (str3 != null) {
                    break;
                }
                i14 = i15;
            }
        }
        str3 = null;
        if (str3 != null) {
            split$default = StringsKt__StringsKt.split$default((CharSequence) s.stringPlus("!", str3), new char[]{'.'}, false, 0, 6, (Object) null);
            return split$default;
        }
        if (str == null && str2 == null) {
            return PREVAILING_RULE;
        }
        List<String> split$default2 = str == null ? null : StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (split$default2 == null) {
            split$default2 = CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> split$default3 = str2 != null ? StringsKt__StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null) : null;
        if (split$default3 == null) {
            split$default3 = CollectionsKt__CollectionsKt.emptyList();
        }
        return split$default2.size() > split$default3.size() ? split$default2 : split$default3;
    }

    private final void readTheList() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        e buffer = j0.buffer(new okio.o(j0.source(resourceAsStream)));
        try {
            byte[] readByteArray = buffer.readByteArray(buffer.readInt());
            byte[] readByteArray2 = buffer.readByteArray(buffer.readInt());
            w wVar = w.INSTANCE;
            b.closeFinally(buffer, null);
            synchronized (this) {
                s.checkNotNull(readByteArray);
                this.publicSuffixListBytes = readByteArray;
                s.checkNotNull(readByteArray2);
                this.publicSuffixExceptionListBytes = readByteArray2;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z7 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z7 = true;
                } catch (IOException e8) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e8);
                    if (z7) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> split$default;
        List<String> dropLast;
        split$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (!s.areEqual(CollectionsKt___CollectionsKt.last((List) split$default), "")) {
            return split$default;
        }
        dropLast = CollectionsKt___CollectionsKt.dropLast(split$default, 1);
        return dropLast;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        m asSequence;
        m drop;
        s.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        s.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicodeDomain);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        int i8 = size - size2;
        asSequence = CollectionsKt___CollectionsKt.asSequence(splitDomain(domain));
        drop = SequencesKt___SequencesKt.drop(asSequence, i8);
        return SequencesKt___SequencesKt.joinToString$default(drop, ".", null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        s.checkNotNullParameter(publicSuffixListBytes, "publicSuffixListBytes");
        s.checkNotNullParameter(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
