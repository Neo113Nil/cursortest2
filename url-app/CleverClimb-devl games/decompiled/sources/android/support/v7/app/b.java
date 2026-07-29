package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController;
import android.support.v7.appcompat.R;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class b extends i implements DialogInterface {

    /* renamed from: a, reason: collision with root package name */
    final AlertController f1629a;

    protected b(Context context, int i) {
        super(context, a(context, i));
        this.f1629a = new AlertController(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.support.v7.app.i, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1629a.a(charSequence);
    }

    @Override // android.support.v7.app.i, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1629a.a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1629a.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1629a.b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* compiled from: AlertDialog.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.a f1630a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1631b;

        public a(Context context) {
            this(context, b.a(context, 0));
        }

        public a(Context context, int i) {
            this.f1630a = new AlertController.a(new ContextThemeWrapper(context, b.a(context, i)));
            this.f1631b = i;
        }

        public Context a() {
            return this.f1630a.f1588a;
        }

        public a a(CharSequence charSequence) {
            this.f1630a.f = charSequence;
            return this;
        }

        public a a(View view) {
            this.f1630a.g = view;
            return this;
        }

        public a a(int i) {
            this.f1630a.h = this.f1630a.f1588a.getText(i);
            return this;
        }

        public a a(Drawable drawable) {
            this.f1630a.f1591d = drawable;
            return this;
        }

        public a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f1630a.i = charSequence;
            this.f1630a.k = onClickListener;
            return this;
        }

        public a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f1630a.l = charSequence;
            this.f1630a.n = onClickListener;
            return this;
        }

        public a a(DialogInterface.OnKeyListener onKeyListener) {
            this.f1630a.u = onKeyListener;
            return this;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.f1630a.w = listAdapter;
            this.f1630a.x = onClickListener;
            return this;
        }

        public b b() {
            b bVar = new b(this.f1630a.f1588a, this.f1631b);
            this.f1630a.a(bVar.f1629a);
            bVar.setCancelable(this.f1630a.r);
            if (this.f1630a.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f1630a.s);
            bVar.setOnDismissListener(this.f1630a.t);
            if (this.f1630a.u != null) {
                bVar.setOnKeyListener(this.f1630a.u);
            }
            return bVar;
        }
    }
}
