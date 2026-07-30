package com.drake.net.utils;

import android.annotation.SuppressLint;
import android.widget.Toast;
import com.drake.net.NetConfig;
import y5.w;

/* loaded from: classes3.dex */
public final class TipUtils {
    public static final TipUtils INSTANCE = new TipUtils();
    private static Toast toast;

    private TipUtils() {
    }

    @SuppressLint({"ShowToast"})
    public static final void toast(final String str) {
        if (str == null) {
            return;
        }
        f.runMain(new f6.a() { // from class: com.drake.net.utils.TipUtils$toast$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m158invoke();
                return w.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m158invoke() {
                Toast toast2;
                Toast toast3;
                toast2 = TipUtils.toast;
                if (toast2 != null) {
                    toast2.cancel();
                }
                TipUtils.toast = Toast.makeText(NetConfig.INSTANCE.getApp(), str, 0);
                toast3 = TipUtils.toast;
                if (toast3 != null) {
                    toast3.show();
                }
            }
        });
    }
}
