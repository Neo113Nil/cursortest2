package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Sf implements InterfaceC1067vo {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC1067vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(S8 s8, C0905ph c0905ph) {
        C0981sg c0981sg;
        int ordinal;
        if (!TextUtils.isEmpty(s8.f7435b)) {
            try {
                byte[] decode = Base64.decode(s8.f7435b, 0);
                if (decode != null && decode.length != 0) {
                    c0981sg = new C0981sg(decode);
                    C0516ag c0516ag = new C0516ag();
                    String str = c0981sg.f9256a;
                    c0516ag.f7875a = str != null ? new byte[0] : str.getBytes();
                    c0516ag.f7877c = c0981sg.f9257b;
                    c0516ag.f7876b = c0981sg.f9258c;
                    ordinal = c0981sg.f9259d.ordinal();
                    int i2 = 1;
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 0;
                        }
                    }
                    c0516ag.f7878d = i2;
                    return MessageNano.toByteArray(c0516ag);
                }
                c0981sg = null;
                C0516ag c0516ag2 = new C0516ag();
                String str2 = c0981sg.f9256a;
                c0516ag2.f7875a = str2 != null ? new byte[0] : str2.getBytes();
                c0516ag2.f7877c = c0981sg.f9257b;
                c0516ag2.f7876b = c0981sg.f9258c;
                ordinal = c0981sg.f9259d.ordinal();
                int i22 = 1;
                if (ordinal != 1) {
                }
                c0516ag2.f7878d = i22;
                return MessageNano.toByteArray(c0516ag2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
