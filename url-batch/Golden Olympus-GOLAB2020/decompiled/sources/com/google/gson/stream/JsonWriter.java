package com.google.gson.stream;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import com.ironsource.mediationsdk.metadata.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public class JsonWriter implements Closeable, Flushable, AutoCloseable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final String[] REPLACEMENT_CHARS = new String[UserVerificationMethods.USER_VERIFY_PATTERN];
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            REPLACEMENT_CHARS[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.separator = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.serializeNulls = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.out = writer;
    }

    private void beforeName() {
        int peek = peek();
        if (peek == 5) {
            this.out.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() {
        int peek = peek();
        if (peek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (peek == 2) {
            this.out.append(',');
            newline();
        } else {
            if (peek == 4) {
                this.out.append((CharSequence) this.separator);
                replaceTop(5);
                return;
            }
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.lenient) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            replaceTop(7);
        }
    }

    private JsonWriter close(int i4, int i5, String str) {
        int peek = peek();
        if (peek != i5 && peek != i4) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        this.stackSize--;
        if (peek == i5) {
            newline();
        }
        this.out.write(str);
        return this;
    }

    private void newline() {
        if (this.indent == null) {
            return;
        }
        this.out.write("\n");
        int i4 = this.stackSize;
        for (int i5 = 1; i5 < i4; i5++) {
            this.out.write(this.indent);
        }
    }

    private JsonWriter open(int i4, String str) {
        beforeValue();
        push(i4);
        this.out.write(str);
        return this;
    }

    private int peek() {
        int i4 = this.stackSize;
        if (i4 != 0) {
            return this.stack[i4 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void push(int i4) {
        int i5 = this.stackSize;
        int[] iArr = this.stack;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[i5 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.stack = iArr2;
        }
        int[] iArr3 = this.stack;
        int i6 = this.stackSize;
        this.stackSize = i6 + 1;
        iArr3[i6] = i4;
    }

    private void replaceTop(int i4) {
        this.stack[this.stackSize - 1] = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void string(String str) {
        int i4;
        String str2;
        String[] strArr = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.out.write("\"");
        int length = str.length();
        int i5 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i4 = str2 == null ? i4 + 1 : 0;
                if (i5 < i4) {
                    this.out.write(str, i5, i4 - i5);
                }
                this.out.write(str2);
                i5 = i4 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i5 < i4) {
                }
                this.out.write(str2);
                i5 = i4 + 1;
            }
        }
        if (i5 < length) {
            this.out.write(str, i5, length - i5);
        }
        this.out.write("\"");
    }

    private void writeDeferredName() {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() {
        writeDeferredName();
        return open(1, b9.i.f15550d);
    }

    public JsonWriter beginObject() {
        writeDeferredName();
        return open(3, "{");
    }

    public JsonWriter endArray() {
        return close(1, 2, b9.i.f15552e);
    }

    public JsonWriter endObject() {
        return close(3, 5, "}");
    }

    public void flush() {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.out.flush();
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    public JsonWriter jsonValue(String str) {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    public JsonWriter name(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException();
        }
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.deferredName = str;
        return this;
    }

    public JsonWriter nullValue() {
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean z4) {
        this.htmlSafe = z4;
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.indent = null;
            this.separator = StringUtils.PROCESS_POSTFIX_DELIMITER;
        } else {
            this.indent = str;
            this.separator = ": ";
        }
    }

    public final void setLenient(boolean z4) {
        this.lenient = z4;
    }

    public final void setSerializeNulls(boolean z4) {
        this.serializeNulls = z4;
    }

    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public JsonWriter value(boolean z4) {
        writeDeferredName();
        beforeValue();
        this.out.write(z4 ? a.f17681g : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
        int i4 = this.stackSize;
        if (i4 <= 1 && (i4 != 1 || this.stack[i4 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? a.f17681g : "false");
        return this;
    }

    public JsonWriter value(double d4) {
        writeDeferredName();
        if (!this.lenient && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d4));
        return this;
    }

    public JsonWriter value(long j4) {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j4));
        return this;
    }

    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String obj = number.toString();
        if (!this.lenient && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        beforeValue();
        this.out.append((CharSequence) obj);
        return this;
    }
}
