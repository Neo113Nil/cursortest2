package h8;

import D.y;
import i8.r;
import i8.s;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38252e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, String str) {
        super(str);
        this.f38253f = sVar;
    }

    @Override // h8.a
    public final long a() {
        r rVar;
        long j9;
        switch (this.f38252e) {
            case 0:
                ((E7.a) this.f38253f).invoke();
                return -1L;
            default:
                s sVar = (s) this.f38253f;
                long nanoTime = System.nanoTime();
                Map map = sVar.f38425c;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    throw y.h(it);
                }
                Iterator it2 = sVar.f38428f.iterator();
                h.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    if (map.get(((r) it2.next()).f38408d.f37540a) != null) {
                        throw new ClassCastException();
                    }
                }
                long j10 = (nanoTime - sVar.f38424b) + 1;
                Iterator it3 = sVar.f38428f.iterator();
                h.d(it3, "iterator(...)");
                int i = 0;
                long j11 = Long.MAX_VALUE;
                r rVar2 = null;
                r rVar3 = null;
                int i4 = 0;
                while (it3.hasNext()) {
                    r rVar4 = (r) it3.next();
                    h.b(rVar4);
                    synchronized (rVar4) {
                        if (sVar.a(rVar4, nanoTime) > 0) {
                            i4++;
                            j9 = nanoTime;
                        } else {
                            int i9 = i;
                            long j12 = rVar4.f38422s;
                            if (j12 < j10) {
                                j10 = j12;
                                rVar2 = rVar4;
                            }
                            j9 = nanoTime;
                            if (map.get(rVar4.f38408d.f37540a) != null) {
                                throw new ClassCastException();
                            }
                            int i10 = i9 + 1;
                            if (j12 < j11) {
                                j11 = j12;
                                rVar3 = rVar4;
                            }
                            i = i10;
                        }
                    }
                    nanoTime = j9;
                }
                long j13 = nanoTime;
                int i11 = i;
                if (rVar2 != null) {
                    rVar = rVar2;
                } else if (i11 > 5) {
                    j10 = j11;
                    rVar = rVar3;
                } else {
                    j10 = -1;
                    rVar = null;
                }
                if (rVar == null) {
                    if (rVar3 != null) {
                        return (j11 + sVar.f38424b) - j13;
                    }
                    if (i4 > 0) {
                        return sVar.f38424b;
                    }
                    return -1L;
                }
                synchronized (rVar) {
                    if (rVar.f38421r.isEmpty() && rVar.f38422s == j10) {
                        rVar.f38415l = true;
                        sVar.f38428f.remove(rVar);
                        if (map.get(rVar.f38408d.f37540a) != null) {
                            throw new ClassCastException();
                        }
                        f8.d.c(rVar.f38410f);
                        if (sVar.f38428f.isEmpty()) {
                            sVar.f38426d.a();
                        }
                    }
                }
                return 0L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, E7.a aVar) {
        super(str);
        this.f38253f = aVar;
    }
}
