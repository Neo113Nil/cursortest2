package com.startapp.sdk.internal;

import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f3696b = UUID.randomUUID();

    /* renamed from: c, reason: collision with root package name */
    public final JobRequest$Network f3697c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3698d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f3699e;

    public de(ce ceVar) {
        this.f3695a = ceVar.f3655a;
        this.f3697c = ceVar.f3656b;
        this.f3698d = ceVar.f3657c;
        this.f3699e = ceVar.f3658d;
    }

    public static int a(Class... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i3 = 0; i3 < clsArr.length; i3++) {
            strArr[i3] = clsArr[i3].getName();
        }
        return Math.abs(Arrays.hashCode(strArr));
    }
}
