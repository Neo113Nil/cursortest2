package b7;

import android.os.Build;
import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.gb;
import com.google.android.gms.internal.measurement.lb;
import com.google.android.gms.internal.measurement.md;
import com.google.android.gms.internal.measurement.ob;
import com.google.android.gms.internal.measurement.od;
import com.google.android.gms.internal.measurement.pb;
import com.google.android.gms.internal.measurement.qd;
import com.google.android.gms.internal.measurement.sb;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import v.c1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements k1.t {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1291f = true;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1292a = false;

    /* renamed from: b, reason: collision with root package name */
    public Object f1293b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1294c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1295d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1296e;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(sb sbVar, md mdVar) {
        b8.x b10;
        char c10;
        long j;
        long j3;
        int i3 = 1;
        pb pbVar = sbVar.f2795a;
        lb lbVar = sbVar.f2796b;
        if (pbVar.f2672a.isEmpty()) {
            lb.A().equals(lbVar);
        }
        this.f1293b = lbVar.t();
        this.f1294c = lbVar.u();
        lbVar.getClass();
        lbVar.getClass();
        Map y3 = lbVar.x() == 0 ? null : lbVar.y();
        if (y3 != null) {
            Set keySet = y3.keySet();
            if (!(keySet instanceof b8.i) || (keySet instanceof SortedSet) || ((b8.i) keySet).h()) {
                Object[] array = keySet.toArray();
                b8.i.m(array.length, array);
            }
        } else {
            Object[] objArr = b8.y.f1459w;
        }
        int x10 = lbVar.x();
        pb pbVar2 = sbVar.f2795a;
        char c11 = 3;
        if (x10 > 0) {
            Collection<gb> values = lbVar.y().values();
            if (values == null) {
                b10 = b8.x.f1452u;
            } else {
                b1.c0 c0Var = new b1.c0(4);
                for (gb gbVar : values) {
                    int H = gbVar.H();
                    int i10 = H - 1;
                    if (H == 0) {
                        throw null;
                    }
                    if (i10 == 0) {
                        c0Var.g(gbVar.t(), Long.valueOf(gbVar.u()));
                    } else if (i10 == 1) {
                        c0Var.g(gbVar.t(), Boolean.valueOf(gbVar.v()));
                    } else if (i10 == 2) {
                        c0Var.g(gbVar.t(), Double.valueOf(gbVar.w()));
                    } else if (i10 == 3) {
                        c0Var.g(gbVar.t(), gbVar.x());
                    } else {
                        if (i10 != 4) {
                            kotlin.collections.i0.l("Could not serialize Flag for override: ".concat(String.valueOf(gbVar.t())));
                            throw null;
                        }
                        c0Var.g(gbVar.t(), gbVar.y().n());
                    }
                }
                b10 = c0Var.b(false);
            }
            if (!b10.isEmpty()) {
                HashMap hashMap = new HashMap(b10);
                b8.k kVar = pbVar2.f2672a;
                b8.j jVar = new b8.j();
                b8.b0 it = kVar.iterator();
                while (true) {
                    b8.d dVar = (b8.d) it;
                    if (dVar.hasNext()) {
                        ob obVar = (ob) dVar.next();
                        Object obj = obVar.f2642e;
                        long j10 = obVar.f2641d;
                        Object remove = hashMap.remove(obj == null ? Long.toString(j10) : obj);
                        if (remove == null) {
                            jVar.a(obVar);
                        } else if (remove instanceof String) {
                            jVar.a(new ob(obVar.f2641d, obVar.f2642e, 4, 0L, remove));
                        } else if (remove instanceof byte[]) {
                            jVar.a(new ob(obVar.f2641d, obVar.f2642e, 5, 0L, remove));
                        } else if (remove instanceof Boolean) {
                            jVar.a(new ob(obVar.f2641d, obVar.f2642e, ((Boolean) remove).booleanValue() ? 1 : 0, 0L, null));
                        } else if (remove instanceof Long) {
                            jVar.a(new ob(obVar.f2641d, obVar.f2642e, 2, ((Long) remove).longValue(), null));
                        } else {
                            if (!(remove instanceof Double)) {
                                String str = obVar.f2642e;
                                str = str == null ? Long.toString(j10) : str;
                                String obj2 = remove.toString();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 46 + obj2.length());
                                sb2.append("Cannot serialize override for existing flag ");
                                sb2.append(str);
                                sb2.append(": ");
                                sb2.append(obj2);
                                throw new IllegalStateException(sb2.toString());
                            }
                            jVar.a(new ob(obVar.f2641d, obVar.f2642e, 3, Double.doubleToRawLongBits(((Double) remove).doubleValue()), null));
                        }
                    } else {
                        for (String str2 : hashMap.keySet()) {
                            Object obj3 = hashMap.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    c10 = c11;
                                } else {
                                    c10 = c11;
                                    long charAt = str2.charAt(0) - '0';
                                    if (charAt >= 1) {
                                        if (charAt <= 9) {
                                            int i11 = i3;
                                            while (true) {
                                                if (i11 >= length) {
                                                    j = 0;
                                                    if (charAt >= 0 && charAt <= 2305843009213693951L) {
                                                        j3 = charAt;
                                                    }
                                                } else {
                                                    int charAt2 = str2.charAt(i11) - '0';
                                                    j = 0;
                                                    if ((charAt2 < 0) || (charAt2 > 9)) {
                                                        break;
                                                    }
                                                    charAt = (charAt * 10) + charAt2;
                                                    i11++;
                                                }
                                            }
                                            j3 = j;
                                            String str3 = j3 == j ? str2 : null;
                                            if (obj3 instanceof String) {
                                                jVar.a(new ob(j3, str3, 4, 0L, obj3));
                                            } else if (obj3 instanceof byte[]) {
                                                jVar.a(new ob(j3, str3, 5, 0L, obj3));
                                            } else if (obj3 instanceof Boolean) {
                                                jVar.a(new ob(j3, str3, ((Boolean) obj3).booleanValue() ? 1 : 0, 0L, null));
                                            } else if (obj3 instanceof Long) {
                                                jVar.a(new ob(j3, str3, 2, ((Long) obj3).longValue(), null));
                                            } else {
                                                if (!(obj3 instanceof Double)) {
                                                    String valueOf = String.valueOf(obj3);
                                                    StringBuilder sb3 = new StringBuilder(str2.length() + 28 + valueOf.length());
                                                    sb3.append("Cannot serialize override ");
                                                    sb3.append(str2);
                                                    sb3.append(": ");
                                                    sb3.append(valueOf);
                                                    throw new IllegalStateException(sb3.toString());
                                                }
                                                jVar.a(new ob(j3, str3, 3, Double.doubleToRawLongBits(((Double) obj3).doubleValue()), null));
                                            }
                                            c11 = c10;
                                            i3 = 1;
                                        }
                                    }
                                }
                                j = 0;
                                j3 = 0;
                                if (j3 == j) {
                                }
                                if (obj3 instanceof String) {
                                }
                                c11 = c10;
                                i3 = 1;
                            } else {
                                c10 = c11;
                            }
                            j = 0;
                            j3 = j;
                            if (j3 == j) {
                            }
                            if (obj3 instanceof String) {
                            }
                            c11 = c10;
                            i3 = 1;
                        }
                        pbVar2 = new pb(jVar.c());
                    }
                }
            }
        }
        int size = ((b8.z) pbVar2.f2672a).f1467u.size() + 3;
        c6.f.n(size, "expectedSize");
        b1.c0 c0Var2 = new b1.c0(size);
        b8.b0 it2 = pbVar2.f2672a.iterator();
        while (true) {
            b8.d dVar2 = (b8.d) it2;
            if (!dVar2.hasNext()) {
                c0Var2.g("__phenotype_server_token", lbVar.v());
                c0Var2.g("__phenotype_snapshot_token", lbVar.t());
                c0Var2.g("__phenotype_configuration_version", Long.valueOf(lbVar.w()));
                this.f1295d = c0Var2.b(false);
                this.f1296e = mdVar;
                return;
            }
            ob obVar2 = (ob) dVar2.next();
            String str4 = obVar2.f2642e;
            if (str4 == null) {
                str4 = Long.toString(obVar2.f2641d);
            }
            c0Var2.g(str4, obVar2.a());
        }
    }

    public n1.b a() {
        n1.d iVar;
        n1.b bVar;
        synchronized (this.f1294c) {
            try {
                d2.v vVar = (d2.v) this.f1293b;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    vVar.getUniqueDrawingId();
                }
                if (i3 >= 29) {
                    iVar = new n1.g();
                } else if (f1291f) {
                    try {
                        iVar = new n1.e((d2.v) this.f1293b, new k1.o(), new m1.b());
                    } catch (Throwable unused) {
                        f1291f = false;
                        iVar = new n1.i(e((d2.v) this.f1293b));
                    }
                } else {
                    iVar = new n1.i(e((d2.v) this.f1293b));
                }
                bVar = new n1.b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public boolean b(int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent d10;
        int i12;
        int i13;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1295d;
        if (!this.f1292a || (d10 = d(i11)) == null) {
            return false;
        }
        if (i3 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (((int[]) this.f1296e) == null) {
                this.f1296e = new int[2];
            }
            iArr = (int[]) this.f1296e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (d10 instanceof o3.g) {
            ((o3.g) d10).e(i3, i10, iArr, i11);
        } else if (i11 == 0) {
            try {
                d10.onNestedPreScroll(nestedScrollView, i3, i10, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + d10 + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean c(int i3, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent d10;
        int i14;
        int i15;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1295d;
        if (this.f1292a && (d10 = d(i13)) != null) {
            if (i3 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.f1296e) == null) {
                        this.f1296e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.f1296e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (d10 instanceof o3.h) {
                    ((o3.h) d10).d(nestedScrollView, i3, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (d10 instanceof o3.g) {
                        ((o3.g) d10).f(nestedScrollView, i3, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            d10.onNestedScroll(nestedScrollView, i3, i10, i11, i12);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + d10 + " does not implement interface method onNestedScroll", e2);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public ViewParent d(int i3) {
        if (i3 == 0) {
            return (ViewParent) this.f1293b;
        }
        if (i3 != 1) {
            return null;
        }
        return (ViewParent) this.f1294c;
    }

    public o1.a e(d2.v vVar) {
        o1.b bVar = (o1.b) this.f1295d;
        if (bVar != null) {
            return bVar;
        }
        o1.b bVar2 = new o1.b(vVar.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        vVar.addView(bVar2, -1);
        this.f1295d = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(c6.c cVar, d2.v vVar, boolean z10) {
        Object[] objArr;
        int i3;
        int i10;
        x1.b bVar = (x1.b) this.f1294c;
        c2.o oVar = (c2.o) this.f1296e;
        if (this.f1292a) {
            return 0;
        }
        try {
            this.f1292a = true;
            w7.m e2 = ((c1) this.f1295d).e(cVar, vVar);
            s.p pVar = (s.p) e2.f10130b;
            int f3 = pVar.f();
            for (int i11 = 0; i11 < f3; i11++) {
                x1.l lVar = (x1.l) pVar.g(i11);
                if (!lVar.f10279d && !lVar.f10282h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int f10 = pVar.f();
            for (int i12 = 0; i12 < f10; i12++) {
                x1.l lVar2 = (x1.l) pVar.g(i12);
                if (objArr != false || c6.f.l(lVar2)) {
                    ((c2.g0) this.f1293b).x(lVar2.f10278c, (c2.o) this.f1296e, lVar2.f10283i, true);
                    if (!oVar.f1628d.h()) {
                        bVar.a(lVar2.f10276a, oVar, c6.f.l(lVar2));
                        oVar.clear();
                    }
                }
            }
            boolean b10 = bVar.b(e2, z10);
            if (!e2.f10129a) {
                int f11 = pVar.f();
                for (int i13 = 0; i13 < f11; i13++) {
                    x1.l lVar3 = (x1.l) pVar.g(i13);
                    if (!j1.b.a(j1.b.c(lVar3.f10278c, lVar3.g), 0L) && lVar3.b()) {
                        i3 = 1;
                        break;
                    }
                }
            }
            i3 = 0;
            int f12 = pVar.f();
            int i14 = 0;
            while (true) {
                if (i14 >= f12) {
                    i10 = 0;
                    break;
                }
                if (((x1.l) pVar.g(i14)).b()) {
                    i10 = 1;
                    break;
                }
                i14++;
            }
            int i15 = (b10 ? 1 : 0) | (i3 << 1) | (i10 << 2);
            this.f1292a = false;
            return i15;
        } catch (Throwable th) {
            this.f1292a = false;
            throw th;
        }
    }

    public h(od odVar, md mdVar) {
        od.A().equals(odVar);
        this.f1293b = odVar.t();
        this.f1294c = odVar.u();
        int i3 = b8.i.f1427i;
        Object[] objArr = b8.y.f1459w;
        int y3 = odVar.y() + 3;
        c6.f.n(y3, "expectedSize");
        b1.c0 c0Var = new b1.c0(y3);
        for (qd qdVar : odVar.x()) {
            int G = qdVar.G();
            int i10 = G - 1;
            if (G == 0) {
                throw null;
            }
            if (i10 == 0) {
                c0Var.g(qdVar.t(), Long.valueOf(qdVar.u()));
            } else if (i10 == 1) {
                c0Var.g(qdVar.t(), Boolean.valueOf(qdVar.v()));
            } else if (i10 == 2) {
                c0Var.g(qdVar.t(), Double.valueOf(qdVar.w()));
            } else if (i10 == 3) {
                c0Var.g(qdVar.t(), qdVar.x());
            } else if (i10 == 4) {
                c0Var.g(qdVar.t(), qdVar.y().n());
            }
        }
        c0Var.g("__phenotype_server_token", odVar.v());
        c0Var.g("__phenotype_snapshot_token", odVar.t());
        c0Var.g("__phenotype_configuration_version", Long.valueOf(odVar.w()));
        this.f1295d = c0Var.b(false);
        this.f1296e = mdVar;
    }
}
