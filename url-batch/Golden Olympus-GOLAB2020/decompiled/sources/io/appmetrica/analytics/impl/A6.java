package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes3.dex */
public final class A6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f37154a;

    /* renamed from: b, reason: collision with root package name */
    public final File f37155b;

    /* renamed from: c, reason: collision with root package name */
    public final C3036va f37156c;

    public A6(File file, C6 c6, C3036va c3036va) {
        super(file.getAbsolutePath(), 8);
        this.f37154a = c6;
        this.f37155b = file;
        this.f37156c = c3036va;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i4, String str) {
        if (i4 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f37154a;
        C3036va c3036va = this.f37156c;
        File file = this.f37155b;
        c3036va.getClass();
        consumer.consume(new File(file, str));
    }
}
