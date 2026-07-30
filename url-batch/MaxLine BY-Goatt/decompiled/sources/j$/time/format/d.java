package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class d implements e {
    public final e[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(List list, boolean z) {
        this((e[]) r2.toArray(new e[r2.size()]), z);
        ArrayList arrayList = (ArrayList) list;
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        e[] eVarArr = this.a;
        int i2 = 0;
        if (!z) {
            int length = eVarArr.length;
            while (i2 < length) {
                i = eVarArr[i2].B(vVar, charSequence, i);
                if (i < 0) {
                    return i;
                }
                i2++;
            }
            return i;
        }
        ArrayList arrayList = vVar.d;
        d0 c = vVar.c();
        c.getClass();
        d0 d0Var = new d0();
        ((HashMap) d0Var.a).putAll(c.a);
        d0Var.b = c.b;
        d0Var.c = c.c;
        d0Var.d = c.d;
        arrayList.add(d0Var);
        int length2 = eVarArr.length;
        int i3 = i;
        while (i2 < length2) {
            i3 = eVarArr[i2].B(vVar, charSequence, i3);
            if (i3 < 0) {
                vVar.d.remove(r6.size() - 1);
                return i;
            }
            i2++;
        }
        vVar.d.remove(r6.size() - 2);
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(y yVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            yVar.c++;
        }
        try {
            for (e eVar : this.a) {
                if (!eVar.s(yVar, sb)) {
                    sb.setLength(length);
                }
            }
        } finally {
            if (z) {
                yVar.c--;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        e[] eVarArr = this.a;
        if (eVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (e eVar : eVarArr) {
                sb.append(eVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    public d(e[] eVarArr, boolean z) {
        this.a = eVarArr;
        this.b = z;
    }
}
