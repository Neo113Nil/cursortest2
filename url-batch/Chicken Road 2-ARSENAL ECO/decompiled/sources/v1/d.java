package v1;

import java.util.Date;
import java.util.HashMap;
import t1.InterfaceC0657d;
import t1.InterfaceC0659f;
import t1.InterfaceC0660g;
import u1.InterfaceC0690a;

/* loaded from: classes.dex */
public final class d implements InterfaceC0690a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0704b f6110f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0704b f6111g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6113a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6114b;

    /* renamed from: c, reason: collision with root package name */
    public final C0703a f6115c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6116d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0703a f6109e = new C0703a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f6112h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [v1.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [v1.b] */
    static {
        final int i7 = 0;
        f6110f = new InterfaceC0659f() { // from class: v1.b
            @Override // t1.InterfaceC0654a
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        ((InterfaceC0660g) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC0660g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i8 = 1;
        f6111g = new InterfaceC0659f() { // from class: v1.b
            @Override // t1.InterfaceC0654a
            public final void a(Object obj, Object obj2) {
                switch (i8) {
                    case 0:
                        ((InterfaceC0660g) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC0660g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f6113a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f6114b = hashMap2;
        this.f6115c = f6109e;
        this.f6116d = false;
        hashMap2.put(String.class, f6110f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f6111g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f6112h);
        hashMap.remove(Date.class);
    }

    public final InterfaceC0690a a(Class cls, InterfaceC0657d interfaceC0657d) {
        this.f6113a.put(cls, interfaceC0657d);
        this.f6114b.remove(cls);
        return this;
    }
}
