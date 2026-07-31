package H4;

import D0.h;
import D4.f;
import I4.d;
import I4.e;
import M5.v;
import O4.c;
import X5.k;
import X5.o;
import X5.q;
import X5.s;
import b6.n;
import f4.AbstractC0378e;
import f4.C0374a;
import f4.InterfaceC0379f;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.jvm.internal.i;
import u0.C0673c;
import u0.C0675e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4.b f1018a;

    public /* synthetic */ a(C4.b bVar) {
        this.f1018a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        r12 = r2;
     */
    @Override // java.util.function.BiFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj, Object obj2) {
        C0374a c0374a;
        C4.b bVar = this.f1018a;
        f fVar = (f) obj;
        int intValue = ((Integer) obj2).intValue();
        if (bVar.f206b.get()) {
            return c.f1788f;
        }
        C0673c c0673c = new C0673c(((E4.b) bVar.f209e.f401g).a(intValue));
        c cVar = new c();
        e eVar = bVar.f208d;
        int a7 = fVar.a();
        C4.a aVar = new C4.a(bVar, cVar, c0673c, 0);
        C4.a aVar2 = new C4.a(bVar, cVar, c0673c, 1);
        eVar.getClass();
        A.e eVar2 = new A.e();
        o url = (o) eVar.f1211c;
        i.e(url, "url");
        eVar2.f8h = url;
        ((Map) ((C4.e) eVar.f1212d).get()).forEach(new I4.a(0, eVar2));
        eVar2.i("POST", new d(fVar, a7, (q) eVar.f1213e));
        C0374a a8 = C0374a.a();
        v vVar = a4.d.f3138a;
        Boolean bool = Boolean.TRUE;
        int i7 = 0;
        while (true) {
            Object[] objArr = a8.f4223a;
            if (i7 >= objArr.length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = vVar;
                copyOf[copyOf.length - 1] = bool;
                c0374a = new C0374a(copyOf);
                break;
            }
            if (objArr[i7] == vVar) {
                int i8 = i7 + 1;
                if (objArr[i8] != bool) {
                    Object[] objArr2 = (Object[]) objArr.clone();
                    objArr2[i8] = bool;
                    c0374a = new C0374a(objArr2);
                }
            } else {
                i7 += 2;
            }
        }
        InterfaceC0379f a9 = AbstractC0378e.f4227b.a(a8);
        try {
            s sVar = (s) eVar.f1210b;
            h hVar = new h(eVar2);
            sVar.getClass();
            b6.q qVar = new b6.q(sVar, hVar);
            C0675e c0675e = new C0675e(aVar2, 3, aVar);
            if (!qVar.f3684j.compareAndSet(false, true)) {
                throw new IllegalStateException("Already Executed");
            }
            h6.e eVar3 = h6.e.f4355a;
            qVar.f3685k = h6.e.f4355a.h();
            k kVar = sVar.f3011a;
            n nVar = new n(qVar, c0675e);
            kVar.getClass();
            k.c(kVar, nVar, null, 6);
            a9.close();
            return cVar;
        } catch (Throwable th) {
            try {
                a9.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
