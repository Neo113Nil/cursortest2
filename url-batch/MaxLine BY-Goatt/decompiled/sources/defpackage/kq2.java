package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kq2 extends sk2 implements to2 {
    @Override // defpackage.to2
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.t;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.u + ((int) ((o() + this.w) - this.u))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.t;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.u + ((int) ((o() + this.w) - this.u))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
