package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ki extends l03 {
    public static final ji d = new ji(0);
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ki(Class cls) {
        this.a = 5;
        this.c = new HashMap();
        this.b = new HashMap();
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant()) {
                    AccessController.doPrivileged(new q03(field));
                    Enum r4 = (Enum) field.get(null);
                    String name = r4.name();
                    gj2 gj2Var = (gj2) field.getAnnotation(gj2.class);
                    if (gj2Var != null) {
                        name = gj2Var.value();
                        for (String str : gj2Var.alternate()) {
                            ((HashMap) this.c).put(str, r4);
                        }
                    }
                    ((HashMap) this.c).put(name, r4);
                    ((HashMap) this.b).put(r4, name);
                }
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.l03
    public final Object a(z61 z61Var) {
        Date b;
        Object date;
        Object obj = null;
        Object n = null;
        Collection collection = null;
        switch (this.a) {
            case 0:
                if (z61Var.R() == 9) {
                    z61Var.N();
                } else {
                    ArrayList arrayList = new ArrayList();
                    z61Var.b();
                    while (z61Var.s()) {
                        arrayList.add(((sw0) this.b).b.a(z61Var));
                    }
                    z61Var.o();
                    int size = arrayList.size();
                    obj = Array.newInstance((Class<?>) this.c, size);
                    for (int i = 0; i < size; i++) {
                        Array.set(obj, i, arrayList.get(i));
                    }
                }
                return obj;
            case 1:
                if (z61Var.R() == 9) {
                    z61Var.N();
                } else {
                    collection = (Collection) ((mt1) this.c).n();
                    z61Var.b();
                    while (z61Var.s()) {
                        collection.add(((sw0) this.b).b.a(z61Var));
                    }
                    z61Var.o();
                }
                return collection;
            case 2:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                String P = z61Var.P();
                synchronized (((ArrayList) this.b)) {
                    ArrayList arrayList2 = (ArrayList) this.b;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            try {
                                b = ((DateFormat) obj2).parse(P);
                            } catch (ParseException unused) {
                            }
                        } else {
                            try {
                                b = e01.b(P, new ParsePosition(0));
                            } catch (ParseException e) {
                                throw new a71(P, e);
                            }
                        }
                    }
                }
                Class cls = (Class) this.c;
                if (cls == Date.class) {
                    return b;
                }
                if (cls == Timestamp.class) {
                    date = new Timestamp(b.getTime());
                } else {
                    if (cls != java.sql.Date.class) {
                        throw new AssertionError();
                    }
                    date = new java.sql.Date(b.getTime());
                }
                return date;
            case 3:
                if (z61Var.R() == 9) {
                    z61Var.N();
                } else {
                    n = ((mt1) this.c).n();
                    try {
                        z61Var.f();
                        while (z61Var.s()) {
                            g82 g82Var = (g82) ((LinkedHashMap) this.b).get(z61Var.J());
                            if (g82Var != null && g82Var.b) {
                                Object a = g82Var.d.a(z61Var);
                                if (a != null || !g82Var.e) {
                                    g82Var.c.set(n, a);
                                }
                            }
                            z61Var.W();
                        }
                        z61Var.p();
                    } catch (IllegalAccessException e2) {
                        throw new AssertionError(e2);
                    } catch (IllegalStateException e3) {
                        throw new a71(e3);
                    }
                }
                return n;
            case 4:
                Class cls2 = (Class) this.c;
                Object a2 = ((n03) this.b).o.a(z61Var);
                if (a2 == null || cls2.isInstance(a2)) {
                    return a2;
                }
                throw new a71("Expected a " + cls2.getName() + " but was " + a2.getClass().getName());
            default:
                if (z61Var.R() != 9) {
                    return (Enum) ((HashMap) this.c).get(z61Var.P());
                }
                z61Var.N();
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public ki(uw0 uw0Var, Type type, l03 l03Var, mt1 mt1Var) {
        this.a = 1;
        this.b = new sw0(uw0Var, l03Var, type);
        this.c = mt1Var;
    }

    public ki(mt1 mt1Var, LinkedHashMap linkedHashMap) {
        this.a = 3;
        this.c = mt1Var;
        this.b = linkedHashMap;
    }

    public ki(n03 n03Var, Class cls) {
        this.a = 4;
        this.b = n03Var;
        this.c = cls;
    }

    public ki(uw0 uw0Var, l03 l03Var, Class cls) {
        this.a = 0;
        this.b = new sw0(uw0Var, l03Var, cls);
        this.c = cls;
    }

    public ki(Class cls, int i, int i2) {
        this.a = 2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (cls != Date.class && cls != java.sql.Date.class && cls != Timestamp.class) {
            throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
        }
        this.c = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (n51.a >= 9) {
            arrayList.add(yk3.G(i, i2));
        }
    }
}
