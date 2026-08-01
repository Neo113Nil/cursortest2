package j0;

import I0.h;
import M.P;
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
import androidx.lifecycle.C0074i;
import g.AbstractC0122a;
import h.C0130g;
import java.util.LinkedHashSet;
import n.AbstractC0293p0;
import n.C0300t;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3161a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3162b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3163c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3164d;
    public Parcelable e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3165f;

    public /* synthetic */ d(TextView textView) {
        this.e = null;
        this.f3165f = null;
        this.f3161a = false;
        this.f3162b = false;
        this.f3164d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f3164d;
        Drawable a2 = S.c.a(compoundButton);
        if (a2 != null) {
            if (this.f3161a || this.f3162b) {
                Drawable mutate = a2.mutate();
                if (this.f3161a) {
                    F.a.h(mutate, (ColorStateList) this.e);
                }
                if (this.f3162b) {
                    F.a.i(mutate, (PorterDuff.Mode) this.f3165f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0300t c0300t = (C0300t) this.f3164d;
        Drawable checkMarkDrawable = c0300t.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3161a || this.f3162b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f3161a) {
                    F.a.h(mutate, (ColorStateList) this.e);
                }
                if (this.f3162b) {
                    F.a.i(mutate, (PorterDuff.Mode) this.f3165f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0300t.getDrawableState());
                }
                c0300t.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f3162b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.e = null;
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
        CompoundButton compoundButton = (CompoundButton) this.f3164d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0122a.f2704m;
        h r2 = h.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f592c;
        P.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r2.f592c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(H1.d.F(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    S.b.c(compoundButton, r2.g(2));
                }
                if (typedArray.hasValue(3)) {
                    S.b.d(compoundButton, AbstractC0293p0.c(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(H1.d.F(compoundButton.getContext(), resourceId));
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
        j1.h.e(cVar, "provider");
        p.f fVar = (p.f) this.f3164d;
        p.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3779b;
        } else {
            p.c cVar2 = new p.c(str, cVar);
            fVar.f3788d++;
            p.c cVar3 = fVar.f3786b;
            if (cVar3 == null) {
                fVar.f3785a = cVar2;
                fVar.f3786b = cVar2;
            } else {
                cVar3.f3780c = cVar2;
                cVar2.f3781d = cVar3;
                fVar.f3786b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f3163c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0130g c0130g = (C0130g) this.f3165f;
        if (c0130g == null) {
            c0130g = new C0130g(this);
        }
        this.f3165f = c0130g;
        try {
            C0074i.class.getDeclaredConstructor(null);
            C0130g c0130g2 = (C0130g) this.f3165f;
            if (c0130g2 != null) {
                ((LinkedHashSet) c0130g2.f2800b).add(C0074i.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C0074i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public d() {
        this.f3164d = new p.f();
        this.f3163c = true;
    }
}
