package C2;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class G0 implements A2.f, InterfaceC0323n {

    /* renamed from: a, reason: collision with root package name */
    private final A2.f f211a;

    /* renamed from: b, reason: collision with root package name */
    private final String f212b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f213c;

    public G0(A2.f original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f211a = original;
        this.f212b = original.a() + '?';
        this.f213c = AbstractC0339v0.a(original);
    }

    @Override // A2.f
    public String a() {
        return this.f212b;
    }

    @Override // C2.InterfaceC0323n
    public Set b() {
        return this.f213c;
    }

    @Override // A2.f
    public boolean c() {
        return true;
    }

    @Override // A2.f
    public int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f211a.d(name);
    }

    @Override // A2.f
    public A2.j e() {
        return this.f211a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G0) && Intrinsics.areEqual(this.f211a, ((G0) obj).f211a);
    }

    @Override // A2.f
    public int f() {
        return this.f211a.f();
    }

    @Override // A2.f
    public String g(int i4) {
        return this.f211a.g(i4);
    }

    @Override // A2.f
    public List getAnnotations() {
        return this.f211a.getAnnotations();
    }

    @Override // A2.f
    public List h(int i4) {
        return this.f211a.h(i4);
    }

    public int hashCode() {
        return this.f211a.hashCode() * 31;
    }

    @Override // A2.f
    public A2.f i(int i4) {
        return this.f211a.i(i4);
    }

    @Override // A2.f
    public boolean isInline() {
        return this.f211a.isInline();
    }

    @Override // A2.f
    public boolean j(int i4) {
        return this.f211a.j(i4);
    }

    public final A2.f k() {
        return this.f211a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f211a);
        sb.append('?');
        return sb.toString();
    }
}
