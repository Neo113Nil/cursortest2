package f1;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b0 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1307a;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        switch (this.f1307a) {
        }
        float f4 = f2 - 1.0f;
        return (f4 * f4 * f4 * f4 * f4) + 1.0f;
    }
}
