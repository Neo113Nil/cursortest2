package N6;

import B2.N;
import J6.f;
import O6.d;
import S0.e;
import T7.v;
import U6.c;
import com.google.android.gms.internal.ads.C3112dq;
import e8.o;
import e8.s;
import i8.n;
import i8.q;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.jvm.internal.h;
import l6.AbstractC4698e;
import l6.C4694a;
import l6.InterfaceC4699f;
import q2.C4903n;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I6.b f2194a;

    public /* synthetic */ a(I6.b bVar) {
        this.f2194a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        r13 = r5;
     */
    @Override // java.util.function.BiFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj, Object obj2) {
        C4694a c4694a;
        int i = 6;
        int i4 = 1;
        int i9 = 0;
        f fVar = (f) obj;
        int intValue = ((Integer) obj2).intValue();
        I6.b bVar = this.f2194a;
        if (bVar.f1266b.get()) {
            return c.f3311f;
        }
        e eVar = new e(((K6.b) bVar.f1269e.f37856u).a(intValue));
        c cVar = new c();
        int a9 = fVar.a();
        I6.a aVar = new I6.a(bVar, cVar, eVar, i9);
        I6.a aVar2 = new I6.a(bVar, cVar, eVar, i4);
        O6.e eVar2 = bVar.f1268d;
        eVar2.getClass();
        N n9 = new N();
        o url = eVar2.f2537c;
        h.e(url, "url");
        n9.f196u = url;
        ((Map) eVar2.f2538d.get()).forEach(new O6.a(0, n9));
        n9.p("POST", new d(fVar, a9, eVar2.f2539e));
        C4694a a10 = C4694a.a();
        v vVar = g6.d.f37930a;
        Boolean bool = Boolean.TRUE;
        int i10 = 0;
        while (true) {
            Object[] objArr = a10.f39055a;
            if (i10 >= objArr.length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = vVar;
                copyOf[copyOf.length - 1] = bool;
                c4694a = new C4694a(copyOf);
                break;
            }
            if (objArr[i10] == vVar) {
                int i11 = i10 + 1;
                if (objArr[i11] != bool) {
                    Object[] objArr2 = (Object[]) objArr.clone();
                    objArr2[i11] = bool;
                    c4694a = new C4694a(objArr2);
                }
            } else {
                i10 += 2;
            }
        }
        InterfaceC4699f k6 = AbstractC4698e.f39059b.k(a10);
        try {
            s sVar = eVar2.f2536b;
            C4903n c4903n = new C4903n(n9);
            sVar.getClass();
            q qVar = new q(sVar, c4903n);
            e eVar3 = new e(i, aVar2, aVar);
            if (!qVar.f38403x.compareAndSet(false, true)) {
                throw new IllegalStateException("Already Executed");
            }
            o8.f fVar2 = o8.f.f39739a;
            qVar.f38404y = o8.f.f39739a.h();
            C3112dq c3112dq = sVar.f37473a;
            n nVar = new n(qVar, eVar3);
            c3112dq.getClass();
            C3112dq.j(c3112dq, nVar, null, 6);
            k6.close();
            return cVar;
        } catch (Throwable th) {
            try {
                k6.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
