package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import okio.c;
import okio.d;
import okio.e;
import okio.m0;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    boolean failOnUnknown;
    boolean lenient;
    int stackSize;
    int[] scopes = new int[32];
    String[] pathNames = new String[32];
    int[] pathIndices = new int[32];

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public static final class a {
        final m0 doubleQuoteSuffix;
        final String[] strings;

        private a(String[] strArr, m0 m0Var) {
            this.strings = strArr;
            this.doubleQuoteSuffix = m0Var;
        }

        public static a of(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                c cVar = new c();
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    JsonReader.string(cVar, strArr[i8]);
                    cVar.readByte();
                    byteStringArr[i8] = cVar.readByteString();
                }
                return new a((String[]) strArr.clone(), m0.of(byteStringArr));
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    static {
        for (int i8 = 0; i8 <= 31; i8++) {
            REPLACEMENT_CHARS[i8] = String.format("\\u%04x", Integer.valueOf(i8));
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

    JsonReader() {
    }

    public static JsonReader of(e eVar) {
        return new b(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void string(d dVar, String str) {
        int i8;
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        dVar.writeByte(34);
        int length = str.length();
        int i9 = 0;
        while (i8 < length) {
            char charAt = str.charAt(i8);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i8 = str2 == null ? i8 + 1 : 0;
                if (i9 < i8) {
                    dVar.writeUtf8(str, i9, i8);
                }
                dVar.writeUtf8(str2);
                i9 = i8 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i9 < i8) {
                }
                dVar.writeUtf8(str2);
                i9 = i8 + 1;
            }
        }
        if (i9 < length) {
            dVar.writeUtf8(str, i9, length);
        }
        dVar.writeByte(34);
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    public final String getPath() {
        return com.airbnb.lottie.parser.moshi.a.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract boolean hasNext();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract Token peek();

    final void pushScope(int i8) {
        int i9 = this.stackSize;
        int[] iArr = this.scopes;
        if (i9 == iArr.length) {
            if (i9 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.scopes;
        int i10 = this.stackSize;
        this.stackSize = i10 + 1;
        iArr3[i10] = i8;
    }

    public abstract int selectName(a aVar);

    public abstract void skipName();

    public abstract void skipValue();

    final JsonEncodingException syntaxError(String str) {
        throw new JsonEncodingException(str + " at path " + getPath());
    }
}
