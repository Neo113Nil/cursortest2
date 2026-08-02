package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FileObserverC0580e6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f11726a;

    /* renamed from: b, reason: collision with root package name */
    public final File f11727b;

    /* renamed from: c, reason: collision with root package name */
    public final C0481aa f11728c;

    public FileObserverC0580e6(File file, C0632g6 c0632g6, C0481aa c0481aa) {
        super(file.getAbsolutePath(), 8);
        this.f11726a = c0632g6;
        this.f11727b = file;
        this.f11728c = c0481aa;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i4, String str) {
        if (i4 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f11726a;
        C0481aa c0481aa = this.f11728c;
        File file = this.f11727b;
        c0481aa.getClass();
        consumer.consume(new File(file, str));
    }
}
