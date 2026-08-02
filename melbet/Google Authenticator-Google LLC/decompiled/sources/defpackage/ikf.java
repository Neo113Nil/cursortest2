package defpackage;

import android.content.Context;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ikf implements iaj {
    private final /* synthetic */ int a;

    public /* synthetic */ ikf(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.iaj
    public final Object a(iai iaiVar) {
        switch (this.a) {
            case 0:
                return new ikt();
            case 1:
                return new ikz();
            case 2:
                return new ikk(hnu.au(iaiVar, ikj.class));
            case 3:
                iaiVar.b(ikt.class);
                return new ikp();
            case 4:
                ikm ikmVar = new ikm();
                cov covVar = new cov(16);
                Object obj = ikmVar.a;
                ?? r1 = ikmVar.b;
                r1.add(new ikl(ikmVar, (ReferenceQueue) obj, r1, covVar));
                Thread thread = new Thread(new iep(obj, (Object) r1, 17), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return ikmVar;
            case 5:
                return new ikn();
            case 6:
                return new ikg();
            case 7:
                return new ikj(ikh.class, iaiVar.b(ikg.class));
            case 8:
                return new ikx((Context) iaiVar.d(Context.class));
            default:
                return new jfe(hnu.au(iaiVar, jfd.class));
        }
    }
}
