package g1;

import android.util.Base64;
import android.util.JsonWriter;
import e1.C0311b;
import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;
import e1.InterfaceC0315f;
import e1.InterfaceC0316g;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336e implements InterfaceC0314e, InterfaceC0316g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5047a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f5048b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5049c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5050d;

    /* renamed from: e, reason: collision with root package name */
    public final C0332a f5051e;
    public final boolean f;

    public C0336e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, C0332a c0332a, boolean z) {
        this.f5048b = new JsonWriter(bufferedWriter);
        this.f5049c = hashMap;
        this.f5050d = hashMap2;
        this.f5051e = c0332a;
        this.f = z;
    }

    @Override // e1.InterfaceC0314e
    public final InterfaceC0314e a(C0312c c0312c, long j3) {
        String str = c0312c.f4967a;
        g();
        JsonWriter jsonWriter = this.f5048b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j3);
        return this;
    }

    @Override // e1.InterfaceC0316g
    public final InterfaceC0316g b(String str) {
        g();
        this.f5048b.value(str);
        return this;
    }

    @Override // e1.InterfaceC0316g
    public final InterfaceC0316g c(boolean z) {
        g();
        this.f5048b.value(z);
        return this;
    }

    @Override // e1.InterfaceC0314e
    public final InterfaceC0314e d(C0312c c0312c, Object obj) {
        f(obj, c0312c.f4967a);
        return this;
    }

    public final C0336e e(Object obj) {
        JsonWriter jsonWriter = this.f5048b;
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
                    } catch (ClassCastException e3) {
                        throw new C0311b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e3);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC0313d interfaceC0313d = (InterfaceC0313d) this.f5049c.get(obj.getClass());
            if (interfaceC0313d != null) {
                jsonWriter.beginObject();
                interfaceC0313d.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC0315f interfaceC0315f = (InterfaceC0315f) this.f5050d.get(obj.getClass());
            if (interfaceC0315f != null) {
                interfaceC0315f.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f5051e.a(obj, this);
                throw null;
            }
            String name = ((Enum) obj).name();
            g();
            jsonWriter.value(name);
            return this;
        }
        if (obj instanceof byte[]) {
            g();
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
                long j3 = jArr[i3];
                g();
                jsonWriter.value(j3);
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
                e(numberArr[i3]);
                i3++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i3 < length6) {
                e(objArr[i3]);
                i3++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final C0336e f(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.f5048b;
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
        if (!this.f5047a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
