package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tc2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ tc2(View view, Object obj, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = view;
        this.wdg6QnbFHrFF = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ((ViewGroup) this.OPXfSBeufaJ8).addView((rc2) this.wdg6QnbFHrFF, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.wdg6QnbFHrFF;
        View view2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                ((ViewGroup) view2).addView((rc2) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view2.removeOnAttachStateChangeListener(this);
                ((ht1) obj).ZbWwgt3aGe7A();
                break;
        }
    }

    private final void PxuCJdSBwIXG(View view) {
    }
}
