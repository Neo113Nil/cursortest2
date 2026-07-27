package T1;

import R1.f;
import R1.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements S1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f2786f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f2787g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2789a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2790b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2791c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2792d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2785e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f2788h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [T1.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T1.b] */
    static {
        final int i2 = 0;
        f2786f = new f() { // from class: T1.b
            @Override // R1.a
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i3 = 1;
        f2787g = new f() { // from class: T1.b
            @Override // R1.a
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f2789a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f2790b = hashMap2;
        this.f2791c = f2785e;
        this.f2792d = false;
        hashMap2.put(String.class, f2786f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f2787g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f2788h);
        hashMap.remove(Date.class);
    }

    public final S1.a a(Class cls, R1.d dVar) {
        this.f2789a.put(cls, dVar);
        this.f2790b.remove(cls);
        return this;
    }
}
