package A6;

import java.util.List;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import z6.U;

/* loaded from: classes.dex */
public final class z implements x6.e {

    /* renamed from: b, reason: collision with root package name */
    public static final z f142b = new z();

    /* renamed from: c, reason: collision with root package name */
    public static final String f143c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z6.A f144a;

    public z() {
        Intrinsics.checkNotNullParameter(H.f6155a, "<this>");
        U u7 = U.f8759a;
        p pVar = p.f131a;
        U keySerializer = U.f8759a;
        p valueSerializer = p.f131a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        U kSerializer = U.f8759a;
        p vSerializer = p.f131a;
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f144a = new z6.A(U.f8760b, p.f132b);
    }

    @Override // x6.e
    public final int a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f144a.a(name);
    }

    @Override // x6.e
    public final String b() {
        return f143c;
    }

    @Override // x6.e
    public final V6.b c() {
        this.f144a.getClass();
        return x6.i.f8444d;
    }

    @Override // x6.e
    public final int d() {
        this.f144a.getClass();
        return 2;
    }

    @Override // x6.e
    public final String e(int i2) {
        this.f144a.getClass();
        return String.valueOf(i2);
    }

    @Override // x6.e
    public final boolean f() {
        this.f144a.getClass();
        return false;
    }

    @Override // x6.e
    public final void g() {
        this.f144a.getClass();
    }

    @Override // x6.e
    public final List getAnnotations() {
        this.f144a.getClass();
        return kotlin.collections.A.f6115d;
    }

    @Override // x6.e
    public final List h(int i2) {
        return this.f144a.h(i2);
    }

    @Override // x6.e
    public final x6.e i(int i2) {
        return this.f144a.i(i2);
    }

    @Override // x6.e
    public final boolean j(int i2) {
        this.f144a.j(i2);
        return false;
    }
}
