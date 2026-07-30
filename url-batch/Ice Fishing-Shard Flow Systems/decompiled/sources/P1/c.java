package P1;

import D6.z;
import android.content.Context;
import b2.InterfaceC0271b;
import c2.l;
import e2.InterfaceC0372a;
import j2.C0569a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0372a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2263c;

    public /* synthetic */ c(Context context, String str) {
        this.f2261a = 2;
        this.f2263c = context;
        this.f2262b = str;
    }

    @Override // e2.InterfaceC0372a
    public final Object get() {
        switch (this.f2261a) {
            case 0:
                g gVar = (g) this.f2262b;
                return new C0569a((Context) this.f2263c, gVar.g(), (InterfaceC0271b) gVar.f2273d.a(InterfaceC0271b.class));
            case 1:
                S1.g gVar2 = (S1.g) this.f2262b;
                S1.b bVar = (S1.b) this.f2263c;
                return bVar.f2470f.c(new z(bVar, gVar2));
            default:
                return new l((Context) this.f2263c, (String) this.f2262b);
        }
    }

    public /* synthetic */ c(Object obj, int i2, Object obj2) {
        this.f2261a = i2;
        this.f2262b = obj;
        this.f2263c = obj2;
    }
}
