package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wb0 implements pq0, fm1 {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final oq0 e;
    public final boolean f;

    public wb0(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, sb0 sb0Var, boolean z) {
        this.b = new JsonWriter(bufferedWriter);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = sb0Var;
        this.f = z;
    }

    @Override // defpackage.pq0
    public final pq0 a(wx wxVar, Object obj) {
        g(obj, wxVar.a);
        return this;
    }

    @Override // defpackage.fm1
    public final fm1 b(String str) {
        h();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.fm1
    public final fm1 c(boolean z) {
        h();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.pq0
    public final pq0 d(wx wxVar, int i) {
        String str = wxVar.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.pq0
    public final pq0 e(wx wxVar, long j) {
        String str = wxVar.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    public final wb0 f(Object obj) {
        JsonWriter jsonWriter = this.b;
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
                    f(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new wv(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            oq0 oq0Var = (oq0) this.c.get(obj.getClass());
            if (oq0Var != null) {
                jsonWriter.beginObject();
                oq0Var.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            em1 em1Var = (em1) this.d.get(obj.getClass());
            if (em1Var != null) {
                em1Var.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                h();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                f(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                f(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final wb0 g(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return this;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        f(obj);
        return this;
    }

    public final void h() {
        if (this.a) {
            return;
        }
        dd0.j("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
