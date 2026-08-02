package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentMap$EL;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evj {
    private volatile evd a;
    private evi b;

    public evj(evd evdVar) {
        this.a = evdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r11.n != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r11.o != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final evi a(final etd etdVar) {
        final evd evdVar = this.a;
        evd evdVar2 = evi.b;
        if (evdVar != evdVar2) {
            Context context = etdVar.c;
            evh evhVar = evi.a;
            final boolean[] zArr = new boolean[1];
            bry bryVar = (bry) ConcurrentMap$EL.computeIfAbsent(evhVar.b, evdVar.a(context), new Function() { // from class: evg
                public final /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    etd etdVar2 = etd.this;
                    evd evdVar3 = evdVar;
                    evi eviVar = new evi(etdVar2, evdVar3);
                    boolean z = evdVar3.b;
                    bry bryVar2 = new bry(eviVar, (char[]) null);
                    zArr[0] = true;
                    return bryVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (zArr[0]) {
                ewg ewgVar = etdVar.f;
                boolean z = evdVar.a;
                iac iacVar = iac.FILE;
                byte[] bArr = null;
                if (!etb.d()) {
                    if (z) {
                        euf b = ewgVar.b();
                        if (b.e) {
                            if (new jkv(b.i, euf.a).contains(iacVar)) {
                            }
                        }
                        evw.a(context, new kee(evhVar, bArr), new kee(evhVar, bArr));
                    } else {
                        eud a = ewgVar.a();
                        if (a.e) {
                            if (new jkv(a.j, eud.a).contains(iacVar)) {
                            }
                        }
                        evw.a(context, new kee(evhVar, bArr), new kee(evhVar, bArr));
                    }
                    boolean z2 = evdVar.b;
                }
                evw.a(context, null, new kee(evhVar, bArr));
                boolean z22 = evdVar.b;
            }
            this.b = (evi) bryVar.a;
            this.a = evdVar2;
        }
        return this.b;
    }
}
