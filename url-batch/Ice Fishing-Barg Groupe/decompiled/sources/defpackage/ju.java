package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ju extends S9EYkSpbGuxq implements fu {
    public static final iu OPXfSBeufaJ8 = new iu(ih0.x50lh2ztY7Y5, new wnqUPcAvl7HT(12));

    public ju() {
        super(ih0.x50lh2ztY7Y5);
    }

    public boolean POWyO8hTM6YC(hu huVar) {
        return !(this instanceof jo2);
    }

    public abstract void Pf0ThKz3j5YS(hu huVar, Runnable runnable);

    @Override // defpackage.S9EYkSpbGuxq, defpackage.hu
    public final fu S2OOm9zPNm0h(gu guVar) {
        fu fuVar;
        guVar.getClass();
        if (guVar instanceof iu) {
            iu iuVar = (iu) guVar;
            gu guVar2 = this.rtx2ld2ELZv4;
            if ((guVar2 == iuVar || iuVar.OPXfSBeufaJ8 == guVar2) && (fuVar = (fu) iuVar.rtx2ld2ELZv4.OPXfSBeufaJ8(this)) != null) {
                return fuVar;
            }
        } else if (ih0.x50lh2ztY7Y5 == guVar) {
            return this;
        }
        return null;
    }

    public void gGoUzNp9JO5I(hu huVar, Runnable runnable) {
        Pf0ThKz3j5YS(huVar, runnable);
    }

    public ju i68hK7ahKtgp(int i) {
        xi0.gPXPFXrUH4XX(i);
        return new y01(this, i);
    }

    @Override // defpackage.S9EYkSpbGuxq, defpackage.hu
    public final hu kpCQ9veP6n3I(gu guVar) {
        guVar.getClass();
        if (guVar instanceof iu) {
            iu iuVar = (iu) guVar;
            gu guVar2 = this.rtx2ld2ELZv4;
            if (guVar2 != iuVar && iuVar.OPXfSBeufaJ8 != guVar2) {
                return this;
            }
            if (((fu) iuVar.rtx2ld2ELZv4.OPXfSBeufaJ8(this)) == null) {
                return this;
            }
        } else if (ih0.x50lh2ztY7Y5 != guVar) {
            return this;
        }
        return n50.rtx2ld2ELZv4;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + zv.VhhvGxCb8gfr(this);
    }
}
