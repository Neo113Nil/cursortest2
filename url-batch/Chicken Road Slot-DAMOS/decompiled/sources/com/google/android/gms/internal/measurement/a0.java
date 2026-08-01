package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 extends androidx.datastore.preferences.protobuf.i {

    /* renamed from: r, reason: collision with root package name */
    public static final Map f2125r;

    /* renamed from: i, reason: collision with root package name */
    public final fh f2126i;

    static {
        EnumMap enumMap = new EnumMap(fh.class);
        for (fh fhVar : fh.values()) {
            a0[] a0VarArr = new a0[10];
            for (int i3 = 0; i3 < 10; i3++) {
                a0VarArr[i3] = new a0(i3, fhVar, gh.f2345e);
            }
            enumMap.put((EnumMap) fhVar, (fh) a0VarArr);
        }
        f2125r = Collections.unmodifiableMap(enumMap);
    }

    public a0(int i3, fh fhVar, gh ghVar) {
        super(ghVar, i3);
        g1.c(fhVar, "format char");
        this.f2126i = fhVar;
        if (ghVar.a()) {
            return;
        }
        int i10 = fhVar.f2304d;
        i10 = ghVar.c() ? i10 & 65503 : i10;
        StringBuilder sb2 = new StringBuilder("%");
        ghVar.d(sb2);
        sb2.append((char) i10);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void E(c4.r rVar, Object obj) {
        rVar.e(obj, this.f2126i, (gh) this.f560e);
    }
}
