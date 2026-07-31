package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class h8 implements g8 {
    public final File a;
    public final File b;
    public final File c;

    public h8(Context context, File precacheDirectory, File precacheQueueDirectory, File precachingInternalDirectory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(precacheDirectory, "precacheDirectory");
        Intrinsics.checkNotNullParameter(precacheQueueDirectory, "precacheQueueDirectory");
        Intrinsics.checkNotNullParameter(precachingInternalDirectory, "precachingInternalDirectory");
        this.a = precacheDirectory;
        this.b = precacheQueueDirectory;
        this.c = precachingInternalDirectory;
    }

    @Override // com.chartboost.sdk.impl.g8
    public File a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new File(c(), id);
    }

    @Override // com.chartboost.sdk.impl.g8
    public File c() {
        return this.a;
    }

    @Override // com.chartboost.sdk.impl.g8
    public File b() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ h8(Context context, File file, File file2, File file3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, file, (i & 4) != 0 ? j6.c(context) : file2, (i & 8) != 0 ? new File(file, "exoplayer-cache") : file3);
        file = (i & 2) != 0 ? j6.b(context) : file;
    }

    @Override // com.chartboost.sdk.impl.g8
    public File a() {
        return this.b;
    }
}
