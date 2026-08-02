package U;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class o implements n {

    /* renamed from: b, reason: collision with root package name */
    public k f3062b;

    /* renamed from: c, reason: collision with root package name */
    public k f3063c;

    /* renamed from: d, reason: collision with root package name */
    public k f3064d;

    /* renamed from: e, reason: collision with root package name */
    public k f3065e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f3066f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f3067g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3068h;

    public o() {
        ByteBuffer byteBuffer = n.f3061a;
        this.f3066f = byteBuffer;
        this.f3067g = byteBuffer;
        k kVar = k.f3054e;
        this.f3064d = kVar;
        this.f3065e = kVar;
        this.f3062b = kVar;
        this.f3063c = kVar;
    }

    @Override // U.n
    public boolean a() {
        return this.f3065e != k.f3054e;
    }

    @Override // U.n
    public boolean b() {
        return this.f3068h && this.f3067g == n.f3061a;
    }

    @Override // U.n
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f3067g;
        this.f3067g = n.f3061a;
        return byteBuffer;
    }

    @Override // U.n
    public final void e() {
        this.f3068h = true;
        j();
    }

    @Override // U.n
    public final k f(k kVar) {
        this.f3064d = kVar;
        this.f3065e = h(kVar);
        return a() ? this.f3065e : k.f3054e;
    }

    @Override // U.n
    public final void flush() {
        this.f3067g = n.f3061a;
        this.f3068h = false;
        this.f3062b = this.f3064d;
        this.f3063c = this.f3065e;
        i();
    }

    public abstract k h(k kVar);

    public final ByteBuffer l(int i4) {
        if (this.f3066f.capacity() < i4) {
            this.f3066f = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
        } else {
            this.f3066f.clear();
        }
        ByteBuffer byteBuffer = this.f3066f;
        this.f3067g = byteBuffer;
        return byteBuffer;
    }

    @Override // U.n
    public final void reset() {
        ByteBuffer byteBuffer = n.f3061a;
        this.f3067g = byteBuffer;
        this.f3068h = false;
        this.f3066f = byteBuffer;
        k kVar = k.f3054e;
        this.f3064d = kVar;
        this.f3065e = kVar;
        this.f3062b = kVar;
        this.f3063c = kVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
