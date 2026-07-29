package com.dancingbogo.skyrolline.ipc;

import com.dancingbogo.skyrolline.b.c;
import com.dancingbogo.skyrolline.cloud.a.a;
import com.dancingbogo.skyrolline.ipc.SyncIpcProvider;
import com.dancingbogo.skyrolline.webview.ipc.a.c;

/* compiled from: IpcProviderHandlerFactory.java */
/* loaded from: classes2.dex */
public class d {
    public static b a(int i) {
        switch (i) {
            case 1:
                return new SyncIpcProvider.a();
            case 2:
                return new c.a();
            case 3:
                return new c.a();
            case 4:
                return new a.C0334a();
            default:
                return null;
        }
    }
}
