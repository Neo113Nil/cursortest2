package T0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3050c;

    public /* synthetic */ f(Object obj, int i, int i4) {
        this.f3048a = i4;
        this.f3050c = obj;
        this.f3049b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3048a) {
            case 0:
                h4.c this$0 = (h4.c) this.f3050c;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                WorkDatabase workDatabase = (WorkDatabase) this$0.f38233u;
                Long g9 = workDatabase.l().g("next_job_scheduler_id");
                int i = 0;
                int longValue = g9 != null ? (int) g9.longValue() : 0;
                workDatabase.l().i(new S0.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                if (longValue < 0 || longValue > this.f3049b) {
                    workDatabase.l().i(new S0.d("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i = longValue;
                }
                return Integer.valueOf(i);
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f3050c;
                boolean z8 = lottieAnimationView.f5817F;
                int i4 = this.f3049b;
                if (!z8) {
                    return X0.m.f(lottieAnimationView.getContext(), null, i4);
                }
                Context context = lottieAnimationView.getContext();
                return X0.m.f(context, X0.m.k(context, i4), i4);
        }
    }
}
