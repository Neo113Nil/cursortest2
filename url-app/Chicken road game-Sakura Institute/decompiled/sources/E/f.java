package E;

import Z2.InterfaceC0330f;
import java.util.LinkedHashMap;
import p.C0935k;
import p.InterfaceC0934j;

/* loaded from: classes.dex */
public final class f implements InterfaceC0934j {

    /* renamed from: a, reason: collision with root package name */
    public final long f2187a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2188b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final e f2189c;

    public f(C0935k c0935k, long j4) {
        this.f2187a = j4;
        this.f2189c = new e(c0935k.f8972a, 0, this);
    }

    @Override // p.InterfaceC0934j
    public final InterfaceC0330f a() {
        return this.f2189c;
    }
}
