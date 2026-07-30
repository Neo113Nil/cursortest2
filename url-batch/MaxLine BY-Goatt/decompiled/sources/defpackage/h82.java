package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h82 implements m03 {
    public final t21 m;
    public final int n;
    public final cj0 o;
    public final ov p;
    public final e82 q = e82.a;

    public h82(t21 t21Var, int i, cj0 cj0Var, ov ovVar) {
        this.m = t21Var;
        this.n = i;
        this.o = cj0Var;
        this.p = ovVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce A[SYNTHETIC] */
    @Override // defpackage.m03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l03 a(uw0 uw0Var, v03 v03Var) {
        Type type;
        Class<?> cls;
        LinkedHashMap linkedHashMap;
        boolean z;
        List list;
        int size;
        int i;
        g82 g82Var;
        int i2;
        Class<?> cls2;
        Type type2;
        LinkedHashMap linkedHashMap2;
        boolean z2;
        int i3;
        t21 t21Var;
        Type type3;
        Field[] fieldArr;
        l03 l03Var;
        h82 h82Var = this;
        uw0 uw0Var2 = uw0Var;
        v03 v03Var2 = v03Var;
        Class<?> cls3 = v03Var2.a;
        Class<?> cls4 = Object.class;
        if (!cls4.isAssignableFrom(cls3)) {
            return null;
        }
        t21 t21Var2 = h82Var.m;
        mt1 w = t21Var2.w(v03Var2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (!cls3.isInterface()) {
            Type type4 = v03Var2.b;
            while (true) {
                Type type5 = v03Var2.b;
                if (cls3 == cls4) {
                    break;
                }
                Field[] declaredFields = cls3.getDeclaredFields();
                int length = declaredFields.length;
                boolean z3 = false;
                int i4 = 0;
                while (i4 < length) {
                    Field[] fieldArr2 = declaredFields;
                    Field field = fieldArr2[i4];
                    boolean b = h82Var.b(field, true);
                    Type type6 = type4;
                    boolean b2 = h82Var.b(field, z3);
                    if (b || b2) {
                        h82Var.q.a(field);
                        Type T = j8.T(type5, cls3, field.getGenericType(), new HashMap());
                        gj2 gj2Var = (gj2) field.getAnnotation(gj2.class);
                        if (gj2Var == null) {
                            int i5 = h82Var.n;
                            type = type5;
                            list = Collections.singletonList(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? q40.a(field.getName(), ".").toLowerCase(Locale.ENGLISH) : q40.a(field.getName(), "-").toLowerCase(Locale.ENGLISH) : q40.a(field.getName(), "_").toLowerCase(Locale.ENGLISH) : q40.b(q40.a(field.getName(), " ")) : q40.b(field.getName()) : field.getName());
                            cls = cls3;
                        } else {
                            type = type5;
                            String value = gj2Var.value();
                            String[] alternate = gj2Var.alternate();
                            cls = cls3;
                            if (alternate.length == 0) {
                                list = Collections.singletonList(value);
                            } else {
                                linkedHashMap = linkedHashMap3;
                                z = true;
                                ArrayList arrayList = new ArrayList(alternate.length + 1);
                                arrayList.add(value);
                                int i6 = 0;
                                for (int length2 = alternate.length; i6 < length2; length2 = length2) {
                                    arrayList.add(alternate[i6]);
                                    i6++;
                                }
                                list = arrayList;
                                size = list.size();
                                i = 0;
                                g82 g82Var2 = null;
                                while (i < size) {
                                    String str = (String) list.get(i);
                                    if (i != 0) {
                                        b = false;
                                    }
                                    int i7 = i4;
                                    v03 v03Var3 = new v03(T);
                                    List list2 = list;
                                    Class cls5 = v03Var3.a;
                                    boolean z4 = (cls5 == null || !cls5.isPrimitive()) ? false : z;
                                    p61 p61Var = (p61) field.getAnnotation(p61.class);
                                    int i8 = size;
                                    if (p61Var != null) {
                                        h82Var.p.getClass();
                                        l03Var = ov.b(t21Var2, uw0Var2, v03Var3, p61Var);
                                    } else {
                                        l03Var = null;
                                    }
                                    int i9 = length;
                                    boolean z5 = l03Var != null ? z : false;
                                    if (l03Var == null) {
                                        l03Var = uw0Var2.b(v03Var3);
                                    }
                                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                                    int i10 = i;
                                    boolean z6 = b;
                                    Class<?> cls6 = cls4;
                                    g82 g82Var3 = g82Var2;
                                    Type type7 = T;
                                    Type type8 = type6;
                                    t21 t21Var3 = t21Var2;
                                    Type type9 = type;
                                    Field[] fieldArr3 = fieldArr2;
                                    g82Var2 = (g82) linkedHashMap4.put(str, new g82(str, z6, b2, field, z5, l03Var, uw0Var2, v03Var3, z4));
                                    if (g82Var3 != null) {
                                        g82Var2 = g82Var3;
                                    }
                                    uw0Var2 = uw0Var;
                                    fieldArr2 = fieldArr3;
                                    length = i9;
                                    i4 = i7;
                                    list = list2;
                                    size = i8;
                                    linkedHashMap = linkedHashMap4;
                                    type = type9;
                                    cls4 = cls6;
                                    t21Var2 = t21Var3;
                                    b = z6;
                                    type6 = type8;
                                    T = type7;
                                    i = i10 + 1;
                                    h82Var = this;
                                }
                                g82Var = g82Var2;
                                i2 = i4;
                                cls2 = cls4;
                                type2 = type6;
                                linkedHashMap2 = linkedHashMap;
                                z2 = false;
                                i3 = length;
                                t21Var = t21Var2;
                                type3 = type;
                                fieldArr = fieldArr2;
                                if (g82Var == null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(type2);
                                    String str2 = g82Var.a;
                                    sb.append(" declares multiple JSON fields named ");
                                    sb.append(str2);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                        linkedHashMap = linkedHashMap3;
                        z = true;
                        size = list.size();
                        i = 0;
                        g82 g82Var22 = null;
                        while (i < size) {
                        }
                        g82Var = g82Var22;
                        i2 = i4;
                        cls2 = cls4;
                        type2 = type6;
                        linkedHashMap2 = linkedHashMap;
                        z2 = false;
                        i3 = length;
                        t21Var = t21Var2;
                        type3 = type;
                        fieldArr = fieldArr2;
                        if (g82Var == null) {
                        }
                    } else {
                        cls = cls3;
                        i3 = length;
                        z2 = z3;
                        i2 = i4;
                        fieldArr = fieldArr2;
                        cls2 = cls4;
                        type2 = type6;
                        linkedHashMap2 = linkedHashMap3;
                        t21Var = t21Var2;
                        type3 = type5;
                    }
                    i4 = i2 + 1;
                    h82Var = this;
                    uw0Var2 = uw0Var;
                    linkedHashMap3 = linkedHashMap2;
                    type4 = type2;
                    type5 = type3;
                    cls4 = cls2;
                    t21Var2 = t21Var;
                    declaredFields = fieldArr;
                    cls3 = cls;
                    length = i3;
                    z3 = z2;
                }
                v03Var2 = new v03(j8.T(type5, cls3, cls3.getGenericSuperclass(), new HashMap()));
                cls3 = v03Var2.a;
                h82Var = this;
                uw0Var2 = uw0Var;
                cls4 = cls4;
                t21Var2 = t21Var2;
            }
        }
        return new ki(w, linkedHashMap3);
    }

    public final boolean b(Field field, boolean z) {
        Class<?> type = field.getType();
        cj0 cj0Var = this.o;
        cj0Var.getClass();
        if (Enum.class.isAssignableFrom(type) || (!type.isAnonymousClass() && !type.isLocalClass())) {
            cj0Var.b(z);
            if ((136 & field.getModifiers()) == 0 && !field.isSynthetic()) {
                Class<?> type2 = field.getType();
                if (Enum.class.isAssignableFrom(type2) || (!type2.isAnonymousClass() && !type2.isLocalClass())) {
                    List list = z ? cj0Var.m : cj0Var.n;
                    if (list.isEmpty()) {
                        return true;
                    }
                    Iterator it = list.iterator();
                    if (!it.hasNext()) {
                        return true;
                    }
                    it.next().getClass();
                    b71.o();
                    return false;
                }
            }
        }
        return false;
    }
}
