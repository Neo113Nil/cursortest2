package com.squareup.wire;

import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.ReflectionKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Pipe$sink$1;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Timeout;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;

/* loaded from: classes.dex */
public abstract class ProtoAdapter {
    public static final ProtoAdapter BOOL;
    public static final ProtoAdapter BOOL_VALUE;
    public static final ProtoAdapter BYTES;
    public static final ProtoAdapter BYTES_VALUE;
    public static final Companion Companion = new Companion();
    public static final ProtoAdapter DOUBLE;
    public static final ProtoAdapter DOUBLE_ARRAY;
    public static final ProtoAdapter DOUBLE_VALUE;
    public static final ProtoAdapter DURATION;
    public static final ProtoAdapter EMPTY;
    public static final ProtoAdapter FIXED32;
    public static final ProtoAdapter FIXED32_ARRAY;
    public static final ProtoAdapter FIXED64;
    public static final ProtoAdapter FIXED64_ARRAY;
    public static final ProtoAdapter FLOAT;
    public static final ProtoAdapter FLOAT_ARRAY;
    public static final ProtoAdapter FLOAT_VALUE;
    public static final ProtoAdapter INSTANT;
    public static final ProtoAdapter INT32;
    public static final ProtoAdapter INT32_ARRAY;
    public static final ProtoAdapter INT32_VALUE;
    public static final ProtoAdapter INT64;
    public static final ProtoAdapter INT64_ARRAY;
    public static final ProtoAdapter INT64_VALUE;
    public static final ProtoAdapter SFIXED32;
    public static final ProtoAdapter SFIXED32_ARRAY;
    public static final ProtoAdapter SFIXED64;
    public static final ProtoAdapter SFIXED64_ARRAY;
    public static final ProtoAdapter SINT32;
    public static final ProtoAdapter SINT32_ARRAY;
    public static final ProtoAdapter SINT64;
    public static final ProtoAdapter SINT64_ARRAY;
    public static final ProtoAdapter STRING;
    public static final ProtoAdapter STRING_VALUE;
    public static final ProtoAdapter STRUCT_LIST;
    public static final ProtoAdapter STRUCT_MAP;
    public static final ProtoAdapter STRUCT_NULL;
    public static final ProtoAdapter STRUCT_VALUE;
    public static final ProtoAdapter UINT32;
    public static final ProtoAdapter UINT32_ARRAY;
    public static final ProtoAdapter UINT32_VALUE;
    public static final ProtoAdapter UINT64;
    public static final ProtoAdapter UINT64_ARRAY;
    public static final ProtoAdapter UINT64_VALUE;
    private final FieldEncoding fieldEncoding;
    private final Object identity;
    private final ProtoAdapter packedAdapter;
    private final ProtoAdapter repeatedAdapter;
    private final String sourceFile;
    private final Syntax syntax;

    /* renamed from: type, reason: collision with root package name */
    private final KClass f1418type;
    private final String typeUrl;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/squareup/wire/ProtoAdapter$EnumConstantNotFoundException", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public EnumConstantNotFoundException(int i, KClass kClass) {
            super(r0.toString());
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Unknown enum tag ", " for ");
            m2m.append(kClass != null ? PapaEvent.getJavaClass(kClass).getName() : null);
            this.value = i;
        }
    }

    static {
        ProtoAdapter unsupportedTypeProtoAdapter;
        ProtoAdapter unsupportedTypeProtoAdapter2;
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Boolean.TYPE);
        Syntax syntax = Syntax.PROTO_2;
        int i = 32;
        String str = null;
        FloatProtoAdapter floatProtoAdapter = new FloatProtoAdapter(fieldEncoding, orCreateKotlinClass, str, syntax, Boolean.FALSE, i, 2);
        BOOL = floatProtoAdapter;
        Class cls = Integer.TYPE;
        int i2 = 0;
        FloatProtoAdapter floatProtoAdapter2 = new FloatProtoAdapter(fieldEncoding, reflectionFactory.getOrCreateKotlinClass(cls), str, syntax, i2, i, 9);
        INT32 = floatProtoAdapter2;
        INT32_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter2, 0);
        FloatProtoAdapter floatProtoAdapter3 = new FloatProtoAdapter(fieldEncoding, reflectionFactory.getOrCreateKotlinClass(cls), str, syntax, i2, i, 18);
        UINT32 = floatProtoAdapter3;
        UINT32_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter3, 0);
        FloatProtoAdapter floatProtoAdapter4 = new FloatProtoAdapter(fieldEncoding, reflectionFactory.getOrCreateKotlinClass(cls), str, syntax, i2, i, 11);
        SINT32 = floatProtoAdapter4;
        SINT32_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter4, 0);
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        int i3 = 32;
        int i4 = 6;
        FloatProtoAdapter floatProtoAdapter5 = new FloatProtoAdapter(fieldEncoding2, reflectionFactory.getOrCreateKotlinClass(cls), null, syntax, i2, i3, i4);
        FIXED32 = floatProtoAdapter5;
        FIXED32_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter5, 0);
        FloatProtoAdapter floatProtoAdapter6 = new FloatProtoAdapter(fieldEncoding2, reflectionFactory.getOrCreateKotlinClass(cls), null, syntax, i2, i3, i4);
        SFIXED32 = floatProtoAdapter6;
        SFIXED32_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter6, 0);
        Class cls2 = Long.TYPE;
        long j = 0L;
        int i5 = 32;
        FloatProtoAdapter floatProtoAdapter7 = new FloatProtoAdapter(fieldEncoding, reflectionFactory.getOrCreateKotlinClass(cls2), null, syntax, j, i5, 10);
        INT64 = floatProtoAdapter7;
        INT64_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter7, 1);
        FloatProtoAdapter floatProtoAdapter8 = new FloatProtoAdapter(fieldEncoding, reflectionFactory.getOrCreateKotlinClass(cls2), null, syntax, j, i5, 19);
        UINT64 = floatProtoAdapter8;
        UINT64_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter8, 1);
        FloatProtoAdapter floatProtoAdapter9 = new FloatProtoAdapter(fieldEncoding, reflectionFactory.getOrCreateKotlinClass(cls2), null, syntax, j, i5, 12);
        SINT64 = floatProtoAdapter9;
        SINT64_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter9, 1);
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        int i6 = 32;
        int i7 = 7;
        FloatProtoAdapter floatProtoAdapter10 = new FloatProtoAdapter(fieldEncoding3, reflectionFactory.getOrCreateKotlinClass(cls2), null, syntax, j, i6, i7);
        FIXED64 = floatProtoAdapter10;
        FIXED64_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter10, 1);
        FloatProtoAdapter floatProtoAdapter11 = new FloatProtoAdapter(fieldEncoding3, reflectionFactory.getOrCreateKotlinClass(cls2), null, syntax, j, i6, i7);
        SFIXED64 = floatProtoAdapter11;
        SFIXED64_ARRAY = new IntArrayProtoAdapter(floatProtoAdapter11, 1);
        FloatProtoAdapter floatProtoAdapter12 = new FloatProtoAdapter(fieldEncoding2, reflectionFactory.getOrCreateKotlinClass(Float.TYPE), null, syntax, Float.valueOf(RecyclerView.DECELERATION_RATE), i6, 0);
        FLOAT = floatProtoAdapter12;
        FLOAT_ARRAY = new FloatArrayProtoAdapter(floatProtoAdapter12);
        String str2 = null;
        FloatProtoAdapter floatProtoAdapter13 = new FloatProtoAdapter(fieldEncoding3, reflectionFactory.getOrCreateKotlinClass(Double.TYPE), str2, syntax, Double.valueOf(0.0d), i6, 1);
        DOUBLE = floatProtoAdapter13;
        DOUBLE_ARRAY = new FloatArrayProtoAdapter(floatProtoAdapter13, (byte) 0);
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        FloatProtoAdapter floatProtoAdapter14 = new FloatProtoAdapter(fieldEncoding4, reflectionFactory.getOrCreateKotlinClass(ByteString.class), str2, syntax, ByteString.EMPTY, i6, 3);
        BYTES = floatProtoAdapter14;
        FloatProtoAdapter floatProtoAdapter15 = new FloatProtoAdapter(fieldEncoding4, reflectionFactory.getOrCreateKotlinClass(String.class), str2, syntax, "", i6, 13);
        STRING = floatProtoAdapter15;
        KClass orCreateKotlinClass2 = reflectionFactory.getOrCreateKotlinClass(Unit.class);
        Syntax syntax2 = Syntax.PROTO_3;
        int i8 = 48;
        Object obj = null;
        EMPTY = new FloatProtoAdapter(fieldEncoding4, orCreateKotlinClass2, "type.googleapis.com/google.protobuf.Empty", syntax2, obj, i8, 5);
        STRUCT_MAP = new FloatProtoAdapter(fieldEncoding4, reflectionFactory.getOrCreateKotlinClass(Map.class), "type.googleapis.com/google.protobuf.Struct", syntax2, obj, i8, 15);
        STRUCT_LIST = new FloatProtoAdapter(fieldEncoding4, reflectionFactory.getOrCreateKotlinClass(Map.class), "type.googleapis.com/google.protobuf.ListValue", syntax2, obj, i8, 14);
        STRUCT_NULL = new FloatProtoAdapter(fieldEncoding, reflectionFactory.getOrCreateKotlinClass(Void.class), "type.googleapis.com/google.protobuf.NullValue", syntax2, null, 48, 16);
        STRUCT_VALUE = new FloatProtoAdapter(fieldEncoding4, reflectionFactory.getOrCreateKotlinClass(Object.class), "type.googleapis.com/google.protobuf.Value", syntax2, obj, i8, 17);
        DOUBLE_VALUE = PlatformKt.commonWrapper(floatProtoAdapter13, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = PlatformKt.commonWrapper(floatProtoAdapter12, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = PlatformKt.commonWrapper(floatProtoAdapter7, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = PlatformKt.commonWrapper(floatProtoAdapter8, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = PlatformKt.commonWrapper(floatProtoAdapter2, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = PlatformKt.commonWrapper(floatProtoAdapter3, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = PlatformKt.commonWrapper(floatProtoAdapter, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = PlatformKt.commonWrapper(floatProtoAdapter15, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = PlatformKt.commonWrapper(floatProtoAdapter14, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            unsupportedTypeProtoAdapter = new FloatProtoAdapter(fieldEncoding4, reflectionFactory.getOrCreateKotlinClass(Duration.class), "type.googleapis.com/google.protobuf.Duration", syntax2, null, 48, 4);
        } catch (NoClassDefFoundError unused) {
            unsupportedTypeProtoAdapter = new Companion.UnsupportedTypeProtoAdapter();
        }
        DURATION = unsupportedTypeProtoAdapter;
        try {
            unsupportedTypeProtoAdapter2 = new FloatProtoAdapter(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Instant.class), "type.googleapis.com/google.protobuf.Timestamp", Syntax.PROTO_3, null, 48, 8);
        } catch (NoClassDefFoundError unused2) {
            unsupportedTypeProtoAdapter2 = new Companion.UnsupportedTypeProtoAdapter();
        }
        INSTANT = unsupportedTypeProtoAdapter2;
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, KClass kClass, String str, Syntax syntax, Object obj, String str2) {
        PackedProtoAdapter packedProtoAdapter;
        FieldEncoding fieldEncoding2;
        fieldEncoding.getClass();
        syntax.getClass();
        this.fieldEncoding = fieldEncoding;
        this.f1418type = kClass;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = obj;
        this.sourceFile = str2;
        boolean z = this instanceof PackedProtoAdapter;
        RepeatedProtoAdapter repeatedProtoAdapter = null;
        if (z || (this instanceof RepeatedProtoAdapter) || fieldEncoding == (fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED)) {
            packedProtoAdapter = null;
        } else {
            if (getFieldEncoding$wire_runtime() == fieldEncoding2) {
                a$$ExternalSyntheticBUOutline0.m$3("Unable to pack a length-delimited type.");
                throw null;
            }
            packedProtoAdapter = new PackedProtoAdapter(this);
        }
        this.packedAdapter = packedProtoAdapter;
        if (!(this instanceof RepeatedProtoAdapter) && !z) {
            repeatedProtoAdapter = new RepeatedProtoAdapter(this);
        }
        this.repeatedAdapter = repeatedProtoAdapter;
    }

    public static final ProtoAdapter get(String str) {
        Companion.getClass();
        str.getClass();
        return Companion.get(str, ProtoAdapter.class.getClassLoader());
    }

    public static final <E extends WireEnum> EnumAdapter newEnumAdapter(Class<E> cls) {
        Companion.getClass();
        cls.getClass();
        return new RuntimeEnumAdapter(cls, Syntax.PROTO_2);
    }

    public static final <K, V> ProtoAdapter newMapAdapter(ProtoAdapter protoAdapter, ProtoAdapter protoAdapter2) {
        Companion.getClass();
        return Companion.newMapAdapter(protoAdapter, protoAdapter2);
    }

    public static final <M extends Message, B extends Message.Builder> ProtoAdapter newMessageAdapter(Class<M> cls, String str, Syntax syntax) {
        Companion.getClass();
        cls.getClass();
        str.getClass();
        syntax.getClass();
        return ReflectionKt.createRuntimeMessageAdapter$default(cls, str, syntax, null, 56);
    }

    public final ProtoAdapter asPacked() {
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            a$$ExternalSyntheticBUOutline0.m$3("Unable to pack a length-delimited type.");
            return null;
        }
        ProtoAdapter protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        a$$ExternalSyntheticBUOutline0.m("Can't create a packed adapter from a packed or repeated adapter.");
        return null;
    }

    public final ProtoAdapter asRepeated() {
        ProtoAdapter protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        a$$ExternalSyntheticBUOutline0.m("Can't create a repeated adapter from a repeated or packed adapter.");
        return null;
    }

    public Object decode(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        ByteArrayProtoReader32 byteArrayProtoReader32 = (ByteArrayProtoReader32) protoReader32;
        ProtoReader32AsProtoReader protoReader32AsProtoReader = (ProtoReader32AsProtoReader) byteArrayProtoReader32.protoReader;
        if (protoReader32AsProtoReader == null) {
            protoReader32AsProtoReader = new ProtoReader32AsProtoReader(byteArrayProtoReader32);
            byteArrayProtoReader32.protoReader = protoReader32AsProtoReader;
        }
        return decode(protoReader32AsProtoReader);
    }

    public abstract Object decode(ProtoReader protoReader);

    public abstract void encode(ProtoWriter protoWriter, Object obj);

    public abstract void encode(ReverseProtoWriter reverseProtoWriter, Object obj);

    public final void encode(OutputStream outputStream, Object obj) {
        outputStream.getClass();
        RealBufferedSink realBufferedSink = new RealBufferedSink(new Pipe$sink$1(outputStream, new Timeout()));
        encode(realBufferedSink, obj);
        realBufferedSink.emit();
    }

    public final ByteString encodeByteString(Object obj) {
        Buffer buffer = new Buffer();
        encode(buffer, obj);
        return buffer.readByteString(buffer.size);
    }

    public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Object obj) {
        reverseProtoWriter.getClass();
        if (obj != null) {
            if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
                int byteCount = reverseProtoWriter.getByteCount();
                encode(reverseProtoWriter, obj);
                reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
            } else {
                encode(reverseProtoWriter, obj);
            }
            reverseProtoWriter.writeTag(i, getFieldEncoding$wire_runtime());
        }
    }

    public abstract int encodedSize(Object obj);

    public int encodedSizeWithTag(int i, Object obj) {
        if (obj == null) {
            return 0;
        }
        int encodedSize = encodedSize(obj);
        int i2 = 5;
        if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += (encodedSize & (-128)) == 0 ? 1 : (encodedSize & (-16384)) == 0 ? 2 : (encodedSize & (-2097152)) == 0 ? 3 : (encodedSize & (-268435456)) == 0 ? 4 : 5;
        }
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        int i3 = (i << 3) | 0;
        if ((i3 & (-128)) == 0) {
            i2 = 1;
        } else if ((i3 & (-16384)) == 0) {
            i2 = 2;
        } else if ((i3 & (-2097152)) == 0) {
            i2 = 3;
        } else if ((i3 & (-268435456)) == 0) {
            i2 = 4;
        }
        return encodedSize + i2;
    }

    public final FieldEncoding getFieldEncoding$wire_runtime() {
        return this.fieldEncoding;
    }

    public final Object getIdentity() {
        return this.identity;
    }

    public final ProtoAdapter getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final ProtoAdapter getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final Syntax getSyntax() {
        return this.syntax;
    }

    public final KClass getType() {
        return this.f1418type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return equals(STRUCT_MAP) || equals(STRUCT_LIST) || equals(STRUCT_VALUE) || equals(STRUCT_NULL);
    }

    public abstract Object redact(Object obj);

    public String toString(Object obj) {
        return String.valueOf(obj);
    }

    public final void tryDecode(ProtoReader32 protoReader32, List<Object> list) {
        protoReader32.getClass();
        list.getClass();
        ByteArrayProtoReader32 byteArrayProtoReader32 = (ByteArrayProtoReader32) protoReader32;
        if (byteArrayProtoReader32.beforePossiblyPackedScalar()) {
            list.add(decode(byteArrayProtoReader32));
        }
    }

    public final ProtoAdapter withLabel$wire_runtime(WireField.Label label) {
        label.getClass();
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }

    public final class Companion {
        public static ProtoAdapter get(String str, ClassLoader classLoader) {
            str.getClass();
            try {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '#', 0, false, 6);
                String substring = str.substring(0, indexOf$default);
                Object obj = Class.forName(substring, true, classLoader).getField(str.substring(indexOf$default + 1)).get(null);
                obj.getClass();
                return (ProtoAdapter) obj;
            } catch (ClassNotFoundException e) {
                Handlers$$ExternalSyntheticBUOutline0.m("failed to access ".concat(str), e);
                return null;
            } catch (IllegalAccessException e2) {
                Handlers$$ExternalSyntheticBUOutline0.m("failed to access ".concat(str), e2);
                return null;
            } catch (NoSuchFieldException e3) {
                Handlers$$ExternalSyntheticBUOutline0.m("failed to access ".concat(str), e3);
                return null;
            }
        }

        public static MapProtoAdapter newMapAdapter(ProtoAdapter protoAdapter, ProtoAdapter protoAdapter2) {
            protoAdapter.getClass();
            protoAdapter2.getClass();
            return new MapProtoAdapter(protoAdapter, protoAdapter2);
        }

        /* loaded from: classes8.dex */
        public final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
            public UnsupportedTypeProtoAdapter() {
                super(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Void.class), (String) null, Syntax.PROTO_2, (Object) null, (String) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader32 protoReader32) {
                protoReader32.getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                reverseProtoWriter.getClass();
                ((Void) obj).getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ((Void) obj).getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((Void) obj).getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ((Void) obj).getClass();
                throw new IllegalStateException("Operation not supported.");
            }
        }

        public static ProtoAdapter get(Class cls) {
            cls.getClass();
            try {
                Object obj = cls.getField("ADAPTER").get(null);
                obj.getClass();
                return (ProtoAdapter) obj;
            } catch (IllegalAccessException e) {
                Handlers$$ExternalSyntheticBUOutline0.m(re$$ExternalSyntheticOutline0.m(cls, new StringBuilder("failed to access "), "#ADAPTER"), e);
                return null;
            } catch (NoSuchFieldException e2) {
                Handlers$$ExternalSyntheticBUOutline0.m(re$$ExternalSyntheticOutline0.m(cls, new StringBuilder("failed to access "), "#ADAPTER"), e2);
                return null;
            }
        }
    }

    public static final <M> ProtoAdapter get(Class<M> cls) {
        Companion.getClass();
        return Companion.get(cls);
    }

    public static final ProtoAdapter get(String str, ClassLoader classLoader) {
        Companion.getClass();
        return Companion.get(str, classLoader);
    }

    public static final <M extends Message> ProtoAdapter get(M m) {
        Companion.getClass();
        m.getClass();
        return Companion.get(m.getClass());
    }

    public static final <M extends Message, B extends Message.Builder> ProtoAdapter newMessageAdapter(Class<M> cls, String str) {
        Companion.getClass();
        cls.getClass();
        str.getClass();
        return ReflectionKt.createRuntimeMessageAdapter$default(cls, str, Syntax.PROTO_2, null, 56);
    }

    public final void tryDecode(ProtoReader protoReader, List<Object> list) {
        protoReader.getClass();
        list.getClass();
        if (protoReader.beforePossiblyPackedScalar$wire_runtime()) {
            list.add(decode(protoReader));
        }
    }

    public static final <M extends Message, B extends Message.Builder> ProtoAdapter newMessageAdapter(Class<M> cls) {
        Companion.getClass();
        cls.getClass();
        return ReflectionKt.createRuntimeMessageAdapter$default(cls, null, Syntax.PROTO_2, null, 56);
    }

    public final Object decode(ByteString byteString) {
        byteString.getClass();
        return decode(new ByteArrayProtoReader32(byteString.toByteArray(), byteString.getSize$okio()));
    }

    public final void encode(BufferedSink bufferedSink, Object obj) {
        bufferedSink.getClass();
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        encode(reverseProtoWriter, obj);
        reverseProtoWriter.emitCurrentSegment();
        bufferedSink.writeAll(reverseProtoWriter.tail);
    }

    public static final <M extends Message, B extends Message.Builder> ProtoAdapter newMessageAdapter(Class<M> cls, String str, Syntax syntax, ClassLoader classLoader) {
        Companion.getClass();
        cls.getClass();
        str.getClass();
        syntax.getClass();
        return ReflectionKt.createRuntimeMessageAdapter$default(cls, str, syntax, classLoader, 48);
    }

    public final Object decode(InputStream inputStream) {
        inputStream.getClass();
        return decode(new RealBufferedSource(Okio.source(inputStream)));
    }

    public final byte[] encode(Object obj) {
        Buffer buffer = new Buffer();
        encode(buffer, obj);
        return buffer.readByteArray(buffer.size);
    }

    public final Object decode(byte[] bArr) {
        bArr.getClass();
        return decode(new ByteArrayProtoReader32(bArr, bArr.length));
    }

    public final Object decode(BufferedSource bufferedSource) {
        bufferedSource.getClass();
        return decode(new ProtoReader(bufferedSource));
    }

    public void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        protoWriter.getClass();
        if (obj != null) {
            FieldEncoding fieldEncoding$wire_runtime = getFieldEncoding$wire_runtime();
            fieldEncoding$wire_runtime.getClass();
            protoWriter.writeVarint32((i << 3) | fieldEncoding$wire_runtime.value);
            if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
                protoWriter.writeVarint32(encodedSize(obj));
            }
            encode(protoWriter, obj);
        }
    }

    public /* synthetic */ ProtoAdapter(FieldEncoding fieldEncoding, KClass kClass, String str, Syntax syntax, Object obj, int i) {
        this(fieldEncoding, kClass, str, syntax, (i & 16) != 0 ? null : obj, (String) null);
    }
}
