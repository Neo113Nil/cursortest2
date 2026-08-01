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
import androidx.lifecycle.C0069i;
import g.C0106g;
import java.util.LinkedHashSet;
import l.AbstractC0224m0;
import l.C0235s;
import z1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2560a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2561b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2562c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2563e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2564f;

    public /* synthetic */ d(TextView textView) {
        this.f2563e = null;
        this.f2564f = null;
        this.f2560a = false;
        this.f2561b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = Q.c.a(compoundButton);
        if (a2 != null) {
            if (this.f2560a || this.f2561b) {
                Drawable mutate = a2.mutate();
                if (this.f2560a) {
                    D.a.h(mutate, (ColorStateList) this.f2563e);
                }
                if (this.f2561b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2564f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0235s c0235s = (C0235s) this.d;
        Drawable checkMarkDrawable = c0235s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2560a || this.f2561b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2560a) {
                    D.a.h(mutate, (ColorStateList) this.f2563e);
                }
                if (this.f2561b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2564f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0235s.getDrawableState());
                }
                c0235s.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2561b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f2563e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2563e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2563e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2563e = null;
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
        int[] iArr = f.a.f2107m;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f492b;
        T.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) i2.f492b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(l.w(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.b.c(compoundButton, i2.b(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.b.d(compoundButton, AbstractC0224m0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(l.w(compoundButton.getContext(), resourceId));
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
        g1.d.e(cVar, "provider");
        n.f fVar = (n.f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3227b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            fVar.d++;
            n.c cVar3 = fVar.f3233b;
            if (cVar3 == null) {
                fVar.f3232a = cVar2;
                fVar.f3233b = cVar2;
            } else {
                cVar3.f3228c = cVar2;
                cVar2.d = cVar3;
                fVar.f3233b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f2562c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0106g c0106g = (C0106g) this.f2564f;
        if (c0106g == null) {
            c0106g = new C0106g(this);
        }
        this.f2564f = c0106g;
        try {
            C0069i.class.getDeclaredConstructor(null);
            C0106g c0106g2 = (C0106g) this.f2564f;
            if (c0106g2 != null) {
                ((LinkedHashSet) c0106g2.f2253b).add(C0069i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0069i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new n.f();
        this.f2562c = true;
    }
}
