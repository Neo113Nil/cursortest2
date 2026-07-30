package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.l1.p;
import com.crrepa.l1.w;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    private static final p f13502c = b((com.crrepa.l1.m) w.f13263a);

    /* renamed from: a, reason: collision with root package name */
    private final com.crrepa.l1.e f13503a;

    /* renamed from: b, reason: collision with root package name */
    private final com.crrepa.l1.m f13504b;

    class a implements p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.crrepa.l1.m f13505a;

        a(com.crrepa.l1.m mVar) {
            this.f13505a = mVar;
        }

        @Override // com.crrepa.l1.p
        public <T> n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            a aVar2 = null;
            if (aVar.a() == Object.class) {
                return new j(eVar, this.f13505a, aVar2);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13506a;

        static {
            int[] iArr = new int[com.crrepa.t1.c.values().length];
            f13506a = iArr;
            try {
                iArr[com.crrepa.t1.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13506a[com.crrepa.t1.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13506a[com.crrepa.t1.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13506a[com.crrepa.t1.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13506a[com.crrepa.t1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13506a[com.crrepa.t1.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private j(com.crrepa.l1.e eVar, com.crrepa.l1.m mVar) {
        this.f13503a = eVar;
        this.f13504b = mVar;
    }

    public static p a(com.crrepa.l1.m mVar) {
        return mVar == w.f13263a ? f13502c : b(mVar);
    }

    private static p b(com.crrepa.l1.m mVar) {
        return new a(mVar);
    }

    /* synthetic */ j(com.crrepa.l1.e eVar, com.crrepa.l1.m mVar, a aVar) {
        this(eVar, mVar);
    }

    @Override // com.crrepa.l1.n
    public Object a(com.crrepa.t1.a aVar) {
        switch (b.f13506a[aVar.t().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.i()) {
                    arrayList.add(a(aVar));
                }
                aVar.f();
                return arrayList;
            case 2:
                com.crrepa.n1.j jVar = new com.crrepa.n1.j();
                aVar.b();
                while (aVar.i()) {
                    jVar.put(aVar.p(), a(aVar));
                }
                aVar.g();
                return jVar;
            case 3:
                return aVar.r();
            case 4:
                return this.f13504b.a(aVar);
            case 5:
                return Boolean.valueOf(aVar.l());
            case 6:
                aVar.q();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.crrepa.l1.n
    public void a(com.crrepa.t1.b bVar, Object obj) {
        if (obj == null) {
            bVar.k();
            return;
        }
        n a8 = this.f13503a.a((Class) obj.getClass());
        if (!(a8 instanceof j)) {
            a8.a(bVar, obj);
        } else {
            bVar.d();
            bVar.f();
        }
    }
}
