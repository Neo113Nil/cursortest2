package com.crrepa.u;

import com.crrepa.ble.util.BleLog;
import com.crrepa.m.f;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class c {
    private c() {
    }

    public static void a(String str) {
        f.e().b(a.a(str));
    }

    public static void a(k4.a aVar) {
        f.e().b(a.a(aVar));
    }

    public static void a(boolean z7) {
        BleLog.d("sendNetState: " + z7);
        f.e().b(a.a(z7));
    }

    public static void a(byte[] bArr) {
        List<byte[]> a8 = a.a(bArr);
        if (a8 == null || a8.isEmpty()) {
            return;
        }
        Iterator<byte[]> it = a8.iterator();
        while (it.hasNext()) {
            f.e().b(it.next());
        }
    }
}
