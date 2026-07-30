package m5;

import java.util.List;
import java.util.function.Function;
import k5.AbstractC0605e;
import q5.AbstractC0835a;
import r5.AbstractC0848a;
import t5.AbstractC0929a;

/* loaded from: classes.dex */
public final class c extends k5.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6554b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6555c;

    public c(j[] jVarArr) {
        super(k5.h.e(AbstractC0835a.f7351a, jVarArr));
        this.f6555c = jVarArr;
    }

    public static c d(List list, Function function) {
        int size = list.size();
        AbstractC0605e[] abstractC0605eArr = new AbstractC0605e[size];
        for (int i2 = 0; i2 < size; i2++) {
            abstractC0605eArr[i2] = (AbstractC0605e) function.apply(list.get(i2));
        }
        return new c(new C0692b(abstractC0605eArr));
    }

    @Override // k5.AbstractC0605e
    public final void c(k5.l lVar) {
        switch (this.f6554b) {
            case 0:
                lVar.a(AbstractC0848a.f7531e, (C0692b) this.f6555c);
                break;
            case 1:
                lVar.a(AbstractC0848a.f7532f, (C0692b) this.f6555c);
                break;
            case 2:
                lVar.j(AbstractC0929a.f8013a, (m[]) this.f6555c);
                break;
            default:
                lVar.j(AbstractC0835a.f7351a, (j[]) this.f6555c);
                break;
        }
    }

    public c(C0692b c0692b, byte b7) {
        super(k5.h.d(AbstractC0848a.f7532f, c0692b));
        this.f6555c = c0692b;
    }

    public c(C0692b c0692b) {
        super(k5.h.d(AbstractC0848a.f7531e, c0692b));
        this.f6555c = c0692b;
    }

    public c(m[] mVarArr) {
        super(k5.h.e(AbstractC0929a.f8013a, mVarArr));
        this.f6555c = mVarArr;
    }
}
