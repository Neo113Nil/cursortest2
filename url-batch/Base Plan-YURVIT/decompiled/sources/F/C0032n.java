package F;

import B0.C0000a;
import W0.C0072l;
import a.AbstractC0086a;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import m.C0199a;
import v0.C0236a;
import v0.InterfaceC0237b;
import v0.InterfaceC0238c;
import v0.InterfaceC0241f;

/* renamed from: F.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032n {

    /* renamed from: a, reason: collision with root package name */
    public Object f409a;

    /* renamed from: b, reason: collision with root package name */
    public Object f410b;

    /* renamed from: c, reason: collision with root package name */
    public Object f411c;

    /* renamed from: d, reason: collision with root package name */
    public Object f412d;

    public /* synthetic */ C0032n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f409a = obj;
        this.f410b = obj2;
        this.f411c = obj3;
        this.f412d = obj4;
    }

    public static boolean e(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public SpannableString a() {
        if (((String) this.f409a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f409a);
        List<io.flutter.view.l> list = (List) this.f411c;
        if (list != null) {
            for (io.flutter.view.l lVar : list) {
                int a2 = H.j.a(lVar.f2621c);
                if (a2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), lVar.f2619a, lVar.f2620b, 0);
                } else if (a2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.j) lVar).f2618d)), lVar.f2619a, lVar.f2620b, 0);
                }
            }
        }
        String str = (String) this.f412d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f412d), 0, ((String) this.f409a).length(), 0);
        }
        String str2 = (String) this.f410b;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f410b)), 0, ((String) this.f409a).length(), 0);
        }
        return spannableString;
    }

    public Object b(int i2, int i3) {
        return ((C0199a) this.f412d).f2848f[(i2 << 1) + i3];
    }

    public void c(int i2) {
        ((C0199a) this.f412d).g(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(I0.b bVar) {
        C0028j c0028j;
        int i2;
        C0032n c0032n;
        C0022d c0022d;
        P p2 = (P) this.f412d;
        if (bVar instanceof C0028j) {
            c0028j = (C0028j) bVar;
            int i3 = c0028j.f382k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0028j.f382k = i3 - Integer.MIN_VALUE;
                Object obj = c0028j.f380i;
                i2 = c0028j.f382k;
                if (i2 != 0) {
                    AbstractC0086a.I(obj);
                    List list = (List) this.f411c;
                    H0.a aVar = H0.a.f511e;
                    if (list == null || list.isEmpty()) {
                        c0028j.f379h = this;
                        c0028j.f382k = 1;
                        obj = P.e(p2, false, c0028j);
                        if (obj != aVar) {
                            c0032n = this;
                            c0022d = (C0022d) obj;
                        }
                    } else {
                        k0 g2 = p2.g();
                        C0031m c0031m = new C0031m(p2, this, null);
                        c0028j.f379h = this;
                        c0028j.f382k = 2;
                        obj = g2.b(c0031m, c0028j);
                        if (obj != aVar) {
                            c0032n = this;
                            c0022d = (C0022d) obj;
                        }
                    }
                    return aVar;
                }
                if (i2 == 1) {
                    c0032n = c0028j.f379h;
                    AbstractC0086a.I(obj);
                    c0022d = (C0022d) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0032n = c0028j.f379h;
                    AbstractC0086a.I(obj);
                    c0022d = (C0022d) obj;
                }
                ((P) c0032n.f412d).f295l.D(c0022d);
                return D0.h.f206a;
            }
        }
        c0028j = new C0028j(this, bVar);
        Object obj2 = c0028j.f380i;
        i2 = c0028j.f382k;
        if (i2 != 0) {
        }
        ((P) c0032n.f412d).f295l.D(c0022d);
        return D0.h.f206a;
    }

    public File f(Context context) {
        ((C0000a) this.f410b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void g(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((l0.i) this.f412d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0086, B:21:0x0066, B:23:0x0078), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [e1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(I0.b bVar) {
        e0 e0Var;
        ?? r1;
        C0032n c0032n;
        e1.d dVar;
        C0032n c0032n2;
        e1.d dVar2;
        try {
            if (bVar instanceof e0) {
                e0Var = (e0) bVar;
                int i2 = e0Var.f352l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    e0Var.f352l = i2 - Integer.MIN_VALUE;
                    Object obj = e0Var.f350j;
                    r1 = e0Var.f352l;
                    D0.h hVar = D0.h.f206a;
                    H0.a aVar = H0.a.f511e;
                    if (r1 != 0) {
                        AbstractC0086a.I(obj);
                        if (!(((C0072l) this.f410b).D() instanceof W0.L)) {
                            return hVar;
                        }
                        e1.d dVar3 = (e1.d) this.f409a;
                        e0Var.f348h = this;
                        e0Var.f349i = dVar3;
                        e0Var.f352l = 1;
                        if (dVar3.c(e0Var) != aVar) {
                            c0032n = this;
                            dVar = dVar3;
                        }
                        return aVar;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e1.a aVar2 = e0Var.f349i;
                        c0032n2 = e0Var.f348h;
                        AbstractC0086a.I(obj);
                        r1 = aVar2;
                        ((C0072l) c0032n2.f410b).J(hVar);
                        dVar2 = r1;
                        return hVar;
                    }
                    ?? r12 = e0Var.f349i;
                    c0032n = e0Var.f348h;
                    AbstractC0086a.I(obj);
                    dVar = r12;
                    dVar2 = dVar;
                    if (((C0072l) c0032n.f410b).D() instanceof W0.L) {
                        e0Var.f348h = c0032n;
                        e0Var.f349i = dVar;
                        e0Var.f352l = 2;
                        if (c0032n.d(e0Var) != aVar) {
                            c0032n2 = c0032n;
                            r1 = dVar;
                            ((C0072l) c0032n2.f410b).J(hVar);
                            dVar2 = r1;
                        }
                        return aVar;
                    }
                    return hVar;
                }
            }
            if (r1 != 0) {
            }
            dVar2 = dVar;
            if (((C0072l) c0032n.f410b).D() instanceof W0.L) {
            }
            return hVar;
        } finally {
            ((e1.d) r1).e(null);
        }
        e0Var = new e0(this, bVar);
        Object obj2 = e0Var.f350j;
        r1 = e0Var.f352l;
        D0.h hVar2 = D0.h.f206a;
        H0.a aVar3 = H0.a.f511e;
    }

    public void i(Serializable serializable, InterfaceC0238c interfaceC0238c) {
        ((InterfaceC0241f) this.f409a).e((String) this.f410b, ((v0.j) this.f411c).a(serializable), interfaceC0238c == null ? null : new C0236a(0, this, interfaceC0238c));
    }

    public void j(InterfaceC0237b interfaceC0237b) {
        String str = (String) this.f410b;
        InterfaceC0241f interfaceC0241f = (InterfaceC0241f) this.f409a;
        C0000a c0000a = (C0000a) this.f412d;
        if (c0000a != null) {
            interfaceC0241f.v(str, interfaceC0237b != null ? new N.P(this, interfaceC0237b, 24, false) : null, c0000a);
        } else {
            interfaceC0241f.h(str, interfaceC0237b != null ? new N.P(this, interfaceC0237b, 24, false) : null);
        }
    }

    public Object[] k(int i2, Object[] objArr) {
        int i3 = ((C0199a) this.f412d).f2849g;
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

    public C0032n(C0199a c0199a) {
        this.f412d = c0199a;
    }
}
