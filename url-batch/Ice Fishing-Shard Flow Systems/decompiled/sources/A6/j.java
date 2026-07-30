package A6;

import I.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import h.AbstractC0454a;
import j4.C0573b;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0731q0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f114b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f115c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f116d;

    /* renamed from: e, reason: collision with root package name */
    public Object f117e;

    /* renamed from: f, reason: collision with root package name */
    public Object f118f;

    /* renamed from: g, reason: collision with root package name */
    public Object f119g;

    public /* synthetic */ j(TextView textView, int i2) {
        this.f113a = i2;
        this.f118f = null;
        this.f119g = null;
        this.f114b = false;
        this.f115c = false;
        this.f117e = textView;
    }

    public static HashMap d(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f117e;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f114b || this.f115c) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f114b) {
                    mutate.setTintList((ColorStateList) this.f118f);
                }
                if (this.f115c) {
                    mutate.setTintMode((PorterDuff.Mode) this.f119g);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        n.r rVar = (n.r) this.f117e;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f114b || this.f115c) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f114b) {
                    mutate.setTintList((ColorStateList) this.f118f);
                }
                if (this.f115c) {
                    mutate.setTintMode((PorterDuff.Mode) this.f119g);
                }
                if (mutate.isStateful()) {
                    mutate.setState(rVar.getDrawableState());
                }
                rVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(AttributeSet attributeSet, int i2) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f117e;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0454a.f5048m;
        D0.j R4 = D0.j.R(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) R4.f331i;
        T.h(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) R4.f331i, i2);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(O6.g.M(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(R4.I(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(AbstractC0731q0.c(typedArray.getInt(3, -1), null));
                }
                R4.W();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(O6.g.M(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            R4.W();
        } catch (Throwable th) {
            R4.W();
            throw th;
        }
    }

    public String toString() {
        switch (this.f113a) {
            case 0:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f114b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f115c + ", prettyPrintIndent='" + ((String) this.f117e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f118f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f116d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, classDiscriminatorMode=" + ((EnumC0089a) this.f119g) + ')';
            default:
                return super.toString();
        }
    }

    public j(boolean z7, boolean z8, String prettyPrintIndent, String classDiscriminator, boolean z9, EnumC0089a classDiscriminatorMode) {
        this.f113a = 0;
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f114b = z7;
        this.f115c = z8;
        this.f117e = prettyPrintIndent;
        this.f118f = classDiscriminator;
        this.f116d = z9;
        this.f119g = classDiscriminatorMode;
    }

    public j(C0573b c0573b, boolean z7) {
        this.f113a = 3;
        s4.q qVar = new s4.q(c0573b, "flutter/restoration", s4.w.f7775a);
        this.f115c = false;
        this.f116d = false;
        l4.b bVar = new l4.b(12, this);
        this.f118f = qVar;
        this.f114b = z7;
        qVar.b(bVar);
    }
}
