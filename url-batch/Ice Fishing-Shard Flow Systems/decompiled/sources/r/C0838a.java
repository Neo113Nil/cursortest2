package r;

import android.os.Bundle;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838a implements InterfaceC0839b {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7426d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7427e;

    public C0838a(int i2, boolean z7) {
        this.f7426d = z7;
        this.f7427e = i2;
    }

    @Override // r.InterfaceC0839b
    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
        bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f7426d);
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f7427e);
        return bundle;
    }
}
