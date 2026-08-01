package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class o80 extends b9 {
    public final /* synthetic */ p80 A;
    public final /* synthetic */ Context x;
    public final /* synthetic */ TextPaint y;
    public final /* synthetic */ b9 z;

    public o80(p80 p80Var, Context context, TextPaint textPaint, b9 b9Var) {
        this.A = p80Var;
        this.x = context;
        this.y = textPaint;
        this.z = b9Var;
    }

    @Override // defpackage.b9
    public final void B(Typeface typeface, boolean z) {
        this.A.f(this.x, this.y, typeface);
        this.z.B(typeface, z);
    }

    @Override // defpackage.b9
    public final void z(int i) {
        this.z.z(i);
    }
}
