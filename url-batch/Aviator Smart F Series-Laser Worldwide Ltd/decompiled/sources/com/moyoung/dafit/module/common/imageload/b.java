package com.moyoung.dafit.module.common.imageload;

import com.liulishuo.filedownloader.s;

/* loaded from: classes4.dex */
public class b {

    private static class a {
        private static final b INSTANCE = new b();

        private a() {
        }
    }

    public b() {
        s.setup(com.moyoung.dafit.module.common.utils.d.get());
    }

    public static b getInstance() {
        return a.INSTANCE;
    }

    public s getFileDownloader() {
        return s.getImpl();
    }
}
