package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.authenticator2.R;
import defpackage.fhr;
import defpackage.fjw;
import defpackage.fra;
import defpackage.frj;
import defpackage.hy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TextInputEditText extends hy {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray a = fjw.a(context, attributeSet, fra.b, i, R.style.Widget_Design_TextInputEditText, new int[0]);
        this.b = a.getBoolean(0, false);
        a.recycle();
    }

    private final TextInputLayout d() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout d = d();
        if (!e(d) || rect == null) {
            return;
        }
        Rect rect2 = this.a;
        d.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout d = d();
        if (!e(d)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = d.getGlobalVisibleRect(rect, point);
        if (!globalVisibleRect || point == null) {
            return globalVisibleRect;
        }
        point.offset(-getScrollX(), -getScrollY());
        return true;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout d = d();
        return (d == null || !d.l) ? super.getHint() : d.f();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d = d();
        if (d != null && d.l && super.getHint() == null && fhr.g()) {
            setHint("");
        }
    }

    @Override // defpackage.hy, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout d = d();
            editorInfo.hintText = d != null ? d.f() : null;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout d = d();
        if (!e(d) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = d.getHeight() - getHeight();
        Rect rect2 = this.a;
        rect2.set(rect.left, rect.top, rect.right, rect.bottom + height);
        return super.requestRectangleOnScreen(rect2);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context) {
        this(context, null);
    }
}
