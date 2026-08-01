package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2209a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.measurement.e] */
    static {
        i iVar;
        try {
            iVar = j.f2413a;
        } catch (NoClassDefFoundError unused) {
            iVar = null;
        }
        if (iVar == null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < 3; i3++) {
                String str = e.f2243a[i3];
                try {
                    iVar = (e) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb2.append('\n');
                    sb2.append(str);
                    sb2.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb2.append(th);
                }
            }
            throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
        }
        f2209a = iVar;
    }
}
