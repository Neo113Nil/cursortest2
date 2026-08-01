package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class jf extends ff {

    /* renamed from: t, reason: collision with root package name */
    public final wf f2431t;

    public jf(String str, ff ffVar, wf wfVar, ag agVar) {
        super(str, ffVar, agVar);
        i7.a.t(wfVar.f2957c);
        this.f2431t = wfVar;
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final wf c() {
        return wf.a(this.f2431t, b());
    }

    public jf(String str, UUID uuid, String str2, wf wfVar, ag agVar) {
        super(str, uuid, str2, agVar);
        i7.a.t(wfVar.f2957c);
        this.f2431t = wfVar;
    }
}
