package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.List;

/* compiled from: CachePolicy.java */
/* loaded from: classes.dex */
public abstract class b {
    public static final b a = new d();
    public static final b b = new f();
    public static final b c = new e();
    protected a d;
    protected File e;
    protected List<String> f;

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.d = aVar;
        this.e = file;
        this.f = list;
    }
}
