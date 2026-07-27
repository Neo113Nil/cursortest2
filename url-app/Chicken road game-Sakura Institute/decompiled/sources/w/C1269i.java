package w;

import G.C0216p;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function2;

/* renamed from: w.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1269i extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1269i(int i2) {
        super(2);
        this.f11227d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2;
        C0216p c0216p = (C0216p) obj;
        ((Number) obj2).intValue();
        c0216p.S(-1451087197);
        int i4 = this.f11227d;
        if (i4 == 0) {
            throw null;
        }
        c0216p.k(AndroidCompositionLocals_androidKt.f5212a);
        Resources resources = ((Context) c0216p.k(AndroidCompositionLocals_androidKt.f5213b)).getResources();
        if (i4 == 1) {
            i2 = R.string.cut;
        } else if (i4 == 2) {
            i2 = R.string.copy;
        } else if (i4 == 3) {
            i2 = R.string.paste;
        } else {
            if (i4 != 4) {
                throw null;
            }
            i2 = R.string.selectAll;
        }
        String string = resources.getString(i2);
        c0216p.q(false);
        return string;
    }
}
