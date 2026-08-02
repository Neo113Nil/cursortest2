package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* loaded from: classes.dex */
public abstract class Jc {
    public abstract void a(int i4);

    public final synchronized void a(Context context) {
        try {
            int b4 = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (b4 != libraryApiLevel) {
                if (b4 < libraryApiLevel) {
                    SparseArray c4 = c();
                    while (true) {
                        b4++;
                        if (b4 > libraryApiLevel) {
                            break;
                        }
                        Ic ic = (Ic) c4.get(b4);
                        if (ic != null) {
                            ic.a(context);
                        }
                    }
                }
                a(libraryApiLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int b();

    public abstract SparseArray c();

    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
