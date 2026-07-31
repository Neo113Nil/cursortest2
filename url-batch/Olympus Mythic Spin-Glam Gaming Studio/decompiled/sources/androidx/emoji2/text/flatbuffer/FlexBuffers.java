package androidx.emoji2.text.flatbuffer;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes9.dex */
public class FlexBuffers {
    private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);

    static class Unsigned {
        static int byteToUnsignedInt(byte b) {
            return b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }

        static long intToUnsignedLong(int i) {
            return i & 4294967295L;
        }

        static int shortToUnsignedInt(short s) {
            return s & 65535;
        }
    }

    static boolean isTypedVector(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    static int toTypedVectorElementType(int i) {
        return i - 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(ReadBuf readBuf, int i, int i2) {
        return (int) (i - readUInt(readBuf, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i, int i2) {
        if (i2 == 1) {
            return Unsigned.byteToUnsignedInt(readBuf.get(i));
        }
        if (i2 == 2) {
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i));
        }
        if (i2 == 4) {
            return Unsigned.intToUnsignedLong(readBuf.getInt(i));
        }
        if (i2 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i, int i2) {
        return (int) readLong(readBuf, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = readBuf.get(i);
        } else if (i2 == 2) {
            i3 = readBuf.getShort(i);
        } else {
            if (i2 != 4) {
                if (i2 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i);
            }
            i3 = readBuf.getInt(i);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i, int i2) {
        if (i2 == 4) {
            return readBuf.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }

    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);
        private ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        Reference(ReadBuf readBuf, int i, int i2, int i3) {
            this(readBuf, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        Reference(ReadBuf readBuf, int i, int i2, int i3, int i4) {
            this.bb = readBuf;
            this.end = i;
            this.parentWidth = i2;
            this.byteWidth = i3;
            this.type = i4;
        }

        public boolean isBoolean() {
            return this.type == 26;
        }

        public boolean isString() {
            return this.type == 5;
        }

        public boolean isKey() {
            return this.type == 4;
        }

        public boolean isVector() {
            int i = this.type;
            return i == 10 || i == 9;
        }

        public boolean isMap() {
            return this.type == 9;
        }

        public boolean isBlob() {
            return this.type == 25;
        }

        public long asUInt() {
            int i = this.type;
            if (i == 2) {
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i == 26) {
                return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return Long.parseLong(asString());
            }
            if (i == 6) {
                ReadBuf readBuf = this.bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                ReadBuf readBuf2 = this.bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            }
            if (i != 8) {
                return 0L;
            }
            ReadBuf readBuf3 = this.bb;
            return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
        }

        public long asLong() {
            int i = this.type;
            if (i == 1) {
                return FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i == 6) {
                ReadBuf readBuf = this.bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                ReadBuf readBuf2 = this.bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i == 8) {
                ReadBuf readBuf3 = this.bb;
                return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0L;
            }
            return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public double asFloat() {
            int i = this.type;
            if (i == 3) {
                return FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        return Double.parseDouble(asString());
                    }
                    if (i == 6) {
                        ReadBuf readBuf = this.bb;
                        return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                    }
                    if (i == 7) {
                        ReadBuf readBuf2 = this.bb;
                        return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                    }
                    if (i == 8) {
                        ReadBuf readBuf3 = this.bb;
                        return FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                    }
                    if (i == 10) {
                        return asVector().size();
                    }
                    if (i != 26) {
                        return 0.0d;
                    }
                }
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (isKey()) {
                ReadBuf readBuf = this.bb;
                return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Key.empty();
        }

        public String asString() {
            if (isString()) {
                int indirect = FlexBuffers.indirect(this.bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.bb;
                int i = this.byteWidth;
                return this.bb.getString(indirect, (int) FlexBuffers.readUInt(readBuf, indirect - i, i));
            }
            if (isKey()) {
                int indirect2 = FlexBuffers.indirect(this.bb, this.end, this.byteWidth);
                int i2 = indirect2;
                while (this.bb.get(i2) != 0) {
                    i2++;
                }
                return this.bb.getString(indirect2, i2 - indirect2);
            }
            return "";
        }

        public Map asMap() {
            if (isMap()) {
                ReadBuf readBuf = this.bb;
                return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Map.empty();
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i = this.type;
            if (i == 15) {
                ReadBuf readBuf2 = this.bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (FlexBuffers.isTypedVector(i)) {
                ReadBuf readBuf3 = this.bb;
                return new TypedVector(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
            }
            return Vector.empty();
        }

        public Blob asBlob() {
            if (isBlob() || isString()) {
                ReadBuf readBuf = this.bb;
                return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Blob.empty();
        }

        public boolean asBoolean() {
            return isBoolean() ? this.bb.get(this.end) != 0 : asUInt() != 0;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        StringBuilder toString(StringBuilder sb) {
            int i = this.type;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append(POBCommonConstants.NULL_VALUE);
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        Key asKey = asKey();
                        sb.append('\"');
                        StringBuilder key = asKey.toString(sb);
                        key.append('\"');
                        return key;
                    case 5:
                        sb.append('\"');
                        sb.append(asString());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }
    }

    private static abstract class Object {
        ReadBuf bb;
        int byteWidth;
        int end;

        public abstract StringBuilder toString(StringBuilder sb);

        Object(ReadBuf readBuf, int i, int i2) {
            this.bb = readBuf;
            this.end = i;
            this.byteWidth = i2;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }
    }

    private static abstract class Sized extends Object {
        protected final int size;

        Sized(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.size = FlexBuffers.readInt(this.bb, i - i2, i2);
        }

        public int size() {
            return this.size;
        }
    }

    public static class Blob extends Sized {
        static final Blob EMPTY = new Blob(FlexBuffers.EMPTY_BB, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        Blob(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Blob empty() {
            return EMPTY;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.bb.getString(this.end, size()));
            sb.append('\"');
            return sb;
        }
    }

    public static class Key extends Object {
        private static final Key EMPTY = new Key(FlexBuffers.EMPTY_BB, 0, 0);

        Key(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Key empty() {
            return EMPTY;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i = this.end;
            while (this.bb.get(i) != 0) {
                i++;
            }
            int i2 = this.end;
            return this.bb.getString(i2, i - i2);
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.end == this.end && key.byteWidth == this.byteWidth;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }
    }

    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        Map(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public KeyVector keys() {
            int i = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.bb;
            int indirect = FlexBuffers.indirect(readBuf, i, this.byteWidth);
            ReadBuf readBuf2 = this.bb;
            int i2 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, indirect, FlexBuffers.readInt(readBuf2, i + i2, i2), 4));
        }

        public Vector values() {
            return new Vector(this.bb, this.end, this.byteWidth);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keys = keys();
            int size = size();
            Vector values = values();
            for (int i = 0; i < size; i++) {
                sb.append('\"');
                sb.append(keys.get(i).toString());
                sb.append("\" : ");
                sb.append(values.get(i).toString());
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }
    }

    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        Vector(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).toString(sb);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        public Reference get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.bb, this.end + (i * this.byteWidth), this.byteWidth, Unsigned.byteToUnsignedInt(this.bb.get((int) (this.end + (size * this.byteWidth) + j))));
        }
    }

    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        TypedVector(ReadBuf readBuf, int i, int i2, int i3) {
            super(readBuf, i, i2);
            this.elemType = i3;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i) {
            if (i >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.bb, this.end + (i * this.byteWidth), this.byteWidth, 1, this.elemType);
        }
    }

    public static class KeyVector {
        private final TypedVector vec;

        KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i) {
            if (i >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i2 = typedVector.end + (i * typedVector.byteWidth);
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i2, typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < this.vec.size(); i++) {
                this.vec.get(i).toString(sb);
                if (i != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append(X3.j.e);
            return sb.toString();
        }
    }

    public static class FlexBufferException extends RuntimeException {
        FlexBufferException(String str) {
            super(str);
        }
    }
}
