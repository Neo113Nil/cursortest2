package g2;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1709b;

    public /* synthetic */ c(int i, Object obj) {
        this.f1708a = i;
        this.f1709b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean z3;
        q1.a aVar;
        switch (this.f1708a) {
            case 0:
                t1.a aVar2 = (t1.a) this.f1709b;
                View view2 = aVar2.f1743w;
                ImageView imageView = aVar2.f1745y;
                if (imageView.getVisibility() == 0 && (aVar = aVar2.f1720f0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.i(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.f1742v.getLayoutParams();
                int i11 = (i5 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i12 = (i6 - i4) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z4 = true;
                if (aVar2.f1722g0 == 1 && aVar2.f1715a0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (aVar2.f1715a0 != -2 || view2.getMeasuredWidth() == i11) {
                        z3 = false;
                    } else {
                        layoutParams2.width = Math.max(i11, Math.min(aVar2.V, aVar2.getMeasuredWidth() - (aVar2.d0 * 2)));
                        z3 = true;
                    }
                    if (view2.getMeasuredHeight() < i12) {
                        layoutParams2.height = i12;
                    } else {
                        z4 = z3;
                    }
                    if (z4) {
                        view2.setLayoutParams(layoutParams2);
                        break;
                    }
                }
                break;
            default:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f1709b;
                if (i5 - i != i9 - i7 || i6 - i4 != i10 - i8) {
                    view.post(new a.j(13, carouselLayoutManager));
                    break;
                }
                break;
        }
    }
}
