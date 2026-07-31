package a3;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* loaded from: classes.dex */
public class k2 extends j2 {
    @Override // a3.j2, a3.f
    public final boolean i(View view) {
        return view.isAttachedToWindow();
    }

    @Override // a3.f
    public final ViewGroup.LayoutParams j() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
