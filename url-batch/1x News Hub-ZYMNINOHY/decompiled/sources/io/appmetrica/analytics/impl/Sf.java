package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Sf implements InterfaceC0916vo {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0916vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(S8 s8, C0754ph c0754ph) {
        C0830sg c0830sg;
        int ordinal;
        if (!TextUtils.isEmpty(s8.f6612b)) {
            try {
                byte[] decode = Base64.decode(s8.f6612b, 0);
                if (decode != null && decode.length != 0) {
                    c0830sg = new C0830sg(decode);
                    C0365ag c0365ag = new C0365ag();
                    String str = c0830sg.f8315a;
                    c0365ag.f7027a = str != null ? new byte[0] : str.getBytes();
                    c0365ag.f7029c = c0830sg.f8316b;
                    c0365ag.f7028b = c0830sg.f8317c;
                    ordinal = c0830sg.f8318d.ordinal();
                    int i3 = 1;
                    if (ordinal != 1) {
                        i3 = 2;
                        if (ordinal != 2) {
                            i3 = 0;
                        }
                    }
                    c0365ag.f7030d = i3;
                    return MessageNano.toByteArray(c0365ag);
                }
                c0830sg = null;
                C0365ag c0365ag2 = new C0365ag();
                String str2 = c0830sg.f8315a;
                c0365ag2.f7027a = str2 != null ? new byte[0] : str2.getBytes();
                c0365ag2.f7029c = c0830sg.f8316b;
                c0365ag2.f7028b = c0830sg.f8317c;
                ordinal = c0830sg.f8318d.ordinal();
                int i32 = 1;
                if (ordinal != 1) {
                }
                c0365ag2.f7030d = i32;
                return MessageNano.toByteArray(c0365ag2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
