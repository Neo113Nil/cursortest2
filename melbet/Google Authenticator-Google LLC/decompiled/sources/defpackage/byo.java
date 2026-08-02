package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.migration.exports.OtpForExportView;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byo {
    public final Object a;
    public Object b;
    public final Object c;

    public byo(byte[] bArr) {
        this.c = new ckm((char[]) null);
        this.a = new ckm((char[]) null);
        this.b = new ry[32];
    }

    public static CheckBox a(OtpForExportView otpForExportView) {
        return (CheckBox) otpForExportView.findViewById(R.id.checkbox);
    }

    public static byj b(byj byjVar) {
        return new byj(byjVar.a, byjVar.b, !byjVar.c);
    }

    public static byo s(Context context, int i, int[] iArr) {
        return new byo(context, context.obtainStyledAttributes(i, iArr));
    }

    public static byo t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new byo(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static byo u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new byo(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final int c(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelSize(i, i2);
    }

    public final int e(int i, int i2) {
        return ((TypedArray) this.a).getInt(i, i2);
    }

    public final int f(int i, int i2) {
        return ((TypedArray) this.a).getInteger(i, i2);
    }

    public final int g(int i, int i2) {
        return ((TypedArray) this.a).getLayoutDimension(i, i2);
    }

    public final int h(int i, int i2) {
        return ((TypedArray) this.a).getResourceId(i, i2);
    }

    public final ColorStateList i(int i) {
        int resourceId;
        ColorStateList d;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = aat.d((Context) this.c, resourceId)) == null) ? typedArray.getColorStateList(i) : d;
    }

    public final Drawable j(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : e.f((Context) this.c, resourceId);
    }

    public final Drawable k(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return hx.d().g((Context) this.c, resourceId);
    }

    public final CharSequence l(int i) {
        return ((TypedArray) this.a).getText(i);
    }

    public final String m(int i) {
        return ((TypedArray) this.a).getString(i);
    }

    public final void n() {
        ((TypedArray) this.a).recycle();
    }

    public final boolean o(int i, boolean z) {
        return ((TypedArray) this.a).getBoolean(i, z);
    }

    public final boolean p(int i) {
        return ((TypedArray) this.a).hasValue(i);
    }

    public final int q(int i) {
        return ((TypedArray) this.a).getColor(i, 0);
    }

    public final float r(int i) {
        return ((TypedArray) this.a).getDimension(i, -1.0f);
    }

    public final brr v() {
        LocaleList adjustedDefault;
        int size;
        String str;
        Locale locale;
        Object obj = this.c;
        Intent intent = (Intent) obj;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        Object obj2 = ((hrz) this.a).a;
        Bundle bundle2 = new Bundle();
        if (obj2 != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((Integer) obj2).intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        adjustedDefault = LocaleList.getAdjustedDefault();
        size = adjustedDefault.size();
        if (size > 0) {
            locale = adjustedDefault.get(0);
            str = locale.toLanguageTag();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", str);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.b == null) {
                this.b = ActivityOptions.makeBasic();
            }
            ((ActivityOptions) this.b).setShareIdentityEnabled(false);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            if (this.b == null) {
                this.b = ActivityOptions.makeBasic();
            }
            ((ActivityOptions) this.b).setAllowPassThroughOnTouchOutside(!intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        Object obj3 = this.b;
        return new brr(obj, obj3 != null ? ((ActivityOptions) obj3).toBundle() : null);
    }

    public byo(Object obj, Object obj2) {
        this.a = obj;
        this.c = obj2;
    }

    public byo(Runnable runnable, Executor executor, byo byoVar) {
        this.a = runnable;
        this.c = executor;
        this.b = byoVar;
    }

    private byo(Context context, TypedArray typedArray) {
        this.c = context;
        this.a = typedArray;
    }

    public byo() {
        this.c = new Intent("android.intent.action.VIEW");
        this.a = new hrz();
    }
}
