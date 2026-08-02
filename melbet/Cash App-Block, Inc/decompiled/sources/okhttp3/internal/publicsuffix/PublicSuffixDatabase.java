package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.idrnd.face.iad.capture.Plane;
import okio.ByteString;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public final class PublicSuffixDatabase {
    public static final List PREVAILING_RULE;
    public static final ByteString WILDCARD_LABEL;
    public static final PublicSuffixDatabase instance;
    public final AssetPublicSuffixList publicSuffixList;

    static {
        ByteString.Companion companion = ByteString.Companion;
        WILDCARD_LABEL = new ByteString(Arrays.copyOf(new byte[]{42}, 1));
        PREVAILING_RULE = CollectionsKt__CollectionsJVMKt.listOf(Marker.ANY_MARKER);
        instance = new PublicSuffixDatabase(new AssetPublicSuffixList());
    }

    public PublicSuffixDatabase(AssetPublicSuffixList assetPublicSuffixList) {
        this.publicSuffixList = assetPublicSuffixList;
    }

    public static List splitDomain(String str) {
        List split$default = StringsKt.split$default(str, new char[]{'.'}, 6);
        return Intrinsics.areEqual(CollectionsKt.last(split$default), "") ? CollectionsKt.dropLast(1, split$default) : split$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r1 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r5 = (okio.ByteString[]) r2.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r10 >= r9) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r5[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL;
        r11 = (okio.ByteString) r12.bytes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r11 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r11 = net.idrnd.face.iad.capture.Plane.access$binarySearch(r11, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r11 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        r1 = r1 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r5 >= r1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        r6 = (okio.ByteString) r12.exceptionBytes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r6 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r6 = net.idrnd.face.iad.capture.Plane.access$binarySearch(r6, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (r6 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        r12 = kotlin.text.StringsKt.split$default("!".concat(r6), new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011d, code lost:
    
        if (r0.size() != r12.size()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0129, code lost:
    
        if (((java.lang.String) r12.get(0)).charAt(0) == '!') goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0136, code lost:
    
        if (((java.lang.String) r12.get(0)).charAt(0) != '!') goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        r0 = r0.size();
        r12 = r12.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0162, code lost:
    
        return kotlin.sequences.SequencesKt___SequencesKt.joinToString$default(kotlin.sequences.SequencesKt___SequencesKt.drop(kotlin.collections.CollectionsKt.asSequence(splitDomain(r13)), r0 - r12), ".", 62);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        r0 = r0.size();
        r12 = r12.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        if (r11 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
    
        r12 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ec, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ee, code lost:
    
        r2 = kotlin.text.StringsKt.split$default(r8, new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f6, code lost:
    
        if (r2 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fa, code lost:
    
        if (r11 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fc, code lost:
    
        r12 = kotlin.text.StringsKt.split$default(r11, new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0104, code lost:
    
        if (r12 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
    
        if (r2.size() <= r12.size()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0112, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0106, code lost:
    
        r12 = kotlin.collections.EmptyList.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
    
        r2 = kotlin.collections.EmptyList.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ca, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d0, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00af, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00b3, code lost:
    
        r11 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getEffectiveTldPlusOne(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List splitDomain = splitDomain(unicode);
        AssetPublicSuffixList assetPublicSuffixList = this.publicSuffixList;
        AtomicBoolean atomicBoolean = (AtomicBoolean) assetPublicSuffixList.listRead;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) assetPublicSuffixList.readCompleteLatch).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        assetPublicSuffixList.readTheList();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        assetPublicSuffixList.readFailure = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((ByteString) assetPublicSuffixList.bytes) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(assetPublicSuffixList.path);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) assetPublicSuffixList.readFailure);
            throw illegalStateException;
        }
        int size = splitDomain.size();
        ByteString[] byteStringArr = new ByteString[size];
        for (int i = 0; i < size; i++) {
            ByteString.Companion companion = ByteString.Companion;
            byteStringArr[i] = ByteString.Companion.encodeUtf8((String) splitDomain.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str2 = null;
                break;
            }
            ByteString byteString = (ByteString) assetPublicSuffixList.bytes;
            if (byteString == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bytes");
                throw null;
            }
            str2 = Plane.access$binarySearch(byteString, byteStringArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
    }
}
