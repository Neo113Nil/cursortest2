package com.google.android.gms.internal.measurement;

import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z extends androidx.datastore.preferences.protobuf.i {

    /* renamed from: i, reason: collision with root package name */
    public final y f3025i;

    public z(gh ghVar, int i3, y yVar) {
        super(ghVar, i3);
        this.f3025i = yVar;
        StringBuilder sb2 = new StringBuilder("%");
        ghVar.d(sb2);
        sb2.append(true != ghVar.c() ? 't' : 'T');
        sb2.append(yVar.f2998d);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void E(c4.r rVar, Object obj) {
        gh ghVar = (gh) this.f560e;
        StringBuilder sb2 = (StringBuilder) rVar.g;
        boolean z10 = obj instanceof Date;
        y yVar = this.f3025i;
        if (z10 || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb3 = new StringBuilder("%");
            ghVar.d(sb3);
            sb3.append(true != ghVar.c() ? 't' : 'T');
            sb3.append(yVar.f2998d);
            sb2.append(String.format(ih.f2412a, sb3.toString(), obj));
            return;
        }
        char c10 = yVar.f2998d;
        StringBuilder sb4 = new StringBuilder(String.valueOf(c10).length() + 2);
        sb4.append("%t");
        sb4.append(c10);
        c4.r.h(sb2, obj, sb4.toString());
    }
}
