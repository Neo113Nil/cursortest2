package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class de {
    public final int A;
    public final int B;
    final int C;
    final int D;
    final int E;
    final int F;
    public final boolean G;
    final Handler H;
    public final Context a;
    final ea b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    Button i;
    public CharSequence j;
    Message k;
    Button l;
    public CharSequence m;
    Message n;
    Button o;
    public CharSequence p;
    Message q;
    NestedScrollView r;
    public Drawable t;
    public ImageView u;
    public TextView v;
    public TextView w;
    public View x;
    ListAdapter y;
    public boolean h = false;
    public int s = 0;
    int z = -1;
    public final View.OnClickListener I = new cx(this, 0);

    public de(Context context, ea eaVar, Window window) {
        this.a = context;
        this.b = eaVar;
        this.c = window;
        this.H = new dc(eaVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, em.e, R.attr.alertDialogStyle, 0);
        this.A = obtainStyledAttributes.getResourceId(0, 0);
        this.B = obtainStyledAttributes.getResourceId(2, 0);
        this.C = obtainStyledAttributes.getResourceId(4, 0);
        this.D = obtainStyledAttributes.getResourceId(5, 0);
        this.E = obtainStyledAttributes.getResourceId(7, 0);
        this.F = obtainStyledAttributes.getResourceId(3, 0);
        this.G = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        eaVar.d();
    }

    static boolean b(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static final void c(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.c.setTitle(charSequence);
    }

    public final void e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.H.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.p = charSequence;
            this.q = obtainMessage;
        } else if (i != -2) {
            this.j = charSequence;
            this.k = obtainMessage;
        } else {
            this.m = charSequence;
            this.n = obtainMessage;
        }
    }
}
