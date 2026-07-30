package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class DO extends AbstractC3850rQ {

    /* renamed from: c, reason: collision with root package name */
    public final Y7 f24436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DO(EO eo, AbstractC3832r8 abstractC3832r8) {
        super(abstractC3832r8);
        Objects.requireNonNull(eo);
        this.f24436c = new Y7();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3850rQ, com.google.android.gms.internal.ads.AbstractC3832r8
    public final L7 d(int i, L7 l72, boolean z8) {
        AbstractC3832r8 abstractC3832r8 = this.f34040b;
        L7 d2 = abstractC3832r8.d(i, l72, z8);
        if (!abstractC3832r8.b(d2.f26108c, this.f24436c, 0L).b()) {
            d2.f26110e = true;
            return d2;
        }
        Integer num = l72.f26106a;
        Object obj = l72.f26107b;
        int i4 = l72.f26108c;
        long j9 = l72.f26109d;
        C4071ve c4071ve = C4071ve.f34816b;
        d2.a(num, obj, i4, j9, true);
        return d2;
    }
}
