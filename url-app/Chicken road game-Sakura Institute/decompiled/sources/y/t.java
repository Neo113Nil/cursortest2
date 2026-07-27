package y;

import A.C0028y;
import A0.C0036g;
import A0.K;
import G.C0231x;
import W2.C0286h;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b2.C0517a;
import b2.C0519c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.chicken.road.kedro.laqer.R;
import com.google.android.gms.common.api.Status;
import d2.C0549f;
import g2.C0639b;
import j2.AbstractC0720j;
import j2.AbstractC0721k;
import j2.C0715e;
import j2.C0716f;
import j2.InterfaceC0718h;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import l2.C0821a;
import l2.C0823c;
import l2.C0824d;
import o2.C0924c;
import q.AbstractC1024c;
import s.C1093I;
import w2.C1294c;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1336k;
import y2.C1342q;
import y2.EnumC1337l;
import z2.C1403G;

/* loaded from: classes.dex */
public final class t implements InstallReferrerStateListener, C0.e, P.n, b2.k, InterfaceC0718h, k1.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11493d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11494e;

    /* renamed from: i, reason: collision with root package name */
    public Object f11495i;

    public /* synthetic */ t(int i2, Object obj, Object obj2, boolean z4) {
        this.f11493d = i2;
        this.f11495i = obj;
        this.f11494e = obj2;
    }

    @Override // C0.e
    public int C(int i2) {
        CharSequence charSequence;
        do {
            C0.f fVar = (C0.f) this.f11495i;
            fVar.a(i2);
            i2 = ((BreakIterator) fVar.f1159e).following(i2);
            if (i2 != -1) {
                charSequence = (CharSequence) this.f11494e;
                if (i2 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i2)));
        return i2;
    }

    @Override // C0.e
    public int E(int i2) {
        do {
            C0.f fVar = (C0.f) this.f11495i;
            fVar.a(i2);
            i2 = ((BreakIterator) fVar.f1159e).preceding(i2);
            if (i2 == -1 || i2 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f11494e).charAt(i2 - 1)));
        return i2;
    }

    @Override // k1.l
    public Object a() {
        return (k1.t) this.f11494e;
    }

    @Override // b2.k
    public void b(C0517a c0517a) {
        ((C1294c) this.f11494e).b(c0517a);
    }

    @Override // b2.k
    public void c(t tVar) {
        ((C0519c) this.f11495i).a(this);
        ((C1294c) this.f11494e).c(tVar);
    }

    @Override // k1.l
    public boolean d(CharSequence charSequence, int i2, int i4, k1.q qVar) {
        if ((qVar.f7411c & 4) > 0) {
            return true;
        }
        if (((k1.t) this.f11494e) == null) {
            this.f11494e = new k1.t(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((H1.f) this.f11495i).getClass();
        ((k1.t) this.f11494e).setSpan(new k1.r(qVar), i2, i4, 33);
        return true;
    }

    @Override // P.n
    public Object e(P.b bVar, Object obj) {
        return ((Function2) this.f11494e).h(bVar, obj);
    }

    @Override // j2.InterfaceC0718h
    public boolean f(Object obj) {
        g2.v vVar = (g2.v) obj;
        vVar.getClass();
        if (!((List) this.f11494e).contains(Long.valueOf(vVar.f6760a))) {
            g2.e eVar = vVar.f6761b;
            g2.e eVar2 = (g2.e) this.f11495i;
            if (eVar.w(eVar2) || eVar2.w(eVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(long j4) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((t) this.f11495i).f11494e;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            if (l0.r.a(((l0.u) obj).f7939a, j4)) {
                break;
            }
            i2++;
        }
        l0.u uVar = (l0.u) obj;
        if (uVar != null) {
            return uVar.f7946h;
        }
        return false;
    }

    public void h(Object obj, String str) {
        ((ArrayList) this.f11494e).add(str + "=" + String.valueOf(obj));
    }

    public G0.y i(List list) {
        G0.i iVar;
        Exception e4;
        G0.i iVar2;
        try {
            int size = list.size();
            int i2 = 0;
            iVar = null;
            while (i2 < size) {
                try {
                    iVar2 = (G0.i) list.get(i2);
                } catch (Exception e5) {
                    e4 = e5;
                }
                try {
                    iVar2.a((G0.j) this.f11495i);
                    i2++;
                    iVar = iVar2;
                } catch (Exception e6) {
                    e4 = e6;
                    iVar = iVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((G0.j) this.f11495i).f3061a.b());
                    sb2.append(", composition=");
                    sb2.append(((G0.j) this.f11495i).c());
                    sb2.append(", selection=");
                    G0.j jVar = (G0.j) this.f11495i;
                    sb2.append((Object) K.g(M1.a.j(jVar.f3062b, jVar.f3063c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                    sb.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                    C1403G.v(list, sb, new C0028y(iVar, 12, this), 60);
                    String sb3 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(sb3, e4);
                }
            }
            G0.j jVar2 = (G0.j) this.f11495i;
            jVar2.getClass();
            C0036g c0036g = new C0036g(jVar2.f3061a.toString(), null, 6);
            G0.j jVar3 = (G0.j) this.f11495i;
            long j4 = M1.a.j(jVar3.f3062b, jVar3.f3063c);
            K k4 = K.f(((G0.y) this.f11494e).f3094b) ? null : new K(j4);
            G0.y yVar = new G0.y(c0036g, k4 != null ? k4.f301a : M1.a.j(K.d(j4), K.e(j4)), ((G0.j) this.f11495i).c());
            this.f11494e = yVar;
            return yVar;
        } catch (Exception e7) {
            iVar = null;
            e4 = e7;
        }
    }

    public o2.s j(C0924c c0924c, C0821a c0821a) {
        g2.x xVar = (g2.x) this.f11495i;
        xVar.getClass();
        g2.e j4 = ((g2.e) this.f11494e).j(c0924c);
        o2.s C3 = ((C0639b) xVar.f6771a).C(j4);
        if (C3 != null) {
            return C3;
        }
        if (c0821a.a(c0924c)) {
            return ((C0639b) xVar.f6771a).w(j4).j(c0821a.f7962a.f8941d.b(c0924c));
        }
        return null;
    }

    public o2.s k(o2.s sVar) {
        g2.x xVar = (g2.x) this.f11495i;
        xVar.getClass();
        o2.s sVar2 = o2.k.f8939k;
        C0639b c0639b = (C0639b) xVar.f6771a;
        g2.e eVar = (g2.e) this.f11494e;
        o2.s<o2.q> C3 = c0639b.C(eVar);
        if (C3 == null) {
            C0639b w4 = ((C0639b) xVar.f6771a).w(eVar);
            Iterator it = sVar.iterator();
            while (it.hasNext()) {
                o2.q qVar = (o2.q) it.next();
                sVar2 = sVar2.m(qVar.f8950a, w4.w(new g2.e(qVar.f8950a)).j(qVar.f8951b));
            }
            ArrayList arrayList = new ArrayList();
            C0715e c0715e = w4.f6678d;
            Object obj = c0715e.f7159d;
            if (obj != null) {
                for (o2.q qVar2 : (o2.s) obj) {
                    arrayList.add(new o2.q(qVar2.f8950a, qVar2.f8951b));
                }
            } else {
                for (Map.Entry entry : c0715e.f7160e) {
                    C0715e c0715e2 = (C0715e) entry.getValue();
                    if (c0715e2.f7159d != null) {
                        arrayList.add(new o2.q((C0924c) entry.getKey(), (o2.s) c0715e2.f7159d));
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                o2.q qVar3 = (o2.q) it2.next();
                sVar2 = sVar2.m(qVar3.f8950a, qVar3.f8951b);
            }
        } else if (!C3.y()) {
            for (o2.q qVar4 : C3) {
                sVar2 = sVar2.m(qVar4.f8950a, qVar4.f8951b);
            }
        }
        return sVar2;
    }

    public o2.s l(g2.e eVar, o2.s sVar, o2.s sVar2) {
        g2.x xVar = (g2.x) this.f11495i;
        xVar.getClass();
        AbstractC0720j.b("Either existingEventSnap or existingServerSnap must exist", (sVar == null && sVar2 == null) ? false : true);
        g2.e h4 = ((g2.e) this.f11494e).h(eVar);
        if (((C0639b) xVar.f6771a).C(h4) != null) {
            return null;
        }
        C0639b w4 = ((C0639b) xVar.f6771a).w(h4);
        return w4.f6678d.isEmpty() ? sVar2.p(eVar) : w4.j(sVar2.p(eVar));
    }

    public t m(String str) {
        C0519c c0519c = (C0519c) this.f11495i;
        g2.e eVar = c0519c.f5634b;
        if (eVar.isEmpty()) {
            AbstractC0721k.b(str);
        } else {
            AbstractC0721k.a(str);
        }
        return new t(16, new C0519c(c0519c.f5633a, eVar.h(new g2.e(str))), new o2.m(((o2.m) this.f11494e).f8941d.p(new g2.e(str)), o2.t.f8953a), false);
    }

    public void n(ArrayList arrayList, int i2, ArrayList arrayList2, List list, o2.m mVar) {
        C0823c c0823c;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0823c c0823c2 = (C0823c) it.next();
            if (AbstractC0784j.b(c0823c2.f7968a, i2)) {
                arrayList3.add(c0823c2);
            }
        }
        Collections.sort(arrayList3, new l2.f(this));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            C0823c c0823c3 = (C0823c) it2.next();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                g2.w wVar = (g2.w) it3.next();
                wVar.getClass();
                if (i2 == 5) {
                    if (!AbstractC0784j.b(c0823c3.f7968a, 5)) {
                        int i4 = c0823c3.f7968a;
                        if (!AbstractC0784j.b(i4, 1)) {
                            o2.m mVar2 = c0823c3.f7969b;
                            o2.s sVar = mVar2.f8941d;
                            o2.n nVar = o2.n.f8944a;
                            o2.l lVar = mVar.f8943i;
                            if (!lVar.equals(nVar) && !lVar.equals((o2.l) this.f11495i)) {
                                throw new IllegalArgumentException("Index not available in IndexedNode!");
                            }
                            mVar.e();
                            boolean f4 = H1.o.f(mVar.f8942e, o2.m.f8940j);
                            C0924c c0924c = c0823c3.f7971d;
                            if (f4) {
                                mVar.f8941d.g(c0924c);
                            } else {
                                C0549f c0549f = mVar.f8942e;
                            }
                            c0823c = new C0823c(i4, mVar2, c0924c, c0823c3.f7970c);
                            int i5 = 16;
                            arrayList.add(new C0824d(wVar, new t(i5, new C0519c(wVar.f6767d, ((l2.i) this.f11494e).f7984a), c0823c.f7969b, false)));
                        }
                    }
                    c0823c = c0823c3;
                    int i52 = 16;
                    arrayList.add(new C0824d(wVar, new t(i52, new C0519c(wVar.f6767d, ((l2.i) this.f11494e).f7984a), c0823c.f7969b, false)));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y2.j] */
    public InputMethodManager o() {
        return (InputMethodManager) this.f11495i.getValue();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r4 == null) goto L7;
     */
    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onInstallReferrerSetupFinished(int i2) {
        Object a4;
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f11495i;
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            if (i2 == 0) {
                a4 = installReferrerClient.getInstallReferrer().getInstallReferrer();
            }
            a4 = "";
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        String str = (String) (a4 instanceof C1342q ? "" : a4);
        try {
            installReferrerClient.endConnection();
            Unit unit = Unit.f7487a;
        } catch (Throwable th2) {
            AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
            AbstractC1343r.a(th2);
        }
        C0286h c0286h = (C0286h) this.f11494e;
        if (c0286h.x()) {
            c0286h.u(str);
        }
    }

    public t p(C0924c c0924c) {
        return new t((g2.s) this.f11494e, 23, ((g2.e) this.f11495i).j(c0924c));
    }

    public String q(String str) {
        String str2 = (String) this.f11495i;
        Resources resources = (Resources) this.f11494e;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void r(p2.f fVar) {
        ((e2.r) this.f11495i).f6254i.execute(new G1.n(this, 11, fVar));
    }

    public void s(String str, String str2) {
        int i2;
        switch (this.f11493d) {
            case 21:
                ((g2.g) this.f11495i).f6702b.b(((g2.x) this.f11494e).c(str != null ? C0517a.a(str, str2) : null));
                break;
            default:
                C0517a a4 = str != null ? C0517a.a(str, str2) : null;
                g2.v vVar = (g2.v) this.f11494e;
                g2.e eVar = vVar.f6761b;
                g2.h hVar = (g2.h) this.f11495i;
                hVar.getClass();
                if (a4 != null && (i2 = a4.f5631a) != -1 && i2 != -25) {
                    hVar.f6711i.M("Persisted write at " + eVar.toString() + " failed: " + a4.toString());
                }
                g2.e eVar2 = vVar.f6761b;
                if (a4 == null || a4.f5631a != -25) {
                    boolean z4 = a4 == null;
                    g2.s sVar = hVar.f6714l;
                    C0716f c0716f = hVar.f6704b;
                    sVar.getClass();
                    List list = (List) ((C0231x) sVar.f6757g).a(new g2.q(sVar, vVar.f6760a, !z4, c0716f));
                    if (list.size() > 0) {
                        hVar.d(eVar2);
                    }
                    hVar.b(list);
                    break;
                }
                break;
        }
    }

    public void t(String str) {
        p2.e eVar = (p2.e) this.f11494e;
        synchronized (eVar) {
            eVar.e((byte) 1, str.getBytes(p2.e.f9089m));
        }
    }

    public String toString() {
        switch (this.f11493d) {
            case 10:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f11495i.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f11494e;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append((String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case AbstractC1024c.f9246g /* 15 */:
                return "Bounds{lower=" + ((V0.c) this.f11494e) + " upper=" + ((V0.c) this.f11495i) + "}";
            case 16:
                StringBuilder sb2 = new StringBuilder("DataSnapshot { key = ");
                g2.e eVar = ((C0519c) this.f11495i).f5634b;
                sb2.append(eVar.isEmpty() ? null : eVar.B().f8920d);
                sb2.append(", value = ");
                sb2.append(((o2.m) this.f11494e).f8941d.t(true));
                sb2.append(" }");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public o2.s u(g2.e eVar) {
        return ((C0639b) ((g2.x) this.f11495i).f6771a).C(((g2.e) this.f11494e).h(eVar));
    }

    public void v(boolean z4, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f11494e)) {
            hashMap = new HashMap((Map) this.f11494e);
        }
        synchronized (((Map) this.f11495i)) {
            hashMap2 = new HashMap((Map) this.f11495i);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((U1.e) entry2.getKey()).a(new E1.g(status));
            }
        }
    }

    @Override // C0.e
    public int w(int i2) {
        do {
            C0.f fVar = (C0.f) this.f11495i;
            fVar.a(i2);
            i2 = ((BreakIterator) fVar.f1159e).preceding(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f11494e).charAt(i2)));
        return i2;
    }

    @Override // C0.e
    public int x(int i2) {
        do {
            C0.f fVar = (C0.f) this.f11495i;
            fVar.a(i2);
            i2 = ((BreakIterator) fVar.f1159e).following(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f11494e).charAt(i2 - 1)));
        return i2;
    }

    public /* synthetic */ t(int i2, boolean z4) {
        this.f11493d = i2;
    }

    public /* synthetic */ t(Object obj, int i2, Object obj2) {
        this.f11493d = i2;
        this.f11494e = obj;
        this.f11495i = obj2;
    }

    public t(J1.b bVar, E1.i iVar) {
        this.f11493d = 5;
        this.f11495i = "ClientTelemetry.API";
        this.f11494e = bVar;
    }

    public t(Context context) {
        this.f11493d = 11;
        H1.o.d(context);
        Resources resources = context.getResources();
        this.f11494e = resources;
        this.f11495i = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ t(Object obj) {
        this.f11493d = 10;
        this.f11495i = obj;
        this.f11494e = new ArrayList();
    }

    public t(l2.i iVar) {
        this.f11493d = 29;
        this.f11494e = iVar;
        this.f11495i = iVar.f7985b.f7983e;
    }

    public t(V1.f fVar) {
        this.f11493d = 18;
        new HashSet();
        this.f11495i = fVar;
        if (fVar != null) {
            fVar.b();
            this.f11494e = fVar.f4165a;
        } else {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
    }

    public t(View view) {
        this.f11493d = 0;
        this.f11494e = view;
        this.f11495i = C1336k.b(EnumC1337l.f11671e, new C1093I(9, this));
    }

    public t(e2.r rVar, p2.e eVar) {
        this.f11493d = 19;
        this.f11495i = rVar;
        this.f11494e = eVar;
        eVar.f9094c = this;
    }

    public t(int i2) {
        this.f11493d = i2;
        switch (i2) {
            case 4:
                this.f11494e = new E1.i(5);
                this.f11495i = new E0.b();
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                this.f11494e = Collections.synchronizedMap(new WeakHashMap());
                this.f11495i = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 12:
                E1.e eVar = E1.e.f2288d;
                this.f11494e = new SparseIntArray();
                this.f11495i = eVar;
                break;
            default:
                this.f11494e = new LinkedHashMap();
                this.f11495i = new LinkedHashMap();
                break;
        }
    }

    public t(boolean z4, List list, g2.e eVar) {
        this.f11493d = 24;
        this.f11494e = list;
        this.f11495i = eVar;
    }
}
