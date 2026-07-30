package defpackage;

import android.view.autofill.AutofillId;
import com.facebook.appevents.AppEventsManager$start$1;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FeatureManager;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class lh implements FeatureManager.Callback, nc0 {
    public final /* synthetic */ int m;

    public /* synthetic */ lh(int i) {
        this.m = i;
    }

    public static /* bridge */ /* synthetic */ AutofillId a(Object obj) {
        return (AutofillId) obj;
    }

    public static /* synthetic */ void c(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void g(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.nc0
    public double b(double d) {
        switch (this.m) {
            case 23:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 24:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case Constants.MAX_TREE_DEPTH /* 25 */:
                float[] fArr = kw.a;
                return kw.b(kw.c, d);
            case 26:
                float[] fArr2 = kw.a;
                return kw.a(kw.c, d);
            case 27:
                float[] fArr3 = kw.a;
                return kw.d(kw.d, d);
            default:
                float[] fArr4 = kw.a;
                return kw.c(kw.d, d);
        }
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        switch (this.m) {
            case 0:
                AppEventsManager$start$1.onSuccess$lambda$5(z);
                break;
            case 1:
                AppEventsManager$start$1.onSuccess$lambda$6(z);
                break;
            case 2:
                AppEventsManager$start$1.onSuccess$lambda$7(z);
                break;
            case 3:
                AppEventsManager$start$1.onSuccess$lambda$8(z);
                break;
            case 4:
                AppEventsManager$start$1.onSuccess$lambda$9(z);
                break;
            case 5:
                AppEventsManager$start$1.onSuccess$lambda$10(z);
                break;
            case 6:
                AppEventsManager$start$1.onSuccess$lambda$11(z);
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                AppEventsManager$start$1.onSuccess$lambda$12(z);
                break;
            case 8:
                AppEventsManager$start$1.onSuccess$lambda$13(z);
                break;
            case 9:
                AppEventsManager$start$1.onSuccess$lambda$14(z);
                break;
            case 10:
                AppEventsManager$start$1.onSuccess$lambda$15(z);
                break;
            case 11:
                AppEventsManager$start$1.onSuccess$lambda$16(z);
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                AppEventsManager$start$1.onSuccess$lambda$1(z);
                break;
            default:
                AppEventsManager$start$1.onSuccess$lambda$2(z);
                break;
        }
    }
}
