package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cob implements Executor {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cob(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                ((Handler) this.a).post(runnable);
                break;
            case 1:
                ((Handler) ((ldt) this.a).b).post(runnable);
                break;
            case 2:
                ((Handler) this.a).post(runnable);
                break;
            case 3:
                runnable.getClass();
                ((die) this.a).d(runnable);
                break;
            case 4:
                runnable.getClass();
                ((die) this.a).d(runnable);
                break;
            case 5:
                runnable.getClass();
                ((die) this.a).d(runnable);
                break;
            case 6:
                runnable.getClass();
                ((die) this.a).d(runnable);
                break;
            default:
                runnable.getClass();
                ((die) this.a).d(runnable);
                break;
        }
    }

    public cob(ldt ldtVar, int i) {
        this.b = i;
        this.a = ldtVar;
    }
}
