package com.baidu.mshield.utility;

import android.content.Context;
import android.os.Message;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static Lock f8399a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public static b f8400b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.baidu.mshield.rp.f.a f8401c;

    public b(Context context) {
        this.f8401c = new com.baidu.mshield.rp.f.a(context);
    }

    public static b a(Context context) {
        b bVar = f8400b;
        if (bVar != null) {
            return bVar;
        }
        try {
            f8399a.lock();
            if (f8400b == null) {
                f8400b = new b(context);
            }
            b bVar2 = f8400b;
            f8399a.unlock();
            return bVar2;
        } catch (Throwable th) {
            f8399a.unlock();
            throw th;
        }
    }

    public void b() {
        this.f8401c.e();
    }

    public void c() {
        Message message = new Message();
        message.what = 6;
        this.f8401c.a(message);
    }

    public void d() {
        Message message = new Message();
        message.what = 2;
        this.f8401c.a(message);
    }

    public void e() {
        Message message = new Message();
        message.what = 8;
        this.f8401c.a(message);
    }

    public void a(boolean z7) {
        this.f8401c.a(z7);
    }

    public void a(com.baidu.mshield.rp.d.a aVar) {
        Message message = new Message();
        message.what = 1;
        message.obj = aVar;
        this.f8401c.a(message);
    }

    public void a(com.baidu.mshield.rp.b.a aVar) {
        Message message = new Message();
        message.what = 3;
        message.obj = aVar;
        this.f8401c.a(message);
    }

    public void a(String str) {
        Message message = new Message();
        message.what = 11;
        message.obj = str;
        this.f8401c.a(message);
    }

    public void a() {
        Message message = new Message();
        message.what = 9;
        this.f8401c.a(message);
    }
}
