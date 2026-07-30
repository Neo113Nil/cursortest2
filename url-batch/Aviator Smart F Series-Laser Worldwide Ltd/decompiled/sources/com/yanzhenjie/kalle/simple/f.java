package com.yanzhenjie.kalle.simple;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class f {
    private static f sInstance;
    private final Executor mExecutor = com.yanzhenjie.kalle.k.getConfig().getWorkExecutor();
    private final com.yanzhenjie.kalle.d mCancelManager = new com.yanzhenjie.kalle.d();

    class a extends c {
        final /* synthetic */ k val$request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, k kVar) {
            super(dVar);
            this.val$request = kVar;
        }

        @Override // com.yanzhenjie.kalle.simple.f.c, com.yanzhenjie.kalle.simple.d
        public void onEnd() {
            super.onEnd();
            f.this.mCancelManager.removeCancel(this.val$request);
        }
    }

    class b extends c {
        final /* synthetic */ g val$request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, g gVar) {
            super(dVar);
            this.val$request = gVar;
        }

        @Override // com.yanzhenjie.kalle.simple.f.c, com.yanzhenjie.kalle.simple.d
        public void onEnd() {
            super.onEnd();
            f.this.mCancelManager.removeCancel(this.val$request);
        }
    }

    private static class c extends com.yanzhenjie.kalle.simple.d {
        private final com.yanzhenjie.kalle.simple.d mCallback;
        private final Executor mExecutor = com.yanzhenjie.kalle.k.getConfig().getMainExecutor();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.mCallback.onStart();
            }
        }

        class b implements Runnable {
            final /* synthetic */ j val$response;

            b(j jVar) {
                this.val$response = jVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.mCallback.onResponse(this.val$response);
            }
        }

        /* renamed from: com.yanzhenjie.kalle.simple.f$c$c, reason: collision with other inner class name */
        class RunnableC0348c implements Runnable {
            final /* synthetic */ Exception val$e;

            RunnableC0348c(Exception exc) {
                this.val$e = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.mCallback.onException(this.val$e);
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.mCallback.onCancel();
            }
        }

        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.mCallback.onEnd();
            }
        }

        c(com.yanzhenjie.kalle.simple.d dVar) {
            this.mCallback = dVar;
        }

        @Override // com.yanzhenjie.kalle.simple.d
        public Type getFailed() {
            return this.mCallback.getFailed();
        }

        @Override // com.yanzhenjie.kalle.simple.d
        public Type getSucceed() {
            return this.mCallback.getSucceed();
        }

        @Override // com.yanzhenjie.kalle.simple.d
        public void onCancel() {
            if (this.mCallback == null) {
                return;
            }
            this.mExecutor.execute(new d());
        }

        @Override // com.yanzhenjie.kalle.simple.d
        public void onEnd() {
            if (this.mCallback == null) {
                return;
            }
            this.mExecutor.execute(new e());
        }

        @Override // com.yanzhenjie.kalle.simple.d
        public void onException(Exception exc) {
            if (this.mCallback == null) {
                return;
            }
            this.mExecutor.execute(new RunnableC0348c(exc));
        }

        @Override // com.yanzhenjie.kalle.simple.d
        public void onResponse(j jVar) {
            if (this.mCallback == null) {
                return;
            }
            this.mExecutor.execute(new b(jVar));
        }

        @Override // com.yanzhenjie.kalle.simple.d
        public void onStart() {
            if (this.mCallback == null) {
                return;
            }
            this.mExecutor.execute(new a());
        }
    }

    private f() {
    }

    public static f getInstance() {
        if (sInstance == null) {
            synchronized (f.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new f();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    public void cancel(Object obj) {
        this.mCancelManager.cancel(obj);
    }

    public <S, F> com.yanzhenjie.kalle.e perform(k kVar, d dVar) {
        m mVar = new m(new l(kVar, dVar.getSucceed(), dVar.getFailed()), new a(dVar, kVar));
        this.mCancelManager.addCancel(kVar, mVar);
        this.mExecutor.execute(mVar);
        return mVar;
    }

    public <S, F> j perform(k kVar, Type type, Type type2) {
        return new l(kVar, type, type2).call();
    }

    public <S, F> com.yanzhenjie.kalle.e perform(g gVar, d dVar) {
        m mVar = new m(new com.yanzhenjie.kalle.simple.b(gVar, dVar.getSucceed(), dVar.getFailed()), new b(dVar, gVar));
        this.mCancelManager.addCancel(gVar, mVar);
        this.mExecutor.execute(mVar);
        return mVar;
    }

    public <S, F> j perform(g gVar, Type type, Type type2) {
        return new com.yanzhenjie.kalle.simple.b(gVar, type, type2).call();
    }
}
