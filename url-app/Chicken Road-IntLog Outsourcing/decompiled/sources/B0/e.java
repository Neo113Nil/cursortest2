package B0;

import G0.C0060j;
import M.C0088q;
import T4.B;
import T4.z;
import a4.AbstractC0197c;
import a4.C0195a;
import android.database.Cursor;
import android.graphics.Rect;
import android.util.LongSparseArray;
import androidx.work.impl.WorkDatabase_Impl;
import b4.C0292g;
import b4.C0293h;
import c3.C0310a;
import j5.u;
import j5.v;
import j5.w;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.PriorityQueue;
import java.util.logging.Logger;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONObject;
import q.C1385a;
import y2.C1557b;

/* loaded from: classes.dex */
public final class e implements G4.d, X2.r, v, io.flutter.plugin.platform.i {

    /* renamed from: d, reason: collision with root package name */
    public static e f144d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145a;

    /* renamed from: b, reason: collision with root package name */
    public Object f146b;

    /* renamed from: c, reason: collision with root package name */
    public Object f147c;

    public /* synthetic */ e(int i2) {
        this.f145a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(e eVar, JSONArray jSONArray) {
        String str;
        eVar.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            String string = jSONArray.getString(i6);
            for (int i7 : O.j.c(4)) {
                if (i7 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i7 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i7 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i7 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int b6 = O.j.b(i7);
                    if (b6 == 0) {
                        i2 |= 1;
                    } else if (b6 == 1) {
                        i2 |= 4;
                    } else if (b6 == 2) {
                        i2 |= 2;
                    } else if (b6 == 3) {
                        i2 |= 8;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            throw new NoSuchFieldException(o.i("No such DeviceOrientation: ", string));
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i3 == 2) {
                    return 0;
                }
                if (i3 != 4) {
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    public static ArrayList g(e eVar, JSONArray jSONArray) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (G2.e eVar2 : G2.e.values()) {
                if (eVar2.f944a.equals(string)) {
                    int ordinal = eVar2.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(G2.e.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(G2.e.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(o.i("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int h(e eVar, String str) {
        String str2;
        eVar.getClass();
        for (int i2 : O.j.c(4)) {
            if (i2 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i2 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i2 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int b6 = O.j.b(i2);
                if (b6 == 0) {
                    return 1;
                }
                if (b6 != 1) {
                    return b6 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(o.i("No such SystemUiMode: ", str));
    }

    public static G2.d j(e eVar, JSONObject jSONObject) {
        eVar.getClass();
        return new G2.d(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? o.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? o.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    @Override // io.flutter.plugin.platform.i
    public void b(io.flutter.view.g gVar) {
        ((io.flutter.plugin.platform.m) this.f146b).f10242h.f10209a = gVar;
        ((io.flutter.plugin.platform.l) this.f147c).f10226f.f10209a = gVar;
    }

    @Override // X2.r
    public X2.q build() {
        return (X2.q) ((n) this.f146b).a(Q2.a.f2475d, (String) this.f147c);
    }

    @Override // io.flutter.plugin.platform.i
    public boolean c(int i2) {
        ((io.flutter.plugin.platform.l) this.f147c).d(i2);
        return ((io.flutter.plugin.platform.m) this.f146b).c(i2);
    }

    @Override // io.flutter.plugin.platform.i
    public void d(int i2) {
        ((io.flutter.plugin.platform.l) this.f147c).d(i2);
        ((io.flutter.plugin.platform.m) this.f146b).d(i2);
    }

    @Override // io.flutter.plugin.platform.i
    public void e() {
        ((io.flutter.plugin.platform.m) this.f146b).e();
        ((io.flutter.plugin.platform.l) this.f147c).e();
    }

    @Override // G4.d
    public Object i(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        switch (this.f145a) {
            case 4:
                Object i2 = ((l) this.f146b).i(new G4.l(new kotlin.jvm.internal.q(), eVar, (C0088q) this.f147c), interfaceC1218d);
                if (i2 != EnumC1260a.f11058a) {
                    break;
                }
                break;
            default:
                Object i3 = ((G4.d) this.f146b).i(new N2.m(eVar, (P.d) this.f147c, 1), interfaceC1218d);
                if (i3 != EnumC1260a.f11058a) {
                    break;
                }
                break;
        }
        return f4.v.f5689a;
    }

    public I3.d k() {
        Logger logger = C0292g.f4839d;
        C0293h c0293h = new C0293h();
        C0292g c0292g = new C0292g(c0293h.f4845b, c0293h.f4846c, c0293h.f4847d, c0293h.f4848e, c0293h.f4849f, c0293h.f4844a, c0293h.f4850g.a());
        Logger logger2 = R3.v.f2661h;
        C0195a c0195a = AbstractC0197c.f3886a;
        R3.v vVar = new R3.v(new ArrayList(), new IdentityHashMap(), new ArrayList(), c0195a, W3.a.f3419a, new L3.j(0).a());
        M3.o oVar = (M3.o) this.f147c;
        if (oVar == null) {
            Logger logger3 = M3.o.f1981e;
            ArrayList arrayList = new ArrayList();
            C0195a c0195a2 = AbstractC0197c.f3886a;
            D3.h hVar = new D3.h(2);
            ArrayList arrayList2 = new ArrayList();
            L3.f.h();
            oVar = new M3.o(c0195a2, hVar, arrayList, new L3.i(arrayList2));
        }
        return new I3.d(c0292g, vVar, oVar, (C0310a) this.f146b);
    }

    public Long l(String str) {
        X.k c2 = X.k.c(1, "SELECT long_value FROM Preference where `key`=?");
        c2.f(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f146b;
        workDatabase_Impl.b();
        Long l2 = null;
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            if (m6.moveToFirst() && !m6.isNull(0)) {
                l2 = Long.valueOf(m6.getLong(0));
            }
            return l2;
        } finally {
            m6.close();
            c2.g();
        }
    }

    public void m(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f146b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f147c).q(dVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void n(z zVar) {
        B b6 = zVar.f3021g;
        try {
            ((x3.b) this.f147c).accept(new D3.c(zVar, b6));
            if (b6 != null) {
                b6.close();
            }
        } catch (Throwable th) {
            if (b6 != null) {
                try {
                    b6.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void o(int i2, int i3, int i6, int i7) {
        C1385a c1385a = (C1385a) this.f147c;
        c1385a.f11649d.set(i2, i3, i6, i7);
        Rect rect = c1385a.f11648c;
        super/*android.view.View*/.setPadding(i2 + rect.left, i3 + rect.top, i6 + rect.right, i7 + rect.bottom);
    }

    @Override // j5.v
    public u q() {
        return (X4.g) this.f146b;
    }

    @Override // j5.v
    public w s() {
        return (X4.h) this.f147c;
    }

    public e(C0060j c0060j, ArrayList arrayList) {
        this.f145a = 2;
        this.f146b = arrayList;
        this.f147c = c0060j;
    }

    public /* synthetic */ e(Object obj, int i2, Object obj2) {
        this.f145a = i2;
        this.f146b = obj;
        this.f147c = obj2;
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f145a = 0;
        this.f146b = workDatabase_Impl;
        this.f147c = new b(workDatabase_Impl, 1);
    }

    public e() {
        this.f145a = 13;
        this.f146b = new LongSparseArray();
        this.f147c = new PriorityQueue();
    }

    public e(X4.i iVar) {
        this.f145a = 8;
        this.f146b = new X4.g(iVar, ((Y4.g) iVar.f3573e).e().q(), -1L);
        this.f147c = new X4.h(iVar, ((Y4.g) iVar.f3573e).e().s(), -1L);
    }

    public e(C1557b c1557b) {
        this.f145a = 3;
        B1.g gVar = new B1.g(10, this);
        H2.o oVar = new H2.o(c1557b, "flutter/platform", H2.j.f1145a);
        this.f146b = oVar;
        oVar.b(gVar);
    }

    public e(C1385a c1385a) {
        this.f145a = 12;
        this.f147c = c1385a;
    }
}
