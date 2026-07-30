package c0;

import androidx.fragment.app.U;
import androidx.lifecycle.W;
import u.C0940k;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0286b extends W {

    /* renamed from: b, reason: collision with root package name */
    public static final U f4166b = new U(1);

    /* renamed from: a, reason: collision with root package name */
    public final C0940k f4167a = new C0940k();

    @Override // androidx.lifecycle.W
    public final void onCleared() {
        C0940k c0940k = this.f4167a;
        int i2 = c0940k.f8048i;
        if (i2 > 0) {
            c0940k.f8047e[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c0940k.f8047e;
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = null;
        }
        c0940k.f8048i = 0;
    }
}
