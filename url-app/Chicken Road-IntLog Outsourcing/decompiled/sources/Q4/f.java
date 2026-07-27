package Q4;

import P4.C0123b;
import g4.C0471p;
import java.util.List;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class f implements N4.e {

    /* renamed from: b, reason: collision with root package name */
    public static final f f2505b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final String f2506c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0123b f2507a;

    public f() {
        p pVar = p.f2552a;
        p pVar2 = p.f2552a;
        N4.f elementDesc = p.f2553b;
        kotlin.jvm.internal.i.e(elementDesc, "elementDesc");
        this.f2507a = new C0123b(elementDesc);
    }

    @Override // N4.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return this.f2507a.a(name);
    }

    @Override // N4.e
    public final String b() {
        return f2506c;
    }

    @Override // N4.e
    public final AbstractC1341c c() {
        this.f2507a.getClass();
        return N4.j.f2191c;
    }

    @Override // N4.e
    public final int d() {
        this.f2507a.getClass();
        return 1;
    }

    @Override // N4.e
    public final String e(int i2) {
        this.f2507a.getClass();
        return String.valueOf(i2);
    }

    @Override // N4.e
    public final void f() {
        this.f2507a.getClass();
    }

    @Override // N4.e
    public final List g(int i2) {
        this.f2507a.g(i2);
        return C0471p.f5750a;
    }

    @Override // N4.e
    public final List getAnnotations() {
        this.f2507a.getClass();
        return C0471p.f5750a;
    }

    @Override // N4.e
    public final N4.e h(int i2) {
        return this.f2507a.h(i2);
    }

    @Override // N4.e
    public final boolean i(int i2) {
        this.f2507a.i(i2);
        return false;
    }

    @Override // N4.e
    public final boolean isInline() {
        this.f2507a.getClass();
        return false;
    }
}
