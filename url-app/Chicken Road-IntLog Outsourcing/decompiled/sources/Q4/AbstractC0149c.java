package Q4;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;

/* renamed from: Q4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0149c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0148b f2500d = new C0148b(new j(false, false, false, false, false, true, "    ", false, false, WebViewManager.EVENT_TYPE_KEY, false, true, false, false, EnumC0147a.f2498a), S4.a.f2751a);

    /* renamed from: a, reason: collision with root package name */
    public final j f2501a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.e f2502b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.g f2503c = new B1.g(28);

    public AbstractC0149c(j jVar, W1.e eVar) {
        this.f2501a = jVar;
        this.f2502b = eVar;
    }

    public final l a(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        p pVar = p.f2552a;
        R4.u uVar = new R4.u(string);
        Object Q5 = new R4.r(this, R4.w.f2727c, uVar, p.f2553b).Q(pVar);
        if (uVar.e() == 10) {
            return (l) Q5;
        }
        R4.u.n(uVar, "Expected EOF after parsing, but had " + string.charAt(uVar.f2720b - 1) + " instead", 0, null, 6);
        throw null;
    }
}
