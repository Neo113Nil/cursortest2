package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class v51 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ z51 n;
    public final /* synthetic */ a61 o;

    public /* synthetic */ v51(z51 z51Var, a61 a61Var, int i) {
        this.m = i;
        this.n = z51Var;
        this.o = a61Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uc2 M;
        long j;
        int i = this.m;
        a61 a61Var = this.o;
        z51 z51Var = this.n;
        nc2 nc2Var = (nc2) obj;
        switch (i) {
            case 0:
                nc2Var.getClass();
                u30 u30Var = z51Var.d;
                if (a61Var != null) {
                    M = nc2Var.M("UPDATE OR ABORT `jewelry_item` SET `id` = ?,`name` = ?,`type` = ?,`metal` = ?,`fineness` = ?,`weightGrams` = ?,`purchaseDateEpochDay` = ?,`place` = ?,`valueEntered` = ?,`notes` = ?,`photoUri` = ?,`favourite` = ?,`createdAt` = ? WHERE `id` = ?");
                    try {
                        u30Var.e(M, a61Var);
                        M.E();
                        yk3.w(M, null);
                        s93.H(nc2Var);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return Unit.a;
            default:
                nc2Var.getClass();
                fk fkVar = z51Var.b;
                if (a61Var != null) {
                    M = nc2Var.M("INSERT OR REPLACE INTO `jewelry_item` (`id`,`name`,`type`,`metal`,`fineness`,`weightGrams`,`purchaseDateEpochDay`,`place`,`valueEntered`,`notes`,`photoUri`,`favourite`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)");
                    try {
                        fkVar.k(M, a61Var);
                        M.E();
                        yk3.w(M, null);
                        if (s93.H(nc2Var) != 0) {
                            M = nc2Var.M("SELECT last_insert_rowid()");
                            try {
                                M.E();
                                long j2 = M.getLong(0);
                                yk3.w(M, null);
                                j = j2;
                                return Long.valueOf(j);
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                j = -1;
                return Long.valueOf(j);
        }
    }
}
