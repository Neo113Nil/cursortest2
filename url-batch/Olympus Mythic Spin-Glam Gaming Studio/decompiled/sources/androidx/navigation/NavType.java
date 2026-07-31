package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import java.io.Serializable;

/* loaded from: classes10.dex */
public abstract class NavType<T> {
    public static final NavType BoolArrayType;
    public static final NavType BoolType;
    public static final NavType FloatArrayType;
    public static final NavType FloatType;
    public static final NavType IntArrayType;
    public static final NavType IntType;
    public static final NavType LongArrayType;
    public static final NavType LongType;
    public static final NavType ReferenceType;
    public static final NavType StringArrayType;
    public static final NavType StringType;
    private final boolean mNullableAllowed;

    public abstract Object get(Bundle bundle, String str);

    public abstract String getName();

    public abstract Object parseValue(String str);

    public abstract void put(Bundle bundle, String str, Object obj);

    NavType(boolean z) {
        this.mNullableAllowed = z;
    }

    public boolean isNullableAllowed() {
        return this.mNullableAllowed;
    }

    Object parseAndPut(Bundle bundle, String str, String str2) {
        Object parseValue = parseValue(str2);
        put(bundle, str, parseValue);
        return parseValue;
    }

    public String toString() {
        return getName();
    }

    public static NavType fromArgType(String str, String str2) {
        String str3;
        NavType navType = IntType;
        if (navType.getName().equals(str)) {
            return navType;
        }
        NavType navType2 = IntArrayType;
        if (navType2.getName().equals(str)) {
            return navType2;
        }
        NavType navType3 = LongType;
        if (navType3.getName().equals(str)) {
            return navType3;
        }
        NavType navType4 = LongArrayType;
        if (navType4.getName().equals(str)) {
            return navType4;
        }
        NavType navType5 = BoolType;
        if (navType5.getName().equals(str)) {
            return navType5;
        }
        NavType navType6 = BoolArrayType;
        if (navType6.getName().equals(str)) {
            return navType6;
        }
        NavType navType7 = StringType;
        if (navType7.getName().equals(str)) {
            return navType7;
        }
        NavType navType8 = StringArrayType;
        if (navType8.getName().equals(str)) {
            return navType8;
        }
        NavType navType9 = FloatType;
        if (navType9.getName().equals(str)) {
            return navType9;
        }
        NavType navType10 = FloatArrayType;
        if (navType10.getName().equals(str)) {
            return navType10;
        }
        NavType navType11 = ReferenceType;
        if (navType11.getName().equals(str)) {
            return navType11;
        }
        if (str == null || str.isEmpty()) {
            return navType7;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                str3 = str;
            } else {
                str3 = str2 + str;
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new ParcelableArrayType(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new SerializableArrayType(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new ParcelableType(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new EnumType(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new SerializableType(cls2);
                }
            }
            throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static NavType inferFromValue(String str) {
        try {
            try {
                try {
                    try {
                        NavType navType = IntType;
                        navType.parseValue(str);
                        return navType;
                    } catch (IllegalArgumentException unused) {
                        NavType navType2 = BoolType;
                        navType2.parseValue(str);
                        return navType2;
                    }
                } catch (IllegalArgumentException unused2) {
                    NavType navType3 = FloatType;
                    navType3.parseValue(str);
                    return navType3;
                }
            } catch (IllegalArgumentException unused3) {
                NavType navType4 = LongType;
                navType4.parseValue(str);
                return navType4;
            }
        } catch (IllegalArgumentException unused4) {
            return StringType;
        }
    }

    static NavType inferFromValueType(Object obj) {
        if (obj instanceof Integer) {
            return IntType;
        }
        if (obj instanceof int[]) {
            return IntArrayType;
        }
        if (obj instanceof Long) {
            return LongType;
        }
        if (obj instanceof long[]) {
            return LongArrayType;
        }
        if (obj instanceof Float) {
            return FloatType;
        }
        if (obj instanceof float[]) {
            return FloatArrayType;
        }
        if (obj instanceof Boolean) {
            return BoolType;
        }
        if (obj instanceof boolean[]) {
            return BoolArrayType;
        }
        if ((obj instanceof String) || obj == null) {
            return StringType;
        }
        if (obj instanceof String[]) {
            return StringArrayType;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new ParcelableArrayType(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new SerializableArrayType(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new ParcelableType(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new EnumType(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new SerializableType(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    static {
        boolean z = false;
        IntType = new NavType<Integer>(z) { // from class: androidx.navigation.NavType.1
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, Integer num) {
                bundle.putInt(str, num.intValue());
            }

            @Override // androidx.navigation.NavType
            public Integer get(Bundle bundle, String str) {
                return (Integer) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public Integer parseValue(String str) {
                if (str.startsWith("0x")) {
                    return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
                }
                return Integer.valueOf(Integer.parseInt(str));
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "integer";
            }
        };
        ReferenceType = new NavType<Integer>(z) { // from class: androidx.navigation.NavType.2
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, Integer num) {
                bundle.putInt(str, num.intValue());
            }

            @Override // androidx.navigation.NavType
            public Integer get(Bundle bundle, String str) {
                return (Integer) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public Integer parseValue(String str) {
                if (str.startsWith("0x")) {
                    return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
                }
                return Integer.valueOf(Integer.parseInt(str));
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "reference";
            }
        };
        boolean z2 = true;
        IntArrayType = new NavType<int[]>(z2) { // from class: androidx.navigation.NavType.3
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, int[] iArr) {
                bundle.putIntArray(str, iArr);
            }

            @Override // androidx.navigation.NavType
            public int[] get(Bundle bundle, String str) {
                return (int[]) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public int[] parseValue(String str) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "integer[]";
            }
        };
        LongType = new NavType<Long>(z) { // from class: androidx.navigation.NavType.4
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, Long l) {
                bundle.putLong(str, l.longValue());
            }

            @Override // androidx.navigation.NavType
            public Long get(Bundle bundle, String str) {
                return (Long) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public Long parseValue(String str) {
                if (str.endsWith("L")) {
                    str = str.substring(0, str.length() - 1);
                }
                if (str.startsWith("0x")) {
                    return Long.valueOf(Long.parseLong(str.substring(2), 16));
                }
                return Long.valueOf(Long.parseLong(str));
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return Constants.LONG;
            }
        };
        LongArrayType = new NavType<long[]>(z2) { // from class: androidx.navigation.NavType.5
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, long[] jArr) {
                bundle.putLongArray(str, jArr);
            }

            @Override // androidx.navigation.NavType
            public long[] get(Bundle bundle, String str) {
                return (long[]) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public long[] parseValue(String str) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "long[]";
            }
        };
        FloatType = new NavType<Float>(z) { // from class: androidx.navigation.NavType.6
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, Float f) {
                bundle.putFloat(str, f.floatValue());
            }

            @Override // androidx.navigation.NavType
            public Float get(Bundle bundle, String str) {
                return (Float) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public Float parseValue(String str) {
                return Float.valueOf(Float.parseFloat(str));
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "float";
            }
        };
        FloatArrayType = new NavType<float[]>(z2) { // from class: androidx.navigation.NavType.7
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, float[] fArr) {
                bundle.putFloatArray(str, fArr);
            }

            @Override // androidx.navigation.NavType
            public float[] get(Bundle bundle, String str) {
                return (float[]) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public float[] parseValue(String str) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "float[]";
            }
        };
        BoolType = new NavType<Boolean>(z) { // from class: androidx.navigation.NavType.8
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, Boolean bool) {
                bundle.putBoolean(str, bool.booleanValue());
            }

            @Override // androidx.navigation.NavType
            public Boolean get(Bundle bundle, String str) {
                return (Boolean) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public Boolean parseValue(String str) {
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "boolean";
            }
        };
        BoolArrayType = new NavType<boolean[]>(z2) { // from class: androidx.navigation.NavType.9
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, boolean[] zArr) {
                bundle.putBooleanArray(str, zArr);
            }

            @Override // androidx.navigation.NavType
            public boolean[] get(Bundle bundle, String str) {
                return (boolean[]) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public boolean[] parseValue(String str) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "boolean[]";
            }
        };
        StringType = new NavType<String>(z2) { // from class: androidx.navigation.NavType.10
            @Override // androidx.navigation.NavType
            public String parseValue(String str) {
                return str;
            }

            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, String str2) {
                bundle.putString(str, str2);
            }

            @Override // androidx.navigation.NavType
            public String get(Bundle bundle, String str) {
                return (String) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "string";
            }
        };
        StringArrayType = new NavType<String[]>(z2) { // from class: androidx.navigation.NavType.11
            @Override // androidx.navigation.NavType
            public void put(Bundle bundle, String str, String[] strArr) {
                bundle.putStringArray(str, strArr);
            }

            @Override // androidx.navigation.NavType
            public String[] get(Bundle bundle, String str) {
                return (String[]) bundle.get(str);
            }

            @Override // androidx.navigation.NavType
            public String[] parseValue(String str) {
                throw new UnsupportedOperationException("Arrays don't support default values.");
            }

            @Override // androidx.navigation.NavType
            public String getName() {
                return "string[]";
            }
        };
    }

    public static final class ParcelableType<D> extends NavType<D> {
        private final Class mType;

        public ParcelableType(Class cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
            }
            this.mType = cls;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, Object obj) {
            this.mType.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }

        @Override // androidx.navigation.NavType
        public Object get(Bundle bundle, String str) {
            return bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public Object parseValue(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.mType.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ParcelableType.class != obj.getClass()) {
                return false;
            }
            return this.mType.equals(((ParcelableType) obj).mType);
        }

        public int hashCode() {
            return this.mType.hashCode();
        }
    }

    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        private final Class mArrayType;

        public ParcelableArrayType(Class cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.mArrayType = Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, Parcelable[] parcelableArr) {
            this.mArrayType.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        @Override // androidx.navigation.NavType
        public Parcelable[] get(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public Parcelable[] parseValue(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.mArrayType.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ParcelableArrayType.class != obj.getClass()) {
                return false;
            }
            return this.mArrayType.equals(((ParcelableArrayType) obj).mArrayType);
        }

        public int hashCode() {
            return this.mArrayType.hashCode();
        }
    }

    public static class SerializableType<D extends Serializable> extends NavType<D> {
        private final Class mType;

        public SerializableType(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            if (cls.isEnum()) {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
            this.mType = cls;
        }

        SerializableType(boolean z, Class cls) {
            super(z);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            this.mType = cls;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, Serializable serializable) {
            this.mType.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        @Override // androidx.navigation.NavType
        public Serializable get(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public Serializable parseValue(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.mType.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SerializableType) {
                return this.mType.equals(((SerializableType) obj).mType);
            }
            return false;
        }

        public int hashCode() {
            return this.mType.hashCode();
        }
    }

    public static final class EnumType<D extends Enum> extends SerializableType<D> {
        private final Class mType;

        public EnumType(Class cls) {
            super(false, cls);
            if (!cls.isEnum()) {
                throw new IllegalArgumentException(cls + " is not an Enum type.");
            }
            this.mType = cls;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public Enum parseValue(String str) {
            for (Enum r3 : (Enum[]) this.mType.getEnumConstants()) {
                if (r3.name().equals(str)) {
                    return r3;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.mType.getName() + ".");
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public String getName() {
            return this.mType.getName();
        }
    }

    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        private final Class mArrayType;

        public SerializableArrayType(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.mArrayType = Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String str, Serializable[] serializableArr) {
            this.mArrayType.cast(serializableArr);
            bundle.putSerializable(str, serializableArr);
        }

        @Override // androidx.navigation.NavType
        public Serializable[] get(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public Serializable[] parseValue(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.mArrayType.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SerializableArrayType.class != obj.getClass()) {
                return false;
            }
            return this.mArrayType.equals(((SerializableArrayType) obj).mArrayType);
        }

        public int hashCode() {
            return this.mArrayType.hashCode();
        }
    }
}
