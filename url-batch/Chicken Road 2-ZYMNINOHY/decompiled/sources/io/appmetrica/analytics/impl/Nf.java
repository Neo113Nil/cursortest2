package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Nf implements InterfaceC0986to {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0986to
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(N8 n8, C0746kh c0746kh) {
        C0823ng c0823ng;
        int ordinal;
        if (!TextUtils.isEmpty(n8.f10694b)) {
            try {
                byte[] decode = Base64.decode(n8.f10694b, 0);
                if (decode != null && decode.length != 0) {
                    c0823ng = new C0823ng(decode);
                    Vf vf = new Vf();
                    String str = c0823ng.f12464a;
                    vf.f11141a = str != null ? new byte[0] : str.getBytes();
                    vf.f11143c = c0823ng.f12465b;
                    vf.f11142b = c0823ng.f12466c;
                    ordinal = c0823ng.f12467d.ordinal();
                    int i4 = 1;
                    if (ordinal != 1) {
                        i4 = 2;
                        if (ordinal != 2) {
                            i4 = 0;
                        }
                    }
                    vf.f11144d = i4;
                    return MessageNano.toByteArray(vf);
                }
                c0823ng = null;
                Vf vf2 = new Vf();
                String str2 = c0823ng.f12464a;
                vf2.f11141a = str2 != null ? new byte[0] : str2.getBytes();
                vf2.f11143c = c0823ng.f12465b;
                vf2.f11142b = c0823ng.f12466c;
                ordinal = c0823ng.f12467d.ordinal();
                int i42 = 1;
                if (ordinal != 1) {
                }
                vf2.f11144d = i42;
                return MessageNano.toByteArray(vf2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
