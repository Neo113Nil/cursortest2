package V1;

import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class c extends U1.f {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f3320W;

    @Override // U1.f
    public final void h(Canvas canvas) {
        for (int i = 0; i < j(); i++) {
            U1.e i4 = i(i);
            int save = canvas.save();
            canvas.rotate((i * 360) / j(), getBounds().centerX(), getBounds().centerY());
            i4.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // U1.f
    public final U1.e[] l() {
        switch (this.f3320W) {
            case 0:
                a[] aVarArr = new a[12];
                for (int i = 0; i < 12; i++) {
                    a aVar = new a(1, false);
                    aVar.g(0.0f);
                    aVarArr[i] = aVar;
                    aVar.f3272y = i * 100;
                }
                return aVarArr;
            default:
                a[] aVarArr2 = new a[12];
                for (int i4 = 0; i4 < 12; i4++) {
                    a aVar2 = new a(3, false);
                    aVar2.setAlpha(0);
                    aVarArr2[i4] = aVar2;
                    aVar2.f3272y = i4 * 100;
                }
                return aVarArr2;
        }
    }

    @Override // U1.f, U1.e, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a9 = U1.e.a(rect);
        int width = (int) (((a9.width() * 3.141592653589793d) / 3.5999999046325684d) / j());
        int centerX = a9.centerX() - width;
        int centerX2 = a9.centerX() + width;
        for (int i = 0; i < j(); i++) {
            U1.e i4 = i(i);
            int i9 = a9.top;
            i4.f(centerX, i9, centerX2, (width * 2) + i9);
        }
    }
}
