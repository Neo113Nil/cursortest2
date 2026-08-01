package h0;

import K.C0012m;
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
import androidx.lifecycle.C0068i;
import g.C0134g;
import java.util.LinkedHashSet;
import l.AbstractC0224l0;
import l.C0235r;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2574a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2575b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2576c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2577e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2578f;

    public /* synthetic */ d(TextView textView) {
        this.f2577e = null;
        this.f2578f = null;
        this.f2574a = false;
        this.f2575b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = Q.d.a(compoundButton);
        if (a2 != null) {
            if (this.f2574a || this.f2575b) {
                Drawable mutate = a2.mutate();
                if (this.f2574a) {
                    D.a.h(mutate, (ColorStateList) this.f2577e);
                }
                if (this.f2575b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2578f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0235r c0235r = (C0235r) this.d;
        Drawable checkMarkDrawable = c0235r.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2574a || this.f2575b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2574a) {
                    D.a.h(mutate, (ColorStateList) this.f2577e);
                }
                if (this.f2575b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2578f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0235r.getDrawableState());
                }
                c0235r.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2575b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f2577e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2577e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2577e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2577e = null;
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
        int[] iArr = f.a.f2118m;
        C0012m r2 = C0012m.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f423c;
        S.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r2.f423c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(T.d.t(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.c.c(compoundButton, r2.g(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.c.d(compoundButton, AbstractC0224l0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(T.d.t(compoundButton.getContext(), resourceId));
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
        g1.f.e(cVar, "provider");
        n.f fVar = (n.f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3107b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            fVar.d++;
            n.c cVar3 = fVar.f3113b;
            if (cVar3 == null) {
                fVar.f3112a = cVar2;
                fVar.f3113b = cVar2;
            } else {
                cVar3.f3108c = cVar2;
                cVar2.d = cVar3;
                fVar.f3113b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f2576c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0134g c0134g = (C0134g) this.f2578f;
        if (c0134g == null) {
            c0134g = new C0134g(this);
        }
        this.f2578f = c0134g;
        try {
            C0068i.class.getDeclaredConstructor(null);
            C0134g c0134g2 = (C0134g) this.f2578f;
            if (c0134g2 != null) {
                ((LinkedHashSet) c0134g2.f2448b).add(C0068i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0068i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new n.f();
        this.f2576c = true;
    }
}
