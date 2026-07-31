package u;

import java.util.ArrayList;

/* loaded from: classes.dex */
class k {

    /* renamed from: h, reason: collision with root package name */
    public static int f46347h;

    /* renamed from: c, reason: collision with root package name */
    m f46350c;

    /* renamed from: d, reason: collision with root package name */
    m f46351d;

    /* renamed from: f, reason: collision with root package name */
    int f46353f;

    /* renamed from: g, reason: collision with root package name */
    int f46354g;

    /* renamed from: a, reason: collision with root package name */
    public int f46348a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46349b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f46352e = new ArrayList();

    public k(m mVar, int i4) {
        this.f46350c = null;
        this.f46351d = null;
        int i5 = f46347h;
        this.f46353f = i5;
        f46347h = i5 + 1;
        this.f46350c = mVar;
        this.f46351d = mVar;
        this.f46354g = i4;
    }

    private long c(C3451f c3451f, long j4) {
        m mVar = c3451f.f46326d;
        if (mVar instanceof i) {
            return j4;
        }
        int size = c3451f.f46333k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC3449d interfaceC3449d = (InterfaceC3449d) c3451f.f46333k.get(i4);
            if (interfaceC3449d instanceof C3451f) {
                C3451f c3451f2 = (C3451f) interfaceC3449d;
                if (c3451f2.f46326d != mVar) {
                    j5 = Math.min(j5, c(c3451f2, c3451f2.f46328f + j4));
                }
            }
        }
        if (c3451f != mVar.f46366i) {
            return j5;
        }
        long j6 = j4 - mVar.j();
        return Math.min(Math.min(j5, c(mVar.f46365h, j6)), j6 - mVar.f46365h.f46328f);
    }

    private long d(C3451f c3451f, long j4) {
        m mVar = c3451f.f46326d;
        if (mVar instanceof i) {
            return j4;
        }
        int size = c3451f.f46333k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC3449d interfaceC3449d = (InterfaceC3449d) c3451f.f46333k.get(i4);
            if (interfaceC3449d instanceof C3451f) {
                C3451f c3451f2 = (C3451f) interfaceC3449d;
                if (c3451f2.f46326d != mVar) {
                    j5 = Math.max(j5, d(c3451f2, c3451f2.f46328f + j4));
                }
            }
        }
        if (c3451f != mVar.f46365h) {
            return j5;
        }
        long j6 = j4 + mVar.j();
        return Math.max(Math.max(j5, d(mVar.f46366i, j6)), j6 - mVar.f46366i.f46328f);
    }

    public void a(m mVar) {
        this.f46352e.add(mVar);
        this.f46351d = mVar;
    }

    public long b(t.f fVar, int i4) {
        long j4;
        int i5;
        m mVar = this.f46350c;
        if (mVar instanceof C3448c) {
            if (((C3448c) mVar).f46363f != i4) {
                return 0L;
            }
        } else if (i4 == 0) {
            if (!(mVar instanceof j)) {
                return 0L;
            }
        } else if (!(mVar instanceof l)) {
            return 0L;
        }
        C3451f c3451f = (i4 == 0 ? fVar.f46118e : fVar.f46120f).f46365h;
        C3451f c3451f2 = (i4 == 0 ? fVar.f46118e : fVar.f46120f).f46366i;
        boolean contains = mVar.f46365h.f46334l.contains(c3451f);
        boolean contains2 = this.f46350c.f46366i.f46334l.contains(c3451f2);
        long j5 = this.f46350c.j();
        if (contains && contains2) {
            long d4 = d(this.f46350c.f46365h, 0L);
            long c4 = c(this.f46350c.f46366i, 0L);
            long j6 = d4 - j5;
            m mVar2 = this.f46350c;
            int i6 = mVar2.f46366i.f46328f;
            if (j6 >= (-i6)) {
                j6 += i6;
            }
            int i7 = mVar2.f46365h.f46328f;
            long j7 = ((-c4) - j5) - i7;
            if (j7 >= i7) {
                j7 -= i7;
            }
            float m4 = mVar2.f46359b.m(i4);
            float f4 = m4 > 0.0f ? (long) ((j7 / m4) + (j6 / (1.0f - m4))) : 0L;
            long j8 = ((long) ((f4 * m4) + 0.5f)) + j5 + ((long) ((f4 * (1.0f - m4)) + 0.5f));
            j4 = r12.f46365h.f46328f + j8;
            i5 = this.f46350c.f46366i.f46328f;
        } else {
            if (contains) {
                return Math.max(d(this.f46350c.f46365h, r12.f46328f), this.f46350c.f46365h.f46328f + j5);
            }
            if (contains2) {
                return Math.max(-c(this.f46350c.f46366i, r12.f46328f), (-this.f46350c.f46366i.f46328f) + j5);
            }
            j4 = r12.f46365h.f46328f + this.f46350c.j();
            i5 = this.f46350c.f46366i.f46328f;
        }
        return j4 - i5;
    }
}
