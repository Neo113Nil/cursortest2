package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends y2 {

    /* renamed from: b, reason: collision with root package name */
    public final Level f2656b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2657c;

    /* renamed from: d, reason: collision with root package name */
    public final mh f2658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = q.f2684f;
        this.f2656b = level;
        this.f2657c = q.f2684f;
        this.f2658d = q.g;
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean e(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void f(kg kgVar) {
        String str = (String) kgVar.d().k(dh.f2242a);
        if (str == null) {
            str = (String) this.f3003a;
        }
        if (str == null) {
            rg rgVar = kgVar.f2468d;
            if (rgVar == null) {
                kotlin.collections.i0.l("cannot request log site information prior to postProcess()");
                return;
            }
            str = rgVar.a();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        q.m(kgVar, h.b(str), this.f2656b, this.f2657c, this.f2658d);
    }
}
