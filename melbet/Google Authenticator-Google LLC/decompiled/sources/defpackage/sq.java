package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sq implements so {
    public final sy d;
    public int e;
    public int f;
    public so a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    sr h = null;
    public boolean i = false;
    public final List j = new ArrayList();
    final List k = new ArrayList();

    public sq(sy syVar) {
        this.d = syVar;
    }

    public final void a(so soVar) {
        this.j.add(soVar);
        if (this.i) {
            soVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((so) it.next()).f();
        }
    }

    @Override // defpackage.so
    public final void f() {
        List<sq> list = this.k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((sq) it.next()).i) {
                return;
            }
        }
        this.c = true;
        so soVar = this.a;
        if (soVar != null) {
            soVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        sq sqVar = null;
        for (sq sqVar2 : list) {
            if (!(sqVar2 instanceof sr)) {
                i++;
                sqVar = sqVar2;
            }
        }
        if (sqVar != null && i == 1 && sqVar.i) {
            sr srVar = this.h;
            if (srVar != null) {
                if (!srVar.i) {
                    return;
                } else {
                    this.e = this.g * srVar.f;
                }
            }
            c(sqVar.f + this.e);
        }
        so soVar2 = this.a;
        if (soVar2 != null) {
            soVar2.f();
        }
    }

    public final String toString() {
        String str;
        String str2 = this.d.d.aj;
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        String valueOf = this.i ? Integer.valueOf(this.f) : "unresolved";
        List list = this.k;
        List list2 = this.j;
        return str2 + ":" + str + "(" + valueOf.toString() + ") <t=" + list.size() + ":d=" + list2.size() + ">";
    }
}
