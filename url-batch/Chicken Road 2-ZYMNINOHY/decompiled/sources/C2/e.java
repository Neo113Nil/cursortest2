package C2;

import A2.f;
import A2.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements A2.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f273a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f274b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f275c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f276d;

    /* renamed from: e, reason: collision with root package name */
    public final A2.d f277e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f278f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z) {
        this.f274b = new JsonWriter(bufferedWriter);
        this.f275c = hashMap;
        this.f276d = hashMap2;
        this.f277e = aVar;
        this.f278f = z;
    }

    @Override // A2.e
    public final A2.e a(A2.c cVar, Object obj) {
        f(obj, cVar.f66a);
        return this;
    }

    @Override // A2.e
    public final A2.e b(A2.c cVar, long j4) {
        String str = cVar.f66a;
        g();
        JsonWriter jsonWriter = this.f274b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j4);
        return this;
    }

    @Override // A2.g
    public final g c(String str) {
        g();
        this.f274b.value(str);
        return this;
    }

    @Override // A2.g
    public final g d(boolean z) {
        g();
        this.f274b.value(z);
        return this;
    }

    public final e e(Object obj) {
        JsonWriter jsonWriter = this.f274b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f(entry.getValue(), (String) key);
                    } catch (ClassCastException e4) {
                        throw new A2.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            A2.d dVar = (A2.d) this.f275c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f276d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                g();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.f277e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            g();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i4 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i4 < length) {
                jsonWriter.value(r6[i4]);
                i4++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i4 < length2) {
                long j4 = jArr[i4];
                g();
                jsonWriter.value(j4);
                i4++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i4 < length3) {
                jsonWriter.value(dArr[i4]);
                i4++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i4 < length4) {
                jsonWriter.value(zArr[i4]);
                i4++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i4 < length5) {
                e(numberArr[i4]);
                i4++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i4 < length6) {
                e(objArr[i4]);
                i4++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e f(Object obj, String str) {
        boolean z = this.f278f;
        JsonWriter jsonWriter = this.f274b;
        if (z) {
            if (obj == null) {
                return this;
            }
            g();
            jsonWriter.name(str);
            e(obj);
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        e(obj);
        return this;
    }

    public final void g() {
        if (!this.f273a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
