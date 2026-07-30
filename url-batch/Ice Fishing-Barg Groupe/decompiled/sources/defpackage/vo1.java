package defpackage;

import android.database.SQLException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vo1 implements tk2, zr1 {
    public final jx1 PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final da Y1f8riQaR6yg;
    public volatile boolean e9gEMXR7LXtO;
    public final gr lS5Rgt96tfkO;

    public vo1(jx1 jx1Var, gr grVar, boolean z) {
        jx1Var.getClass();
        this.PxuCJdSBwIXG = jx1Var;
        this.lS5Rgt96tfkO = grVar;
        this.TSizfFm2Yiuu = z;
        this.Y1f8riQaR6yg = new da();
    }

    @Override // defpackage.tk2
    public final Object PxuCJdSBwIXG(sk2 sk2Var, pe0 pe0Var, jc2 jc2Var) {
        if (this.e9gEMXR7LXtO) {
            sj0.zf8DYfih6EZu("Connection is recycled", 21);
            throw null;
        }
        hu huVar = jc2Var.OPXfSBeufaJ8;
        huVar.getClass();
        oq oqVar = (oq) huVar.S2OOm9zPNm0h(this.PxuCJdSBwIXG);
        if (oqVar != null && oqVar.OPXfSBeufaJ8 == this) {
            return RAsUl2FVSrh6(sk2Var, pe0Var, jc2Var);
        }
        sj0.zf8DYfih6EZu("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        if (e9gEMXR7LXtO(r11, r0) == r8) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RAsUl2FVSrh6(sk2 sk2Var, pe0 pe0Var, ct ctVar) {
        to1 to1Var;
        Object obj;
        int i;
        Object obj2;
        SQLException e;
        Throwable th;
        int i2;
        try {
            if (ctVar instanceof to1) {
                to1Var = (to1) ctVar;
                int i3 = to1Var.gPXPFXrUH4XX;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    to1Var.gPXPFXrUH4XX = i3 - Integer.MIN_VALUE;
                    obj = to1Var.r3s1LDPKFs1S;
                    i = to1Var.gPXPFXrUH4XX;
                    obj2 = su.rtx2ld2ELZv4;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        if (sk2Var == null) {
                            sk2Var = sk2.rtx2ld2ELZv4;
                        }
                        to1Var.dgRBjINgWbAK = pe0Var;
                        to1Var.gPXPFXrUH4XX = 1;
                    } else if (i == 1) {
                        pe0Var = (pe0) to1Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                    } else {
                        if (i == 2) {
                            i2 = to1Var.cpQdD2nAriOS;
                            ng0.tmVwIGCQF4zR(obj);
                            boolean z = i2 != 0;
                            to1Var.dgRBjINgWbAK = obj;
                            to1Var.gPXPFXrUH4XX = 3;
                            return a92UlCVFR9N8(z, to1Var) != obj2 ? obj2 : obj;
                        }
                        if (i == 3 || i == 4) {
                            Object obj3 = to1Var.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj);
                            return obj3;
                        }
                        if (i != 5) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = to1Var.x50lh2ztY7Y5;
                        th = (Throwable) to1Var.dgRBjINgWbAK;
                        try {
                            ng0.tmVwIGCQF4zR(obj);
                            throw th;
                        } catch (SQLException e2) {
                            e = e2;
                            if (th != null) {
                            }
                        }
                    }
                    qj1 qj1Var = new qj1(1, this);
                    to1Var.dgRBjINgWbAK = null;
                    to1Var.cpQdD2nAriOS = 1;
                    to1Var.gPXPFXrUH4XX = 2;
                    obj = pe0Var.rtx2ld2ELZv4(qj1Var, to1Var);
                    if (obj != obj2) {
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        to1Var.dgRBjINgWbAK = obj;
                        to1Var.gPXPFXrUH4XX = 3;
                        if (a92UlCVFR9N8(z, to1Var) != obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            qj1 qj1Var2 = new qj1(1, this);
            to1Var.dgRBjINgWbAK = null;
            to1Var.cpQdD2nAriOS = 1;
            to1Var.gPXPFXrUH4XX = 2;
            obj = pe0Var.rtx2ld2ELZv4(qj1Var2, to1Var);
            if (obj != obj2) {
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    to1Var.dgRBjINgWbAK = th;
                    to1Var.x50lh2ztY7Y5 = th3;
                    to1Var.gPXPFXrUH4XX = 5;
                    if (a92UlCVFR9N8(false, to1Var) != obj2) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    f2.RAsUl2FVSrh6(th, e);
                    throw th;
                }
            }
        }
        to1Var = new to1(this, ctVar);
        obj = to1Var.r3s1LDPKFs1S;
        i = to1Var.gPXPFXrUH4XX;
        obj2 = su.rtx2ld2ELZv4;
    }

    @Override // defpackage.tk2
    public final Boolean TSizfFm2Yiuu(bt btVar) {
        if (this.e9gEMXR7LXtO) {
            sj0.zf8DYfih6EZu("Connection is recycled", 21);
            throw null;
        }
        hu huVar = ((ct) btVar).OPXfSBeufaJ8;
        huVar.getClass();
        oq oqVar = (oq) huVar.S2OOm9zPNm0h(this.PxuCJdSBwIXG);
        if (oqVar != null && oqVar.OPXfSBeufaJ8 == this) {
            return Boolean.valueOf(!this.Y1f8riQaR6yg.isEmpty() || this.lS5Rgt96tfkO.rtx2ld2ELZv4.S9EYkSpbGuxq());
        }
        sj0.zf8DYfih6EZu("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.oo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Y1f8riQaR6yg(String str, le0 le0Var, ct ctVar) {
        uo1 uo1Var;
        int i;
        gr grVar;
        try {
            try {
                if (ctVar instanceof uo1) {
                    uo1Var = (uo1) ctVar;
                    int i2 = uo1Var.gPXPFXrUH4XX;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        uo1Var.gPXPFXrUH4XX = i2 - Integer.MIN_VALUE;
                        Object obj = uo1Var.r3s1LDPKFs1S;
                        su suVar = su.rtx2ld2ELZv4;
                        i = uo1Var.gPXPFXrUH4XX;
                        if (i != 0) {
                            ng0.tmVwIGCQF4zR(obj);
                            if (this.e9gEMXR7LXtO) {
                                sj0.zf8DYfih6EZu("Connection is recycled", 21);
                                throw null;
                            }
                            hu huVar = uo1Var.OPXfSBeufaJ8;
                            huVar.getClass();
                            oq oqVar = (oq) huVar.S2OOm9zPNm0h(this.PxuCJdSBwIXG);
                            if (oqVar == null || oqVar.OPXfSBeufaJ8 != this) {
                                sj0.zf8DYfih6EZu("Attempted to use connection on a different coroutine", 21);
                                throw null;
                            }
                            grVar = this.lS5Rgt96tfkO;
                            uo1Var.dgRBjINgWbAK = str;
                            uo1Var.x50lh2ztY7Y5 = le0Var;
                            uo1Var.cpQdD2nAriOS = grVar;
                            uo1Var.gPXPFXrUH4XX = 1;
                            if (grVar.OPXfSBeufaJ8.a92UlCVFR9N8(uo1Var) == suVar) {
                                return suVar;
                            }
                        } else {
                            if (i != 1) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gr grVar2 = uo1Var.cpQdD2nAriOS;
                            le0Var = uo1Var.x50lh2ztY7Y5;
                            String str2 = uo1Var.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj);
                            grVar = grVar2;
                            str = str2;
                        }
                        po1 po1Var = new po1(this, this.lS5Rgt96tfkO.amuv7NJvPxHu(str));
                        Object OPXfSBeufaJ8 = le0Var.OPXfSBeufaJ8(po1Var);
                        cs0.r3s1LDPKFs1S(po1Var, null);
                        return OPXfSBeufaJ8;
                    }
                }
                Object OPXfSBeufaJ82 = le0Var.OPXfSBeufaJ8(po1Var);
                cs0.r3s1LDPKFs1S(po1Var, null);
                return OPXfSBeufaJ82;
            } finally {
            }
            po1 po1Var2 = new po1(this, this.lS5Rgt96tfkO.amuv7NJvPxHu(str));
        } finally {
            grVar.lS5Rgt96tfkO(null);
        }
        uo1Var = new uo1(this, ctVar);
        Object obj2 = uo1Var.r3s1LDPKFs1S;
        su suVar2 = su.rtx2ld2ELZv4;
        i = uo1Var.gPXPFXrUH4XX;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a92UlCVFR9N8(boolean z, ct ctVar) {
        so1 so1Var;
        int i;
        gr grVar;
        da daVar = this.Y1f8riQaR6yg;
        try {
            if (ctVar instanceof so1) {
                so1Var = (so1) ctVar;
                int i2 = so1Var.QrzZRwfaDlRX;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    so1Var.QrzZRwfaDlRX = i2 - Integer.MIN_VALUE;
                    Object obj = so1Var.cpQdD2nAriOS;
                    i = so1Var.QrzZRwfaDlRX;
                    gr grVar2 = this.lS5Rgt96tfkO;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        so1Var.x50lh2ztY7Y5 = grVar2;
                        so1Var.dgRBjINgWbAK = z;
                        so1Var.QrzZRwfaDlRX = 1;
                        Object a92UlCVFR9N8 = grVar2.OPXfSBeufaJ8.a92UlCVFR9N8(so1Var);
                        su suVar = su.rtx2ld2ELZv4;
                        if (a92UlCVFR9N8 == suVar) {
                            return suVar;
                        }
                        grVar = grVar2;
                    } else {
                        if (i != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = so1Var.dgRBjINgWbAK;
                        grVar = so1Var.x50lh2ztY7Y5;
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    if (!daVar.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    qo1 qo1Var = (qo1) el.W7ceZOzvrRuI(daVar);
                    if (z) {
                        qo1Var.getClass();
                        if (daVar.isEmpty()) {
                            sj0.S9EYkSpbGuxq(grVar2, "END TRANSACTION");
                        } else {
                            sj0.S9EYkSpbGuxq(grVar2, "RELEASE SAVEPOINT '" + qo1Var.PxuCJdSBwIXG + '\'');
                        }
                    } else if (daVar.isEmpty()) {
                        sj0.S9EYkSpbGuxq(grVar2, "ROLLBACK TRANSACTION");
                    } else {
                        sj0.S9EYkSpbGuxq(grVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + qo1Var.PxuCJdSBwIXG + '\'');
                    }
                    no2 no2Var = no2.PxuCJdSBwIXG;
                    grVar.lS5Rgt96tfkO(null);
                    return no2Var;
                }
            }
            if (!daVar.isEmpty()) {
            }
        } catch (Throwable th) {
            grVar.lS5Rgt96tfkO(null);
            throw th;
        }
        so1Var = new so1(this, ctVar);
        Object obj2 = so1Var.cpQdD2nAriOS;
        i = so1Var.QrzZRwfaDlRX;
        gr grVar22 = this.lS5Rgt96tfkO;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e9gEMXR7LXtO(sk2 sk2Var, ct ctVar) {
        ro1 ro1Var;
        int i;
        gr grVar;
        da daVar = this.Y1f8riQaR6yg;
        try {
            if (ctVar instanceof ro1) {
                ro1Var = (ro1) ctVar;
                int i2 = ro1Var.QrzZRwfaDlRX;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ro1Var.QrzZRwfaDlRX = i2 - Integer.MIN_VALUE;
                    Object obj = ro1Var.cpQdD2nAriOS;
                    i = ro1Var.QrzZRwfaDlRX;
                    gr grVar2 = this.lS5Rgt96tfkO;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        ro1Var.dgRBjINgWbAK = sk2Var;
                        ro1Var.x50lh2ztY7Y5 = grVar2;
                        ro1Var.QrzZRwfaDlRX = 1;
                        Object a92UlCVFR9N8 = grVar2.OPXfSBeufaJ8.a92UlCVFR9N8(ro1Var);
                        su suVar = su.rtx2ld2ELZv4;
                        if (a92UlCVFR9N8 == suVar) {
                            return suVar;
                        }
                        grVar = grVar2;
                    } else {
                        if (i != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gr grVar3 = ro1Var.x50lh2ztY7Y5;
                        sk2 sk2Var2 = ro1Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        grVar = grVar3;
                        sk2Var = sk2Var2;
                    }
                    int i3 = daVar.wdg6QnbFHrFF;
                    if (daVar.isEmpty()) {
                        sj0.S9EYkSpbGuxq(grVar2, "SAVEPOINT '" + i3 + '\'');
                    } else {
                        int ordinal = sk2Var.ordinal();
                        if (ordinal == 0) {
                            sj0.S9EYkSpbGuxq(grVar2, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            sj0.S9EYkSpbGuxq(grVar2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new tm();
                            }
                            sj0.S9EYkSpbGuxq(grVar2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    daVar.addLast(new qo1(i3));
                    no2 no2Var = no2.PxuCJdSBwIXG;
                    grVar.lS5Rgt96tfkO(null);
                    return no2Var;
                }
            }
            int i32 = daVar.wdg6QnbFHrFF;
            if (daVar.isEmpty()) {
            }
            daVar.addLast(new qo1(i32));
            no2 no2Var2 = no2.PxuCJdSBwIXG;
            grVar.lS5Rgt96tfkO(null);
            return no2Var2;
        } catch (Throwable th) {
            grVar.lS5Rgt96tfkO(null);
            throw th;
        }
        ro1Var = new ro1(this, ctVar);
        Object obj2 = ro1Var.cpQdD2nAriOS;
        i = ro1Var.QrzZRwfaDlRX;
        gr grVar22 = this.lS5Rgt96tfkO;
        if (i != 0) {
        }
    }

    @Override // defpackage.zr1
    public final fy1 lS5Rgt96tfkO() {
        return this.lS5Rgt96tfkO;
    }
}
