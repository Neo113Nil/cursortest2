package u0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3814c;

    public c(int i) {
        this.f3812a = i;
    }

    public final int a() {
        switch (this.f3813b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3814c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f1971n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f3813b = i;
        switch (i) {
            case 1:
                this.f3814c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3814c = carouselLayoutManager;
                break;
        }
    }
}
