package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kq extends eg {
    public final ag S2OOm9zPNm0h;

    public kq(int i, ag agVar) {
        super(i);
        this.S2OOm9zPNm0h = agVar;
        if (agVar == ag.rtx2ld2ELZv4) {
            rc1.OPXfSBeufaJ8("This implementation does not support suspension for senders, use ", bu1.PxuCJdSBwIXG(eg.class).TSizfFm2Yiuu(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        u9.e9gEMXR7LXtO(o0.OPXfSBeufaJ8(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    public final Object POWyO8hTM6YC(Object obj, boolean z) {
        if (this.S2OOm9zPNm0h != ag.wdg6QnbFHrFF) {
            return ryVscX7ZL4Ux(obj);
        }
        Object Y1f8riQaR6yg = super.Y1f8riQaR6yg(obj);
        if (!(Y1f8riQaR6yg instanceof fj) || (Y1f8riQaR6yg instanceof dj)) {
            return Y1f8riQaR6yg;
        }
        gj.Companion.getClass();
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.eg, defpackage.v32
    public final Object PxuCJdSBwIXG(bt btVar, Object obj) {
        if (POWyO8hTM6YC(obj, true) instanceof dj) {
            throw EcgxDIVH5in8();
        }
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.eg, defpackage.v32
    public final Object Y1f8riQaR6yg(Object obj) {
        return POWyO8hTM6YC(obj, false);
    }

    @Override // defpackage.eg
    public final boolean jyegZNwi31qc() {
        return this.S2OOm9zPNm0h == ag.OPXfSBeufaJ8;
    }
}
