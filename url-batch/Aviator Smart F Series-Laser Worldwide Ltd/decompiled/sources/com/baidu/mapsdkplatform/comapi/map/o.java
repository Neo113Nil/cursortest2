package com.baidu.mapsdkplatform.comapi.map;

import android.os.Message;

/* loaded from: classes2.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private n f8131a;

    o() {
    }

    void a(n nVar) {
        this.f8131a = nVar;
    }

    void b(n nVar) {
        this.f8131a = null;
    }

    void a(Message message) {
        if (message.what != 65289) {
            return;
        }
        int i8 = message.arg1;
        if (i8 != 12 && i8 != 101 && i8 != 102) {
            switch (i8) {
            }
            return;
        }
        n nVar = this.f8131a;
        if (nVar != null) {
            nVar.a(i8, message.arg2);
        }
    }
}
