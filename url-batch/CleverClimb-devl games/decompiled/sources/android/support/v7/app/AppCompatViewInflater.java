package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.TintContextWrapper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public class AppCompatViewInflater {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?>[] f1621a = {Context.class, AttributeSet.class};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1622b = {R.attr.onClick};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f1623c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Constructor<? extends View>> f1624d = new ArrayMap();
    private final Object[] e = new Object[2];

    protected View a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View a2;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = TintContextWrapper.wrap(context2);
        }
        switch (str) {
            case "TextView":
                a2 = a(context2, attributeSet);
                a(a2, str);
                break;
            case "ImageView":
                a2 = b(context2, attributeSet);
                a(a2, str);
                break;
            case "Button":
                a2 = c(context2, attributeSet);
                a(a2, str);
                break;
            case "EditText":
                a2 = d(context2, attributeSet);
                a(a2, str);
                break;
            case "Spinner":
                a2 = e(context2, attributeSet);
                a(a2, str);
                break;
            case "ImageButton":
                a2 = f(context2, attributeSet);
                a(a2, str);
                break;
            case "CheckBox":
                a2 = g(context2, attributeSet);
                a(a2, str);
                break;
            case "RadioButton":
                a2 = h(context2, attributeSet);
                a(a2, str);
                break;
            case "CheckedTextView":
                a2 = i(context2, attributeSet);
                a(a2, str);
                break;
            case "AutoCompleteTextView":
                a2 = j(context2, attributeSet);
                a(a2, str);
                break;
            case "MultiAutoCompleteTextView":
                a2 = k(context2, attributeSet);
                a(a2, str);
                break;
            case "RatingBar":
                a2 = l(context2, attributeSet);
                a(a2, str);
                break;
            case "SeekBar":
                a2 = m(context2, attributeSet);
                a(a2, str);
                break;
            default:
                a2 = a(context2, str, attributeSet);
                break;
        }
        if (a2 == null && context != context2) {
            a2 = b(context2, str, attributeSet);
        }
        if (a2 != null) {
            a(a2, attributeSet);
        }
        return a2;
    }

    protected AppCompatTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected AppCompatImageView b(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected AppCompatButton c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected AppCompatEditText d(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    protected AppCompatSpinner e(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected AppCompatImageButton f(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    protected AppCompatCheckBox g(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    protected AppCompatRadioButton h(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    protected AppCompatCheckedTextView i(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    protected AppCompatAutoCompleteTextView j(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatMultiAutoCompleteTextView k(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatRatingBar l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    protected AppCompatSeekBar m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    private void a(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    private View b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(Promotion.ACTION_VIEW)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.e[0] = context;
            this.e[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return a(context, str, (String) null);
            }
            for (int i = 0; i < f1623c.length; i++) {
                View a2 = a(context, str, f1623c[i]);
                if (a2 != null) {
                    return a2;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            this.e[0] = null;
            this.e[1] = null;
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || ViewCompat.hasOnClickListeners(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1622b);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View a(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor<? extends View> constructor = f1624d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f1621a);
                f1624d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.e);
    }

    private static Context a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.appcompat.R.styleable.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(android.support.v7.appcompat.R.styleable.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(android.support.v7.appcompat.R.styleable.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof android.support.v7.view.d) && ((android.support.v7.view.d) context).a() == resourceId) ? context : new android.support.v7.view.d(context, resourceId) : context;
    }

    private static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f1625a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1626b;

        /* renamed from: c, reason: collision with root package name */
        private Method f1627c;

        /* renamed from: d, reason: collision with root package name */
        private Context f1628d;

        public a(View view, String str) {
            this.f1625a = view;
            this.f1626b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f1627c == null) {
                a(this.f1625a.getContext(), this.f1626b);
            }
            try {
                this.f1627c.invoke(this.f1628d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        private void a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1626b, View.class)) != null) {
                        this.f1627c = method;
                        this.f1628d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f1625a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f1625a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1626b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1625a.getClass() + str2);
        }
    }
}
