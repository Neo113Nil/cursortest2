package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* loaded from: classes2.dex */
class qt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f18886a;

    /* renamed from: b, reason: collision with root package name */
    private final db f18887b;

    qt(db dbVar, Handler handler) {
        this.f18887b = dbVar;
        this.f18886a = handler;
    }

    Message a() {
        return new Message();
    }

    @Override // java.lang.Runnable
    public void run() {
        int b4;
        oh ohVar = new oh(this.f18887b.b().getParent(), this.f18887b.b().getName());
        Message a4 = a();
        a4.obj = ohVar;
        String a5 = a(ohVar.getParent());
        if (a5 == null) {
            b4 = 1020;
        } else {
            eb call = a(new db(ohVar, this.f18887b.e(), this.f18887b.a(), this.f18887b.c(), this.f18887b.f(), this.f18887b.d()), a5, 3L).call();
            b4 = call.b() == 200 ? d9.f15851l : call.b();
        }
        a4.what = b4;
        this.f18886a.sendMessage(a4);
    }

    yc a(db dbVar, String str, long j4) {
        return new yc(dbVar, str, j4);
    }

    String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
