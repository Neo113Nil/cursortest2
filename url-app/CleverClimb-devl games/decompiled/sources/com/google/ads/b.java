package com.google.ads;

import android.support.v7.widget.helper.ItemTouchHelper;
import com.cmplay.base.util.webview.util.NetworkUtil;
import com.cmplay.policy.gdpr.DimenUtils;
import com.google.android.gms.ads.AdSize;

@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6487a = new b(-1, -2, "mb");

    /* renamed from: b, reason: collision with root package name */
    public static final b f6488b = new b(DimenUtils.DENSITY_XHIGH, 50, "mb");

    /* renamed from: c, reason: collision with root package name */
    public static final b f6489c = new b(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "as");

    /* renamed from: d, reason: collision with root package name */
    public static final b f6490d = new b(468, 60, "as");
    public static final b e = new b(728, 90, "as");
    public static final b f = new b(DimenUtils.DENSITY_MEDIUM, NetworkUtil.NATIVE_ERROR, "as");
    private final AdSize g;

    private b(int i, int i2, String str) {
        this(new AdSize(i, i2));
    }

    public b(AdSize adSize) {
        this.g = adSize;
    }

    public final int a() {
        return this.g.getWidth();
    }

    public final int b() {
        return this.g.getHeight();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.g.equals(((b) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g.toString();
    }
}
