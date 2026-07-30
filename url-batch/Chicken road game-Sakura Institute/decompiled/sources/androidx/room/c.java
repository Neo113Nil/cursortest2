package androidx.room;

import a2.j0;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseIntArray;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.google.android.gms.common.api.Status;
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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements c2.e, InstallReferrerStateListener, g5.k, l3.q, o5.h, p0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1068f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1069g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1070h;

    public /* synthetic */ c(int i7, Object obj, Object obj2, boolean z8) {
        this.f1068f = i7;
        this.f1069g = obj2;
        this.f1070h = obj;
    }

    public void A(boolean z8, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f1069g)) {
            hashMap = new HashMap((Map) this.f1069g);
        }
        synchronized (((Map) this.f1070h)) {
            hashMap2 = new HashMap((Map) this.f1070h);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z8 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z8 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((z4.c) entry2.getKey()).a(new j4.g(status));
            }
        }
    }

    @Override // l3.q
    public Object a() {
        return (l3.y) this.f1069g;
    }

    @Override // p0.l
    public Object b(p0.b bVar, Object obj) {
        return ((q6.e) this.f1069g).d(bVar, obj);
    }

    @Override // c2.e
    public int c(int i7) {
        do {
            c2.f fVar = (c2.f) this.f1070h;
            fVar.a(i7);
            i7 = ((BreakIterator) fVar.f1638e).preceding(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f1069g).charAt(i7)));
        return i7;
    }

    @Override // c2.e
    public int d(int i7) {
        do {
            c2.f fVar = (c2.f) this.f1070h;
            fVar.a(i7);
            i7 = ((BreakIterator) fVar.f1638e).following(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f1069g).charAt(i7 - 1)));
        return i7;
    }

    @Override // p0.l
    public Object e(Object obj) {
        return ((q6.c) this.f1070h).f(obj);
    }

    @Override // l3.q
    public boolean f(CharSequence charSequence, int i7, int i8, l3.v vVar) {
        if ((vVar.f5939c & 4) > 0) {
            return true;
        }
        if (((l3.y) this.f1069g) == null) {
            this.f1069g = new l3.y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((m4.f) this.f1070h).getClass();
        ((l3.y) this.f1069g).setSpan(new l3.w(vVar), i7, i8, 33);
        return true;
    }

    @Override // c2.e
    public int g(int i7) {
        CharSequence charSequence = (CharSequence) this.f1069g;
        do {
            c2.f fVar = (c2.f) this.f1070h;
            fVar.a(i7);
            i7 = ((BreakIterator) fVar.f1638e).following(i7);
            if (i7 == -1 || i7 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i7)));
        return i7;
    }

    @Override // g5.k
    public void h(c cVar) {
        ((g5.c) this.f1070h).a(this);
        ((b6.c) this.f1069g).h(cVar);
    }

    @Override // o5.h
    public boolean i(Object obj) {
        l5.v vVar = (l5.v) obj;
        l5.f fVar = (l5.f) this.f1070h;
        vVar.getClass();
        l5.f fVar2 = vVar.f6082b;
        if (((List) this.f1069g).contains(Long.valueOf(vVar.f6081a))) {
            return false;
        }
        return fVar2.x(fVar) || fVar.x(fVar2);
    }

    @Override // c2.e
    public int j(int i7) {
        do {
            c2.f fVar = (c2.f) this.f1070h;
            fVar.a(i7);
            i7 = ((BreakIterator) fVar.f1638e).preceding(i7);
            if (i7 == -1 || i7 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f1069g).charAt(i7 - 1)));
        return i7;
    }

    public boolean k(long j8) {
        Object obj;
        List list = (List) ((c) this.f1070h).f1069g;
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i7);
            if (l1.u.a(((l1.y) obj).f5848a, j8)) {
                break;
            }
            i7++;
        }
        l1.y yVar = (l1.y) obj;
        if (yVar != null) {
            return yVar.f5855h;
        }
        return false;
    }

    public void l(Object obj, String str) {
        ((ArrayList) this.f1069g).add(str + "=" + String.valueOf(obj));
    }

    @Override // g5.k
    public void m(g5.a aVar) {
        ((b6.c) this.f1069g).m(aVar);
    }

    public g2.w n(List list) {
        g2.i iVar;
        Exception e9;
        g2.i iVar2;
        try {
            int size = list.size();
            int i7 = 0;
            iVar = null;
            while (i7 < size) {
                try {
                    iVar2 = (g2.i) list.get(i7);
                } catch (Exception e10) {
                    e9 = e10;
                }
                try {
                    iVar2.a((g2.j) this.f1070h);
                    i7++;
                    iVar = iVar2;
                } catch (Exception e11) {
                    e9 = e11;
                    iVar = iVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((g2.j) this.f1070h).f4035a.b());
                    sb2.append(", composition=");
                    sb2.append(((g2.j) this.f1070h).c());
                    sb2.append(", selection=");
                    g2.j jVar = (g2.j) this.f1070h;
                    sb2.append((Object) j0.g(r4.a.h(jVar.f4036b, jVar.f4037c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    e6.l.l0(list, sb, new c1.a(iVar, this), 60);
                    String sb3 = sb.toString();
                    r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(sb3, e9);
                }
            }
            g2.j jVar2 = (g2.j) this.f1070h;
            jVar2.getClass();
            a2.g gVar = new a2.g(jVar2.f4035a.toString(), null, 6);
            g2.j jVar3 = (g2.j) this.f1070h;
            long h3 = r4.a.h(jVar3.f4036b, jVar3.f4037c);
            j0 j0Var = j0.f(((g2.w) this.f1069g).f4066b) ? null : new j0(h3);
            g2.w wVar = new g2.w(gVar, j0Var != null ? j0Var.f408a : r4.a.h(j0.d(h3), j0.e(h3)), ((g2.j) this.f1070h).c());
            this.f1069g = wVar;
            return wVar;
        } catch (Exception e12) {
            iVar = null;
            e9 = e12;
        }
    }

    public t5.s o(t5.c cVar, q5.a aVar) {
        l5.x xVar = (l5.x) this.f1070h;
        l5.f fVar = (l5.f) this.f1069g;
        xVar.getClass();
        l5.f m8 = fVar.m(cVar);
        t5.s z8 = ((l5.b) xVar.f6092a).z(m8);
        if (z8 != null) {
            return z8;
        }
        if (aVar.a(cVar)) {
            return ((l5.b) xVar.f6092a).x(m8).m(aVar.f7513a.f8910f.d(cVar));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0014, code lost:
    
        if (r5 == null) goto L6;
     */
    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onInstallReferrerSetupFinished(int i7) {
        Object b9;
        c7.h hVar = (c7.h) this.f1069g;
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f1070h;
        if (i7 == 0) {
            try {
                b9 = installReferrerClient.getInstallReferrer().getInstallReferrer();
            } catch (Throwable th) {
                b9 = d6.a.b(th);
            }
        }
        b9 = "";
        String str = (String) (b9 instanceof d6.l ? "" : b9);
        try {
            installReferrerClient.endConnection();
        } catch (Throwable th2) {
            d6.a.b(th2);
        }
        if (hVar.v()) {
            hVar.resumeWith(str);
        }
    }

    public t5.s p(t5.s sVar) {
        l5.x xVar = (l5.x) this.f1070h;
        l5.f fVar = (l5.f) this.f1069g;
        xVar.getClass();
        t5.s sVar2 = t5.k.f8908j;
        t5.s<t5.q> z8 = ((l5.b) xVar.f6092a).z(fVar);
        if (z8 != null) {
            if (!z8.i()) {
                for (t5.q qVar : z8) {
                    sVar2 = sVar2.o(qVar.f8919a, qVar.f8920b);
                }
            }
            return sVar2;
        }
        l5.b x8 = ((l5.b) xVar.f6092a).x(fVar);
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            t5.q qVar2 = (t5.q) it.next();
            sVar2 = sVar2.o(qVar2.f8919a, x8.x(new l5.f(qVar2.f8919a)).m(qVar2.f8920b));
        }
        ArrayList arrayList = new ArrayList();
        o5.e eVar = x8.f6007f;
        Object obj = eVar.f6846f;
        if (obj != null) {
            for (t5.q qVar3 : (t5.s) obj) {
                arrayList.add(new t5.q(qVar3.f8919a, qVar3.f8920b));
            }
        } else {
            for (Map.Entry entry : eVar.f6847g) {
                o5.e eVar2 = (o5.e) entry.getValue();
                if (eVar2.f6846f != null) {
                    arrayList.add(new t5.q((t5.c) entry.getKey(), (t5.s) eVar2.f6846f));
                }
            }
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            t5.q qVar4 = (t5.q) obj2;
            sVar2 = sVar2.o(qVar4.f8919a, qVar4.f8920b);
        }
        return sVar2;
    }

    public t5.s q(l5.f fVar, t5.s sVar, t5.s sVar2) {
        l5.x xVar = (l5.x) this.f1070h;
        l5.f fVar2 = (l5.f) this.f1069g;
        xVar.getClass();
        o5.j.b("Either existingEventSnap or existingServerSnap must exist", (sVar == null && sVar2 == null) ? false : true);
        l5.f g9 = fVar2.g(fVar);
        if (((l5.b) xVar.f6092a).z(g9) != null) {
            return null;
        }
        l5.b x8 = ((l5.b) xVar.f6092a).x(g9);
        return x8.f6007f.isEmpty() ? sVar2.b(fVar) : x8.m(sVar2.b(fVar));
    }

    public c r(String str) {
        g5.c cVar = (g5.c) this.f1070h;
        l5.f fVar = cVar.f4459b;
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (fVar.isEmpty()) {
            o5.k.b(str);
        } else {
            o5.k.a(str);
        }
        return new c(7, new g5.c(cVar.f4458a, fVar.g(new l5.f(str))), new t5.m(((t5.m) this.f1069g).f8910f.b(new l5.f(str)), t5.t.f8922a), false);
    }

    public void s(ArrayList arrayList, int i7, ArrayList arrayList2, List list, t5.m mVar) {
        q5.c cVar;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            q5.c cVar2 = (q5.c) obj;
            if (l.h.b(cVar2.f7519a, i7)) {
                arrayList3.add(cVar2);
            }
        }
        Collections.sort(arrayList3, new q5.f(this));
        int size2 = arrayList3.size();
        while (i8 < size2) {
            Object obj2 = arrayList3.get(i8);
            i8++;
            q5.c cVar3 = (q5.c) obj2;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l5.w wVar = (l5.w) it.next();
                wVar.getClass();
                if (i7 == 5) {
                    int i10 = cVar3.f7519a;
                    t5.m mVar2 = cVar3.f7520b;
                    t5.c cVar4 = cVar3.f7522d;
                    int i11 = cVar3.f7519a;
                    if (l.h.b(i10, 5) || l.h.b(i11, 1)) {
                        cVar = cVar3;
                    } else {
                        t5.s sVar = mVar2.f8910f;
                        t5.l lVar = (t5.l) this.f1070h;
                        t5.l lVar2 = mVar.f8912h;
                        if (!lVar2.equals(t5.n.f8913a) && !lVar2.equals(lVar)) {
                            throw new IllegalArgumentException("Index not available in IndexedNode!");
                        }
                        mVar.a();
                        if (m4.o.f(mVar.f8911g, t5.m.f8909i)) {
                            mVar.f8910f.k(cVar4);
                        }
                        cVar = new q5.c(i11, mVar2, cVar4, cVar3.f7521c);
                    }
                    arrayList.add(new q5.d(wVar, new c(7, new g5.c(wVar.f6088d, ((q5.i) this.f1069g).f7535a), cVar.f7520b, false)));
                }
            }
        }
    }

    public List t() {
        ArrayList arrayList;
        if (((ArrayList) this.f1069g).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1069g)) {
            arrayList = new ArrayList((ArrayList) this.f1069g);
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f1068f) {
            case 1:
                return "Bounds{lower=" + ((v2.c) this.f1069g) + " upper=" + ((v2.c) this.f1070h) + "}";
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                StringBuilder sb = new StringBuilder("DataSnapshot { key = ");
                l5.f fVar = ((g5.c) this.f1070h).f4459b;
                sb.append(fVar.isEmpty() ? null : fVar.y().f8889f);
                sb.append(", value = ");
                sb.append(((t5.m) this.f1069g).f8910f.r(true));
                sb.append(" }");
                return sb.toString();
            case 24:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f1070h.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f1069g;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb2.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public c u(t5.c cVar) {
        return new c((l.v) this.f1069g, 21, ((l5.f) this.f1070h).m(cVar));
    }

    public String v(String str) {
        String str2 = (String) this.f1070h;
        Resources resources = (Resources) this.f1069g;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void w(u5.e eVar) {
        ((j5.r) this.f1070h).f5118i.execute(new b3.z(6, (Object) this, (Object) eVar, false));
    }

    public void x(String str, String str2) {
        int i7;
        switch (this.f1068f) {
            case 19:
                ((l5.h) this.f1070h).f6031b.b(((l5.x) this.f1069g).c(str != null ? g5.a.a(str, str2) : null));
                break;
            default:
                g5.a a3 = str != null ? g5.a.a(str, str2) : null;
                l5.i iVar = (l5.i) this.f1070h;
                l5.v vVar = (l5.v) this.f1069g;
                l5.f fVar = vVar.f6082b;
                if (a3 != null && (i7 = a3.f4456a) != -1 && i7 != -25) {
                    iVar.f6040i.I("Persisted write at " + fVar.toString() + " failed: " + a3.toString());
                }
                long j8 = vVar.f6081a;
                l5.f fVar2 = vVar.f6082b;
                if (a3 == null || a3.f4456a != -25) {
                    boolean z8 = a3 == null;
                    l.v vVar2 = iVar.f6043l;
                    List list = (List) ((n5.a) vVar2.f5686g).a(new l5.r(vVar2, j8, !z8, iVar.f6033b));
                    if (list.size() > 0) {
                        iVar.d(fVar2);
                    }
                    iVar.b(list);
                    break;
                }
                break;
        }
    }

    public void y(String str) {
        u5.d dVar = (u5.d) this.f1069g;
        synchronized (dVar) {
            dVar.e((byte) 1, str.getBytes(u5.d.f9061m));
        }
    }

    public t5.s z(l5.f fVar) {
        l5.x xVar = (l5.x) this.f1070h;
        return ((l5.b) xVar.f6092a).z(((l5.f) this.f1069g).g(fVar));
    }

    public /* synthetic */ c(Object obj, int i7, Object obj2) {
        this.f1068f = i7;
        this.f1069g = obj;
        this.f1070h = obj2;
    }

    public c(Context context) {
        this.f1068f = 25;
        m4.o.d(context);
        Resources resources = context.getResources();
        this.f1069g = resources;
        this.f1070h = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ c(Object obj) {
        this.f1068f = 24;
        this.f1070h = obj;
        this.f1069g = new ArrayList();
    }

    public c(o4.b bVar, j4.i iVar) {
        this.f1068f = 11;
        this.f1070h = "ClientTelemetry.API";
        this.f1069g = bVar;
    }

    public c(q5.i iVar) {
        this.f1068f = 29;
        this.f1069g = iVar;
        this.f1070h = iVar.f7536b.f7534e;
    }

    public c(a5.f fVar) {
        this.f1068f = 9;
        new HashSet();
        this.f1070h = fVar;
        if (fVar != null) {
            fVar.b();
            this.f1069g = fVar.f499a;
        } else {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
    }

    public c(j5.r rVar, u5.d dVar) {
        this.f1068f = 10;
        this.f1070h = rVar;
        this.f1069g = dVar;
        dVar.f9066c = this;
    }

    public c(String[] strArr, e7.e eVar) {
        this.f1068f = 0;
        this.f1070h = eVar;
        this.f1068f = 0;
        r6.k.f(strArr, "tables");
        this.f1069g = strArr;
    }

    public c(int i7) {
        this.f1068f = i7;
        switch (i7) {
            case 4:
                this.f1069g = new m4.f();
                this.f1070h = new e2.b();
                break;
            case 6:
                break;
            case 16:
                this.f1069g = Collections.synchronizedMap(new WeakHashMap());
                this.f1070h = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 26:
                j4.e eVar = j4.e.f5013d;
                this.f1069g = new SparseIntArray();
                this.f1070h = eVar;
                break;
            case 27:
                this.f1069g = new ArrayList();
                this.f1070h = new HashMap();
                new HashMap();
                break;
            default:
                this.f1069g = new LinkedHashMap();
                this.f1070h = new LinkedHashMap();
                break;
        }
    }

    public c(boolean z8, List list, l5.f fVar) {
        this.f1068f = 22;
        this.f1069g = list;
        this.f1070h = fVar;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }
}
