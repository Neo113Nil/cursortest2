package C1;

import H1.l;
import M.P;
import S.g;
import X0.v;
import Y0.i;
import Z.AnimationAnimationListenerC0041e;
import Z.DialogInterfaceOnCancelListenerC0049m;
import Z.I;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.room.q;
import androidx.room.r;
import androidx.room.w;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import h0.AbstractC0137C;
import h0.C0153c;
import h0.C0156f;
import h0.C0157g;
import h0.C0158h;
import h0.C0161k;
import h0.RunnableC0152b;
import h0.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import k0.InterfaceC0199a;
import k0.InterfaceC0203e;
import l0.h;
import n.C0282k;
import n.C0305v0;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f147b;

    public /* synthetic */ e(int i, Object obj) {
        this.f146a = i;
        this.f147b = obj;
    }

    public i a() {
        r rVar = (r) this.f147b;
        i iVar = new i();
        Cursor query$default = w.query$default(rVar.f2121a, new B1.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (query$default.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(query$default.getInt(0)));
            } finally {
            }
        }
        l.j(query$default, null);
        i i = H1.d.i(iVar);
        if (!i.f1419a.isEmpty()) {
            if (((r) this.f147b).f2127h == null) {
                throw new IllegalStateException("Required value was null.");
            }
            InterfaceC0203e interfaceC0203e = ((r) this.f147b).f2127h;
            if (interfaceC0203e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            interfaceC0203e.A();
        }
        return i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c2;
        long j;
        Set set;
        int i;
        boolean z2;
        C0282k c0282k;
        switch (this.f146a) {
            case 0:
                break;
            case 1:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f147b).f2512c.f1048g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 2:
                g gVar = (g) this.f147b;
                if (gVar.f1135o) {
                    boolean z3 = gVar.f1133m;
                    S.a aVar = gVar.f1124a;
                    if (z3) {
                        gVar.f1133m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.f1121g = -1L;
                        aVar.f1120f = currentAnimationTimeMillis;
                        aVar.f1122h = 0.5f;
                    }
                    if ((aVar.f1121g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f1121g + aVar.i) || !gVar.e()) {
                        gVar.f1135o = false;
                        return;
                    }
                    boolean z4 = gVar.f1134n;
                    ListView listView = gVar.f1126c;
                    if (z4) {
                        gVar.f1134n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f1120f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar.f1120f;
                    aVar.f1120f = currentAnimationTimeMillis2;
                    gVar.f1137q.scrollListBy((int) (j2 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f1119d));
                    WeakHashMap weakHashMap = P.f711a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ((U.e) this.f147b).n(0);
                return;
            case 4:
                AnimationAnimationListenerC0041e animationAnimationListenerC0041e = (AnimationAnimationListenerC0041e) this.f147b;
                animationAnimationListenerC0041e.f1552b.endViewTransition(animationAnimationListenerC0041e.f1553c);
                animationAnimationListenerC0041e.f1554d.d();
                return;
            case 5:
                DialogInterfaceOnCancelListenerC0049m dialogInterfaceOnCancelListenerC0049m = (DialogInterfaceOnCancelListenerC0049m) this.f147b;
                dialogInterfaceOnCancelListenerC0049m.f1568U.onDismiss(dialogInterfaceOnCancelListenerC0049m.f1576c0);
                return;
            case 6:
                ((I) this.f147b).y(true);
                return;
            case 7:
                Lock closeLock$room_runtime_release = ((r) this.f147b).f2121a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                        try {
                        } catch (SQLiteException e) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                            set = v.f1387a;
                        }
                    } catch (IllegalStateException e2) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                        set = v.f1387a;
                    }
                    if (((r) this.f147b).a() && ((r) this.f147b).f2125f.compareAndSet(true, false) && !((r) this.f147b).f2121a.inTransaction()) {
                        InterfaceC0199a d2 = ((h) ((r) this.f147b).f2121a.getOpenHelper()).d();
                        d2.c();
                        try {
                            set = a();
                            d2.w();
                            if (set.isEmpty()) {
                                return;
                            }
                            r rVar = (r) this.f147b;
                            synchronized (rVar.j) {
                                Iterator it = rVar.j.iterator();
                                while (true) {
                                    p.b bVar = (p.b) it;
                                    if (bVar.hasNext()) {
                                        ((q) ((Map.Entry) bVar.next()).getValue()).a(set);
                                    }
                                }
                            }
                            return;
                        } finally {
                            d2.e();
                        }
                    }
                    return;
                } finally {
                    closeLock$room_runtime_release.unlock();
                    ((r) this.f147b).getClass();
                }
            case 8:
                C0161k c0161k = (C0161k) this.f147b;
                int i2 = c0161k.f3051A;
                ValueAnimator valueAnimator = c0161k.f3075z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0161k.f3051A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 9:
                RecyclerView recyclerView = (RecyclerView) this.f147b;
                AbstractC0137C abstractC0137C = recyclerView.H;
                if (abstractC0137C != null) {
                    C0158h c0158h = (C0158h) abstractC0137C;
                    ArrayList arrayList = c0158h.f3037h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0158h.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0158h.f3038k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0158h.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            long j3 = c0158h.f2896d;
                            if (hasNext) {
                                V v2 = (V) it2.next();
                                View view = v2.f2958a;
                                ViewPropertyAnimator animate = view.animate();
                                c0158h.f3044q.add(v2);
                                animate.setDuration(j3).alpha(0.0f).setListener(new C0153c(c0158h, v2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0158h.f3040m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0152b runnableC0152b = new RunnableC0152b(c0158h, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0152b.run();
                                    } else {
                                        View view2 = ((C0157g) arrayList5.get(0)).f3031a.f2958a;
                                        WeakHashMap weakHashMap2 = P.f711a;
                                        view2.postOnAnimationDelayed(runnableC0152b, j3);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0158h.f3041n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0152b runnableC0152b2 = new RunnableC0152b(c0158h, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0152b2.run();
                                    } else {
                                        View view3 = ((C0156f) arrayList6.get(0)).f3022a.f2958a;
                                        WeakHashMap weakHashMap3 = P.f711a;
                                        view3.postOnAnimationDelayed(runnableC0152b2, j3);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0158h.f3039l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0152b runnableC0152b3 = new RunnableC0152b(c0158h, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0152b3.run();
                                    } else {
                                        if (isEmpty) {
                                            j3 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0158h.e : 0L, !isEmpty3 ? c0158h.f2897f : 0L) + j3;
                                        View view4 = ((V) arrayList7.get(0)).f2958a;
                                        WeakHashMap weakHashMap4 = P.f711a;
                                        view4.postOnAnimationDelayed(runnableC0152b3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f2027i0 = z2;
                return;
            case 10:
                ((StaggeredGridLayoutManager) this.f147b).B0();
                return;
            case 11:
                C0305v0 c0305v0 = (C0305v0) this.f147b;
                c0305v0.f3728l = null;
                c0305v0.drawableStateChanged();
                return;
            case 12:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f147b;
                if (searchView$SearchAutoComplete.f1775f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1775f = false;
                    return;
                }
                return;
            case 13:
                ActionMenuView actionMenuView = ((Toolbar) this.f147b).f1793a;
                if (actionMenuView == null || (c0282k = actionMenuView.f1757t) == null) {
                    return;
                }
                c0282k.l();
                return;
            default:
                O0.f fVar = (O0.f) this.f147b;
                fVar.f984c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) fVar.e;
                U.e eVar = bottomSheetBehavior.f2268M;
                if (eVar != null && eVar.f()) {
                    fVar.a(fVar.f983b);
                    return;
                } else {
                    if (bottomSheetBehavior.f2267L == 2) {
                        bottomSheetBehavior.I(fVar.f983b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            f fVar2 = (f) this.f147b;
            synchronized (fVar2) {
                c2 = fVar2.c();
            }
            if (c2 == null) {
                return;
            }
            c cVar = c2.f135c;
            j1.h.b(cVar);
            f fVar3 = (f) this.f147b;
            boolean isLoggable = f.i.isLoggable(Level.FINE);
            if (isLoggable) {
                d dVar = cVar.f138a.f149a;
                j = System.nanoTime();
                H1.d.h(c2, cVar, "starting");
            } else {
                j = -1;
            }
            try {
                f.a(fVar3, c2);
                if (isLoggable) {
                    d dVar2 = cVar.f138a.f149a;
                    H1.d.h(c2, cVar, "finished run in ".concat(H1.d.A(System.nanoTime() - j)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) fVar3.f149a.f145b).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        d dVar3 = cVar.f138a.f149a;
                        H1.d.h(c2, cVar, "failed a run in ".concat(H1.d.A(System.nanoTime() - j)));
                    }
                    throw th2;
                }
            }
        }
    }
}
