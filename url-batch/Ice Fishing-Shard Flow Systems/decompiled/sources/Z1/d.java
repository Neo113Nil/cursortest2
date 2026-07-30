package Z1;

import X1.f;
import X1.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f3013f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f3014g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3016a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3017b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3018c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3019d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3012e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f3015h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [Z1.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Z1.b] */
    static {
        final int i2 = 0;
        f3013f = new f() { // from class: Z1.b
            @Override // X1.a
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i5 = 1;
        f3014g = new f() { // from class: Z1.b
            @Override // X1.a
            public final void a(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f3016a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f3017b = hashMap2;
        this.f3018c = f3012e;
        this.f3019d = false;
        hashMap2.put(String.class, f3013f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f3014g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f3015h);
        hashMap.remove(Date.class);
    }

    public final Y1.a a(Class cls, X1.d dVar) {
        this.f3016a.put(cls, dVar);
        this.f3017b.remove(cls);
        return this;
    }
}
