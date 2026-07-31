package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1254c;
import androidx.appcompat.widget.C1255d;
import androidx.appcompat.widget.C1256e;
import androidx.appcompat.widget.C1260i;
import androidx.appcompat.widget.C1263l;
import androidx.appcompat.widget.C1265n;
import androidx.appcompat.widget.C1268q;
import androidx.appcompat.widget.C1270t;
import androidx.appcompat.widget.C1275y;
import androidx.appcompat.widget.W;
import androidx.core.view.AbstractC1281a0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class t {
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final androidx.collection.g sConstructorMap = new androidx.collection.g();

    private static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f10197a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10198b;

        /* renamed from: c, reason: collision with root package name */
        private Method f10199c;

        /* renamed from: d, reason: collision with root package name */
        private Context f10200d;

        public a(View view, String str) {
            this.f10197a = view;
            this.f10198b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f10198b, View.class)) != null) {
                        this.f10199c = method;
                        this.f10200d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f10197a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f10197a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f10198b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f10197a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f10199c == null) {
                a(this.f10197a.getContext());
            }
            try {
                this.f10199c.invoke(this.f10200d, view);
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException("Could not execute method for android:onClick", e5);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (obtainStyledAttributes.hasValue(0)) {
            AbstractC1281a0.p0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (obtainStyledAttributes2.hasValue(0)) {
            AbstractC1281a0.r0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (obtainStyledAttributes3.hasValue(0)) {
            AbstractC1281a0.H0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View c(Context context, String str, String str2) {
        String str3;
        androidx.collection.g gVar = sConstructorMap;
        Constructor constructor = (Constructor) gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View d(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return c(context, str, null);
            }
            int i4 = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i4 >= strArr.length) {
                    return null;
                }
                View c4 = c(context, str, strArr[i4]);
                if (c4 != null) {
                    return c4;
                }
                i4++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context e(Context context, AttributeSet attributeSet, boolean z4, boolean z5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.H3, 0, 0);
        int resourceId = z4 ? obtainStyledAttributes.getResourceId(e.j.I3, 0) : 0;
        if (z5 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(e.j.J3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).getThemeResId() == resourceId)) ? context : new androidx.appcompat.view.d(context, resourceId);
    }

    private void f(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C1254c createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1254c(context, attributeSet);
    }

    protected AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected C1255d createCheckBox(Context context, AttributeSet attributeSet) {
        return new C1255d(context, attributeSet);
    }

    protected C1256e createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C1256e(context, attributeSet);
    }

    protected C1260i createEditText(Context context, AttributeSet attributeSet) {
        return new C1260i(context, attributeSet);
    }

    protected C1263l createImageButton(Context context, AttributeSet attributeSet) {
        return new C1263l(context, attributeSet);
    }

    protected AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected C1265n createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1265n(context, attributeSet);
    }

    protected C1268q createRadioButton(Context context, AttributeSet attributeSet) {
        return new C1268q(context, attributeSet);
    }

    protected androidx.appcompat.widget.r createRatingBar(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected C1270t createSeekBar(Context context, AttributeSet attributeSet) {
        return new C1270t(context, attributeSet);
    }

    protected AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected C1275y createToggleButton(Context context, AttributeSet attributeSet) {
        return new C1275y(context, attributeSet);
    }

    protected View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z4, boolean z5, boolean z6, boolean z7) {
        Context context2;
        View createRatingBar;
        context2 = (!z4 || view == null) ? context : view.getContext();
        if (z5 || z6) {
            context2 = e(context2, attributeSet, z5, z6);
        }
        if (z7) {
            context2 = W.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                createRatingBar = createRatingBar(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "CheckedTextView":
                createRatingBar = createCheckedTextView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "MultiAutoCompleteTextView":
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "TextView":
                createRatingBar = createTextView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "ImageButton":
                createRatingBar = createImageButton(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "SeekBar":
                createRatingBar = createSeekBar(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "Spinner":
                createRatingBar = createSpinner(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "RadioButton":
                createRatingBar = createRadioButton(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "ToggleButton":
                createRatingBar = createToggleButton(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "ImageView":
                createRatingBar = createImageView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "AutoCompleteTextView":
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "CheckBox":
                createRatingBar = createCheckBox(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "EditText":
                createRatingBar = createEditText(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case "Button":
                createRatingBar = createButton(context2, attributeSet);
                f(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = d(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            b(createRatingBar, attributeSet);
            a(context2, createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}
