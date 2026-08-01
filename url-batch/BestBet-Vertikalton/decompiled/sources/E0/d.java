package E0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import g0.AbstractC0135E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends AbstractC0135E {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f222a;

    /* renamed from: b, reason: collision with root package name */
    public final List f223b;

    public d() {
        Paint paint = new Paint();
        this.f222a = paint;
        this.f223b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // g0.AbstractC0135E
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F;
        Paint paint = this.f222a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f223b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            ThreadLocal threadLocal = C.a.f66a;
            float f2 = 1.0f - RecyclerView.f1937A0;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * RecyclerView.f1937A0) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * RecyclerView.f1937A0) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * RecyclerView.f1937A0) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * RecyclerView.f1937A0) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                e eVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2219q;
                switch (eVar.f225b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = eVar.f226c.G();
                        break;
                }
                float f3 = i;
                e eVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2219q;
                switch (eVar2.f225b) {
                    case 0:
                        i2 = eVar2.f226c.f2735o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = eVar2.f226c;
                        i2 = carouselLayoutManager.f2735o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(RecyclerView.f1937A0, f3, RecyclerView.f1937A0, i2, paint);
            } else {
                e eVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2219q;
                switch (eVar3.f225b) {
                    case 0:
                        E2 = eVar3.f226c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                e eVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2219q;
                switch (eVar4.f225b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = eVar4.f226c;
                        F = carouselLayoutManager2.f2734n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = eVar4.f226c.f2734n;
                        break;
                }
                canvas.drawLine(f4, RecyclerView.f1937A0, F, RecyclerView.f1937A0, paint);
            }
        }
    }
}
