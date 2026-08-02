package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avz extends kra implements krx {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avz(avi aviVar, asp aspVar, ash ashVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.e = i;
        this.c = aviVar;
        this.b = aspVar;
        this.d = ashVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((avz) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        if (i == 1) {
            return ((avz) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        if (i == 2) {
            return ((avz) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        if (i == 3) {
            return ((avz) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        if (i != 4) {
            return ((avz) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        return ((avz) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0130, code lost:
    
        if (r12 == r0) goto L65;
     */
    /* JADX WARN: Type inference failed for: r12v21, types: [aer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ash, java.lang.Object] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        Object obj2;
        int i = this.e;
        if (i == 0) {
            kqp kqpVar = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                Object obj3 = this.b;
                Object obj4 = this.c;
                Object obj5 = this.d;
                kzq w = ((brn) obj3).w((axt) obj4);
                dsp dspVar = new dsp(obj5, obj4, 1);
                this.a = 1;
                if (w.a(dspVar, this) == kqpVar) {
                    return kqpVar;
                }
            }
            return kow.a;
        }
        if (i == 1) {
            Object obj6 = kqp.a;
            int i2 = this.a;
            if (i2 == 0) {
                ixc.Y(obj);
                Object obj7 = this.c;
                Object obj8 = this.b;
                ?? r7 = this.d;
                this.a = 1;
                avi aviVar = (avi) obj7;
                axt axtVar = aviVar.a;
                int i3 = ays.a;
                if (!axtVar.r || Build.VERSION.SDK_INT >= 31) {
                    obj2 = kow.a;
                } else {
                    ldt ldtVar = aviVar.k;
                    Context context = aviVar.b;
                    ?? r12 = ldtVar.d;
                    r12.getClass();
                    obj2 = ixg.f(ixh.b(r12), new ayy((asp) obj8, axtVar, (ash) r7, context, (kqj) null, 1), this);
                    if (obj2 != obj6) {
                        obj2 = kow.a;
                    }
                }
            } else {
                if (i2 != 1) {
                    ixc.Y(obj);
                    return obj;
                }
                ixc.Y(obj);
            }
            String str = avk.a;
            asq.a();
            asp aspVar = (asp) this.b;
            hvi b = aspVar.b();
            this.a = 2;
            Object a = avk.a(b, aspVar, this);
            return a == obj6 ? obj6 : a;
        }
        if (i == 2) {
            kqp kqpVar2 = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
                return obj;
            }
            ixc.Y(obj);
            Object obj9 = this.b;
            Object obj10 = this.d;
            Object obj11 = this.c;
            this.a = 1;
            Object e = ((dtd) obj9).e((cid) obj10, (String) obj11, false, this);
            return e == kqpVar2 ? kqpVar2 : e;
        }
        if (i == 3) {
            kqp kqpVar3 = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                dtw dtwVar = (dtw) this.c;
                gjl gjlVar = dtwVar.ar;
                if (gjlVar == null) {
                    ksp.a("appStateDataInterface");
                    gjlVar = null;
                }
                dtv dtvVar = new dtv(dtwVar, (FrameLayout) this.b, (View) this.d);
                this.a = 1;
                if (lar.g((lar) gjlVar.j, dtvVar, this) == kqpVar3) {
                    return kqpVar3;
                }
            }
            return kow.a;
        }
        if (i != 4) {
            kqp kqpVar4 = kqp.a;
            int i4 = this.a;
            ixc.Y(obj);
            if (i4 == 0) {
                duy duyVar = (duy) ((gzp) ((fwm) this.d).a).b();
                ((jit) this.b).c.getClass();
                this.a = 1;
                if (duyVar.a() == kqpVar4) {
                    return kqpVar4;
                }
            }
            lao laoVar = (lao) this.c;
            laoVar.d(jhu.a((jhu) laoVar.b(), false, null, true, null, 11));
            return kow.a;
        }
        kqp kqpVar5 = kqp.a;
        if (this.a != 0) {
            ixc.Y(obj);
        } else {
            ixc.Y(obj);
            ?? r122 = this.c;
            Object obj12 = this.b;
            Object obj13 = this.d;
            aek aekVar = aek.d;
            avz avzVar = new avz((dtw) r122, (FrameLayout) obj12, (View) obj13, (kqj) null, 3);
            this.a = 1;
            if (afg.b(r122, aekVar, avzVar, this) == kqpVar5) {
                return kqpVar5;
            }
        }
        return kow.a;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [avx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ash, java.lang.Object] */
    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        int i = this.e;
        if (i == 0) {
            Object obj2 = this.b;
            return new avz((brn) obj2, (axt) this.c, (avx) this.d, kqjVar, 0);
        }
        if (i == 1) {
            Object obj3 = this.c;
            return new avz((avi) obj3, (asp) this.b, (ash) this.d, kqjVar, 1);
        }
        if (i == 2) {
            Object obj4 = this.b;
            return new avz((dtd) obj4, (cid) this.d, (String) this.c, kqjVar, 2);
        }
        if (i == 3) {
            Object obj5 = this.c;
            return new avz((dtw) obj5, (FrameLayout) this.b, (View) this.d, kqjVar, 3);
        }
        if (i != 4) {
            Object obj6 = this.d;
            return new avz((fwm) obj6, (jit) this.b, (lao) this.c, kqjVar, 5);
        }
        Object obj7 = this.c;
        return new avz((dtw) obj7, (FrameLayout) this.b, (View) this.d, kqjVar, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avz(brn brnVar, axt axtVar, avx avxVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.e = i;
        this.b = brnVar;
        this.c = axtVar;
        this.d = avxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avz(dtd dtdVar, cid cidVar, String str, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.e = i;
        this.b = dtdVar;
        this.d = cidVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avz(dtw dtwVar, FrameLayout frameLayout, View view, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.e = i;
        this.c = dtwVar;
        this.b = frameLayout;
        this.d = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avz(dtw dtwVar, FrameLayout frameLayout, View view, kqj kqjVar, int i, byte[] bArr) {
        super(2, kqjVar);
        this.e = i;
        this.c = dtwVar;
        this.b = frameLayout;
        this.d = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avz(fwm fwmVar, jit jitVar, lao laoVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.e = i;
        this.d = fwmVar;
        this.b = jitVar;
        this.c = laoVar;
    }
}
