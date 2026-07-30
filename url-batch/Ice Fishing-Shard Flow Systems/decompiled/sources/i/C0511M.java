package i;

import I.InterfaceC0120p;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import android.view.PointerIcon;
import androidx.appcompat.widget.Toolbar;
import com.appsflyer.attribution.RequestError;
import j4.C0573b;
import j4.C0580i;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.function.Supplier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l5.C0666d;
import l5.C0668f;
import l5.C0670h;
import n.C0716j;
import n.InterfaceC0699a0;
import o4.InterfaceC0802a;
import q6.C0836a;
import s1.C0869K;
import s1.InterfaceC0875f;
import v1.C0969a;
import v1.C0970b;
import v4.C0974a;
import x5.C1020j;

/* renamed from: i.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0511M implements InterfaceC0802a, io.flutter.plugin.editing.a, s4.f, m.y, InterfaceC0699a0, m.k, q6.d, s4.o, s1.z, InterfaceC0875f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5380d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5381e;

    public /* synthetic */ C0511M(int i2, Object obj) {
        this.f5380d = i2;
        this.f5381e = obj;
    }

    @Override // m.y
    public void a(m.m mVar, boolean z7) {
        if (mVar instanceof m.F) {
            ((m.F) mVar).f6344A.k().c(false);
        }
        m.y yVar = ((C0716j) this.f5381e).f6802m;
        if (yVar != null) {
            yVar.a(mVar, z7);
        }
    }

    @Override // s1.InterfaceC0875f
    public void accept(Object obj, Object obj2) {
        K1.h hVar = (K1.h) obj2;
        C0970b c0970b = (C0970b) ((C0969a) obj).i();
        t1.l lVar = (t1.l) this.f5381e;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c0970b.f289f);
        int i2 = C1.b.f290a;
        obtain.writeInt(1);
        lVar.writeToParcel(obtain, 0);
        try {
            c0970b.f288e.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // s4.f
    public q1.h b(s4.l lVar) {
        return ((C0580i) this.f5381e).b(lVar);
    }

    @Override // m.k
    public boolean d(m.m mVar, MenuItem menuItem) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // q6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(q6.e eVar, V5.b bVar) {
        C0836a c0836a;
        int i2;
        Throwable th;
        r6.t tVar;
        if (bVar instanceof C0836a) {
            c0836a = (C0836a) bVar;
            int i5 = c0836a.f7355l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0836a.f7355l = i5 - Integer.MIN_VALUE;
                Object obj = c0836a.f7353e;
                Object obj2 = W5.a.f2787d;
                i2 = c0836a.f7355l;
                if (i2 != 0) {
                    V6.b.P(obj);
                    r6.t tVar2 = new r6.t(eVar, c0836a.getContext());
                    try {
                        c0836a.f7352d = tVar2;
                        c0836a.f7355l = 1;
                        Object invoke = ((X5.j) this.f5381e).invoke(tVar2, c0836a);
                        if (invoke != obj2) {
                            invoke = Unit.f6114a;
                        }
                        if (invoke == obj2) {
                            return obj2;
                        }
                        tVar = tVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        tVar = tVar2;
                        tVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = c0836a.f7352d;
                    try {
                        V6.b.P(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        tVar.releaseIntercepted();
                        throw th;
                    }
                }
                tVar.releaseIntercepted();
                return Unit.f6114a;
            }
        }
        c0836a = new C0836a(this, bVar);
        Object obj3 = c0836a.f7353e;
        Object obj22 = W5.a.f2787d;
        i2 = c0836a.f7355l;
        if (i2 != 0) {
        }
        tVar.releaseIntercepted();
        return Unit.f6114a;
    }

    @Override // s4.f
    public void f(String str, ByteBuffer byteBuffer, s4.e eVar) {
        ((C0580i) this.f5381e).f(str, byteBuffer, eVar);
    }

    @Override // s1.z
    public void g(Bundle bundle) {
        C0869K c0869k = (C0869K) this.f5381e;
        c0869k.f7632m.lock();
        try {
            Bundle bundle2 = c0869k.f7629i;
            if (bundle2 == null) {
                c0869k.f7629i = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            c0869k.j = q1.b.f7309n;
            c0869k.f();
        } finally {
            c0869k.f7632m.unlock();
        }
    }

    @Override // s4.f
    public void h(String str, s4.d dVar, q1.h hVar) {
        ((C0580i) this.f5381e).h(str, dVar, hVar);
    }

    @Override // m.y
    public boolean i(m.m mVar) {
        C0716j c0716j = (C0716j) this.f5381e;
        if (mVar == c0716j.f6800i) {
            return false;
        }
        ((m.F) mVar).f6345B.getClass();
        c0716j.getClass();
        m.y yVar = c0716j.f6802m;
        if (yVar != null) {
            return yVar.i(mVar);
        }
        return false;
    }

    @Override // m.k
    public void j(m.m mVar) {
        Toolbar toolbar = (Toolbar) this.f5381e;
        C0716j c0716j = toolbar.f3332d.f3196B;
        if (c0716j == null || !c0716j.e()) {
            Iterator it = toolbar.f3321O.f1226b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.I) ((InterfaceC0120p) it.next())).f3588a.t();
            }
        }
        l2.c cVar = toolbar.f3328W;
        if (cVar != null) {
            cVar.j(mVar);
        }
    }

    @Override // s4.f
    public void k(String str, ByteBuffer byteBuffer) {
        ((C0580i) this.f5381e).f(str, byteBuffer, null);
    }

    @Override // s1.z
    public void m(q1.b bVar) {
        C0869K c0869k = (C0869K) this.f5381e;
        c0869k.f7632m.lock();
        try {
            c0869k.j = bVar;
            c0869k.f();
        } finally {
            c0869k.f7632m.unlock();
        }
    }

    @Override // s4.f
    public void n(String str, s4.d dVar) {
        ((C0580i) this.f5381e).h(str, dVar, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // s4.o
    public void onMethodCall(s4.n nVar, s4.p pVar) {
        Object obj;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        int i2 = 3;
        int i5 = 2;
        boolean z7 = false;
        switch (this.f5380d) {
            case RequestError.STOP_TRACKING /* 11 */:
                l4.b bVar = (l4.b) this.f5381e;
                if (((C0511M) bVar.f6272e) == null) {
                    return;
                }
                String str = nVar.f7767a;
                try {
                    if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                        try {
                            ((C0511M) bVar.f6272e).q((String) ((HashMap) nVar.f7768b).get("kind"));
                            ((r4.l) pVar).success(Boolean.TRUE);
                        } catch (Exception e7) {
                            ((r4.l) pVar).error("error", "Error when setting cursors: " + e7.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e8) {
                    ((r4.l) pVar).error("error", "Unhandled error: " + e8.getMessage(), null);
                    return;
                }
            case 12:
                P0.s sVar = (P0.s) this.f5381e;
                if (((r4.k) sVar.f2252e) == null) {
                    return;
                }
                String str2 = nVar.f7767a;
                obj = nVar.f7768b;
                str2.getClass();
                switch (str2) {
                    case "create":
                        Map map = (Map) obj;
                        boolean z8 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (((r4.k) sVar.f2252e).t()) {
                                ((r4.k) sVar.f2252e).r(new r4.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, wrap));
                                ((r4.l) pVar).success(null);
                                return;
                            }
                            if (z8) {
                                ((r4.k) sVar.f2252e).k(new r4.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                ((r4.l) pVar).success(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                z7 = true;
                            }
                            long p7 = ((r4.k) sVar.f2252e).p(new r4.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z7 ? 2 : 1, wrap));
                            if (p7 != -2) {
                                ((r4.l) pVar).success(Long.valueOf(p7));
                                return;
                            } else {
                                if (!z7) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                ((r4.l) pVar).success(null);
                                return;
                            }
                        } catch (IllegalStateException e9) {
                            ((r4.l) pVar).error("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case "offset":
                        Map map2 = (Map) obj;
                        try {
                            ((r4.k) sVar.f2252e).h(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            ((r4.l) pVar).success(null);
                            return;
                        } catch (IllegalStateException e10) {
                            ((r4.l) pVar).error("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case "resize":
                        Map map3 = (Map) obj;
                        try {
                            ((r4.k) sVar.f2252e).f(new r4.j(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new A4.b(15, (r4.l) pVar));
                            return;
                        } catch (IllegalStateException e11) {
                            ((r4.l) pVar).error("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((r4.k) sVar.f2252e).n(((Integer) obj).intValue());
                            ((r4.l) pVar).success(null);
                            return;
                        } catch (IllegalStateException e12) {
                            ((r4.l) pVar).error("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case "synchronizeToNativeViewHierarchy":
                        try {
                            ((r4.k) sVar.f2252e).c(((Boolean) obj).booleanValue());
                            ((r4.l) pVar).success(null);
                            return;
                        } catch (IllegalStateException e13) {
                            ((r4.l) pVar).error("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj;
                        try {
                            ((r4.k) sVar.f2252e).l(new r4.i(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            ((r4.l) pVar).success(null);
                            return;
                        } catch (IllegalStateException e14) {
                            ((r4.l) pVar).error("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case "setDirection":
                        Map map4 = (Map) obj;
                        try {
                            ((r4.k) sVar.f2252e).i(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            ((r4.l) pVar).success(null);
                            return;
                        } catch (IllegalStateException e15) {
                            ((r4.l) pVar).error("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case "dispose":
                        try {
                            ((r4.k) sVar.f2252e).s(((Integer) ((Map) obj).get("id")).intValue());
                            ((r4.l) pVar).success(null);
                            return;
                        } catch (IllegalStateException e16) {
                            ((r4.l) pVar).error("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    default:
                        ((r4.l) pVar).notImplemented();
                        return;
                }
            case 13:
                P0.c cVar = (P0.c) this.f5381e;
                if (((C0974a) cVar.f2190i) == null) {
                    return;
                }
                String str3 = nVar.f7767a;
                Object obj2 = nVar.f7768b;
                str3.getClass();
                if (str3.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj2;
                        ((C0974a) cVar.f2190i).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), (r4.l) pVar);
                        return;
                    } catch (IllegalStateException e17) {
                        ((r4.l) pVar).error("error", e17.getMessage(), null);
                        return;
                    }
                }
                if (!str3.equals("ProcessText.queryTextActions")) {
                    ((r4.l) pVar).notImplemented();
                    return;
                }
                try {
                    ((r4.l) pVar).success(((C0974a) cVar.f2190i).b());
                    return;
                } catch (IllegalStateException e18) {
                    ((r4.l) pVar).error("error", e18.getMessage(), null);
                    return;
                }
            case 14:
                l4.b bVar2 = (l4.b) this.f5381e;
                if (((P0.l) bVar2.f6272e) == null) {
                    return;
                }
                String str4 = nVar.f7767a;
                str4.getClass();
                switch (str4.hashCode()) {
                    case -705821951:
                        if (str4.equals("Scribe.isFeatureAvailable")) {
                            break;
                        }
                        break;
                    case 1759284829:
                        if (str4.equals("Scribe.startStylusHandwriting")) {
                            break;
                        }
                        break;
                    case 2119738044:
                        if (str4.equals("Scribe.isStylusHandwritingAvailable")) {
                            break;
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 1884
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i.C0511M.onMethodCall(s4.n, s4.p):void");
            }

            @Override // s1.z
            public void p(int i2) {
                q1.b bVar;
                C0869K c0869k = (C0869K) this.f5381e;
                Lock lock = c0869k.f7632m;
                Lock lock2 = c0869k.f7632m;
                lock.lock();
                try {
                    if (!c0869k.f7631l && (bVar = c0869k.f7630k) != null && bVar.b()) {
                        c0869k.f7631l = true;
                        c0869k.f7627g.onConnectionSuspended(i2);
                        return;
                    }
                    c0869k.f7631l = false;
                    c0869k.f7625e.p(i2);
                    c0869k.f7630k = null;
                    c0869k.j = null;
                } finally {
                    lock2.unlock();
                }
            }

            public void q(String str) {
                u4.a aVar = (u4.a) ((P0.c) this.f5381e).f2189e;
                if (P0.c.f2187m == null) {
                    h4.z zVar = new h4.z();
                    zVar.put("alias", 1010);
                    zVar.put("allScroll", 1013);
                    zVar.put("basic", 1000);
                    zVar.put("cell", 1006);
                    zVar.put("click", 1002);
                    zVar.put("contextMenu", 1001);
                    zVar.put("copy", 1011);
                    zVar.put("forbidden", 1012);
                    zVar.put("grab", 1020);
                    zVar.put("grabbing", 1021);
                    zVar.put("help", 1003);
                    zVar.put("move", 1013);
                    zVar.put("none", 0);
                    zVar.put("noDrop", 1012);
                    zVar.put("precise", 1007);
                    zVar.put("text", 1008);
                    zVar.put("resizeColumn", 1014);
                    zVar.put("resizeDown", 1015);
                    zVar.put("resizeUpLeft", 1016);
                    zVar.put("resizeDownRight", 1017);
                    zVar.put("resizeLeft", 1014);
                    zVar.put("resizeLeftRight", 1014);
                    zVar.put("resizeRight", 1014);
                    zVar.put("resizeRow", 1015);
                    zVar.put("resizeUp", 1015);
                    zVar.put("resizeUpDown", 1015);
                    zVar.put("resizeUpLeft", 1017);
                    zVar.put("resizeUpRight", 1016);
                    zVar.put("resizeUpLeftDownRight", 1017);
                    zVar.put("resizeUpRightDownLeft", 1016);
                    zVar.put("verticalText", 1009);
                    zVar.put("wait", 1004);
                    zVar.put("zoomIn", 1018);
                    zVar.put("zoomOut", 1019);
                    P0.c.f2187m = zVar;
                }
                aVar.setPointerIcon(PointerIcon.getSystemIcon(((h4.p) aVar).getContext(), ((Integer) P0.c.f2187m.getOrDefault(str, 1000)).intValue()));
            }

            public C1020j r() {
                return new C1020j((ArrayList) this.f5381e);
            }

            public C0511M(int i2) {
                this.f5380d = i2;
                switch (i2) {
                    case 24:
                        this.f5381e = new ArrayList();
                        break;
                    default:
                        this.f5381e = Collections.newSetFromMap(new WeakHashMap());
                        break;
                }
            }

            public C0511M(C0573b c0573b) {
                this.f5380d = 17;
                this.f5381e = new P0.i(c0573b, "flutter/system", s4.k.f7765a, null);
            }

            public C0511M(int i2, Supplier supplier, x5.m mVar, String str) {
                C4.b bVar;
                this.f5380d = 4;
                x5.l lVar = mVar.f8405c;
                int i5 = lVar.f8401e;
                int b7 = S.i.b(i2);
                Object obj = C0668f.f6294a;
                if (b7 == 0) {
                    H4.e eVar = C0666d.f6285i;
                    switch (lVar.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                            obj = new C0666d(supplier, lVar);
                            break;
                    }
                    this.f5381e = obj;
                    return;
                }
                if (b7 != 1) {
                    throw new IllegalStateException("Unhandled case: ".concat(r4.f.j(i2)));
                }
                if (i5 != 4) {
                    try {
                        URI uri = new URI(str);
                        C4.d dVar = new C4.d(0);
                        String host = uri.getHost();
                        if (host != null) {
                            dVar.e(x5.k.f8395d, host);
                        }
                        int port = uri.getPort();
                        if (port == -1) {
                            String scheme = uri.getScheme();
                            if ("https".equals(scheme)) {
                                port = 443;
                            } else if ("http".equals(scheme)) {
                                port = 80;
                            }
                        }
                        if (port != -1) {
                            dVar.e(x5.k.f8396e, Long.valueOf(port));
                        }
                        bVar = dVar.b();
                    } catch (URISyntaxException unused) {
                        bVar = C4.b.f297l;
                    }
                    obj = new C0670h(supplier, i5, mVar, bVar);
                }
                this.f5381e = obj;
            }

            public C0511M(s4.f fVar) {
                this.f5380d = 10;
                P0.s sVar = new P0.s();
                sVar.f2252e = this;
                sVar.f2251d = new HashMap();
                new s4.q(fVar, "flutter/keyboard", s4.w.f7775a).b(sVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0511M(Function2 function2) {
                this.f5380d = 9;
                this.f5381e = (X5.j) function2;
            }

            @Override // n.InterfaceC0699a0
            public void c(int i2) {
            }

            @Override // n.InterfaceC0699a0
            public void l(int i2) {
            }
        }
