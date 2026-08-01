package x1;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3618c;

    public b(int i) {
        this.f3616a = i;
    }

    public final int a() {
        switch (this.f3617b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3618c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.f1455n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f3617b = i;
        switch (i) {
            case 1:
                this.f3618c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3618c = carouselLayoutManager;
                break;
        }
    }
}
