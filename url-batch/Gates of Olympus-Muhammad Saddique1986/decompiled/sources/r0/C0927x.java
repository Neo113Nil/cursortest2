package r0;

import e2.InterfaceC0424c;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: r0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927x implements InterfaceC0886H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0886H f8192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0881C f8193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0886H f8195e;

    public /* synthetic */ C0927x(InterfaceC0886H interfaceC0886H, C0881C c0881c, int i3, InterfaceC0886H interfaceC0886H2, int i4) {
        this.f8191a = i4;
        this.f8193c = c0881c;
        this.f8194d = i3;
        this.f8195e = interfaceC0886H2;
        this.f8192b = interfaceC0886H;
    }

    @Override // r0.InterfaceC0886H
    public final int f() {
        switch (this.f8191a) {
        }
        return this.f8192b.f();
    }

    @Override // r0.InterfaceC0886H
    public final int h() {
        switch (this.f8191a) {
        }
        return this.f8192b.h();
    }

    @Override // r0.InterfaceC0886H
    public final Map i() {
        switch (this.f8191a) {
        }
        return this.f8192b.i();
    }

    @Override // r0.InterfaceC0886H
    public final void j() {
        switch (this.f8191a) {
            case 0:
                C0881C c0881c = this.f8193c;
                c0881c.f8104h = this.f8194d;
                this.f8195e.j();
                Set entrySet = c0881c.f8111o.entrySet();
                C0929z c0929z = new C0929z(0, c0881c);
                f2.j.f(entrySet, "<this>");
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    if (((Boolean) c0929z.n(it.next())).booleanValue()) {
                        it.remove();
                    }
                }
                break;
            default:
                C0881C c0881c2 = this.f8193c;
                c0881c2.f8103g = this.f8194d;
                this.f8195e.j();
                c0881c2.d(c0881c2.f8103g);
                break;
        }
    }

    @Override // r0.InterfaceC0886H
    public final InterfaceC0424c k() {
        switch (this.f8191a) {
        }
        return this.f8192b.k();
    }
}
