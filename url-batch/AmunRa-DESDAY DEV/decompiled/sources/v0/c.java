package v0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4113c;

    public c(int i) {
        this.f4111a = i;
    }

    public final int a() {
        switch (this.f4112b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4113c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f2034n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4112b = i;
        switch (i) {
            case 1:
                this.f4113c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4113c = carouselLayoutManager;
                break;
        }
    }
}
