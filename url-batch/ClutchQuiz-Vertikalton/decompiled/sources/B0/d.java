package B0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.clutchquizarena.app.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import f0.E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends E {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f85a;

    /* renamed from: b, reason: collision with root package name */
    public final List f86b;

    public d() {
        Paint paint = new Paint();
        this.f85a = paint;
        this.f86b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // f0.E
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F;
        Paint paint = this.f85a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f86b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            ThreadLocal threadLocal = C.a.f92a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                e eVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1821q;
                switch (eVar.f88b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = eVar.f89c.G();
                        break;
                }
                float f3 = i;
                e eVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1821q;
                switch (eVar2.f88b) {
                    case 0:
                        i2 = eVar2.f89c.f2153o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = eVar2.f89c;
                        i2 = carouselLayoutManager.f2153o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(0.0f, f3, 0.0f, i2, paint);
            } else {
                e eVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1821q;
                switch (eVar3.f88b) {
                    case 0:
                        E2 = eVar3.f89c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                e eVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1821q;
                switch (eVar4.f88b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = eVar4.f89c;
                        F = carouselLayoutManager2.f2152n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = eVar4.f89c.f2152n;
                        break;
                }
                canvas.drawLine(f4, 0.0f, F, 0.0f, paint);
            }
        }
    }
}
