package i0;

import K.C0014l;
import K.T;
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
import androidx.lifecycle.C0068i;
import g.C0104g;
import java.util.LinkedHashSet;
import l.AbstractC0221m0;
import l.C0230r;
import w1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2529a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2530b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2531c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2532e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2533f;

    public /* synthetic */ d(TextView textView) {
        this.f2532e = null;
        this.f2533f = null;
        this.f2529a = false;
        this.f2530b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = Q.c.a(compoundButton);
        if (a2 != null) {
            if (this.f2529a || this.f2530b) {
                Drawable mutate = a2.mutate();
                if (this.f2529a) {
                    D.a.h(mutate, (ColorStateList) this.f2532e);
                }
                if (this.f2530b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2533f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0230r c0230r = (C0230r) this.d;
        Drawable checkMarkDrawable = c0230r.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2529a || this.f2530b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2529a) {
                    D.a.h(mutate, (ColorStateList) this.f2532e);
                }
                if (this.f2530b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2533f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0230r.getDrawableState());
                }
                c0230r.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2530b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f2532e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2532e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2532e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2532e = null;
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
        int[] iArr = f.a.f2064m;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f475b;
        T.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) i2.f475b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(l.z(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.b.c(compoundButton, i2.b(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.b.d(compoundButton, AbstractC0221m0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(l.z(compoundButton.getContext(), resourceId));
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
        d1.d.e(cVar, "provider");
        n.f fVar = (n.f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3194b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            fVar.d++;
            n.c cVar3 = fVar.f3200b;
            if (cVar3 == null) {
                fVar.f3199a = cVar2;
                fVar.f3200b = cVar2;
            } else {
                cVar3.f3195c = cVar2;
                cVar2.d = cVar3;
                fVar.f3200b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f2531c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0104g c0104g = (C0104g) this.f2533f;
        if (c0104g == null) {
            c0104g = new C0104g(this);
        }
        this.f2533f = c0104g;
        try {
            C0068i.class.getDeclaredConstructor(null);
            C0104g c0104g2 = (C0104g) this.f2533f;
            if (c0104g2 != null) {
                ((LinkedHashSet) c0104g2.f2213b).add(C0068i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0068i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new n.f();
        this.f2531c = true;
    }
}
