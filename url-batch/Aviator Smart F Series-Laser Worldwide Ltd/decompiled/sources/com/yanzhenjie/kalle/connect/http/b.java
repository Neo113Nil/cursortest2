package com.yanzhenjie.kalle.connect.http;

import com.yanzhenjie.kalle.k;
import com.yanzhenjie.kalle.o;
import com.yanzhenjie.kalle.q;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class b {
    private static final Executor EXECUTOR = Executors.newCachedThreadPool();
    private boolean isCanceled;
    private boolean isExecuted;
    private d mConnectInterceptor;
    private final o mRequest;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.cancel();
        }
    }

    public b(o oVar) {
        this.mRequest = oVar;
    }

    public void asyncCancel() {
        EXECUTOR.execute(new a());
    }

    public void cancel() {
        if (this.isCanceled) {
            return;
        }
        this.isCanceled = true;
        d dVar = this.mConnectInterceptor;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    public q execute() {
        if (this.isCanceled) {
            throw new CancellationException("The request has been cancelled.");
        }
        this.isExecuted = true;
        ArrayList arrayList = new ArrayList(k.getConfig().getInterceptor());
        d dVar = new d();
        this.mConnectInterceptor = dVar;
        arrayList.add(dVar);
        try {
            return new com.yanzhenjie.kalle.connect.http.a(arrayList, 0, this.mRequest, this).proceed(this.mRequest);
        } catch (Exception e8) {
            if (this.isCanceled) {
                throw new CancellationException("The request has been cancelled.");
            }
            throw e8;
        }
    }

    public boolean isCanceled() {
        return this.isCanceled;
    }

    public boolean isExecuted() {
        return this.isExecuted;
    }
}
