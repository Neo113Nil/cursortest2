package h0;

import K.C0012l;
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
import androidx.lifecycle.C0065i;
import g.C0123g;
import java.util.LinkedHashSet;
import l.AbstractC0249n0;
import l.C0260t;
import q1.l;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2372a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2373b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2374c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2375e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2376f;

    public /* synthetic */ C0132d(TextView textView) {
        this.f2375e = null;
        this.f2376f = null;
        this.f2372a = false;
        this.f2373b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = Q.c.a(compoundButton);
        if (a2 != null) {
            if (this.f2372a || this.f2373b) {
                Drawable mutate = a2.mutate();
                if (this.f2372a) {
                    D.a.h(mutate, (ColorStateList) this.f2375e);
                }
                if (this.f2373b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2376f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0260t c0260t = (C0260t) this.d;
        Drawable checkMarkDrawable = c0260t.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2372a || this.f2373b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2372a) {
                    D.a.h(mutate, (ColorStateList) this.f2375e);
                }
                if (this.f2373b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2376f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0260t.getDrawableState());
                }
                c0260t.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2373b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f2375e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2375e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2375e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2375e = null;
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
        int[] iArr = f.a.f1934m;
        C0012l r2 = C0012l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f432c;
        T.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r2.f432c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(l.v(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.b.c(compoundButton, r2.g(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.b.d(compoundButton, AbstractC0249n0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(l.v(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            r2.t();
        }
    }

    public void e(String str, InterfaceC0131c interfaceC0131c) {
        Object obj;
        X0.d.e(interfaceC0131c, "provider");
        n.f fVar = (n.f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3272b;
        } else {
            n.c cVar = new n.c(str, interfaceC0131c);
            fVar.d++;
            n.c cVar2 = fVar.f3278b;
            if (cVar2 == null) {
                fVar.f3277a = cVar;
                fVar.f3278b = cVar;
            } else {
                cVar2.f3273c = cVar;
                cVar.d = cVar2;
                fVar.f3278b = cVar;
            }
            obj = null;
        }
        if (((InterfaceC0131c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f2374c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0123g c0123g = (C0123g) this.f2376f;
        if (c0123g == null) {
            c0123g = new C0123g(this);
        }
        this.f2376f = c0123g;
        try {
            C0065i.class.getDeclaredConstructor(null);
            C0123g c0123g2 = (C0123g) this.f2376f;
            if (c0123g2 != null) {
                ((LinkedHashSet) c0123g2.f2321b).add(C0065i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0065i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public C0132d() {
        this.d = new n.f();
        this.f2374c = true;
    }
}
