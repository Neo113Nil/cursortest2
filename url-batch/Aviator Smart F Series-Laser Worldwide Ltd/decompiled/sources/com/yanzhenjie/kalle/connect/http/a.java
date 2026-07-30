package com.yanzhenjie.kalle.connect.http;

import com.yanzhenjie.kalle.o;
import com.yanzhenjie.kalle.q;
import java.util.List;

/* loaded from: classes4.dex */
class a implements c {
    private b mCall;
    private final List<com.yanzhenjie.kalle.connect.c> mInterceptors;
    private final o mRequest;
    private final int mTargetIndex;

    a(List<com.yanzhenjie.kalle.connect.c> list, int i8, o oVar, b bVar) {
        this.mInterceptors = list;
        this.mTargetIndex = i8;
        this.mRequest = oVar;
        this.mCall = bVar;
    }

    @Override // com.yanzhenjie.kalle.connect.http.c
    public b call() {
        return this.mCall;
    }

    @Override // com.yanzhenjie.kalle.connect.http.c
    public b newCall() {
        return this.mCall;
    }

    @Override // com.yanzhenjie.kalle.connect.http.c
    public q proceed(o oVar) {
        return this.mInterceptors.get(this.mTargetIndex).intercept(new a(this.mInterceptors, this.mTargetIndex + 1, oVar, this.mCall));
    }

    @Override // com.yanzhenjie.kalle.connect.http.c
    public o request() {
        return this.mRequest;
    }
}
