package v0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.neonpulse.gridlogic.R;
import f0.AbstractC0090F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325b extends AbstractC0090F {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4033a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4034b;

    public C0325b() {
        Paint paint = new Paint();
        this.f4033a = paint;
        this.f4034b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // f0.AbstractC0090F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F;
        Paint paint = this.f4033a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f4034b.iterator();
        while (it.hasNext()) {
            ((AbstractC0327d) it.next()).getClass();
            ThreadLocal threadLocal = C.a.f57a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                C0326c c0326c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1714q;
                switch (c0326c.f4036b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = c0326c.f4037c.G();
                        break;
                }
                float f3 = i;
                C0326c c0326c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1714q;
                switch (c0326c2.f4036b) {
                    case 0:
                        i2 = c0326c2.f4037c.f2103o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0326c2.f4037c;
                        i2 = carouselLayoutManager.f2103o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(0.0f, f3, 0.0f, i2, paint);
            } else {
                C0326c c0326c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1714q;
                switch (c0326c3.f4036b) {
                    case 0:
                        E2 = c0326c3.f4037c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                C0326c c0326c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1714q;
                switch (c0326c4.f4036b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c0326c4.f4037c;
                        F = carouselLayoutManager2.f2102n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = c0326c4.f4037c.f2102n;
                        break;
                }
                canvas.drawLine(f4, 0.0f, F, 0.0f, paint);
            }
        }
    }
}
