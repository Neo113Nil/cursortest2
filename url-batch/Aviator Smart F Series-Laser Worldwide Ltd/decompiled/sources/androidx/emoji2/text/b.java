package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Handler f231h;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f231h.post(runnable);
    }
}
