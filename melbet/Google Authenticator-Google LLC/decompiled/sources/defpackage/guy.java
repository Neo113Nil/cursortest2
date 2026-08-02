package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class guy implements View.OnLongClickListener {
    final /* synthetic */ gva a;
    final /* synthetic */ String b = "OtpView.onLongClick";
    final /* synthetic */ View.OnLongClickListener c;

    public guy(gva gvaVar, View.OnLongClickListener onLongClickListener) {
        this.a = gvaVar;
        this.c = onLongClickListener;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        view.getClass();
        gtt f = this.a.f(this.b, 33);
        try {
            boolean onLongClick = this.c.onLongClick(view);
            ixf.j(f, null);
            return onLongClick;
        } finally {
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClickUseDefaultHapticFeedback(View view) {
        boolean onLongClickUseDefaultHapticFeedback;
        view.getClass();
        onLongClickUseDefaultHapticFeedback = this.c.onLongClickUseDefaultHapticFeedback(view);
        return onLongClickUseDefaultHapticFeedback;
    }
}
