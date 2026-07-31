package k5;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Arrays;
import q6.i;
import r3.p;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements p {

    /* renamed from: d, reason: collision with root package name */
    public int f4189d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4190e;

    public /* synthetic */ e(int i, Object obj) {
        this.f4190e = obj;
        this.f4189d = i;
    }

    public void a(long j7) {
        if (b(j7)) {
            return;
        }
        int i = this.f4189d;
        long[] jArr = (long[]) this.f4190e;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            i.d(jArr, "copyOf(...)");
            this.f4190e = jArr;
        }
        jArr[i] = j7;
        if (i >= this.f4189d) {
            this.f4189d = i + 1;
        }
    }

    public boolean b(long j7) {
        int i = this.f4189d;
        for (int i8 = 0; i8 < i; i8++) {
            if (((long[]) this.f4190e)[i8] == j7) {
                return true;
            }
        }
        return false;
    }

    public void c(long j7) {
        int i = this.f4189d;
        int i8 = 0;
        while (i8 < i) {
            if (j7 == ((long[]) this.f4190e)[i8]) {
                int i9 = this.f4189d - 1;
                while (i8 < i9) {
                    long[] jArr = (long[]) this.f4190e;
                    int i10 = i8 + 1;
                    jArr[i8] = jArr[i10];
                    i8 = i10;
                }
                this.f4189d--;
                return;
            }
            i8++;
        }
    }

    @Override // r3.p
    public boolean d(View view) {
        ((BottomSheetBehavior) this.f4190e).B(this.f4189d);
        return true;
    }
}
