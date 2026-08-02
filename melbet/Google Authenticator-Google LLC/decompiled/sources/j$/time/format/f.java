package j$.time.format;

import java.util.ArrayList;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class f implements g {
    public final g[] a;
    public final boolean b;

    public f(ArrayList arrayList, boolean z) {
        this((g[]) arrayList.toArray(new g[arrayList.size()]), z);
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
    @Override // j$.time.format.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(q qVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            qVar.b++;
        }
        try {
            for (g gVar : this.a) {
                if (!gVar.f(qVar, sb)) {
                    sb.setLength(length);
                }
            }
        } finally {
            if (z) {
                qVar.b--;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        g[] gVarArr = this.a;
        if (gVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (g gVar : gVarArr) {
                sb.append(gVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    public f(g[] gVarArr, boolean z) {
        this.a = gVarArr;
        this.b = z;
    }
}
