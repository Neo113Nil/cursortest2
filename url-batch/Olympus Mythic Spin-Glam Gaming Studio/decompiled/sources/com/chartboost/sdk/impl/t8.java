package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class t8 {
    public final g8 a;

    public t8(g8 fileCaching) {
        Intrinsics.checkNotNullParameter(fileCaching, "fileCaching");
        this.a = fileCaching;
    }

    public final void c(y6 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (pg.a.d()) {
            b(download).createNewFile();
        }
    }

    public final void d(y6 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (pg.a.d()) {
            a(download).delete();
            b(download).delete();
        }
    }

    public final void e(y6 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (pg.a.d()) {
            b(download).delete();
            a(download).createNewFile();
        }
    }

    public final File a(y6 y6Var) {
        return z6.a(y6Var, this.a.c());
    }

    public final File b(y6 y6Var) {
        return z6.a(y6Var, this.a.a());
    }
}
