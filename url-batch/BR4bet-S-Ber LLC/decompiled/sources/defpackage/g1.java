package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class g1 implements Runnable {
    public final /* synthetic */ int f;
    public Object g;
    public final /* synthetic */ Object h;

    public g1(ug ugVar, ArrayList arrayList, m60 m60Var) {
        this.f = 6;
        this.g = arrayList;
        this.h = m60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        kw kwVar;
        Object[] objArr;
        d7 d7Var;
        int i;
        int[] iArr;
        int i2 = this.f;
        int i3 = 1;
        Object obj = this.h;
        switch (i2) {
            case 0:
                e1 e1Var = (e1) this.g;
                i1 i1Var = (i1) obj;
                mw mwVar = i1Var.h;
                if (mwVar != null && (kwVar = mwVar.e) != null) {
                    kwVar.q(mwVar);
                }
                View view = (View) i1Var.m;
                if (view != null && view.getWindowToken() != null) {
                    if (!e1Var.b()) {
                        if (e1Var.f != null) {
                            e1Var.d(0, 0, false, false);
                        }
                    }
                    i1Var.x = e1Var;
                }
                i1Var.z = null;
                return;
            case 1:
                ((q1) this.g).a = obj;
                return;
            case 2:
                ((Application) this.g).unregisterActivityLifecycleCallbacks((q1) obj);
                return;
            case 3:
                Object obj2 = this.g;
                try {
                    Method method = r1.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        r1.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                b7 b7Var = (b7) obj;
                d7 d7Var2 = b7Var.i;
                if (d7Var2.g == b7Var.h) {
                    List list = b7Var.g;
                    rh rhVar = (rh) this.g;
                    d7Var2.e = list;
                    d7Var2.f = Collections.unmodifiableList(list);
                    rc0 rc0Var = d7Var2.a;
                    int[] iArr2 = rhVar.b;
                    ArrayList arrayList = rhVar.a;
                    int i4 = rhVar.e;
                    rc0 rc0Var2 = rhVar.d;
                    k8 k8Var = new k8(rc0Var);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i5 = rhVar.f;
                    int size = arrayList.size() - 1;
                    int i6 = i5;
                    int i7 = i4;
                    while (size >= 0) {
                        qh qhVar = (qh) arrayList.get(size);
                        int i8 = qhVar.a;
                        int i9 = qhVar.c;
                        int i10 = i3;
                        int i11 = i8 + i9;
                        int i12 = qhVar.b;
                        int i13 = i12 + i9;
                        while (i7 > i11) {
                            i7--;
                            int i14 = iArr2[i7];
                            if ((i14 & 12) != 0) {
                                d7Var = d7Var2;
                                int i15 = i14 >> 4;
                                i = i11;
                                iArr = iArr2;
                                sh a = rh.a(arrayDeque, i15, false);
                                if (a != null) {
                                    int i16 = (i4 - a.b) - 1;
                                    k8Var.e(i7, i16);
                                    if ((i14 & 4) != 0) {
                                        rc0Var2.G(i7, i15);
                                        k8Var.o(i16, i10);
                                    }
                                } else {
                                    boolean z = i10;
                                    arrayDeque.add(new sh(i7, (i4 - i7) - (z ? 1 : 0), z));
                                }
                            } else {
                                d7Var = d7Var2;
                                i = i11;
                                iArr = iArr2;
                                k8Var.d(i7, i10);
                                i4--;
                            }
                            i11 = i;
                            d7Var2 = d7Var;
                            iArr2 = iArr;
                            i10 = 1;
                        }
                        d7 d7Var3 = d7Var2;
                        int[] iArr3 = iArr2;
                        while (i6 > i13) {
                            i6--;
                            int i17 = rhVar.c[i6];
                            if ((i17 & 12) != 0) {
                                int i18 = i17 >> 4;
                                if (rh.a(arrayDeque, i18, true) == null) {
                                    objArr = true;
                                    arrayDeque.add(new sh(i6, i4 - i7, false));
                                } else {
                                    objArr = true;
                                    k8Var.e((i4 - r0.b) - 1, i7);
                                    if ((i17 & 4) != 0) {
                                        rc0Var2.G(i18, i6);
                                        k8Var.o(i7, 1);
                                    }
                                }
                            } else {
                                k8Var.p(i7, 1);
                                i4++;
                            }
                        }
                        int i19 = i12;
                        int i20 = i8;
                        for (int i21 = 0; i21 < i9; i21++) {
                            if ((iArr3[i20] & 15) == 2) {
                                rc0Var2.G(i20, i19);
                                k8Var.o(i20, 1);
                            }
                            i20++;
                            i19++;
                        }
                        size--;
                        i3 = 1;
                        i6 = i12;
                        i7 = i8;
                        d7Var2 = d7Var3;
                        iArr2 = iArr3;
                    }
                    k8Var.a();
                    d7Var2.a();
                    return;
                }
                return;
            case 5:
                Typeface typeface = (Typeface) obj;
                b9 b9Var = (b9) ((pw) this.g).f;
                if (b9Var != null) {
                    b9Var.A(typeface);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.g;
                m60 m60Var = (m60) obj;
                if (arrayList2.contains(m60Var)) {
                    arrayList2.remove(m60Var);
                    f60.a(m60Var.c.J, m60Var.a);
                    return;
                }
                return;
            case 7:
                qs qsVar = (qs) obj;
                bf bfVar = qsVar.h;
                int i22 = 0;
                while (true) {
                    try {
                        ((Runnable) this.g).run();
                    } catch (Throwable th2) {
                        mz.t(gk.f, th2);
                    }
                    Runnable t = qsVar.t();
                    if (t == null) {
                        return;
                    }
                    this.g = t;
                    i22++;
                    if (i22 >= 16 && bfVar.r(qsVar)) {
                        bfVar.q(qsVar, this);
                        return;
                    }
                }
                break;
            default:
                ((am) this.g).accept(obj);
                return;
        }
    }

    public /* synthetic */ g1(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ g1(Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }
}
