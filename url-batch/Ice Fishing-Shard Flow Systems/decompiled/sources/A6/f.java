package A6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z6.C1062b;

/* loaded from: classes.dex */
public final class f implements x6.e {

    /* renamed from: b, reason: collision with root package name */
    public static final f f101b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final String f102c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1062b f103a;

    public f() {
        p elementSerializer = p.f131a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        p element = p.f131a;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        x6.f elementDesc = p.f132b;
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f103a = new C1062b(elementDesc);
    }

    @Override // x6.e
    public final int a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f103a.a(name);
    }

    @Override // x6.e
    public final String b() {
        return f102c;
    }

    @Override // x6.e
    public final V6.b c() {
        this.f103a.getClass();
        return x6.i.f8443c;
    }

    @Override // x6.e
    public final int d() {
        this.f103a.getClass();
        return 1;
    }

    @Override // x6.e
    public final String e(int i2) {
        this.f103a.getClass();
        return String.valueOf(i2);
    }

    @Override // x6.e
    public final boolean f() {
        this.f103a.getClass();
        return false;
    }

    @Override // x6.e
    public final void g() {
        this.f103a.getClass();
    }

    @Override // x6.e
    public final List getAnnotations() {
        this.f103a.getClass();
        return kotlin.collections.A.f6115d;
    }

    @Override // x6.e
    public final List h(int i2) {
        return this.f103a.h(i2);
    }

    @Override // x6.e
    public final x6.e i(int i2) {
        return this.f103a.i(i2);
    }

    @Override // x6.e
    public final boolean j(int i2) {
        this.f103a.j(i2);
        return false;
    }
}
