package f3;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import r2.o;

/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private o f16179f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16180g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView.ScaleType f16181h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16182i;

    /* renamed from: j, reason: collision with root package name */
    private g f16183j;

    /* renamed from: k, reason: collision with root package name */
    private h f16184k;

    protected final synchronized void a(g gVar) {
        this.f16183j = gVar;
        if (this.f16180g) {
            gVar.f16199a.c(this.f16179f);
        }
    }

    protected final synchronized void b(h hVar) {
        this.f16184k = hVar;
        if (this.f16182i) {
            hVar.f16200a.d(this.f16181h);
        }
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.f16182i = true;
        this.f16181h = scaleType;
        h hVar = this.f16184k;
        if (hVar != null) {
            hVar.f16200a.d(scaleType);
        }
    }

    public void setMediaContent(@RecentlyNonNull o oVar) {
        this.f16180g = true;
        this.f16179f = oVar;
        g gVar = this.f16183j;
        if (gVar != null) {
            gVar.f16199a.c(oVar);
        }
    }
}
