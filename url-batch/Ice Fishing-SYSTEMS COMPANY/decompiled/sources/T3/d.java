package T3;

import R3.f;
import R3.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d implements S3.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f3104f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f3105g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3107a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3108b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3109c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3110d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3103e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f3106h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [T3.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T3.b] */
    static {
        final int i = 0;
        f3104f = new f() { // from class: T3.b
            @Override // R3.a
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        break;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i4 = 1;
        f3105g = new f() { // from class: T3.b
            @Override // R3.a
            public final void a(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        break;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f3107a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f3108b = hashMap2;
        this.f3109c = f3103e;
        this.f3110d = false;
        hashMap2.put(String.class, f3104f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f3105g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f3106h);
        hashMap.remove(Date.class);
    }

    public final S3.a a(Class cls, R3.d dVar) {
        this.f3107a.put(cls, dVar);
        this.f3108b.remove(cls);
        return this;
    }
}
