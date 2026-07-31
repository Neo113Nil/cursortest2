package com.ironsource;

import com.ironsource.bi;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
class ss implements bi, bi.a {

    /* renamed from: c, reason: collision with root package name */
    private static final int f19641c = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Map<IronSource.AD_UNIT, Integer> f19642a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ik f19643b = new ik();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19644a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f19644a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19644a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19644a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19644a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    ss() {
        for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
            a(ad_unit, 1);
        }
    }

    @Override // com.ironsource.bi
    public synchronized int a(IronSource.AD_UNIT ad_unit) {
        int i4 = -1;
        if (ad_unit == null) {
            return -1;
        }
        Integer num = this.f19642a.get(ad_unit);
        if (num != null) {
            i4 = num.intValue();
        }
        return i4;
    }

    @Override // com.ironsource.bi.a
    public synchronized void b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        a(ad_unit, this.f19642a.get(ad_unit).intValue() + 1);
    }

    @Override // com.ironsource.bi
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }

    private void a(@NotNull IronSource.AD_UNIT ad_unit, int i4) {
        this.f19642a.put(ad_unit, Integer.valueOf(i4));
        int i5 = a.f19644a[ad_unit.ordinal()];
        if (i5 == 1) {
            this.f19643b.d(i4);
            return;
        }
        if (i5 == 2) {
            this.f19643b.b(i4);
        } else if (i5 == 3) {
            this.f19643b.a(i4);
        } else {
            if (i5 != 4) {
                return;
            }
            this.f19643b.c(i4);
        }
    }
}
