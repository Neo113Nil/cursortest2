package c3;

import a.AbstractC0219a;
import f5.C0387a;
import h4.C0409a;
import i4.C0429a;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import u0.C0682l;
import u4.C0694b;

/* loaded from: classes.dex */
public final class k extends j implements d {

    /* renamed from: e, reason: collision with root package name */
    public final f f3794e;

    public k(f fVar, a6.d dVar, V5.g gVar) {
        super(dVar, gVar);
        this.f3794e = fVar;
    }

    @Override // c3.j
    public final N4.d d(Map attributes) {
        kotlin.jvm.internal.i.e(attributes, "attributes");
        Logger logger = N4.d.f1756k;
        C0682l c0682l = new C0682l();
        c0682l.f5989f = C0409a.f4336b;
        C0387a l7 = i6.g.l(attributes);
        f fVar = this.f3794e;
        String rootDir = fVar.getCrashStoragePath();
        long minFileAgeForReadMillis = fVar.getMinFileAgeForReadMillis();
        kotlin.jvm.internal.i.e(rootDir, "rootDir");
        C0694b r6 = AbstractC0219a.r(minFileAgeForReadMillis, rootDir);
        Duration duration = C0429a.f4429g;
        Duration duration2 = C0429a.f4429g;
        C0682l c0682l2 = new C0682l();
        c0682l2.f5989f = r6;
        c0682l2.f5990g = duration;
        C0429a c0429a = new C0429a(c0682l2);
        Logger logger2 = R4.n.f2127j;
        ArrayList arrayList = new ArrayList();
        C0387a c0387a = C0387a.f4248c;
        ArrayList arrayList2 = new ArrayList();
        Q4.f.getDefault();
        String str = U4.c.f2617h;
        arrayList.add(new U4.d(c0429a).a());
        c0682l.f5990g = new R4.n(l7, new C4.d(11), arrayList, new Q4.i(arrayList2));
        return c0682l.h();
    }
}
