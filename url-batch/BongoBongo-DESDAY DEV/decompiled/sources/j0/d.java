package j0;

import L.C0014l;
import L.T;
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
import androidx.lifecycle.C0075i;
import f.AbstractC0097a;
import g.C0104g;
import h.AbstractC0112a;
import java.util.LinkedHashSet;
import m.AbstractC0234q0;
import m.C0237s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2660a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2661b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2662c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2663e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2664f;

    public /* synthetic */ d(TextView textView) {
        this.f2663e = null;
        this.f2664f = null;
        this.f2660a = false;
        this.f2661b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = R.c.a(compoundButton);
        if (a2 != null) {
            if (this.f2660a || this.f2661b) {
                Drawable mutate = a2.mutate();
                if (this.f2660a) {
                    E.a.h(mutate, (ColorStateList) this.f2663e);
                }
                if (this.f2661b) {
                    E.a.i(mutate, (PorterDuff.Mode) this.f2664f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0237s c0237s = (C0237s) this.d;
        Drawable checkMarkDrawable = c0237s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2660a || this.f2661b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2660a) {
                    E.a.h(mutate, (ColorStateList) this.f2663e);
                }
                if (this.f2661b) {
                    E.a.i(mutate, (PorterDuff.Mode) this.f2664f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0237s.getDrawableState());
                }
                c0237s.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2661b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f2663e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2663e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2663e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2663e = null;
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
        int[] iArr = AbstractC0097a.f2146m;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f543b;
        T.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) i2.f543b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0112a.l(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    R.b.c(compoundButton, i2.b(2));
                }
                if (typedArray.hasValue(3)) {
                    R.b.d(compoundButton, AbstractC0234q0.c(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0112a.l(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            i2.k();
        }
    }

    public void e(String str, c cVar) {
        Object obj;
        h1.d.e(cVar, "provider");
        o.f fVar = (o.f) this.d;
        o.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3399b;
        } else {
            o.c cVar2 = new o.c(str, cVar);
            fVar.d++;
            o.c cVar3 = fVar.f3405b;
            if (cVar3 == null) {
                fVar.f3404a = cVar2;
                fVar.f3405b = cVar2;
            } else {
                cVar3.f3400c = cVar2;
                cVar2.d = cVar3;
                fVar.f3405b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f2662c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0104g c0104g = (C0104g) this.f2664f;
        if (c0104g == null) {
            c0104g = new C0104g(this);
        }
        this.f2664f = c0104g;
        try {
            C0075i.class.getDeclaredConstructor(null);
            C0104g c0104g2 = (C0104g) this.f2664f;
            if (c0104g2 != null) {
                ((LinkedHashSet) c0104g2.f2333b).add(C0075i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0075i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new o.f();
        this.f2662c = true;
    }
}
