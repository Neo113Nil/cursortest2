package h0;

import K.C0011l;
import K.S;
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
import g.C0130g;
import java.util.LinkedHashSet;
import l.AbstractC0230m0;
import l.C0241s;
import x1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2506a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2507b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2508c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2509e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2510f;

    public /* synthetic */ d(TextView textView) {
        this.f2509e = null;
        this.f2510f = null;
        this.f2506a = false;
        this.f2507b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = Q.c.a(compoundButton);
        if (a2 != null) {
            if (this.f2506a || this.f2507b) {
                Drawable mutate = a2.mutate();
                if (this.f2506a) {
                    D.a.h(mutate, (ColorStateList) this.f2509e);
                }
                if (this.f2507b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2510f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0241s c0241s = (C0241s) this.d;
        Drawable checkMarkDrawable = c0241s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2506a || this.f2507b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2506a) {
                    D.a.h(mutate, (ColorStateList) this.f2509e);
                }
                if (this.f2507b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2510f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0241s.getDrawableState());
                }
                c0241s.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2507b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f2509e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2509e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2509e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2509e = null;
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
        int[] iArr = f.a.f2066m;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f476c;
        S.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r2.f476c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(l.z(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.b.c(compoundButton, r2.g(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.b.d(compoundButton, AbstractC0230m0.b(typedArray.getInt(3, -1), null));
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
            r2.t();
        }
    }

    public void e(String str, c cVar) {
        Object obj;
        e1.d.e(cVar, "provider");
        n.f fVar = (n.f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3189b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            fVar.d++;
            n.c cVar3 = fVar.f3195b;
            if (cVar3 == null) {
                fVar.f3194a = cVar2;
                fVar.f3195b = cVar2;
            } else {
                cVar3.f3190c = cVar2;
                cVar2.d = cVar3;
                fVar.f3195b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f2508c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0130g c0130g = (C0130g) this.f2510f;
        if (c0130g == null) {
            c0130g = new C0130g(this);
        }
        this.f2510f = c0130g;
        try {
            C0066i.class.getDeclaredConstructor(null);
            C0130g c0130g2 = (C0130g) this.f2510f;
            if (c0130g2 != null) {
                ((LinkedHashSet) c0130g2.f2452b).add(C0066i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0066i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new n.f();
        this.f2508c = true;
    }
}
