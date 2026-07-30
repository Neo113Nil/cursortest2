package com.crrepa.s;

import com.crrepa.ble.conn.bean.CRPConnectKitMessage;
import com.crrepa.ble.conn.listener.CRPConnectKitListener;
import com.crrepa.ble.hisilicon.connectkit.ConnectKitMessage;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.k;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private CRPConnectKitListener f13774a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13775a = new c();

        private b() {
        }
    }

    private c() {
    }

    private CRPConnectKitMessage a(ConnectKitMessage connectKitMessage) {
        CRPConnectKitMessage cRPConnectKitMessage = new CRPConnectKitMessage();
        cRPConnectKitMessage.setMessageId(connectKitMessage.getMessageId());
        cRPConnectKitMessage.setSrcPackageName(connectKitMessage.getSrcPackageName());
        cRPConnectKitMessage.setDestPackageName(connectKitMessage.getDestPackageName());
        cRPConnectKitMessage.setMsg(connectKitMessage.getPayload());
        return cRPConnectKitMessage;
    }

    private ConnectKitMessage a(byte[] bArr) {
        String str;
        String str2;
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 10) {
            return null;
        }
        byte b8 = bArr[0];
        int b9 = com.crrepa.g1.c.b(bArr[2], bArr[1]);
        int b10 = com.crrepa.g1.c.b(bArr[4], bArr[3]);
        byte[] bArr2 = new byte[b10];
        System.arraycopy(bArr, 5, bArr2, 0, b10);
        Charset charset = StandardCharsets.UTF_8;
        String str3 = new String(bArr2, charset);
        int b11 = com.crrepa.g1.c.b(bArr[b10 + 6], bArr[b10 + 5]);
        byte[] bArr3 = new byte[b11];
        int i8 = b10 + 7;
        if (b11 != 0) {
            System.arraycopy(bArr, i8, bArr3, 0, b11);
            str = new String(bArr3, charset);
            i8 += b11;
        } else {
            str = "";
        }
        int b12 = com.crrepa.g1.c.b(bArr[i8 + 1], bArr[i8]);
        int i9 = i8 + 2;
        if (b12 != 0) {
            byte[] bArr4 = new byte[b12];
            System.arraycopy(bArr, i9, bArr4, 0, b12);
            i9 += b12;
            str2 = new String(bArr4, charset);
        } else {
            str2 = "";
        }
        byte[] bArr5 = new byte[4];
        System.arraycopy(bArr, i9, bArr5, 0, 4);
        ConnectKitMessage connectKitMessage = new ConnectKitMessage(b8, b9, str3, str, str2, (int) com.crrepa.g1.c.f(bArr5));
        BleLog.d("connect kit message: " + k.a(connectKitMessage));
        return connectKitMessage;
    }

    public static c a() {
        return b.f13775a;
    }

    public void a(byte b8, byte[] bArr) {
        String str;
        if (this.f13774a == null) {
            str = "connectKitListener is null!";
        } else {
            ConnectKitMessage a8 = a(bArr);
            if (b8 == 6 || a8 != null) {
                if (b8 == 1) {
                    this.f13774a.onAppPingChanged(a8.getMessageType() == 1, a(a8), a8.getResponse());
                    return;
                }
                if (b8 == 2) {
                    int messageType = a8.getMessageType();
                    CRPConnectKitMessage a9 = a(a8);
                    if (messageType == 1) {
                        this.f13774a.onReceiveMessageChanged(a9);
                        return;
                    } else {
                        if (messageType == 2) {
                            this.f13774a.onSendMessageChanged(a9, a8.getResponse());
                            return;
                        }
                        return;
                    }
                }
                if (b8 == 5) {
                    if (a8.getMessageType() == 2) {
                        this.f13774a.onSendMessageChanged(a(a8), a8.getResponse());
                        return;
                    }
                    return;
                } else {
                    if (b8 == 6 && 8 <= bArr.length) {
                        byte[] bArr2 = new byte[4];
                        System.arraycopy(bArr, 4, bArr2, 0, 4);
                        this.f13774a.onAvailableStorageChanged((int) com.crrepa.g1.c.f(bArr2));
                        return;
                    }
                    return;
                }
            }
            str = "connectKitMessage is null!";
        }
        BleLog.e(str);
    }

    protected void a(CRPConnectKitMessage cRPConnectKitMessage) {
        CRPConnectKitListener cRPConnectKitListener = this.f13774a;
        if (cRPConnectKitListener != null) {
            cRPConnectKitListener.onSendMessageChanged(cRPConnectKitMessage, 206);
        }
    }

    public void a(CRPConnectKitListener cRPConnectKitListener) {
        this.f13774a = cRPConnectKitListener;
    }
}
