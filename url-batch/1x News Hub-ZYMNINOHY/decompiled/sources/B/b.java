package B;

import E.A;
import E1.AbstractC0033i;
import M0.v;
import U.C0067c;
import U.C0071g;
import U.t;
import a.AbstractC0129a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import b0.s;
import f0.C0322a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import l.B;
import l.C1087i;
import m1.C1114b;
import m1.RunnableC1113a;
import n0.AbstractC1135O;
import n0.C1125E;
import n0.C1143e;
import n0.C1147i;
import n0.ServiceConnectionC1164z;
import t1.AbstractAsyncTaskC1190a;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f78b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f77a = i3;
        this.f78b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1087i c1087i;
        float f = 0.0f;
        switch (this.f77a) {
            case 0:
                Object obj = ((s) this.f78b).f2544a;
                return;
            case 1:
                H.e eVar = (H.e) this.f78b;
                if (eVar.o) {
                    boolean z = eVar.f586m;
                    H.a aVar = eVar.f575a;
                    if (z) {
                        eVar.f586m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f569e = currentAnimationTimeMillis;
                        aVar.f570g = -1L;
                        aVar.f = currentAnimationTimeMillis;
                        aVar.f571h = 0.5f;
                    }
                    if ((aVar.f570g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f570g + aVar.f572i) || !eVar.e()) {
                        eVar.o = false;
                        return;
                    }
                    boolean z2 = eVar.f587n;
                    ListView listView = eVar.f577c;
                    if (z2) {
                        eVar.f587n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a3 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    eVar.f589q.scrollListBy((int) (j3 * ((a3 * 4.0f) + ((-4.0f) * a3 * a3)) * aVar.f568d));
                    Field field = A.f243a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((M0.m) this.f78b).h();
                return;
            case 3:
                L0.c cVar = ((M0.m) ((C0.e) this.f78b).f201b).f931c;
                cVar.c(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 4:
                ((v) this.f78b).f970i.b(new K0.b(4));
                return;
            case 5:
                throw null;
            case 6:
                ((P.k) this.f78b).i();
                throw null;
            case 7:
                C0071g c0071g = (C0071g) this.f78b;
                int i3 = c0071g.v;
                ValueAnimator valueAnimator = c0071g.f1423u;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                    return;
                }
                c0071g.v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 8:
                t tVar = ((RecyclerView) this.f78b).f2450D;
                if (tVar != null) {
                    C0067c c0067c = (C0067c) tVar;
                    ArrayList arrayList = c0067c.f1391e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0067c.f1392g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0067c.f1393h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0067c.f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0067c.f1395j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            AbstractC0033i.p(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            AbstractC0033i.p(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0067c.f1396k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            AbstractC0033i.p(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            AbstractC0033i.p(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0067c.f1394i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0067c.f1449c : 0L, isEmpty3 ? 0L : c0067c.f1450d);
                        arrayList9.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 9:
                ((StaggeredGridLayoutManager) this.f78b).J();
                return;
            case 10:
                V0.e eVar2 = (V0.e) this.f78b;
                long j4 = V0.e.G((Context) eVar2.f1599b).getLong("app_set_id_last_used_time", -1L);
                long j5 = j4 != -1 ? j4 + 33696000000L : -1L;
                if (j5 == -1 || System.currentTimeMillis() <= j5) {
                    return;
                }
                Context context = (Context) eVar2.f1599b;
                if (!V0.e.G(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 11:
                synchronized (((d1.h) this.f78b).f4940c) {
                    d1.g gVar = ((d1.h) this.f78b).f4941d;
                    if (gVar != null) {
                        d1.k kVar = (d1.k) gVar.f4937d;
                        synchronized (kVar.f4942a) {
                            try {
                                if (!kVar.f4944c) {
                                    kVar.f4944c = true;
                                    kVar.f4945d = true;
                                    kVar.f4943b.e(kVar);
                                }
                            } finally {
                            }
                        }
                    }
                }
                return;
            case 12:
                WebSettings.getDefaultUserAgent((Context) this.f78b);
                return;
            case 13:
                B b3 = (B) this.f78b;
                b3.f9707m = null;
                b3.drawableStateChanged();
                return;
            case 14:
                ActionMenuView actionMenuView = ((Toolbar) this.f78b).f2137a;
                if (actionMenuView == null || (c1087i = actionMenuView.f2036s) == null) {
                    return;
                }
                c1087i.k();
                return;
            case 15:
                C1114b c1114b = (C1114b) this.f78b;
                AudioManager audioManager = c1114b.f9965c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                c1114b.f9966d.getClass();
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                c1114b.f9968g.set(false);
                if (((Float) c1114b.f.getAndSet(Float.valueOf(f))).floatValue() != f) {
                    c1114b.f9963a.post(new RunnableC1113a(this, f));
                    return;
                }
                return;
            case 16:
                ServiceConnectionC1164z serviceConnectionC1164z = (ServiceConnectionC1164z) this.f78b;
                C1143e c1143e = serviceConnectionC1164z.f10141b;
                c1143e.t(0);
                C1147i c1147i = AbstractC1135O.f10027l;
                c1143e.H(24, 6, c1147i);
                serviceConnectionC1164z.a(c1147i);
                return;
            case 17:
                ((WebView) this.f78b).destroy();
                return;
            case 18:
                C0322a c0322a = ((s1.b) this.f78b).f10304e;
                c0322a.getClass();
                t1.b bVar = new t1.b(c0322a);
                A0.f fVar = (A0.f) c0322a.f4978c;
                bVar.f10370a = fVar;
                ((ArrayDeque) fVar.f24c).add(bVar);
                if (((AbstractAsyncTaskC1190a) fVar.f25d) == null) {
                    fVar.s();
                    return;
                }
                return;
            default:
                try {
                    ((Runnable) this.f78b).run();
                    return;
                } catch (Exception e3) {
                    AbstractC0129a.l("Executor", "Background execution failure.", e3);
                    return;
                }
        }
    }

    public b(M0.i iVar, C1125E c1125e) {
        this.f77a = 5;
        this.f78b = c1125e;
    }

    public b(q1.d dVar) {
        this.f77a = 17;
        this.f78b = dVar.f10236g;
    }

    public b(s sVar, int i3) {
        this.f77a = 0;
        this.f78b = sVar;
    }
}
