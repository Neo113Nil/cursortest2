package kotlinx.serialization.json.internal;

import androidx.media3.common.FlagSet;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;
import okio.Utf8;
import org.commonmark.internal.BlockContent;

/* loaded from: classes9.dex */
public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {
    public final FlagSet.Builder composer;
    public final JsonConfiguration configuration;
    public boolean forceQuoting;
    public final Json json;
    public final WriteMode mode;
    public final JsonEncoder[] modeReuseCache;
    public String polymorphicDiscriminator;
    public String polymorphicSerialName;
    public final SerializersModule serializersModule;

    public StreamingJsonEncoder(FlagSet.Builder builder, Json json, WriteMode writeMode, JsonEncoder[] jsonEncoderArr) {
        builder.getClass();
        this.composer = builder;
        this.json = json;
        this.mode = writeMode;
        this.modeReuseCache = jsonEncoderArr;
        this.serializersModule = json.serializersModule;
        this.configuration = json.configuration;
        int ordinal = writeMode.ordinal();
        if (jsonEncoderArr != null) {
            JsonEncoder jsonEncoder = jsonEncoderArr[ordinal];
            if (jsonEncoder == null && jsonEncoder == this) {
                return;
            }
            jsonEncoderArr[ordinal] = this;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder beginStructure(SerialDescriptor serialDescriptor) {
        JsonEncoder jsonEncoder;
        serialDescriptor.getClass();
        Json json = this.json;
        WriteMode switchMode = WriteModeKt.switchMode(serialDescriptor, json);
        char c = switchMode.begin;
        FlagSet.Builder builder = this.composer;
        builder.print(c);
        builder.buildCalled = true;
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            String str2 = this.polymorphicSerialName;
            if (str2 == null) {
                str2 = serialDescriptor.getSerialName();
            }
            builder.nextItem();
            builder.printQuoted(str);
            builder.print(':');
            encodeString(str2);
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        if (this.mode == switchMode) {
            return this;
        }
        JsonEncoder[] jsonEncoderArr = this.modeReuseCache;
        return (jsonEncoderArr == null || (jsonEncoder = jsonEncoderArr[switchMode.ordinal()]) == null) ? new StreamingJsonEncoder(builder, json, switchMode, jsonEncoderArr) : jsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean z) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(z));
        } else {
            ((BlockContent) this.composer.flags).write(String.valueOf(z));
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) b));
        } else {
            this.composer.print(b);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char c) {
        encodeString(String.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double d) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(d));
        } else {
            ((BlockContent) this.composer.flags).write(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw WriteModeKt.InvalidFloatingPointEncoded(null, Double.valueOf(d));
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public final void encodeElement(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        int ordinal = this.mode.ordinal();
        FlagSet.Builder builder = this.composer;
        boolean z = true;
        if (ordinal == 1) {
            if (!builder.buildCalled) {
                builder.print(',');
            }
            builder.nextItem();
            return;
        }
        if (ordinal == 2) {
            if (builder.buildCalled) {
                this.forceQuoting = true;
                builder.nextItem();
                return;
            }
            if (i % 2 == 0) {
                builder.print(',');
                builder.nextItem();
            } else {
                builder.print(':');
                builder.space();
                z = false;
            }
            this.forceQuoting = z;
            return;
        }
        if (ordinal != 3) {
            if (!builder.buildCalled) {
                builder.print(',');
            }
            builder.nextItem();
            WriteModeKt.namingStrategy(serialDescriptor, this.json);
            encodeString(serialDescriptor.getElementName(i));
            builder.print(':');
            builder.space();
            return;
        }
        if (i == 0) {
            this.forceQuoting = true;
        }
        if (i == 1) {
            builder.print(',');
            builder.space();
            this.forceQuoting = false;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        encodeString(serialDescriptor.getElementName(i));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float f) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(f));
        } else {
            ((BlockContent) this.composer.flags).write(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw WriteModeKt.InvalidFloatingPointEncoded(null, Float.valueOf(f));
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final Encoder encodeInline(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean isUnsignedNumber = StreamingJsonEncoderKt.isUnsignedNumber(serialDescriptor);
        WriteMode writeMode = this.mode;
        Json json = this.json;
        FlagSet.Builder builder = this.composer;
        if (isUnsignedNumber) {
            if (!(builder instanceof ComposerForUnsignedNumbers)) {
                builder = new ComposerForUnsignedNumbers((BlockContent) builder.flags, this.forceQuoting);
            }
            return new StreamingJsonEncoder(builder, json, writeMode, null);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(JsonElementKt.jsonUnquotedLiteralDescriptor)) {
            if (!(builder instanceof ComposerForUnquotedLiterals)) {
                builder = new ComposerForUnquotedLiterals((BlockContent) builder.flags, this.forceQuoting);
            }
            return new StreamingJsonEncoder(builder, json, writeMode, null);
        }
        if (this.polymorphicDiscriminator != null) {
            this.polymorphicSerialName = serialDescriptor.getSerialName();
        }
        return this;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int i) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(i));
        } else {
            this.composer.print(i);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final void encodeJsonElement(JsonElement jsonElement) {
        jsonElement.getClass();
        if (this.polymorphicDiscriminator == null || (jsonElement instanceof JsonObject)) {
            encodeSerializableValue(JsonElementSerializer.INSTANCE, jsonElement);
        } else {
            WriteModeKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, jsonElement);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long j) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(j));
        } else {
            this.composer.print(j);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeNull() {
        this.composer.print("null");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        if (obj != null || this.configuration.explicitNulls) {
            super.encodeNullableSerializableElement(serialDescriptor, i, kSerializer, obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0041, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE$1) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r1 != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L24;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void encodeSerializableValue(KSerializer kSerializer, Object obj) {
        String classDiscriminator;
        KSerializer kSerializer2;
        kSerializer.getClass();
        Json json = this.json;
        JsonConfiguration jsonConfiguration = json.configuration;
        if (jsonConfiguration.useArrayPolymorphism) {
            kSerializer.serialize(this, obj);
            return;
        }
        boolean z = kSerializer instanceof AbstractPolymorphicSerializer;
        ClassDiscriminatorMode classDiscriminatorMode = jsonConfiguration.classDiscriminatorMode;
        if (!z) {
            int ordinal = classDiscriminatorMode.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    Utf8 kind = kSerializer.getDescriptor().getKind();
                    if (!Intrinsics.areEqual(kind, StructureKind.CLASS.INSTANCE)) {
                    }
                    classDiscriminator = WriteModeKt.classDiscriminator(kSerializer.getDescriptor(), json);
                } else if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
            classDiscriminator = null;
        }
        if (z) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) kSerializer;
            if (obj == null) {
                a$$ExternalSyntheticBUOutline0.m("Value for serializer ", abstractPolymorphicSerializer.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            kSerializer2 = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, this, obj);
        } else {
            kSerializer2 = kSerializer;
        }
        if (classDiscriminator != null) {
            WriteModeKt.access$checkEncodingConflicts(json, kSerializer, kSerializer2, classDiscriminator);
            WriteModeKt.checkKind(kSerializer2.getDescriptor().getKind());
            String serialName = kSerializer2.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = classDiscriminator;
            this.polymorphicSerialName = serialName;
        }
        kSerializer2.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short s) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) s));
        } else {
            this.composer.print(s);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeString(String str) {
        str.getClass();
        this.composer.printQuoted(str);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        FlagSet.Builder builder = this.composer;
        builder.getClass();
        builder.buildCalled = false;
        builder.print(this.mode.end);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final boolean shouldEncodeElementDefault(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.configuration.encodeDefaults;
    }
}
