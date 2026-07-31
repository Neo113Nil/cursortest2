package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes.dex */
final class n94 {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
