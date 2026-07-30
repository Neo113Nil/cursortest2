package com.crrepa.band.my.device.appmarket.map;

import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class e {
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    class a implements Runnable {
        final /* synthetic */ String val$target;

        a(String str) {
            this.val$target = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.orhanobut.logger.f.d("ping result: " + e.pingDomain(this.val$target));
        }
    }

    public static void ping(String str) {
        executorService.execute(new a(str));
    }

    public static String pingDomain(String str) {
        try {
            if (InetAddress.getByName(str).isReachable(5000)) {
                return str + " 可达";
            }
            return str + " 不可达";
        } catch (IOException e8) {
            return str + " 错误: " + e8.getMessage();
        }
    }
}
