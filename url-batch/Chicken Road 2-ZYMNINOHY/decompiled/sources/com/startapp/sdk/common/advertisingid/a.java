package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.k0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f6529a;

    public a(b bVar) {
        this.f6529a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        k0 k0Var;
        try {
            this.f6529a.f6533d.lock();
            try {
                b bVar2 = this.f6529a;
                AtomicReference atomicReference = bVar2.f6535f;
                Context context = bVar2.f6530a;
                try {
                    try {
                        k0Var = b.a(context);
                    } catch (Throwable th) {
                        if (bVar2.a(128)) {
                            d9.a(th);
                        }
                        try {
                            try {
                                k0Var = b.b(context);
                            } catch (AdvertisingIdResolver$InternalException e4) {
                                bVar2.b(e4.infoEventFlags);
                                k0Var = k0.f7168d;
                                atomicReference.set(k0Var);
                                bVar = this.f6529a;
                                bVar.f6537h = 2;
                                this.f6529a.f6534e.signalAll();
                                this.f6529a.f6533d.unlock();
                            }
                        } catch (Throwable th2) {
                            if (bVar2.a(256)) {
                                d9.a(th2);
                            }
                            k0Var = k0.f7168d;
                            atomicReference.set(k0Var);
                            bVar = this.f6529a;
                            bVar.f6537h = 2;
                            this.f6529a.f6534e.signalAll();
                            this.f6529a.f6533d.unlock();
                        }
                        atomicReference.set(k0Var);
                        bVar = this.f6529a;
                        bVar.f6537h = 2;
                        this.f6529a.f6534e.signalAll();
                        this.f6529a.f6533d.unlock();
                    }
                } catch (AdvertisingIdResolver$InternalException e5) {
                    bVar2.b(e5.infoEventFlags);
                    k0Var = b.b(context);
                    atomicReference.set(k0Var);
                    bVar = this.f6529a;
                    bVar.f6537h = 2;
                    this.f6529a.f6534e.signalAll();
                    this.f6529a.f6533d.unlock();
                }
                atomicReference.set(k0Var);
                bVar = this.f6529a;
            } catch (Throwable th3) {
                try {
                    if (this.f6529a.a(64)) {
                        d9.a(th3);
                    }
                    bVar = this.f6529a;
                } catch (Throwable th4) {
                    this.f6529a.f6537h = 2;
                    this.f6529a.f6534e.signalAll();
                    this.f6529a.f6533d.unlock();
                    throw th4;
                }
            }
            bVar.f6537h = 2;
            this.f6529a.f6534e.signalAll();
            this.f6529a.f6533d.unlock();
        } catch (Throwable th5) {
            this.f6529a.f6537h = 2;
            if (this.f6529a.a(16384)) {
                d9.a(th5);
            }
        }
    }
}
