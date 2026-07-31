package a0;

import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9a;

    public /* synthetic */ a(int i) {
        this.f9a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9a) {
            case 0:
                return q6.i.f(((k1) obj2).f110a, ((k1) obj).f110a);
            case 1:
                return q6.i.f(((z.l) obj).f9056a, ((z.l) obj2).f9056a);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                c6.f fVar = (c6.f) obj;
                c6.f fVar2 = (c6.f) obj2;
                return (((Number) fVar.f1748e).intValue() - ((Number) fVar.f1747d).intValue()) - (((Number) fVar2.f1748e).intValue() - ((Number) fVar2.f1747d).intValue());
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return q6.i.f(((m0.o0) obj).f5031b, ((m0.o0) obj2).f5031b);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b8 = bArr[i];
                    byte b9 = bArr2[i];
                    if (b8 != b9) {
                        return b8 - b9;
                    }
                }
                return 0;
            case 5:
                w1.f0 f0Var = (w1.f0) obj;
                w1.f0 f0Var2 = (w1.f0) obj2;
                float f6 = f0Var.G.f7700p.G;
                float f8 = f0Var2.G.f7700p.G;
                return f6 == f8 ? q6.i.f(f0Var.t(), f0Var2.t()) : Float.compare(f6, f8);
            case 6:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                o.j0 j0Var = x1.h1.f8447d;
                Object g3 = j0Var.g(view);
                q6.i.b(g3);
                Rect rect = (Rect) g3;
                Object g7 = j0Var.g(view2);
                q6.i.b(g7);
                Rect rect2 = (Rect) g7;
                int i8 = rect.top - rect2.top;
                return i8 == 0 ? rect.bottom - rect2.bottom : i8;
            default:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                o.j0 j0Var2 = x1.h1.f8447d;
                Object g8 = j0Var2.g(view3);
                q6.i.b(g8);
                Rect rect3 = (Rect) g8;
                Object g9 = j0Var2.g(view4);
                q6.i.b(g9);
                Rect rect4 = (Rect) g9;
                int i9 = rect3.left - rect4.left;
                return i9 == 0 ? (rect3.right - rect4.right) * x1.h1.f8446c : x1.h1.f8446c * i9;
        }
    }
}
