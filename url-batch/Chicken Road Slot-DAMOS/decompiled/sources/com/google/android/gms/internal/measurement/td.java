package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class td {

    /* renamed from: a, reason: collision with root package name */
    public static final sd f2826a;

    static {
        sd sdVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                Iterator it = Arrays.asList(new sd[0]).iterator();
                if (it.hasNext()) {
                    sdVar = (sd) it.next();
                    i7.a.F("Expected at most one FlagsService", !it.hasNext());
                } else {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    sdVar = new sd();
                }
                f2826a = sdVar;
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
