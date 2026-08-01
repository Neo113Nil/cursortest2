package r8;

import java.util.Date;
import java.util.HashMap;
import p8.f;
import p8.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements q8.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f8215f;
    public static final b g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8217a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8218b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8219c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8220d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f8214e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f8216h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [r8.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [r8.b] */
    static {
        final int i3 = 0;
        f8215f = new f() { // from class: r8.b
            @Override // p8.a
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        g = new f() { // from class: r8.b
            @Override // p8.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
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
        this.f8217a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f8218b = hashMap2;
        this.f8219c = f8214e;
        this.f8220d = false;
        hashMap2.put(String.class, f8215f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f8216h);
        hashMap.remove(Date.class);
    }

    public final q8.a a(Class cls, p8.d dVar) {
        this.f8217a.put(cls, dVar);
        this.f8218b.remove(cls);
        return this;
    }
}
