package com.dancingbogo.skyrolline.util;

import android.os.Process;
import com.dancingbogo.skyrolline.GameApp;
import java.io.InputStream;
import java.security.MessageDigest;

/* compiled from: MD5check.java */
/* loaded from: classes2.dex */
public class j {
    public static String a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    inputStream.close();
                    return a(messageDigest.digest());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void a() {
        new Thread(new Runnable() { // from class: com.dancingbogo.skyrolline.util.j.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                try {
                    String a2 = j.a(GameApp.f4485a.getAssets().open("bin/Data/Managed/Assembly-CSharp.dll"));
                    com.cmplay.gppay.b.a.a.a(a2);
                    z = a2.equals("cbcea0fb227b8d425f5d7ba93952e69");
                } catch (Exception e) {
                    e.printStackTrace();
                    z = true;
                }
                if (z) {
                    return;
                }
                Process.killProcess(Process.myPid());
            }
        }).setName("CheckMD5Runable");
    }
}
