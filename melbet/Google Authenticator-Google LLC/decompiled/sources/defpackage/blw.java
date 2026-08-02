package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blw extends qi {
    private int e;

    @Override // defpackage.qy, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.qy
    public final Object d(int i) {
        this.e = 0;
        return super.d(i);
    }

    @Override // defpackage.qy
    public final Object e(int i, Object obj) {
        this.e = 0;
        return super.e(i, obj);
    }

    @Override // defpackage.qy
    public final void h(qy qyVar) {
        this.e = 0;
        super.h(qyVar);
    }

    @Override // defpackage.qy, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = super.hashCode();
        this.e = hashCode;
        return hashCode;
    }

    @Override // defpackage.qy, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.e = 0;
        return super.put(obj, obj2);
    }
}
