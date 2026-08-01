package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class qb extends e4 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2709i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb(String str, int i3) {
        super(str);
        this.f2709i = i3;
    }

    @Override // com.google.android.gms.internal.measurement.e4
    public final f5 a(e7 e7Var, List list) {
        switch (this.f2709i) {
            case 0:
                return f5.f2280b;
            case 1:
            case 2:
                return this;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new l3(Double.valueOf(0.0d));
            default:
                return f5.f2280b;
        }
    }
}
