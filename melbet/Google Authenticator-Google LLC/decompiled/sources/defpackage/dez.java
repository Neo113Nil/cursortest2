package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dez implements gzf {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ dez(long j, int i) {
        this.b = i;
        this.a = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if ((r7 + r5) > r9) goto L40;
     */
    @Override // defpackage.gzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        long j;
        boolean z = false;
        if (this.b != 0) {
            return hdb.c((hel) obj).b(new bpo(this.a, 0)).e();
        }
        dfe dfeVar = (dfe) obj;
        dfeVar.getClass();
        dfg dfgVar = dfeVar.c;
        if (dfgVar == null) {
            dfgVar = dfg.a;
        }
        if (dfgVar.c) {
            dfg dfgVar2 = dfeVar.c;
            if (dfgVar2 == null) {
                dfgVar2 = dfg.a;
            }
            dff b = dff.b(dfgVar2.d);
            if (b == null) {
                b = dff.UNKNOWN_DELAY;
            }
            b.getClass();
            int ordinal = b.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                j = 0;
            } else if (ordinal == 2) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                j = 10000;
            } else if (ordinal == 3) {
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                j = 60000;
            } else {
                if (ordinal != 4) {
                    throw new koj();
                }
                TimeUnit timeUnit3 = TimeUnit.MINUTES;
                j = 600000;
            }
            long j2 = dfeVar.d;
            if (j2 > 0) {
                long j3 = this.a;
                if (j3 >= j2) {
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
