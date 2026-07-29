package com.facebook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/* compiled from: FacebookButtonBase.java */
/* loaded from: classes.dex */
public abstract class g extends Button {

    /* renamed from: a, reason: collision with root package name */
    private String f6034a;

    /* renamed from: b, reason: collision with root package name */
    private String f6035b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnClickListener f6036c;

    /* renamed from: d, reason: collision with root package name */
    private View.OnClickListener f6037d;
    private boolean e;
    private int f;
    private int g;
    private com.facebook.internal.m h;

    protected abstract int getDefaultRequestCode();

    protected int getDefaultStyleResource() {
        return 0;
    }

    protected g(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, 0);
        i2 = i2 == 0 ? getDefaultStyleResource() : i2;
        a(context, attributeSet, i, i2 == 0 ? R.style.com_facebook_button : i2);
        this.f6034a = str;
        this.f6035b = str2;
        setClickable(true);
        setFocusable(true);
    }

    public void setFragment(Fragment fragment) {
        this.h = new com.facebook.internal.m(fragment);
    }

    public void setFragment(android.app.Fragment fragment) {
        this.h = new com.facebook.internal.m(fragment);
    }

    public Fragment getFragment() {
        if (this.h != null) {
            return this.h.b();
        }
        return null;
    }

    public android.app.Fragment getNativeFragment() {
        if (this.h != null) {
            return this.h.a();
        }
        return null;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6036c = onClickListener;
    }

    public int getRequestCode() {
        return getDefaultRequestCode();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        a(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if ((getGravity() & 1) != 0) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int compoundPaddingRight = getCompoundPaddingRight();
            int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - a(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
            this.f = compoundPaddingLeft - min;
            this.g = compoundPaddingRight + min;
            this.e = true;
        }
        super.onDraw(canvas);
        this.e = false;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        return this.e ? this.f : super.getCompoundPaddingLeft();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        return this.e ? this.g : super.getCompoundPaddingRight();
    }

    protected Activity getActivity() {
        boolean z;
        Context context = getContext();
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        throw new j("Unable to get Activity.");
    }

    protected int a(String str) {
        return (int) Math.ceil(getPaint().measureText(str));
    }

    protected void a(Context context, AttributeSet attributeSet, int i, int i2) {
        b(context, attributeSet, i, i2);
        c(context, attributeSet, i, i2);
        d(context, attributeSet, i, i2);
        e(context, attributeSet, i, i2);
        a();
    }

    protected void a(View view) {
        if (this.f6036c != null) {
            this.f6036c.onClick(view);
        }
    }

    protected void setInternalOnClickListener(View.OnClickListener onClickListener) {
        this.f6037d = onClickListener;
    }

    private void a(Context context) {
        com.facebook.appevents.f.c(context).a(this.f6034a, (Double) null, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        com.facebook.appevents.f.c(context).a(this.f6035b, (Double) null, (Bundle) null);
    }

    private void b(Context context, AttributeSet attributeSet, int i, int i2) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.background}, i, i2);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    setBackgroundResource(resourceId);
                } else {
                    setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                }
            } else {
                setBackgroundColor(ContextCompat.getColor(context, R.color.com_facebook_blue));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @SuppressLint({"ResourceType"})
    private void c(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.drawableLeft, android.R.attr.drawableTop, android.R.attr.drawableRight, android.R.attr.drawableBottom, android.R.attr.drawablePadding}, i, i2);
        try {
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
            setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(4, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.paddingLeft, android.R.attr.paddingTop, android.R.attr.paddingRight, android.R.attr.paddingBottom}, i, i2);
        try {
            setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void e(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textColor}, i, i2);
        try {
            setTextColor(obtainStyledAttributes.getColorStateList(0));
            obtainStyledAttributes.recycle();
            obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.gravity}, i, i2);
            try {
                setGravity(obtainStyledAttributes.getInt(0, 17));
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textSize, android.R.attr.textStyle, android.R.attr.text}, i, i2);
                try {
                    setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(0, 0));
                    setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes.getInt(1, 1)));
                    setText(obtainStyledAttributes.getString(2));
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private void a() {
        super.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.g.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.this.b(g.this.getContext());
                if (g.this.f6037d != null) {
                    g.this.f6037d.onClick(view);
                } else if (g.this.f6036c != null) {
                    g.this.f6036c.onClick(view);
                }
            }
        });
    }
}
