package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ktg implements Iterable {
    public final int a;
    public final int b;
    public final int c = 1;

    public ktg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean a() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ktg) {
            if (a() && ((ktg) obj).a()) {
                return true;
            }
            ktg ktgVar = (ktg) obj;
            if (this.a != ktgVar.a || this.b != ktgVar.b) {
                return false;
            }
            int i = ktgVar.c;
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new kpo(this.a, this.b);
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
