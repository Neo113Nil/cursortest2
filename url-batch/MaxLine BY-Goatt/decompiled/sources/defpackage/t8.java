package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class t8 {
    public static void a(v8 v8Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        di2 di2Var;
        ai2 ai2Var;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(keyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (di2Var = (di2) v8Var.e().b((int) keyAt)) != null && (ai2Var = di2Var.a) != null) {
                Object g = ai2Var.d.m.g(rh2.k);
                if (g == null) {
                    g = null;
                }
                r1 r1Var = (r1) g;
                if (r1Var != null && (function1 = (Function1) r1Var.b) != null) {
                }
            }
        }
    }

    public static void b(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void c(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void d(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static xb2 e(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        lh.e(in1.k(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new xb2(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static void f(v8 v8Var, long[] jArr, Consumer consumer) {
        ai2 ai2Var;
        for (long j : jArr) {
            di2 di2Var = (di2) v8Var.e().b((int) j);
            if (di2Var != null && (ai2Var = di2Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(v8Var.m.getAutofillId(), ai2Var.g);
                Object g = ai2Var.d.m.g(gi2.A);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new yd(ze1.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static void g(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String h(iq0 iq0Var, Context context) {
        int i;
        int i2;
        ArrayList arrayList = iq0Var.a;
        ea0 b = zm3.b(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = context.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 != Integer.MAX_VALUE) {
                i = context.getResources().getConfiguration().fontWeightAdjustment;
                if (i != 0) {
                    return ze1.a(arrayList, null, new zd(24, b), 31);
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    b71.o();
                    return null;
                }
                float b2 = d.b(i + 400.0f, 1.0f, 1000.0f);
                boolean isEmpty = arrayList.isEmpty();
                String str = BuildConfig.FLAVOR;
                if (!isEmpty) {
                    str = BuildConfig.FLAVOR.concat(",");
                }
                return str + "'wght' " + b2;
            }
        }
        i = 0;
        if (i != 0) {
        }
    }
}
