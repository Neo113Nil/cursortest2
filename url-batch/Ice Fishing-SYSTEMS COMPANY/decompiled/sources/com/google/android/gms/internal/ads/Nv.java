package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import k2.EnumC4631b;

/* loaded from: classes2.dex */
public final class Nv {

    /* renamed from: a, reason: collision with root package name */
    public final String f26620a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4631b f26621b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26622c;

    public /* synthetic */ Nv(C3602mu c3602mu) {
        this.f26620a = (String) c3602mu.f32774u;
        this.f26621b = (EnumC4631b) c3602mu.f32775v;
        this.f26622c = (String) c3602mu.f32776w;
    }

    public final String a() {
        EnumC4631b enumC4631b = this.f26621b;
        return enumC4631b == null ? com.anythink.core.common.v.m.f16967e : enumC4631b.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        EnumC4631b enumC4631b;
        EnumC4631b enumC4631b2;
        if (obj instanceof Nv) {
            Nv nv = (Nv) obj;
            if (this.f26620a.equals(nv.f26620a) && (enumC4631b = this.f26621b) != null && (enumC4631b2 = nv.f26621b) != null && enumC4631b.equals(enumC4631b2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26620a, this.f26621b);
    }
}
