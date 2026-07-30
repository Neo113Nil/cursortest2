package com.yanzhenjie.kalle;

import java.io.OutputStream;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class a implements f {
    private n mProgressBar;

    /* renamed from: com.yanzhenjie.kalle.a$a, reason: collision with other inner class name */
    private static class C0342a implements n {
        private final Executor mExecutor = k.getConfig().getMainExecutor();
        private final n mProgressBar;

        /* renamed from: com.yanzhenjie.kalle.a$a$a, reason: collision with other inner class name */
        class RunnableC0343a implements Runnable {
            final /* synthetic */ f val$origin;
            final /* synthetic */ int val$progress;

            RunnableC0343a(f fVar, int i8) {
                this.val$origin = fVar;
                this.val$progress = i8;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0342a.this.mProgressBar.progress(this.val$origin, this.val$progress);
            }
        }

        public C0342a(n nVar) {
            this.mProgressBar = nVar;
        }

        @Override // com.yanzhenjie.kalle.n
        public void progress(f fVar, int i8) {
            this.mExecutor.execute(new RunnableC0343a(fVar, i8));
        }
    }

    @Override // com.yanzhenjie.kalle.f
    public abstract /* synthetic */ long contentLength();

    @Override // com.yanzhenjie.kalle.f
    public abstract /* synthetic */ String contentType();

    public void onProgress(n nVar) {
        this.mProgressBar = new C0342a(nVar);
    }

    protected abstract void onWrite(OutputStream outputStream);

    @Override // com.yanzhenjie.kalle.f
    public final void writeTo(OutputStream outputStream) {
        if (this.mProgressBar != null) {
            onWrite(new com.yanzhenjie.kalle.util.e(outputStream, this, this.mProgressBar));
        } else {
            onWrite(outputStream);
        }
    }
}
