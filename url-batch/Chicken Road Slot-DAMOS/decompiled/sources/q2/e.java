package q2;

import a2.a0;
import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import c6.s;
import d2.v;
import hd.h;
import hd.i;
import java.util.ArrayList;
import m2.g0;
import m2.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final View f7966a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7967b;

    public e(View view, v vVar) {
        s sVar = new s();
        sVar.f1868d = view;
        sVar.f1869e = h.a(i.f4508e, new a0(10, sVar));
        Choreographer.getInstance();
        this.f7966a = view;
        long j = g0.f6476b;
        int length = new m2.e("").f6454e.length();
        int i3 = g0.f6477c;
        int i10 = (int) (j >> 32);
        int i11 = i10 < 0 ? 0 : i10;
        i11 = i11 > length ? length : i11;
        int i12 = (int) (j & 4294967295L);
        int i13 = i12 >= 0 ? i12 : 0;
        length = i13 <= length ? i13 : length;
        if (i11 != i10 || length != i12) {
            z.b(i11, length);
        }
        int i14 = b.f7958e;
        new ArrayList();
        this.f7967b = h.a(i.f4508e, new a0(11, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }
}
