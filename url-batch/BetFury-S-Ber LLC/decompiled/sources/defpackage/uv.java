package defpackage;

import android.content.Intent;
import com.trembin.nirefon.betfury.data.NoteDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class uv {
    public final NoteDatabase_Impl a;
    public final String[] b;
    public final bk0 c;
    public final LinkedHashMap d;
    public final ReentrantLock e;
    public final z1 f;
    public final z1 g;
    public final i5 h;
    public Intent i;
    public w20 j;
    public final Object k;

    public uv(NoteDatabase_Impl noteDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = noteDatabase_Impl;
        this.b = strArr;
        bk0 bk0Var = new bk0(noteDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, noteDatabase_Impl.getUseTempTrackingTable$room_runtime_release(), new tv(1, this, uv.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 0));
        this.c = bk0Var;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new z1(this, 3);
        this.g = new z1(this, 4);
        this.h = new i5(noteDatabase_Impl);
        this.k = new Object();
        bk0Var.k = new h2(3, this);
    }

    public final boolean a(rv rvVar) {
        LinkedHashMap linkedHashMap = this.d;
        String[] strArr = rvVar.a;
        bk0 bk0Var = this.c;
        k50 g = bk0Var.g(strArr);
        String[] strArr2 = (String[]) g.f;
        int[] iArr = (int[]) g.g;
        l40 l40Var = new l40(rvVar, iArr, strArr2);
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            l40 l40Var2 = linkedHashMap.containsKey(rvVar) ? (l40) vz.Y(linkedHashMap, rvVar) : (l40) linkedHashMap.put(rvVar, l40Var);
            reentrantLock.unlock();
            if (l40Var2 == null) {
                dq dqVar = bk0Var.h;
                dqVar.getClass();
                ReentrantLock reentrantLock2 = (ReentrantLock) dqVar.b;
                reentrantLock2.lock();
                try {
                    boolean z = false;
                    for (int i : iArr) {
                        long[] jArr = (long[]) dqVar.c;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            dqVar.a = true;
                            z = true;
                        }
                    }
                    if (z) {
                        return true;
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }
            return false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(rv rvVar) {
        int i;
        rvVar.getClass();
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            l40 l40Var = (l40) this.d.remove(rvVar);
            if (l40Var != null) {
                int[] iArr = l40Var.b;
                bk0 bk0Var = this.c;
                bk0Var.getClass();
                iArr.getClass();
                dq dqVar = bk0Var.h;
                dqVar.getClass();
                ReentrantLock reentrantLock2 = (ReentrantLock) dqVar.b;
                reentrantLock2.lock();
                try {
                    int length = iArr.length;
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        i = 1;
                        if (i2 >= length) {
                            break;
                        }
                        int i3 = iArr[i2];
                        long[] jArr = (long[]) dqVar.c;
                        long j = jArr[i3];
                        jArr[i3] = j - 1;
                        if (j == 1) {
                            dqVar.a = true;
                            z = true;
                        }
                        i2++;
                    }
                    if (z) {
                        d50.U(new sv(this, null, i));
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object c(tg0 tg0Var) {
        Object f;
        NoteDatabase_Impl noteDatabase_Impl = this.a;
        return ((!noteDatabase_Impl.inCompatibilityMode$room_runtime_release() || noteDatabase_Impl.isOpenInternal()) && (f = this.c.f(tg0Var)) == bh.COROUTINE_SUSPENDED) ? f : sk0.a;
    }
}
