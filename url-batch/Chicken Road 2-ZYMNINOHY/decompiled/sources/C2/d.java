package C2;

import A2.f;
import A2.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements B2.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f266f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f267g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f269a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f270b;

    /* renamed from: c, reason: collision with root package name */
    public final a f271c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f272d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f265e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f268h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [C2.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [C2.b] */
    static {
        final int i4 = 0;
        f266f = new f() { // from class: C2.b
            @Override // A2.a
            public final void a(Object obj, Object obj2) {
                switch (i4) {
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
        f267g = new f() { // from class: C2.b
            @Override // A2.a
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
        this.f269a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f270b = hashMap2;
        this.f271c = f265e;
        this.f272d = false;
        hashMap2.put(String.class, f266f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f267g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f268h);
        hashMap.remove(Date.class);
    }

    public final B2.a a(Class cls, A2.d dVar) {
        this.f269a.put(cls, dVar);
        this.f270b.remove(cls);
        return this;
    }
}
