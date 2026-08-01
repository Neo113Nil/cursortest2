package y1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.gdmhkmf.belbet.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import g1.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4098a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4099b;

    public b() {
        Paint paint = new Paint();
        this.f4098a = paint;
        this.f4099b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // g1.x0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int E;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f4098a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f4099b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = f0.a.f1413a;
            float f5 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f5)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f5)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f5)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f5))));
            int i4 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).E0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f998q;
                switch (cVar.f4101b) {
                    case 0:
                        break;
                    default:
                        i4 = cVar.f4102c.F();
                        break;
                }
                float f6 = i4;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f998q;
                switch (cVar2.f4101b) {
                    case 0:
                        i = cVar2.f4102c.f1608o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f4102c;
                        i = carouselLayoutManager.f1608o - carouselLayoutManager.C();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f6, 0.0f, i, paint);
            } else {
                canvas2 = canvas;
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f998q;
                switch (cVar3.f4101b) {
                    case 0:
                        i4 = cVar3.f4102c.D();
                        break;
                }
                float f7 = i4;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f998q;
                switch (cVar4.f4101b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.f4102c;
                        E = carouselLayoutManager2.f1607n - carouselLayoutManager2.E();
                        break;
                    default:
                        E = cVar4.f4102c.f1607n;
                        break;
                }
                canvas2.drawLine(f7, 0.0f, E, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
