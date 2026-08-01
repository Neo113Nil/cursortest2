package s1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import b1.k0;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3315a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3316b;

    public b() {
        Paint paint = new Paint();
        this.f3315a = paint;
        this.f3316b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // b1.k0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int F;
        int i4;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f3315a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f3316b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = c0.a.f976a;
            float f4 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f4)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f4)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f4)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f4))));
            int i5 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1253q;
                switch (cVar.f3318b) {
                    case 0:
                        break;
                    default:
                        i5 = cVar.c.G();
                        break;
                }
                float f5 = i5;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1253q;
                switch (cVar2.f3318b) {
                    case 0:
                        i4 = cVar2.c.f885o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.c;
                        i4 = carouselLayoutManager.f885o - carouselLayoutManager.D();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f5, 0.0f, i4, paint);
            } else {
                canvas2 = canvas;
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1253q;
                switch (cVar3.f3318b) {
                    case 0:
                        i5 = cVar3.c.E();
                        break;
                }
                float f6 = i5;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1253q;
                switch (cVar4.f3318b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.c;
                        F = carouselLayoutManager2.f884n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = cVar4.c.f884n;
                        break;
                }
                canvas2.drawLine(f6, 0.0f, F, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
