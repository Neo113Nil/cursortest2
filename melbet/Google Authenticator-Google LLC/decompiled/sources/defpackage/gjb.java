package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gjb extends kso implements krx {
    public static final gjb a = new gjb();

    public gjb() {
        super(2, gil.class, "<init>", "<init>(Ljava/util/Map;Lcom/google/apps/tiktok/experiments/phenotype/MendelPackageState$Metadata;)V", 0);
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Map map = (Map) obj;
        ghm ghmVar = (ghm) obj2;
        map.getClass();
        ghmVar.getClass();
        return new gil(map, ghmVar);
    }
}
