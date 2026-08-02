package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class Ug {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11054a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0492al f11055b;

    /* renamed from: c, reason: collision with root package name */
    public final C0818nb f11056c = new C0818nb();

    /* renamed from: d, reason: collision with root package name */
    public final C0863p4 f11057d = new C0863p4(new Zl(), new C0837o4(), null);

    /* renamed from: e, reason: collision with root package name */
    public final Consumer f11058e;

    public Ug(Context context, final InterfaceC0555d6 interfaceC0555d6, final EnumC0508bb enumC0508bb, InterfaceC0492al interfaceC0492al) {
        this.f11054a = context;
        this.f11055b = interfaceC0492al;
        this.f11058e = new Consumer() { // from class: io.appmetrica.analytics.impl.So
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Ug.a(EnumC0508bb.this, interfaceC0555d6, this, (C0714jb) obj);
            }
        };
    }

    public static final void a(EnumC0508bb enumC0508bb, InterfaceC0555d6 interfaceC0555d6, Ug ug, C0714jb c0714jb) {
        String str = c0714jb.f12124h;
        P3 p32 = new P3(str, c0714jb.f12121e, c0714jb.f12122f, c0714jb.f12123g, c0714jb.f12125i);
        String str2 = c0714jb.f12118b;
        byte[] bArr = c0714jb.f12117a;
        int i4 = c0714jb.f12119c;
        HashMap hashMap = c0714jb.f12120d;
        String str3 = c0714jb.f12126j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC1049w9.f12924a;
        M3 m32 = new M3(bArr, str2, enumC0508bb.f11531a, orCreatePublicLogger);
        m32.f10622q = hashMap;
        m32.f10800g = i4;
        m32.f10796c = str3;
        ((Sg) interfaceC0555d6).a(p32, m32, ug.f11057d);
    }
}
