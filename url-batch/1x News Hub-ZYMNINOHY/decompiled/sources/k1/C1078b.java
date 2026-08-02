package k1;

import a.AbstractC0129a;
import j1.AbstractC1053b;
import j1.g;
import j1.i;
import q1.AbstractC1180a;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078b {

    /* renamed from: a, reason: collision with root package name */
    public final i f9675a;

    public C1078b(i iVar) {
        this.f9675a = iVar;
    }

    public static C1078b a(AbstractC1053b abstractC1053b) {
        i iVar = (i) abstractC1053b;
        if (g.NATIVE != ((g) iVar.f9541b.f4977b)) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
        if (iVar.f) {
            throw new IllegalStateException("AdSession is started");
        }
        AbstractC0129a.f(iVar);
        AbstractC1180a abstractC1180a = iVar.f9544e;
        if (abstractC1180a.f10232d != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
        C1078b c1078b = new C1078b(iVar);
        abstractC1180a.f10232d = c1078b;
        return c1078b;
    }
}
