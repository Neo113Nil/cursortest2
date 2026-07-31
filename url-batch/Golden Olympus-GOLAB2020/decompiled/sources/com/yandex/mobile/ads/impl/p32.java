package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Message;
import com.yandex.mobile.ads.impl.we0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class p32 implements we0 {

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList f30325b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f30326a;

    private static final class a implements we0.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f30327a;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f30327a = null;
            ArrayList arrayList = p32.f30325b;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.we0.a
        public final void a() {
            Message message = this.f30327a;
            message.getClass();
            message.sendToTarget();
            b();
        }
    }

    public p32(Handler handler) {
        this.f30326a = handler;
    }

    private static a d() {
        a aVar;
        ArrayList arrayList = f30325b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final boolean a(Runnable runnable) {
        return this.f30326a.post(runnable);
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final boolean b() {
        return this.f30326a.hasMessages(0);
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final void c() {
        this.f30326a.removeMessages(2);
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final void a() {
        this.f30326a.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final we0.a b(int i4) {
        a d4 = d();
        d4.f30327a = this.f30326a.obtainMessage(i4);
        return d4;
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final boolean a(int i4) {
        return this.f30326a.sendEmptyMessage(i4);
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final boolean a(long j4) {
        return this.f30326a.sendEmptyMessageAtTime(2, j4);
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final boolean a(we0.a aVar) {
        a aVar2 = (a) aVar;
        Handler handler = this.f30326a;
        Message message = aVar2.f30327a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        aVar2.b();
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final we0.a a(int i4, Object obj) {
        a d4 = d();
        d4.f30327a = this.f30326a.obtainMessage(i4, obj);
        return d4;
    }

    @Override // com.yandex.mobile.ads.impl.we0
    public final we0.a a(int i4, int i5) {
        a d4 = d();
        d4.f30327a = this.f30326a.obtainMessage(1, i4, i5);
        return d4;
    }
}
