package com.squareup.moshi;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.Tags;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    public boolean failOnUnknown;
    public boolean lenient;
    public int[] pathIndices;
    public String[] pathNames;
    public int[] scopes;
    public int stackSize;

    public final class Options {
        public final okio.Options doubleQuoteSuffix;
        public final String[] strings;

        public Options(String[] strArr, okio.Options options) {
            this.strings = strArr;
            this.doubleQuoteSuffix = options;
        }

        public static Options of(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    JsonUtf8Writer.string(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.readByteString(buffer.size);
                }
                String[] strArr2 = (String[]) strArr.clone();
                int i2 = okio.Options.$r8$clinit;
                return new Options(strArr2, Tags.of(byteStringArr));
            } catch (IOException e) {
                a$$ExternalSyntheticBUOutline0.m$1(e);
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Token {
        public static final /* synthetic */ Token[] $VALUES;
        public static final Token BEGIN_ARRAY;
        public static final Token BEGIN_OBJECT;
        public static final Token BOOLEAN;
        public static final Token END_ARRAY;
        public static final Token END_DOCUMENT;
        public static final Token END_OBJECT;
        public static final Token NAME;
        public static final Token NULL;
        public static final Token NUMBER;
        public static final Token STRING;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            BEGIN_ARRAY = token;
            Token token2 = new Token("END_ARRAY", 1);
            END_ARRAY = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            BEGIN_OBJECT = token3;
            Token token4 = new Token("END_OBJECT", 3);
            END_OBJECT = token4;
            Token token5 = new Token("NAME", 4);
            NAME = token5;
            Token token6 = new Token("STRING", 5);
            STRING = token6;
            Token token7 = new Token("NUMBER", 6);
            NUMBER = token7;
            Token token8 = new Token("BOOLEAN", 7);
            BOOLEAN = token8;
            Token token9 = new Token("NULL", 8);
            NULL = token9;
            Token token10 = new Token("END_DOCUMENT", 9);
            END_DOCUMENT = token10;
            $VALUES = new Token[]{token, token2, token3, token4, token5, token6, token7, token8, token9, token10};
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) $VALUES.clone();
        }
    }

    public JsonReader(JsonReader jsonReader) {
        this.stackSize = jsonReader.stackSize;
        this.scopes = (int[]) jsonReader.scopes.clone();
        this.pathNames = (String[]) jsonReader.pathNames.clone();
        this.pathIndices = (int[]) jsonReader.pathIndices.clone();
        this.lenient = jsonReader.lenient;
        this.failOnUnknown = jsonReader.failOnUnknown;
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract boolean hasNext();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract long nextLong();

    public abstract String nextName();

    public abstract void nextNull();

    public abstract BufferedSource nextSource();

    public abstract String nextString();

    public abstract Token peek();

    public abstract JsonReader peekJson();

    public abstract void promoteNameToValue();

    public final void pushScope(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.scopes;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(getPath()));
            }
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.scopes;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    public final Object readJsonValue() {
        int ordinal = peek().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            beginArray();
            while (hasNext()) {
                arrayList.add(readJsonValue());
            }
            endArray();
            return arrayList;
        }
        if (ordinal != 2) {
            if (ordinal == 5) {
                return nextString();
            }
            if (ordinal == 6) {
                return Double.valueOf(nextDouble());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(nextBoolean());
            }
            if (ordinal == 8) {
                nextNull();
                return null;
            }
            StringBuilder sb = new StringBuilder("Expected a value but was ");
            sb.append(peek());
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(sb, " at path ", getPath());
            return null;
        }
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        beginObject();
        while (hasNext()) {
            String nextName = nextName();
            Object readJsonValue = readJsonValue();
            Object put = linkedHashTreeMap.put(nextName, readJsonValue);
            if (put != null) {
                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Map key '", nextName, "' has multiple values at path ");
                m3m.append(getPath());
                m3m.append(": ");
                m3m.append(put);
                m3m.append(" and ");
                m3m.append(readJsonValue);
                throw new JsonDataException(m3m.toString());
            }
        }
        endObject();
        return linkedHashTreeMap;
    }

    public abstract int selectName(Options options);

    public abstract int selectString(Options options);

    public abstract void skipName();

    public abstract void skipValue();

    public final void syntaxError(String str) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " at path ");
        m108m.append(getPath());
        throw new JsonEncodingException(m108m.toString());
    }

    public final JsonDataException typeMismatch(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    public JsonReader() {
        this.scopes = new int[32];
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
    }
}
