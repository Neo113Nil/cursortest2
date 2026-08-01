package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ra extends e80 {
    public final Paint a;
    public final List b;

    public ra() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.e80
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        int F;
        Canvas canvas2;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((tw) it.next()).getClass();
            ThreadLocal threadLocal = fd.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int i2 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                sa saVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (saVar.b) {
                    case 0:
                        break;
                    default:
                        i2 = saVar.c.G();
                        break;
                }
                float f2 = i2;
                sa saVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (saVar2.b) {
                    case 0:
                        i = saVar2.c.o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = saVar2.c;
                        i = carouselLayoutManager.o - carouselLayoutManager.D();
                        break;
                }
                float f3 = i;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, f3, paint);
            } else {
                sa saVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (saVar3.b) {
                    case 0:
                        i2 = saVar3.c.E();
                        break;
                }
                float f4 = i2;
                sa saVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (saVar4.b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = saVar4.c;
                        F = carouselLayoutManager2.n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = saVar4.c.n;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, 0.0f, F, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
