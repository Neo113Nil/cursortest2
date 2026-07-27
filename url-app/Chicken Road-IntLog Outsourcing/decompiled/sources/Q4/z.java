package Q4;

import P4.T;
import g4.C0471p;
import java.util.List;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class z implements N4.e {

    /* renamed from: b, reason: collision with root package name */
    public static final z f2564b = new z();

    /* renamed from: c, reason: collision with root package name */
    public static final String f2565c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P4.A f2566a;

    public z() {
        T t5 = T.f2344a;
        p pVar = p.f2552a;
        T t6 = T.f2344a;
        p pVar2 = p.f2552a;
        this.f2566a = new P4.A(T.f2345b, p.f2553b);
    }

    @Override // N4.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return this.f2566a.a(name);
    }

    @Override // N4.e
    public final String b() {
        return f2565c;
    }

    @Override // N4.e
    public final AbstractC1341c c() {
        this.f2566a.getClass();
        return N4.j.f2192d;
    }

    @Override // N4.e
    public final int d() {
        this.f2566a.getClass();
        return 2;
    }

    @Override // N4.e
    public final String e(int i2) {
        this.f2566a.getClass();
        return String.valueOf(i2);
    }

    @Override // N4.e
    public final void f() {
        this.f2566a.getClass();
    }

    @Override // N4.e
    public final List g(int i2) {
        this.f2566a.g(i2);
        return C0471p.f5750a;
    }

    @Override // N4.e
    public final List getAnnotations() {
        this.f2566a.getClass();
        return C0471p.f5750a;
    }

    @Override // N4.e
    public final N4.e h(int i2) {
        return this.f2566a.h(i2);
    }

    @Override // N4.e
    public final boolean i(int i2) {
        this.f2566a.i(i2);
        return false;
    }

    @Override // N4.e
    public final boolean isInline() {
        this.f2566a.getClass();
        return false;
    }
}
