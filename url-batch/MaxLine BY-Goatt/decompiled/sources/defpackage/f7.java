package defpackage;

import android.view.ViewTreeObserver;
import com.facebook.login.widget.ToolTipPopup;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class f7 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ f7(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                ((t7) obj).K();
                break;
            default:
                ToolTipPopup.scrollListener$lambda$1((ToolTipPopup) obj);
                break;
        }
    }
}
