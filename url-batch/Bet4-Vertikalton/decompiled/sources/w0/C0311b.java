package w0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.playbag.tripgear.R;
import g0.I;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311b extends I {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4163a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4164b;

    public C0311b() {
        Paint paint = new Paint();
        this.f4163a = paint;
        this.f4164b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // g0.I
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F;
        Paint paint = this.f4163a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f4164b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = C.a.f105a;
            float f2 = 1.0f - RecyclerView.f1530C0;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * RecyclerView.f1530C0) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * RecyclerView.f1530C0) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * RecyclerView.f1530C0) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * RecyclerView.f1530C0) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                C0312c c0312c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1739q;
                switch (c0312c.f4166b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = c0312c.f4167c.G();
                        break;
                }
                float f3 = i;
                C0312c c0312c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1739q;
                switch (c0312c2.f4166b) {
                    case 0:
                        i2 = c0312c2.f4167c.f2286o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0312c2.f4167c;
                        i2 = carouselLayoutManager.f2286o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(RecyclerView.f1530C0, f3, RecyclerView.f1530C0, i2, paint);
            } else {
                C0312c c0312c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1739q;
                switch (c0312c3.f4166b) {
                    case 0:
                        E2 = c0312c3.f4167c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                C0312c c0312c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1739q;
                switch (c0312c4.f4166b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c0312c4.f4167c;
                        F = carouselLayoutManager2.f2285n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = c0312c4.f4167c.f2285n;
                        break;
                }
                canvas.drawLine(f4, RecyclerView.f1530C0, F, RecyclerView.f1530C0, paint);
            }
        }
    }
}
