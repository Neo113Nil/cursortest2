package a4;

import a1.n;
import a2.m0;
import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;
import com.appsflyer.attribution.RequestError;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n0.g1;
import n0.i0;
import n0.l0;
import n0.q;
import n0.t1;
import n0.z0;
import o4.o;
import te.a1;
import te.w;
import te.x;
import te.x0;
import wd.b0;
import x.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f275e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f276i;

    public /* synthetic */ a(n4.k kVar, n4.h hVar, boolean z10) {
        this.f274d = 7;
        this.f275e = kVar;
        this.f276i = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x023a, code lost:
    
        r7 = new c1.k(r5, java.lang.Integer.valueOf(r8));
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        c1.k kVar;
        List list;
        switch (this.f274d) {
            case 0:
                return new File(((Context) this.f275e).getApplicationContext().getFilesDir(), "datastore/".concat(((b) this.f276i).f277a.concat(".preferences_pb")));
            case 1:
                c1.f fVar = (c1.f) this.f275e;
                Object obj = this.f276i;
                i0 i0Var = fVar.f1482d;
                q0.h hVar = i0Var.f6700c;
                q0.g e2 = hVar.e();
                int i3 = 0;
                while (true) {
                    try {
                        kVar = null;
                        if (i3 >= hVar.f7747e) {
                            break;
                        } else {
                            if (e2.l(i3)) {
                                Object n10 = e2.n(i3);
                                if (n10 != obj) {
                                    l0 l0Var = n10 instanceof l0 ? (l0) n10 : null;
                                    if ((l0Var != null ? l0Var.f6745a : null) == obj) {
                                    }
                                }
                            }
                            int[] iArr = e2.f7735b;
                            int i10 = i3 + 1;
                            int b10 = (i10 < e2.f7736c ? iArr[(i10 * 5) + 4] : e2.f7738e) - q0.j.b(iArr, i3);
                            int i11 = 0;
                            while (i11 < b10) {
                                Object h10 = e2.h(i3, i11);
                                if (h10 == obj) {
                                    break;
                                } else {
                                    l0 l0Var2 = h10 instanceof l0 ? (l0) h10 : null;
                                    if ((l0Var2 != null ? l0Var2.f6745a : null) == obj) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            i3 = i10;
                        }
                    } finally {
                    }
                }
                c1.k kVar2 = new c1.k(i3, null);
                e2.c();
                kVar = kVar2;
                if (kVar != null) {
                    int i12 = kVar.f1486a;
                    Integer num = kVar.f1487b;
                    e2 = hVar.e();
                    try {
                        ArrayList O = cf.c.O(e2, i12, num);
                        e2.c();
                        list = CollectionsKt.G(O, i0Var.E());
                    } finally {
                    }
                } else {
                    list = j0.f5574d;
                }
                return new c1.a(list, i0Var.C);
            case 2:
                ((e.f) this.f275e).f3745c = (Function0) this.f276i;
                return Unit.f5554a;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                ((e.h) this.f275e).f3748d = (Function2) this.f276i;
                return Unit.f5554a;
            case j.LONG_FIELD_NUMBER /* 4 */:
                g1 g1Var = (g1) this.f275e;
                z0 z0Var = (z0) this.f276i;
                g1Var.i(0);
                WebView webView = (WebView) z0Var.getValue();
                if (webView != null) {
                    webView.reload();
                }
                return Unit.f5554a;
            case j.STRING_FIELD_NUMBER /* 5 */:
                n nVar = (n) this.f275e;
                t1 t1Var = (t1) this.f276i;
                if (((x0.a) nVar.f41i).get() == 0) {
                    t1Var.invoke();
                }
                return Unit.f5554a;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                s.i0 i0Var2 = (s.i0) this.f275e;
                q qVar = (q) this.f276i;
                Object[] objArr = i0Var2.f8320b;
                long[] jArr = i0Var2.f8319a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j = jArr[i13];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j) < 128) {
                                    qVar.y(objArr[(i13 << 3) + i15]);
                                }
                                j >>= 8;
                            }
                            if (i14 != 8) {
                            }
                        }
                        if (i13 != length) {
                            i13++;
                        }
                    }
                }
                return Unit.f5554a;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                n4.k kVar3 = (n4.k) this.f275e;
                n4.h hVar2 = (n4.h) this.f276i;
                hVar2.getClass();
                synchronized (kVar3.f7077a) {
                    try {
                        je.l0 l0Var3 = kVar3.f7078b;
                        Iterable iterable = (Iterable) l0Var3.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (Intrinsics.a((n4.h) obj2, hVar2)) {
                                l0Var3.k(null, arrayList);
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        l0Var3.k(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.f5554a;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                n9.c cVar = (n9.c) this.f275e;
                if (((j9.a) ((z0) this.f276i).getValue()).f5109b) {
                    cVar.h();
                } else {
                    cVar.g();
                }
                return Unit.f5554a;
            case 9:
                n9.c cVar2 = (n9.c) this.f275e;
                Function0 function0 = (Function0) this.f276i;
                function0.getClass();
                cVar2.i();
                function0.invoke();
                return Unit.f5554a;
            case 10:
                ((o) this.f275e).e((n4.h) this.f276i, false);
                return Unit.f5554a;
            case RequestError.STOP_TRACKING /* 11 */:
                x xVar = (x) this.f275e;
                String str = (String) this.f276i;
                Enum[] enumArr = xVar.f9460a;
                w wVar = new w(str, enumArr.length);
                for (Enum r02 : enumArr) {
                    wVar.j(r02.name());
                }
                return wVar;
            case 12:
                String str2 = (String) this.f275e;
                x0 x0Var = (x0) this.f276i;
                re.h hVar3 = re.h.j;
                re.e[] eVarArr = new re.e[0];
                if (StringsKt.r(str2)) {
                    a1.e("Blank serial names are prohibited");
                } else {
                    if (!hVar3.equals(re.h.g)) {
                        re.a aVar = new re.a(str2);
                        x0Var.f9463b.getClass();
                        return new re.f(str2, hVar3, aVar.f8230b.size(), kotlin.collections.w.v(eVarArr), aVar);
                    }
                    a1.e("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case 13:
                x.h hVar4 = (x.h) this.f275e;
                c2.i0 i0Var3 = (c2.i0) this.f276i;
                hVar4.I = hVar4.D.a(i0Var3.f1585d.u(), i0Var3.getLayoutDirection(), i0Var3);
                return Unit.f5554a;
            case 14:
                ((b0) this.f275e).f10141d = c2.k.h((p) this.f276i, m0.f129a);
                return Unit.f5554a;
            default:
                SharedPreferences sharedPreferences = ((Context) this.f275e).getSharedPreferences((String) this.f276i, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }

    public /* synthetic */ a(int i3, Object obj, Object obj2) {
        this.f274d = i3;
        this.f275e = obj;
        this.f276i = obj2;
    }
}
