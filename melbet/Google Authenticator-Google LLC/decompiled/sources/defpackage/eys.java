package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eys implements ezd {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public eys(Bundle bundle, int i) {
        this.b = i;
        this.a = bundle;
    }

    @Override // defpackage.ezd
    public final void a(ezv ezvVar) {
        switch (this.b) {
            case 0:
                if (ezvVar instanceof eym) {
                    exf.k();
                    try {
                        eyu.r(ezvVar, (Bundle) this.a).getClass();
                        ((eym) ezvVar).a();
                        return;
                    } finally {
                    }
                }
                return;
            case 1:
                if (ezvVar instanceof eyi) {
                    exf.k();
                    try {
                        eyu.r(ezvVar, (Bundle) this.a);
                        ((eyi) ezvVar).a();
                        return;
                    } finally {
                    }
                }
                return;
            case 2:
                if (ezvVar instanceof eyv) {
                    exf.k();
                    try {
                        ezc.r(ezvVar, (Bundle) this.a);
                        ((eyv) ezvVar).a();
                        return;
                    } finally {
                    }
                }
                return;
            case 3:
                if (ezvVar instanceof eza) {
                    exf.k();
                    try {
                        ezc.r(ezvVar, (Bundle) this.a);
                        ((eza) ezvVar).a();
                        return;
                    } finally {
                    }
                }
                return;
            case 4:
                if (ezvVar instanceof ezb) {
                    exf.k();
                    try {
                        ezc.r(ezvVar, (Bundle) this.a);
                        ((ezb) ezvVar).a();
                        return;
                    } finally {
                    }
                }
                return;
            case 5:
                ((eze) this.a).s(ezvVar);
                return;
            case 6:
                if (ezvVar instanceof ezi) {
                    exf.k();
                    try {
                        eze.r(ezvVar, (Bundle) this.a);
                        ((ezi) ezvVar).a();
                        return;
                    } finally {
                    }
                }
                return;
            default:
                if (ezvVar instanceof ezs) {
                    exf.k();
                    try {
                        Bundle bundle = new Bundle();
                        ((ezs) ezvVar).a();
                        String q = eze.q(ezvVar);
                        q.getClass();
                        ((Bundle) this.a).putBundle(q, bundle);
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public /* synthetic */ eys(eze ezeVar, int i) {
        this.b = i;
        this.a = ezeVar;
    }
}
