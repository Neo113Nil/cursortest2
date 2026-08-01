package v0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.playgen.securelock.R;
import f0.AbstractC0091F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends AbstractC0091F {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4105a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4106b;

    public b() {
        Paint paint = new Paint();
        this.f4105a = paint;
        this.f4106b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // f0.AbstractC0091F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F;
        Paint paint = this.f4105a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f4106b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = C.a.f56a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1677q;
                switch (cVar.f4108b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = cVar.f4109c.G();
                        break;
                }
                float f3 = i;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1677q;
                switch (cVar2.f4108b) {
                    case 0:
                        i2 = cVar2.f4109c.f2036o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f4109c;
                        i2 = carouselLayoutManager.f2036o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(0.0f, f3, 0.0f, i2, paint);
            } else {
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1677q;
                switch (cVar3.f4108b) {
                    case 0:
                        E2 = cVar3.f4109c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1677q;
                switch (cVar4.f4108b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.f4109c;
                        F = carouselLayoutManager2.f2035n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = cVar4.f4109c.f2035n;
                        break;
                }
                canvas.drawLine(f4, 0.0f, F, 0.0f, paint);
            }
        }
    }
}
