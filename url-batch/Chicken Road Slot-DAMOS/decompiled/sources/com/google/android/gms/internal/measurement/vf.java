package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class vf extends wf {

    /* renamed from: e, reason: collision with root package name */
    public static final wf f2896e;

    /* renamed from: f, reason: collision with root package name */
    public static final wf f2897f;

    static {
        wf b10 = new vf(null, new s.r0(0)).b();
        f2896e = b10;
        vf vfVar = new vf(b10, new s.r0(0));
        boolean z10 = !vfVar.f2957c;
        Boolean bool = Boolean.TRUE;
        i7.a.F("Can't mutate after handing to trace", z10);
        i7.a.F("Key already present", !vfVar.c());
        vfVar.f2956b.put(wf.f2954d, bool);
        f2897f = vfVar.b();
    }
}
