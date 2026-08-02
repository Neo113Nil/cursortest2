package com.squareup.moshi;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import okio.Buffer;
import okio.BufferedSink;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSink;
import okio.Sink;
import okio.Timeout;

/* loaded from: classes.dex */
public final class JsonUtf8Writer extends JsonWriter {
    public static final String[] REPLACEMENT_CHARS = new String[128];
    public String deferredName;
    public String separator = ":";
    public final BufferedSink sink;

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public JsonUtf8Writer(BufferedSink bufferedSink) {
        if (bufferedSink == null) {
            a$$ExternalSyntheticBUOutline0.m$2("sink == null");
            throw null;
        }
        this.sink = bufferedSink;
        pushScope(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void string(BufferedSink bufferedSink, String str) {
        int i;
        String str2;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = REPLACEMENT_CHARS[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    bufferedSink.writeUtf8(i2, i, str);
                }
                bufferedSink.writeUtf8(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                bufferedSink.writeUtf8(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            bufferedSink.writeUtf8(i2, length, str);
        }
        bufferedSink.writeByte(34);
    }

    public final void beforeValue() {
        int peekScope = peekScope();
        int i = 2;
        if (peekScope != 1) {
            BufferedSink bufferedSink = this.sink;
            if (peekScope != 2) {
                if (peekScope == 4) {
                    bufferedSink.writeUtf8(this.separator);
                    i = 5;
                } else {
                    if (peekScope == 9) {
                        a$$ExternalSyntheticBUOutline0.m$1("Sink from valueSink() was not closed");
                        return;
                    }
                    if (peekScope != 6) {
                        if (peekScope != 7) {
                            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
                            return;
                        } else if (!this.lenient) {
                            a$$ExternalSyntheticBUOutline0.m$1("JSON must have only one top-level value.");
                            return;
                        }
                    }
                    i = 7;
                }
                this.scopes[this.stackSize - 1] = i;
            }
            bufferedSink.writeByte(44);
        }
        newline();
        this.scopes[this.stackSize - 1] = i;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter beginArray() {
        if (this.promoteValueToName) {
            a$$ExternalSyntheticBUOutline0.m$1("Array cannot be used as a map key in JSON at path ".concat(getPath()));
            return null;
        }
        writeDeferredName();
        open('[', 1, 2);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter beginObject() {
        if (this.promoteValueToName) {
            a$$ExternalSyntheticBUOutline0.m$1("Object cannot be used as a map key in JSON at path ".concat(getPath()));
            return null;
        }
        writeDeferredName();
        open('{', 3, 5);
        return this;
    }

    public final void close(char c, int i, int i2) {
        int peekScope = peekScope();
        if (peekScope != i2 && peekScope != i) {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
            return;
        }
        if (this.deferredName != null) {
            a$$ExternalSyntheticBUOutline0.m$2(this.deferredName, "Dangling name: ");
            return;
        }
        int i3 = this.stackSize;
        int i4 = ~this.flattenStackSize;
        if (i3 == i4) {
            this.flattenStackSize = i4;
            return;
        }
        int i5 = i3 - 1;
        this.stackSize = i5;
        this.pathNames[i5] = null;
        int[] iArr = this.pathIndices;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        if (peekScope == i2) {
            newline();
        }
        this.sink.writeByte(c);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter endArray() {
        close(']', 1, 2);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter endObject() {
        this.promoteValueToName = false;
        close('}', 3, 5);
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.stackSize != 0) {
            this.sink.flush();
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter name(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("name == null");
            return null;
        }
        if (this.stackSize == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("JsonWriter is closed.");
            return null;
        }
        int peekScope = peekScope();
        if ((peekScope != 3 && peekScope != 5) || this.deferredName != null || this.promoteValueToName) {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
            return null;
        }
        this.deferredName = str;
        this.pathNames[this.stackSize - 1] = str;
        return this;
    }

    public final void newline() {
        if (this.indent == null) {
            return;
        }
        BufferedSink bufferedSink = this.sink;
        bufferedSink.writeByte(10);
        int i = this.stackSize;
        for (int i2 = 1; i2 < i; i2++) {
            bufferedSink.writeUtf8(this.indent);
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter nullValue() {
        if (this.promoteValueToName) {
            a$$ExternalSyntheticBUOutline0.m$1("null cannot be used as a map key in JSON at path ".concat(getPath()));
            return null;
        }
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.sink.writeUtf8("null");
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void open(char c, int i, int i2) {
        int i3;
        int i4 = this.stackSize;
        int i5 = this.flattenStackSize;
        if (i4 == i5 && ((i3 = this.scopes[i4 - 1]) == i || i3 == i2)) {
            this.flattenStackSize = ~i5;
            return;
        }
        beforeValue();
        checkStack();
        pushScope(i);
        this.pathIndices[this.stackSize - 1] = 0;
        this.sink.writeByte(c);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final void setIndent(String str) {
        super.setIndent(str);
        this.separator = !str.isEmpty() ? ": " : ":";
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Number number) {
        if (number == null) {
            nullValue();
            return this;
        }
        String obj = number.toString();
        if (!this.lenient && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) number, "Numeric values must be finite, but was ");
            return null;
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(obj);
            return this;
        }
        writeDeferredName();
        beforeValue();
        this.sink.writeUtf8(obj);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final RealBufferedSink valueSink() {
        if (this.promoteValueToName) {
            a$$ExternalSyntheticBUOutline0.m$1("BufferedSink cannot be used as a map key in JSON at path ".concat(getPath()));
            return null;
        }
        writeDeferredName();
        beforeValue();
        pushScope(9);
        return new RealBufferedSink(new Sink() { // from class: com.squareup.moshi.JsonUtf8Writer.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                JsonUtf8Writer jsonUtf8Writer = JsonUtf8Writer.this;
                if (jsonUtf8Writer.peekScope() != 9) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return;
                }
                int i = jsonUtf8Writer.stackSize;
                jsonUtf8Writer.stackSize = i - 1;
                int[] iArr = jsonUtf8Writer.pathIndices;
                int i2 = i - 2;
                iArr[i2] = iArr[i2] + 1;
            }

            @Override // okio.Sink, java.io.Flushable
            public final void flush() {
                JsonUtf8Writer.this.sink.flush();
            }

            @Override // okio.Sink
            public final Timeout timeout() {
                return Timeout.NONE;
            }

            @Override // okio.Sink
            public final void write(Buffer buffer, long j) {
                JsonUtf8Writer.this.sink.write(buffer, j);
            }
        });
    }

    public final void writeDeferredName() {
        if (this.deferredName != null) {
            int peekScope = peekScope();
            BufferedSink bufferedSink = this.sink;
            if (peekScope == 5) {
                bufferedSink.writeByte(44);
            } else if (peekScope != 3) {
                a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
                return;
            }
            newline();
            this.scopes[this.stackSize - 1] = 4;
            string(bufferedSink, this.deferredName);
            this.deferredName = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.sink.close();
        int i = this.stackSize;
        if (i <= 1 && (i != 1 || this.scopes[i - 1] == 7)) {
            this.stackSize = 0;
        } else {
            a$$ExternalSyntheticBUOutline0.m$4("Incomplete document");
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(boolean z) {
        if (!this.promoteValueToName) {
            writeDeferredName();
            beforeValue();
            this.sink.writeUtf8(z ? "true" : "false");
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Boolean cannot be used as a map key in JSON at path ".concat(getPath()));
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Boolean bool) {
        if (bool == null) {
            nullValue();
            return this;
        }
        value(bool.booleanValue());
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(double d) {
        if (!this.lenient && (Double.isNaN(d) || Double.isInfinite(d))) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Numeric values must be finite, but was ", d);
            return null;
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(Double.toString(d));
            return this;
        }
        writeDeferredName();
        beforeValue();
        this.sink.writeUtf8(Double.toString(d));
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(long j) {
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(Long.toString(j));
            return this;
        }
        writeDeferredName();
        beforeValue();
        this.sink.writeUtf8(Long.toString(j));
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(String str) {
        if (str == null) {
            nullValue();
            return this;
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(str);
            return this;
        }
        writeDeferredName();
        beforeValue();
        string(this.sink, str);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
