package m5;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f5226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f5228c;

    public c(int i) {
        this.f5226a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f5227b = i;
        switch (i) {
            case 1:
                this.f5228c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f5228c = carouselLayoutManager;
                break;
        }
    }
}
