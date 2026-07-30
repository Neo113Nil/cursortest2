package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class rs0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [qs0] */
    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                int i = this.OPXfSBeufaJ8;
                fy1 fy1Var = (fy1) obj;
                fy1Var.getClass();
                hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("SELECT * FROM items WHERE id = ?");
                try {
                    amuv7NJvPxHu.Y1f8riQaR6yg(1, i);
                    int S9EYkSpbGuxq = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "id");
                    int S9EYkSpbGuxq2 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "name");
                    int S9EYkSpbGuxq3 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "rating");
                    int S9EYkSpbGuxq4 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "description");
                    int S9EYkSpbGuxq5 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "protein");
                    int S9EYkSpbGuxq6 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "origin");
                    int S9EYkSpbGuxq7 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "mood");
                    int S9EYkSpbGuxq8 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "carbs");
                    int S9EYkSpbGuxq9 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "dietary");
                    int S9EYkSpbGuxq10 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "vessel");
                    int S9EYkSpbGuxq11 = ng0.S9EYkSpbGuxq(amuv7NJvPxHu, "hint");
                    if (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                        int i2 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq);
                        String dgRBjINgWbAK = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq2);
                        int i3 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq3);
                        String dgRBjINgWbAK2 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq4);
                        int i4 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq5);
                        String dgRBjINgWbAK3 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq6);
                        dgRBjINgWbAK3.getClass();
                        uh1 valueOf = uh1.valueOf(dgRBjINgWbAK3);
                        String dgRBjINgWbAK4 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq7);
                        dgRBjINgWbAK4.getClass();
                        t61 valueOf2 = t61.valueOf(dgRBjINgWbAK4);
                        int i5 = (int) amuv7NJvPxHu.getLong(S9EYkSpbGuxq8);
                        String dgRBjINgWbAK5 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq9);
                        dgRBjINgWbAK5.getClass();
                        a00 valueOf3 = a00.valueOf(dgRBjINgWbAK5);
                        String dgRBjINgWbAK6 = amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq10);
                        dgRBjINgWbAK6.getClass();
                        r2 = new qs0(i2, dgRBjINgWbAK, i3, dgRBjINgWbAK2, i4, valueOf, valueOf2, i5, valueOf3, kq2.valueOf(dgRBjINgWbAK6), amuv7NJvPxHu.dgRBjINgWbAK(S9EYkSpbGuxq11));
                    }
                    return r2;
                } finally {
                    amuv7NJvPxHu.close();
                }
            default:
                ly0 ly0Var = (ly0) obj;
                j72.Companion.getClass();
                j72 PxuCJdSBwIXG = i72.PxuCJdSBwIXG();
                i72.e9gEMXR7LXtO(PxuCJdSBwIXG, i72.lS5Rgt96tfkO(PxuCJdSBwIXG), PxuCJdSBwIXG != null ? PxuCJdSBwIXG.e9gEMXR7LXtO() : null);
                ly0Var.getClass();
                return no2.PxuCJdSBwIXG;
        }
    }

    public /* synthetic */ rs0(jz0 jz0Var, int i) {
        this.OPXfSBeufaJ8 = i;
    }
}
