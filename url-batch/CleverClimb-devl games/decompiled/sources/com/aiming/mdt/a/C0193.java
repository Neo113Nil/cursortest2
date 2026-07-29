package com.aiming.mdt.a;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.a.C0091;
import com.aiming.mdt.a.C0155;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.C0290;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.aiming.mdt.a.ˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0193 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private AtomicBoolean f667 = new AtomicBoolean(false);

    /* renamed from: com.aiming.mdt.a.ˈˉ$ʼ, reason: contains not printable characters */
    static final class C0194 {

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private static C0193 f668 = new C0193();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static C0193 m726() {
        return C0194.f668;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m727(Activity activity) {
        if (C0226.m829() == null || this.f667.get()) {
            return;
        }
        C0114.m427().m430(activity);
        this.f667.set(true);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m728() {
        C0091 c0091;
        C0091 c00912;
        C0155 unused;
        if (this.f667.get()) {
            unused = C0155.C0156.f516;
            c0091 = C0091.C0092.f265;
            if (c0091.m347()) {
                c00912 = C0091.C0092.f265;
                C0285.m979(new RunnableC0082(c00912));
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m729(String str, int i, String str2) {
        Activity m429;
        C0155 c0155;
        if (this.f667.get()) {
            String str3 = null;
            switch (i) {
                case 0:
                    str3 = "com.aiming";
                    break;
                case 3:
                    str3 = "com.unity3d";
                    break;
                case 4:
                    str3 = "com.vungle";
                    break;
                case 6:
                    str3 = "com.adcolony";
                    break;
                case 7:
                    str3 = "com.applovin";
                    break;
                case 10:
                    str3 = "com.tapjoy";
                    break;
                case 11:
                    str3 = "com.chartboost";
                    break;
                case 10000:
                    str3 = "com.aiming.mdt.sdk.demo";
                    break;
            }
            if (!TextUtils.isEmpty(str3) && (m429 = C0114.m427().m429()) != null && C0290.m984(m429) && m429.getComponentName().getClassName().contains(str3)) {
                c0155 = C0155.C0156.f516;
                C0144.m548(str, i, str2, new C0071(c0155, m429));
            }
        }
    }
}
