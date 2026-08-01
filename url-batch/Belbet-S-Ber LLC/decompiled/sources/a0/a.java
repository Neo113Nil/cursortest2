package a0;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.r;
import androidx.emoji2.text.z;
import androidx.fragment.app.d0;
import androidx.fragment.app.v0;
import androidx.fragment.app.w;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.gdmhkmf.belbet.MainActivity2;
import g1.j0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.e0;
import k.m;
import k.o;
import k.x;
import l.d2;
import l.t2;
import l.w0;
import n0.p;
import n0.p0;
import n0.s1;
import n0.v1;
import org.json.JSONArray;
import org.json.JSONObject;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class a implements p, androidx.emoji2.text.k, r, j0.d, n0, e1.e, j0, i2.h, d2, x, k.k, w0, n0.c, n0.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f78f;

    /* renamed from: g, reason: collision with root package name */
    public Object f79g;

    public /* synthetic */ a(int i) {
        this.f78f = i;
    }

    @Override // n0.c
    public void A(int i) {
        ((ContentInfo.Builder) this.f79g).setFlags(i);
    }

    public boolean B(int i, int i4) {
        g1.c cVar = (g1.c) this.f79g;
        Object obj = cVar.f1620f.get(i);
        Object obj2 = cVar.f1621g.get(i4);
        if (obj != null && obj2 != null) {
            cVar.i.f1635b.getClass();
            return ((o1.h) obj).equals((o1.h) obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean C(int i, int i4) {
        g1.c cVar = (g1.c) this.f79g;
        Object obj = cVar.f1620f.get(i);
        Object obj2 = cVar.f1621g.get(i4);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        cVar.i.f1635b.getClass();
        return i3.d.a(((o1.h) obj).f2898a, ((o1.h) obj2).f2898a);
    }

    public o0.g D(int i) {
        return null;
    }

    public o0.g E(int i) {
        return null;
    }

    public List F() {
        String string = ((SharedPreferences) this.f79g).getString("entries", null);
        if (string == null) {
            return q.f3887f;
        }
        JSONArray jSONArray = new JSONArray(string);
        y2.c cVar = new y2.c(10);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            i3.d.d(jSONObject, "getJSONObject(...)");
            String string2 = jSONObject.getString("id");
            i3.d.d(string2, "getString(...)");
            String string3 = jSONObject.getString("name");
            i3.d.d(string3, "getString(...)");
            LocalDate parse = LocalDate.parse(jSONObject.getString("birthDate"));
            i3.d.d(parse, "parse(...)");
            String optString = jSONObject.optString("note", "");
            i3.d.d(optString, "optString(...)");
            cVar.add(new o1.h(string2, string3, parse, optString));
        }
        cVar.f();
        cVar.h = true;
        return cVar.f4110g > 0 ? cVar : y2.c.i;
    }

    public void G(int i, int i4) {
        g1.c cVar = (g1.c) this.f79g;
        Object obj = cVar.f1620f.get(i);
        Object obj2 = cVar.f1621g.get(i4);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        cVar.i.f1635b.getClass();
    }

    public void H() {
        ((w) this.f79g).f676r.N();
    }

    public boolean I(int i, int i4, Bundle bundle) {
        return false;
    }

    public void J(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o1.h hVar = (o1.h) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", hVar.f2898a);
            jSONObject.put("name", hVar.f2899b);
            jSONObject.put("birthDate", hVar.f2900c.toString());
            jSONObject.put("note", hVar.d);
            jSONArray.put(jSONObject);
        }
        ((SharedPreferences) this.f79g).edit().putString("entries", jSONArray.toString()).apply();
    }

    @Override // k.x
    public void a(m mVar, boolean z4) {
        if (mVar instanceof e0) {
            ((e0) mVar).f2177z.k().c(false);
        }
        x xVar = ((l.j) this.f79g).f2464j;
        if (xVar != null) {
            xVar.a(mVar, z4);
        }
    }

    @Override // n0.c
    public n0.f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f79g).build();
        return new n0.f(new a(build));
    }

    @Override // l.d2
    public void c(m mVar, o oVar) {
        k.g gVar = (k.g) this.f79g;
        Handler handler = gVar.f2184l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f2186n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((k.f) arrayList.get(i)).f2179b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i4 = i + 1;
        handler.postAtTime(new k.e(this, i4 < arrayList.size() ? (k.f) arrayList.get(i4) : null, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // n0.e
    public ClipData e() {
        ClipData clip;
        clip = ((ContentInfo) this.f79g).getClip();
        return clip;
    }

    @Override // l.d2
    public void f(m mVar, MenuItem menuItem) {
        ((k.g) this.f79g).f2184l.removeCallbacksAndMessages(mVar);
    }

    @Override // androidx.emoji2.text.k
    public void g(final b4.d dVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.m
            @Override // java.lang.Runnable
            public final void run() {
                a0.a aVar = a0.a.this;
                b4.d dVar2 = dVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    v m4 = b4.l.m((Context) aVar.f79g);
                    if (m4 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    u uVar = (u) ((k) m4.f449b);
                    synchronized (uVar.i) {
                        uVar.f478k = threadPoolExecutor2;
                    }
                    ((k) m4.f449b).g(new n(dVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    dVar2.F(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // g1.j0
    public void h(int i, int i4) {
        ((o1.c) this.f79g).f1764a.f(i, i4);
    }

    @Override // g1.j0
    public void i(int i, int i4) {
        ((o1.c) this.f79g).f1764a.c(i, i4);
    }

    @Override // androidx.emoji2.text.r
    public boolean k(CharSequence charSequence, int i, int i4, z zVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i4), (String) this.f79g)) {
            return true;
        }
        zVar.f489c = (zVar.f489c & 3) | 4;
        return false;
    }

    @Override // n0.p
    public v1 l(View view, v1 v1Var) {
        s1 s1Var = v1Var.f2842a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f79g;
        if (!Objects.equals(coordinatorLayout.f395s, v1Var)) {
            coordinatorLayout.f395s = v1Var;
            boolean z4 = v1Var.d() > 0;
            coordinatorLayout.f396t = z4;
            coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
            if (!s1Var.r()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = p0.f2816a;
                    if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).f81a != null && s1Var.r()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return v1Var;
    }

    @Override // androidx.lifecycle.n0
    public l0 m(Class cls, b1.c cVar) {
        androidx.lifecycle.j0 j0Var = null;
        for (b1.d dVar : (b1.d[]) this.f79g) {
            dVar.getClass();
            if (androidx.lifecycle.j0.class.equals(cls)) {
                j0Var = new androidx.lifecycle.j0();
            }
        }
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // k.x
    public boolean n(m mVar) {
        l.j jVar = (l.j) this.f79g;
        if (mVar == jVar.h) {
            return false;
        }
        ((e0) mVar).A.getClass();
        jVar.getClass();
        x xVar = jVar.f2464j;
        if (xVar != null) {
            return xVar.n(mVar);
        }
        return false;
    }

    @Override // n0.e
    public int o() {
        int flags;
        flags = ((ContentInfo) this.f79g).getFlags();
        return flags;
    }

    @Override // j0.d
    public void onCancel() {
        ((v0) this.f79g).a();
    }

    @Override // e1.e
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.k
    public boolean q(m mVar, MenuItem menuItem) {
        l.m mVar2 = ((ActionMenuView) this.f79g).E;
        if (mVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((t2) mVar2).f2569f.L.f473b).iterator();
        while (it.hasNext()) {
            if (((d0) it.next()).f530a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.e
    public ContentInfo r() {
        return (ContentInfo) this.f79g;
    }

    @Override // e1.e
    public void s(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f79g).setResultCode(i);
    }

    @Override // n0.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f79g).setExtras(bundle);
    }

    @Override // g1.j0
    public void t(int i, int i4) {
        ((o1.c) this.f79g).f1764a.d(i, i4);
    }

    public String toString() {
        switch (this.f78f) {
            case 24:
                return "ContentInfoCompat{" + ((ContentInfo) this.f79g) + "}";
            default:
                return super.toString();
        }
    }

    @Override // g1.j0
    public void u(int i, int i4) {
        ((o1.c) this.f79g).f1764a.e(i, i4);
    }

    @Override // n0.c
    public void w(Uri uri) {
        ((ContentInfo.Builder) this.f79g).setLinkUri(uri);
    }

    @Override // n0.e
    public int x() {
        int source;
        source = ((ContentInfo) this.f79g).getSource();
        return source;
    }

    @Override // k.k
    public void z(m mVar) {
        t2 t2Var = ((ActionMenuView) this.f79g).f332z;
        if (t2Var != null) {
            t2Var.z(mVar);
        }
    }

    public /* synthetic */ a(int i, Object obj) {
        this.f78f = i;
        this.f79g = obj;
    }

    public a(MainActivity2 mainActivity2) {
        this.f78f = 26;
        this.f79g = mainActivity2.getSharedPreferences("win_birthday_notebook", 0);
    }

    public a(b1.d[] dVarArr) {
        this.f78f = 7;
        i3.d.e(dVarArr, "initializers");
        this.f79g = dVarArr;
    }

    public a() {
        this.f78f = 25;
        this.f79g = new o0.h(this);
    }

    public a(Context context) {
        this.f78f = 1;
        this.f79g = context.getApplicationContext();
    }

    public a(ContentInfo contentInfo) {
        this.f78f = 24;
        contentInfo.getClass();
        this.f79g = f0.e.l(contentInfo);
    }

    public a(ClipData clipData, int i) {
        this.f78f = 23;
        this.f79g = f0.e.j(clipData, i);
    }

    @Override // l.w0
    public void j(int i) {
    }

    @Override // l.w0
    public void v(int i) {
    }

    @Override // androidx.emoji2.text.r
    public Object d() {
        return this;
    }

    @Override // l.w0
    public void y(int i, float f5) {
    }
}
