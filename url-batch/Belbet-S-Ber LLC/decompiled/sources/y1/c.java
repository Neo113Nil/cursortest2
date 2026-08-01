package y1;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4102c;

    public c(int i) {
        this.f4100a = i;
    }

    public final int a() {
        switch (this.f4101b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4102c;
                if (carouselLayoutManager.F0()) {
                    return carouselLayoutManager.f1607n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4101b = i;
        switch (i) {
            case 1:
                this.f4102c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4102c = carouselLayoutManager;
                break;
        }
    }
}
