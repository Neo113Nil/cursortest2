package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tl1 extends zf8DYfih6EZu implements Set, Collection, fu0 {
    public static final sl1 Companion = new sl1();
    public static final tl1 dgRBjINgWbAK;
    public final Object OPXfSBeufaJ8;
    public final Object rtx2ld2ELZv4;
    public final kl1 wdg6QnbFHrFF;

    static {
        jx1 jx1Var = jx1.QrzZRwfaDlRX;
        kl1.Companion.getClass();
        dgRBjINgWbAK = new tl1(jx1Var, jx1Var, kl1.wdg6QnbFHrFF);
    }

    public tl1(Object obj, Object obj2, kl1 kl1Var) {
        this.rtx2ld2ELZv4 = obj;
        this.OPXfSBeufaJ8 = obj2;
        this.wdg6QnbFHrFF = kl1Var;
    }

    @Override // defpackage.QrzZRwfaDlRX
    public final int PxuCJdSBwIXG() {
        return this.wdg6QnbFHrFF.OPXfSBeufaJ8;
    }

    @Override // defpackage.QrzZRwfaDlRX, java.util.Collection
    public final boolean contains(Object obj) {
        return this.wdg6QnbFHrFF.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lg0(this.rtx2ld2ELZv4, this.wdg6QnbFHrFF);
    }
}
