package com.startapp.sdk.internal;

import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f6809a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f6810b = UUID.randomUUID();

    /* renamed from: c, reason: collision with root package name */
    public final JobRequest$Network f6811c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6812d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f6813e;

    public de(ce ceVar) {
        this.f6809a = ceVar.f6766a;
        this.f6811c = ceVar.f6767b;
        this.f6812d = ceVar.f6768c;
        this.f6813e = ceVar.f6769d;
    }

    public static int a(Class... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            strArr[i4] = clsArr[i4].getName();
        }
        return Math.abs(Arrays.hashCode(strArr));
    }
}
