package com.yanzhenjie.kalle.simple;

import com.yanzhenjie.kalle.q;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
final class b extends a {
    private com.yanzhenjie.kalle.connect.http.b mCall;

    b(g gVar, Type type, Type type2) {
        super(gVar, type, type2);
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
    public q requestNetwork(g gVar) {
        com.yanzhenjie.kalle.connect.http.b bVar = new com.yanzhenjie.kalle.connect.http.b(gVar);
        this.mCall = bVar;
        return bVar.execute();
    }
}
