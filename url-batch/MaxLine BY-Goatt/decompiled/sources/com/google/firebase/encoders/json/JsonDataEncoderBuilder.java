package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import defpackage.r61;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {
    private static final ValueEncoder<Boolean> BOOLEAN_ENCODER;
    private static final ObjectEncoder<Object> DEFAULT_FALLBACK_ENCODER;
    private static final ValueEncoder<String> STRING_ENCODER;
    private static final TimestampEncoder TIMESTAMP_ENCODER = new TimestampEncoder();
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders = new HashMap();
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders = new HashMap();
    private ObjectEncoder<Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;
    private boolean ignoreNullValues = false;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class TimestampEncoder implements ValueEncoder<Date> {
        private static final DateFormat rfc339;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            rfc339 = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private TimestampEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(Date date, ValueEncoderContext valueEncoderContext) {
            valueEncoderContext.add(rfc339.format(date));
        }
    }

    static {
        final int i = 0;
        DEFAULT_FALLBACK_ENCODER = new r61(i);
        STRING_ENCODER = new ValueEncoder() { // from class: s61
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ValueEncoderContext valueEncoderContext) {
                switch (i) {
                    case 0:
                        valueEncoderContext.add((String) obj);
                        break;
                    default:
                        JsonDataEncoderBuilder.lambda$static$2((Boolean) obj, valueEncoderContext);
                        break;
                }
            }
        };
        final int i2 = 1;
        BOOLEAN_ENCODER = new ValueEncoder() { // from class: s61
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ValueEncoderContext valueEncoderContext) {
                switch (i2) {
                    case 0:
                        valueEncoderContext.add((String) obj);
                        break;
                    default:
                        JsonDataEncoderBuilder.lambda$static$2((Boolean) obj, valueEncoderContext);
                        break;
                }
            }
        };
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, (ValueEncoder) STRING_ENCODER);
        registerEncoder(Boolean.class, (ValueEncoder) BOOLEAN_ENCODER);
        registerEncoder(Date.class, (ValueEncoder) TIMESTAMP_ENCODER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$2(Boolean bool, ValueEncoderContext valueEncoderContext) {
        valueEncoderContext.add(bool.booleanValue());
    }

    public DataEncoder build() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            public void encode(Object obj, Writer writer) {
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.this.objectEncoders, JsonDataEncoderBuilder.this.valueEncoders, JsonDataEncoderBuilder.this.fallbackEncoder, JsonDataEncoderBuilder.this.ignoreNullValues);
                jsonValueObjectEncoderContext.add(obj, false);
                jsonValueObjectEncoderContext.close();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public String encode(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    encode(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    public JsonDataEncoderBuilder configureWith(Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    public JsonDataEncoderBuilder ignoreNullValues(boolean z) {
        this.ignoreNullValues = z;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public <T> JsonDataEncoderBuilder registerEncoder(Class<T> cls, ObjectEncoder<? super T> objectEncoder) {
        this.objectEncoders.put(cls, objectEncoder);
        this.valueEncoders.remove(cls);
        return this;
    }

    public JsonDataEncoderBuilder registerFallbackEncoder(ObjectEncoder<Object> objectEncoder) {
        this.fallbackEncoder = objectEncoder;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public <T> JsonDataEncoderBuilder registerEncoder(Class<T> cls, ValueEncoder<? super T> valueEncoder) {
        this.valueEncoders.put(cls, valueEncoder);
        this.objectEncoders.remove(cls);
        return this;
    }
}
