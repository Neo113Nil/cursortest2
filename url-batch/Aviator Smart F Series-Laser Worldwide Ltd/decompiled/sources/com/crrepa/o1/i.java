package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.l1.p;
import com.crrepa.l1.u;
import com.crrepa.l1.w;

/* loaded from: classes3.dex */
public final class i extends n {

    /* renamed from: b, reason: collision with root package name */
    private static final p f13498b = b((com.crrepa.l1.m) w.f13264b);

    /* renamed from: a, reason: collision with root package name */
    private final com.crrepa.l1.m f13499a;

    class a implements p {
        a() {
        }

        @Override // com.crrepa.l1.p
        public <T> n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            if (aVar.a() == Number.class) {
                return i.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13501a;

        static {
            int[] iArr = new int[com.crrepa.t1.c.values().length];
            f13501a = iArr;
            try {
                iArr[com.crrepa.t1.c.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13501a[com.crrepa.t1.c.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13501a[com.crrepa.t1.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private i(com.crrepa.l1.m mVar) {
        this.f13499a = mVar;
    }

    public static p a(com.crrepa.l1.m mVar) {
        return mVar == w.f13264b ? f13498b : b(mVar);
    }

    private static p b(com.crrepa.l1.m mVar) {
        return new i(mVar).new a();
    }

    @Override // com.crrepa.l1.n
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Number a(com.crrepa.t1.a aVar) {
        com.crrepa.t1.c t7 = aVar.t();
        int i8 = b.f13501a[t7.ordinal()];
        if (i8 == 1) {
            aVar.q();
            return null;
        }
        if (i8 == 2 || i8 == 3) {
            return this.f13499a.a(aVar);
        }
        throw new u("Expecting number, got: " + t7);
    }

    @Override // com.crrepa.l1.n
    public void a(com.crrepa.t1.b bVar, Number number) {
        bVar.a(number);
    }
}
