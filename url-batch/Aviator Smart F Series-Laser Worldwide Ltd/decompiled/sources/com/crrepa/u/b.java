package com.crrepa.u;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.crrepa.ble.util.BleLog;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private com.crrepa.w.a f13855a;

    class a implements com.crrepa.w.b {
        a() {
        }

        @Override // com.crrepa.w.b
        public void onConnectionStateChanged(int i8) {
            BleLog.d("socket newState= " + i8);
            boolean z7 = i8 == 2;
            k4.a aVar = new k4.a(z7);
            if (z7) {
                aVar.b(10);
            } else {
                aVar.a(1);
            }
            c.a(aVar);
        }
    }

    /* renamed from: com.crrepa.u.b$b, reason: collision with other inner class name */
    private static class C0245b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f13857a = new b(null);

        private C0245b() {
        }
    }

    private b() {
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    public static b a() {
        return C0245b.f13857a;
    }

    private void b(byte[] bArr) {
        if (!com.crrepa.g1.c.h(bArr) && bArr.length == 6) {
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < 4; i8++) {
                sb.append(com.crrepa.g1.c.a(bArr[i8]));
                if (i8 < 3) {
                    sb.append(".");
                }
            }
            String sb2 = sb.toString();
            int a8 = com.crrepa.g1.c.a(bArr[5], bArr[4]);
            BleLog.d("host= " + sb2 + ", port= " + a8);
            if (this.f13855a == null) {
                com.crrepa.w.a aVar = new com.crrepa.w.a(sb2, a8);
                this.f13855a = aVar;
                aVar.a(new a());
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public void a(byte b8, byte[] bArr) {
        com.crrepa.w.a aVar;
        if (b8 == 2) {
            com.crrepa.l.a.b().a().requestMtu(200);
            a(bArr);
            return;
        }
        if (b8 == 3) {
            b(bArr);
            return;
        }
        if (b8 == 4) {
            com.crrepa.w.a aVar2 = this.f13855a;
            if (aVar2 != null) {
                aVar2.b(bArr);
                return;
            }
            return;
        }
        if (b8 == 5 && (aVar = this.f13855a) != null) {
            aVar.b();
            this.f13855a = null;
        }
    }

    private void a(byte[] bArr) {
        String str;
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        String str2 = new String(bArr, StandardCharsets.UTF_8);
        BleLog.d("domain= " + str2);
        if (TextUtils.isEmpty(str2)) {
            BleLog.d("domain is empty");
            return;
        }
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str2);
            BleLog.d("addresses length= " + allByName.length);
            int length = allByName.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    str = null;
                    break;
                }
                InetAddress inetAddress = allByName[i8];
                if (inetAddress instanceof Inet4Address) {
                    str = inetAddress.getHostAddress();
                    break;
                }
                i8++;
            }
            c.a(str);
        } catch (UnknownHostException e8) {
            e8.printStackTrace();
        }
    }
}
