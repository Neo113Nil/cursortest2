package com.startapp.sdk.internal;

import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class pd {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f380a;
    public final UUID b = UUID.randomUUID();
    public final JobRequest$Network c;
    public final boolean d;
    public final Long e;

    public pd(od odVar) {
        this.f380a = odVar.f365a;
        this.c = odVar.b;
        this.d = odVar.c;
        this.e = odVar.d;
    }

    public static int a(Class... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            strArr[i] = clsArr[i].getName();
        }
        return Math.abs(Arrays.hashCode(strArr));
    }
}
