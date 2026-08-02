package retrofit2;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class AndroidMainExecutor implements Executor {
    public final /* synthetic */ int $r8$classId;
    public final Object handler;

    public AndroidMainExecutor(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 2:
                zao zaoVar = new zao(Looper.getMainLooper());
                Looper.getMainLooper();
                this.handler = zaoVar;
                break;
            default:
                this.handler = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$r8$classId;
        Object obj = this.handler;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            case 1:
                ((WorkManagerTaskExecutor) obj).mMainThreadHandler.post(runnable);
                break;
            default:
                ((zao) obj).post(runnable);
                break;
        }
    }

    public AndroidMainExecutor(WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.$r8$classId = 1;
        this.handler = workManagerTaskExecutor;
    }
}
