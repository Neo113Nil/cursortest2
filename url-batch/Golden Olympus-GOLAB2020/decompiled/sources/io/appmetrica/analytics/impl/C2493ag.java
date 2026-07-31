package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2493ag implements InterfaceC2921qo {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC2921qo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(C2647g9 c2647g9, C3095xh c3095xh) {
        Ag ag;
        int ordinal;
        if (!TextUtils.isEmpty(c2647g9.f39057b)) {
            try {
                byte[] decode = Base64.decode(c2647g9.f39057b, 0);
                if (decode != null && decode.length != 0) {
                    ag = new Ag(decode);
                    C2705ig c2705ig = new C2705ig();
                    String str = ag.f37183a;
                    c2705ig.f39201a = str != null ? new byte[0] : str.getBytes();
                    c2705ig.f39203c = ag.f37184b;
                    c2705ig.f39202b = ag.f37185c;
                    ordinal = ag.f37186d.ordinal();
                    int i4 = 1;
                    if (ordinal != 1) {
                        i4 = 2;
                        if (ordinal != 2) {
                            i4 = 0;
                        }
                    }
                    c2705ig.f39204d = i4;
                    return MessageNano.toByteArray(c2705ig);
                }
                ag = null;
                C2705ig c2705ig2 = new C2705ig();
                String str2 = ag.f37183a;
                c2705ig2.f39201a = str2 != null ? new byte[0] : str2.getBytes();
                c2705ig2.f39203c = ag.f37184b;
                c2705ig2.f39202b = ag.f37185c;
                ordinal = ag.f37186d.ordinal();
                int i42 = 1;
                if (ordinal != 1) {
                }
                c2705ig2.f39204d = i42;
                return MessageNano.toByteArray(c2705ig2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
