package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import c3.C0292d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m1.InterfaceC1306d;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f5005f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5006a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5007b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5008c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5009d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1306d f5010e;

    public B(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5006a = linkedHashMap;
        this.f5007b = new LinkedHashMap();
        this.f5008c = new LinkedHashMap();
        this.f5009d = new LinkedHashMap();
        this.f5010e = new A(0, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(B b4) {
        LinkedHashMap linkedHashMap = b4.f5006a;
        Iterator it = d3.t.G(b4.f5007b).entrySet().iterator();
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                C0292d[] c0292dArr = {new C0292d("keys", arrayList), new C0292d("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i4 < 2) {
                    C0292d c0292d = c0292dArr[i4];
                    String str2 = (String) c0292d.f5724a;
                    Object obj = c0292d.f5725b;
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
                        kotlin.jvm.internal.i.b(componentType);
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
                        bundle.putSize(str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        bundle.putSizeF(str2, (SizeF) obj);
                    }
                    i4++;
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Object a3 = ((InterfaceC1306d) entry.getValue()).a();
            kotlin.jvm.internal.i.e(key, "key");
            if (a3 != null) {
                while (i4 < 29) {
                    Class cls = f5005f[i4];
                    kotlin.jvm.internal.i.b(cls);
                    if (!cls.isInstance(a3)) {
                        i4++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a3.getClass() + " into saved state");
            }
            Object obj2 = b4.f5008c.get(key);
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            if (tVar != null) {
                tVar.d(a3);
            } else {
                linkedHashMap.put(key, a3);
            }
            A3.s sVar = (A3.s) b4.f5009d.get(key);
            if (sVar != null) {
                A3.v vVar = (A3.v) sVar;
                if (a3 == null) {
                    a3 = B3.k.f239a;
                }
                vVar.a(null, a3);
            }
        }
    }

    public B() {
        this.f5006a = new LinkedHashMap();
        this.f5007b = new LinkedHashMap();
        this.f5008c = new LinkedHashMap();
        this.f5009d = new LinkedHashMap();
        this.f5010e = new A(0, this);
    }
}
