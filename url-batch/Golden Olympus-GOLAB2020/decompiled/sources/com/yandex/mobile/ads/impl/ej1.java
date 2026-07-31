package com.yandex.mobile.ads.impl;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.ea0;
import com.yandex.mobile.ads.impl.ip1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ej1 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1920f9 f25328a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<ea0.a> f25329b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final np1 f25330c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e51 f25331d;

    public ej1(@NotNull C1920f9 adTracker, @NotNull List<ea0.a> items, @NotNull np1 reporter, @NotNull e51 nativeAdEventController) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        this.f25328a = adTracker;
        this.f25329b = items;
        this.f25330c = reporter;
        this.f25331d = nativeAdEventController;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId >= this.f25329b.size()) {
            return true;
        }
        this.f25328a.a(this.f25329b.get(itemId).b(), o62.f29918c);
        this.f25330c.a(ip1.b.f27317E);
        this.f25331d.a();
        return true;
    }
}
