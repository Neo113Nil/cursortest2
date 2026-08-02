package defpackage;

import android.content.Context;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ckw implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ckw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 <= 1.0d) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0090, code lost:
    
        if (r12 <= r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, krt] */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        jkj C;
        jkj k;
        jkj k2;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return this.a.a(obj);
            }
            if (i == 2) {
                return a.p(this.a, obj);
            }
            ?? r11 = this.a;
            return i != 3 ? r11.a(obj) : r11.a(obj);
        }
        Map map = ckx.a;
        Object obj2 = this.a;
        List list = cji.n;
        Context context = (Context) obj2;
        cjd cjdVar = new cjd(context, "CLIENT_LOGGING_PROD");
        cjdVar.d = (String) obj;
        cjl a = jsy.a.bB().a(context);
        cjdVar.f = a;
        cjdVar.g = 11;
        if ((a.b & 2) != 0) {
            cjk cjkVar = a.d;
            if (cjkVar == null) {
                cjkVar = cjk.a;
            }
            if ((cjkVar.b & 1) != 0) {
                double d = cjkVar.c;
                if (d >= 0.0d) {
                }
            }
            C = a.C();
            k = cjj.a.k();
            if (!k.b.M()) {
                k.t();
            }
            cjj cjjVar = (cjj) k.b;
            cjjVar.b |= 1;
            cjjVar.c = 0.0d;
            if (!C.b.M()) {
                C.t();
            }
            cjl cjlVar = (cjl) C.b;
            cjj cjjVar2 = (cjj) k.q();
            cjjVar2.getClass();
            cjlVar.c = cjjVar2;
            cjlVar.b |= 1;
            k2 = cjk.a.k();
            if (!k2.b.M()) {
                k2.t();
            }
            cjk cjkVar2 = (cjk) k2.b;
            cjkVar2.b = 1 | cjkVar2.b;
            cjkVar2.c = 0.0d;
            if (!C.b.M()) {
                C.t();
            }
            cjl cjlVar2 = (cjl) C.b;
            cjk cjkVar3 = (cjk) k2.q();
            cjkVar3.getClass();
            cjlVar2.d = cjkVar3;
            cjlVar2.b |= 2;
            cjdVar.f = (cjl) C.q();
            return cjdVar.a();
        }
        if ((a.b & 1) != 0) {
            cjj cjjVar3 = a.c;
            if (cjjVar3 == null) {
                cjjVar3 = cjj.a;
            }
            int i2 = cjjVar3.b;
            if ((i2 & 1) != 0) {
                double d2 = cjjVar3.c;
                if (d2 >= 0.0d) {
                    if (d2 <= 1.0d) {
                        int i3 = cjjVar3.d;
                        if (i3 > 0) {
                            if ((i2 & 4) != 0) {
                                int i4 = cjjVar3.e;
                                if (i4 > 0) {
                                }
                            }
                        }
                    }
                }
            }
            C = a.C();
            k = cjj.a.k();
            if (!k.b.M()) {
            }
            cjj cjjVar4 = (cjj) k.b;
            cjjVar4.b |= 1;
            cjjVar4.c = 0.0d;
            if (!C.b.M()) {
            }
            cjl cjlVar3 = (cjl) C.b;
            cjj cjjVar22 = (cjj) k.q();
            cjjVar22.getClass();
            cjlVar3.c = cjjVar22;
            cjlVar3.b |= 1;
            k2 = cjk.a.k();
            if (!k2.b.M()) {
            }
            cjk cjkVar22 = (cjk) k2.b;
            cjkVar22.b = 1 | cjkVar22.b;
            cjkVar22.c = 0.0d;
            if (!C.b.M()) {
            }
            cjl cjlVar22 = (cjl) C.b;
            cjk cjkVar32 = (cjk) k2.q();
            cjkVar32.getClass();
            cjlVar22.d = cjkVar32;
            cjlVar22.b |= 2;
            cjdVar.f = (cjl) C.q();
        }
        return cjdVar.a();
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
