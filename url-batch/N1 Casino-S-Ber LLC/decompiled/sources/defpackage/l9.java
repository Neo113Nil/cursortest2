package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class l9 extends uy {
    public final Paint a;
    public final List b;

    public l9() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.uy
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        int F;
        Canvas canvas2;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((np) it.next()).getClass();
            ThreadLocal threadLocal = lb.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int i2 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                m9 m9Var = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (m9Var.b) {
                    case 0:
                        break;
                    default:
                        i2 = m9Var.c.G();
                        break;
                }
                float f2 = i2;
                m9 m9Var2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (m9Var2.b) {
                    case 0:
                        i = m9Var2.c.o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = m9Var2.c;
                        i = carouselLayoutManager.o - carouselLayoutManager.D();
                        break;
                }
                float f3 = i;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, f3, paint);
            } else {
                m9 m9Var3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (m9Var3.b) {
                    case 0:
                        i2 = m9Var3.c.E();
                        break;
                }
                float f4 = i2;
                m9 m9Var4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (m9Var4.b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = m9Var4.c;
                        F = carouselLayoutManager2.n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = m9Var4.c.n;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, 0.0f, F, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
