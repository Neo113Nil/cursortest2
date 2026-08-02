package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibo implements ibh, ibj {
    public final JsonWriter a;
    private final Map b;
    private final Map c;
    private final ibg d;
    private final boolean e;

    public ibo(Writer writer, Map map, Map map2, ibg ibgVar, boolean z) {
        this.a = new JsonWriter(writer);
        this.b = map;
        this.c = map2;
        this.d = ibgVar;
        this.e = z;
    }

    @Override // defpackage.ibh
    public final void a(ibf ibfVar, long j) {
        this.a.name(ibfVar.a);
        e(j);
    }

    @Override // defpackage.ibh
    public final void b(ibf ibfVar, Object obj) {
        h(ibfVar.a, obj);
    }

    @Override // defpackage.ibj
    public final /* bridge */ /* synthetic */ void d(boolean z) {
        this.a.value(z);
    }

    public final void e(long j) {
        this.a.value(j);
    }

    @Override // defpackage.ibj
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void c(String str) {
        this.a.value(str);
    }

    final void g(ibg ibgVar, Object obj) {
        JsonWriter jsonWriter = this.a;
        jsonWriter.beginObject();
        ibgVar.a(obj, this);
        jsonWriter.endObject();
    }

    public final void h(String str, Object obj) {
        if (this.e) {
            if (obj == null) {
                return;
            }
            this.a.name(str);
            i(obj);
            return;
        }
        JsonWriter jsonWriter = this.a;
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            i(obj);
        }
    }

    public final void i(Object obj) {
        if (obj == null) {
            this.a.nullValue();
            return;
        }
        if (obj instanceof Number) {
            this.a.value((Number) obj);
            return;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                JsonWriter jsonWriter = this.a;
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (obj instanceof Map) {
                this.a.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new ibe(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.a.endObject();
                return;
            }
            ibg ibgVar = (ibg) this.b.get(obj.getClass());
            if (ibgVar != null) {
                g(ibgVar, obj);
                return;
            }
            ibi ibiVar = (ibi) this.c.get(obj.getClass());
            if (ibiVar != null) {
                ibiVar.a(obj, this);
                return;
            }
            if (!(obj instanceof Enum)) {
                g(this.d, obj);
                return;
            } else if (obj instanceof ibp) {
                this.a.value(((ibp) obj).a());
                return;
            } else {
                c(((Enum) obj).name());
                return;
            }
        }
        if (obj instanceof byte[]) {
            this.a.value(Base64.encodeToString((byte[]) obj, 2));
            return;
        }
        JsonWriter jsonWriter2 = this.a;
        jsonWriter2.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter2.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                e(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter2.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter2.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                i(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                i(objArr[i]);
                i++;
            }
        }
        jsonWriter2.endArray();
    }
}
