package com.squareup.moshi;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.Cache$RealCacheRequest$1;
import okio.Buffer;
import okio.RealBufferedSink;

/* loaded from: classes9.dex */
public final class JsonValueWriter extends JsonWriter {
    public String deferredName;
    public Object[] stack = new Object[32];

    public JsonValueWriter() {
        pushScope(6);
    }

    public final void add(Object obj) {
        String str;
        Object put;
        int peekScope = peekScope();
        int i = this.stackSize;
        if (i == 1) {
            if (peekScope != 6) {
                a$$ExternalSyntheticBUOutline0.m$1("JSON must have only one top-level value.");
                return;
            }
            int i2 = i - 1;
            this.scopes[i2] = 7;
            this.stack[i2] = obj;
            return;
        }
        if (peekScope == 3 && (str = this.deferredName) != null) {
            if ((obj != null || this.serializeNulls) && (put = ((Map) this.stack[i - 1]).put(str, obj)) != null) {
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Map key '", this.deferredName, "' has multiple values at path ", getPath(), ": ", put, " and ", obj);
                return;
            } else {
                this.deferredName = null;
                return;
            }
        }
        if (peekScope == 1) {
            ((List) this.stack[i - 1]).add(obj);
        } else if (peekScope == 9) {
            a$$ExternalSyntheticBUOutline0.m$1("Sink from valueSink() was not closed");
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter beginArray() {
        if (this.promoteValueToName) {
            a$$ExternalSyntheticBUOutline0.m$1("Array cannot be used as a map key in JSON at path ".concat(getPath()));
            return null;
        }
        int i = this.stackSize;
        int i2 = this.flattenStackSize;
        if (i == i2 && this.scopes[i - 1] == 1) {
            this.flattenStackSize = ~i2;
            return this;
        }
        checkStack();
        ArrayList arrayList = new ArrayList();
        add(arrayList);
        Object[] objArr = this.stack;
        int i3 = this.stackSize;
        objArr[i3] = arrayList;
        this.pathIndices[i3] = 0;
        pushScope(1);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter beginObject() {
        if (this.promoteValueToName) {
            a$$ExternalSyntheticBUOutline0.m$1("Object cannot be used as a map key in JSON at path ".concat(getPath()));
            return null;
        }
        int i = this.stackSize;
        int i2 = this.flattenStackSize;
        if (i == i2 && this.scopes[i - 1] == 3) {
            this.flattenStackSize = ~i2;
            return this;
        }
        checkStack();
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        add(linkedHashTreeMap);
        this.stack[this.stackSize] = linkedHashTreeMap;
        pushScope(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.stackSize;
        if (i > 1 || (i == 1 && this.scopes[i - 1] != 7)) {
            a$$ExternalSyntheticBUOutline0.m$4("Incomplete document");
        } else {
            this.stackSize = 0;
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter endArray() {
        if (peekScope() != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
            return null;
        }
        int i = this.stackSize;
        int i2 = ~this.flattenStackSize;
        if (i == i2) {
            this.flattenStackSize = i2;
            return this;
        }
        int i3 = i - 1;
        this.stackSize = i3;
        this.stack[i3] = null;
        int[] iArr = this.pathIndices;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter endObject() {
        if (peekScope() != 3) {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
            return null;
        }
        if (this.deferredName != null) {
            a$$ExternalSyntheticBUOutline0.m$2(this.deferredName, "Dangling name: ");
            return null;
        }
        int i = this.stackSize;
        int i2 = ~this.flattenStackSize;
        if (i == i2) {
            this.flattenStackSize = i2;
            return this;
        }
        this.promoteValueToName = false;
        int i3 = i - 1;
        this.stackSize = i3;
        this.stack[i3] = null;
        this.pathNames[i3] = null;
        int[] iArr = this.pathIndices;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.stackSize != 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("JsonWriter is closed.");
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
        if (peekScope() != 3 || this.deferredName != null || this.promoteValueToName) {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
            return null;
        }
        this.deferredName = str;
        this.pathNames[this.stackSize - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter nullValue() {
        if (this.promoteValueToName) {
            a$$ExternalSyntheticBUOutline0.m$1("null cannot be used as a map key in JSON at path ".concat(getPath()));
            return null;
        }
        add(null);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final Object root() {
        int i = this.stackSize;
        if (i <= 1 && (i != 1 || this.scopes[i - 1] == 7)) {
            return this.stack[0];
        }
        a$$ExternalSyntheticBUOutline0.m$1("Incomplete document");
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            value(number.longValue());
            return this;
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            value(number.doubleValue());
            return this;
        }
        if (number == null) {
            nullValue();
            return this;
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(bigDecimal.toString());
            return this;
        }
        add(bigDecimal);
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
        if (peekScope() == 9) {
            a$$ExternalSyntheticBUOutline0.m$1("Sink from valueSink() was not closed");
            return null;
        }
        pushScope(9);
        Buffer buffer = new Buffer();
        return new RealBufferedSink(new Cache$RealCacheRequest$1(this, buffer, buffer));
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(boolean z) {
        if (!this.promoteValueToName) {
            add(Boolean.valueOf(z));
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
        if (!this.promoteValueToName) {
            add(bool);
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Boolean cannot be used as a map key in JSON at path ".concat(getPath()));
        return null;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(double d) {
        if (!this.lenient && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Numeric values must be finite, but was ", d);
            return null;
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(Double.toString(d));
            return this;
        }
        add(Double.valueOf(d));
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
        add(Long.valueOf(j));
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(String str) {
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(str);
            return this;
        }
        add(str);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
