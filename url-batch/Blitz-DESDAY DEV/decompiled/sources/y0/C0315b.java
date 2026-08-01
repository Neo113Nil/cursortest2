package y0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.winfour.neondrop.R;
import h0.F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315b extends F {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4188a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4189b;

    public C0315b() {
        Paint paint = new Paint();
        this.f4188a = paint;
        this.f4189b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // h0.F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F2;
        Paint paint = this.f4188a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f4189b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = E.a.f160a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                C0316c c0316c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1823q;
                switch (c0316c.f4191b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = c0316c.f4192c.G();
                        break;
                }
                float f3 = i;
                C0316c c0316c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1823q;
                switch (c0316c2.f4191b) {
                    case 0:
                        i2 = c0316c2.f4192c.f2390o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0316c2.f4192c;
                        i2 = carouselLayoutManager.f2390o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(0.0f, f3, 0.0f, i2, paint);
            } else {
                C0316c c0316c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1823q;
                switch (c0316c3.f4191b) {
                    case 0:
                        E2 = c0316c3.f4192c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                C0316c c0316c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1823q;
                switch (c0316c4.f4191b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c0316c4.f4192c;
                        F2 = carouselLayoutManager2.f2389n - carouselLayoutManager2.F();
                        break;
                    default:
                        F2 = c0316c4.f4192c.f2389n;
                        break;
                }
                canvas.drawLine(f4, 0.0f, F2, 0.0f, paint);
            }
        }
    }
}
