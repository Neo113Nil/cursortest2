package g1;

import e1.InterfaceC0313d;
import e1.InterfaceC0315f;
import e1.InterfaceC0316g;
import f1.InterfaceC0323a;
import java.util.Date;
import java.util.HashMap;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335d implements InterfaceC0323a {
    public static final C0333b f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0333b f5041g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5043a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5044b;

    /* renamed from: c, reason: collision with root package name */
    public final C0332a f5045c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5046d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0332a f5040e = new C0332a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final C0334c f5042h = new C0334c();

    /* JADX WARN: Type inference failed for: r0v1, types: [g1.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [g1.b] */
    static {
        final int i3 = 0;
        f = new InterfaceC0315f() { // from class: g1.b
            @Override // e1.InterfaceC0310a
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((InterfaceC0316g) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC0316g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i4 = 1;
        f5041g = new InterfaceC0315f() { // from class: g1.b
            @Override // e1.InterfaceC0310a
            public final void a(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((InterfaceC0316g) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC0316g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C0335d() {
        HashMap hashMap = new HashMap();
        this.f5043a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f5044b = hashMap2;
        this.f5045c = f5040e;
        this.f5046d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f5041g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f5042h);
        hashMap.remove(Date.class);
    }

    public final InterfaceC0323a a(Class cls, InterfaceC0313d interfaceC0313d) {
        this.f5043a.put(cls, interfaceC0313d);
        this.f5044b.remove(cls);
        return this;
    }
}
