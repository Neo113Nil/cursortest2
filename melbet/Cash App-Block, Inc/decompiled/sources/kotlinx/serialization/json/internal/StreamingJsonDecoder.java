package kotlinx.serialization.json.internal;

import androidx.recyclerview.widget.AdapterHelper;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.internal.fido.zzfz;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind$ENUM;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.ElementMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
import operations.array.Map$evaluateLogic$1;

/* loaded from: classes9.dex */
public final class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder {
    public final JsonConfiguration configuration;
    public int currentIndex;
    public Obfuscator discriminatorHolder;
    public final JsonElementMarker elementMarker;
    public final Json json;
    public final AdapterHelper lexer;
    public final WriteMode mode;
    public final SerializersModule serializersModule;

    public StreamingJsonDecoder(Json json, WriteMode writeMode, AdapterHelper adapterHelper, SerialDescriptor serialDescriptor, Obfuscator obfuscator) {
        serialDescriptor.getClass();
        this.json = json;
        this.mode = writeMode;
        this.lexer = adapterHelper;
        this.serializersModule = json.serializersModule;
        this.currentIndex = -1;
        this.discriminatorHolder = obfuscator;
        JsonConfiguration jsonConfiguration = json.configuration;
        this.configuration = jsonConfiguration;
        this.elementMarker = jsonConfiguration.explicitNulls ? null : new JsonElementMarker(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder beginStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        Json json = this.json;
        WriteMode switchMode = WriteModeKt.switchMode(serialDescriptor, json);
        AdapterHelper adapterHelper = this.lexer;
        zzv zzvVar = (zzv) adapterHelper.mPendingUpdates;
        zzvVar.getClass();
        int i = zzvVar.zze + 1;
        zzvVar.zze = i;
        if (i == ((Object[]) zzvVar.zzc).length) {
            zzvVar.resize();
        }
        ((Object[]) zzvVar.zzc)[i] = serialDescriptor;
        adapterHelper.consumeNextToken(switchMode.begin);
        if (adapterHelper.peekNextToken() != 4) {
            int ordinal = switchMode.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new StreamingJsonDecoder(json, switchMode, adapterHelper, serialDescriptor, this.discriminatorHolder) : (this.mode == switchMode && json.configuration.explicitNulls) ? this : new StreamingJsonDecoder(json, switchMode, adapterHelper, serialDescriptor, this.discriminatorHolder);
        }
        AdapterHelper.fail$default(adapterHelper, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        boolean z;
        boolean z2;
        AdapterHelper adapterHelper = this.lexer;
        int skipWhitespaces = adapterHelper.skipWhitespaces();
        String str = (String) adapterHelper.mOpReorderer;
        if (skipWhitespaces == str.length()) {
            AdapterHelper.fail$default(adapterHelper, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(skipWhitespaces) == '\"') {
            skipWhitespaces++;
            z = true;
        } else {
            z = false;
        }
        int prefetchOrEof = adapterHelper.prefetchOrEof(skipWhitespaces);
        if (prefetchOrEof >= str.length() || prefetchOrEof == -1) {
            AdapterHelper.fail$default(adapterHelper, "EOF", 0, null, 6);
            throw null;
        }
        int i = prefetchOrEof + 1;
        int charAt = str.charAt(prefetchOrEof) | ' ';
        if (charAt == 102) {
            adapterHelper.consumeBooleanLiteral(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                AdapterHelper.fail$default(adapterHelper, "Expected valid boolean literal prefix, but had '" + adapterHelper.consumeStringLenient() + '\'', 0, null, 6);
                throw null;
            }
            adapterHelper.consumeBooleanLiteral(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (adapterHelper.mExistingUpdateTypes == str.length()) {
            AdapterHelper.fail$default(adapterHelper, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(adapterHelper.mExistingUpdateTypes) == '\"') {
            adapterHelper.mExistingUpdateTypes++;
            return z2;
        }
        AdapterHelper.fail$default(adapterHelper, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        AdapterHelper adapterHelper = this.lexer;
        long consumeNumericLiteral = adapterHelper.consumeNumericLiteral();
        byte b = (byte) consumeNumericLiteral;
        if (consumeNumericLiteral == b) {
            return b;
        }
        AdapterHelper.fail$default(adapterHelper, "Failed to parse byte for input '" + consumeNumericLiteral + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        AdapterHelper adapterHelper = this.lexer;
        String consumeStringLenient = adapterHelper.consumeStringLenient();
        if (consumeStringLenient.length() == 1) {
            return consumeStringLenient.charAt(0);
        }
        AdapterHelper.fail$default(adapterHelper, JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Expected single char, but got '", consumeStringLenient), 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        AdapterHelper adapterHelper = this.lexer;
        String consumeStringLenient = adapterHelper.consumeStringLenient();
        try {
            double parseDouble = Double.parseDouble(consumeStringLenient);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            AdapterHelper.fail$default(adapterHelper, WriteModeKt.nonFiniteFpMessage(null, Double.valueOf(parseDouble)), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AdapterHelper.fail$default(adapterHelper, JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Failed to parse type 'double' for input '", consumeStringLenient), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0124, code lost:
    
        r0 = r15.origin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0128, code lost:
    
        if (r11 >= 64) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x012a, code lost:
    
        r0.lowerMarks |= 1 << r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0133, code lost:
    
        r1 = (r11 >>> 6) - 1;
        r0 = r0.highMarksArray;
        r0[r1] = r0[r1] | (1 << (r11 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0161, code lost:
    
        r0 = r3.zze;
        r1 = (int[]) r3.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016a, code lost:
    
        if (r1[r0] != (-2)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
    
        r1[r0] = r19;
        r3.zze = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0172, code lost:
    
        r0 = r3.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0176, code lost:
    
        if (r0 == r19) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0178, code lost:
    
        r3.zze = r0 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
    
        r2.fail(kotlin.text.StringsKt.lastIndexOf$default(((java.lang.String) r2.mOpReorderer).subSequence(0, r2.mExistingUpdateTypes).toString(), r7, 0, 6), defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Encountered an unknown key '", r7), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019d, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.CompositeDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int decodeElementIndex(SerialDescriptor serialDescriptor) {
        byte b;
        byte b2;
        char c;
        String peekString;
        AdapterHelper adapterHelper = this.lexer;
        zzv zzvVar = (zzv) adapterHelper.mPendingUpdates;
        serialDescriptor.getClass();
        WriteMode writeMode = this.mode;
        int ordinal = writeMode.ordinal();
        char c2 = ':';
        int i = 0;
        r9 = false;
        boolean z = false;
        boolean z2 = true;
        int i2 = -1;
        if (ordinal == 0) {
            boolean tryConsumeComma = adapterHelper.tryConsumeComma();
            while (true) {
                boolean canConsumeValue = adapterHelper.canConsumeValue();
                JsonElementMarker jsonElementMarker = this.elementMarker;
                if (canConsumeValue) {
                    JsonConfiguration jsonConfiguration = this.configuration;
                    boolean z3 = jsonConfiguration.isLenient;
                    String consumeStringLenientNotNull = z3 ? adapterHelper.consumeStringLenientNotNull() : adapterHelper.consumeKeyString();
                    adapterHelper.consumeNextToken(c2);
                    Json json = this.json;
                    int i3 = i2;
                    i2 = WriteModeKt.getJsonNameIndex(serialDescriptor, json, consumeStringLenientNotNull);
                    if (i2 == -3) {
                        b = z2;
                        tryConsumeComma = false;
                    } else {
                        if (!jsonConfiguration.coerceInputValues) {
                            break;
                        }
                        boolean isElementOptional = serialDescriptor.isElementOptional(i2);
                        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i2);
                        if (!isElementOptional || elementDescriptor.isNullable() || !adapterHelper.tryConsumeNull(z2)) {
                            b = z2;
                            if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind$ENUM.INSTANCE) || ((elementDescriptor.isNullable() && adapterHelper.tryConsumeNull(false)) || (peekString = adapterHelper.peekString(z3)) == null)) {
                                break;
                            }
                            int jsonNameIndex = WriteModeKt.getJsonNameIndex(elementDescriptor, json, peekString);
                            byte b3 = (json.configuration.explicitNulls || !elementDescriptor.isNullable()) ? (byte) 0 : b;
                            if (jsonNameIndex != -3 || (!isElementOptional && b3 == 0)) {
                                break;
                            }
                            adapterHelper.consumeString();
                        } else {
                            b = z2;
                        }
                        tryConsumeComma = adapterHelper.tryConsumeComma();
                        z2 = false;
                    }
                    if (z2) {
                        if (!WriteModeKt.ignoreUnknownKeys(serialDescriptor, json)) {
                            Obfuscator obfuscator = this.discriminatorHolder;
                            if (obfuscator == null || !Intrinsics.areEqual(obfuscator.salt, consumeStringLenientNotNull)) {
                                break;
                            }
                            obfuscator.salt = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte peekNextToken = adapterHelper.peekNextToken();
                        if (peekNextToken == 8 || peekNextToken == 6) {
                            while (true) {
                                byte peekNextToken2 = adapterHelper.peekNextToken();
                                b2 = b;
                                if (peekNextToken2 != b2) {
                                    c = 6;
                                    if (peekNextToken2 == 8 || peekNextToken2 == 6) {
                                        arrayList.add(Byte.valueOf(peekNextToken2));
                                    } else if (peekNextToken2 == 9) {
                                        if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                                            AdapterHelper.fail$default(adapterHelper, "found ] instead of }", 0, null, 6);
                                            throw null;
                                        }
                                        CollectionsKt__MutableCollectionsKt.removeLast(arrayList);
                                    } else if (peekNextToken2 == 7) {
                                        if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                                            AdapterHelper.fail$default(adapterHelper, "found } instead of ]", 0, null, 6);
                                            throw null;
                                        }
                                        CollectionsKt__MutableCollectionsKt.removeLast(arrayList);
                                    } else if (peekNextToken2 == 10) {
                                        AdapterHelper.fail$default(adapterHelper, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    adapterHelper.consumeNextToken();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z3) {
                                    adapterHelper.consumeStringLenient();
                                } else {
                                    adapterHelper.consumeKeyString();
                                }
                                b = b2;
                            }
                        } else {
                            adapterHelper.consumeStringLenient();
                            b2 = b;
                            c = 6;
                        }
                        tryConsumeComma = adapterHelper.tryConsumeComma();
                        z2 = b2;
                        i2 = i3;
                        c2 = ':';
                    } else {
                        i2 = i3;
                        z2 = b;
                        c2 = ':';
                    }
                } else {
                    int i4 = i2;
                    if (tryConsumeComma) {
                        WriteModeKt.invalidTrailingComma(adapterHelper, "object");
                        throw null;
                    }
                    if (jsonElementMarker != null) {
                        ElementMarker elementMarker = jsonElementMarker.origin;
                        Map$evaluateLogic$1 map$evaluateLogic$1 = elementMarker.readIfAbsent;
                        SerialDescriptor serialDescriptor2 = elementMarker.descriptor;
                        int elementsCount = serialDescriptor2.getElementsCount();
                        while (true) {
                            long j = elementMarker.lowerMarks;
                            if (j != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                elementMarker.lowerMarks |= 1 << numberOfTrailingZeros;
                                if (((Boolean) map$evaluateLogic$1.invoke(serialDescriptor2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i2 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (elementsCount > 64) {
                                long[] jArr = elementMarker.highMarksArray;
                                int length = jArr.length;
                                loop3: while (i < length) {
                                    int i5 = i + 1;
                                    int i6 = i5 * 64;
                                    long j2 = jArr[i];
                                    while (j2 != -1) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                                        j2 |= 1 << numberOfTrailingZeros2;
                                        int i7 = numberOfTrailingZeros2 + i6;
                                        if (((Boolean) map$evaluateLogic$1.invoke(serialDescriptor2, Integer.valueOf(i7))).booleanValue()) {
                                            jArr[i] = j2;
                                            i2 = i7;
                                            break loop3;
                                        }
                                    }
                                    jArr[i] = j2;
                                    i = i5;
                                }
                            }
                        }
                    }
                    i2 = i4;
                }
            }
        } else if (ordinal != 2) {
            boolean tryConsumeComma2 = adapterHelper.tryConsumeComma();
            if (adapterHelper.canConsumeValue()) {
                int i8 = this.currentIndex;
                if (i8 != -1 && !tryConsumeComma2) {
                    AdapterHelper.fail$default(adapterHelper, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i8 + 1;
                this.currentIndex = i2;
            } else if (tryConsumeComma2) {
                WriteModeKt.invalidTrailingComma(adapterHelper, "array");
                throw null;
            }
        } else {
            int i9 = this.currentIndex;
            Object[] objArr = i9 % 2 != 0;
            if (objArr != true) {
                adapterHelper.consumeNextToken(':');
            } else if (i9 != -1) {
                z = adapterHelper.tryConsumeComma();
            }
            if (adapterHelper.canConsumeValue()) {
                if (objArr != false) {
                    int i10 = this.currentIndex;
                    int i11 = adapterHelper.mExistingUpdateTypes;
                    if (i10 == -1) {
                        if (z) {
                            AdapterHelper.fail$default(adapterHelper, "Unexpected leading comma", i11, null, 4);
                            throw null;
                        }
                    } else if (!z) {
                        AdapterHelper.fail$default(adapterHelper, "Expected comma after the key-value pair", i11, null, 4);
                        throw null;
                    }
                }
                i2 = this.currentIndex + 1;
                this.currentIndex = i2;
            } else if (z) {
                WriteModeKt.invalidTrailingComma(adapterHelper, "object");
                throw null;
            }
        }
        if (writeMode != WriteMode.MAP) {
            ((int[]) zzvVar.zzd)[zzvVar.zze] = i2;
        }
        return i2;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return WriteModeKt.getJsonNameIndexOrThrow(serialDescriptor, this.json, decodeString(), " at path ".concat(((zzv) this.lexer.mPendingUpdates).getPath()));
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        AdapterHelper adapterHelper = this.lexer;
        String consumeStringLenient = adapterHelper.consumeStringLenient();
        try {
            float parseFloat = Float.parseFloat(consumeStringLenient);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            AdapterHelper.fail$default(adapterHelper, WriteModeKt.nonFiniteFpMessage(null, Float.valueOf(parseFloat)), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AdapterHelper.fail$default(adapterHelper, JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Failed to parse type 'float' for input '", consumeStringLenient), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final Decoder decodeInline(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return StreamingJsonEncoderKt.isUnsignedNumber(serialDescriptor) ? new JsonDecoderForUnsignedTypes(this.lexer, this.json) : this;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        AdapterHelper adapterHelper = this.lexer;
        long consumeNumericLiteral = adapterHelper.consumeNumericLiteral();
        int i = (int) consumeNumericLiteral;
        if (consumeNumericLiteral == i) {
            return i;
        }
        AdapterHelper.fail$default(adapterHelper, "Failed to parse int for input '" + consumeNumericLiteral + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final JsonElement decodeJsonElement() {
        JsonConfiguration jsonConfiguration = this.json.configuration;
        zzfz zzfzVar = new zzfz();
        zzfzVar.zza = this.lexer;
        zzfzVar.zzc = jsonConfiguration.isLenient;
        return zzfzVar.read();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean decodeNotNullMark() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return ((jsonElementMarker != null ? jsonElementMarker.isUnmarkedNull : false) || this.lexer.tryConsumeNull(true)) ? false : true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final Object decodeSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        zzv zzvVar = (zzv) this.lexer.mPendingUpdates;
        serialDescriptor.getClass();
        kSerializer.getClass();
        boolean z = this.mode == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) zzvVar.zzd;
            int i2 = zzvVar.zze;
            if (iArr[i2] == -2) {
                ((Object[]) zzvVar.zzc)[i2] = JsonPath$Tombstone.INSTANCE;
            }
        }
        Object decodeSerializableValue$1 = decodeSerializableValue$1(kSerializer);
        if (z) {
            int[] iArr2 = (int[]) zzvVar.zzd;
            int i3 = zzvVar.zze;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                zzvVar.zze = i4;
                if (i4 == ((Object[]) zzvVar.zzc).length) {
                    zzvVar.resize();
                }
            }
            Object[] objArr = (Object[]) zzvVar.zzc;
            int i5 = zzvVar.zze;
            objArr[i5] = ((JsonConfiguration) zzvVar.zzb).exceptionsWithDebugInfo ? decodeSerializableValue$1 : JsonPath$Tombstone.INSTANCE$1;
            ((int[]) zzvVar.zzd)[i5] = -2;
        }
        return decodeSerializableValue$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decodeSerializableValue$1(KSerializer kSerializer) {
        String message;
        String str;
        Json json = this.json;
        AdapterHelper adapterHelper = this.lexer;
        zzv zzvVar = (zzv) adapterHelper.mPendingUpdates;
        kSerializer.getClass();
        try {
        } catch (MissingFieldException e) {
            message = e.getMessage();
            message.getClass();
            if (!StringsKt.contains((CharSequence) message, (CharSequence) "at path", false)) {
            }
        }
        if ((kSerializer instanceof AbstractPolymorphicSerializer) && !json.configuration.useArrayPolymorphism) {
            String classDiscriminator = WriteModeKt.classDiscriminator(((AbstractPolymorphicSerializer) kSerializer).getDescriptor(), json);
            String peekLeadingMatchingValue = adapterHelper.peekLeadingMatchingValue(classDiscriminator, this.configuration.isLenient);
            if (peekLeadingMatchingValue != null) {
                try {
                    KSerializer findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) kSerializer, this, peekLeadingMatchingValue);
                    Obfuscator obfuscator = new Obfuscator();
                    obfuscator.salt = classDiscriminator;
                    this.discriminatorHolder = obfuscator;
                    return findPolymorphicSerializer.deserialize(this);
                } catch (SerializationException e2) {
                    String message2 = e2.getMessage();
                    message2.getClass();
                    String removeSuffix = StringsKt.removeSuffix(StringsKt.substringBefore$default(message2, '\n'), ".");
                    String message3 = e2.getMessage();
                    message3.getClass();
                    AdapterHelper.fail$default(adapterHelper, removeSuffix, 0, StringsKt.substringAfter('\n', message3, ""), 2);
                    throw null;
                }
            }
            if (json.configuration.useArrayPolymorphism) {
                return ((AbstractPolymorphicSerializer) kSerializer).deserialize(this);
            }
            String classDiscriminator2 = WriteModeKt.classDiscriminator(((AbstractPolymorphicSerializer) kSerializer).getDescriptor(), json);
            JsonElement decodeJsonElement = decodeJsonElement();
            String serialName = ((AbstractPolymorphicSerializer) kSerializer).getDescriptor().getSerialName();
            if (!(decodeJsonElement instanceof JsonObject)) {
                StringBuilder sb = new StringBuilder("Expected ");
                ReflectionFactory reflectionFactory = Reflection.factory;
                sb.append(reflectionFactory.getOrCreateKotlinClass(JsonObject.class).getSimpleName());
                sb.append(", but had ");
                sb.append(reflectionFactory.getOrCreateKotlinClass(decodeJsonElement.getClass()).getSimpleName());
                sb.append(" as the serialized body of ");
                sb.append(serialName);
                throw new JsonDecodingException(WriteModeKt.formatDecodingException(sb.toString(), -1, zzvVar.getPath(), null, json.configuration.exceptionsWithDebugInfo ? WriteModeKt.minify(-1, decodeJsonElement.toString()).toString() : null));
            }
            JsonObject jsonObject = (JsonObject) decodeJsonElement;
            JsonElement jsonElement = (JsonElement) jsonObject.get(classDiscriminator2);
            try {
                if (jsonElement != null) {
                    JsonPrimitive jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement);
                    if (!(jsonPrimitive instanceof JsonNull)) {
                        str = jsonPrimitive.getContent();
                        return WriteModeKt.readPolymorphicJson(json, classDiscriminator2, jsonObject, PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) kSerializer, this, str));
                    }
                }
                return WriteModeKt.readPolymorphicJson(json, classDiscriminator2, jsonObject, PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) kSerializer, this, str));
            } catch (SerializationException e3) {
                String message4 = e3.getMessage();
                message4.getClass();
                throw new JsonDecodingException(WriteModeKt.formatDecodingException(message4, -1, null, null, json.configuration.exceptionsWithDebugInfo ? WriteModeKt.minify(-1, jsonObject.toString()).toString() : null));
            }
            str = null;
            message = e.getMessage();
            message.getClass();
            if (!StringsKt.contains((CharSequence) message, (CharSequence) "at path", false)) {
                throw e;
            }
            throw new MissingFieldException(e.getMessage() + " at path: " + zzvVar.getPath(), e, e.missingFields, e.serialName);
        }
        return kSerializer.deserialize(this);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        AdapterHelper adapterHelper = this.lexer;
        long consumeNumericLiteral = adapterHelper.consumeNumericLiteral();
        short s = (short) consumeNumericLiteral;
        if (consumeNumericLiteral == s) {
            return s;
        }
        AdapterHelper.fail$default(adapterHelper, "Failed to parse short for input '" + consumeNumericLiteral + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final String decodeString() {
        boolean z = this.configuration.isLenient;
        AdapterHelper adapterHelper = this.lexer;
        return z ? adapterHelper.consumeStringLenientNotNull() : adapterHelper.consumeString();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final void endStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.getElementsCount() == 0 && WriteModeKt.ignoreUnknownKeys(serialDescriptor, this.json)) {
            while (decodeElementIndex(serialDescriptor) != -1) {
            }
        }
        AdapterHelper adapterHelper = this.lexer;
        if (adapterHelper.tryConsumeComma()) {
            WriteModeKt.invalidTrailingComma(adapterHelper, "");
            throw null;
        }
        adapterHelper.consumeNextToken(this.mode.end);
        zzv zzvVar = (zzv) adapterHelper.mPendingUpdates;
        int i = zzvVar.zze;
        int[] iArr = (int[]) zzvVar.zzd;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            zzvVar.zze = i - 1;
        }
        int i2 = zzvVar.zze;
        if (i2 != -1) {
            zzvVar.zze = i2 - 1;
        }
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
