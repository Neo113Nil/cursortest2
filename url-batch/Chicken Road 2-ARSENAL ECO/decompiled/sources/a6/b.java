package a6;

import b6.r;
import b6.s;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3164e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3165f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, String str) {
        super(str);
        this.f3165f = sVar;
    }

    @Override // a6.a
    public final long a() {
        r rVar;
        long j4;
        switch (this.f3164e) {
            case 0:
                ((InterfaceC0732a) this.f3165f).invoke();
                return -1L;
            default:
                s sVar = (s) this.f3165f;
                long nanoTime = System.nanoTime();
                Map map = sVar.f3716c;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                Iterator it2 = sVar.f3719f.iterator();
                i.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    if (map.get(((r) it2.next()).f3698d.f3079a) != null) {
                        throw new ClassCastException();
                    }
                }
                long j7 = (nanoTime - sVar.f3715b) + 1;
                Iterator it3 = sVar.f3719f.iterator();
                i.d(it3, "iterator(...)");
                int i7 = 0;
                long j8 = Long.MAX_VALUE;
                r rVar2 = null;
                r rVar3 = null;
                int i8 = 0;
                while (it3.hasNext()) {
                    r rVar4 = (r) it3.next();
                    i.b(rVar4);
                    synchronized (rVar4) {
                        if (sVar.a(rVar4, nanoTime) > 0) {
                            i8++;
                            j4 = nanoTime;
                        } else {
                            int i9 = i8;
                            long j9 = rVar4.f3713s;
                            if (j9 < j7) {
                                j7 = j9;
                                rVar2 = rVar4;
                            }
                            j4 = nanoTime;
                            if (map.get(rVar4.f3698d.f3079a) != null) {
                                throw new ClassCastException();
                            }
                            i7++;
                            if (j9 < j8) {
                                j8 = j9;
                                rVar3 = rVar4;
                            }
                            i8 = i9;
                        }
                    }
                    nanoTime = j4;
                }
                long j10 = nanoTime;
                int i10 = i8;
                if (rVar2 != null) {
                    rVar = rVar2;
                } else if (i7 > 5) {
                    j7 = j8;
                    rVar = rVar3;
                } else {
                    j7 = -1;
                    rVar = null;
                }
                if (rVar == null) {
                    if (rVar3 != null) {
                        return (j8 + sVar.f3715b) - j10;
                    }
                    if (i10 > 0) {
                        return sVar.f3715b;
                    }
                    return -1L;
                }
                synchronized (rVar) {
                    if (rVar.f3712r.isEmpty() && rVar.f3713s == j7) {
                        rVar.f3706l = true;
                        sVar.f3719f.remove(rVar);
                        if (map.get(rVar.f3698d.f3079a) != null) {
                            throw new ClassCastException();
                        }
                        Y5.e.c(rVar.f3700f);
                        if (sVar.f3719f.isEmpty()) {
                            sVar.f3717d.a();
                        }
                    }
                }
                return 0L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, InterfaceC0732a interfaceC0732a) {
        super(str);
        this.f3165f = interfaceC0732a;
    }
}
