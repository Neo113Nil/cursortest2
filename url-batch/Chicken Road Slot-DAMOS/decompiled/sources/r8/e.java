package r8;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.i0;
import p8.f;
import p8.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements p8.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8221a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f8222b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f8223c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f8224d;

    /* renamed from: e, reason: collision with root package name */
    public final p8.d f8225e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8226f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f8222b = new JsonWriter(bufferedWriter);
        this.f8223c = hashMap;
        this.f8224d = hashMap2;
        this.f8225e = aVar;
        this.f8226f = z10;
    }

    @Override // p8.e
    public final p8.e a(p8.c cVar, Object obj) {
        g(obj, cVar.f7689a);
        return this;
    }

    @Override // p8.g
    public final g b(String str) {
        h();
        this.f8222b.value(str);
        return this;
    }

    @Override // p8.e
    public final p8.e c(p8.c cVar, long j) {
        String str = cVar.f7689a;
        h();
        JsonWriter jsonWriter = this.f8222b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    @Override // p8.g
    public final g d(boolean z10) {
        h();
        this.f8222b.value(z10);
        return this;
    }

    @Override // p8.e
    public final p8.e e(p8.c cVar, int i3) {
        String str = cVar.f7689a;
        h();
        JsonWriter jsonWriter = this.f8222b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i3);
        return this;
    }

    public final e f(Object obj) {
        JsonWriter jsonWriter = this.f8222b;
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
                    } catch (ClassCastException e2) {
                        throw new p8.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            p8.d dVar = (p8.d) this.f8223c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f8224d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.f8225e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i3 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i3 < length) {
                jsonWriter.value(r6[i3]);
                i3++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i3 < length2) {
                long j = jArr[i3];
                h();
                jsonWriter.value(j);
                i3++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i3 < length3) {
                jsonWriter.value(dArr[i3]);
                i3++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i3 < length4) {
                jsonWriter.value(zArr[i3]);
                i3++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i3 < length5) {
                f(numberArr[i3]);
                i3++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i3 < length6) {
                f(objArr[i3]);
                i3++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e g(Object obj, String str) {
        boolean z10 = this.f8226f;
        JsonWriter jsonWriter = this.f8222b;
        if (z10) {
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
        if (this.f8221a) {
            return;
        }
        i0.l("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
