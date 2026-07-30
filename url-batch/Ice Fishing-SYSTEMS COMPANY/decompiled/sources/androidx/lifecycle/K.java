package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.activity.C0464f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import q7.C4938g;
import x0.InterfaceC5201b;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f5226f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5227a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5228b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5229c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5230d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC5201b f5231e;

    public K(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5227a = linkedHashMap;
        this.f5228b = new LinkedHashMap();
        this.f5229c = new LinkedHashMap();
        this.f5230d = new LinkedHashMap();
        this.f5231e = new C0464f(1, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(K this$0) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        Iterator it = r7.t.E(this$0.f5228b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f5227a;
            int i = 0;
            if (!hasNext) {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                C4938g[] c4938gArr = {new C4938g("keys", arrayList), new C4938g("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i < 2) {
                    C4938g c4938g = c4938gArr[i];
                    String str2 = (String) c4938g.f40162n;
                    Object obj = c4938g.f40163u;
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
                        kotlin.jvm.internal.h.b(componentType);
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
                        K.c.a(bundle, str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        K.c.b(bundle, str2, (SizeF) obj);
                    }
                    i++;
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle a9 = ((InterfaceC5201b) entry.getValue()).a();
            kotlin.jvm.internal.h.e(key, "key");
            if (a9 != null) {
                Class[] clsArr = f5226f;
                while (i < 29) {
                    Class cls = clsArr[i];
                    kotlin.jvm.internal.h.b(cls);
                    if (!cls.isInstance(a9)) {
                        i++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a9.getClass() + " into saved state");
            }
            Object obj2 = this$0.f5229c.get(key);
            C c4 = obj2 instanceof C ? (C) obj2 : null;
            if (c4 != null) {
                c4.e(a9);
            } else {
                linkedHashMap.put(key, a9);
            }
            R7.k kVar = (R7.k) this$0.f5230d.get(key);
            if (kVar != null) {
                ((R7.n) kVar).F(a9);
            }
        }
    }

    public K() {
        this.f5227a = new LinkedHashMap();
        this.f5228b = new LinkedHashMap();
        this.f5229c = new LinkedHashMap();
        this.f5230d = new LinkedHashMap();
        this.f5231e = new C0464f(1, this);
    }
}
