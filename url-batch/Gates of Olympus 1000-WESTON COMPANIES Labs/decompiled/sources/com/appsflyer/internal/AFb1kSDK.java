package com.appsflyer.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFb1kSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1qSDK;", "p0", "", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFc1qSDK;)Ljava/lang/String;", "p1", "", "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1qSDK;)V", "getMonetizationNetwork", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AFb1kSDK {
    public static final AFb1kSDK INSTANCE = new AFb1kSDK();

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private static String getCurrencyIso4217Code;

    private AFb1kSDK() {
    }

    @JvmStatic
    public static final synchronized void getCurrencyIso4217Code(String p0, AFc1qSDK p1) {
        synchronized (AFb1kSDK.class) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getCurrencyIso4217Code = p0;
            p1.AFAdRevenueData("CUSTOM_INSTALL_ID_APPLIED", true);
            p1.getRevenue("AF_INSTALLATION", p0);
        }
    }

    @JvmStatic
    public static final synchronized String getCurrencyIso4217Code(AFc1qSDK p0) {
        String str;
        synchronized (AFb1kSDK.class) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (getCurrencyIso4217Code == null) {
                String monetizationNetwork = p0.getMonetizationNetwork("AF_INSTALLATION", (String) null);
                if (monetizationNetwork == null) {
                    monetizationNetwork = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                    p0.getRevenue("AF_INSTALLATION", monetizationNetwork);
                }
                getCurrencyIso4217Code = monetizationNetwork;
            }
            str = getCurrencyIso4217Code;
            Intrinsics.checkNotNull(str);
        }
        return str;
    }
}
