package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import o2.AbstractC3364y;
import o2.InterfaceC3359v0;
import o2.InterfaceC3360w;
import o2.Q;

/* loaded from: classes.dex */
public final class zzbx {
    public static final Q zza(Task task) {
        final InterfaceC3360w c4 = AbstractC3364y.c(null, 1, null);
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC3360w interfaceC3360w = InterfaceC3360w.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    interfaceC3360w.o(exception);
                } else if (task2.isCanceled()) {
                    InterfaceC3359v0.a.b(interfaceC3360w, null, 1, null);
                } else {
                    interfaceC3360w.J(task2.getResult());
                }
            }
        });
        return new zzbw(c4);
    }
}
