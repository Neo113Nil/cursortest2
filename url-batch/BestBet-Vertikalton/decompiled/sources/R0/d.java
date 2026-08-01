package R0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d extends H1.d {
    @Override // H1.d
    public final void A(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        double d = f3;
        double d2 = f2;
        uVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(RecyclerView.f1937A0)) * d * d2));
    }
}
