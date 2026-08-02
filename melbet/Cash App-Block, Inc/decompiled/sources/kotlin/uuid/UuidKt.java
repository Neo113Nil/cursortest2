package kotlin.uuid;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource;
import com.google.mlkit.vision.text.internal.zzn;
import com.google.mlkit.vision.text.internal.zzo;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import com.miteksystems.misnap.workflow.util.TextUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.Executor;
import kotlin.text.HexExtensionsKt;

/* loaded from: classes4.dex */
public abstract class UuidKt {
    public static final String access$truncateForErrorMessage(String str) {
        return str.length() <= 64 ? str : str.substring(0, 64).concat("...");
    }

    public static final void formatBytesInto(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = HexExtensionsKt.BYTE_TO_LOWER_CASE_HEX_DIGITS[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static zzn getClient(TextRecognizerOptions textRecognizerOptions) {
        zzo zzoVar = (zzo) MlKitContext.getInstance().get(zzo.class);
        TextRecognizerTaskWithResource textRecognizerTaskWithResource = (TextRecognizerTaskWithResource) zzoVar.zza.get(textRecognizerOptions);
        ExecutorSelector executorSelector = zzoVar.zzb;
        textRecognizerOptions.getClass();
        return new zzn(textRecognizerTaskWithResource, (Executor) executorSelector.zza.get(), TextUtil.zzb(textRecognizerOptions.getLoggingLibraryName()), textRecognizerOptions);
    }

    public static final BigDecimal movement(boolean z, long j, long j2) {
        if (j2 == 0) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            return bigDecimal;
        }
        BigDecimal divide = BigDecimal.valueOf(j - j2).multiply(BigDecimal.valueOf(100L)).divide(BigDecimal.valueOf(j2), 2, RoundingMode.HALF_UP);
        if (z) {
            divide.stripTrailingZeros();
        }
        divide.getClass();
        return divide;
    }

    public static final Uuid uuidParseHex(String str) {
        int i = 0;
        long j = 0;
        while (true) {
            if (i >= 16) {
                long j2 = 0;
                for (int i2 = 16; i2 < 32; i2++) {
                    long j3 = j2 << 4;
                    char charAt = str.charAt(i2);
                    if ((charAt >>> '\b') == 0) {
                        long j4 = HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL[charAt];
                        if (j4 >= 0) {
                            j2 = j3 | j4;
                        }
                    }
                    uuidThrowUnexpectedCharacterException(i2, str, "a hexadecimal digit");
                    throw null;
                }
                return (j == 0 && j2 == 0) ? Uuid.NIL : new Uuid(j, j2);
            }
            long j5 = j << 4;
            char charAt2 = str.charAt(i);
            if ((charAt2 >>> '\b') != 0) {
                break;
            }
            long j6 = HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL[charAt2];
            if (j6 < 0) {
                break;
            }
            j = j5 | j6;
            i++;
        }
        uuidThrowUnexpectedCharacterException(i, str, "a hexadecimal digit");
        throw null;
    }

    public static final Uuid uuidParseHexDash(String str) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            long j2 = j << 4;
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0) {
                long j3 = HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL[charAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                }
            }
            uuidThrowUnexpectedCharacterException(i, str, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(8) != '-') {
            uuidThrowUnexpectedCharacterException(8, str, "'-' (hyphen)");
            throw null;
        }
        long j4 = 0;
        for (int i2 = 9; i2 < 13; i2++) {
            long j5 = j4 << 4;
            char charAt2 = str.charAt(i2);
            if ((charAt2 >>> '\b') == 0) {
                long j6 = HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL[charAt2];
                if (j6 >= 0) {
                    j4 = j5 | j6;
                }
            }
            uuidThrowUnexpectedCharacterException(i2, str, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(13) != '-') {
            uuidThrowUnexpectedCharacterException(13, str, "'-' (hyphen)");
            throw null;
        }
        long j7 = 0;
        for (int i3 = 14; i3 < 18; i3++) {
            long j8 = j7 << 4;
            char charAt3 = str.charAt(i3);
            if ((charAt3 >>> '\b') == 0) {
                long j9 = HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL[charAt3];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                }
            }
            uuidThrowUnexpectedCharacterException(i3, str, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(18) != '-') {
            uuidThrowUnexpectedCharacterException(18, str, "'-' (hyphen)");
            throw null;
        }
        long j10 = 0;
        for (int i4 = 19; i4 < 23; i4++) {
            long j11 = j10 << 4;
            char charAt4 = str.charAt(i4);
            if ((charAt4 >>> '\b') == 0) {
                long j12 = HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL[charAt4];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                }
            }
            uuidThrowUnexpectedCharacterException(i4, str, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(23) != '-') {
            uuidThrowUnexpectedCharacterException(23, str, "'-' (hyphen)");
            throw null;
        }
        long j13 = 0;
        for (int i5 = 24; i5 < 36; i5++) {
            long j14 = j13 << 4;
            char charAt5 = str.charAt(i5);
            if ((charAt5 >>> '\b') == 0) {
                long j15 = HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL[charAt5];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                }
            }
            uuidThrowUnexpectedCharacterException(i5, str, "a hexadecimal digit");
            throw null;
        }
        long j16 = (j << 32) | (j4 << 16) | j7;
        long j17 = (j10 << 48) | j13;
        return (j16 == 0 && j17 == 0) ? Uuid.NIL : new Uuid(j16, j17);
    }

    public static final void uuidThrowUnexpectedCharacterException(int i, String str, String str2) {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Expected ", i, str2, " at index ", ", but was '");
        m.append(str.charAt(i));
        m.append('\'');
        throw new IllegalArgumentException(m.toString());
    }
}
