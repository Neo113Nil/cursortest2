package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class u00 implements Callable<Boolean> {
    u00() {
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
