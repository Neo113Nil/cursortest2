package defpackage;

import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class y80 {
    public final View a;

    public y80(View view, d4 d4Var) {
        new y80(view);
        Choreographer.getInstance();
        this.a = view;
        long j = mh1.b;
        int length = new y7("").e.length();
        int i = mh1.c;
        int i2 = (int) (j >> 32);
        int i3 = i2 < 0 ? 0 : i2;
        i3 = i3 > length ? length : i3;
        int i4 = (int) (j & 4294967295L);
        int i5 = i4 >= 0 ? i4 : 0;
        length = i5 <= length ? i5 : length;
        if (i3 != i2 || length != i4) {
            ka0.b(i3, length);
        }
        int i6 = j70.e;
        new ArrayList();
        dg0[] dg0VarArr = dg0.d;
        ee0.a(new ce(12, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }

    public y80(View view) {
        this.a = view;
        dg0[] dg0VarArr = dg0.d;
        ee0.a(new ce(3, this));
    }
}
