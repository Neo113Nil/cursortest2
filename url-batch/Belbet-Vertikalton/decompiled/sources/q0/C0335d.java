package q0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public C0347p f3937a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f3938b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3939c;

    /* renamed from: d, reason: collision with root package name */
    public q.b f3940d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
