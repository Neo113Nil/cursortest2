package f3;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.q40;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.yz;
import r2.o;

/* loaded from: classes.dex */
public final class e extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private final FrameLayout f16197f;

    /* renamed from: g, reason: collision with root package name */
    private final q40 f16198g;

    private final void e(String str, View view) {
        q40 q40Var = this.f16198g;
        if (q40Var != null) {
            try {
                q40Var.U1(str, x3.b.B3(view));
            } catch (RemoteException e7) {
                io0.e("Unable to call setAssetView on delegate", e7);
            }
        }
    }

    public void a() {
        q40 q40Var = this.f16198g;
        if (q40Var != null) {
            try {
                q40Var.c();
            } catch (RemoteException e7) {
                io0.e("Unable to destroy native ad view", e7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@RecentlyNonNull View view, int i7, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        super.bringChildToFront(this.f16197f);
    }

    @RecentlyNullable
    protected final View b(@RecentlyNonNull String str) {
        q40 q40Var = this.f16198g;
        if (q40Var != null) {
            try {
                x3.a s7 = q40Var.s(str);
                if (s7 != null) {
                    return (View) x3.b.O0(s7);
                }
            } catch (RemoteException e7) {
                io0.e("Unable to call getAssetView on delegate", e7);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@RecentlyNonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f16197f;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(o oVar) {
        q40 q40Var = this.f16198g;
        if (q40Var == null) {
            return;
        }
        try {
            if (oVar instanceof yz) {
                q40Var.e5(((yz) oVar).a());
            } else if (oVar == null) {
                q40Var.e5(null);
            } else {
                io0.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e7) {
            io0.e("Unable to call setMediaContent on delegate", e7);
        }
    }

    final /* synthetic */ void d(ImageView.ScaleType scaleType) {
        q40 q40Var = this.f16198g;
        if (q40Var == null || scaleType == null) {
            return;
        }
        try {
            q40Var.T5(x3.b.B3(scaleType));
        } catch (RemoteException e7) {
            io0.e("Unable to call setMediaViewImageScaleType on delegate", e7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        q40 q40Var;
        if (((Boolean) sw.c().b(m10.f8195f2)).booleanValue() && (q40Var = this.f16198g) != null) {
            try {
                q40Var.L0(x3.b.B3(motionEvent));
            } catch (RemoteException e7) {
                io0.e("Unable to call handleTouchEvent on delegate", e7);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @RecentlyNullable
    public a getAdChoicesView() {
        View b7 = b("3011");
        if (b7 instanceof a) {
            return (a) b7;
        }
        return null;
    }

    @RecentlyNullable
    public final View getAdvertiserView() {
        return b("3005");
    }

    @RecentlyNullable
    public final View getBodyView() {
        return b("3004");
    }

    @RecentlyNullable
    public final View getCallToActionView() {
        return b("3002");
    }

    @RecentlyNullable
    public final View getHeadlineView() {
        return b("3001");
    }

    @RecentlyNullable
    public final View getIconView() {
        return b("3003");
    }

    @RecentlyNullable
    public final View getImageView() {
        return b("3008");
    }

    @RecentlyNullable
    public final b getMediaView() {
        View b7 = b("3010");
        if (b7 instanceof b) {
            return (b) b7;
        }
        if (b7 == null) {
            return null;
        }
        io0.b("View is not an instance of MediaView");
        return null;
    }

    @RecentlyNullable
    public final View getPriceView() {
        return b("3007");
    }

    @RecentlyNullable
    public final View getStarRatingView() {
        return b("3009");
    }

    @RecentlyNullable
    public final View getStoreView() {
        return b("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@RecentlyNonNull View view, int i7) {
        super.onVisibilityChanged(view, i7);
        q40 q40Var = this.f16198g;
        if (q40Var != null) {
            try {
                q40Var.K2(x3.b.B3(view), i7);
            } catch (RemoteException e7) {
                io0.e("Unable to call onVisibilityChanged on delegate", e7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f16197f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@RecentlyNonNull View view) {
        if (this.f16197f == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        e("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        e("3005", view);
    }

    public final void setBodyView(View view) {
        e("3004", view);
    }

    public final void setCallToActionView(View view) {
        e("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        q40 q40Var = this.f16198g;
        if (q40Var != null) {
            try {
                q40Var.k3(x3.b.B3(view));
            } catch (RemoteException e7) {
                io0.e("Unable to call setClickConfirmingView on delegate", e7);
            }
        }
    }

    public final void setHeadlineView(View view) {
        e("3001", view);
    }

    public final void setIconView(View view) {
        e("3003", view);
    }

    public final void setImageView(View view) {
        e("3008", view);
    }

    public final void setMediaView(b bVar) {
        e("3010", bVar);
        if (bVar == null) {
            return;
        }
        bVar.a(new g(this));
        bVar.b(new h(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, x3.a] */
    public void setNativeAd(@RecentlyNonNull c cVar) {
        q40 q40Var = this.f16198g;
        if (q40Var != 0) {
            try {
                q40Var.B1(cVar.c());
            } catch (RemoteException e7) {
                io0.e("Unable to call setNativeAd on delegate", e7);
            }
        }
    }

    public final void setPriceView(View view) {
        e("3007", view);
    }

    public final void setStarRatingView(View view) {
        e("3009", view);
    }

    public final void setStoreView(View view) {
        e("3006", view);
    }
}
