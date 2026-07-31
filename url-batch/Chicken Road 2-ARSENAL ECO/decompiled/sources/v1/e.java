package v1;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t1.C0655b;
import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;
import t1.InterfaceC0659f;
import t1.InterfaceC0660g;

/* loaded from: classes.dex */
public final class e implements InterfaceC0658e, InterfaceC0660g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6117a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f6118b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6119c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6120d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0657d f6121e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6122f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, C0703a c0703a, boolean z5) {
        this.f6118b = new JsonWriter(bufferedWriter);
        this.f6119c = hashMap;
        this.f6120d = hashMap2;
        this.f6121e = c0703a;
        this.f6122f = z5;
    }

    @Override // t1.InterfaceC0658e
    public final InterfaceC0658e a(C0656c c0656c, Object obj) {
        g(obj, c0656c.f5958a);
        return this;
    }

    @Override // t1.InterfaceC0660g
    public final InterfaceC0660g b(String str) {
        h();
        this.f6118b.value(str);
        return this;
    }

    @Override // t1.InterfaceC0660g
    public final InterfaceC0660g c(boolean z5) {
        h();
        this.f6118b.value(z5);
        return this;
    }

    @Override // t1.InterfaceC0658e
    public final InterfaceC0658e d(C0656c c0656c, int i7) {
        String str = c0656c.f5958a;
        h();
        JsonWriter jsonWriter = this.f6118b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i7);
        return this;
    }

    @Override // t1.InterfaceC0658e
    public final InterfaceC0658e e(C0656c c0656c, long j4) {
        String str = c0656c.f5958a;
        h();
        JsonWriter jsonWriter = this.f6118b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j4);
        return this;
    }

    public final e f(Object obj) {
        JsonWriter jsonWriter = this.f6118b;
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
                    } catch (ClassCastException e4) {
                        throw new C0655b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC0657d interfaceC0657d = (InterfaceC0657d) this.f6119c.get(obj.getClass());
            if (interfaceC0657d != null) {
                jsonWriter.beginObject();
                interfaceC0657d.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC0659f interfaceC0659f = (InterfaceC0659f) this.f6120d.get(obj.getClass());
            if (interfaceC0659f != null) {
                interfaceC0659f.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.f6121e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i7 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i7 < length) {
                jsonWriter.value(r6[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                long j4 = jArr[i7];
                h();
                jsonWriter.value(j4);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                jsonWriter.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                jsonWriter.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i7 < length5) {
                f(numberArr[i7]);
                i7++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i7 < length6) {
                f(objArr[i7]);
                i7++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e g(Object obj, String str) {
        boolean z5 = this.f6122f;
        JsonWriter jsonWriter = this.f6118b;
        if (z5) {
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
        if (!this.f6117a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
