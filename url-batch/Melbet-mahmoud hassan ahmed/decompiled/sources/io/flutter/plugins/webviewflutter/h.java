package io.flutter.plugins.webviewflutter;

import android.content.res.AssetManager;
import e5.a;

/* loaded from: classes.dex */
abstract class h {

    /* renamed from: a, reason: collision with root package name */
    final AssetManager f17661a;

    static class a extends h {

        /* renamed from: b, reason: collision with root package name */
        final a.InterfaceC0059a f17662b;

        a(AssetManager assetManager, a.InterfaceC0059a interfaceC0059a) {
            super(assetManager);
            this.f17662b = interfaceC0059a;
        }

        @Override // io.flutter.plugins.webviewflutter.h
        public String a(String str) {
            return this.f17662b.a(str);
        }
    }

    public h(AssetManager assetManager) {
        this.f17661a = assetManager;
    }

    abstract String a(String str);

    public String[] b(String str) {
        return this.f17661a.list(str);
    }
}
