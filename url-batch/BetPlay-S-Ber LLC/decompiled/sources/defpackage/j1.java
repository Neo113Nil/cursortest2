package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.awerser.monnit.betplay.MainActivity2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class j1 implements qu, yt, f6, du, kt, jd, ld, dw, yv, bh, mh, rm, p90, ps {
    public final /* synthetic */ int f;
    public final Object g;

    public j1(int i) {
        this.f = i;
        switch (i) {
            case 21:
                this.g = new ArrayList(20);
                break;
            case 25:
                this.g = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                TimeUnit.MINUTES.getClass();
                this.g = new zy(m50.h);
                break;
        }
    }

    public static j1 v(Context context, int i) {
        vw.l("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ly.t);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList x = op.x(context, obtainStyledAttributes, 4);
        ColorStateList x2 = op.x(context, obtainStyledAttributes, 9);
        ColorStateList x3 = op.x(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
        g gVar = new g(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        n20 a = n20.h(contextThemeWrapper.obtainStyledAttributes(ly.F), gVar).a();
        obtainStyledAttributes.recycle();
        return new j1(x, x2, x3, dimensionPixelSize, a, rect);
    }

    @Override // defpackage.qu
    public void a(au auVar, boolean z) {
        if (auVar instanceof v40) {
            ((v40) auVar).z.k().c(false);
        }
        qu quVar = ((k1) this.g).j;
        if (quVar != null) {
            quVar.a(auVar, z);
        }
    }

    @Override // defpackage.rm
    public i2 apply() {
        return (i2) this.g;
    }

    @Override // defpackage.jd
    public md build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.g).build();
        return new md(new j1(build));
    }

    @Override // defpackage.ld
    public ClipData d() {
        ClipData clip;
        clip = ((ContentInfo) this.g).getClip();
        return clip;
    }

    @Override // defpackage.yt
    public boolean f(au auVar, MenuItem menuItem) {
        n1 n1Var = ((ActionMenuView) this.g).E;
        if (n1Var == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((j60) n1Var).f.L.d).iterator();
        while (it.hasNext()) {
            if (((rk) it.next()).a.o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.du
    public void g(au auVar, MenuItem menuItem) {
        ((l9) this.g).l.removeCallbacksAndMessages(auVar);
    }

    @Override // defpackage.bh
    public void h(final j8 j8Var) {
        dc dcVar = new dc("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), dcVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: dh
            @Override // java.lang.Runnable
            public final void run() {
                j1 j1Var = j1.this;
                j8 j8Var2 = j8Var;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    pj u = vw.u((Context) j1Var.g);
                    if (u == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    oj ojVar = (oj) ((bh) u.b);
                    synchronized (ojVar.i) {
                        ojVar.k = threadPoolExecutor2;
                    }
                    ((bh) u.b).h(new eh(j8Var2, threadPoolExecutor2));
                } catch (Throwable th) {
                    j8Var2.G(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // defpackage.p90
    public m90 i(Class cls, ev evVar) {
        s10 s10Var = null;
        for (n90 n90Var : (n90[]) this.g) {
            if (n90Var.a.equals(cls)) {
                s10Var = new s10();
            }
        }
        if (s10Var != null) {
            return s10Var;
        }
        o8.j("No initializer set for given class ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.du
    public void j(au auVar, eu euVar) {
        l9 l9Var = (l9) this.g;
        Handler handler = l9Var.l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = l9Var.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (auVar == ((k9) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new j9(this, i2 < arrayList.size() ? (k9) arrayList.get(i2) : null, euVar, auVar), auVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.ld
    public int k() {
        int flags;
        flags = ((ContentInfo) this.g).getFlags();
        return flags;
    }

    @Override // defpackage.ld
    public ContentInfo l() {
        return (ContentInfo) this.g;
    }

    @Override // defpackage.yt
    public void m(au auVar) {
        j60 j60Var = ((ActionMenuView) this.g).z;
        if (j60Var != null) {
            j60Var.m(auVar);
        }
    }

    @Override // defpackage.mh
    public boolean n(CharSequence charSequence, int i, int i2, s70 s70Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.g)) {
            return true;
        }
        s70Var.c = (s70Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.dw
    public ac0 onApplyWindowInsets(View view, ac0 ac0Var) {
        rd rdVar;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g;
        if (!Objects.equals(coordinatorLayout.t, ac0Var)) {
            coordinatorLayout.t = ac0Var;
            boolean z = ac0Var.d() > 0;
            coordinatorLayout.u = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!ac0Var.a.r()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = e90.a;
                    if (childAt.getFitsSystemWindows() && (rdVar = ((ud) childAt.getLayoutParams()).a) != null) {
                        ac0Var = rdVar.onApplyWindowInsets(coordinatorLayout, childAt, ac0Var);
                        if (ac0Var.a.r()) {
                            break;
                        }
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return ac0Var;
    }

    @Override // defpackage.jd
    public void p(Uri uri) {
        ((ContentInfo.Builder) this.g).setLinkUri(uri);
    }

    @Override // defpackage.ld
    public int q() {
        int source;
        source = ((ContentInfo) this.g).getSource();
        return source;
    }

    @Override // defpackage.qu
    public boolean s(au auVar) {
        k1 k1Var = (k1) this.g;
        if (auVar == k1Var.h) {
            return false;
        }
        ((v40) auVar).A.getClass();
        qu quVar = k1Var.j;
        if (quVar != null) {
            return quVar.s(auVar);
        }
        return false;
    }

    @Override // defpackage.jd
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.g).setExtras(bundle);
    }

    @Override // defpackage.jd
    public void t(int i) {
        ((ContentInfo.Builder) this.g).setFlags(i);
    }

    public String toString() {
        switch (this.f) {
            case 10:
                return "ContentInfoCompat{" + ((ContentInfo) this.g) + "}";
            default:
                return super.toString();
        }
    }

    public nn u() {
        return new nn((String[]) ((ArrayList) this.g).toArray(new String[0]));
    }

    public void w() {
        ((kk) this.g).i.L();
    }

    public void x(String str) {
        ArrayList arrayList = (ArrayList) this.g;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void y(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            en enVar = (en) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", enVar.getId());
            jSONObject.put("name", enVar.getName());
            jSONObject.put("category", enVar.getCategory().name());
            jSONObject.put("streak", enVar.getStreak());
            jSONObject.put("lastCompletedDate", enVar.getLastCompletedDate());
            jSONObject.put("createdAt", enVar.getCreatedAt());
            jSONArray.put(jSONObject);
        }
        ((SharedPreferences) this.g).edit().putString("habits", jSONArray.toString()).apply();
    }

    public j1(MainActivity2 mainActivity2) {
        this.f = 20;
        this.g = mainActivity2.getSharedPreferences("win_habits", 0);
    }

    public /* synthetic */ j1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public j1(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, n20 n20Var, Rect rect) {
        this.f = 4;
        vw.m(rect.left);
        vw.m(rect.top);
        vw.m(rect.right);
        vw.m(rect.bottom);
        this.g = n20Var;
    }

    public j1(TextView textView) {
        this.f = 16;
        this.g = new ph(textView);
    }

    public j1(EditText editText) {
        this.f = 14;
        this.g = new h5(editText, 11);
    }

    public j1(Context context) {
        this.f = 13;
        this.g = context.getApplicationContext();
    }

    public j1(ContentInfo contentInfo) {
        this.f = 10;
        contentInfo.getClass();
        this.g = i8.l(contentInfo);
    }

    public j1(ClipData clipData, int i) {
        this.f = 9;
        this.g = i8.j(clipData, i);
    }

    public void e(int i) {
    }

    public void o(int i) {
    }

    @Override // defpackage.mh
    public Object b() {
        return this;
    }

    public void r(int i, float f) {
    }
}
