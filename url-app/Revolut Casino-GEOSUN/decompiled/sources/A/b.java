package A;

import L.C0028d;
import L.C0032h;
import L.v;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import h.AbstractC0141A;
import h.C0156i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import m0.C0193c;
import w.x;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10f;

    public /* synthetic */ b(int i2, Object obj) {
        this.f9e = i2;
        this.f10f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0156i c0156i;
        Object obj = this.f10f;
        switch (this.f9e) {
            case 0:
                g gVar = (g) obj;
                if (gVar.f26o) {
                    boolean z2 = gVar.f24m;
                    a aVar = gVar.f12a;
                    if (z2) {
                        gVar.f24m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f4e = currentAnimationTimeMillis;
                        aVar.f6g = -1L;
                        aVar.f5f = currentAnimationTimeMillis;
                        aVar.f7h = 0.5f;
                    }
                    if ((aVar.f6g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f6g + aVar.f8i) || !gVar.e()) {
                        gVar.f26o = false;
                        return;
                    }
                    boolean z3 = gVar.f25n;
                    ListView listView = gVar.f14c;
                    if (z3) {
                        gVar.f25n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f5f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar.f5f;
                    aVar.f5f = currentAnimationTimeMillis2;
                    gVar.f28q.scrollListBy((int) (j2 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f3d));
                    Field field = x.f3075a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                C0032h c0032h = (C0032h) obj;
                int i2 = c0032h.f561v;
                ValueAnimator valueAnimator = c0032h.f560u;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c0032h.f561v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                v vVar = ((RecyclerView) obj).f1575H;
                if (vVar != null) {
                    C0028d c0028d = (C0028d) vVar;
                    ArrayList arrayList = c0028d.f525e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0028d.f527g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0028d.f528h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0028d.f526f;
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
                        ArrayList arrayList6 = c0028d.f530j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            F0.h.h(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            F0.h.h(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0028d.f531k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            F0.h.h(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            F0.h.h(it3.next());
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
                    ArrayList arrayList10 = c0028d.f529i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0028d.f592c : 0L, isEmpty3 ? 0L : c0028d.f593d);
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
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((StaggeredGridLayoutManager) obj).J();
                return;
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0141A abstractC0141A = (AbstractC0141A) obj;
                abstractC0141A.f2077q = null;
                abstractC0141A.drawableStateChanged();
                return;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1275e;
                if (actionMenuView == null || (c0156i = actionMenuView.f1164w) == null) {
                    return;
                }
                c0156i.g();
                return;
            default:
                Object obj2 = ((C0193c) obj).f2706f;
                return;
        }
    }

    public b(C0193c c0193c, int i2) {
        this.f9e = 6;
        this.f10f = c0193c;
    }
}
