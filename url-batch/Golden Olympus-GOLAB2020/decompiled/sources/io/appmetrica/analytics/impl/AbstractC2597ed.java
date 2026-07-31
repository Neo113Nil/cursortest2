package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2597ed {
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
                        InterfaceC2571dd interfaceC2571dd = (InterfaceC2571dd) c4.get(b4);
                        if (interfaceC2571dd != null) {
                            interfaceC2571dd.a(context);
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
