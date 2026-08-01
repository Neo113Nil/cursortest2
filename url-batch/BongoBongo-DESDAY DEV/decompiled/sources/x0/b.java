package x0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.winfour.winrandom.R;
import h0.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends G {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4281a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4282b;

    public b() {
        Paint paint = new Paint();
        this.f4281a = paint;
        this.f4282b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // h0.G
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F2;
        Paint paint = this.f4281a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f4282b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = D.a.f112a;
            float f2 = 1.0f - RecyclerView.A0;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * RecyclerView.A0) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * RecyclerView.A0) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * RecyclerView.A0) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * RecyclerView.A0) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1837q;
                switch (cVar.f4284b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = cVar.f4285c.G();
                        break;
                }
                float f3 = i;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1837q;
                switch (cVar2.f4284b) {
                    case 0:
                        i2 = cVar2.f4285c.f2408o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f4285c;
                        i2 = carouselLayoutManager.f2408o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(RecyclerView.A0, f3, RecyclerView.A0, i2, paint);
            } else {
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1837q;
                switch (cVar3.f4284b) {
                    case 0:
                        E2 = cVar3.f4285c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1837q;
                switch (cVar4.f4284b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.f4285c;
                        F2 = carouselLayoutManager2.f2407n - carouselLayoutManager2.F();
                        break;
                    default:
                        F2 = cVar4.f4285c.f2407n;
                        break;
                }
                canvas.drawLine(f4, RecyclerView.A0, F2, RecyclerView.A0, paint);
            }
        }
    }
}
