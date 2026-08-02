package com.squareup.wire;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.airbnb.lottie.utils.Utils;
import com.plaid.internal.EnumC0170g;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.DurationKt;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Utf8;

/* loaded from: classes.dex */
public final class FloatProtoAdapter extends ProtoAdapter {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloatProtoAdapter(FieldEncoding fieldEncoding, KClass kClass, String str, Syntax syntax, Object obj, int i, int i2) {
        super(fieldEncoding, kClass, str, syntax, obj, i);
        this.$r8$classId = i2;
    }

    public static int getSameSignNanos(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - Utils.SECOND_IN_NANOS;
    }

    public static long getSameSignSeconds(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader32 protoReader32) {
        Object decode;
        long j = 0;
        int i = 0;
        int i2 = 0;
        Object obj = null;
        switch (this.$r8$classId) {
            case 0:
                protoReader32.getClass();
                return Float.valueOf(Float.intBitsToFloat(((ByteArrayProtoReader32) protoReader32).readFixed32()));
            case 1:
                protoReader32.getClass();
                return Double.valueOf(Double.longBitsToDouble(((ByteArrayProtoReader32) protoReader32).readFixed64()));
            case 2:
                protoReader32.getClass();
                return Boolean.valueOf(((ByteArrayProtoReader32) protoReader32).readVarint32() != 0);
            case 3:
                protoReader32.getClass();
                ByteArrayProtoReader32 byteArrayProtoReader32 = (ByteArrayProtoReader32) protoReader32;
                int beforeLengthDelimitedScalar = byteArrayProtoReader32.beforeLengthDelimitedScalar();
                int i3 = byteArrayProtoReader32.pos;
                int i4 = i3 + beforeLengthDelimitedScalar;
                if (i4 > byteArrayProtoReader32.limit) {
                    Path$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                ByteString.Companion companion = ByteString.Companion;
                byte[] bArr = (byte[]) byteArrayProtoReader32.source;
                bArr.getClass();
                DurationKt.checkOffsetAndCount(bArr.length, i3, beforeLengthDelimitedScalar);
                ByteString byteString = new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i3, i4));
                byteArrayProtoReader32.pos = i4;
                return byteString;
            case 4:
                protoReader32.getClass();
                ByteArrayProtoReader32 byteArrayProtoReader322 = (ByteArrayProtoReader32) protoReader32;
                int beginMessage = byteArrayProtoReader322.beginMessage();
                while (true) {
                    int nextTag = byteArrayProtoReader322.nextTag();
                    if (nextTag == -1) {
                        byteArrayProtoReader322.endMessageAndGetUnknownFields(beginMessage);
                        Duration ofSeconds = Duration.ofSeconds(j, i2);
                        ofSeconds.getClass();
                        return ofSeconds;
                    }
                    if (nextTag == 1) {
                        j = ((Number) ProtoAdapter.INT64.decode(byteArrayProtoReader322)).longValue();
                    } else if (nextTag != 2) {
                        byteArrayProtoReader322.readUnknownField(nextTag);
                    } else {
                        i2 = ((Number) ProtoAdapter.INT32.decode(byteArrayProtoReader322)).intValue();
                    }
                }
            case 5:
                protoReader32.getClass();
                ByteArrayProtoReader32 byteArrayProtoReader323 = (ByteArrayProtoReader32) protoReader32;
                int beginMessage2 = byteArrayProtoReader323.beginMessage();
                while (true) {
                    int nextTag2 = byteArrayProtoReader323.nextTag();
                    if (nextTag2 == -1) {
                        byteArrayProtoReader323.endMessageAndGetUnknownFields(beginMessage2);
                        return Unit.INSTANCE;
                    }
                    byteArrayProtoReader323.readUnknownField(nextTag2);
                }
            case 6:
                protoReader32.getClass();
                return Integer.valueOf(((ByteArrayProtoReader32) protoReader32).readFixed32());
            case 7:
                protoReader32.getClass();
                return Long.valueOf(((ByteArrayProtoReader32) protoReader32).readFixed64());
            case 8:
                protoReader32.getClass();
                ByteArrayProtoReader32 byteArrayProtoReader324 = (ByteArrayProtoReader32) protoReader32;
                int beginMessage3 = byteArrayProtoReader324.beginMessage();
                while (true) {
                    int nextTag3 = byteArrayProtoReader324.nextTag();
                    if (nextTag3 == -1) {
                        byteArrayProtoReader324.endMessageAndGetUnknownFields(beginMessage3);
                        Instant ofEpochSecond = Instant.ofEpochSecond(j, i);
                        ofEpochSecond.getClass();
                        return ofEpochSecond;
                    }
                    if (nextTag3 == 1) {
                        j = ((Number) ProtoAdapter.INT64.decode(byteArrayProtoReader324)).longValue();
                    } else if (nextTag3 != 2) {
                        byteArrayProtoReader324.readUnknownField(nextTag3);
                    } else {
                        i = ((Number) ProtoAdapter.INT32.decode(byteArrayProtoReader324)).intValue();
                    }
                }
            case 9:
                protoReader32.getClass();
                return Integer.valueOf(((ByteArrayProtoReader32) protoReader32).readVarint32());
            case 10:
                protoReader32.getClass();
                return Long.valueOf(((ByteArrayProtoReader32) protoReader32).readVarint64());
            case 11:
                protoReader32.getClass();
                int readVarint32 = ((ByteArrayProtoReader32) protoReader32).readVarint32();
                return Integer.valueOf((-(readVarint32 & 1)) ^ (readVarint32 >>> 1));
            case 12:
                protoReader32.getClass();
                long readVarint64 = ((ByteArrayProtoReader32) protoReader32).readVarint64();
                return Long.valueOf((-(readVarint64 & 1)) ^ (readVarint64 >>> 1));
            case 13:
                protoReader32.getClass();
                ByteArrayProtoReader32 byteArrayProtoReader325 = (ByteArrayProtoReader32) protoReader32;
                int beforeLengthDelimitedScalar2 = byteArrayProtoReader325.beforeLengthDelimitedScalar();
                int i5 = byteArrayProtoReader325.pos;
                int i6 = beforeLengthDelimitedScalar2 + i5;
                if (i6 > byteArrayProtoReader325.limit) {
                    Path$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                String decodeToString$default = StringsKt__StringsJVMKt.decodeToString$default(i5, i6, 4, (byte[]) byteArrayProtoReader325.source);
                byteArrayProtoReader325.pos = i6;
                return decodeToString$default;
            case 14:
                protoReader32.getClass();
                ArrayList arrayList = new ArrayList();
                ByteArrayProtoReader32 byteArrayProtoReader326 = (ByteArrayProtoReader32) protoReader32;
                int beginMessage4 = byteArrayProtoReader326.beginMessage();
                while (true) {
                    int nextTag4 = byteArrayProtoReader326.nextTag();
                    if (nextTag4 == -1) {
                        byteArrayProtoReader326.endMessageAndGetUnknownFields(beginMessage4);
                        return arrayList;
                    }
                    if (nextTag4 != 1) {
                        byteArrayProtoReader326.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(byteArrayProtoReader326));
                    }
                }
            case 15:
                protoReader32.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ByteArrayProtoReader32 byteArrayProtoReader327 = (ByteArrayProtoReader32) protoReader32;
                int beginMessage5 = byteArrayProtoReader327.beginMessage();
                while (true) {
                    int nextTag5 = byteArrayProtoReader327.nextTag();
                    if (nextTag5 == -1) {
                        byteArrayProtoReader327.endMessageAndGetUnknownFields(beginMessage5);
                        return linkedHashMap;
                    }
                    if (nextTag5 != 1) {
                        byteArrayProtoReader327.skip();
                    } else {
                        int beginMessage6 = byteArrayProtoReader327.beginMessage();
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag6 = byteArrayProtoReader327.nextTag();
                            if (nextTag6 == -1) {
                                byteArrayProtoReader327.endMessageAndGetUnknownFields(beginMessage6);
                                if (obj2 != null) {
                                    linkedHashMap.put(obj2, obj3);
                                }
                            } else if (nextTag6 == 1) {
                                obj2 = ProtoAdapter.STRING.decode(byteArrayProtoReader327);
                            } else if (nextTag6 != 2) {
                                byteArrayProtoReader327.readUnknownField(nextTag6);
                            } else {
                                obj3 = ProtoAdapter.STRUCT_VALUE.decode(byteArrayProtoReader327);
                            }
                        }
                    }
                }
            case 16:
                protoReader32.getClass();
                int readVarint322 = ((ByteArrayProtoReader32) protoReader32).readVarint32();
                if (readVarint322 != 0) {
                    a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readVarint322, "expected 0 but was "));
                }
                return null;
            case 17:
                protoReader32.getClass();
                ByteArrayProtoReader32 byteArrayProtoReader328 = (ByteArrayProtoReader32) protoReader32;
                int beginMessage7 = byteArrayProtoReader328.beginMessage();
                while (true) {
                    int nextTag7 = byteArrayProtoReader328.nextTag();
                    if (nextTag7 == -1) {
                        byteArrayProtoReader328.endMessageAndGetUnknownFields(beginMessage7);
                        return obj;
                    }
                    switch (nextTag7) {
                        case 1:
                            decode = ProtoAdapter.STRUCT_NULL.decode(byteArrayProtoReader328);
                            break;
                        case 2:
                            decode = ProtoAdapter.DOUBLE.decode(byteArrayProtoReader328);
                            break;
                        case 3:
                            decode = ProtoAdapter.STRING.decode(byteArrayProtoReader328);
                            break;
                        case 4:
                            decode = ProtoAdapter.BOOL.decode(byteArrayProtoReader328);
                            break;
                        case 5:
                            decode = ProtoAdapter.STRUCT_MAP.decode(byteArrayProtoReader328);
                            break;
                        case 6:
                            decode = ProtoAdapter.STRUCT_LIST.decode(byteArrayProtoReader328);
                            break;
                        default:
                            byteArrayProtoReader328.skip();
                            continue;
                    }
                    obj = decode;
                }
            case 18:
                protoReader32.getClass();
                return Integer.valueOf(((ByteArrayProtoReader32) protoReader32).readVarint32());
            default:
                protoReader32.getClass();
                return Long.valueOf(((ByteArrayProtoReader32) protoReader32).readVarint64());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeFixed32(Float.floatToIntBits(floatValue));
                break;
            case 1:
                double doubleValue = ((Number) obj).doubleValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeFixed64(Double.doubleToLongBits(doubleValue));
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeVarint32(booleanValue ? 1 : 0);
                break;
            case 3:
                ByteString byteString = (ByteString) obj;
                reverseProtoWriter.getClass();
                byteString.getClass();
                reverseProtoWriter.writeBytes(byteString);
                break;
            case 4:
                Duration duration = (Duration) obj;
                reverseProtoWriter.getClass();
                duration.getClass();
                int sameSignNanos = getSameSignNanos(duration);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, Integer.valueOf(sameSignNanos));
                }
                long sameSignSeconds = getSameSignSeconds(duration);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, Long.valueOf(sameSignSeconds));
                    break;
                }
                break;
            case 5:
                reverseProtoWriter.getClass();
                ((Unit) obj).getClass();
                break;
            case 6:
                int intValue = ((Number) obj).intValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeFixed32(intValue);
                break;
            case 7:
                long longValue = ((Number) obj).longValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeFixed64(longValue);
                break;
            case 8:
                Instant instant = (Instant) obj;
                reverseProtoWriter.getClass();
                instant.getClass();
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (-62135596800L > epochSecond || epochSecond >= 253402300800L) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m(epochSecond, "Timestamp seconds (", ") must be in range [-62135596800, 253402300799]"));
                    break;
                } else if (nano < 0 || nano >= 1000000000) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(nano, "Timestamp nanos (", ") must be in range [0, 999999999]"));
                    break;
                } else {
                    if (nano != 0) {
                        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, Integer.valueOf(nano));
                    }
                    if (epochSecond != 0) {
                        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, Long.valueOf(epochSecond));
                        break;
                    }
                }
                break;
            case 9:
                int intValue2 = ((Number) obj).intValue();
                reverseProtoWriter.getClass();
                if (intValue2 >= 0) {
                    reverseProtoWriter.writeVarint32(intValue2);
                    break;
                } else {
                    reverseProtoWriter.writeVarint64(intValue2);
                    break;
                }
            case 10:
                long longValue2 = ((Number) obj).longValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeVarint64(longValue2);
                break;
            case 11:
                int intValue3 = ((Number) obj).intValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeVarint32((intValue3 >> 31) ^ (intValue3 << 1));
                break;
            case 12:
                long longValue3 = ((Number) obj).longValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeVarint64((longValue3 >> 63) ^ (longValue3 << 1));
                break;
            case 13:
                String str = (String) obj;
                reverseProtoWriter.getClass();
                str.getClass();
                int length = str.length() - 1;
                while (length >= 0) {
                    int i = length - 1;
                    char charAt = str.charAt(length);
                    if (charAt < 128) {
                        reverseProtoWriter.require(1);
                        int i2 = reverseProtoWriter.arrayLimit;
                        byte[] bArr = reverseProtoWriter.f1419array;
                        int i3 = i2 - 1;
                        bArr[i3] = (byte) charAt;
                        int max = Math.max(-1, i - i3);
                        int i4 = i3;
                        length = i;
                        while (length > max) {
                            char charAt2 = str.charAt(length);
                            if (charAt2 < 128) {
                                length--;
                                i4--;
                                bArr[i4] = (byte) charAt2;
                            } else {
                                reverseProtoWriter.arrayLimit = i4;
                            }
                        }
                        reverseProtoWriter.arrayLimit = i4;
                    } else {
                        if (charAt < 2048) {
                            reverseProtoWriter.require(2);
                            byte[] bArr2 = reverseProtoWriter.f1419array;
                            int i5 = reverseProtoWriter.arrayLimit;
                            int i6 = i5 - 1;
                            reverseProtoWriter.arrayLimit = i6;
                            bArr2[i6] = (byte) (128 | (charAt & '?'));
                            int i7 = i5 - 2;
                            reverseProtoWriter.arrayLimit = i7;
                            bArr2[i7] = (byte) ((charAt >> 6) | 192);
                        } else if (charAt < 55296 || charAt > 57343) {
                            reverseProtoWriter.require(3);
                            byte[] bArr3 = reverseProtoWriter.f1419array;
                            int i8 = reverseProtoWriter.arrayLimit;
                            int i9 = i8 - 1;
                            reverseProtoWriter.arrayLimit = i9;
                            bArr3[i9] = (byte) ((charAt & '?') | 128);
                            int i10 = i8 - 2;
                            reverseProtoWriter.arrayLimit = i10;
                            bArr3[i10] = (byte) (128 | ((charAt >> 6) & 63));
                            int i11 = i8 - 3;
                            reverseProtoWriter.arrayLimit = i11;
                            bArr3[i11] = (byte) ((charAt >> '\f') | 224);
                        } else {
                            char charAt3 = i >= 0 ? str.charAt(i) : (char) 65535;
                            if (charAt3 > 56319 || 56320 > charAt || charAt >= 57344) {
                                reverseProtoWriter.require(1);
                                byte[] bArr4 = reverseProtoWriter.f1419array;
                                int i12 = reverseProtoWriter.arrayLimit - 1;
                                reverseProtoWriter.arrayLimit = i12;
                                bArr4[i12] = 63;
                            } else {
                                length -= 2;
                                int i13 = (((charAt3 & 1023) << 10) | (charAt & 1023)) + 65536;
                                reverseProtoWriter.require(4);
                                byte[] bArr5 = reverseProtoWriter.f1419array;
                                int i14 = reverseProtoWriter.arrayLimit;
                                int i15 = i14 - 1;
                                reverseProtoWriter.arrayLimit = i15;
                                bArr5[i15] = (byte) ((i13 & 63) | 128);
                                int i16 = i14 - 2;
                                reverseProtoWriter.arrayLimit = i16;
                                bArr5[i16] = (byte) (((i13 >> 6) & 63) | 128);
                                int i17 = i14 - 3;
                                reverseProtoWriter.arrayLimit = i17;
                                bArr5[i17] = (byte) (128 | ((i13 >> 12) & 63));
                                int i18 = i14 - 4;
                                reverseProtoWriter.arrayLimit = i18;
                                bArr5[i18] = (byte) ((i13 >> 18) | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            }
                        }
                        length = i;
                    }
                }
                break;
            case 14:
                List list = (List) obj;
                reverseProtoWriter.getClass();
                if (list != null) {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        ProtoAdapter.STRUCT_VALUE.encodeWithTag(reverseProtoWriter, 1, list.get(size));
                    }
                    break;
                }
                break;
            case 15:
                Map map = (Map) obj;
                reverseProtoWriter.getClass();
                if (map != null) {
                    Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
                    ArraysKt___ArraysKt.reverse(entryArr);
                    for (Map.Entry entry : entryArr) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        int byteCount = reverseProtoWriter.getByteCount();
                        ProtoAdapter.STRUCT_VALUE.encodeWithTag(reverseProtoWriter, 2, value);
                        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str2);
                        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
                        reverseProtoWriter.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    }
                    break;
                }
                break;
            case 16:
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeVarint32(0);
                break;
            case 17:
                reverseProtoWriter.getClass();
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(reverseProtoWriter, 1, obj);
                    break;
                } else if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, Double.valueOf(((Number) obj).doubleValue()));
                    break;
                } else if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, obj);
                    break;
                } else if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, obj);
                    break;
                } else if (obj instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 5, (Map) obj);
                    break;
                } else if (obj instanceof List) {
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(reverseProtoWriter, 6, obj);
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("unexpected struct value: ", obj));
                    break;
                }
            case 18:
                int intValue4 = ((Number) obj).intValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeVarint32(intValue4);
                break;
            default:
                long longValue4 = ((Number) obj).longValue();
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeVarint64(longValue4);
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        switch (this.$r8$classId) {
            case 16:
                protoWriter.getClass();
                FieldEncoding fieldEncoding$wire_runtime = getFieldEncoding$wire_runtime();
                fieldEncoding$wire_runtime.getClass();
                protoWriter.writeVarint32(fieldEncoding$wire_runtime.value | (i << 3));
                protoWriter.writeVarint32(0);
                break;
            case 17:
                protoWriter.getClass();
                if (obj != null) {
                    super.encodeWithTag(protoWriter, i, obj);
                    break;
                } else {
                    FieldEncoding fieldEncoding$wire_runtime2 = getFieldEncoding$wire_runtime();
                    fieldEncoding$wire_runtime2.getClass();
                    protoWriter.writeVarint32((i << 3) | fieldEncoding$wire_runtime2.value);
                    protoWriter.writeVarint32(encodedSize(obj));
                    encode(protoWriter, obj);
                    break;
                }
            default:
                super.encodeWithTag(protoWriter, i, obj);
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Number) obj).floatValue();
                return 4;
            case 1:
                ((Number) obj).doubleValue();
                return 8;
            case 2:
                ((Boolean) obj).getClass();
                return 1;
            case 3:
                ByteString byteString = (ByteString) obj;
                byteString.getClass();
                return byteString.getSize$okio();
            case 4:
                Duration duration = (Duration) obj;
                duration.getClass();
                long sameSignSeconds = getSameSignSeconds(duration);
                r9 = sameSignSeconds != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(sameSignSeconds)) : 0;
                int sameSignNanos = getSameSignNanos(duration);
                return sameSignNanos != 0 ? r9 + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(sameSignNanos)) : r9;
            case 5:
                ((Unit) obj).getClass();
                return 0;
            case 6:
                ((Number) obj).intValue();
                return 4;
            case 7:
                ((Number) obj).longValue();
                return 8;
            case 8:
                Instant instant = (Instant) obj;
                instant.getClass();
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (-62135596800L > epochSecond || epochSecond >= 253402300800L) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m(epochSecond, "Timestamp seconds (", ") must be in range [-62135596800, 253402300799]"));
                    return 0;
                }
                if (nano < 0 || nano >= 1000000000) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(nano, "Timestamp nanos (", ") must be in range [0, 999999999]"));
                    return 0;
                }
                r9 = epochSecond != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                return nano != 0 ? r9 + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) : r9;
            case 9:
                int intValue = ((Number) obj).intValue();
                if (intValue < 0) {
                    return 10;
                }
                if ((intValue & (-128)) == 0) {
                    return 1;
                }
                if ((intValue & (-16384)) == 0) {
                    return 2;
                }
                if ((intValue & (-2097152)) == 0) {
                    return 3;
                }
                return (intValue & (-268435456)) == 0 ? 4 : 5;
            case 10:
                return Countries.varint64Size$wire_runtime(((Number) obj).longValue());
            case 11:
                int intValue2 = ((Number) obj).intValue();
                int i = (intValue2 >> 31) ^ (intValue2 << 1);
                if ((i & (-128)) == 0) {
                    return 1;
                }
                if ((i & (-16384)) == 0) {
                    return 2;
                }
                if ((i & (-2097152)) == 0) {
                    return 3;
                }
                return (i & (-268435456)) == 0 ? 4 : 5;
            case 12:
                long longValue = ((Number) obj).longValue();
                return Countries.varint64Size$wire_runtime((longValue >> 63) ^ (longValue << 1));
            case 13:
                String str = (String) obj;
                str.getClass();
                return (int) Utf8.size$default(str);
            case 14:
                List list = (List) obj;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r9 += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                    }
                }
                return r9;
            case 15:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        int encodedSizeWithTag = ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, entry.getValue()) + ProtoAdapter.STRING.encodedSizeWithTag(1, (String) entry.getKey());
                        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
                        r9 += Countries.varint32Size$wire_runtime(encodedSizeWithTag) + Countries.varint32Size$wire_runtime(8) + encodedSizeWithTag;
                    }
                }
                return r9;
            case 16:
                return 1;
            case 17:
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, obj);
                }
                if (obj instanceof Number) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, obj);
                }
                if (obj instanceof Boolean) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, obj);
                }
                if (obj instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, obj);
                }
                a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("unexpected struct value: ", obj));
                return 0;
            case 18:
                int intValue3 = ((Number) obj).intValue();
                if ((intValue3 & (-128)) == 0) {
                    return 1;
                }
                if ((intValue3 & (-16384)) == 0) {
                    return 2;
                }
                if ((intValue3 & (-2097152)) == 0) {
                    return 3;
                }
                return (intValue3 & (-268435456)) == 0 ? 4 : 5;
            default:
                return Countries.varint64Size$wire_runtime(((Number) obj).longValue());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, Object obj) {
        switch (this.$r8$classId) {
            case 16:
                FieldEncoding fieldEncoding = FieldEncoding.VARINT;
                break;
            case 17:
                if (obj != null) {
                    break;
                } else {
                    int encodedSize = encodedSize(obj);
                    FieldEncoding fieldEncoding2 = FieldEncoding.VARINT;
                    break;
                }
        }
        return super.encodedSizeWithTag(i, obj);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArrayList arrayList = null;
        LinkedHashMap linkedHashMap = null;
        switch (this.$r8$classId) {
            case 0:
                ((Number) obj).floatValue();
                throw new UnsupportedOperationException();
            case 1:
                ((Number) obj).doubleValue();
                throw new UnsupportedOperationException();
            case 2:
                ((Boolean) obj).booleanValue();
                throw new UnsupportedOperationException();
            case 3:
                ((ByteString) obj).getClass();
                throw new UnsupportedOperationException();
            case 4:
                Duration duration = (Duration) obj;
                duration.getClass();
                return duration;
            case 5:
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ((Number) obj).intValue();
                throw new UnsupportedOperationException();
            case 7:
                ((Number) obj).longValue();
                throw new UnsupportedOperationException();
            case 8:
                Instant instant = (Instant) obj;
                instant.getClass();
                return instant;
            case 9:
                ((Number) obj).intValue();
                throw new UnsupportedOperationException();
            case 10:
                ((Number) obj).longValue();
                throw new UnsupportedOperationException();
            case 11:
                ((Number) obj).intValue();
                throw new UnsupportedOperationException();
            case 12:
                ((Number) obj).longValue();
                throw new UnsupportedOperationException();
            case 13:
                ((String) obj).getClass();
                throw new UnsupportedOperationException();
            case 14:
                List list = (List) obj;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
                    }
                }
                return arrayList;
            case 15:
                Map map = (Map) obj;
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                    }
                }
                return linkedHashMap;
            case 16:
                return null;
            case 17:
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.redact(obj);
                }
                if (obj instanceof Number) {
                    return obj;
                }
                if (!(obj instanceof String)) {
                    if (obj instanceof Boolean) {
                        return obj;
                    }
                    if (obj instanceof Map) {
                        return ProtoAdapter.STRUCT_MAP.redact((Map) obj);
                    }
                    if (obj instanceof List) {
                        return ProtoAdapter.STRUCT_LIST.redact(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("unexpected struct value: ", obj));
                }
                return null;
            case 18:
                ((Number) obj).intValue();
                throw new UnsupportedOperationException();
            default:
                ((Number) obj).longValue();
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Object obj) {
        switch (this.$r8$classId) {
            case 16:
                reverseProtoWriter.getClass();
                reverseProtoWriter.writeVarint32(0);
                reverseProtoWriter.writeTag(i, getFieldEncoding$wire_runtime());
                break;
            case 17:
                reverseProtoWriter.getClass();
                if (obj == null) {
                    int byteCount = reverseProtoWriter.getByteCount();
                    encode(reverseProtoWriter, obj);
                    reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
                    reverseProtoWriter.writeTag(i, getFieldEncoding$wire_runtime());
                    break;
                } else {
                    super.encodeWithTag(reverseProtoWriter, i, obj);
                    break;
                }
            default:
                super.encodeWithTag(reverseProtoWriter, i, obj);
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object decode;
        long j = 0;
        int i = 0;
        int i2 = 0;
        Object obj = null;
        switch (this.$r8$classId) {
            case 0:
                protoReader.getClass();
                return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
            case 1:
                protoReader.getClass();
                return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
            case 2:
                protoReader.getClass();
                return Boolean.valueOf(protoReader.readVarint32() != 0);
            case 3:
                protoReader.getClass();
                return protoReader.readBytes();
            case 4:
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        Duration ofSeconds = Duration.ofSeconds(j, i2);
                        ofSeconds.getClass();
                        return ofSeconds;
                    }
                    if (nextTag == 1) {
                        j = ((Number) ProtoAdapter.INT64.decode(protoReader)).longValue();
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        i2 = ((Number) ProtoAdapter.INT32.decode(protoReader)).intValue();
                    }
                }
            case 5:
                protoReader.getClass();
                long beginMessage2 = protoReader.beginMessage();
                while (true) {
                    int nextTag2 = protoReader.nextTag();
                    if (nextTag2 != -1) {
                        protoReader.readUnknownField(nextTag2);
                    } else {
                        protoReader.endMessageAndGetUnknownFields(beginMessage2);
                        return Unit.INSTANCE;
                    }
                }
            case 6:
                protoReader.getClass();
                return Integer.valueOf(protoReader.readFixed32());
            case 7:
                protoReader.getClass();
                return Long.valueOf(protoReader.readFixed64());
            case 8:
                protoReader.getClass();
                long beginMessage3 = protoReader.beginMessage();
                while (true) {
                    int nextTag3 = protoReader.nextTag();
                    if (nextTag3 == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage3);
                        Instant ofEpochSecond = Instant.ofEpochSecond(j, i);
                        ofEpochSecond.getClass();
                        return ofEpochSecond;
                    }
                    if (nextTag3 == 1) {
                        j = ((Number) ProtoAdapter.INT64.decode(protoReader)).longValue();
                    } else if (nextTag3 != 2) {
                        protoReader.readUnknownField(nextTag3);
                    } else {
                        i = ((Number) ProtoAdapter.INT32.decode(protoReader)).intValue();
                    }
                }
            case 9:
                protoReader.getClass();
                return Integer.valueOf(protoReader.readVarint32());
            case 10:
                protoReader.getClass();
                return Long.valueOf(protoReader.readVarint64());
            case 11:
                protoReader.getClass();
                int readVarint32 = protoReader.readVarint32();
                return Integer.valueOf((-(readVarint32 & 1)) ^ (readVarint32 >>> 1));
            case 12:
                protoReader.getClass();
                long readVarint64 = protoReader.readVarint64();
                return Long.valueOf((-(readVarint64 & 1)) ^ (readVarint64 >>> 1));
            case 13:
                protoReader.getClass();
                return protoReader.readString();
            case 14:
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage4 = protoReader.beginMessage();
                while (true) {
                    int nextTag4 = protoReader.nextTag();
                    if (nextTag4 == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage4);
                        return m;
                    }
                    if (nextTag4 != 1) {
                        protoReader.skip();
                    } else {
                        m.add(ProtoAdapter.STRUCT_VALUE.decode(protoReader));
                    }
                }
            case 15:
                LinkedHashMap m2 = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage5 = protoReader.beginMessage();
                while (true) {
                    int nextTag5 = protoReader.nextTag();
                    if (nextTag5 == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage5);
                        return m2;
                    }
                    if (nextTag5 != 1) {
                        protoReader.skip();
                    } else {
                        long beginMessage6 = protoReader.beginMessage();
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag6 = protoReader.nextTag();
                            if (nextTag6 == -1) {
                                protoReader.endMessageAndGetUnknownFields(beginMessage6);
                                if (obj2 != null) {
                                    m2.put(obj2, obj3);
                                }
                            } else if (nextTag6 == 1) {
                                obj2 = ProtoAdapter.STRING.decode(protoReader);
                            } else if (nextTag6 != 2) {
                                protoReader.readUnknownField(nextTag6);
                            } else {
                                obj3 = ProtoAdapter.STRUCT_VALUE.decode(protoReader);
                            }
                        }
                    }
                }
            case 16:
                protoReader.getClass();
                int readVarint322 = protoReader.readVarint32();
                if (readVarint322 != 0) {
                    a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readVarint322, "expected 0 but was "));
                }
                return null;
            case 17:
                protoReader.getClass();
                long beginMessage7 = protoReader.beginMessage();
                while (true) {
                    int nextTag7 = protoReader.nextTag();
                    if (nextTag7 != -1) {
                        switch (nextTag7) {
                            case 1:
                                decode = ProtoAdapter.STRUCT_NULL.decode(protoReader);
                                break;
                            case 2:
                                decode = ProtoAdapter.DOUBLE.decode(protoReader);
                                break;
                            case 3:
                                decode = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                decode = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                decode = ProtoAdapter.STRUCT_MAP.decode(protoReader);
                                break;
                            case 6:
                                decode = ProtoAdapter.STRUCT_LIST.decode(protoReader);
                                break;
                            default:
                                protoReader.skip();
                                continue;
                        }
                        obj = decode;
                    } else {
                        protoReader.endMessageAndGetUnknownFields(beginMessage7);
                        return obj;
                    }
                }
            case 18:
                protoReader.getClass();
                return Integer.valueOf(protoReader.readVarint32());
            default:
                protoReader.getClass();
                return Long.valueOf(protoReader.readVarint64());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                protoWriter.sink.writeIntLe(Float.floatToIntBits(((Number) obj).floatValue()));
                break;
            case 1:
                protoWriter.sink.writeLongLe(Double.doubleToLongBits(((Number) obj).doubleValue()));
                break;
            case 2:
                protoWriter.writeVarint32(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 3:
                ByteString byteString = (ByteString) obj;
                byteString.getClass();
                protoWriter.sink.write(byteString);
                break;
            case 4:
                Duration duration = (Duration) obj;
                duration.getClass();
                long sameSignSeconds = getSameSignSeconds(duration);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, Long.valueOf(sameSignSeconds));
                }
                int sameSignNanos = getSameSignNanos(duration);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, Integer.valueOf(sameSignNanos));
                    break;
                }
                break;
            case 5:
                ((Unit) obj).getClass();
                break;
            case 6:
                protoWriter.sink.writeIntLe(((Number) obj).intValue());
                break;
            case 7:
                protoWriter.sink.writeLongLe(((Number) obj).longValue());
                break;
            case 8:
                Instant instant = (Instant) obj;
                instant.getClass();
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (-62135596800L > epochSecond || epochSecond >= 253402300800L) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m(epochSecond, "Timestamp seconds (", ") must be in range [-62135596800, 253402300799]"));
                    break;
                } else if (nano < 0 || nano >= 1000000000) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(nano, "Timestamp nanos (", ") must be in range [0, 999999999]"));
                    break;
                } else {
                    if (epochSecond != 0) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, Long.valueOf(epochSecond));
                    }
                    if (nano != 0) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, Integer.valueOf(nano));
                        break;
                    }
                }
                break;
            case 9:
                int intValue = ((Number) obj).intValue();
                if (intValue >= 0) {
                    protoWriter.writeVarint32(intValue);
                    break;
                } else {
                    protoWriter.writeVarint64(intValue);
                    break;
                }
            case 10:
                protoWriter.writeVarint64(((Number) obj).longValue());
                break;
            case 11:
                int intValue2 = ((Number) obj).intValue();
                protoWriter.writeVarint32((intValue2 >> 31) ^ (intValue2 << 1));
                break;
            case 12:
                long longValue = ((Number) obj).longValue();
                protoWriter.writeVarint64((longValue >> 63) ^ (longValue << 1));
                break;
            case 13:
                String str = (String) obj;
                str.getClass();
                protoWriter.sink.writeUtf8(str);
                break;
            case 14:
                List list = (List) obj;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ProtoAdapter.STRUCT_VALUE.encodeWithTag(protoWriter, 1, it.next());
                    }
                    break;
                }
                break;
            case 15:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, str2);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
                        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value) + encodedSizeWithTag;
                        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
                        protoWriter.writeVarint32(10);
                        protoWriter.writeVarint32(encodedSizeWithTag2);
                        protoAdapter.encodeWithTag(protoWriter, 1, str2);
                        protoAdapter2.encodeWithTag(protoWriter, 2, value);
                    }
                    break;
                }
                break;
            case 16:
                protoWriter.writeVarint32(0);
                break;
            case 17:
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(protoWriter, 1, obj);
                    break;
                } else if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, Double.valueOf(((Number) obj).doubleValue()));
                    break;
                } else if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, obj);
                    break;
                } else if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, obj);
                    break;
                } else if (obj instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 5, (Map) obj);
                    break;
                } else if (obj instanceof List) {
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(protoWriter, 6, obj);
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("unexpected struct value: ", obj));
                    break;
                }
            case 18:
                protoWriter.writeVarint32(((Number) obj).intValue());
                break;
            default:
                protoWriter.writeVarint64(((Number) obj).longValue());
                break;
        }
    }
}
