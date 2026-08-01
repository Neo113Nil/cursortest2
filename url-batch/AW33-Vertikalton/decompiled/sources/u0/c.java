package u0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3826c;

    public c(int i) {
        this.f3824a = i;
    }

    public final int a() {
        switch (this.f3825b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3826c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f1966n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f3825b = i;
        switch (i) {
            case 1:
                this.f3826c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3826c = carouselLayoutManager;
                break;
        }
    }
}
