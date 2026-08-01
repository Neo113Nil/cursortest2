package j0;

import A1.j;
import M.Q;
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
import androidx.lifecycle.C0066i;
import f.AbstractC0084a;
import g.C0108g;
import java.util.LinkedHashSet;
import l.AbstractC0202n0;
import l.C0210s;
import n.C0242c;
import n.C0245f;
import z1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2680a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2681b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2682c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2683e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2684f;

    public /* synthetic */ d(TextView textView) {
        this.f2683e = null;
        this.f2684f = null;
        this.f2680a = false;
        this.f2681b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = S.c.a(compoundButton);
        if (a2 != null) {
            if (this.f2680a || this.f2681b) {
                Drawable mutate = a2.mutate();
                if (this.f2680a) {
                    F.a.h(mutate, (ColorStateList) this.f2683e);
                }
                if (this.f2681b) {
                    F.a.i(mutate, (PorterDuff.Mode) this.f2684f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0210s c0210s = (C0210s) this.d;
        Drawable checkMarkDrawable = c0210s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2680a || this.f2681b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2680a) {
                    F.a.h(mutate, (ColorStateList) this.f2683e);
                }
                if (this.f2681b) {
                    F.a.i(mutate, (PorterDuff.Mode) this.f2684f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0210s.getDrawableState());
                }
                c0210s.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2681b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f2683e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2683e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2683e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2683e = null;
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0084a.f2136m;
        j t2 = j.t(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) t2.f81c;
        Q.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) t2.f81c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(l.F(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    S.b.c(compoundButton, t2.i(2));
                }
                if (typedArray.hasValue(3)) {
                    S.b.d(compoundButton, AbstractC0202n0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(l.F(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            t2.v();
        }
    }

    public void e(String str, c cVar) {
        Object obj;
        g1.d.e(cVar, "provider");
        C0245f c0245f = (C0245f) this.d;
        C0242c a2 = c0245f.a(str);
        if (a2 != null) {
            obj = a2.f3218b;
        } else {
            C0242c c0242c = new C0242c(str, cVar);
            c0245f.d++;
            C0242c c0242c2 = c0245f.f3224b;
            if (c0242c2 == null) {
                c0245f.f3223a = c0242c;
                c0245f.f3224b = c0242c;
            } else {
                c0242c2.f3219c = c0242c;
                c0242c.d = c0242c2;
                c0245f.f3224b = c0242c;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f2682c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0108g c0108g = (C0108g) this.f2684f;
        if (c0108g == null) {
            c0108g = new C0108g(this);
        }
        this.f2684f = c0108g;
        try {
            C0066i.class.getDeclaredConstructor(null);
            C0108g c0108g2 = (C0108g) this.f2684f;
            if (c0108g2 != null) {
                ((LinkedHashSet) c0108g2.f2315b).add(C0066i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0066i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new C0245f();
        this.f2682c = true;
    }
}
