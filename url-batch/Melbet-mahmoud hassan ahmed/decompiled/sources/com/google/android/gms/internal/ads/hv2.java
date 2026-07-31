package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
final class hv2 implements g42 {

    /* renamed from: a, reason: collision with root package name */
    private Message f6435a;

    /* renamed from: b, reason: collision with root package name */
    private iw2 f6436b;

    private hv2() {
    }

    /* synthetic */ hv2(gu2 gu2Var) {
    }

    private final void c() {
        this.f6435a = null;
        this.f6436b = null;
        iw2.a(this);
    }

    public final hv2 a(Message message, iw2 iw2Var) {
        this.f6435a = message;
        this.f6436b = iw2Var;
        return this;
    }

    public final boolean b(Handler handler) {
        Message message = this.f6435a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        c();
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final void zza() {
        Message message = this.f6435a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        c();
    }
}
