package com.squareup.moshi;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.RealBufferedSink;

/* loaded from: classes.dex */
public abstract class JsonWriter implements Closeable, Flushable {
    public String indent;
    public boolean lenient;
    public boolean promoteValueToName;
    public boolean serializeNulls;
    public int stackSize = 0;
    public int[] scopes = new int[32];
    public String[] pathNames = new String[32];
    public int[] pathIndices = new int[32];
    public int flattenStackSize = -1;

    public abstract JsonWriter beginArray();

    public final int beginFlatten() {
        int peekScope = peekScope();
        if (peekScope != 5 && peekScope != 3 && peekScope != 2 && peekScope != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
            return 0;
        }
        int i = this.flattenStackSize;
        this.flattenStackSize = this.stackSize;
        return i;
    }

    public abstract JsonWriter beginObject();

    public final void checkStack() {
        int i = this.stackSize;
        int[] iArr = this.scopes;
        if (i != iArr.length) {
            return;
        }
        if (i == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.pathNames;
        this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.pathIndices;
        this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof JsonValueWriter) {
            JsonValueWriter jsonValueWriter = (JsonValueWriter) this;
            Object[] objArr = jsonValueWriter.stack;
            jsonValueWriter.stack = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    public abstract JsonWriter endArray();

    public abstract JsonWriter endObject();

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public final void jsonValue(Object obj) {
        if (obj instanceof Map) {
            beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : Boxes$$ExternalSyntheticOutline1.m(key, "Map keys must be of type String: "));
                }
                name((String) key);
                jsonValue(entry.getValue());
            }
            endObject();
            return;
        }
        if (obj instanceof List) {
            beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jsonValue(it.next());
            }
            endArray();
            return;
        }
        if (obj instanceof String) {
            value((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            value(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            value(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Number) {
            value((Number) obj);
        } else if (obj == null) {
            nullValue();
        } else {
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "Unsupported type: "));
        }
    }

    public abstract JsonWriter name(String str);

    public abstract JsonWriter nullValue();

    public final int peekScope() {
        int i = this.stackSize;
        if (i != 0) {
            return this.scopes[i - 1];
        }
        a$$ExternalSyntheticBUOutline0.m$1("JsonWriter is closed.");
        return 0;
    }

    public final void pushScope(int i) {
        int[] iArr = this.scopes;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        iArr[i2] = i;
    }

    public void setIndent(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.indent = str;
    }

    public abstract JsonWriter value(double d);

    public abstract JsonWriter value(long j);

    public abstract JsonWriter value(Boolean bool);

    public abstract JsonWriter value(Number number);

    public abstract JsonWriter value(String str);

    public abstract JsonWriter value(boolean z);

    public abstract RealBufferedSink valueSink();
}
