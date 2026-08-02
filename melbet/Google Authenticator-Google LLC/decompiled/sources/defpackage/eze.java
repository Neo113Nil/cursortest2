package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class eze {
    private static final Bundle a = new Bundle();
    private ezd b;
    private ezd c;
    private ezd d;
    public final List e = new ArrayList();
    protected final List f = new ArrayList();
    public ezd g;
    private ezd h;

    public eze() {
        new HashSet();
        Thread.currentThread().getId();
    }

    public static final String q(ezv ezvVar) {
        if (ezvVar instanceof ezs) {
            return ezvVar instanceof ezw ? ((ezw) ezvVar).a() : ezvVar.getClass().getName();
        }
        return null;
    }

    public static final Bundle r(ezv ezvVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String q = q(ezvVar);
        return q != null ? bundle.getBundle(q) : a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A() {
        exf.k();
        int i = 0;
        while (true) {
            try {
                List list = this.e;
                if (i >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof ezq) {
                    exf.k();
                    ((ezq) ezvVar).a();
                    exf.k();
                }
                i++;
            } finally {
            }
        }
    }

    public void a() {
        exf.k();
        try {
            ezd ezdVar = this.h;
            if (ezdVar != null) {
                o(ezdVar);
                this.h = null;
            }
            ezd ezdVar2 = this.b;
            int i = 0;
            if (ezdVar2 != null) {
                o(ezdVar2);
                this.b = null;
            }
            while (true) {
                List list = this.e;
                if (i >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                ezvVar.getClass();
                if (ezvVar instanceof ezl) {
                    exf.k();
                    ((ezl) ezvVar).a();
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

    public void b() {
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
                if (ezvVar instanceof ezo) {
                    exf.k();
                    ((ezo) ezvVar).a();
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

    public final void i(Bundle bundle) {
        exf.k();
        try {
            eys eysVar = new eys(bundle, 6);
            p(eysVar);
            this.b = eysVar;
        } finally {
            exf.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        throw r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        exf.k();
        try {
            for (ezv ezvVar : this.e) {
                if (ezvVar instanceof ezm) {
                    exf.k();
                    ((ezm) ezvVar).a();
                    exf.k();
                }
            }
        } finally {
        }
    }

    public final void k() {
        exf.k();
        try {
            eyt eytVar = new eyt(5);
            p(eytVar);
            this.d = eytVar;
        } finally {
            exf.k();
        }
    }

    public final void l(Bundle bundle) {
        exf.k();
        try {
            ezd ezdVar = this.h;
            if (ezdVar != null) {
                o(ezdVar);
            }
            eys eysVar = new eys(bundle, 7);
            p(eysVar);
            this.h = eysVar;
        } finally {
            exf.k();
        }
    }

    public final void m() {
        exf.k();
        try {
            eyt eytVar = new eyt(4);
            p(eytVar);
            this.c = eytVar;
        } finally {
            exf.k();
        }
    }

    public final void n() {
        exf.k();
        try {
            ezd ezdVar = this.c;
            int i = 0;
            if (ezdVar != null) {
                o(ezdVar);
                this.c = null;
            }
            while (true) {
                List list = this.e;
                if (i >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                ezvVar.getClass();
                if (ezvVar instanceof ezu) {
                    exf.k();
                    ((ezu) ezvVar).a();
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

    public final void o(ezd ezdVar) {
        this.f.remove(ezdVar);
    }

    public final void p(ezd ezdVar) {
        fao.c();
        int i = 0;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                this.f.add(ezdVar);
                return;
            } else {
                ezdVar.a((ezv) list.get(i));
                i++;
            }
        }
    }

    public final void s(ezv ezvVar) {
        if (ezvVar instanceof eyn) {
            exf.k();
            try {
                ((eyn) ezvVar).a();
            } finally {
                exf.k();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        exf.k();
        int i = 0;
        while (true) {
            try {
                List list = this.e;
                if (i >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof ezf) {
                    exf.k();
                    ((ezf) ezvVar).a();
                    exf.k();
                }
                i++;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        exf.k();
        int i = 0;
        while (true) {
            try {
                List list = this.e;
                if (i >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof ezg) {
                    exf.k();
                    ((ezg) ezvVar).a();
                    exf.k();
                }
                i++;
            } finally {
            }
        }
    }

    public final boolean v() {
        exf.k();
        boolean z = false;
        int i = 0;
        while (true) {
            try {
                List list = this.e;
                if (i >= list.size()) {
                    break;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof ezh) {
                    exf.k();
                    if (((ezh) ezvVar).a()) {
                        exf.k();
                        z = true;
                        break;
                    }
                    exf.k();
                }
                i++;
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        exf.k();
        int i = 0;
        while (true) {
            try {
                List list = this.e;
                if (i >= list.size()) {
                    return;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof ezj) {
                    exf.k();
                    ((ezj) ezvVar).a();
                    exf.k();
                }
                i++;
            } finally {
            }
        }
    }

    public final boolean x() {
        exf.k();
        int i = 0;
        boolean z = false;
        while (true) {
            try {
                List list = this.e;
                if (i >= list.size()) {
                    return z;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof ezk) {
                    exf.k();
                    z |= ((ezk) ezvVar).a();
                    exf.k();
                }
                i++;
            } finally {
                exf.k();
            }
        }
    }

    public final boolean y() {
        exf.k();
        boolean z = false;
        int i = 0;
        while (true) {
            try {
                List list = this.e;
                if (i >= list.size()) {
                    break;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof ezn) {
                    exf.k();
                    if (((ezn) ezvVar).a()) {
                        exf.k();
                        z = true;
                        break;
                    }
                    exf.k();
                }
                i++;
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
        return z;
    }

    public final boolean z() {
        exf.k();
        int i = 0;
        boolean z = false;
        while (true) {
            try {
                List list = this.e;
                if (i >= list.size()) {
                    return z;
                }
                ezv ezvVar = (ezv) list.get(i);
                if (ezvVar instanceof ezp) {
                    exf.k();
                    z |= ((ezp) ezvVar).a();
                    exf.k();
                }
                i++;
            } catch (Throwable th) {
                throw th;
            } finally {
                exf.k();
            }
        }
    }
}
