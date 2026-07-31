package m5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import w4.b0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f5224a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5225b;

    public b() {
        Paint paint = new Paint();
        this.f5224a = paint;
        this.f5225b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // w4.b0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int y7;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f5224a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f5225b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            int i8 = i3.a.f3419a;
            float f6 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f6)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f6)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f6)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f6))));
            int i9 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).c0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1898l;
                switch (cVar.f5227b) {
                    case 0:
                        break;
                    default:
                        i9 = cVar.f5228c.z();
                        break;
                }
                float f8 = i9;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1898l;
                switch (cVar2.f5227b) {
                    case 0:
                        i = cVar2.f5228c.f7907j;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f5228c;
                        i = carouselLayoutManager.f7907j - carouselLayoutManager.w();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f8, 0.0f, i, paint);
            } else {
                canvas2 = canvas;
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1898l;
                switch (cVar3.f5227b) {
                    case 0:
                        i9 = cVar3.f5228c.x();
                        break;
                }
                float f9 = i9;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1898l;
                switch (cVar4.f5227b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.f5228c;
                        y7 = carouselLayoutManager2.i - carouselLayoutManager2.y();
                        break;
                    default:
                        y7 = cVar4.f5228c.i;
                        break;
                }
                canvas2.drawLine(f9, 0.0f, y7, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
