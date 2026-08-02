package kotlin.text;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public abstract class UStringsKt {
    public static final boolean access$isCaseSensitive(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static MatchResult.Destructured getDestructured(MatcherMatchResult matcherMatchResult) {
        return new MatchResult.Destructured(matcherMatchResult);
    }

    /* renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m4158toStringJSWoG40(long j) {
        return UnsignedKt.ulongToString(CharsKt__CharJVMKt.checkRadix(10), j);
    }

    /* renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m4159toStringV7xB4Y4(int i) {
        return UnsignedKt.ulongToString(CharsKt__CharJVMKt.checkRadix(16), i & BodyPartID.bodyIdMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte toUByte(String str) {
        UByte uByte;
        str.getClass();
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            int i = uIntOrNull.data;
            if (Integer.compareUnsigned(i, 255) <= 0) {
                uByte = new UByte((byte) i);
                if (uByte == null) {
                    return uByte.data;
                }
                StringsKt__StringNumberConversionsKt.numberFormatError(str);
                throw null;
            }
        }
        uByte = null;
        if (uByte == null) {
        }
    }

    public static final int toUInt(String str) {
        str.getClass();
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.data;
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw null;
    }

    public static final UInt toUIntOrNull(String str) {
        int i;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        UInt.Companion companion = UInt.Companion;
        int i3 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, i3) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, i3) > 0) {
                    return null;
                }
            }
            int i4 = i2 * 10;
            int i5 = digit + i4;
            if (Integer.compareUnsigned(i5, i4) < 0) {
                return null;
            }
            i++;
            i2 = i5;
        }
        return new UInt(i2);
    }

    public static final long toULong(String str) {
        str.getClass();
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.data;
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw null;
    }

    public static final ULong toULongOrNull(String str) {
        str.getClass();
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        ULong.Companion companion = ULong.Companion;
        long j = 0;
        long j2 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, j2) > 0) {
                if (j2 != 512409557603043100L) {
                    return null;
                }
                j2 = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, j2) > 0) {
                    return null;
                }
            }
            long j3 = j * 10;
            UInt.Companion companion2 = UInt.Companion;
            long j4 = (digit & BodyPartID.bodyIdMax) + j3;
            if (Long.compareUnsigned(j4, j3) < 0) {
                return null;
            }
            i++;
            j = j4;
        }
        return new ULong(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final short toUShort(String str) {
        UShort uShort;
        str.getClass();
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            int i = uIntOrNull.data;
            if (Integer.compareUnsigned(i, 65535) <= 0) {
                uShort = new UShort((short) i);
                if (uShort == null) {
                    return uShort.data;
                }
                StringsKt__StringNumberConversionsKt.numberFormatError(str);
                throw null;
            }
        }
        uShort = null;
        if (uShort == null) {
        }
    }
}
