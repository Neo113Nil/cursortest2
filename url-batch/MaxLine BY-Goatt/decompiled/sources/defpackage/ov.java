package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ov implements m03 {
    public final /* synthetic */ int m;
    public final Object n;

    public /* synthetic */ ov(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    public static l03 b(t21 t21Var, uw0 uw0Var, v03 v03Var, p61 p61Var) {
        l03 a;
        Object n = t21Var.w(new v03(p61Var.value())).n();
        if (n instanceof l03) {
            a = (l03) n;
        } else {
            if (!(n instanceof m03)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + n.getClass().getName() + " as a @JsonAdapter for " + j8.X(v03Var.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a = ((m03) n).a(uw0Var, v03Var);
        }
        return (a == null || !p61Var.nullSafe()) ? a : new sw0(a, 2);
    }

    @Override // defpackage.m03
    public final l03 a(uw0 uw0Var, v03 v03Var) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.m;
        cls = Object.class;
        Object obj = this.n;
        switch (i) {
            case 0:
                Type type = v03Var.b;
                Class cls2 = v03Var.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                yk3.s(Collection.class.isAssignableFrom(cls2));
                Type T = j8.T(type, cls2, j8.G(type, cls2, Collection.class), new HashMap());
                if (T instanceof WildcardType) {
                    T = ((WildcardType) T).getUpperBounds()[0];
                }
                cls = T instanceof ParameterizedType ? ((ParameterizedType) T).getActualTypeArguments()[0] : Object.class;
                return new ki(uw0Var, cls, uw0Var.b(new v03(cls)), ((t21) obj).w(v03Var));
            case 1:
                p61 p61Var = (p61) v03Var.a.getAnnotation(p61.class);
                if (p61Var == null) {
                    return null;
                }
                return b((t21) obj, uw0Var, v03Var, p61Var);
            case 2:
                Type type2 = v03Var.b;
                if (!Map.class.isAssignableFrom(v03Var.a)) {
                    return null;
                }
                Class I = j8.I(type2);
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    yk3.s(Map.class.isAssignableFrom(I));
                    Type T2 = j8.T(type2, I, j8.G(type2, I, Map.class), new HashMap());
                    actualTypeArguments = T2 instanceof ParameterizedType ? ((ParameterizedType) T2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type[] typeArr = actualTypeArguments;
                return new fi1(this, uw0Var, typeArr[0], (type3 == Boolean.TYPE || type3 == Boolean.class) ? r03.c : uw0Var.b(new v03(type3)), typeArr[1], uw0Var.b(new v03(actualTypeArguments[1])), ((t21) obj).w(v03Var));
            default:
                Class cls3 = v03Var.a;
                if (cls3 == Calendar.class || cls3 == GregorianCalendar.class) {
                    return (rt1) obj;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.m) {
            case 3:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((rt1) this.n) + "]";
            default:
                return super.toString();
        }
    }
}
