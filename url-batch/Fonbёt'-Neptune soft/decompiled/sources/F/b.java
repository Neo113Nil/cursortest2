package F;

import A.z;
import P.C0093c;
import P.C0097g;
import P.t;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import j.C;
import j.C0233i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f433f;

    public /* synthetic */ b(int i2, Object obj) {
        this.f432e = i2;
        this.f433f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0233i c0233i;
        Object obj = this.f433f;
        switch (this.f432e) {
            case 0:
                g gVar = (g) obj;
                if (gVar.f450o) {
                    boolean z2 = gVar.f448m;
                    a aVar = gVar.f436a;
                    if (z2) {
                        gVar.f448m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f427e = currentAnimationTimeMillis;
                        aVar.f429g = -1L;
                        aVar.f428f = currentAnimationTimeMillis;
                        aVar.f430h = 0.5f;
                    }
                    if ((aVar.f429g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f429g + aVar.f431i) || !gVar.e()) {
                        gVar.f450o = false;
                        return;
                    }
                    boolean z3 = gVar.f449n;
                    ListView listView = gVar.f438c;
                    if (z3) {
                        gVar.f449n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f428f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar.f428f;
                    aVar.f428f = currentAnimationTimeMillis2;
                    gVar.f452q.scrollListBy((int) (j2 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f426d));
                    Field field = z.f58a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                C0097g c0097g = (C0097g) obj;
                int i2 = c0097g.v;
                ValueAnimator valueAnimator = c0097g.f916u;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c0097g.v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 2:
                t tVar = ((RecyclerView) obj).f1833H;
                if (tVar != null) {
                    C0093c c0093c = (C0093c) tVar;
                    ArrayList arrayList = c0093c.f880e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0093c.f882g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0093c.f883h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0093c.f881f;
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
                        ArrayList arrayList6 = c0093c.f885j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            A0.b.h(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            A0.b.h(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0093c.f886k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            A0.b.h(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            A0.b.h(it3.next());
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
                    ArrayList arrayList10 = c0093c.f884i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0093c.f944c : 0L, isEmpty3 ? 0L : c0093c.f945d);
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
            case 3:
                ((StaggeredGridLayoutManager) obj).J();
                return;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                e.e eVar = (e.e) obj;
                eVar.a(true);
                eVar.invalidateSelf();
                return;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                C c2 = (C) obj;
                c2.f2847q = null;
                c2.drawableStateChanged();
                return;
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1521e;
                if (actionMenuView == null || (c0233i = actionMenuView.f1413w) == null) {
                    return;
                }
                c0233i.j();
                return;
            default:
                Object obj2 = ((n0.d) obj).f3284f;
                return;
        }
    }

    public b(n0.d dVar, int i2) {
        this.f432e = 7;
        this.f433f = dVar;
    }
}
