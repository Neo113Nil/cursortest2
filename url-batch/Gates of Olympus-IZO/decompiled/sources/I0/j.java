package I0;

import B0.l;
import android.text.TextPaint;
import b0.AbstractC0259J;
import b0.C0262M;
import b0.InterfaceC0285r;
import d0.AbstractC0322c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f2453a = new k(false);

    public static final void a(B0.j jVar, InterfaceC0285r interfaceC0285r, AbstractC0259J abstractC0259J, float f3, C0262M c0262m, L0.g gVar, AbstractC0322c abstractC0322c, int i3) {
        ArrayList arrayList = jVar.f275h;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            l lVar = (l) arrayList.get(i4);
            lVar.f278a.f(interfaceC0285r, abstractC0259J, f3, c0262m, gVar, abstractC0322c, i3);
            interfaceC0285r.r(0.0f, lVar.f278a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f3 * 255));
    }
}
