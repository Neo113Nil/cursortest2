package defpackage;

import com.facebook.internal.Utility;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class xg2 {
    public static final ug2 a = new ug2(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(ug2 ug2Var) {
        ug2Var.getClass();
        if (ug2Var.f != null || ug2Var.g != null) {
            lh.e("Failed requirement.");
            return;
        }
        if (ug2Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        ug2 ug2Var2 = a;
        ug2 ug2Var3 = (ug2) atomicReference.getAndSet(ug2Var2);
        if (ug2Var3 == ug2Var2) {
            return;
        }
        int i = ug2Var3 != null ? ug2Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(ug2Var3);
            return;
        }
        ug2Var.f = ug2Var3;
        ug2Var.b = 0;
        ug2Var.c = i + Utility.DEFAULT_STREAM_BUFFER_SIZE;
        atomicReference.set(ug2Var);
    }

    public static final ug2 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        ug2 ug2Var = a;
        ug2 ug2Var2 = (ug2) atomicReference.getAndSet(ug2Var);
        if (ug2Var2 == ug2Var) {
            return new ug2();
        }
        if (ug2Var2 == null) {
            atomicReference.set(null);
            return new ug2();
        }
        atomicReference.set(ug2Var2.f);
        ug2Var2.f = null;
        ug2Var2.c = 0;
        return ug2Var2;
    }
}
