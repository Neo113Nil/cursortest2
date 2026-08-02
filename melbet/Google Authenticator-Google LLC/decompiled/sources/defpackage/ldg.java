package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ldg {
    private final kui a = new kui(0, kul.a);
    public ldh[] b;

    private final void h(int i, int i2) {
        ldh[] ldhVarArr = this.b;
        ldhVarArr.getClass();
        ldh ldhVar = ldhVarArr[i2];
        ldhVar.getClass();
        ldh ldhVar2 = ldhVarArr[i];
        ldhVar2.getClass();
        ldhVarArr[i] = ldhVar;
        ldhVarArr[i2] = ldhVar2;
        ldhVar.e(i);
        ldhVar2.e(i2);
    }

    public final int a() {
        return this.a.b;
    }

    public final ldh b() {
        ldh[] ldhVarArr = this.b;
        if (ldhVarArr != null) {
            return ldhVarArr[0];
        }
        return null;
    }

    public final ldh c() {
        ldh b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (((java.lang.Comparable) r5).compareTo(r6) < 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ldh d(int i) {
        boolean z = kvo.a;
        ldh[] ldhVarArr = this.b;
        ldhVarArr.getClass();
        e(a() - 1);
        if (i < a()) {
            h(i, a());
            int i2 = i - 1;
            if (i > 0) {
                int i3 = i2 / 2;
                ldh ldhVar = ldhVarArr[i];
                ldhVar.getClass();
                ldh ldhVar2 = ldhVarArr[i3];
                ldhVar2.getClass();
                if (((Comparable) ldhVar).compareTo(ldhVar2) < 0) {
                    h(i, i3);
                    f(i3);
                }
            }
            while (true) {
                int i4 = i + i;
                int i5 = i4 + 1;
                if (i5 >= a()) {
                    break;
                }
                ldh[] ldhVarArr2 = this.b;
                ldhVarArr2.getClass();
                int i6 = i4 + 2;
                if (i6 < a()) {
                    ldh ldhVar3 = ldhVarArr2[i6];
                    ldhVar3.getClass();
                    ldh ldhVar4 = ldhVarArr2[i5];
                    ldhVar4.getClass();
                }
                i6 = i5;
                ldh ldhVar5 = ldhVarArr2[i];
                ldhVar5.getClass();
                ldh ldhVar6 = ldhVarArr2[i6];
                ldhVar6.getClass();
                if (((Comparable) ldhVar5).compareTo(ldhVar6) <= 0) {
                    break;
                }
                h(i, i6);
                i = i6;
            }
        }
        ldh ldhVar7 = ldhVarArr[a()];
        ldhVar7.getClass();
        ldhVar7.d(null);
        ldhVar7.e(-1);
        ldhVarArr[a()] = null;
        return ldhVar7;
    }

    public final void e(int i) {
        this.a.b = i;
    }

    public final void f(int i) {
        while (i > 0) {
            ldh[] ldhVarArr = this.b;
            ldhVarArr.getClass();
            int i2 = (i - 1) >> 1;
            ldh ldhVar = ldhVarArr[i2];
            ldhVar.getClass();
            ldh ldhVar2 = ldhVarArr[i];
            ldhVar2.getClass();
            if (((Comparable) ldhVar).compareTo(ldhVar2) <= 0) {
                return;
            }
            h(i, i2);
            i = i2;
        }
    }

    public final boolean g() {
        return a() == 0;
    }
}
