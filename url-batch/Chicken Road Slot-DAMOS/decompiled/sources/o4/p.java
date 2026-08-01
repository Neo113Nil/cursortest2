package o4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wd.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f7493e;

    public /* synthetic */ p(Context context, int i3) {
        this.f7492d = i3;
        this.f7493e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle bundle;
        Throwable th;
        switch (this.f7492d) {
            case 0:
                Bundle bundle2 = (Bundle) obj;
                n4.x o6 = cf.c.o(this.f7493e);
                if (bundle2 != null) {
                    bundle2.setClassLoader(o6.f7129a.getClassLoader());
                }
                q4.h hVar = o6.f7130b;
                LinkedHashMap linkedHashMap = hVar.f8004m;
                Throwable th2 = null;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            c6.f.Q("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    hVar.f7997d = bundle;
                    hVar.f7998e = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) a.a.I("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            c6.f.Q("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            c6.f.Q("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i3 = 0;
                        int i10 = 0;
                        while (i3 < length) {
                            int i11 = i10 + 1;
                            Throwable th3 = th2;
                            hVar.f8003l.put(Integer.valueOf(intArray[i3]), !Intrinsics.a(stringArrayList.get(i10), "") ? (String) stringArrayList.get(i10) : th3);
                            i3++;
                            th2 = th3;
                            i10 = i11;
                        }
                    }
                    th = th2;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            c6.f.Q("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                        int size = stringArrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            String str = stringArrayList2.get(i12);
                            i12++;
                            String str2 = str;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                ArrayList I = a.a.I("android-support-nav:controller:backStackStates:" + str2, bundle2);
                                kotlin.collections.s sVar = new kotlin.collections.s(I.size());
                                int size2 = I.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    Object obj2 = I.get(i13);
                                    i13++;
                                    sVar.addLast(new n4.i((Bundle) obj2));
                                }
                                linkedHashMap.put(str2, sVar);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z10 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z10 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z10) : th;
                    o6.f7133e = valueOf != 0 ? valueOf.booleanValue() : false;
                }
                return o6;
            default:
                ef.a aVar = (ef.a) obj;
                aVar.getClass();
                final Context context = this.f7493e;
                if (context instanceof Application) {
                    final int i14 = 0;
                    Function2 function2 = new Function2() { // from class: we.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            lf.a aVar2 = (lf.a) obj3;
                            gf.a aVar3 = (gf.a) obj4;
                            switch (i14) {
                                case 0:
                                    aVar2.getClass();
                                    aVar3.getClass();
                                    return (Application) context;
                                default:
                                    aVar2.getClass();
                                    aVar3.getClass();
                                    return context;
                            }
                        }
                    };
                    af.b bVar = af.b.f373d;
                    j0 j0Var = j0.f5574d;
                    wd.h a9 = c0.a(Application.class);
                    hf.b bVar2 = jf.b.f5254e;
                    af.a aVar2 = new af.a(bVar2, a9, function2, bVar, j0Var);
                    cf.d dVar = new cf.d(aVar2);
                    aVar.a(dVar);
                    wd.h a10 = c0.a(Context.class);
                    aVar2.f372e = CollectionsKt.F(aVar2.f372e, a10);
                    aVar.f3993c.put(mf.a.a(a10) + "::" + bVar2, dVar);
                } else {
                    final int i15 = 1;
                    aVar.a(new cf.d(new af.a(jf.b.f5254e, c0.a(Context.class), new Function2() { // from class: we.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            lf.a aVar22 = (lf.a) obj3;
                            gf.a aVar3 = (gf.a) obj4;
                            switch (i15) {
                                case 0:
                                    aVar22.getClass();
                                    aVar3.getClass();
                                    return (Application) context;
                                default:
                                    aVar22.getClass();
                                    aVar3.getClass();
                                    return context;
                            }
                        }
                    }, af.b.f373d, j0.f5574d)));
                }
                return Unit.f5554a;
        }
    }
}
