package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i3 {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ i3(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        h3 h3Var = (h3) this.f;
        Drawable checkMarkDrawable = h3Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(h3Var.getDrawableState());
                }
                h3Var.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.d) {
            t8.t("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = (Bundle) this.a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.a;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.a = null;
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = wx.m;
        a6 u = a6.u(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) u.b;
        x80.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) u.b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(zo.s(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(u.j(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(fg.b(typedArray.getInt(3, -1), null));
                }
                u.w();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(zo.s(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            u.w();
        } catch (Throwable th) {
            u.w();
            throw th;
        }
    }

    public void e(String str, e10 e10Var) {
        Object obj;
        e10Var.getClass();
        z00 z00Var = (z00) this.f;
        w00 a = z00Var.a(str);
        if (a != null) {
            obj = a.g;
        } else {
            w00 w00Var = new w00(str, e10Var);
            z00Var.i++;
            w00 w00Var2 = z00Var.g;
            if (w00Var2 == null) {
                z00Var.f = w00Var;
                z00Var.g = w00Var;
            } else {
                w00Var2.h = w00Var;
                w00Var.i = w00Var2;
                z00Var.g = w00Var;
            }
            obj = null;
        }
        if (((e10) obj) == null) {
            return;
        }
        t8.k("SavedStateProvider with the given key is already registered");
    }

    public void f() {
        if (!this.e) {
            t8.t("Can not perform this action after onSaveInstanceState");
            return;
        }
        a3 a3Var = (a3) this.b;
        if (a3Var == null) {
            a3Var = new a3(this);
        }
        this.b = a3Var;
        try {
            rp.class.getDeclaredConstructor(null);
            a3 a3Var2 = (a3) this.b;
            if (a3Var2 != null) {
                ((LinkedHashSet) a3Var2.b).add(rp.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + rp.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public i3() {
        this.f = new z00();
        this.e = true;
    }
}
