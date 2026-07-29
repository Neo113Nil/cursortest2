package com.dancingbogo.skyrolline.util;

/* compiled from: ChannelInfoUtils.java */
/* loaded from: classes2.dex */
public class c {
    public static synchronized void a(String str) {
        synchronized (c.class) {
            com.dancingbogo.skyrolline.b.d.a("key_channel_id", str);
        }
    }

    public static synchronized void b(String str) {
        synchronized (c.class) {
            com.dancingbogo.skyrolline.b.d.a("key_app_child_channel_id", str);
        }
    }
}
