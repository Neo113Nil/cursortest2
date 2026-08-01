package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.f.a.c;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ChannelVerLoader.java */
/* loaded from: classes.dex */
public final class a {
    public String a;
    public String b;
    public volatile File c;
    volatile Long d;
    public AtomicBoolean e = new AtomicBoolean(false);
    private volatile com.bykv.vk.openvk.preload.geckox.f.a.a f;

    a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final synchronized com.bykv.vk.openvk.preload.geckox.f.a.a a(String str) throws Exception {
        if (this.f != null) {
            return this.f;
        }
        File c = c(str);
        if (c == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(c, "res.macv");
        File file2 = new File(c, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f = new c(c);
        } else if (file.exists() && file.isFile()) {
            this.f = new com.bykv.vk.openvk.preload.geckox.f.a.b(c);
        } else {
            throw new RuntimeException("can not find res, dir:" + c.getAbsolutePath());
        }
        return this.f;
    }

    public static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    private synchronized File c(String str) throws Exception {
        if (this.c != null) {
            return this.c;
        }
        if (this.d != null && this.d.longValue() == -1) {
            return null;
        }
        com.bykv.vk.openvk.preload.geckox.g.b a = com.bykv.vk.openvk.preload.geckox.g.b.a(this.a + File.separator + str + File.separator + "select.lock");
        try {
            if (this.d == null) {
                this.d = j.a(new File(this.a, str));
            }
            if (this.d == null) {
                this.d = -1L;
                return null;
            }
            File file = new File(this.a, File.separator + str + File.separator + this.d + File.separator + "using.lock");
            this.c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.g.c.a(file.getAbsolutePath());
            return this.c;
        } finally {
            a.a();
        }
    }

    public final int b(String str) {
        try {
            File file = new File(c(str), "res");
            if (!file.exists() || !file.isDirectory()) {
                return 0;
            }
            int length = file.listFiles().length;
            if (length > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
