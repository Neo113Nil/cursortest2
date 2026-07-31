package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ro2 {
    public static <T> void a(AtomicReference<T> atomicReference, qo2<T> qo2Var) {
        T t6 = atomicReference.get();
        if (t6 == null) {
            return;
        }
        try {
            qo2Var.c(t6);
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        } catch (NullPointerException e8) {
            io0.h("NullPointerException occurs when invoking a method from a delegating listener.", e8);
        }
    }
}
