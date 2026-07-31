package A0;

import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f194a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0426e f195b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f196c;

    public v(String str, InterfaceC0426e interfaceC0426e) {
        this.f194a = str;
        this.f195b = interfaceC0426e;
    }

    public final void a(i iVar, Object obj) {
        iVar.c(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f194a;
    }

    public /* synthetic */ v(String str) {
        this(str, r.f159q);
    }

    public v(String str, boolean z3, InterfaceC0426e interfaceC0426e) {
        this(str, interfaceC0426e);
        this.f196c = z3;
    }
}
