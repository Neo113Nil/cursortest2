package E3;

import P0.s;
import a.AbstractC0169a;
import b5.C0279b;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import x5.C1020j;
import x5.InterfaceC1017g;

/* loaded from: classes.dex */
public final class k extends j implements d {

    /* renamed from: e, reason: collision with root package name */
    public final f f687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f platformProvider, B.f osTopLevelFields, l2.c osPerEventFields) {
        super(osTopLevelFields, osPerEventFields);
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(osTopLevelFields, "osTopLevelFields");
        Intrinsics.checkNotNullParameter(osPerEventFields, "osPerEventFields");
        this.f687e = platformProvider;
    }

    @Override // E3.j
    public final u5.d d(Map attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Logger logger = u5.d.f8074n;
        P0.e eVar = new P0.e(13, false);
        eVar.f2194e = O4.a.f1921b;
        M5.a resource = AbstractC0169a.g(attributes);
        f fVar = this.f687e;
        String rootDir = fVar.getCrashStoragePath();
        long minFileAgeForReadMillis = fVar.getMinFileAgeForReadMillis();
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        C0279b r7 = P0.f.r(rootDir, minFileAgeForReadMillis);
        Duration duration = P4.a.f2287e;
        Duration duration2 = P4.a.f2287e;
        s sVar = new s();
        sVar.f2251d = r7;
        sVar.f2252e = duration;
        P4.a aVar = new P4.a(sVar);
        Logger logger2 = y5.m.f8696m;
        ArrayList arrayList = new ArrayList();
        M5.a aVar2 = M5.a.f1769c;
        ArrayList arrayList2 = new ArrayList();
        InterfaceC1017g.getDefault();
        String str = B5.d.f200i;
        arrayList.add(new B5.e(aVar).a());
        y5.m mVar = new y5.m(resource, new G3.a(0), arrayList, new C1020j(arrayList2));
        Intrinsics.checkNotNullExpressionValue(mVar, "build(...)");
        eVar.f2195i = mVar;
        u5.d m2 = eVar.m();
        Intrinsics.checkNotNullExpressionValue(m2, "build(...)");
        return m2;
    }
}
