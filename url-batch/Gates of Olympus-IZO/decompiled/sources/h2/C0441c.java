package h2;

import g2.InterfaceC0410f;
import java.util.Iterator;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441c implements InterfaceC0410f {

    /* renamed from: a, reason: collision with root package name */
    public final String f5065a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5066b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5067c;

    /* renamed from: d, reason: collision with root package name */
    public final Z1.j f5068d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0441c(String str, int i3, int i4, Y1.e eVar) {
        Z1.i.f(str, "input");
        this.f5065a = str;
        this.f5066b = i3;
        this.f5067c = i4;
        this.f5068d = (Z1.j) eVar;
    }

    @Override // g2.InterfaceC0410f
    public final Iterator iterator() {
        return new C0440b(this);
    }
}
