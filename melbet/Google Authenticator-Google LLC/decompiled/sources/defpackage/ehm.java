package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ehm extends kr {
    private final es a;

    public ehm(brr brrVar) {
        this.a = new es(new ehl(this), brrVar);
    }

    @Override // defpackage.kr
    public int a() {
        return this.a.e.size();
    }

    public void t(List list) {
        this.a.a(list);
    }

    protected final Object u(int i) {
        Object obj = this.a.e.get(i);
        obj.getClass();
        return obj;
    }

    public final List v() {
        List list = this.a.e;
        list.getClass();
        return list;
    }
}
