package g1;

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
import androidx.emoji2.text.t;
import androidx.lifecycle.i;
import g.h;
import java.util.LinkedHashSet;
import l.m1;
import l.s;
import n.f;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1697a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1698b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1699c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f1700e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1701f;

    public /* synthetic */ c(TextView textView) {
        this.f1700e = null;
        this.f1701f = null;
        this.f1697a = false;
        this.f1698b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1697a || this.f1698b) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f1697a) {
                    mutate.setTintList((ColorStateList) this.f1700e);
                }
                if (this.f1698b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1701f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        s sVar = (s) this.d;
        Drawable checkMarkDrawable = sVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1697a || this.f1698b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1697a) {
                    mutate.setTintList((ColorStateList) this.f1700e);
                }
                if (this.f1698b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1701f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(sVar.getDrawableState());
                }
                sVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f1698b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f1700e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1700e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1700e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1700e = null;
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.d;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.f1250m;
        t w3 = t.w(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) w3.f356c;
        l0.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) w3.f356c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(h.a.x(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(w3.m(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(m1.b(typedArray.getInt(3, -1), null));
                }
                w3.y();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(h.a.x(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            w3.y();
        } catch (Throwable th) {
            w3.y();
            throw th;
        }
    }

    public void e(String str, b bVar) {
        Object obj;
        f3.d.e(bVar, "provider");
        f fVar = (f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f2701g;
        } else {
            n.c cVar = new n.c(str, bVar);
            fVar.i++;
            n.c cVar2 = fVar.f2707g;
            if (cVar2 == null) {
                fVar.f2706f = cVar;
                fVar.f2707g = cVar;
            } else {
                cVar2.f2702h = cVar;
                cVar.i = cVar2;
                fVar.f2707g = cVar;
            }
            obj = null;
        }
        if (((b) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f1699c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        h hVar = (h) this.f1701f;
        if (hVar == null) {
            hVar = new h(this);
        }
        this.f1701f = hVar;
        try {
            i.class.getDeclaredConstructor(null);
            h hVar2 = (h) this.f1701f;
            if (hVar2 != null) {
                ((LinkedHashSet) hVar2.f1644b).add(i.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }

    public c() {
        this.d = new f();
        this.f1699c = true;
    }
}
