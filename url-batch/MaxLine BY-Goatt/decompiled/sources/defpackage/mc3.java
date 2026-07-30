package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mc3 implements Iterator {
    public final /* synthetic */ int m;
    public int n = 0;
    public final /* synthetic */ Object o;

    public /* synthetic */ mc3(int i, Object obj) {
        this.m = i;
        this.o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                if (this.n < ((pc3) this.o).m.length()) {
                }
                break;
            case 1:
                if (this.n < ((pc3) this.o).m.length()) {
                }
                break;
            default:
                if (this.n < ((qb3) this.o).n()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.m;
        Object obj = this.o;
        switch (i) {
            case 0:
                String str = ((pc3) obj).m;
                int i2 = this.n;
                if (i2 < str.length()) {
                    this.n = i2 + 1;
                    return new pc3(String.valueOf(i2));
                }
                b71.f();
                return null;
            case 1:
                pc3 pc3Var = (pc3) obj;
                String str2 = pc3Var.m;
                int i3 = this.n;
                if (i3 < str2.length()) {
                    this.n = i3 + 1;
                    return new pc3(String.valueOf(pc3Var.m.charAt(i3)));
                }
                b71.f();
                return null;
            default:
                qb3 qb3Var = (qb3) obj;
                int i4 = this.n;
                int n = qb3Var.n();
                int i5 = this.n;
                if (i4 < n) {
                    this.n = i5 + 1;
                    return qb3Var.o(i5);
                }
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i5);
                throw new NoSuchElementException(sb.toString());
        }
    }
}
