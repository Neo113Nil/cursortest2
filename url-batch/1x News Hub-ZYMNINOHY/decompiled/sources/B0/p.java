package B0;

import K.C0039c;
import K.C0045i;
import K.C0048l;
import K.N;
import K.c0;
import K.h0;
import a2.InterfaceC0133a;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import b2.C0195i;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import t2.C1202l;
import x0.InterfaceC1239b;
import y1.InterfaceC1255c;

/* loaded from: classes.dex */
public final class p implements InterfaceC1239b, InterfaceC1255c {

    /* renamed from: a, reason: collision with root package name */
    public Object f162a;

    /* renamed from: b, reason: collision with root package name */
    public Object f163b;

    /* renamed from: c, reason: collision with root package name */
    public Object f164c;

    /* renamed from: d, reason: collision with root package name */
    public Object f165d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f162a = obj;
        this.f163b = obj2;
        this.f165d = obj3;
        this.f164c = obj4;
    }

    public SpannableString a() {
        if (((String) this.f162a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f162a);
        ArrayList arrayList = (ArrayList) this.f163b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.l lVar = (io.flutter.view.l) it.next();
                int b3 = M.j.b(lVar.f9446c);
                if (b3 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), lVar.f9444a, lVar.f9445b, 0);
                } else if (b3 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.j) lVar).f9443d)), lVar.f9444a, lVar.f9445b, 0);
                }
            }
        }
        String str = (String) this.f165d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f165d), 0, ((String) this.f162a).length(), 0);
        }
        String str2 = (String) this.f164c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f164c)), 0, ((String) this.f162a).length(), 0);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(AbstractC0326c abstractC0326c) {
        C0045i c0045i;
        int i3;
        p pVar;
        C0039c c0039c;
        if (abstractC0326c instanceof C0045i) {
            c0045i = (C0045i) abstractC0326c;
            int i4 = c0045i.f776g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0045i.f776g = i4 - Integer.MIN_VALUE;
                Object obj = c0045i.f775e;
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                i3 = c0045i.f776g;
                if (i3 != 0) {
                    android.support.v4.media.session.a.T(obj);
                    List list = (List) this.f164c;
                    N n3 = (N) this.f165d;
                    if (list == null || list.isEmpty()) {
                        c0045i.f774d = this;
                        c0045i.f776g = 1;
                        obj = N.f(n3, false, c0045i);
                        if (obj != enumC0317a) {
                            pVar = this;
                            c0039c = (C0039c) obj;
                        }
                    } else {
                        h0 g3 = n3.g();
                        C0048l c0048l = new C0048l(n3, this, null);
                        c0045i.f774d = this;
                        c0045i.f776g = 2;
                        obj = g3.b(c0048l, c0045i);
                        if (obj != enumC0317a) {
                            pVar = this;
                            c0039c = (C0039c) obj;
                        }
                    }
                    return enumC0317a;
                }
                if (i3 == 1) {
                    pVar = c0045i.f774d;
                    android.support.v4.media.session.a.T(obj);
                    c0039c = (C0039c) obj;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = c0045i.f774d;
                    android.support.v4.media.session.a.T(obj);
                    c0039c = (C0039c) obj;
                }
                ((N) pVar.f165d).f701h.w(c0039c);
                return C0195i.f2555a;
            }
        }
        c0045i = new C0045i(this, abstractC0326c);
        Object obj2 = c0045i.f775e;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = c0045i.f776g;
        if (i3 != 0) {
        }
        ((N) pVar.f165d).f701h.w(c0039c);
        return C0195i.f2555a;
    }

    public File c(Context context) {
        ((m1.c) this.f163b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER));
    }

    public void d(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((C0.f) this.f165d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    @Override // y1.InterfaceC1255c
    public void e(Serializable serializable) {
        this.f162a = serializable;
    }

    @Override // y1.InterfaceC1255c
    public void f(String str, HashMap hashMap) {
        this.f163b = "sqlite_error";
        this.f164c = str;
        this.f165d = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:25:0x0067, B:29:0x0079), top: B:24:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [B2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(AbstractC0326c abstractC0326c) {
        c0 c0Var;
        int i3;
        B2.d dVar;
        p pVar;
        B2.a aVar;
        Throwable th;
        p pVar2;
        try {
            if (abstractC0326c instanceof c0) {
                c0Var = (c0) abstractC0326c;
                int i4 = c0Var.f749h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0Var.f749h = i4 - Integer.MIN_VALUE;
                    Object obj = c0Var.f;
                    EnumC0317a enumC0317a = EnumC0317a.f4969a;
                    i3 = c0Var.f749h;
                    C0195i c0195i = C0195i.f2555a;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        if (!(((C1202l) this.f163b).D() instanceof t2.N)) {
                            return c0195i;
                        }
                        c0Var.f746d = this;
                        dVar = (B2.d) this.f162a;
                        c0Var.f747e = dVar;
                        c0Var.f749h = 1;
                        if (dVar.c(c0Var) != enumC0317a) {
                            pVar = this;
                        }
                        return enumC0317a;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = c0Var.f747e;
                        pVar2 = c0Var.f746d;
                        try {
                            android.support.v4.media.session.a.T(obj);
                            ((C1202l) pVar2.f163b).J(c0195i);
                            ((B2.d) aVar).e(null);
                            return c0195i;
                        } catch (Throwable th2) {
                            th = th2;
                            ((B2.d) aVar).e(null);
                            throw th;
                        }
                    }
                    ?? r22 = c0Var.f747e;
                    pVar = c0Var.f746d;
                    android.support.v4.media.session.a.T(obj);
                    dVar = r22;
                    if (((C1202l) pVar.f163b).D() instanceof t2.N) {
                        dVar.e(null);
                        return c0195i;
                    }
                    c0Var.f746d = pVar;
                    c0Var.f747e = dVar;
                    c0Var.f749h = 2;
                    if (pVar.b(c0Var) != enumC0317a) {
                        aVar = dVar;
                        pVar2 = pVar;
                        ((C1202l) pVar2.f163b).J(c0195i);
                        ((B2.d) aVar).e(null);
                        return c0195i;
                    }
                    return enumC0317a;
                }
            }
            if (((C1202l) pVar.f163b).D() instanceof t2.N) {
            }
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((B2.d) aVar).e(null);
            throw th;
        }
        c0Var = new c0(this, abstractC0326c);
        Object obj2 = c0Var.f;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = c0Var.f749h;
        C0195i c0195i2 = C0195i.f2555a;
        if (i3 != 0) {
        }
    }

    @Override // a2.InterfaceC0133a
    public Object get() {
        return new o((Executor) ((InterfaceC0133a) this.f162a).get(), (C0.d) ((InterfaceC0133a) this.f163b).get(), (d) ((A0.f) this.f165d).get(), (D0.c) ((InterfaceC0133a) this.f164c).get());
    }

    public void h(Object obj, P1.c cVar) {
        ((P1.f) this.f162a).q((String) this.f163b, ((P1.k) this.f164c).encodeMessage(obj), cVar == null ? null : new P1.a(this, 0, cVar));
    }

    public void i(P1.b bVar) {
        String str = (String) this.f163b;
        P1.f fVar = (P1.f) this.f162a;
        K0.j jVar = (K0.j) this.f165d;
        if (jVar != null) {
            fVar.d(str, bVar != null ? new V0.e(this, bVar, 24, false) : null, jVar);
        } else {
            fVar.b(str, bVar != null ? new V0.e(this, bVar, 24, false) : null);
        }
    }

    public p(P1.f fVar, String str, P1.k kVar, K0.j jVar) {
        this.f162a = fVar;
        this.f163b = str;
        this.f164c = kVar;
        this.f165d = jVar;
    }
}
