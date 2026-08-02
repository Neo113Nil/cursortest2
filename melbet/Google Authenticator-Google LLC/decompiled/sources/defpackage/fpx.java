package defpackage;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpx {
    public CharSequence a;
    public CharSequence b;
    public View d;
    public TabLayout f;
    public fpy g;
    public int c = -1;
    public final int e = 1;
    public int h = -1;

    public final void a() {
        TabLayout tabLayout = this.f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.g(this, true);
    }
}
