package defpackage;

import android.content.Intent;
import com.google.mlkit.vision.codescanner.internal.GmsBarcodeScanningDelegateActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fsa implements ob {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fsa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ob
    public final void a(Object obj) {
        fsv w;
        Object obj2;
        int i = this.b;
        if (i == 0) {
            oa oaVar = (oa) obj;
            oaVar.getClass();
            Object obj3 = this.a;
            int i2 = oaVar.a;
            Intent intent = oaVar.b;
            if (i2 == -1) {
                intent.getClass();
                ((fsl) obj3).t(frv.a(intent.getIntExtra("new_account_id", -1)), false, 0);
            } else {
                fsl fslVar = (fsl) obj3;
                ftr ftrVar = fslVar.e;
                if (!ftrVar.m()) {
                    w = intent != null ? fsl.w(intent) : null;
                    if (w == null) {
                        w = new ftb();
                    }
                    ftrVar.k(w);
                }
                fslVar.q();
            }
            ((fsl) obj3).r();
            return;
        }
        if (i == 1) {
            ((oa) obj).getClass();
            Object obj4 = this.a;
            ((dtw) obj4).as.F(new dlj(obj4, r6));
            return;
        }
        if (i != 2) {
            oa oaVar2 = (oa) obj;
            Intent intent2 = oaVar2.b;
            if (oaVar2.a == -1 && intent2 != null && intent2.hasExtra("extra_barcode_result")) {
                byte[] byteArrayExtra = intent2.getByteArrayExtra("extra_barcode_result");
                oy.at(byteArrayExtra);
                jfc.d(new ikk(new ikk((jev) oy.o(byteArrayExtra, jev.CREATOR)), null), 0);
            } else {
                jfc.d(null, intent2 != null ? intent2.getIntExtra("extra_error_code", 13) : 13);
            }
            ((GmsBarcodeScanningDelegateActivity) this.a).finish();
            return;
        }
        oa oaVar3 = (oa) obj;
        oaVar3.getClass();
        Object obj5 = this.a;
        int i3 = oaVar3.a;
        Intent intent3 = oaVar3.b;
        if (i3 == -1) {
            intent3.getClass();
            ((fsl) obj5).t(frv.a(intent3.getIntExtra("new_account_id", -1)), false, 0);
        } else {
            if (intent3 == null || !intent3.getBooleanExtra("restart_account_selector", false)) {
                w = intent3 != null ? fsl.w(intent3) : null;
                ftr ftrVar2 = ((fsl) obj5).e;
                if (w == null) {
                    w = new ftb();
                }
                ftrVar2.k(w);
            } else {
                fsl fslVar2 = (fsl) obj5;
                fslVar2.o();
                fslVar2.n();
                gty aC = hoq.aC(78, "Switch Account Interactive");
                try {
                    ftt fttVar = ((fsl) obj5).h;
                    if (fttVar == null) {
                        ksp.a("config");
                        fttVar = null;
                    }
                    hel helVar = fttVar.c;
                    helVar.getClass();
                    hjs listIterator = helVar.listIterator(((his) helVar).c);
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (ftj.class.isAssignableFrom((Class) obj2)) {
                                break;
                            }
                        }
                    }
                    Class cls = (Class) obj2;
                    if (cls == null) {
                        throw new IllegalStateException("No interactive selector found.");
                    }
                    hel q = hel.q(cls);
                    q.getClass();
                    ((fsl) obj5).s(q, 0);
                    ixf.j(aC, null);
                } finally {
                }
            }
            ((fsl) obj5).q();
        }
        ((fsl) obj5).r();
    }
}
