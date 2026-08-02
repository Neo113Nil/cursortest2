package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aay {
    public final ArrayList a = new ArrayList();
    public final abc b;
    public int c;
    public boolean d;

    public aay(abc abcVar, List list) {
        e(list, false);
        e(list, true);
        if (!abcVar.b.contains(this)) {
            abcVar.b.add(this);
            vb vbVar = abcVar.c;
            vb vbVar2 = abcVar.d;
            b();
            int i = abcVar.e;
            c();
        }
        this.b = abcVar;
    }

    private final void e(List list, boolean z) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            aax aaxVar = (aax) list.get(i);
            aaxVar.b();
            if (z) {
                Object obj = aaxVar.b;
                if (obj != null) {
                    throw new IllegalStateException(aaxVar + " (" + i2 + "/" + size + ") is already controlled by " + obj + " but is still added to " + this);
                }
                aaxVar.b = this;
                this.a.add(aaxVar);
            }
            i = i2;
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    public final void c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((aax) arrayList.get(size)).a();
            }
        }
    }

    public final void d() {
    }
}
