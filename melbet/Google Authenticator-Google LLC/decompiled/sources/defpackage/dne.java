package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.material.productlockup.AnimatableProductLockupView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dne {
    public final Context a;
    public final View b;
    public final ImageView c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public dni j;
    public Animator k;
    public SharedPreferences l;
    public Long m;
    public kee n;
    public kee o;
    private AnimatorSet p;

    public dne(Context context, View view, ImageView imageView, int i) {
        this.a = context;
        this.b = view;
        this.c = imageView;
        this.i = i;
    }

    private final ValueAnimator f() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.setStartDelay(300L);
        ofFloat.addUpdateListener(new mu(this, 3, null));
        return ofFloat;
    }

    public final dni a(int i, int i2, int i3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(this.a.getResources(), i, options);
        kee keeVar = this.o;
        return new dni(decodeResource, keeVar != null ? ((AnimatableProductLockupView) keeVar.a).d.c : decodeResource.getWidth(), i2, i3);
    }

    public final void b() {
        if (e()) {
            if (this.j != null) {
                this.c.setImageDrawable(null);
                this.j.stop();
                this.j.a();
                this.j = null;
            }
            d();
        }
    }

    public final void c() {
        Long l;
        AnimatorSet animatorSet = this.p;
        if (animatorSet == null || this.f) {
            animatorSet = new AnimatorSet();
            if (this.h) {
                animatorSet.play(f());
            } else {
                Animator[] animatorArr = new Animator[2];
                animatorArr[0] = f();
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setStartDelay(500L);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(833L);
                ofFloat.addListener(new dnb(this));
                animatorSet2.playTogether(ofFloat);
                Animator animator = this.k;
                if (animator != null) {
                    animatorSet2.playTogether(animator);
                }
                animatorSet2.addListener(new dna(this));
                animatorArr[1] = animatorSet2;
                animatorSet.playSequentially(animatorArr);
            }
            this.p = animatorSet;
            this.f = false;
        }
        if (animatorSet.isStarted()) {
            return;
        }
        if (this.l == null || (l = this.m) == null) {
            new dnc(this).execute(new Void[0]);
            return;
        }
        long longValue = l.longValue();
        if (longValue != -1 && longValue + TimeUnit.SECONDS.toMillis(this.d) >= System.currentTimeMillis()) {
            this.b.setVisibility(8);
            kee keeVar = this.n;
            if (keeVar != null) {
                keeVar.j();
                return;
            }
            return;
        }
        View view = this.b;
        view.setAlpha(0.0f);
        if (!this.h) {
            if (this.j == null || this.g) {
                this.g = false;
                this.e = true;
                if (e()) {
                    new dnd(this).execute(new Void[0]);
                    return;
                }
                return;
            }
            SharedPreferences sharedPreferences = this.l;
            this.m = Long.valueOf(System.currentTimeMillis());
            sharedPreferences.edit().putLong("LAST_ANIMATION_TIME_KEY", this.m.longValue()).apply();
            this.c.setImageDrawable(this.j);
        }
        view.setVisibility(0);
        this.p.start();
    }

    public final void d() {
        dni dniVar = this.j;
        if (dniVar != null) {
            dniVar.stop();
        }
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b.setVisibility(8);
    }

    public final boolean e() {
        Activity a = fik.a(this.a);
        return (a == null || a.isFinishing() || a.isDestroyed()) ? false : true;
    }
}
