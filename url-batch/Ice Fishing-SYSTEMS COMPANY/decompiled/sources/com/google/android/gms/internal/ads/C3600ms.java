package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ms, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3600ms implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32768a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f32769b;

    public /* synthetic */ C3600ms(int i, Integer num) {
        this.f32768a = i;
        this.f32769b = num;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f32768a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Integer num = this.f32769b;
                if (num != null) {
                    bundle.putInt("aos", num.intValue());
                    break;
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                Integer num2 = this.f32769b;
                if (num2 != null) {
                    bundle2.putInt("dspct", Math.min(num2.intValue(), 20));
                    break;
                }
                break;
        }
    }
}
