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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s3 {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ s3(TextView textView) {
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
        r3 r3Var = (r3) this.f;
        Drawable checkMarkDrawable = r3Var.getCheckMarkDrawable();
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
                    mutate.setState(r3Var.getDrawableState());
                }
                r3Var.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.d) {
            g9.s("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
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
        int[] iArr = z00.m;
        k6 z = k6.z(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) z.g;
        ic0.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) z.g, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(mz.m(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(z.n(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(gi.b(typedArray.getInt(3, -1), null));
                }
                z.B();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(mz.m(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            z.B();
        } catch (Throwable th) {
            z.B();
            throw th;
        }
    }

    public void e(String str, l40 l40Var) {
        Object obj;
        l40Var.getClass();
        e40 e40Var = (e40) this.f;
        b40 a = e40Var.a(str);
        if (a != null) {
            obj = a.g;
        } else {
            b40 b40Var = new b40(str, l40Var);
            e40Var.i++;
            b40 b40Var2 = e40Var.g;
            if (b40Var2 == null) {
                e40Var.f = b40Var;
                e40Var.g = b40Var;
            } else {
                b40Var2.h = b40Var;
                b40Var.i = b40Var2;
                e40Var.g = b40Var;
            }
            obj = null;
        }
        if (((l40) obj) == null) {
            return;
        }
        g9.i("SavedStateProvider with the given key is already registered");
    }

    public void f() {
        if (!this.e) {
            g9.s("Can not perform this action after onSaveInstanceState");
            return;
        }
        k3 k3Var = (k3) this.b;
        if (k3Var == null) {
            k3Var = new k3(this);
        }
        this.b = k3Var;
        try {
            ds.class.getDeclaredConstructor(null);
            k3 k3Var2 = (k3) this.b;
            if (k3Var2 != null) {
                ((LinkedHashSet) k3Var2.b).add(ds.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + ds.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public s3() {
        this.f = new e40();
        this.e = true;
    }
}
