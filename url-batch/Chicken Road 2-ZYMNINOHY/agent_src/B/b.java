package B;

import E.AbstractC0005f;
import E.H;
import E1.C0029e;
import E1.C0037m;
import E1.K;
import E1.P;
import E1.W;
import a.AbstractC0124a;
import a2.C0162b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c2.u;
import e0.t;
import i2.AbstractC0457a;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import k.AbstractC1239z;
import k.C1218i;
import l1.AbstractC1271r;
import l1.C1255b;
import l1.C1259f;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f149b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f148a = i4;
        this.f149b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J3.a c4;
        long j4;
        C1218i c1218i;
        float f4 = 0.0f;
        switch (this.f148a) {
            case 0:
                Object obj = ((t) this.f149b).f8416a;
                return;
            case 1:
                K k4 = (K) this.f149b;
                C0029e c0029e = k4.f504d;
                c0029e.t(0);
                C0037m c0037m = W.f543k;
                c0029e.s(24, c0037m);
                k4.c(c0037m);
                return;
            case 2:
                WebSettings.getDefaultUserAgent((Context) this.f149b);
                return;
            case 3:
                H.e eVar = (H.e) this.f149b;
                AbstractC1239z abstractC1239z = eVar.f1062c;
                H.a aVar = eVar.f1060a;
                if (eVar.o) {
                    if (eVar.f1072m) {
                        eVar.f1072m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f1053e = currentAnimationTimeMillis;
                        aVar.f1055g = -1L;
                        aVar.f1054f = currentAnimationTimeMillis;
                        aVar.f1056h = 0.5f;
                    }
                    if ((aVar.f1055g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f1055g + aVar.f1057i) || !eVar.e()) {
                        eVar.o = false;
                        return;
                    }
                    if (eVar.n) {
                        eVar.n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        abstractC1239z.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f1054f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a3 = aVar.a(currentAnimationTimeMillis2);
                    long j5 = currentAnimationTimeMillis2 - aVar.f1054f;
                    aVar.f1054f = currentAnimationTimeMillis2;
                    eVar.f1074q.scrollListBy((int) (j5 * ((a3 * 4.0f) + ((-4.0f) * a3 * a3)) * aVar.f1052d));
                    Field field = H.f375a;
                    abstractC1239z.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                I2.b bVar = (I2.b) this.f149b;
                AudioManager audioManager = bVar.f1134c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                bVar.f1135d.getClass();
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f4 = streamVolume / streamMaxVolume;
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                }
                bVar.f1138g.set(false);
                if (((Float) bVar.f1137f.getAndSet(Float.valueOf(f4))).floatValue() != f4) {
                    bVar.f1132a.post(new I2.a(this, f4));
                    return;
                }
                return;
            case 5:
                break;
            case 6:
                try {
                    ((Runnable) this.f149b).run();
                    return;
                } catch (Exception e4) {
                    AbstractC0457a.o("Executor", "Background execution failure.", e4);
                    return;
                }
            case 7:
                ((WebView) this.f149b).destroy();
                return;
            case 8:
                l2.e eVar2 = ((O2.b) this.f149b).f2042e;
                B1.j jVar = (B1.j) eVar2.f14271c;
                P2.b bVar2 = new P2.b(eVar2);
                bVar2.f2087a = jVar;
                ((ArrayDeque) jVar.f202c).add(bVar2);
                if (((P2.a) jVar.f203d) == null) {
                    jVar.g();
                    return;
                }
                return;
            case 9:
                ((c2.m) this.f149b).h();
                return;
            case 10:
                b2.c cVar = ((c2.m) ((t1.h) this.f149b).f15398b).f5683b;
                cVar.b(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 11:
                ((u) this.f149b).f5719h.c(new C0162b(4));
                return;
            case 12:
                throw null;
            case 13:
                AbstractC1239z abstractC1239z2 = (AbstractC1239z) this.f149b;
                abstractC1239z2.f14136m = null;
                abstractC1239z2.drawableStateChanged();
                return;
            case 14:
                ActionMenuView actionMenuView = ((Toolbar) this.f149b).f4470a;
                if (actionMenuView == null || (c1218i = actionMenuView.f4367s) == null) {
                    return;
                }
                c1218i.k();
                return;
            case 15:
                C1259f c1259f = (C1259f) this.f149b;
                ValueAnimator valueAnimator = c1259f.f14227u;
                int i4 = c1259f.v;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                c1259f.v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 16:
                AbstractC1271r abstractC1271r = ((RecyclerView) this.f149b).f5140D;
                if (abstractC1271r != null) {
                    C1255b c1255b = (C1255b) abstractC1271r;
                    ArrayList arrayList = c1255b.f14194e;
                    ArrayList arrayList2 = c1255b.f14198i;
                    ArrayList arrayList3 = c1255b.f14200k;
                    ArrayList arrayList4 = c1255b.f14199j;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList5 = c1255b.f14196g;
                    boolean isEmpty2 = arrayList5.isEmpty();
                    ArrayList arrayList6 = c1255b.f14197h;
                    boolean isEmpty3 = arrayList6.isEmpty();
                    ArrayList arrayList7 = c1255b.f14195f;
                    boolean isEmpty4 = arrayList7.isEmpty();
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
                        ArrayList arrayList8 = new ArrayList();
                        arrayList8.addAll(arrayList5);
                        arrayList4.add(arrayList8);
                        arrayList5.clear();
                        if (!isEmpty) {
                            AbstractC0005f.x(arrayList8.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList8.iterator();
                        if (it2.hasNext()) {
                            AbstractC0005f.x(it2.next());
                            throw null;
                        }
                        arrayList8.clear();
                        arrayList4.remove(arrayList8);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.addAll(arrayList6);
                        arrayList3.add(arrayList9);
                        arrayList6.clear();
                        if (!isEmpty) {
                            AbstractC0005f.x(arrayList9.get(0));
                            throw null;
                        }
                        if (arrayList9.size() > 0) {
                            AbstractC0005f.x(arrayList9.get(0));
                            throw null;
                        }
                        arrayList9.clear();
                        arrayList3.remove(arrayList9);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList7);
                    arrayList2.add(arrayList10);
                    arrayList7.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c1255b.f14251c : 0L, isEmpty3 ? 0L : c1255b.f14252d);
                        throw AbstractC0005f.g(0, arrayList10);
                    }
                    Iterator it3 = arrayList10.iterator();
                    if (it3.hasNext()) {
                        it3.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList10.clear();
                    arrayList2.remove(arrayList10);
                    return;
                }
                return;
            case 17:
                ((StaggeredGridLayoutManager) this.f149b).J();
                return;
            case 18:
                Context context = (Context) ((l2.e) this.f149b).f14270b;
                long j6 = l2.e.A(context).getLong("app_set_id_last_used_time", -1L);
                long j7 = j6 != -1 ? j6 + 33696000000L : -1L;
                if (j7 == -1 || System.currentTimeMillis() <= j7) {
                    return;
                }
                if (!l2.e.A(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case C0583e9.f11743C /* 19 */:
                synchronized (((t2.g) this.f149b).f15416c) {
                    t2.j jVar2 = (t2.j) ((t2.g) this.f149b).f15417d.f15413d;
                    synchronized (jVar2.f15418a) {
                        try {
                            if (!jVar2.f15420c) {
                                jVar2.f15420c = true;
                                jVar2.f15421d = true;
                                jVar2.f15419b.c(jVar2);
                            }
                        } finally {
                        }
                    }
                }
                return;
            default:
                ((u0.l) this.f149b).c();
                return;
        }
        while (true) {
            J3.d dVar = (J3.d) this.f149b;
            synchronized (dVar) {
                c4 = dVar.c();
            }
            if (c4 == null) {
                return;
            }
            J3.c cVar2 = c4.f1198c;
            kotlin.jvm.internal.i.b(cVar2);
            J3.d dVar2 = (J3.d) this.f149b;
            boolean isLoggable = J3.d.f1210j.isLoggable(Level.FINE);
            if (isLoggable) {
                j4 = System.nanoTime();
                AbstractC0124a.b(c4, cVar2, "starting");
            } else {
                j4 = -1;
            }
            try {
                J3.d.a(dVar2, c4);
                if (isLoggable) {
                    AbstractC0124a.b(c4, cVar2, kotlin.jvm.internal.i.h(AbstractC0124a.w(System.nanoTime() - j4), "finished run in "));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f1211a.f15398b).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        AbstractC0124a.b(c4, cVar2, kotlin.jvm.internal.i.h(AbstractC0124a.w(System.nanoTime() - j4), "failed a run in "));
                    }
                    throw th2;
                }
            }
        }
    }

    public b(M2.d dVar) {
        this.f148a = 7;
        this.f149b = dVar.f1757g;
    }

    public b(c2.j jVar, P p2) {
        this.f148a = 12;
        this.f149b = p2;
    }

    public b(t tVar, int i4) {
        this.f148a = 0;
        this.f149b = tVar;
    }
}
