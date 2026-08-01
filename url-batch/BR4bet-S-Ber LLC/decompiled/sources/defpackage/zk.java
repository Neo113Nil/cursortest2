package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class zk implements dl {
    public final /* synthetic */ int f;
    public final /* synthetic */ ExtendedFloatingActionButton g;

    public /* synthetic */ zk(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        this.f = i;
        this.g = extendedFloatingActionButton;
    }

    @Override // defpackage.dl
    public final int b() {
        int i = this.f;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        switch (i) {
            case 0:
                return extendedFloatingActionButton.getCollapsedSize();
            default:
                return extendedFloatingActionButton.getMeasuredHeight();
        }
    }

    @Override // defpackage.dl
    public final int c() {
        int i = this.f;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        switch (i) {
            case 0:
                return extendedFloatingActionButton.getCollapsedPadding();
            default:
                return extendedFloatingActionButton.g0;
        }
    }

    @Override // defpackage.dl
    public final int d() {
        int i = this.f;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        switch (i) {
            case 0:
                return extendedFloatingActionButton.getCollapsedPadding();
            default:
                return extendedFloatingActionButton.f0;
        }
    }

    @Override // defpackage.dl
    public final int e() {
        int i = this.f;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        switch (i) {
            case 0:
                return extendedFloatingActionButton.getCollapsedSize();
            default:
                return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.f0 + extendedFloatingActionButton.g0;
        }
    }

    @Override // defpackage.dl
    public final ViewGroup.LayoutParams g() {
        switch (this.f) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
                return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
            default:
                return new ViewGroup.LayoutParams(-2, -2);
        }
    }
}
