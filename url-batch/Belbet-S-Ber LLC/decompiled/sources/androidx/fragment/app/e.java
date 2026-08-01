package androidx.fragment.app;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f531f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f532g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e(Object obj, Object obj2, int i) {
        this.f531f = i;
        this.f532g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i4;
        ArrayList arrayList;
        int i5;
        switch (this.f531f) {
            case 0:
                ArrayList arrayList2 = (ArrayList) this.f532g;
                v0 v0Var = (v0) this.h;
                if (arrayList2.contains(v0Var)) {
                    arrayList2.remove(v0Var);
                    a4.b.a(v0Var.f669c.J, v0Var.f667a);
                    return;
                }
                return;
            case 1:
                ((c0.a) this.f532g).f859a = this.h;
                return;
            case 2:
                ((Application) this.f532g).unregisterActivityLifecycleCallbacks((c0.a) this.h);
                return;
            case 3:
                try {
                    Method method = c0.b.d;
                    Object obj = this.h;
                    Object obj2 = this.f532g;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        c0.b.f867e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e4) {
                    if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                        throw e4;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                g1.c cVar = (g1.c) this.h;
                g1.e eVar = cVar.i;
                if (eVar.f1639g == cVar.h) {
                    List list = cVar.f1621g;
                    g1.q qVar = (g1.q) this.f532g;
                    eVar.f1637e = list;
                    eVar.f1638f = Collections.unmodifiableList(list);
                    a0.a aVar = eVar.f1634a;
                    int[] iArr = qVar.f1759b;
                    ArrayList arrayList3 = qVar.f1758a;
                    int i6 = qVar.f1761e;
                    a0.a aVar2 = qVar.d;
                    g1.f fVar = new g1.f(aVar);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i7 = qVar.f1762f;
                    int i8 = 1;
                    int size = arrayList3.size() - 1;
                    int i9 = i7;
                    int i10 = i6;
                    while (size >= 0) {
                        g1.p pVar = (g1.p) arrayList3.get(size);
                        int i11 = pVar.f1749a;
                        int i12 = pVar.f1751c;
                        int i13 = i8;
                        int i14 = i11 + i12;
                        int i15 = pVar.f1750b;
                        g1.e eVar2 = eVar;
                        int i16 = i15 + i12;
                        int[] iArr2 = iArr;
                        while (true) {
                            int i17 = 0;
                            if (i10 > i14) {
                                i10--;
                                int i18 = iArr2[i10];
                                if ((i18 & 12) != 0) {
                                    arrayList = arrayList3;
                                    int i19 = i18 >> 4;
                                    g1.r a5 = g1.q.a(arrayDeque, i19, false);
                                    if (a5 != null) {
                                        int i20 = (i6 - a5.f1785b) - 1;
                                        fVar.i(i10, i20);
                                        if ((i18 & 4) != 0) {
                                            aVar2.G(i10, i19);
                                            fVar.t(i20, i13);
                                        }
                                        i5 = i6;
                                    } else {
                                        i5 = i6;
                                        arrayDeque.add(new g1.r(i10, (i6 - i10) - 1, i13));
                                    }
                                    i6 = i5;
                                } else {
                                    arrayList = arrayList3;
                                    fVar.h(i10, i13);
                                    i6--;
                                }
                                arrayList3 = arrayList;
                                i13 = 1;
                            } else {
                                ArrayList arrayList4 = arrayList3;
                                while (i9 > i16) {
                                    i9--;
                                    int i21 = qVar.f1760c[i9];
                                    if ((i21 & 12) != 0) {
                                        int i22 = i21 >> 4;
                                        i = i16;
                                        g1.r a6 = g1.q.a(arrayDeque, i22, true);
                                        if (a6 == null) {
                                            arrayDeque.add(new g1.r(i9, i6 - i10, false));
                                            i4 = 0;
                                        } else {
                                            i4 = 0;
                                            fVar.i((i6 - a6.f1785b) - 1, i10);
                                            if ((i21 & 4) != 0) {
                                                aVar2.G(i22, i9);
                                                fVar.t(i10, 1);
                                            }
                                        }
                                    } else {
                                        i = i16;
                                        i4 = i17;
                                        fVar.u(i10, 1);
                                        i6++;
                                    }
                                    i17 = i4;
                                    i16 = i;
                                }
                                int i23 = i15;
                                int i24 = i11;
                                while (i17 < i12) {
                                    if ((iArr2[i24] & 15) == 2) {
                                        aVar2.G(i24, i23);
                                        fVar.t(i24, 1);
                                    }
                                    i24++;
                                    i23++;
                                    i17++;
                                }
                                size--;
                                i8 = 1;
                                i9 = i15;
                                i10 = i11;
                                eVar = eVar2;
                                iArr = iArr2;
                                arrayList3 = arrayList4;
                            }
                        }
                    }
                    fVar.a();
                    eVar.a();
                    return;
                }
                return;
            case 5:
                a0.a aVar3 = (a0.a) this.f532g;
                Typeface typeface = (Typeface) this.h;
                e0.b bVar = (e0.b) aVar3.f79g;
                if (bVar != null) {
                    bVar.h(typeface);
                    return;
                }
                return;
            case 6:
                ((k0.f) this.f532g).accept(this.h);
                return;
            default:
                u0.e eVar3 = ((SwipeDismissBehavior) this.h).f926a;
                if (eVar3 == null || !eVar3.f()) {
                    return;
                }
                ((View) this.f532g).postOnAnimation(this);
                return;
        }
    }

    public e(l lVar, ArrayList arrayList, v0 v0Var) {
        this.f531f = 0;
        this.f532g = arrayList;
        this.h = v0Var;
    }

    public e(g1.c cVar, g1.q qVar) {
        this.f531f = 4;
        this.h = cVar;
        this.f532g = qVar;
    }

    public e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z4) {
        this.f531f = 7;
        this.h = swipeDismissBehavior;
        this.f532g = view;
    }
}
