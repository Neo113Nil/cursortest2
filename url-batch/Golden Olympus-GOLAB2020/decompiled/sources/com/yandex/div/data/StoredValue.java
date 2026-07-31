package com.yandex.div.data;

import W1.m;
import com.ironsource.b9;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class StoredValue {

    @Metadata
    public static final class ArrayStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final JSONArray value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayStoredValue(@NotNull String name, @NotNull JSONArray value) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArrayStoredValue)) {
                return false;
            }
            ArrayStoredValue arrayStoredValue = (ArrayStoredValue) obj;
            return Intrinsics.areEqual(this.name, arrayStoredValue.name) && Intrinsics.areEqual(this.value, arrayStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public final JSONArray getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "ArrayStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata
    public static final class BooleanStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final boolean value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BooleanStoredValue(@NotNull String name, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = z4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BooleanStoredValue)) {
                return false;
            }
            BooleanStoredValue booleanStoredValue = (BooleanStoredValue) obj;
            return Intrinsics.areEqual(this.name, booleanStoredValue.name) && this.value == booleanStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            boolean z4 = this.value;
            int i4 = z4;
            if (z4 != 0) {
                i4 = 1;
            }
            return hashCode + i4;
        }

        @NotNull
        public String toString() {
            return "BooleanStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata
    public static final class ColorStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final int value;

        public /* synthetic */ ColorStoredValue(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorStoredValue)) {
                return false;
            }
            ColorStoredValue colorStoredValue = (ColorStoredValue) obj;
            return Intrinsics.areEqual(this.name, colorStoredValue.name) && Color.m213equalsimpl0(this.value, colorStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        /* renamed from: getValue-WpymAT4, reason: not valid java name */
        public final int m163getValueWpymAT4() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Color.m215hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return "ColorStoredValue(name=" + this.name + ", value=" + ((Object) Color.m217toStringimpl(this.value)) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private ColorStoredValue(String name, int i4) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = i4;
        }
    }

    @Metadata
    public static final class DictStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final JSONObject value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DictStoredValue(@NotNull String name, @NotNull JSONObject value) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DictStoredValue)) {
                return false;
            }
            DictStoredValue dictStoredValue = (DictStoredValue) obj;
            return Intrinsics.areEqual(this.name, dictStoredValue.name) && Intrinsics.areEqual(this.value, dictStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public final JSONObject getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "DictStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata
    public static final class DoubleStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final double value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DoubleStoredValue(@NotNull String name, double d4) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = d4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DoubleStoredValue)) {
                return false;
            }
            DoubleStoredValue doubleStoredValue = (DoubleStoredValue) obj;
            return Intrinsics.areEqual(this.name, doubleStoredValue.name) && Double.compare(this.value, doubleStoredValue.value) == 0;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Double.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "DoubleStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata
    public static final class IntegerStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final long value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegerStoredValue(@NotNull String name, long j4) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = j4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntegerStoredValue)) {
                return false;
            }
            IntegerStoredValue integerStoredValue = (IntegerStoredValue) obj;
            return Intrinsics.areEqual(this.name, integerStoredValue.name) && this.value == integerStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Long.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "IntegerStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata
    public static final class StringStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringStoredValue(@NotNull String name, @NotNull String value) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringStoredValue)) {
                return false;
            }
            StringStoredValue stringStoredValue = (StringStoredValue) obj;
            return Intrinsics.areEqual(this.name, stringStoredValue.name) && Intrinsics.areEqual(this.value, stringStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "StringStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata
    public enum Type {
        STRING("string"),
        INTEGER("integer"),
        BOOLEAN("boolean"),
        NUMBER("number"),
        COLOR(b9.h.f15459S),
        URL("url"),
        ARRAY("array"),
        DICT("dict");


        @NotNull
        public static final Converter Converter = new Converter(null);

        @NotNull
        private final String value;

        @Metadata
        public static final class Converter {
            public /* synthetic */ Converter(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final Type fromString(@NotNull String string) {
                Intrinsics.checkNotNullParameter(string, "string");
                Type type = Type.STRING;
                if (Intrinsics.areEqual(string, type.value)) {
                    return type;
                }
                Type type2 = Type.INTEGER;
                if (Intrinsics.areEqual(string, type2.value)) {
                    return type2;
                }
                Type type3 = Type.BOOLEAN;
                if (Intrinsics.areEqual(string, type3.value)) {
                    return type3;
                }
                Type type4 = Type.NUMBER;
                if (Intrinsics.areEqual(string, type4.value)) {
                    return type4;
                }
                Type type5 = Type.COLOR;
                if (Intrinsics.areEqual(string, type5.value)) {
                    return type5;
                }
                Type type6 = Type.URL;
                if (Intrinsics.areEqual(string, type6.value)) {
                    return type6;
                }
                Type type7 = Type.ARRAY;
                if (Intrinsics.areEqual(string, type7.value)) {
                    return type7;
                }
                Type type8 = Type.DICT;
                if (Intrinsics.areEqual(string, type8.value)) {
                    return type8;
                }
                return null;
            }

            @NotNull
            public final String toString(@NotNull Type obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.value;
            }

            private Converter() {
            }
        }

        Type(String str) {
            this.value = str;
        }
    }

    @Metadata
    public static final class UrlStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public /* synthetic */ UrlStoredValue(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UrlStoredValue)) {
                return false;
            }
            UrlStoredValue urlStoredValue = (UrlStoredValue) obj;
            return Intrinsics.areEqual(this.name, urlStoredValue.name) && Url.m224equalsimpl0(this.value, urlStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: getValue-OXPJC6E, reason: not valid java name */
        public final String m164getValueOXPJC6E() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Url.m225hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return "UrlStoredValue(name=" + this.name + ", value=" + ((Object) Url.m226toStringimpl(this.value)) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private UrlStoredValue(String name, String value) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }
    }

    public /* synthetic */ StoredValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public final Type getType() {
        if (this instanceof StringStoredValue) {
            return Type.STRING;
        }
        if (this instanceof IntegerStoredValue) {
            return Type.INTEGER;
        }
        if (this instanceof BooleanStoredValue) {
            return Type.BOOLEAN;
        }
        if (this instanceof DoubleStoredValue) {
            return Type.NUMBER;
        }
        if (this instanceof ColorStoredValue) {
            return Type.COLOR;
        }
        if (this instanceof UrlStoredValue) {
            return Type.URL;
        }
        if (this instanceof ArrayStoredValue) {
            return Type.ARRAY;
        }
        if (this instanceof DictStoredValue) {
            return Type.DICT;
        }
        throw new m();
    }

    @NotNull
    public final Object getValue() {
        if (this instanceof StringStoredValue) {
            return ((StringStoredValue) this).getValue();
        }
        if (this instanceof IntegerStoredValue) {
            return Long.valueOf(((IntegerStoredValue) this).getValue());
        }
        if (this instanceof BooleanStoredValue) {
            return Boolean.valueOf(((BooleanStoredValue) this).getValue());
        }
        if (this instanceof DoubleStoredValue) {
            return Double.valueOf(((DoubleStoredValue) this).getValue());
        }
        if (this instanceof ColorStoredValue) {
            return Color.m210boximpl(((ColorStoredValue) this).m163getValueWpymAT4());
        }
        if (this instanceof UrlStoredValue) {
            return Url.m221boximpl(((UrlStoredValue) this).m164getValueOXPJC6E());
        }
        if (this instanceof ArrayStoredValue) {
            return ((ArrayStoredValue) this).getValue();
        }
        if (this instanceof DictStoredValue) {
            return ((DictStoredValue) this).getValue();
        }
        throw new m();
    }

    private StoredValue() {
    }
}
