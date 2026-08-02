package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sc {
    public int b;
    public boolean c;
    public final sd d;
    public sc e;
    public ry h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public sc(sd sdVar, int i) {
        this.d = sdVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        sc scVar;
        if (this.d.ai == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (scVar = this.e) == null || scVar.d.ai != 8) ? this.f : i;
    }

    public final sc c() {
        int i = this.i - 1;
        if (i == 1) {
            return this.d.M;
        }
        if (i == 2) {
            return this.d.N;
        }
        if (i == 3) {
            return this.d.K;
        }
        if (i != 4) {
            return null;
        }
        return this.d.L;
    }

    public final void d(int i, ArrayList arrayList, sx sxVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tw.B(((sc) it.next()).d, i, arrayList, sxVar);
            }
        }
    }

    public final void e() {
        HashSet hashSet;
        sc scVar = this.e;
        if (scVar != null && (hashSet = scVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void f(int i) {
        this.b = i;
        this.c = true;
    }

    public final void g(int i) {
        if (j()) {
            this.g = i;
        }
    }

    public final boolean h() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((sc) it.next()).c().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean j() {
        return this.e != null;
    }

    public final boolean k(sc scVar) {
        if (scVar == null) {
            return false;
        }
        int i = this.i;
        int i2 = scVar.i;
        if (i2 == i) {
            return i != 6 || (scVar.d.G && this.d.G);
        }
        int i3 = 9;
        int i4 = 4;
        int i5 = 2;
        switch (i - 1) {
            case 1:
            case 3:
                i3 = 8;
                break;
            case 2:
            case 4:
                i5 = 3;
                i4 = 5;
                break;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                return false;
        }
        boolean z = i2 == i5 || i2 == i4;
        return scVar.d instanceof sh ? z || i2 == i3 : z;
    }

    public final void l(sc scVar, int i, int i2, boolean z) {
        if (scVar == null) {
            e();
            return;
        }
        if (z || k(scVar)) {
            this.e = scVar;
            if (scVar.a == null) {
                scVar.a = new HashSet();
            }
            HashSet hashSet = this.e.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f = i;
            this.g = i2;
        }
    }

    public final void m() {
        ry ryVar = this.h;
        if (ryVar == null) {
            this.h = new ry(1);
        } else {
            ryVar.c();
        }
    }

    public final String toString() {
        String str;
        String str2 = this.d.aj;
        switch (this.i) {
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        return a.ag(str, str2, ":");
    }
}
