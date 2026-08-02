package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hz extends ImageButton {
    private final hs a;
    private boolean b;
    private final ckm c;

    public hz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        mb.d(this, getContext());
        hs hsVar = new hs(this);
        this.a = hsVar;
        hsVar.b(attributeSet, i);
        ckm ckmVar = new ckm(this);
        this.c = ckmVar;
        ckmVar.i(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.a();
        }
        ckm ckmVar = this.c;
        if (ckmVar != null) {
            ckmVar.h();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c.l() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ckm ckmVar = this.c;
        if (ckmVar != null) {
            ckmVar.h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        ckm ckmVar = this.c;
        if (ckmVar != null && drawable != null && !this.b) {
            ckmVar.j(drawable);
        }
        super.setImageDrawable(drawable);
        if (ckmVar != null) {
            ckmVar.h();
            if (this.b) {
                return;
            }
            ckmVar.g();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.b = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.c.k(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ckm ckmVar = this.c;
        if (ckmVar != null) {
            ckmVar.h();
        }
    }

    public hz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public hz(Context context) {
        this(context, null);
    }
}
