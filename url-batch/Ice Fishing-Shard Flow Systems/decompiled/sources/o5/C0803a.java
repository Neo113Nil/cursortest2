package o5;

import B.f;
import D6.s;
import D6.u;
import D6.y;
import M4.e;
import P0.c;
import com.appsflyer.internal.o;
import j5.C0583a;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import k5.AbstractC0605e;
import kotlin.jvm.internal.Intrinsics;
import l5.InterfaceC0664b;
import p5.d;
import v5.C0977c;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0803a implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j5.b f7125a;

    public /* synthetic */ C0803a(j5.b bVar) {
        this.f7125a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        r10 = r0;
     */
    @Override // java.util.function.BiFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj, Object obj2) {
        M4.a aVar;
        AbstractC0605e abstractC0605e = (AbstractC0605e) obj;
        int intValue = ((Integer) obj2).intValue();
        j5.b bVar = this.f7125a;
        if (bVar.f5995b.get()) {
            return C0977c.f8230f;
        }
        c cVar = new c(((InterfaceC0664b) bVar.f5998e.f5381e).a(intValue));
        C0977c c0977c = new C0977c();
        d dVar = bVar.f5997d;
        int a7 = abstractC0605e.a();
        C0583a c0583a = new C0583a(bVar, c0977c, cVar, 0);
        C0583a c0583a2 = new C0583a(bVar, c0977c, cVar, 1);
        dVar.getClass();
        y yVar = new y();
        s url = (s) dVar.f7206c;
        Intrinsics.checkNotNullParameter(url, "url");
        yVar.f634e = url;
        ((Map) ((j5.d) dVar.f7207d).get()).forEach(new C4.c(4, yVar));
        p5.c body = new p5.c(abstractC0605e, a7, (u) dVar.f7208e);
        Intrinsics.checkNotNullParameter(body, "body");
        yVar.d("POST", body);
        o oVar = new o(dVar, yVar, c0583a2, c0583a, 1);
        M4.a a8 = M4.a.a();
        Boolean bool = Boolean.TRUE;
        int i2 = 0;
        while (true) {
            Object[] objArr = a8.f1743a;
            int length = objArr.length;
            f fVar = H4.d.f989a;
            if (i2 >= length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = fVar;
                copyOf[copyOf.length - 1] = bool;
                aVar = new M4.a(copyOf);
                break;
            }
            if (objArr[i2] == fVar) {
                int i5 = i2 + 1;
                if (objArr[i5] != bool) {
                    Object[] objArr2 = (Object[]) objArr.clone();
                    objArr2[i5] = bool;
                    aVar = new M4.a(objArr2);
                }
            } else {
                i2 += 2;
            }
        }
        M4.f a9 = e.f1747b.a(a8);
        try {
            oVar.run();
            a9.close();
            return c0977c;
        } finally {
        }
    }
}
