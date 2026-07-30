package com.yanzhenjie.kalle.simple;

import com.yanzhenjie.kalle.q;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
final class l extends a {
    private com.yanzhenjie.kalle.connect.http.b mCall;

    l(k kVar, Type type, Type type2) {
        super(kVar, type, type2);
    }

    @Override // com.yanzhenjie.kalle.simple.a
    public void cancel() {
        com.yanzhenjie.kalle.connect.http.b bVar = this.mCall;
        if (bVar == null || bVar.isCanceled()) {
            return;
        }
        this.mCall.asyncCancel();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yanzhenjie.kalle.simple.a
    public q requestNetwork(k kVar) {
        com.yanzhenjie.kalle.connect.http.b bVar = new com.yanzhenjie.kalle.connect.http.b(kVar);
        this.mCall = bVar;
        return bVar.execute();
    }
}
