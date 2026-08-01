package j0;

import K.Q;
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
import c1.AbstractC0091d;
import g.C0126g;
import java.util.LinkedHashSet;
import l.AbstractC0245l0;
import l.C0258s;
import u0.C0372k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3078a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3079b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3080c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f3081e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3082f;

    public /* synthetic */ d(TextView textView) {
        this.f3081e = null;
        this.f3082f = null;
        this.f3078a = false;
        this.f3079b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = Q.c.a(compoundButton);
        if (a2 != null) {
            if (this.f3078a || this.f3079b) {
                Drawable mutate = a2.mutate();
                if (this.f3078a) {
                    D.a.h(mutate, (ColorStateList) this.f3081e);
                }
                if (this.f3079b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f3082f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0258s c0258s = (C0258s) this.d;
        Drawable checkMarkDrawable = c0258s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3078a || this.f3079b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f3078a) {
                    D.a.h(mutate, (ColorStateList) this.f3081e);
                }
                if (this.f3079b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f3082f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0258s.getDrawableState());
                }
                c0258s.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f3079b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f3081e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f3081e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f3081e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f3081e = null;
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
        int[] iArr = f.a.f2523m;
        C0372k j2 = C0372k.j(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) j2.f4191b;
        Q.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) j2.f4191b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0091d.j(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.b.c(compoundButton, j2.c(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.b.d(compoundButton, AbstractC0245l0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0091d.j(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            j2.l();
        }
    }

    public void e(String str, InterfaceC0169c interfaceC0169c) {
        Object obj;
        k1.e.e(interfaceC0169c, "provider");
        n.f fVar = (n.f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3546b;
        } else {
            n.c cVar = new n.c(str, interfaceC0169c);
            fVar.d++;
            n.c cVar2 = fVar.f3552b;
            if (cVar2 == null) {
                fVar.f3551a = cVar;
                fVar.f3552b = cVar;
            } else {
                cVar2.f3547c = cVar;
                cVar.d = cVar2;
                fVar.f3552b = cVar;
            }
            obj = null;
        }
        if (((InterfaceC0169c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f3080c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0126g c0126g = (C0126g) this.f3082f;
        if (c0126g == null) {
            c0126g = new C0126g(this);
        }
        this.f3082f = c0126g;
        try {
            C0068i.class.getDeclaredConstructor(null);
            C0126g c0126g2 = (C0126g) this.f3082f;
            if (c0126g2 != null) {
                ((LinkedHashSet) c0126g2.f2670b).add(C0068i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0068i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new n.f();
        this.f3080c = true;
    }
}
