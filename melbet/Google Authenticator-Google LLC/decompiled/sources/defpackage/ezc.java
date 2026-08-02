package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ezc extends eze {
    public ezd a;
    private ezd b;
    private ezd c;
    private ezd d;
    private ezd h;

    @Override // defpackage.eze
    public final void a() {
        super.a();
        ezd ezdVar = this.c;
        if (ezdVar != null) {
            o(ezdVar);
            this.c = null;
        }
        ezd ezdVar2 = this.h;
        if (ezdVar2 != null) {
            o(ezdVar2);
            this.h = null;
        }
        ezd ezdVar3 = this.a;
        if (ezdVar3 != null) {
            o(ezdVar3);
            this.a = null;
        }
    }

    public final void c(Bundle bundle) {
        exf.k();
        try {
            eys eysVar = new eys(bundle, 2);
            p(eysVar);
            this.c = eysVar;
        } finally {
            exf.k();
        }
    }

    public final void d() {
        exf.k();
        try {
            ezd ezdVar = this.d;
            int i = 0;
            if (ezdVar != null) {
                o(ezdVar);
                this.d = null;
            }
            while (true) {
                List list = this.e;
                if (i >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                ezvVar.getClass();
                if (ezvVar instanceof eyx) {
                    exf.k();
                    ((eyx) ezvVar).a();
                    exf.k();
                }
                i++;
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            exf.k();
        }
    }

    public final void e() {
        exf.k();
        try {
            ezd ezdVar = this.b;
            int i = 0;
            if (ezdVar != null) {
                o(ezdVar);
                this.b = null;
            }
            while (true) {
                List list = this.e;
                if (i >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                ezvVar.getClass();
                if (ezvVar instanceof eyy) {
                    eyy eyyVar = (eyy) ezvVar;
                    exf.k();
                    eyyVar.a();
                    exf.k();
                }
                i++;
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            exf.k();
        }
    }

    public final void f(Bundle bundle) {
        exf.k();
        try {
            eys eysVar = new eys(bundle, 3);
            p(eysVar);
            this.h = eysVar;
        } finally {
            exf.k();
        }
    }

    public final void g() {
        exf.k();
        try {
            eyt eytVar = new eyt(2);
            p(eytVar);
            this.b = eytVar;
        } finally {
            exf.k();
        }
    }

    public final void h(Bundle bundle) {
        exf.k();
        try {
            eys eysVar = new eys(bundle, 4);
            p(eysVar);
            this.d = eysVar;
        } finally {
            exf.k();
        }
    }
}
