package com.google.firebase.datastorage;

import defpackage.b42;
import defpackage.d42;
import defpackage.on1;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class JavaDataStorageKt {
    public static final <T> T getOrDefault(d42 d42Var, b42 b42Var, T t) {
        d42Var.getClass();
        b42Var.getClass();
        Object obj = (T) ((on1) d42Var).a.get(b42Var);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = (T) Arrays.copyOf(bArr, bArr.length);
        }
        return obj == null ? t : (T) obj;
    }
}
