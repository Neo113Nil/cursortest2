package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hf1 extends ca1 implements zd1 {
    @Override // defpackage.zd1
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.m + ((int) ((o() + this.o) - this.m))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.m + ((int) ((o() + this.o) - this.m))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
