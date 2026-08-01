package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: l.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288u {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f3447a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f3448b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3449c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3450d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3451e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3452f;

    public /* synthetic */ C0288u(TextView textView) {
        this.f3452f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f3452f;
        Drawable a2 = Q.c.a(compoundButton);
        if (a2 != null) {
            if (this.f3449c || this.f3450d) {
                Drawable mutate = a2.mutate();
                if (this.f3449c) {
                    D.a.h(mutate, this.f3447a);
                }
                if (this.f3450d) {
                    D.a.i(mutate, this.f3448b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0286t c0286t = (C0286t) this.f3452f;
        Drawable checkMarkDrawable = c0286t.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3449c || this.f3450d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f3449c) {
                    D.a.h(mutate, this.f3447a);
                }
                if (this.f3450d) {
                    D.a.i(mutate, this.f3448b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0286t.getDrawableState());
                }
                c0286t.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f3452f;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.f2397m;
        T.r r2 = T.r.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f811c;
        K.X.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r2.f811c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(q1.d.z(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.b.c(compoundButton, r2.g(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.b.d(compoundButton, AbstractC0277o0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(q1.d.z(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            r2.t();
        }
    }
}
