package x1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.oriondriftchasers.arordrft.R;
import f1.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3614a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3615b;

    public a() {
        Paint paint = new Paint();
        this.f3614a = paint;
        this.f3615b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // f1.j0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int F;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f3614a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f3615b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).getClass();
            ThreadLocal threadLocal = f0.a.f1264a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            int i4 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                b bVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f880q;
                switch (bVar.f3617b) {
                    case 0:
                        break;
                    default:
                        i4 = bVar.f3618c.G();
                        break;
                }
                float f4 = i4;
                b bVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f880q;
                switch (bVar2.f3617b) {
                    case 0:
                        i = bVar2.f3618c.f1456o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = bVar2.f3618c;
                        i = carouselLayoutManager.f1456o - carouselLayoutManager.D();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f4, 0.0f, i, paint);
            } else {
                canvas2 = canvas;
                b bVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f880q;
                switch (bVar3.f3617b) {
                    case 0:
                        i4 = bVar3.f3618c.E();
                        break;
                }
                float f5 = i4;
                b bVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f880q;
                switch (bVar4.f3617b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = bVar4.f3618c;
                        F = carouselLayoutManager2.f1455n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = bVar4.f3618c.f1455n;
                        break;
                }
                canvas2.drawLine(f5, 0.0f, F, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
