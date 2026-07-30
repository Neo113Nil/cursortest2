package D;

import M0.C0054l;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import k.C0179a;
import m0.C0199i;
import n0.C0209a;
import n0.InterfaceC0210b;
import n0.InterfaceC0211c;
import u0.C0247g;

/* renamed from: D.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n {

    /* renamed from: a, reason: collision with root package name */
    public Object f244a;

    /* renamed from: b, reason: collision with root package name */
    public Object f245b;

    /* renamed from: c, reason: collision with root package name */
    public Object f246c;

    /* renamed from: d, reason: collision with root package name */
    public Object f247d;

    public C0013n(C0179a c0179a) {
        this.f247d = c0179a;
    }

    public static boolean e(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public SpannableString a() {
        if (((String) this.f244a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f244a);
        ArrayList arrayList = (ArrayList) this.f245b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.k kVar = (io.flutter.view.k) it.next();
                int b2 = F.j.b(kVar.f2622c);
                if (b2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), kVar.f2620a, kVar.f2621b, 0);
                } else if (b2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.i) kVar).f2619d)), kVar.f2620a, kVar.f2621b, 0);
                }
            }
        }
        String str = (String) this.f247d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f247d), 0, ((String) this.f244a).length(), 0);
        }
        String str2 = (String) this.f246c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f246c)), 0, ((String) this.f244a).length(), 0);
        }
        return spannableString;
    }

    public Object b(int i2, int i3) {
        return ((C0179a) this.f247d).f2675f[(i2 << 1) + i3];
    }

    public void c(int i2) {
        ((C0179a) this.f247d).g(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(y0.b bVar) {
        C0009j c0009j;
        int i2;
        C0013n c0013n;
        C0003d c0003d;
        if (bVar instanceof C0009j) {
            c0009j = (C0009j) bVar;
            int i3 = c0009j.f213k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0009j.f213k = i3 - Integer.MIN_VALUE;
                Object obj = c0009j.f211i;
                x0.a aVar = x0.a.f3094e;
                i2 = c0009j.f213k;
                if (i2 != 0) {
                    o.g.z(obj);
                    List list = (List) this.f246c;
                    S s2 = (S) this.f247d;
                    if (list == null || list.isEmpty()) {
                        c0009j.f210h = this;
                        c0009j.f213k = 1;
                        obj = S.f(s2, false, c0009j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0013n = this;
                        c0003d = (C0003d) obj;
                    } else {
                        l0 g2 = s2.g();
                        C0012m c0012m = new C0012m(s2, this, null);
                        c0009j.f210h = this;
                        c0009j.f213k = 2;
                        obj = g2.b(c0012m, c0009j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0013n = this;
                        c0003d = (C0003d) obj;
                    }
                } else if (i2 == 1) {
                    c0013n = c0009j.f210h;
                    o.g.z(obj);
                    c0003d = (C0003d) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0013n = c0009j.f210h;
                    o.g.z(obj);
                    c0003d = (C0003d) obj;
                }
                ((S) c0013n.f247d).f133l.G(c0003d);
                return C0247g.f3005a;
            }
        }
        c0009j = new C0009j(this, bVar);
        Object obj2 = c0009j.f211i;
        x0.a aVar2 = x0.a.f3094e;
        i2 = c0009j.f213k;
        if (i2 != 0) {
        }
        ((S) c0013n.f247d).f133l.G(c0003d);
        return C0247g.f3005a;
    }

    public File f(Context context) {
        ((E.a) this.f245b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void g(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((C0199i) this.f247d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:25:0x0066, B:29:0x0078), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [U0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(y0.b bVar) {
        g0 g0Var;
        int i2;
        U0.d dVar;
        C0013n c0013n;
        U0.a aVar;
        Throwable th;
        C0013n c0013n2;
        try {
            if (bVar instanceof g0) {
                g0Var = (g0) bVar;
                int i3 = g0Var.f195l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    g0Var.f195l = i3 - Integer.MIN_VALUE;
                    Object obj = g0Var.f193j;
                    x0.a aVar2 = x0.a.f3094e;
                    i2 = g0Var.f195l;
                    C0247g c0247g = C0247g.f3005a;
                    if (i2 != 0) {
                        o.g.z(obj);
                        if (!(((C0054l) this.f245b).C() instanceof M0.L)) {
                            return c0247g;
                        }
                        g0Var.f191h = this;
                        dVar = (U0.d) this.f244a;
                        g0Var.f192i = dVar;
                        g0Var.f195l = 1;
                        if (dVar.c(g0Var) == aVar2) {
                            return aVar2;
                        }
                        c0013n = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = g0Var.f192i;
                            c0013n2 = g0Var.f191h;
                            try {
                                o.g.z(obj);
                                ((C0054l) c0013n2.f245b).I(c0247g);
                                ((U0.d) aVar).e(null);
                                return c0247g;
                            } catch (Throwable th2) {
                                th = th2;
                                ((U0.d) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r2 = g0Var.f192i;
                        c0013n = g0Var.f191h;
                        o.g.z(obj);
                        dVar = r2;
                    }
                    if (((C0054l) c0013n.f245b).C() instanceof M0.L) {
                        dVar.e(null);
                        return c0247g;
                    }
                    g0Var.f191h = c0013n;
                    g0Var.f192i = dVar;
                    g0Var.f195l = 2;
                    if (c0013n.d(g0Var) == aVar2) {
                        return aVar2;
                    }
                    aVar = dVar;
                    c0013n2 = c0013n;
                    ((C0054l) c0013n2.f245b).I(c0247g);
                    ((U0.d) aVar).e(null);
                    return c0247g;
                }
            }
            if (((C0054l) c0013n.f245b).C() instanceof M0.L) {
            }
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((U0.d) aVar).e(null);
            throw th;
        }
        g0Var = new g0(this, bVar);
        Object obj2 = g0Var.f193j;
        x0.a aVar22 = x0.a.f3094e;
        i2 = g0Var.f195l;
        C0247g c0247g2 = C0247g.f3005a;
        if (i2 != 0) {
        }
    }

    public void i(Serializable serializable, InterfaceC0211c interfaceC0211c) {
        ((n0.f) this.f244a).l((String) this.f245b, ((n0.j) this.f246c).b(serializable), interfaceC0211c == null ? null : new C0209a(0, this, interfaceC0211c));
    }

    public void j(InterfaceC0210b interfaceC0210b) {
        String str = (String) this.f245b;
        n0.f fVar = (n0.f) this.f244a;
        E.a aVar = (E.a) this.f247d;
        if (aVar != null) {
            fVar.b(str, interfaceC0210b != null ? new L.Q(this, interfaceC0210b, 20, false) : null, aVar);
        } else {
            fVar.c(str, interfaceC0210b != null ? new L.Q(this, interfaceC0210b, 20, false) : null);
        }
    }

    public Object[] k(int i2, Object[] objArr) {
        int i3 = ((C0179a) this.f247d).f2676g;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = b(i4, i2);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public C0013n(n0.f fVar, String str, n0.j jVar, E.a aVar) {
        this.f244a = fVar;
        this.f245b = str;
        this.f246c = jVar;
        this.f247d = aVar;
    }
}
