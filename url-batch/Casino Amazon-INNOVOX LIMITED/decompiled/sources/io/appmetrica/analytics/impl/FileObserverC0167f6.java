package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class FileObserverC0167f6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f1251a;
    public final File b;
    public final C0068ba c;

    public FileObserverC0167f6(File file, C0219h6 c0219h6, C0068ba c0068ba) {
        super(file.getAbsolutePath(), 8);
        this.f1251a = c0219h6;
        this.b = file;
        this.c = c0068ba;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f1251a;
        C0068ba c0068ba = this.c;
        File file = this.b;
        c0068ba.getClass();
        consumer.consume(new File(file, str));
    }
}
