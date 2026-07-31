package C;

import N.C0046c;
import N.C0050g;
import N.u;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import i.AbstractC0147B;
import i.C0162i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import o0.C0211b;
import y.x;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f158f;

    public /* synthetic */ b(int i2, Object obj) {
        this.f157e = i2;
        this.f158f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162i c0162i;
        int i2 = this.f157e;
        Object obj = this.f158f;
        switch (i2) {
            case 0:
                g gVar = (g) obj;
                AbstractC0147B abstractC0147B = gVar.f163c;
                a aVar = gVar.f161a;
                if (gVar.f175o) {
                    if (gVar.f173m) {
                        gVar.f173m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f152e = currentAnimationTimeMillis;
                        aVar.f154g = -1L;
                        aVar.f153f = currentAnimationTimeMillis;
                        aVar.f155h = 0.5f;
                    }
                    if ((aVar.f154g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f154g + aVar.f156i) || !gVar.e()) {
                        gVar.f175o = false;
                        return;
                    }
                    if (gVar.f174n) {
                        gVar.f174n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        abstractC0147B.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f153f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar.f153f;
                    aVar.f153f = currentAnimationTimeMillis2;
                    gVar.f177q.scrollListBy((int) (j2 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f151d));
                    Field field = x.f3160a;
                    abstractC0147B.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                C0050g c0050g = (C0050g) obj;
                ValueAnimator valueAnimator = c0050g.f738u;
                int i3 = c0050g.f739v;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                    return;
                }
                c0050g.f739v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                u uVar = ((RecyclerView) obj).f1665H;
                if (uVar != null) {
                    C0046c c0046c = (C0046c) uVar;
                    ArrayList arrayList = c0046c.f703e;
                    ArrayList arrayList2 = c0046c.f707i;
                    ArrayList arrayList3 = c0046c.f709k;
                    ArrayList arrayList4 = c0046c.f708j;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList5 = c0046c.f705g;
                    boolean isEmpty2 = arrayList5.isEmpty();
                    ArrayList arrayList6 = c0046c.f706h;
                    boolean isEmpty3 = arrayList6.isEmpty();
                    ArrayList arrayList7 = c0046c.f704f;
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
                            L.d.h(arrayList8.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList8.iterator();
                        if (it2.hasNext()) {
                            L.d.h(it2.next());
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
                            L.d.h(arrayList9.get(0));
                            throw null;
                        }
                        if (arrayList9.size() > 0) {
                            L.d.h(arrayList9.get(0));
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
                        Math.max(!isEmpty2 ? c0046c.f770c : 0L, isEmpty3 ? 0L : c0046c.f771d);
                        arrayList10.get(0).getClass();
                        throw new ClassCastException();
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
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((StaggeredGridLayoutManager) obj).J();
                return;
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0147B abstractC0147B2 = (AbstractC0147B) obj;
                abstractC0147B2.f2107q = null;
                abstractC0147B2.drawableStateChanged();
                return;
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1360e;
                if (actionMenuView == null || (c0162i = actionMenuView.f1254w) == null) {
                    return;
                }
                c0162i.j();
                return;
            default:
                Object obj2 = ((C0211b) obj).f2915f;
                return;
        }
    }

    public b(C0211b c0211b, int i2) {
        this.f157e = 6;
        this.f158f = c0211b;
    }
}
