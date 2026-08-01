package w0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.winworm.neongrid.R;
import g0.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends G {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4088a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4089b;

    public b() {
        Paint paint = new Paint();
        this.f4088a = paint;
        this.f4089b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // g0.G
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F;
        Paint paint = this.f4088a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f4089b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = C.a.f70a;
            float f2 = 1.0f - RecyclerView.f1559A0;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * RecyclerView.f1559A0) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * RecyclerView.f1559A0) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * RecyclerView.f1559A0) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * RecyclerView.f1559A0) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1770q;
                switch (cVar.f4091b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = cVar.f4092c.G();
                        break;
                }
                float f3 = i;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1770q;
                switch (cVar2.f4091b) {
                    case 0:
                        i2 = cVar2.f4092c.f2321o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f4092c;
                        i2 = carouselLayoutManager.f2321o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(RecyclerView.f1559A0, f3, RecyclerView.f1559A0, i2, paint);
            } else {
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1770q;
                switch (cVar3.f4091b) {
                    case 0:
                        E2 = cVar3.f4092c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1770q;
                switch (cVar4.f4091b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.f4092c;
                        F = carouselLayoutManager2.f2320n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = cVar4.f4092c.f2320n;
                        break;
                }
                canvas.drawLine(f4, RecyclerView.f1559A0, F, RecyclerView.f1559A0, paint);
            }
        }
    }
}
