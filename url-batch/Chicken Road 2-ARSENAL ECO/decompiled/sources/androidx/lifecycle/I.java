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
import k5.C0477g;
import z.AbstractC0769a;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3466f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3467a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3468b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3469c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3470d;

    /* renamed from: e, reason: collision with root package name */
    public final T.e f3471e;

    public I(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3467a = linkedHashMap;
        this.f3468b = new LinkedHashMap();
        this.f3469c = new LinkedHashMap();
        this.f3470d = new LinkedHashMap();
        this.f3471e = new androidx.activity.c(1, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(I i7) {
        LinkedHashMap linkedHashMap = i7.f3467a;
        Iterator it = l5.t.u0(i7.f3468b).entrySet().iterator();
        while (true) {
            int i8 = 0;
            if (!it.hasNext()) {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                C0477g[] c0477gArr = {new C0477g("keys", arrayList), new C0477g("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i8 < 2) {
                    C0477g c0477g = c0477gArr[i8];
                    String str2 = (String) c0477g.f5198f;
                    Object obj = c0477g.f5199g;
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
                        AbstractC0769a.a(bundle, str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        AbstractC0769a.b(bundle, str2, (SizeF) obj);
                    }
                    i8++;
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle a7 = ((T.e) entry.getValue()).a();
            kotlin.jvm.internal.i.e(key, "key");
            if (a7 != null) {
                while (i8 < 29) {
                    Class cls = f3466f[i8];
                    kotlin.jvm.internal.i.b(cls);
                    if (!cls.isInstance(a7)) {
                        i8++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a7.getClass() + " into saved state");
            }
            Object obj2 = i7.f3469c.get(key);
            A a8 = obj2 instanceof A ? (A) obj2 : null;
            if (a8 != null) {
                a8.b(a7);
            } else {
                linkedHashMap.put(key, a7);
            }
            K5.h hVar = (K5.h) i7.f3470d.get(key);
            if (hVar != null) {
                ((K5.k) hVar).e(a7);
            }
        }
    }

    public I() {
        this.f3467a = new LinkedHashMap();
        this.f3468b = new LinkedHashMap();
        this.f3469c = new LinkedHashMap();
        this.f3470d = new LinkedHashMap();
        this.f3471e = new androidx.activity.c(1, this);
    }
}
