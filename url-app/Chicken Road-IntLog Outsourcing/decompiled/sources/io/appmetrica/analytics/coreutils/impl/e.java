package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i2) {
        super(0);
        this.f6212a = context;
        this.f6213b = str;
        this.f6214c = i2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return this.f6212a.getPackageManager().getPackageInfo(this.f6213b, this.f6214c);
    }
}
