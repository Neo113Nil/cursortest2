package W4;

import U4.e;
import X4.s;
import X4.t;
import a5.i;
import java.util.Iterator;
import java.util.Map;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3424e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t tVar, String str) {
        super(str, true);
        this.f3425f = tVar;
    }

    @Override // W4.a
    public final long a() {
        long j2;
        switch (this.f3424e) {
            case 0:
                ((InterfaceC1430a) this.f3425f).invoke();
                return -1L;
            case 1:
                return ((Number) ((i) this.f3425f).invoke()).longValue();
            default:
                t tVar = (t) this.f3425f;
                long nanoTime = System.nanoTime();
                Map map = tVar.f3627d;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                Iterator it2 = tVar.f3630g.iterator();
                kotlin.jvm.internal.i.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    if (map.get(((s) it2.next()).f3607d.f2805a) != null) {
                        throw new ClassCastException();
                    }
                }
                long j6 = (nanoTime - tVar.f3626c) + 1;
                Iterator it3 = tVar.f3630g.iterator();
                kotlin.jvm.internal.i.d(it3, "iterator(...)");
                int i2 = 0;
                long j7 = Long.MAX_VALUE;
                s sVar = null;
                s sVar2 = null;
                int i3 = 0;
                while (it3.hasNext()) {
                    s sVar3 = (s) it3.next();
                    kotlin.jvm.internal.i.b(sVar3);
                    synchronized (sVar3) {
                        if (tVar.a(sVar3, nanoTime) > 0) {
                            i3++;
                        } else {
                            int i6 = i2;
                            long j8 = sVar3.f3623t;
                            if (j8 < j6) {
                                j2 = j8;
                                sVar = sVar3;
                            } else {
                                j2 = j6;
                            }
                            if (map.get(sVar3.f3607d.f2805a) != null) {
                                throw new ClassCastException();
                            }
                            int i7 = i6 + 1;
                            if (j8 < j7) {
                                j7 = j8;
                                sVar2 = sVar3;
                            }
                            i2 = i7;
                            j6 = j2;
                        }
                    }
                }
                int i8 = i2;
                if (sVar == null) {
                    if (i8 > tVar.f3624a) {
                        j6 = j7;
                        sVar = sVar2;
                    } else {
                        j6 = -1;
                        sVar = null;
                    }
                }
                if (sVar == null) {
                    if (sVar2 != null) {
                        return (j7 + tVar.f3626c) - nanoTime;
                    }
                    if (i3 > 0) {
                        return tVar.f3626c;
                    }
                    return -1L;
                }
                synchronized (sVar) {
                    if (sVar.f3622s.isEmpty() && sVar.f3623t == j6) {
                        sVar.f3616m = true;
                        tVar.f3630g.remove(sVar);
                        if (map.get(sVar.f3607d.f2805a) != null) {
                            throw new ClassCastException();
                        }
                        e.c(sVar.f3609f);
                        if (!tVar.f3630g.isEmpty()) {
                            return 0L;
                        }
                        tVar.f3628e.a();
                        return 0L;
                    }
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, i iVar) {
        super(str, true);
        this.f3425f = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, boolean z, InterfaceC1430a interfaceC1430a) {
        super(str, z);
        this.f3425f = interfaceC1430a;
    }
}
