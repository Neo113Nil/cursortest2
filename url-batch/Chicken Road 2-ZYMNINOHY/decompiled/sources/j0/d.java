package j0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13732a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Looper looper) {
        super(looper);
        this.f13732a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar = this.f13732a;
        int i4 = message.what;
        e eVar = null;
        if (i4 == 1) {
            e eVar2 = (e) message.obj;
            try {
                fVar.f13740a.queueInputBuffer(eVar2.f13733a, 0, eVar2.f13734b, eVar2.f13736d, eVar2.f13737e);
            } catch (RuntimeException e4) {
                AtomicReference atomicReference = fVar.f13743d;
                while (!atomicReference.compareAndSet(null, e4) && atomicReference.get() == null) {
                }
            }
            eVar = eVar2;
        } else if (i4 == 2) {
            e eVar3 = (e) message.obj;
            int i5 = eVar3.f13733a;
            MediaCodec.CryptoInfo cryptoInfo = eVar3.f13735c;
            long j4 = eVar3.f13736d;
            int i6 = eVar3.f13737e;
            try {
                synchronized (f.f13739h) {
                    fVar.f13740a.queueSecureInputBuffer(i5, 0, cryptoInfo, j4, i6);
                }
            } catch (RuntimeException e5) {
                AtomicReference atomicReference2 = fVar.f13743d;
                while (!atomicReference2.compareAndSet(null, e5) && atomicReference2.get() == null) {
                }
            }
            eVar = eVar3;
        } else if (i4 == 3) {
            fVar.f13744e.c();
        } else if (i4 != 4) {
            AtomicReference atomicReference3 = fVar.f13743d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                fVar.f13740a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e6) {
                AtomicReference atomicReference4 = fVar.f13743d;
                while (!atomicReference4.compareAndSet(null, e6) && atomicReference4.get() == null) {
                }
            }
        }
        if (eVar != null) {
            ArrayDeque arrayDeque = f.f13738g;
            synchronized (arrayDeque) {
                arrayDeque.add(eVar);
            }
        }
    }
}
