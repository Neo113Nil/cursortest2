package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1444f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1445a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1446b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1447c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1448d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.c f1449e;

    public G(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1445a = linkedHashMap;
        this.f1446b = new LinkedHashMap();
        this.f1447c = new LinkedHashMap();
        this.f1448d = new LinkedHashMap();
        this.f1449e = new a.f(1, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(G g2) {
        X0.f.e(g2, "this$0");
        LinkedHashMap linkedHashMap = g2.f1446b;
        X0.f.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        Iterator it = (size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : O0.t.w0(linkedHashMap) : O0.r.f695a).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = g2.f1445a;
            int i = 0;
            if (!hasNext) {
                Set<String> keySet = linkedHashMap2.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap2.get(str));
                }
                N0.c[] cVarArr = {new N0.c("keys", arrayList), new N0.c("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i < 2) {
                    N0.c cVar = cVarArr[i];
                    String str2 = (String) cVar.f670a;
                    Object obj = cVar.f671b;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        X0.f.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        G.a.a(bundle, str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        G.a.b(bundle, str2, (SizeF) obj);
                    }
                    i++;
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            Bundle a2 = ((g0.c) entry.getValue()).a();
            X0.f.e(str3, "key");
            if (a2 != null) {
                Class[] clsArr = f1444f;
                while (i < 29) {
                    Class cls = clsArr[i];
                    X0.f.b(cls);
                    if (!cls.isInstance(a2)) {
                        i++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a2.getClass() + " into saved state");
            }
            Object obj2 = g2.f1447c.get(str3);
            y yVar = obj2 instanceof y ? (y) obj2 : null;
            if (yVar != null) {
                yVar.d(a2);
            } else {
                linkedHashMap2.put(str3, a2);
            }
            f1.a aVar = (f1.a) g2.f1448d.get(str3);
            if (aVar != null) {
                ((f1.b) aVar).a(a2);
            }
        }
    }

    public G() {
        this.f1445a = new LinkedHashMap();
        this.f1446b = new LinkedHashMap();
        this.f1447c = new LinkedHashMap();
        this.f1448d = new LinkedHashMap();
        this.f1449e = new a.f(1, this);
    }
}
