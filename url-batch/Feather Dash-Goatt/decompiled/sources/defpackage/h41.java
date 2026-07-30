package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h41 extends pc0 implements Function1 {
    public static final h41 e;
    public static final h41 g;
    public static final h41 h;
    public static final h41 i;
    public static final h41 j;
    public static final h41 k;
    public static final h41 l;
    public static final h41 m;
    public final /* synthetic */ int d;

    static {
        int i2 = 1;
        e = new h41(i2, 0);
        g = new h41(i2, 1);
        h = new h41(i2, 2);
        i = new h41(i2, 3);
        j = new h41(i2, 4);
        k = new h41(i2, 5);
        l = new h41(i2, 6);
        m = new h41(i2, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h41(e41 e41Var) {
        super(1);
        this.d = 8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Unit.a;
            case 1:
                return Integer.valueOf(((b71) obj).b);
            case 2:
                x90 x90Var = ((b71) obj).c;
                return Integer.valueOf(x90Var.d - x90Var.b);
            case 3:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 4:
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                throw null;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof wj) {
                    return (wj) tag;
                }
                return null;
            default:
                s81.a((u81) obj);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h41(int i2, int i3) {
        super(i2);
        this.d = i3;
    }
}
