package h1;

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
import g.g;
import java.util.LinkedHashSet;
import l.j1;
import l.q;
import n.f;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1966a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1967b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1968c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f1969e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1970f;

    public /* synthetic */ c(TextView textView) {
        this.f1969e = null;
        this.f1970f = null;
        this.f1966a = false;
        this.f1967b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1966a || this.f1967b) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f1966a) {
                    mutate.setTintList((ColorStateList) this.f1969e);
                }
                if (this.f1967b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1970f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        q qVar = (q) this.d;
        Drawable checkMarkDrawable = qVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1966a || this.f1967b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1966a) {
                    mutate.setTintList((ColorStateList) this.f1969e);
                }
                if (this.f1967b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1970f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(qVar.getDrawableState());
                }
                qVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f1967b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f1969e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1969e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1969e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1969e = null;
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0023, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0023, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.d;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.f1399m;
        t i4 = t.i(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) i4.f473b;
        p0.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) i4.f473b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(b4.d.y(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(i4.c(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(j1.b(typedArray.getInt(3, -1), null));
                }
                i4.k();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(b4.d.y(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            i4.k();
        } catch (Throwable th) {
            i4.k();
            throw th;
        }
    }

    public void e(String str, b bVar) {
        Object obj;
        i3.d.e(bVar, "provider");
        f fVar = (f) this.d;
        n.c a5 = fVar.a(str);
        if (a5 != null) {
            obj = a5.f2743g;
        } else {
            n.c cVar = new n.c(str, bVar);
            fVar.i++;
            n.c cVar2 = fVar.f2747g;
            if (cVar2 == null) {
                fVar.f2746f = cVar;
                fVar.f2747g = cVar;
            } else {
                cVar2.h = cVar;
                cVar.i = cVar2;
                fVar.f2747g = cVar;
            }
            obj = null;
        }
        if (((b) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f1968c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        g gVar = (g) this.f1970f;
        if (gVar == null) {
            gVar = new g(this);
        }
        this.f1970f = gVar;
        try {
            i.class.getDeclaredConstructor(null);
            g gVar2 = (g) this.f1970f;
            if (gVar2 != null) {
                ((LinkedHashSet) gVar2.f1520b).add(i.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }

    public c() {
        this.d = new f();
        this.f1968c = true;
    }
}
