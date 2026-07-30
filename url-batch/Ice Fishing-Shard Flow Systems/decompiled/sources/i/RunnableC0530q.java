package i;

import I.T;
import I.Y;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* renamed from: i.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0530q implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0500B f5480e;

    public /* synthetic */ RunnableC0530q(LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B, int i2) {
        this.f5479d = i2;
        this.f5480e = layoutInflaterFactory2C0500B;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i2 = this.f5479d;
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = this.f5480e;
        switch (i2) {
            case 0:
                if ((layoutInflaterFactory2C0500B.f5337h0 & 1) != 0) {
                    layoutInflaterFactory2C0500B.w(0);
                }
                if ((layoutInflaterFactory2C0500B.f5337h0 & 4096) != 0) {
                    layoutInflaterFactory2C0500B.w(108);
                }
                layoutInflaterFactory2C0500B.f5336g0 = false;
                layoutInflaterFactory2C0500B.f5337h0 = 0;
                break;
            default:
                layoutInflaterFactory2C0500B.f5309E.showAtLocation(layoutInflaterFactory2C0500B.f5308D, 55, 0, 0);
                Y y7 = layoutInflaterFactory2C0500B.f5311G;
                if (y7 != null) {
                    y7.b();
                }
                if (layoutInflaterFactory2C0500B.f5312H && (viewGroup = layoutInflaterFactory2C0500B.f5313I) != null) {
                    WeakHashMap weakHashMap = T.f1153a;
                    if (viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0500B.f5308D.setAlpha(0.0f);
                        Y a7 = T.a(layoutInflaterFactory2C0500B.f5308D);
                        a7.a(1.0f);
                        layoutInflaterFactory2C0500B.f5311G = a7;
                        a7.d(new C0533t(0, this));
                        break;
                    }
                }
                layoutInflaterFactory2C0500B.f5308D.setAlpha(1.0f);
                layoutInflaterFactory2C0500B.f5308D.setVisibility(0);
                break;
        }
    }
}
