package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class il1 extends kl1 implements cq {
    public static final hl1 Companion = new hl1();
    public static final il1 dgRBjINgWbAK;

    static {
        tl2.Companion.getClass();
        dgRBjINgWbAK = new il1(tl2.e9gEMXR7LXtO, 0);
    }

    @Override // defpackage.kl1, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof gr1) {
            return super.containsKey((gr1) obj);
        }
        return false;
    }

    @Override // defpackage.kpCQ9veP6n3I, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof jp2) {
            return super.containsValue((jp2) obj);
        }
        return false;
    }

    @Override // defpackage.kl1, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof gr1) {
            return (jp2) super.get((gr1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof gr1) ? obj2 : (jp2) super.getOrDefault((gr1) obj, (jp2) obj2);
    }

    public final il1 lS5Rgt96tfkO(gr1 gr1Var, jp2 jp2Var) {
        um S9EYkSpbGuxq = this.rtx2ld2ELZv4.S9EYkSpbGuxq(gr1Var.hashCode(), 0, gr1Var, jp2Var);
        return S9EYkSpbGuxq == null ? this : new il1((tl2) S9EYkSpbGuxq.TSizfFm2Yiuu, this.OPXfSBeufaJ8 + S9EYkSpbGuxq.lS5Rgt96tfkO);
    }
}
