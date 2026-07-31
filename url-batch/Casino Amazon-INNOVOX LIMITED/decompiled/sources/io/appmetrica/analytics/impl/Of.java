package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class Of implements uo {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.uo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(O8 o8, C0333lh c0333lh) {
        C0407og c0407og;
        int ordinal;
        if (!TextUtils.isEmpty(o8.b)) {
            try {
                byte[] decode = Base64.decode(o8.b, 0);
                if (decode != null && decode.length != 0) {
                    c0407og = new C0407og(decode);
                    Wf wf = new Wf();
                    String str = c0407og.f1416a;
                    wf.f1106a = str != null ? new byte[0] : str.getBytes();
                    wf.c = c0407og.b;
                    wf.b = c0407og.c;
                    ordinal = c0407og.d.ordinal();
                    int i = 1;
                    if (ordinal != 1) {
                        i = 2;
                        if (ordinal != 2) {
                            i = 0;
                        }
                    }
                    wf.d = i;
                    return MessageNano.toByteArray(wf);
                }
                c0407og = null;
                Wf wf2 = new Wf();
                String str2 = c0407og.f1416a;
                wf2.f1106a = str2 != null ? new byte[0] : str2.getBytes();
                wf2.c = c0407og.b;
                wf2.b = c0407og.c;
                ordinal = c0407og.d.ordinal();
                int i2 = 1;
                if (ordinal != 1) {
                }
                wf2.d = i2;
                return MessageNano.toByteArray(wf2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
