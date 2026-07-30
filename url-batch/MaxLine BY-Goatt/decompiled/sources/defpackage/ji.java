package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ji implements m03 {
    public final /* synthetic */ int m;

    public /* synthetic */ ji(int i) {
        this.m = i;
    }

    @Override // defpackage.m03
    public final l03 a(uw0 uw0Var, v03 v03Var) {
        switch (this.m) {
            case 0:
                Type type = v03Var.b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new ki(uw0Var, uw0Var.b(new v03(genericComponentType)), j8.I(genericComponentType));
            case 1:
                if (v03Var.a == Date.class) {
                    return new fo2(2);
                }
                return null;
            case 2:
                if (v03Var.a == Object.class) {
                    return new rt1(uw0Var);
                }
                return null;
            case 3:
                if (v03Var.a == java.sql.Date.class) {
                    return new fo2(0);
                }
                return null;
            case 4:
                if (v03Var.a == Time.class) {
                    return new fo2(1);
                }
                return null;
            case 5:
                if (v03Var.a != Timestamp.class) {
                    return null;
                }
                return new sw0(uw0Var.b(new v03(Date.class)), 4);
            default:
                Class cls = v03Var.a;
                if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                    return null;
                }
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new ki(cls);
        }
    }
}
