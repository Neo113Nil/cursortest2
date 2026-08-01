package c1;

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
import androidx.emoji2.text.s;
import androidx.lifecycle.i;
import java.util.LinkedHashSet;
import k.j1;
import k.r;
import k0.j0;
import k3.m;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f998a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f999b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1000d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f1001e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1002f;

    public /* synthetic */ d(TextView textView) {
        this.f1001e = null;
        this.f1002f = null;
        this.f998a = false;
        this.f999b = false;
        this.f1000d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f1000d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f998a || this.f999b) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f998a) {
                    mutate.setTintList((ColorStateList) this.f1001e);
                }
                if (this.f999b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1002f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        r rVar = (r) this.f1000d;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f998a || this.f999b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f998a) {
                    mutate.setTintList((ColorStateList) this.f1001e);
                }
                if (this.f999b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1002f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(rVar.getDrawableState());
                }
                rVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f999b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f1001e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1001e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1001e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1001e = null;
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0023, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0023, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i4) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f1000d;
        Context context = compoundButton.getContext();
        int[] iArr = e.a.f1504m;
        s r3 = s.r(i4, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) r3.c;
        j0.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r3.c, i4);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(m.w(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(r3.h(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(j1.b(typedArray.getInt(3, -1), null));
                }
                r3.t();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(m.w(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            r3.t();
        } catch (Throwable th) {
            r3.t();
            throw th;
        }
    }

    public void e(String str, c cVar) {
        Object obj;
        u2.c.e(cVar, "provider");
        m.f fVar = (m.f) this.f1000d;
        m.c a4 = fVar.a(str);
        if (a4 != null) {
            obj = a4.g;
        } else {
            m.c cVar2 = new m.c(str, cVar);
            fVar.f2903i++;
            m.c cVar3 = fVar.g;
            if (cVar3 == null) {
                fVar.f2902f = cVar2;
                fVar.g = cVar2;
            } else {
                cVar3.h = cVar2;
                cVar2.f2900i = cVar3;
                fVar.g = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = (a) this.f1002f;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f1002f = aVar;
        try {
            i.class.getDeclaredConstructor(null);
            a aVar2 = (a) this.f1002f;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f997b).add(i.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }

    public d() {
        this.f1000d = new m.f();
        this.c = true;
    }
}
