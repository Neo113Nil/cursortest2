package com.squareup.moshi;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;

/* loaded from: classes9.dex */
public final class JsonValueReader extends JsonReader {
    public static final Object JSON_READER_CLOSED = new Object();
    public Object[] stack;

    public final class JsonIterator implements Iterator, Cloneable {

        /* renamed from: array, reason: collision with root package name */
        public final Object[] f1223array;
        public final JsonReader.Token endToken;
        public int next;

        public JsonIterator(JsonReader.Token token, Object[] objArr, int i) {
            this.endToken = token;
            this.f1223array = objArr;
            this.next = i;
        }

        public final Object clone() {
            return new JsonIterator(this.endToken, this.f1223array, this.next);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.next < this.f1223array.length;
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = this.next;
            this.next = i + 1;
            return this.f1223array[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public JsonValueReader(Object obj) {
        int[] iArr = this.scopes;
        int i = this.stackSize;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        this.stack = objArr;
        this.stackSize = i + 1;
        objArr[i] = obj;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginArray() {
        List list = (List) require(List.class, JsonReader.Token.BEGIN_ARRAY);
        JsonIterator jsonIterator = new JsonIterator(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.stack;
        int i = this.stackSize;
        objArr[i - 1] = jsonIterator;
        this.scopes[i - 1] = 1;
        this.pathIndices[i - 1] = 0;
        if (jsonIterator.hasNext()) {
            push(jsonIterator.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginObject() {
        Map map = (Map) require(Map.class, JsonReader.Token.BEGIN_OBJECT);
        JsonIterator jsonIterator = new JsonIterator(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.stack;
        int i = this.stackSize;
        objArr[i - 1] = jsonIterator;
        this.scopes[i - 1] = 3;
        if (jsonIterator.hasNext()) {
            push(jsonIterator.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill(this.stack, 0, this.stackSize, (Object) null);
        this.stack[0] = JSON_READER_CLOSED;
        this.scopes[0] = 8;
        this.stackSize = 1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endArray() {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        JsonIterator jsonIterator = (JsonIterator) require(JsonIterator.class, token);
        if (jsonIterator.endToken != token || jsonIterator.hasNext()) {
            throw typeMismatch(jsonIterator, token);
        }
        remove();
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endObject() {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        JsonIterator jsonIterator = (JsonIterator) require(JsonIterator.class, token);
        if (jsonIterator.endToken != token || jsonIterator.hasNext()) {
            throw typeMismatch(jsonIterator, token);
        }
        this.pathNames[this.stackSize - 1] = null;
        remove();
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean hasNext() {
        int i = this.stackSize;
        if (i == 0) {
            return false;
        }
        Object obj = this.stack[i - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean nextBoolean() {
        Boolean bool = (Boolean) require(Boolean.class, JsonReader.Token.BOOLEAN);
        remove();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.JsonReader
    public final double nextDouble() {
        double parseDouble;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object require = require(Object.class, token);
        if (require instanceof Number) {
            parseDouble = ((Number) require).doubleValue();
        } else {
            if (!(require instanceof String)) {
                throw typeMismatch(require, token);
            }
            try {
                parseDouble = Double.parseDouble((String) require);
            } catch (NumberFormatException unused) {
                throw typeMismatch(require, token);
            }
        }
        if (this.lenient || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            remove();
            return parseDouble;
        }
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("JSON forbids NaN and infinities: ", " at path ", parseDouble);
        m.append(getPath());
        throw new JsonEncodingException(m.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final int nextInt() {
        int intValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object require = require(Object.class, token);
        if (require instanceof Number) {
            intValueExact = ((Number) require).intValue();
        } else {
            if (!(require instanceof String)) {
                throw typeMismatch(require, token);
            }
            try {
                try {
                    intValueExact = Integer.parseInt((String) require);
                } catch (NumberFormatException unused) {
                    throw typeMismatch(require, token);
                }
            } catch (NumberFormatException unused2) {
                intValueExact = new BigDecimal((String) require).intValueExact();
            }
        }
        remove();
        return intValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public final long nextLong() {
        long longValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object require = require(Object.class, token);
        if (require instanceof Number) {
            longValueExact = ((Number) require).longValue();
        } else {
            if (!(require instanceof String)) {
                throw typeMismatch(require, token);
            }
            try {
                try {
                    longValueExact = Long.parseLong((String) require);
                } catch (NumberFormatException unused) {
                    throw typeMismatch(require, token);
                }
            } catch (NumberFormatException unused2) {
                longValueExact = new BigDecimal((String) require).longValueExact();
            }
        }
        remove();
        return longValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextName() {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) require(Map.Entry.class, token);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw typeMismatch(key, token);
        }
        String str = (String) key;
        this.stack[this.stackSize - 1] = entry.getValue();
        this.pathNames[this.stackSize - 2] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void nextNull() {
        require(Void.class, JsonReader.Token.NULL);
        remove();
    }

    @Override // com.squareup.moshi.JsonReader
    public final BufferedSource nextSource() {
        Object readJsonValue = readJsonValue();
        Buffer buffer = new Buffer();
        JsonUtf8Writer jsonUtf8Writer = new JsonUtf8Writer(buffer);
        try {
            jsonUtf8Writer.jsonValue(readJsonValue);
            jsonUtf8Writer.close();
            return buffer;
        } catch (Throwable th) {
            try {
                jsonUtf8Writer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextString() {
        int i = this.stackSize;
        Object obj = i != 0 ? this.stack[i - 1] : null;
        if (obj instanceof String) {
            remove();
            return (String) obj;
        }
        if (obj instanceof Number) {
            remove();
            return obj.toString();
        }
        if (obj != JSON_READER_CLOSED) {
            throw typeMismatch(obj, JsonReader.Token.STRING);
        }
        a$$ExternalSyntheticBUOutline0.m$1("JsonReader is closed");
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public final JsonReader.Token peek() {
        int i = this.stackSize;
        if (i == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.stack[i - 1];
        if (obj instanceof JsonIterator) {
            return ((JsonIterator) obj).endToken;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj != JSON_READER_CLOSED) {
            throw typeMismatch(obj, "a JSON value");
        }
        a$$ExternalSyntheticBUOutline0.m$1("JsonReader is closed");
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public final JsonReader peekJson() {
        JsonValueReader jsonValueReader = new JsonValueReader((JsonReader) this);
        jsonValueReader.stack = (Object[]) this.stack.clone();
        for (int i = 0; i < jsonValueReader.stackSize; i++) {
            Object[] objArr = jsonValueReader.stack;
            Object obj = objArr[i];
            if (obj instanceof JsonIterator) {
                JsonIterator jsonIterator = (JsonIterator) obj;
                objArr[i] = new JsonIterator(jsonIterator.endToken, jsonIterator.f1223array, jsonIterator.next);
            }
        }
        return jsonValueReader;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void promoteNameToValue() {
        if (hasNext()) {
            push(nextName());
        }
    }

    public final void push(Object obj) {
        int i = this.stackSize;
        if (i == this.stack.length) {
            if (i == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(getPath()));
            }
            int[] iArr = this.scopes;
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.stack;
            this.stack = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.stack;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        objArr2[i2] = obj;
    }

    public final void remove() {
        int i = this.stackSize;
        int i2 = i - 1;
        this.stackSize = i2;
        Object[] objArr = this.stack;
        objArr[i2] = null;
        this.scopes[i2] = 0;
        if (i2 > 0) {
            int[] iArr = this.pathIndices;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            Object obj = objArr[i - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    push(it.next());
                }
            }
        }
    }

    public final Object require(Class cls, JsonReader.Token token) {
        int i = this.stackSize;
        Object obj = i != 0 ? this.stack[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == JsonReader.Token.NULL) {
            return null;
        }
        if (obj != JSON_READER_CLOSED) {
            throw typeMismatch(obj, token);
        }
        a$$ExternalSyntheticBUOutline0.m$1("JsonReader is closed");
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectName(JsonReader.Options options) {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) require(Map.Entry.class, token);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw typeMismatch(key, token);
        }
        String str = (String) key;
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (options.strings[i].equals(str)) {
                this.stack[this.stackSize - 1] = entry.getValue();
                this.pathNames[this.stackSize - 2] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectString(JsonReader.Options options) {
        int i = this.stackSize;
        Object obj = i != 0 ? this.stack[i - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != JSON_READER_CLOSED) {
                return -1;
            }
            a$$ExternalSyntheticBUOutline0.m$1("JsonReader is closed");
            return 0;
        }
        String str = (String) obj;
        int length = options.strings.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (options.strings[i2].equals(str)) {
                remove();
                return i2;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipName() {
        if (!this.failOnUnknown) {
            this.stack[this.stackSize - 1] = ((Map.Entry) require(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.pathNames[this.stackSize - 2] = "null";
            return;
        }
        JsonReader.Token peek = peek();
        nextName();
        StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
        sb.append(peek);
        String path = getPath();
        sb.append(" at ");
        sb.append(path);
        throw new JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipValue() {
        if (this.failOnUnknown) {
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(peek());
            String path = getPath();
            sb.append(" at ");
            sb.append(path);
            throw new JsonDataException(sb.toString());
        }
        int i = this.stackSize;
        if (i > 1) {
            this.pathNames[i - 2] = "null";
        }
        Object obj = i != 0 ? this.stack[i - 1] : null;
        if (obj instanceof JsonIterator) {
            StringBuilder sb2 = new StringBuilder("Expected a value but was ");
            sb2.append(peek());
            String path2 = getPath();
            sb2.append(" at path ");
            sb2.append(path2);
            throw new JsonDataException(sb2.toString());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.stack;
            int i2 = i - 1;
            objArr[i2] = ((Map.Entry) objArr[i2]).getValue();
        } else {
            if (i > 0) {
                remove();
                return;
            }
            StringBuilder sb3 = new StringBuilder("Expected a value but was ");
            sb3.append(peek());
            String path3 = getPath();
            sb3.append(" at path ");
            sb3.append(path3);
            throw new JsonDataException(sb3.toString());
        }
    }
}
