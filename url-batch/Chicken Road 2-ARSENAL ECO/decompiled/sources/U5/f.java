package U5;

import T5.C0186b;
import java.util.List;
import l5.C0512p;

/* loaded from: classes.dex */
public final class f implements R5.e {

    /* renamed from: b, reason: collision with root package name */
    public static final f f2639b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final String f2640c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0186b f2641a;

    public f() {
        o oVar = o.f2662a;
        o oVar2 = o.f2662a;
        R5.f elementDesc = o.f2663b;
        kotlin.jvm.internal.i.e(elementDesc, "elementDesc");
        this.f2641a = new C0186b(elementDesc);
    }

    @Override // R5.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return this.f2641a.a(name);
    }

    @Override // R5.e
    public final String b() {
        return f2640c;
    }

    @Override // R5.e
    public final A3.c c() {
        this.f2641a.getClass();
        return R5.i.f2173c;
    }

    @Override // R5.e
    public final int d() {
        this.f2641a.getClass();
        return 1;
    }

    @Override // R5.e
    public final String e(int i7) {
        this.f2641a.getClass();
        return String.valueOf(i7);
    }

    @Override // R5.e
    public final void f() {
        this.f2641a.getClass();
    }

    @Override // R5.e
    public final List g(int i7) {
        this.f2641a.g(i7);
        return C0512p.f5303f;
    }

    @Override // R5.e
    public final List getAnnotations() {
        this.f2641a.getClass();
        return C0512p.f5303f;
    }

    @Override // R5.e
    public final R5.e h(int i7) {
        return this.f2641a.h(i7);
    }

    @Override // R5.e
    public final boolean i(int i7) {
        this.f2641a.i(i7);
        return false;
    }

    @Override // R5.e
    public final boolean isInline() {
        this.f2641a.getClass();
        return false;
    }
}
