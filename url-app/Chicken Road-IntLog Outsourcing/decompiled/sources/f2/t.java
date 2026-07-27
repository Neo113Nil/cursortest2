package f2;

import D4.C0013m;
import M.C0075d;
import M.C0081j;
import M.C0084m;
import M.P;
import M.e0;
import M.j0;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l4.EnumC1260a;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static t f5635e;

    /* renamed from: a, reason: collision with root package name */
    public Object f5636a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5637b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5638c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5639d;

    public t(H2.f fVar, String str, H2.k kVar, s0.k kVar2) {
        this.f5637b = fVar;
        this.f5636a = str;
        this.f5638c = kVar;
        this.f5639d = kVar2;
    }

    public static synchronized t c() {
        t tVar;
        synchronized (t.class) {
            try {
                if (f5635e == null) {
                    t tVar2 = new t();
                    tVar2.f5636a = null;
                    tVar2.f5637b = null;
                    tVar2.f5638c = null;
                    tVar2.f5639d = new ArrayDeque();
                    f5635e = tVar2;
                }
                tVar = f5635e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    public SpannableString a() {
        if (((String) this.f5636a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f5636a);
        ArrayList arrayList = (ArrayList) this.f5637b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.j jVar = (io.flutter.view.j) it.next();
                int b6 = O.j.b(jVar.f10383c);
                if (b6 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f10381a, jVar.f10382b, 0);
                } else if (b6 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.h) jVar).f10380d)), jVar.f10381a, jVar.f10382b, 0);
                }
            }
        }
        String str = (String) this.f5639d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f5639d), 0, ((String) this.f5636a).length(), 0);
        }
        String str2 = (String) this.f5638c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f5638c)), 0, ((String) this.f5636a).length(), 0);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(AbstractC1295c abstractC1295c) {
        C0081j c0081j;
        int i2;
        t tVar;
        C0075d c0075d;
        if (abstractC1295c instanceof C0081j) {
            c0081j = (C0081j) abstractC1295c;
            int i3 = c0081j.f1705d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0081j.f1705d = i3 - Integer.MIN_VALUE;
                Object obj = c0081j.f1703b;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = c0081j.f1705d;
                if (i2 != 0) {
                    e5.g.y(obj);
                    List list = (List) this.f5638c;
                    P p5 = (P) this.f5639d;
                    if (list == null || list.isEmpty()) {
                        c0081j.f1702a = this;
                        c0081j.f1705d = 1;
                        obj = P.f(p5, false, c0081j);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        tVar = this;
                        c0075d = (C0075d) obj;
                    } else {
                        j0 g6 = p5.g();
                        C0084m c0084m = new C0084m(p5, this, null);
                        c0081j.f1702a = this;
                        c0081j.f1705d = 2;
                        obj = g6.b(c0084m, c0081j);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        tVar = this;
                        c0075d = (C0075d) obj;
                    }
                } else if (i2 == 1) {
                    tVar = c0081j.f1702a;
                    e5.g.y(obj);
                    c0075d = (C0075d) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = c0081j.f1702a;
                    e5.g.y(obj);
                    c0075d = (C0075d) obj;
                }
                ((P) tVar.f5639d).f1620h.h(c0075d);
                return f4.v.f5689a;
            }
        }
        c0081j = new C0081j(this, abstractC1295c);
        Object obj2 = c0081j.f1703b;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = c0081j.f1705d;
        if (i2 != 0) {
        }
        ((P) tVar.f5639d).f1620h.h(c0075d);
        return f4.v.f5689a;
    }

    public boolean d(Context context) {
        if (((Boolean) this.f5638c) == null) {
            this.f5638c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f5637b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f5638c).booleanValue();
    }

    public boolean e(Context context) {
        if (((Boolean) this.f5637b) == null) {
            this.f5637b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f5637b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f5637b).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0093, blocks: (B:25:0x0064, B:29:0x0074), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v5, types: [L4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(AbstractC1295c abstractC1295c) {
        e0 e0Var;
        int i2;
        L4.d dVar;
        t tVar;
        L4.a aVar;
        Throwable th;
        t tVar2;
        try {
            if (abstractC1295c instanceof e0) {
                e0Var = (e0) abstractC1295c;
                int i3 = e0Var.f1677e;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    e0Var.f1677e = i3 - Integer.MIN_VALUE;
                    Object obj = e0Var.f1675c;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = e0Var.f1677e;
                    f4.v vVar = f4.v.f5689a;
                    if (i2 != 0) {
                        e5.g.y(obj);
                        if (((C0013m) this.f5637b).I()) {
                            return vVar;
                        }
                        e0Var.f1673a = this;
                        dVar = (L4.d) this.f5636a;
                        e0Var.f1674b = dVar;
                        e0Var.f1677e = 1;
                        if (dVar.c(e0Var) == enumC1260a) {
                            return enumC1260a;
                        }
                        tVar = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = e0Var.f1674b;
                            tVar2 = e0Var.f1673a;
                            try {
                                e5.g.y(obj);
                                ((C0013m) tVar2.f5637b).L(vVar);
                                ((L4.d) aVar).e(null);
                                return vVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((L4.d) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r22 = e0Var.f1674b;
                        tVar = e0Var.f1673a;
                        e5.g.y(obj);
                        dVar = r22;
                    }
                    if (!((C0013m) tVar.f5637b).I()) {
                        dVar.e(null);
                        return vVar;
                    }
                    e0Var.f1673a = tVar;
                    e0Var.f1674b = dVar;
                    e0Var.f1677e = 2;
                    if (tVar.b(e0Var) == enumC1260a) {
                        return enumC1260a;
                    }
                    aVar = dVar;
                    tVar2 = tVar;
                    ((C0013m) tVar2.f5637b).L(vVar);
                    ((L4.d) aVar).e(null);
                    return vVar;
                }
            }
            if (!((C0013m) tVar.f5637b).I()) {
            }
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((L4.d) aVar).e(null);
            throw th;
        }
        e0Var = new e0(this, abstractC1295c);
        Object obj2 = e0Var.f1675c;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = e0Var.f1677e;
        f4.v vVar2 = f4.v.f5689a;
        if (i2 != 0) {
        }
    }

    public void g(Serializable serializable, H2.c cVar) {
        ((H2.f) this.f5637b).w((String) this.f5636a, ((H2.k) this.f5638c).encodeMessage(serializable), cVar == null ? null : new H2.a(this, 0, cVar));
    }

    public void h(H2.b bVar) {
        String str = (String) this.f5636a;
        H2.f fVar = (H2.f) this.f5637b;
        s0.k kVar = (s0.k) this.f5639d;
        if (kVar != null) {
            fVar.u(str, bVar != null ? new x1.e(this, bVar) : null, kVar);
        } else {
            fVar.i(str, bVar != null ? new x1.e(this, bVar) : null);
        }
    }
}
