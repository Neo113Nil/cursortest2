package A0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.winpower.neonfit.R;
import h0.AbstractC0138D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends AbstractC0138D {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f9a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10b;

    public d() {
        Paint paint = new Paint();
        this.f9a = paint;
        this.f10b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // h0.AbstractC0138D
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F2;
        Paint paint = this.f9a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f10b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            ThreadLocal threadLocal = E.a.f278a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                e eVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2332q;
                switch (eVar.f12b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = eVar.f13c.G();
                        break;
                }
                float f3 = i;
                e eVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2332q;
                switch (eVar2.f12b) {
                    case 0:
                        i2 = eVar2.f13c.f2915o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = eVar2.f13c;
                        i2 = carouselLayoutManager.f2915o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(0.0f, f3, 0.0f, i2, paint);
            } else {
                e eVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2332q;
                switch (eVar3.f12b) {
                    case 0:
                        E2 = eVar3.f13c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                e eVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2332q;
                switch (eVar4.f12b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = eVar4.f13c;
                        F2 = carouselLayoutManager2.f2914n - carouselLayoutManager2.F();
                        break;
                    default:
                        F2 = eVar4.f13c.f2914n;
                        break;
                }
                canvas.drawLine(f4, 0.0f, F2, 0.0f, paint);
            }
        }
    }
}
