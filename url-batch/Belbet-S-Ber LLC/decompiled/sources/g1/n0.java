package g1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1736g;

    public /* synthetic */ n0(RecyclerView recyclerView, int i) {
        this.f1735f = i;
        this.f1736g = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        int i = this.f1735f;
        RecyclerView recyclerView = this.f1736g;
        switch (i) {
            case 0:
                if (recyclerView.f802z && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f798x) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.C) {
                        recyclerView.p();
                        break;
                    } else {
                        recyclerView.B = true;
                        break;
                    }
                }
                break;
            default:
                w0 w0Var = recyclerView.Q;
                if (w0Var != null) {
                    o oVar = (o) w0Var;
                    long j2 = oVar.d;
                    ArrayList arrayList = oVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = oVar.f1739j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = oVar.f1740k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = oVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            int i5 = i4 + 1;
                            q1 q1Var = (q1) obj;
                            View view = q1Var.f1768a;
                            ViewPropertyAnimator animate = view.animate();
                            oVar.f1746q.add(q1Var);
                            animate.setDuration(j2).alpha(0.0f).setListener(new j(oVar, q1Var, animate, view)).start();
                            i4 = i5;
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z5 = isEmpty;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            oVar.f1742m.add(arrayList5);
                            arrayList2.clear();
                            i iVar = new i(oVar, arrayList5, 0);
                            if (z5) {
                                iVar.run();
                            } else {
                                View view2 = ((n) arrayList5.get(0)).f1731a.f1768a;
                                WeakHashMap weakHashMap = n0.p0.f2816a;
                                view2.postOnAnimationDelayed(iVar, j2);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            oVar.f1743n.add(arrayList6);
                            arrayList3.clear();
                            i iVar2 = new i(oVar, arrayList6, 1);
                            if (z5) {
                                iVar2.run();
                            } else {
                                View view3 = ((m) arrayList6.get(0)).f1712a.f1768a;
                                WeakHashMap weakHashMap2 = n0.p0.f2816a;
                                view3.postOnAnimationDelayed(iVar2, j2);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            oVar.f1741l.add(arrayList7);
                            arrayList4.clear();
                            i iVar3 = new i(oVar, arrayList7, 2);
                            if (!z5 || !isEmpty2 || !isEmpty3) {
                                if (z5) {
                                    j2 = 0;
                                }
                                long max = Math.max(!isEmpty2 ? oVar.f1816e : 0L, isEmpty3 ? 0L : oVar.f1817f) + j2;
                                z4 = false;
                                View view4 = ((q1) arrayList7.get(0)).f1768a;
                                WeakHashMap weakHashMap3 = n0.p0.f2816a;
                                view4.postOnAnimationDelayed(iVar3, max);
                                recyclerView.f787r0 = z4;
                                break;
                            } else {
                                iVar3.run();
                            }
                        }
                    }
                }
                z4 = false;
                recyclerView.f787r0 = z4;
        }
    }
}
