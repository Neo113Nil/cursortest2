package okio;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.room.Room;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.FirebaseMessaging;
import com.squareup.cash.mri.android.SafeSignalCollector$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.gcm.RealFirebaseGcm$getFirebaseToken$1;
import com.squareup.cash.ui.gcm.RealFirebaseGcm$unInstallFirebase$1;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.DurationKt;
import okio.internal._ZlibJvmKt;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public class ByteString implements Serializable, Comparable {
    public static final Companion Companion = new Companion();
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    public final byte[] data;
    public transient int hashCode;
    public transient String utf8;

    public ByteString(byte[] bArr) {
        bArr.getClass();
        this.data = bArr;
    }

    public static int indexOf$default(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        return byteString.indexOf(0, byteString2.internalArray$okio());
    }

    public static int lastIndexOf$default(ByteString byteString, ByteString byteString2) {
        int size$okio = byteString.getSize$okio();
        byteString.getClass();
        byteString2.getClass();
        return byteString.lastIndexOf(size$okio, byteString2.internalArray$okio());
    }

    public static ByteString substring$default(ByteString byteString, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = byteString.getSize$okio();
        }
        return byteString.substring(i, i2);
    }

    public String base64() {
        return Base64.encodeBase64(this.data, Base64.BASE64);
    }

    public String base64Url() {
        return Base64.encodeBase64(this.data, Base64.BASE64_URL_SAFE);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ByteString byteString) {
        byteString.getClass();
        int size$okio = getSize$okio();
        int size$okio2 = byteString.getSize$okio();
        int min = Math.min(size$okio, size$okio2);
        for (int i = 0; i < min; i++) {
            int internalGet$okio = internalGet$okio(i) & 255;
            int internalGet$okio2 = byteString.internalGet$okio(i) & 255;
            if (internalGet$okio != internalGet$okio2) {
                return internalGet$okio < internalGet$okio2 ? -1 : 1;
            }
        }
        if (size$okio == size$okio2) {
            return 0;
        }
        return size$okio < size$okio2 ? -1 : 1;
    }

    public void copyInto(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        ArraysKt___ArraysJvmKt.copyInto(i2, this.data, i, bArr, i3 + i);
    }

    public ByteString digest$okio(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, getSize$okio());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new ByteString(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size$okio = byteString.getSize$okio();
            byte[] bArr = this.data;
            if (size$okio == bArr.length && byteString.rangeEquals(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int getSize$okio() {
        return this.data.length;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.hashCode = hashCode;
        return hashCode;
    }

    public String hex() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = _ZlibJvmKt.HEX_DIGIT_CHARS;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int indexOf(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.data;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!DurationKt.arrayRangeEquals(max, bArr2, 0, bArr, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public byte[] internalArray$okio() {
        return this.data;
    }

    public byte internalGet$okio(int i) {
        return this.data[i];
    }

    public int lastIndexOf(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.data;
        for (int min = Math.min(i, bArr2.length - bArr.length); -1 < min; min--) {
            if (DurationKt.arrayRangeEquals(min, bArr2, 0, bArr, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.data;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && DurationKt.arrayRangeEquals(i, bArr2, i2, bArr, i3);
    }

    public String string(Charset charset) {
        charset.getClass();
        return new String(this.data, charset);
    }

    public ByteString substring(int i, int i2) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.data;
        if (i2 > bArr.length) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3("endIndex < beginIndex");
        return null;
    }

    public ByteString toAsciiLowercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + PnmConstants.PNM_SEPARATOR);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + PnmConstants.PNM_SEPARATOR);
                    }
                }
                return new ByteString(copyOf);
            }
            i++;
        }
    }

    public byte[] toByteArray() {
        byte[] bArr = this.data;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b;
        int i;
        ByteString byteString = this;
        byte[] bArr = byteString.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String utf8 = byteString.utf8();
            String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(utf8.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= utf8.length()) {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(']', "[text=", replace$default);
            }
            return "[size=" + bArr.length + " text=" + replace$default + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (64 != bArr.length) {
            byteString = new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 0, 64));
        }
        sb.append(byteString.hex());
        sb.append("…]");
        return sb.toString();
    }

    public final String utf8() {
        String str = this.utf8;
        if (str != null) {
            return str;
        }
        byte[] internalArray$okio = internalArray$okio();
        internalArray$okio.getClass();
        String str2 = new String(internalArray$okio, Charsets.UTF_8);
        this.utf8 = str2;
        return str2;
    }

    public void write$okio(Buffer buffer, int i) {
        buffer.write(this.data, 0, i);
    }

    public boolean rangeEquals(int i, int i2, ByteString byteString) {
        byteString.getClass();
        return byteString.rangeEquals(0, i, i2, this.data);
    }

    public final class Companion {
        /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
        
            r6 = null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ByteString decodeBase64(String str) {
            int i;
            char charAt;
            str.getClass();
            byte[] bArr = Base64.BASE64;
            int length = str.length();
            while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                length--;
            }
            int i2 = (int) ((length * 6) / 8);
            byte[] bArr2 = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i3 < length) {
                    char charAt2 = str.charAt(i3);
                    if ('A' <= charAt2 && charAt2 < '[') {
                        i = charAt2 - 'A';
                    } else if ('a' <= charAt2 && charAt2 < '{') {
                        i = charAt2 - 'G';
                    } else if ('0' <= charAt2 && charAt2 < ':') {
                        i = charAt2 + 4;
                    } else if (charAt2 == '+' || charAt2 == '-') {
                        i = 62;
                    } else if (charAt2 == '/' || charAt2 == '_') {
                        i = 63;
                    } else {
                        if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                            break;
                        }
                        i3++;
                    }
                    i5 = (i5 << 6) | i;
                    i4++;
                    if (i4 % 4 == 0) {
                        bArr2[i6] = (byte) (i5 >> 16);
                        int i7 = i6 + 2;
                        bArr2[i6 + 1] = (byte) (i5 >> 8);
                        i6 += 3;
                        bArr2[i7] = (byte) i5;
                    }
                    i3++;
                } else {
                    int i8 = i4 % 4;
                    if (i8 != 1) {
                        if (i8 == 2) {
                            bArr2[i6] = (byte) ((i5 << 12) >> 16);
                            i6++;
                        } else if (i8 == 3) {
                            int i9 = i5 << 6;
                            int i10 = i6 + 1;
                            bArr2[i6] = (byte) (i9 >> 16);
                            i6 += 2;
                            bArr2[i10] = (byte) (i9 >> 8);
                        }
                        if (i6 != i2) {
                            bArr2 = Arrays.copyOf(bArr2, i6);
                        }
                    }
                }
            }
            if (bArr2 != null) {
                return new ByteString(bArr2);
            }
            return null;
        }

        public static ByteString decodeHex(String str) {
            str.getClass();
            if (str.length() % 2 != 0) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) "Unexpected hex string: ".concat(str));
                return null;
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (_ZlibJvmKt.access$decodeHexDigit(str.charAt(i2 + 1)) + (_ZlibJvmKt.access$decodeHexDigit(str.charAt(i2)) << 4));
            }
            return new ByteString(bArr);
        }

        public static ByteString encodeUtf8(String str) {
            str.getClass();
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            ByteString byteString = new ByteString(bytes);
            byteString.utf8 = str;
            return byteString;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PlayIntegrityAttestation.IntegrityErrorCode m4340fromValue(int i) {
            if (i == 100) {
                return PlayIntegrityAttestation.IntegrityErrorCode.INTEGRITY_ERROR_CODE_INTERNAL_ERROR;
            }
            switch (i) {
                case 0:
                    return PlayIntegrityAttestation.IntegrityErrorCode.NO_ERROR;
                case 1:
                    return PlayIntegrityAttestation.IntegrityErrorCode.API_NOT_AVAILABLE;
                case 2:
                    return PlayIntegrityAttestation.IntegrityErrorCode.PLAY_STORE_NOT_FOUND;
                case 3:
                    return PlayIntegrityAttestation.IntegrityErrorCode.INTEGRITY_ERROR_CODE_NETWORK_ERROR;
                case 4:
                    return PlayIntegrityAttestation.IntegrityErrorCode.PLAY_STORE_ACCOUNT_NOT_FOUND;
                case 5:
                    return PlayIntegrityAttestation.IntegrityErrorCode.APP_NOT_INSTALLED;
                case 6:
                    return PlayIntegrityAttestation.IntegrityErrorCode.PLAY_SERVICES_NOT_FOUND;
                case 7:
                    return PlayIntegrityAttestation.IntegrityErrorCode.APP_UID_MISMATCH;
                case 8:
                    return PlayIntegrityAttestation.IntegrityErrorCode.TOO_MANY_REQUESTS;
                case 9:
                    return PlayIntegrityAttestation.IntegrityErrorCode.CANNOT_BIND_TO_SERVICE;
                case 10:
                    return PlayIntegrityAttestation.IntegrityErrorCode.NONCE_TOO_SHORT;
                case 11:
                    return PlayIntegrityAttestation.IntegrityErrorCode.NONCE_TOO_LONG;
                case 12:
                    return PlayIntegrityAttestation.IntegrityErrorCode.GOOGLE_SERVER_UNAVAILABLE;
                case 13:
                    return PlayIntegrityAttestation.IntegrityErrorCode.NONCE_IS_NOT_BASE64;
                case 14:
                    return PlayIntegrityAttestation.IntegrityErrorCode.PLAY_STORE_VERSION_OUTDATED;
                case 15:
                    return PlayIntegrityAttestation.IntegrityErrorCode.PLAY_SERVICES_VERSION_OUTDATED;
                case 16:
                    return PlayIntegrityAttestation.IntegrityErrorCode.CLOUD_PROJECT_NUMBER_IS_INVALID;
                case 17:
                    return PlayIntegrityAttestation.IntegrityErrorCode.CLIENT_TRANSIENT_ERROR;
                default:
                    return null;
            }
        }

        public static ByteString of$default(byte[] bArr) {
            int length = bArr.length;
            bArr.getClass();
            DurationKt.checkOffsetAndCount(bArr.length, 0L, length);
            return new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 0, length));
        }

        public void Content(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(889235624);
            int i2 = 6;
            if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
                composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new MoleculeKt$$ExternalSyntheticLambda2(this, composableLambdaImpl, i, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object getFirebaseToken(ContinuationImpl continuationImpl) {
            RealFirebaseGcm$getFirebaseToken$1 realFirebaseGcm$getFirebaseToken$1;
            int i;
            try {
                if (continuationImpl instanceof RealFirebaseGcm$getFirebaseToken$1) {
                    realFirebaseGcm$getFirebaseToken$1 = (RealFirebaseGcm$getFirebaseToken$1) continuationImpl;
                    int i2 = realFirebaseGcm$getFirebaseToken$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        realFirebaseGcm$getFirebaseToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = realFirebaseGcm$getFirebaseToken$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realFirebaseGcm$getFirebaseToken$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            Task<String> token = FirebaseMessaging.getInstance().getToken();
                            token.getClass();
                            realFirebaseGcm$getFirebaseToken$1.label = 1;
                            obj = Okio.awaitImpl(token, null, realFirebaseGcm$getFirebaseToken$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return (String) obj;
                    }
                }
                if (i != 0) {
                }
                return (String) obj;
            } catch (IOException e) {
                Timber.Forest.w("Error attempting to get Firebase instance token.", new Object[0], e);
                return null;
            } catch (InterruptedException e2) {
                Timber.Forest.w("Error attempting to get Firebase instance token.", new Object[0], e2);
                return null;
            } catch (SecurityException unused) {
                Timber.Forest.w("Push notifications have been disabled by a rooted device.", new Object[0]);
                return null;
            } catch (ExecutionException e3) {
                Timber.Forest.w("Error attempting to get Firebase instance token.", new Object[0], e3);
                return null;
            }
            realFirebaseGcm$getFirebaseToken$1 = new RealFirebaseGcm$getFirebaseToken$1(this, continuationImpl);
            Object obj2 = realFirebaseGcm$getFirebaseToken$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realFirebaseGcm$getFirebaseToken$1.label;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(1:19))(3:23|24|(2:26|22))|20))|29|6|7|(0)(0)|20) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        
            if (okio.Okio.awaitImpl(r7, null, r0) != r8) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x002c, code lost:
        
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        
            timber.log.Timber.Forest.e("Couldn't delete FCM token", new java.lang.Object[0], r7);
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object unInstallFirebase(ContinuationImpl continuationImpl) {
            RealFirebaseGcm$unInstallFirebase$1 realFirebaseGcm$unInstallFirebase$1;
            int i;
            if (continuationImpl instanceof RealFirebaseGcm$unInstallFirebase$1) {
                realFirebaseGcm$unInstallFirebase$1 = (RealFirebaseGcm$unInstallFirebase$1) continuationImpl;
                int i2 = realFirebaseGcm$unInstallFirebase$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realFirebaseGcm$unInstallFirebase$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realFirebaseGcm$unInstallFirebase$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realFirebaseGcm$unInstallFirebase$1.label;
                    int i3 = 2;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(FirebaseApp.getInstance());
                        zzw call = Room.call(firebaseInstallations.backgroundExecutor, new SafeSignalCollector$$ExternalSyntheticLambda0(firebaseInstallations, i3));
                        realFirebaseGcm$unInstallFirebase$1.label = 1;
                        if (Okio.awaitImpl(call, null, realFirebaseGcm$unInstallFirebase$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            Timber.Forest.d("FCM token deleted", new Object[0]);
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    Task<Void> deleteToken = FirebaseMessaging.getInstance().deleteToken();
                    deleteToken.getClass();
                    realFirebaseGcm$unInstallFirebase$1.label = 2;
                }
            }
            realFirebaseGcm$unInstallFirebase$1 = new RealFirebaseGcm$unInstallFirebase$1(this, continuationImpl);
            Object obj2 = realFirebaseGcm$unInstallFirebase$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realFirebaseGcm$unInstallFirebase$1.label;
            int i32 = 2;
            if (i != 0) {
            }
            Task<Void> deleteToken2 = FirebaseMessaging.getInstance().deleteToken();
            deleteToken2.getClass();
            realFirebaseGcm$unInstallFirebase$1.label = 2;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static SyncBusinessGrant.ActionType m4341fromValue(int i) {
            switch (i) {
                case 0:
                    return SyncBusinessGrant.ActionType.DO_NOT_USE_ACTION_TYPE;
                case 1:
                    return SyncBusinessGrant.ActionType.ONE_TIME_PAYMENT;
                case 2:
                    return SyncBusinessGrant.ActionType.ON_FILE_PAYMENT;
                case 3:
                    return SyncBusinessGrant.ActionType.UNLINKED_REFUND;
                case 4:
                    return SyncBusinessGrant.ActionType.LINK_ACCOUNT;
                case 5:
                    return SyncBusinessGrant.ActionType.RECURRING_DEPOSITS;
                case 6:
                    return SyncBusinessGrant.ActionType.ON_FILE_DEPOSIT;
                case 7:
                    return SyncBusinessGrant.ActionType.LINK_ACCOUNT_TIDAL;
                case 8:
                    return SyncBusinessGrant.ActionType.ON_FILE_PAYOUT;
                default:
                    return null;
            }
        }

        public static GetInlineMessageResponse.LimitsHubInlineMessage.Icon fromValue(int i) {
            if (i == 0) {
                return GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ICON_UNSPECIFIED;
            }
            if (i == 1) {
                return GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ICON_VERIFYING;
            }
            if (i == 2) {
                return GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ICON_DECREASE;
            }
            if (i == 3) {
                return GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ICON_FAILED;
            }
            if (i == 4) {
                return GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ICON_ALERT;
            }
            if (i != 5) {
                return null;
            }
            return GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ICON_REPORTED;
        }
    }
}
