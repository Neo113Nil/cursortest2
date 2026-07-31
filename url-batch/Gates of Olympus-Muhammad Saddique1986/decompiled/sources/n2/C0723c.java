package n2;

import e2.InterfaceC0426e;
import java.util.Iterator;
import m2.InterfaceC0656f;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723c implements InterfaceC0656f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7356a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7358c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.k f7359d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0723c(String str, int i3, int i4, InterfaceC0426e interfaceC0426e) {
        f2.j.f(str, "input");
        this.f7356a = str;
        this.f7357b = i3;
        this.f7358c = i4;
        this.f7359d = (f2.k) interfaceC0426e;
    }

    @Override // m2.InterfaceC0656f
    public final Iterator iterator() {
        return new C0722b(this);
    }
}
