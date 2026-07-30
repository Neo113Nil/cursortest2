package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.internal.WebDialog;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class m63 implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean upWebView$lambda$7;
        upWebView$lambda$7 = WebDialog.setUpWebView$lambda$7(view, motionEvent);
        return upWebView$lambda$7;
    }
}
