package r4;

import a4.j;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;
import com.google.firebase.messaging.v;
import e3.o;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import n4.c0;
import n4.d0;
import n4.e0;
import n4.f0;
import re.h;
import te.a1;
import te.k0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f8149a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f8150b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f8151c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f8152d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f8153e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f8154f;
    public static final g g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f8155h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f8156i;
    public static final c j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f8157k;

    static {
        boolean z10 = true;
        f8149a = new g(5, z10);
        f8150b = new g(1, z10);
        boolean z11 = false;
        f8151c = new g(3, z11);
        f8152d = new g(2, z10);
        f8153e = new g(4, z10);
        f8154f = new g(6, z10);
        g = new g(7, z11);
        f8155h = new c(2, z10);
        f8156i = new c(3, z10);
        j = new c(0, z10);
        f8157k = new c(1, z10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        if (r8 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final f0 a(re.e eVar, Map map) {
        Object obj;
        f0 f0Var;
        boolean equals;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            k0 k0Var = (k0) obj;
            eVar.getClass();
            k0Var.getClass();
            if (eVar.g() != k0Var.f9395a.f9395a.c()) {
                equals = false;
            } else {
                pe.a I = cf.c.I(ue.a.f9716a, k0Var);
                if (I == null) {
                    i0.k(eVar.a(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.", "Cannot find KSerializer for [");
                    return null;
                }
                equals = eVar.equals(I.d());
            }
            if (equals) {
                break;
            }
        }
        k0 k0Var2 = (k0) obj;
        f0 f0Var2 = k0Var2 != null ? (f0) map.get(k0Var2) : null;
        if (f0Var2 == null) {
            f0Var2 = null;
        }
        g gVar = g.f8173r;
        if (f0Var2 == null) {
            eVar.getClass();
            switch (f(eVar).ordinal()) {
                case 0:
                    f0Var = f0.f7044b;
                    f0Var2 = f0Var;
                    break;
                case 1:
                    f0Var = f8149a;
                    f0Var2 = f0Var;
                    break;
                case 2:
                    f0Var = f0.f7051k;
                    f0Var2 = f0Var;
                    break;
                case j.INTEGER_FIELD_NUMBER /* 3 */:
                    f0Var = f8150b;
                    f0Var2 = f0Var;
                    break;
                case j.LONG_FIELD_NUMBER /* 4 */:
                    f0Var = f8151c;
                    f0Var2 = f0Var;
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    f0Var = f8152d;
                    f0Var2 = f0Var;
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    f0Var = f0.f7049h;
                    f0Var2 = f0Var;
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    f0Var = f8153e;
                    f0Var2 = f0Var;
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    f0Var = f0.f7047e;
                    f0Var2 = f0Var;
                    break;
                case 9:
                    f0Var = f8154f;
                    f0Var2 = f0Var;
                    break;
                case 10:
                    f0Var = g;
                    f0Var2 = f0Var;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    f0Var = f0.f7054n;
                    f0Var2 = f0Var;
                    break;
                case 12:
                    f0Var = f0.f7045c;
                    f0Var2 = f0Var;
                    break;
                case 13:
                    f0Var = f0.f7052l;
                    f0Var2 = f0Var;
                    break;
                case 14:
                    f0Var = j;
                    f0Var2 = f0Var;
                    break;
                case 15:
                    f0Var = f0.f7050i;
                    f0Var2 = f0Var;
                    break;
                case 16:
                    f0Var = f0.f7048f;
                    f0Var2 = f0Var;
                    break;
                case 17:
                    int ordinal = f(eVar.h(0)).ordinal();
                    if (ordinal != 10) {
                        if (ordinal == 11) {
                            f0Var = f8155h;
                        }
                        f0Var2 = gVar;
                        break;
                    } else {
                        f0Var = f0.f7055o;
                    }
                    f0Var2 = f0Var;
                    break;
                case 18:
                    int ordinal2 = f(eVar.h(0)).ordinal();
                    if (ordinal2 == 0) {
                        f0Var = f0.f7046d;
                    } else if (ordinal2 == 2) {
                        f0Var = f0.f7053m;
                    } else if (ordinal2 == 4) {
                        f0Var = f8157k;
                    } else if (ordinal2 == 6) {
                        f0Var = f0.j;
                    } else if (ordinal2 == 8) {
                        f0Var = f0.g;
                    } else if (ordinal2 == 19) {
                        f0Var2 = new a(d(eVar.h(0)));
                        break;
                    } else if (ordinal2 != 10) {
                        if (ordinal2 == 11) {
                            f0Var = f8156i;
                        }
                        f0Var2 = gVar;
                        break;
                    } else {
                        f0Var = f0.f7056p;
                    }
                    f0Var2 = f0Var;
                    break;
                case 19:
                    Class d10 = d(eVar);
                    if (!Parcelable.class.isAssignableFrom(d10)) {
                        if (!Enum.class.isAssignableFrom(d10)) {
                            if (!Serializable.class.isAssignableFrom(d10)) {
                                f0Var2 = null;
                                break;
                            } else {
                                f0Var2 = new e0(d10);
                                break;
                            }
                        } else {
                            f0Var2 = new c0(d10);
                            break;
                        }
                    } else {
                        f0Var2 = new d0(d10);
                        break;
                    }
                case 20:
                    Class d11 = d(eVar);
                    if (Enum.class.isAssignableFrom(d11)) {
                        f0Var2 = new b(d11);
                        break;
                    }
                    f0Var2 = gVar;
                    break;
                default:
                    f0Var2 = gVar;
                    break;
            }
        }
        if (f0Var2.equals(gVar)) {
            return null;
        }
        return f0Var2;
    }

    public static final int b(pe.a aVar) {
        int hashCode = aVar.d().a().hashCode();
        int c10 = aVar.d().c();
        for (int i3 = 0; i3 < c10; i3++) {
            hashCode = (hashCode * 31) + aVar.d().d(i3).hashCode();
        }
        return hashCode;
    }

    public static final String c(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        pe.a G = cf.c.G(wd.c0.a(obj.getClass()));
        o oVar = new o(G, linkedHashMap);
        G.a(oVar, obj);
        Map h10 = p0.h((LinkedHashMap) oVar.f3831e);
        v vVar = new v(G);
        o9.c cVar = new o9.c(1, h10, vVar);
        int c10 = G.d().c();
        for (int i3 = 0; i3 < c10; i3++) {
            String d10 = G.d().d(i3);
            f0 f0Var = (f0) linkedHashMap.get(d10);
            if (f0Var == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + d10 + ']').toString());
            }
            cVar.a(Integer.valueOf(i3), d10, f0Var);
        }
        return ((String) vVar.f3175d) + ((String) vVar.f3177i) + ((String) vVar.f3178r);
    }

    public static final Class d(re.e eVar) {
        String g2 = kotlin.text.o.g(eVar.a(), "?", "");
        try {
            return Class.forName(g2);
        } catch (ClassNotFoundException unused) {
            if (StringsKt.n(g2, ".")) {
                return Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(g2, "\\$"));
            }
            String str = "Cannot find class with name \"" + eVar.a() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (eVar.b() instanceof re.g) {
                str = str.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            a1.e(str);
            return null;
        }
    }

    public static final boolean e(re.e eVar) {
        eVar.getClass();
        return Intrinsics.a(eVar.b(), h.g) && eVar.e() && eVar.c() == 1;
    }

    public static final e f(re.e eVar) {
        String g2 = kotlin.text.o.g(eVar.a(), "?", "");
        return Intrinsics.a(eVar.b(), re.g.g) ? eVar.g() ? e.I : e.H : g2.equals("kotlin.Int") ? eVar.g() ? e.f8159e : e.f8158d : g2.equals("kotlin.Boolean") ? eVar.g() ? e.f8161r : e.f8160i : g2.equals("kotlin.Double") ? eVar.g() ? e.f8163t : e.f8162s : g2.equals("kotlin.Float") ? eVar.g() ? e.f8165v : e.f8164u : g2.equals("kotlin.Long") ? eVar.g() ? e.f8167x : e.f8166w : g2.equals("kotlin.String") ? eVar.g() ? e.f8169z : e.f8168y : g2.equals("kotlin.IntArray") ? e.A : g2.equals("kotlin.DoubleArray") ? e.C : g2.equals("kotlin.BooleanArray") ? e.B : g2.equals("kotlin.FloatArray") ? e.D : g2.equals("kotlin.LongArray") ? e.E : g2.equals("kotlin.Array") ? e.F : g2.startsWith("kotlin.collections.ArrayList") ? e.G : e.J;
    }

    public static final String g(String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder("Route ");
        sb2.append(str3);
        sb2.append(" could not find any NavType for argument ");
        sb2.append(str);
        sb2.append(" of type ");
        return v4.a.p(sb2, str2, " - typeMap received was ", str4);
    }
}
