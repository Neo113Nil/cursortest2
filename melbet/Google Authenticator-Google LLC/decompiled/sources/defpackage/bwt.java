package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bwt implements gzr {
    private final /* synthetic */ int a;

    public /* synthetic */ bwt(int i) {
        this.a = i;
    }

    @Override // defpackage.gzr
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return !((fuf) obj).b.k.equals("pseudonymous");
            case 1:
                return ((fuf) obj).b.k.equals("pseudonymous");
            case 2:
                return ((fuf) obj).b.k.equals("pseudonymous");
            case 3:
                return ((byj) obj).c;
            case 4:
                return ((gzp) obj).f();
            case 5:
                ((jit) obj).getClass();
                return false;
            case 6:
                cvl cvlVar = ((dqw) obj).b;
                return cvlVar.g && !cvlVar.h;
            case 7:
                return !TextUtils.isEmpty((String) obj);
            case 8:
                return !((fue) obj).a;
            case 9:
                return ((Pair) obj).second != null;
            case 10:
                return ((String) obj).startsWith("com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker");
            default:
                Logger logger = hqq.a;
                return true;
        }
    }
}
