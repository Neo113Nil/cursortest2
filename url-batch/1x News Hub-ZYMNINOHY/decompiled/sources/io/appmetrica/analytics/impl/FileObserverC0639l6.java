package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FileObserverC0639l6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f7754a;

    /* renamed from: b, reason: collision with root package name */
    public final File f7755b;

    /* renamed from: c, reason: collision with root package name */
    public final C0540ha f7756c;

    public FileObserverC0639l6(File file, C0691n6 c0691n6, C0540ha c0540ha) {
        super(file.getAbsolutePath(), 8);
        this.f7754a = c0691n6;
        this.f7755b = file;
        this.f7756c = c0540ha;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i3, String str) {
        if (i3 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f7754a;
        C0540ha c0540ha = this.f7756c;
        File file = this.f7755b;
        c0540ha.getClass();
        consumer.consume(new File(file, str));
    }
}
