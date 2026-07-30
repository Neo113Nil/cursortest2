package org.greenrobot.greendao.query;

/* loaded from: classes5.dex */
abstract class c extends a {
    protected final int limitPosition;
    protected final int offsetPosition;

    protected c(org.greenrobot.greendao.a aVar, String str, String[] strArr, int i8, int i9) {
        super(aVar, str, strArr);
        this.limitPosition = i8;
        this.offsetPosition = i9;
    }

    public void setLimit(int i8) {
        checkThread();
        int i9 = this.limitPosition;
        if (i9 == -1) {
            throw new IllegalStateException("Limit must be set with QueryBuilder before it can be used here");
        }
        this.parameters[i9] = Integer.toString(i8);
    }

    public void setOffset(int i8) {
        checkThread();
        int i9 = this.offsetPosition;
        if (i9 == -1) {
            throw new IllegalStateException("Offset must be set with QueryBuilder before it can be used here");
        }
        this.parameters[i9] = Integer.toString(i8);
    }

    @Override // org.greenrobot.greendao.query.a
    public c setParameter(int i8, Object obj) {
        if (i8 < 0 || !(i8 == this.limitPosition || i8 == this.offsetPosition)) {
            return (c) super.setParameter(i8, obj);
        }
        throw new IllegalArgumentException("Illegal parameter index: " + i8);
    }
}
