package p8;

import a.AbstractC0415a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import c8.q;
import c8.r;
import com.google.android.gms.internal.ads.CL;
import com.google.android.gms.internal.ads.Yt;
import e8.t;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s7.C5003c;
import t2.C;
import u1.u;
import w6.C5174a;
import w6.C5175b;
import w6.C5177d;

/* loaded from: classes2.dex */
public abstract class g {
    public static final void a(r rVar) {
        kotlin.jvm.internal.h.e(rVar, "<this>");
        if ((rVar instanceof r ? rVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + s.a(rVar.getClass()));
    }

    public static Object b(int i, Object obj) {
        if (i != Integer.MAX_VALUE) {
            if (obj instanceof List) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(b(i, it.next()));
                }
                return arrayList;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                return str.length() < i ? obj : str.substring(0, i);
            }
        }
        return obj;
    }

    public static final q c(Z7.b bVar) {
        kotlin.jvm.internal.h.e(bVar, "<this>");
        q qVar = bVar instanceof q ? (q) bVar : null;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + s.a(bVar.getClass()));
    }

    public static C5003c d(C5003c c5003c) {
        c5003c.g();
        c5003c.f40501v = true;
        return c5003c.f40500u > 0 ? c5003c : C5003c.f40498w;
    }

    public static void e(int i) {
        if (2 > i || i >= 37) {
            StringBuilder l9 = CL.l(i, "radix ", " was not in valid range ");
            l9.append(new J7.c(2, 36, 1));
            throw new IllegalArgumentException(l9.toString());
        }
    }

    public static final boolean f(char c4, char c9, boolean z8) {
        if (c4 == c9) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c9);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static A6.b g(String rootDir, long j9) {
        kotlin.jvm.internal.h.e(rootDir, "rootDir");
        File file = new File(rootDir);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(30L);
        timeUnit.toMillis(33L);
        TimeUnit.HOURS.toMillis(18L);
        byte b9 = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) 8) | 16)) | 1)) | 2)) | 4)) | 1)) | 2);
        int i = N7.a.f2200w;
        N7.c unit = N7.c.f2208y;
        kotlin.jvm.internal.h.e(unit, "unit");
        long p6 = unit.compareTo(N7.c.f2206w) <= 0 ? AbstractC0415a.p(com.bumptech.glide.d.f(72, unit, N7.c.f2204u)) : AbstractC0415a.D(72, unit);
        long f6 = ((((int) p6) & 1) != 1 || N7.a.d(p6)) ? N7.a.f(p6, N7.c.f2205v) : p6 >> 1;
        byte b10 = (byte) (b9 | 4);
        if (b10 == 31) {
            A6.a aVar = new A6.a(com.anythink.basead.exoplayer.i.a.f8040f, j9, f6);
            if (j9 <= com.anythink.basead.exoplayer.i.a.f8040f) {
                throw new IllegalArgumentException("The configured max file age for writing must be lower than the configured min file age for reading");
            }
            if (file.isFile()) {
                throw new IllegalArgumentException("destinationDir must be a directory");
            }
            if (file.exists() || file.mkdirs()) {
                return new A6.b(new C5174a(new C5177d(new C5175b(file, aVar)), new u(1)));
            }
            throw new IllegalStateException("Could not create dir: " + file);
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" maxFileAgeForWriteMillis");
        }
        if ((b10 & 2) == 0) {
            sb.append(" minFileAgeForReadMillis");
        }
        if ((b10 & 4) == 0) {
            sb.append(" maxFileAgeForReadMillis");
        }
        if ((b10 & 8) == 0) {
            sb.append(" maxFileSize");
        }
        if ((b10 & 16) == 0) {
            sb.append(" maxFolderSize");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public static SharedPreferences h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final boolean j(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }

    public static List k(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static F.d l(String statusLine) {
        t tVar;
        int i;
        String str;
        kotlin.jvm.internal.h.e(statusLine, "statusLine");
        if (M7.q.I(statusLine, "HTTP/1.")) {
            i = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt == 0) {
                tVar = t.f37502v;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                tVar = t.f37503w;
            }
        } else if (M7.q.I(statusLine, "ICY ")) {
            tVar = t.f37502v;
            i = 4;
        } else {
            if (!M7.q.I(statusLine, "SOURCETABLE ")) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            tVar = t.f37503w;
            i = 12;
        }
        int i4 = i + 3;
        if (statusLine.length() < i4) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String substring = statusLine.substring(i, i4);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        Integer J = M7.q.J(substring);
        if (J == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int intValue = J.intValue();
        if (statusLine.length() <= i4) {
            str = "";
        } else {
            if (statusLine.charAt(i4) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            str = statusLine.substring(i + 4);
            kotlin.jvm.internal.h.d(str, "substring(...)");
        }
        return new F.d(tVar, intValue, str);
    }

    public static List p(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static ArrayList q(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONObject r(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, s(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, r(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray s(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(s(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(r(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static void t(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    t(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    u(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e6) {
            throw new IOException(e6);
        }
    }

    public static void u(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    t(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    u(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e6) {
            throw new IOException(e6);
        }
    }

    public static JSONObject v(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static Bundle w(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj = null;
                        for (int i4 = 0; obj == null && i4 < length; i4++) {
                            obj = !jSONArray.isNull(i4) ? jSONArray.opt(i4) : null;
                        }
                        if (obj == null) {
                            String valueOf = String.valueOf(next);
                            int i9 = C.f40822b;
                            u2.i.f("Expected JSONArray with at least 1 non-null element for key:".concat(valueOf));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? w(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            String str = "JSONArray with unsupported type " + obj.getClass().getCanonicalName() + " for key:" + next;
                            int i10 = C.f40822b;
                            u2.i.f(str);
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, w((JSONObject) opt));
                } else {
                    String valueOf2 = String.valueOf(next);
                    int i11 = C.f40822b;
                    u2.i.f("Unsupported type for key:".concat(valueOf2));
                }
            }
        }
        return bundle;
    }

    public static String x(Yt yt) {
        if (yt == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            y(jsonWriter, yt);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e6) {
            int i = C.f40822b;
            u2.i.d("Error when writing JSON.", e6);
            return null;
        }
    }

    public static void y(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof Yt) {
            t(jsonWriter, ((Yt) obj).f28909d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                y(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                y(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static JSONObject z(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    public abstract void i();

    public abstract void n(boolean z8);

    public abstract void o();

    public void m(boolean z8) {
    }
}
