package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p12 implements nm0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C2276uf<?> f30266a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C1944g9 f30267b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2368yf f30268c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final q12 f30269d;

    public p12(@Nullable C2276uf<?> c2276uf, @Nullable C1944g9 c1944g9, @NotNull C2368yf clickConfigurator, @NotNull q12 sponsoredTextFormatter) {
        Intrinsics.checkNotNullParameter(clickConfigurator, "clickConfigurator");
        Intrinsics.checkNotNullParameter(sponsoredTextFormatter, "sponsoredTextFormatter");
        this.f30266a = c2276uf;
        this.f30267b = c1944g9;
        this.f30268c = clickConfigurator;
        this.f30269d = sponsoredTextFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView p4 = uiElements.p();
        if (p4 != null) {
            C2276uf<?> c2276uf = this.f30266a;
            Object d4 = c2276uf != null ? c2276uf.d() : null;
            if (d4 instanceof String) {
                p4.setText((CharSequence) d4);
                p4.setVisibility(0);
            }
            C1944g9 c1944g9 = this.f30267b;
            if (c1944g9 != null && c1944g9.b()) {
                p4.setText(this.f30269d.a(p4.getText().toString(), this.f30267b));
                p4.setVisibility(0);
                p4.setSelected(true);
                p4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                p4.setMarqueeRepeatLimit(-1);
            }
            this.f30268c.a(p4, this.f30266a);
        }
    }
}
