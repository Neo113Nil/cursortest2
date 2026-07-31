package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import e.AbstractC2405a;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class c extends r implements DialogInterface {

    /* renamed from: a, reason: collision with root package name */
    final AlertController f10175a;

    public static class a {

        /* renamed from: P, reason: collision with root package name */
        private final AlertController.b f10176P;
        private final int mTheme;

        public a(Context context) {
            this(context, c.f(context, 0));
        }

        public c a() {
            c cVar = new c(this.f10176P.f9993a, this.mTheme);
            this.f10176P.a(cVar.f10175a);
            cVar.setCancelable(this.f10176P.f10010r);
            if (this.f10176P.f10010r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f10176P.f10011s);
            cVar.setOnDismissListener(this.f10176P.f10012t);
            DialogInterface.OnKeyListener onKeyListener = this.f10176P.f10013u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a b(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10176P;
            bVar.f10015w = listAdapter;
            bVar.f10016x = onClickListener;
            return this;
        }

        public a c(View view) {
            this.f10176P.f9999g = view;
            return this;
        }

        public a d(Drawable drawable) {
            this.f10176P.f9996d = drawable;
            return this;
        }

        public a e(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10176P;
            bVar.f10014v = charSequenceArr;
            bVar.f10016x = onClickListener;
            return this;
        }

        public a f(int i4) {
            AlertController.b bVar = this.f10176P;
            bVar.f10000h = bVar.f9993a.getText(i4);
            return this;
        }

        public a g(int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10176P;
            bVar.f10004l = bVar.f9993a.getText(i4);
            this.f10176P.f10006n = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f10176P.f9993a;
        }

        public a h(DialogInterface.OnDismissListener onDismissListener) {
            this.f10176P.f10012t = onDismissListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f10176P.f10013u = onKeyListener;
            return this;
        }

        public a j(int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10176P;
            bVar.f10001i = bVar.f9993a.getText(i4);
            this.f10176P.f10003k = onClickListener;
            return this;
        }

        public a k(ListAdapter listAdapter, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10176P;
            bVar.f10015w = listAdapter;
            bVar.f10016x = onClickListener;
            bVar.f9986I = i4;
            bVar.f9985H = true;
            return this;
        }

        public a l(CharSequence charSequence) {
            this.f10176P.f9998f = charSequence;
            return this;
        }

        public c show() {
            c a4 = a();
            a4.show();
            return a4;
        }

        public a(Context context, int i4) {
            this.f10176P = new AlertController.b(new ContextThemeWrapper(context, c.f(context, i4)));
            this.mTheme = i4;
        }
    }

    protected c(Context context, int i4) {
        super(context, f(context, i4));
        this.f10175a = new AlertController(getContext(), this, getWindow());
    }

    static int f(Context context, int i4) {
        if (((i4 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC2405a.f36198l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f10175a.d();
    }

    @Override // androidx.appcompat.app.r, androidx.activity.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10175a.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f10175a.f(i4, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (this.f10175a.g(i4, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // androidx.appcompat.app.r, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f10175a.p(charSequence);
    }
}
