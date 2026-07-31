package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.n8;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f158a;

    public a(b bVar) {
        this.f158a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var;
        try {
            this.f158a.d.lock();
            try {
                b bVar = this.f158a;
                AtomicReference atomicReference = bVar.f;
                Context context = bVar.f159a;
                try {
                    h0Var = b.a(context);
                } catch (AdvertisingIdResolver$InternalException e) {
                    bVar.b(e.infoEventFlags);
                    try {
                        try {
                            h0Var = b.b(context);
                        } catch (AdvertisingIdResolver$InternalException e2) {
                            bVar.b(e2.infoEventFlags);
                            h0Var = h0.d;
                            atomicReference.set(h0Var);
                        }
                    } catch (Throwable th) {
                        if (bVar.a(256)) {
                            n8.a(th);
                        }
                        h0Var = h0.d;
                        atomicReference.set(h0Var);
                    }
                    atomicReference.set(h0Var);
                } catch (Throwable th2) {
                    if (bVar.a(128)) {
                        n8.a(th2);
                    }
                    h0Var = b.b(context);
                    atomicReference.set(h0Var);
                }
                atomicReference.set(h0Var);
            } catch (Throwable th3) {
                try {
                    if (this.f158a.a(64)) {
                        n8.a(th3);
                    }
                } finally {
                    this.f158a.h = 2;
                    this.f158a.e.signalAll();
                    this.f158a.d.unlock();
                }
            }
        } catch (Throwable th4) {
            this.f158a.h = 2;
            if (this.f158a.a(16384)) {
                n8.a(th4);
            }
        }
    }
}
