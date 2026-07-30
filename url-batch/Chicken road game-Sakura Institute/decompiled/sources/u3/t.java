package u3;

import a2.f0;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import s1.l2;
import t3.b0;
import t3.h0;
import w.j0;
import w.z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class t {
    public static final y0.d a(long j8, long j9) {
        return new y0.d(y0.c.d(j8), y0.c.e(j8), y0.f.d(j9) + y0.c.d(j8), y0.f.b(j9) + y0.c.e(j8));
    }

    public static final b0 b(Context context) {
        r6.k.f(context, "context");
        b0 b0Var = new b0(context);
        h0 h0Var = b0Var.f8766v;
        h0Var.a(new g(h0Var));
        b0Var.f8766v.a(new i());
        b0Var.f8766v.a(new p());
        return b0Var;
    }

    public static final long c(j0 j0Var, y0.d dVar, y0.d dVar2, int i7) {
        long g9 = g(j0Var, dVar, i7);
        if (a2.j0.b(g9)) {
            return a2.j0.f406b;
        }
        long g10 = g(j0Var, dVar2, i7);
        if (a2.j0.b(g10)) {
            return a2.j0.f406b;
        }
        int i8 = (int) (g9 >> 32);
        int i9 = (int) (g10 & 4294967295L);
        return r4.a.h(Math.min(i8, i8), Math.max(i9, i9));
    }

    public static final boolean d(a2.h0 h0Var, int i7) {
        int e9 = h0Var.e(i7);
        return i7 == h0Var.h(e9) || i7 == h0Var.d(e9, false) ? h0Var.i(i7) != h0Var.a(i7) : h0Var.a(i7) != h0Var.a(i7 - 1);
    }

    public static final Bundle e(d6.j... jVarArr) {
        Bundle bundle = new Bundle(jVarArr.length);
        for (d6.j jVar : jVarArr) {
            String str = (String) jVar.f2618f;
            Object obj = jVar.f2619g;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                r6.k.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                x2.a.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                x2.a.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final int f(a2.o oVar, long j8, l2 l2Var) {
        float f9 = l2Var != null ? l2Var.f() : 0.0f;
        int c4 = oVar.c(y0.c.e(j8));
        if (y0.c.e(j8) < oVar.d(c4) - f9 || y0.c.e(j8) > oVar.b(c4) + f9 || y0.c.d(j8) < (-f9) || y0.c.d(j8) > oVar.f427d + f9) {
            return -1;
        }
        return c4;
    }

    public static final long g(j0 j0Var, y0.d dVar, int i7) {
        z0 d8 = j0Var.d();
        a2.o oVar = d8 != null ? d8.f9471a.f389b : null;
        p1.p c4 = j0Var.c();
        return (oVar == null || c4 == null) ? a2.j0.f406b : oVar.f(dVar.h(c4.M(0L)), i7, f0.f372b);
    }

    public static final boolean h(int i7) {
        int type = Character.getType(i7);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean i(int i7) {
        return Character.isWhitespace(i7) || i7 == 160;
    }

    public static final boolean j(int i7) {
        int type;
        return (!i(i7) || (type = Character.getType(i7)) == 14 || type == 13 || i7 == 10) ? false : true;
    }

    public static HashMap k(String str) {
        try {
            return q(new JSONObject(str));
        } catch (JSONException e9) {
            throw new IOException(e9);
        }
    }

    public static final Cursor l(androidx.room.u uVar, y3.d dVar) {
        r6.k.f(uVar, "db");
        r6.k.f(dVar, "sqLiteQuery");
        return uVar.query(dVar, (CancellationSignal) null);
    }

    public static String m(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e9) {
                throw new IOException("Could not serialize number", e9);
            }
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            n(obj, jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException e10) {
            throw new IOException("Failed to serialize JSON", e10);
        }
    }

    public static void n(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                n(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
            return;
        }
        if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
            return;
        }
        jSONStringer.array();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            n(it.next(), jSONStringer);
        }
        jSONStringer.endArray();
    }

    public static final d6.s o(String str) {
        int i7;
        v1.g.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        if (r6.k.g(charAt, 48) < 0) {
            i7 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i7 = 0;
        }
        int i9 = 119304647;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            int i10 = i8 ^ Integer.MIN_VALUE;
            if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                if (i9 != 119304647) {
                    return null;
                }
                i9 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i11 = i8 * 10;
            int i12 = digit + i11;
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i7++;
            i8 = i12;
        }
        return new d6.s(i8);
    }

    public static Object p(Object obj) {
        if (obj instanceof JSONObject) {
            return q((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj.equals(JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            arrayList.add(p(jSONArray.get(i7)));
        }
        return arrayList;
    }

    public static HashMap q(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, p(jSONObject.get(next)));
        }
        return hashMap;
    }
}
