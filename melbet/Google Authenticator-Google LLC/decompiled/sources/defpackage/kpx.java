package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpx extends kpw implements Iterator {
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpx(kpy kpyVar, int i, byte[] bArr) {
        super(kpyVar);
        this.d = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            a();
            int i = this.b;
            kpy kpyVar = this.a;
            if (i >= kpyVar.e) {
                throw new NoSuchElementException();
            }
            this.b = i + 1;
            this.c = i;
            Object obj = kpyVar.b[i];
            b();
            return obj;
        }
        a();
        int i2 = this.b;
        kpy kpyVar2 = this.a;
        if (i2 >= kpyVar2.e) {
            throw new NoSuchElementException();
        }
        this.b = i2 + 1;
        this.c = i2;
        Object[] objArr = kpyVar2.c;
        objArr.getClass();
        Object obj2 = objArr[i2];
        b();
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpx(kpy kpyVar, int i) {
        super(kpyVar);
        this.d = i;
    }
}
