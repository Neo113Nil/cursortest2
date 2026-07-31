package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* compiled from: CachePolicy.java */
@SuppressLint({"CI_StaticFieldLeak"})
/* loaded from: classes13.dex */
public abstract class b {
    public static final b a = new d();
    public static final b b;
    protected a c;
    protected File d;
    protected List<String> e;

    public abstract void a();

    static {
        new f();
        b = new e();
    }

    public void a(a aVar, File file, List<String> list) {
        this.c = aVar;
        this.d = file;
        this.e = list;
    }
}
