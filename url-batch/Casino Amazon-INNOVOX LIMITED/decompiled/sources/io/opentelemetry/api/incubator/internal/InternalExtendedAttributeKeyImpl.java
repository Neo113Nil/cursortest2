package io.opentelemetry.api.incubator.internal;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.incubator.common.ExtendedAttributeKey;
import io.opentelemetry.api.incubator.common.ExtendedAttributeType;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class InternalExtendedAttributeKeyImpl<T> implements ExtendedAttributeKey<T> {

    @Nullable
    private AttributeKey<T> attributeKey;
    private final int hashCode;
    private final String key;

    @Nullable
    private byte[] keyUtf8;
    private final ExtendedAttributeType type;

    private InternalExtendedAttributeKeyImpl(ExtendedAttributeType extendedAttributeType, String str) {
        if (extendedAttributeType == null) {
            throw new NullPointerException("Null type");
        }
        this.type = extendedAttributeType;
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.key = str;
        this.hashCode = buildHashCode(extendedAttributeType, str);
    }

    public static <T> ExtendedAttributeKey<T> create(@Nullable String str, ExtendedAttributeType extendedAttributeType) {
        if (str == null) {
            str = "";
        }
        return new InternalExtendedAttributeKeyImpl(extendedAttributeType, str);
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributeKey
    public ExtendedAttributeType getType() {
        return this.type;
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributeKey
    public String getKey() {
        return this.key;
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributeKey
    @Nullable
    public AttributeKey<T> asAttributeKey() {
        if (this.attributeKey == null) {
            this.attributeKey = toAttributeKey(this);
        }
        return this.attributeKey;
    }

    public byte[] getKeyUtf8() {
        byte[] bArr = this.keyUtf8;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.key.getBytes(StandardCharsets.UTF_8);
        this.keyUtf8 = bytes;
        return bytes;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternalExtendedAttributeKeyImpl) {
            InternalExtendedAttributeKeyImpl internalExtendedAttributeKeyImpl = (InternalExtendedAttributeKeyImpl) obj;
            if (this.type.equals(internalExtendedAttributeKeyImpl.getType()) && this.key.equals(internalExtendedAttributeKeyImpl.getKey())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        return this.key;
    }

    private int buildHashCode() {
        return buildHashCode(this.type, this.key);
    }

    private static int buildHashCode(ExtendedAttributeType extendedAttributeType, String str) {
        return ((extendedAttributeType.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    @Nullable
    public static <T> AttributeKey<T> toAttributeKey(ExtendedAttributeKey<T> extendedAttributeKey) {
        switch (AnonymousClass1.$SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[extendedAttributeKey.getType().ordinal()]) {
            case 1:
                return InternalAttributeKeyImpl.create(extendedAttributeKey.getKey(), AttributeType.STRING);
            case 2:
                return InternalAttributeKeyImpl.create(extendedAttributeKey.getKey(), AttributeType.BOOLEAN);
            case 3:
                return InternalAttributeKeyImpl.create(extendedAttributeKey.getKey(), AttributeType.LONG);
            case 4:
                return InternalAttributeKeyImpl.create(extendedAttributeKey.getKey(), AttributeType.DOUBLE);
            case 5:
                return InternalAttributeKeyImpl.create(extendedAttributeKey.getKey(), AttributeType.STRING_ARRAY);
            case 6:
                return InternalAttributeKeyImpl.create(extendedAttributeKey.getKey(), AttributeType.BOOLEAN_ARRAY);
            case 7:
                return InternalAttributeKeyImpl.create(extendedAttributeKey.getKey(), AttributeType.LONG_ARRAY);
            case 8:
                return InternalAttributeKeyImpl.create(extendedAttributeKey.getKey(), AttributeType.DOUBLE_ARRAY);
            case 9:
                return null;
            default:
                throw new IllegalArgumentException("Unrecognized extendedAttributeKey type: " + extendedAttributeKey.getType());
        }
    }

    /* renamed from: io.opentelemetry.api.incubator.internal.InternalExtendedAttributeKeyImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$api$common$AttributeType;
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType;

        static {
            int[] iArr = new int[AttributeType.values().length];
            $SwitchMap$io$opentelemetry$api$common$AttributeType = iArr;
            try {
                iArr[AttributeType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.STRING_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.BOOLEAN_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.LONG_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$common$AttributeType[AttributeType.DOUBLE_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ExtendedAttributeType.values().length];
            $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType = iArr2;
            try {
                iArr2[ExtendedAttributeType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.STRING_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.BOOLEAN_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.LONG_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.DOUBLE_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$incubator$common$ExtendedAttributeType[ExtendedAttributeType.EXTENDED_ATTRIBUTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static <T> ExtendedAttributeKey<T> toExtendedAttributeKey(AttributeKey<T> attributeKey) {
        switch (AnonymousClass1.$SwitchMap$io$opentelemetry$api$common$AttributeType[attributeKey.getType().ordinal()]) {
            case 1:
                return create(attributeKey.getKey(), ExtendedAttributeType.STRING);
            case 2:
                return create(attributeKey.getKey(), ExtendedAttributeType.BOOLEAN);
            case 3:
                return create(attributeKey.getKey(), ExtendedAttributeType.LONG);
            case 4:
                return create(attributeKey.getKey(), ExtendedAttributeType.DOUBLE);
            case 5:
                return create(attributeKey.getKey(), ExtendedAttributeType.STRING_ARRAY);
            case 6:
                return create(attributeKey.getKey(), ExtendedAttributeType.BOOLEAN_ARRAY);
            case 7:
                return create(attributeKey.getKey(), ExtendedAttributeType.LONG_ARRAY);
            case 8:
                return create(attributeKey.getKey(), ExtendedAttributeType.DOUBLE_ARRAY);
            default:
                throw new IllegalArgumentException("Unrecognized attributeKey type: " + attributeKey.getType());
        }
    }
}
