package r0;

import F.C0047j0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: r0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845s implements B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f7170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f7171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f7173e;

    public /* synthetic */ C0845s(B b2, w wVar, int i3, B b3, int i4) {
        this.f7169a = i4;
        this.f7171c = wVar;
        this.f7172d = i3;
        this.f7173e = b3;
        this.f7170b = b2;
    }

    @Override // r0.B
    public final int f() {
        switch (this.f7169a) {
        }
        return this.f7170b.f();
    }

    @Override // r0.B
    public final int h() {
        switch (this.f7169a) {
        }
        return this.f7170b.h();
    }

    @Override // r0.B
    public final Map i() {
        switch (this.f7169a) {
        }
        return this.f7170b.i();
    }

    @Override // r0.B
    public final void j() {
        switch (this.f7169a) {
            case 0:
                w wVar = this.f7171c;
                wVar.f7182h = this.f7172d;
                this.f7173e.j();
                Set entrySet = wVar.f7189o.entrySet();
                C0047j0 c0047j0 = new C0047j0(27, wVar);
                Z1.i.f(entrySet, "<this>");
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    if (((Boolean) c0047j0.j(it.next())).booleanValue()) {
                        it.remove();
                    }
                }
                break;
            default:
                w wVar2 = this.f7171c;
                wVar2.f7181g = this.f7172d;
                this.f7173e.j();
                wVar2.d(wVar2.f7181g);
                break;
        }
    }

    @Override // r0.B
    public final Y1.c k() {
        switch (this.f7169a) {
        }
        return this.f7170b.k();
    }
}
