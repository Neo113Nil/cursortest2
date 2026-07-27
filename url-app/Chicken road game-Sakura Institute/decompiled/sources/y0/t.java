package y0;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f11640a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f11641b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11642c;

    public t(String str, Function2 function2) {
        this.f11640a = str;
        this.f11641b = function2;
    }

    public final void a(i iVar, Object obj) {
        iVar.s(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f11640a;
    }

    public /* synthetic */ t(String str) {
        this(str, p.f11604s);
    }

    public t(String str, boolean z4, Function2 function2) {
        this(str, function2);
        this.f11642c = z4;
    }
}
