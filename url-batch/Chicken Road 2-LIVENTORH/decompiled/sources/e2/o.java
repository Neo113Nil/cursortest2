package e2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.emoji2.text.t;
import com.google.android.material.appbar.MaterialToolbar;
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.d0;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1234a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1235b = {R.attr.colorPrimaryVariant};

    /* renamed from: c, reason: collision with root package name */
    public static final a0.i f1236c = new a0.i(1);

    public static void a(Context context, AttributeSet attributeSet, int i, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.J, i, i4);
        boolean z3 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z3) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f1235b, "Theme.MaterialComponents");
            }
        }
        c(context, f1234a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i4, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.J, i, i4);
        boolean z3 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i4);
            for (int i5 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i5, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z3 = true;
            obtainStyledAttributes.recycle();
            if (!z3) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static void d(View view, q qVar) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        r rVar = new r();
        rVar.f1237a = paddingStart;
        rVar.f1238b = paddingTop;
        rVar.f1239c = paddingEnd;
        rVar.d = paddingBottom;
        androidx.emoji2.text.q qVar2 = new androidx.emoji2.text.q(qVar, rVar, 6);
        WeakHashMap weakHashMap = l0.f2757a;
        d0.j(view, qVar2);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new p());
        }
    }

    public static ArrayList e(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TypedArray f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i4, int... iArr2) {
        a(context, attributeSet, i, i4);
        b(context, attributeSet, iArr, i, i4, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i4);
    }

    public static t g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i4, int... iArr2) {
        a(context, attributeSet, i, i4);
        b(context, attributeSet, iArr, i, i4, iArr2);
        return new t(context, context.obtainStyledAttributes(attributeSet, iArr, i, i4));
    }

    public static PorterDuff.Mode h(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
